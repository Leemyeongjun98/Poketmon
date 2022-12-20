package Poketmon;

import java.awt.Font;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ranking extends JFrame {
	JTable rank;
	Vector list, col;
	JLabel title;

	public ranking(String nickname, Poketmon_MainGUI main) {
		setTitle("랭킹보기");

		PoketmonDAO dao = new PoketmonDAO();

		add(title = new JLabel("랭\t킹"));
		title.setFont(new Font("맑은고딕", Font.BOLD, 30));
		title.setBounds(110, 10, 80, 30);

		col = new Vector();
		col.add("닉네임");
		col.add("레벨");
		col.add("골드");
		col.add("경험치");

		DefaultTableModel model = new DefaultTableModel(dao.viewRank(), col) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		rank = new JTable(model);
		JScrollPane scroll = new JScrollPane(rank);
		jTableSet();
		add(scroll);
		scroll.setBounds(40, 50, 200, 350);

		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		setSize(300, 500);
		setLocationRelativeTo(null);
	}

	public void jTableSet() {
		rank.getTableHeader().setReorderingAllowed(false);
		rank.getTableHeader().setResizingAllowed(false);
		rank.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
		DefaultTableCellRenderer celAlignRight = new DefaultTableCellRenderer();
		celAlignRight.setHorizontalAlignment(JLabel.RIGHT);
		DefaultTableCellRenderer celAlignLeft = new DefaultTableCellRenderer();
		celAlignLeft.setHorizontalAlignment(JLabel.LEFT);
	}
//	public static void main(String args[]) {
//		String a = "A";
//		Poketmon_MainGUI main = new Poketmon_MainGUI(a);
//		new ranking(a, main);
//	}

}
