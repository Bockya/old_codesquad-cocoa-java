한글 시계 구현하기

- [x] 현재 시간

  ```java
  import java.time.LocalTime;
  LocalTime now = LocalTime.now(); //현재 시간
  int hour = now.getHour(); //현재 시간에서 시(hour)만 뽑아낸다
  int minute = now.getMinute(); //현재 시간에서 분(minute)만 뽑아낸다
  ```

- [x] String배열

  ```java
  //String배열의 초기화
  String[] hangeul = {"한두세네다섯",
          "여섯일곱여덟",
          "아홉열한두시",
          "자이삼사오십",
          "정일이삼사육",
          "오오칠팔구분"};
  String jajeong = "" + hangeul[3].charAt(0) + hangeul[4].charAt(0); //자정
  /*
  	- charAt(): 문자열에서 지정된 index에 있는 한 문자를 가져옴
  	- char형 참조변수 + "": char -> String으로 변환
  	- String = String1 + String2
  */
  ```

- [x] switch

  ```java
  switch (hour) {
      case 1: case 13:
          String[] h1 = {"한□□□□□",
                         "□□□□□□",
                         "□□□□□시"};
          String[] result = h1;
          break;
  }
  /*
  	- switch문의 조건식 결과는 정수 또는 문자열이어야 함
  	- case문의 값은 정수 상수만 가능하며, 중복되지 않아야 함
  	- case문은 한 줄에 붙여 쓸 수 있음
  	- break: switch문을 벗어남
  */
  ```

  
