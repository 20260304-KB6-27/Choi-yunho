// 객체 구조분해할당
const user = {
  name: 'alice',
  age: 25,
  job: 'Developer',
  info: {
    address: 'Seoul',
    hobbies: ['reading', 'coding'],
  },
};

const { age: ageNum, name: userName } = user;

// console.log(ageNum);
// console.log(userName);

// 중첩된 객체 구조분해
const {
  name,
  age,
  info: {
    address,
    hobbies: [firstHobby, secondHobby],
  },
} = user;

console.log(address);
console.log(firstHobby); // reading
console.log(secondHobby); // coding
