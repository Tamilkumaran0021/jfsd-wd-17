function display(val) {
  console.log(val);
}

function calc(x, y, func) {
  let sum = x + y;
  func(sum);
}

calc(100, 200, display);
calc(100, 200, function (val) {
  console.log(val);
});
calc(100, 200, (val) => console.log(val));
