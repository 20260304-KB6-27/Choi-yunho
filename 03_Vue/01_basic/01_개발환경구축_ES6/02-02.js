let msg = 'GLOBAL'; // 전역 스코프

function outer() {
  let msg = 'OUTER'; // 함수 스코프 (지역)
  console.log(msg); // OUTER

  if (true) {
    let msg = 'BLOCK'; // if 문이 동작하면 msg 삭제
    console.log(msg); // BLOCK
  }
}

outer();

console.log(msg); //GLOBAL
