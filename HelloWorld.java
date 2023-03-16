//class명은 파일명과 동일해야한다.
//모든 함수는 class 내부에 위치해야한다.
//class는 객체 생성을 위해 만든다.
//(형식)
//접근지정자 class 클래스명{}
// public (공개)
// protected (상속관계에서 public)
// 아무것도 안쓰면 default
// private (사적인)

//프로그램 : HardDisk에 저장되어 있는 SW
//프로세스 : CPU에 로드되어서 실행되고 있는 프로그램
//데몬 : 실행되고 있는 프로세스 중 서버처럼 요청이 들어오면 실행되는 프로그램

public class HelloWorld {
  //main() 함수: 프로그램이 실행되는 진입점
  public static void main(String[] args) { //public, sraric, void 토큰
    // HelloWorld 출력해보자!
    System.out.println("Hello World! Let's go");
  }
  
}

// 검색하기(플랫폼 언어 기능)
// 컴파일 명령어
// javac -cp . 파일명.java
// javac -cp . 패키지 파일명.java
// ex. javac -cp . HelloWorld.java

// 클래스 파일 실행 할 때 확장자 생략
// ex. java HelloWorld