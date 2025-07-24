// function add(a, b) {
//   return a + b;
// }

// console.log(add(100, 200));

// function add(a, b = 200) {
//   return a + b;
// }

// console.log(add(100));

function add(a, b) {
  return a + b;
}

// console.log(add);
// console.log(add());

let x = add;
console.log(x(100, 200));
