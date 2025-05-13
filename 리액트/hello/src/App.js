import Mycomponent from "./Mycomponent";
import Mycomponent2 from "./Mycomponent2";
// 모듈 가져오기 import

function App() {
  const name = "이이름";
  return (
    <>
      {/* <Mycomponent/> */}
      <Mycomponent2 // 한줄 주석
      />
      {name}
    </>
  )
}

export default App;
// 모듈 내보내기 export