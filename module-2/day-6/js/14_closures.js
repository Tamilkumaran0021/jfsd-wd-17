// to make global variables as private --> private global variables

// let a = 4;
// function myFunc() {
//   console.log(a);
// }

// function add() {
//   console.log(a);
// }

// let counter = 1;
// function add() {
//   counter++;
//   return counter;
// }

// add();
// add();
// add();

// console.log(add());

const add = (function () {
  let counter = 0;
  return function () {
    counter++;
    return counter;
  };
})();

console.log(add());
console.log(add());
console.log(add());
