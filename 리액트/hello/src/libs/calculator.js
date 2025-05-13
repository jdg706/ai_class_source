function add(num1, num2) {
    return num1 + num2;
}

export function sub(num1, num2) {
    return num1 - num2;
}

 const PI = 3.141592;

 export{ sub, PI }

 

export default add; // add 함수 내보내기

// export default 변수명; -> 모듈 1개 내보낼때 사용