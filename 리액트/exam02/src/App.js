// import { Fragment } from "react";

// function App() {
//  let name;
//  name = name ?? '기본 이름';

//   //return name ? <h1>{name}님, 반갑습니다.</h1> : '';
//   return name && <h1 className='greet'>{name}님, 반갑습니다.</h1>
// }

function App() {
  return (

    /* 커포넌트는 변화 감지의 효율성을 위해서 항상 단일 노드로 구성
      - 항상 하나의 태그로 내용물을 감싼다.
      - 태그 노출이 필요 없는 경우 Fragment 컴포넌트로 감싼다. 
      - 컴포넌트 이름은 앞글자를 대문자로 입력
      - 컴포넌트 이름으로 파일명을 구성 */
      
    <>
      <h1>반갑습니다.</h1>
      <h2>안녕하세요.</h2>
    </>
  );
}

export default App;
