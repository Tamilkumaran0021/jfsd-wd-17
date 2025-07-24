function add() {
  console.log("hello world");
}

let x = function add() {
  console.log("hello world");
};

let y = () => console.log("hello world");

function sum(...args) {
  let sum = 0;
  for (let arg of args) {
    sum += arg;
  }
  return sum;
}

console.log(sum(1, 2, 3, 4, 5));
