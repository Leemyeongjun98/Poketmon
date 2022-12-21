
# (조별프로젝트) :speech_balloon: Poketmon 키우기 게임

<br>
<br>
<br>
<br>

## - 주제 선정(목적)

#### Java, 이클립스, SQL DB연동 등 활용 하면서 GUI, 데이터베이스 와 코드의 비중을 균등하게 하기 좋은 주제가 게임이라고 생각해서 게임으로 선정 할 수 있었던 것 같다.

<br>

##### 모든 유저는 Java GUI 를통해 OracleDB 를 이용하여 회원가입을 진행하게 되며, 로그인 후에 OracleDB에 저장된 데이터를 통해                                           유저의 닉네임과 레벨, 경험치, 에너지,관리자 계정인지 아닌지 판별하여 관리창이 뜨거나 뜨지않는다.

<br>
<br>
<br>
<br>

## - 프로젝트 개발환경
##### 개발 언어 : Java(jdk-11.0.15.1)
##### IDE(통합 개발 환경)  : Eclipse-jee-2022-03
##### DataBase : OracleXe 11

<br>
<br>
<br>
<br>

## - 나의 역할
##### 메인 GUI구현 및 각각의 클래스로 상호작용 구성
##### 자료조사 편집, ppt


<br>
<br>
<br>
<br>

## - 구현 캡쳐

<br>

### 처음 실행시 나오는 게임시작 GUI

![main-gui1](https://user-images.githubusercontent.com/120614041/208721477-ffaadccf-50f7-4ef9-8326-1cb666cfa431.png)

<br><br><br>


### 게임시작 버튼을 누르면 로그인 창
  
![login](https://user-images.githubusercontent.com/120614041/208722277-cded9800-bb31-414a-87b9-a7664f943be0.png)

<br><br><br>

### 회원가입

![insertmember](https://user-images.githubusercontent.com/120614041/208731730-b6d6fc06-c5ec-4db7-a7f1-bf974fd960c8.png)

<br>

![join](https://user-images.githubusercontent.com/120614041/208732038-0549aa62-55cd-4019-bdb6-c115f0e78c6a.png)

<br><br><br>

### 로그인 성공, 관리자 로그인 성공, 로그인패실패(DB 연동)

<figure class="third">
  
  ![login-user](https://user-images.githubusercontent.com/120614041/208723470-63ee3e21-ab15-4b7e-a55f-6f4e26266998.png)
  ![login-admin](https://user-images.githubusercontent.com/120614041/208723725-4de27362-3605-4af9-b4f7-e6430d74e696.png)
  ![login-fail](https://user-images.githubusercontent.com/120614041/208723362-72ee152c-672c-4a39-9a29-134297f46c2a.png)
  
</figure>
  
<br><br><br>

### 메인 GUI (일반유저)

![main-gui2-user](https://user-images.githubusercontent.com/120614041/208724197-d4142a91-98f5-4846-b645-ed4064061148.png)

<br><br><br>

### 메인 GUI (관리자)

![main-gui2-admin](https://user-images.githubusercontent.com/120614041/208724201-bff1799d-1dfa-46bd-9957-16a0aef58a51.png)

<br><br><br>

### 먹이주기

![eat-1](https://user-images.githubusercontent.com/120614041/208724759-e704bc25-ab46-4c6a-8763-0bb4291a6340.png)

<br><br>

### 먹이주기 '예' 눌렀을 때
#### 에너지 충전, 경험치 증가, 에너지가 다 차 있을 때는 먹이를 먹지 못한다.

<figure class="third">
  
  ![eat-success](https://user-images.githubusercontent.com/120614041/208724772-376979c3-c76f-4323-85ec-fcf8612ffddc.png)
  ![eat-1-exp](https://user-images.githubusercontent.com/120614041/208724766-a4b1168c-a4fa-4da0-9e15-a2793a8199da.png)
  ![eat-fail](https://user-images.githubusercontent.com/120614041/208727042-b2e011f9-ee62-45ce-aa34-31f81ee55c94.png)

</figure>

<br><br><br>

### 놀아주기

![play-1](https://user-images.githubusercontent.com/120614041/208727914-d82a8f86-312d-4b95-9206-f2e4c074f884.png)

<br><br>

### 놀아주기 '예' 눌렀을 때
#### 경험치 증가, 에너지 감소, 에너지가 없을 땐 놀아주지 못한다.

<figure class="third">
  
  ![play-1-exp](https://user-images.githubusercontent.com/120614041/208727922-951f0677-e96b-48ff-8e90-cc84754b3614.png)
  ![play-success](https://user-images.githubusercontent.com/120614041/208727927-76420dcb-a198-48fe-8e66-afb633d10065.png)
  ![play-fail](https://user-images.githubusercontent.com/120614041/208728987-0d60a1ad-6db4-4aeb-9ab8-7ab507dd66e6.png)

</figure>

<br><br><br>

### 휴식하기

![rest-1](https://user-images.githubusercontent.com/120614041/208730329-8f59daed-b0b1-415e-909d-4cc985e83c47.png)

<br><br>

### 휴식하기 '예' 눌렀을 때
#### 에너지 증가, 에너지가 많을 땐 휴식하지 못한다

<figure class="third">

  ![rest-success](https://user-images.githubusercontent.com/120614041/208729404-7b3b02a5-9903-440f-9f8e-f43a3561bd18.png)
  ![rest-fail](https://user-images.githubusercontent.com/120614041/208730334-ede19bc0-2b6a-4943-a536-75910d0e829d.png)

</figure>

<br><br><br>

### 전투하기

![fight-1](https://user-images.githubusercontent.com/120614041/208730627-f8434cbc-071a-4fec-8ba5-9b8c242daab5.png)

<br><br>

### 전투하기 '예' 눌렀을 때
#### 경험치 증가, 에너지 감소, 에너지 경고, 위험

<figure class="third">
  
  ![eat-1-exp](https://user-images.githubusercontent.com/120614041/208731115-fa799afe-45c3-4306-89f9-8f0d46f6ce1b.png)
  ![fight-success](https://user-images.githubusercontent.com/120614041/208730636-96f3a431-903b-4ac6-bfd8-b9c22a83b99f.png)
  ![fight-fail](https://user-images.githubusercontent.com/120614041/208730632-63db6562-9da4-4e7d-9761-9e5051d10006.png)
  ![restart](https://user-images.githubusercontent.com/120614041/208730642-bdf1b557-0280-422a-af3a-149a0502be23.png)

</figure>

<br><br><br>

### 레벨 랭킹

![userranking](https://user-images.githubusercontent.com/120614041/208732249-87134de2-2a9a-4b21-9c0c-b3370b3c2275.png)

<br><br><br>

### 유저 관리하기(관리자)

<figure class="third">

  ![userlist](https://user-images.githubusercontent.com/120614041/208732256-8a8b4e1b-b3f2-435a-8a13-e04ef479e074.png)
  ![userupdate](https://user-images.githubusercontent.com/120614041/208732254-aefc9640-9836-444d-a789-5d2911544af6.png)

</figure> 
 
<br><br><br>

### 야생으로 방생하기

![reset](https://user-images.githubusercontent.com/120614041/208732958-e70eff21-bbed-4a30-999f-74cf8177abd8.png)

<br><br><br>

### 저장하기

![save](https://user-images.githubusercontent.com/120614041/208732961-a1dbb8d9-7687-4ece-83f3-fa07b831747b.png)


<br><br><br>


<br>

## - 개선점
##### 기능에 치중하느라 좀 더 세밀하게 디자인하지 못한것과 GUI 쪽을 소홀히 했는데 그래도 GUI 보단 코드들을 더 간략하고 중복해서 쓰이는 메서드들을 정리해서 짧게 정리해야 될 것 같았다.
##### 회원가입시 피카츄만있는게 아닌 여러 포켓몬들을 추가해 포켓몬 종류별로 각각 다른 정보를 출력하면 더 좋은 프로젝트가 될거라고 생각한다.
##### 경험치, 에너지 등 테이블을 추가로 하나 더 만들어서 관리자가 프로그램 안에서 제어할 수 있게 만들고 싶고, 추가로 버튼을 눌러서 진행하는
##### 방식이 아닌 전투하기에 미니게임 등을 추가해서 게임의 단조로운 진행을 좀 더 흥미 있게 개선하고 싶다.

<br>
<br>
<br>
<br>

## - 느낀점
##### 여럿이서 프로젝트를 진행하니 각자 역할을 정하고 진행을 하는 데에 있어서 편한 점도 있었지만 불편한 점도 느꼈다.
##### 다음 프로젝트를 진행할 땐 좀 더 효율적인 방법을 찾아 같이 작업을 해야 되겠다고 다짐했다.
##### 추가한 기능 중 관리자 UI, 일반 유저 UI 분리와 랜덤으로 에너지를 소비하는 기능들을 어떻게 해야 할지 막히는 부분이 많았습니다.
##### 막히는 건 의외로 큼직큼직한 기능보다 사소하고 별것 아닌 것들이었습니다. 그럴 때마다 구글링을 통해 습득하기도 했고
##### 다른 사람들의 다양한 코드를 보면서 '이렇게도 할 수 있구나..'라고 느꼈다.
##### 큼직한 기능들 먼저 구현 후 디테일한 부분은 나중에 추가해서 얼 먼저 구현할지의 시간분배의 중요성이 얼마나 중요한지 느꼈으며
##### 혼자 할 때보단 조별 단위로 진행을 하니 프로그램에 더욱 책임감이 들어가는 거 같은 느낌이었고 프로젝트의 완성도가 높아지면서 보다 성취감을 느꼈다.



