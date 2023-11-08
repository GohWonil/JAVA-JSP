//효과를 적용할 HTML 태그 (요소) 찾기
const number = document.getElementById("number");
const increase = document.getElementById("increase");
const decrease = document.getElementById("decrease");

//이벤트가 발생하면 이벤트를 처리하는 메소드를 이벤트리스너 또는 이벤트 핸들러라고 부름
//이벤트핸들러는 자바스크립트가 부르므로 콜백함수 increase버튼 위젯에서 마우스를 누르면 마우스 누른 처리를 하는 함수가 호출 그렇게 하기 위해 이벤트처리함수를 이벤트소스와 발생할 이벤트와 서로 연결할 필요가 있다.

//형식: 이벤스소스(위젯).on이벤트종류 = 이벤트처리 익명함수 또는 표준함수 등록
increase.onclick = () => {
    const current = parseInt(number.innerText, 10);
    number.innerText = current + 10;
  };
  
  decrease.onclick = () => {
    const current = parseInt(number.innerText, 10);
    number.innerText = current - 1;
  };

  //css를 자바스크립트로 다룰땐
  //1.css 속성이름은 미니카멜표기법을 적용
  //2.모든 속성값은 문자열로 입력
  number.style.textAlign = 'center'
  number.style.backgroundColor = 'yellow'