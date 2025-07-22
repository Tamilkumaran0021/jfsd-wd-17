const fruits = ["banana", "apple", "orange"];

// console.log(fruits.length);
// console.log(fruits[0]);
// fruits.push("lemon");
// fruits[fruits.length + 2] = "lemon";
// console.log(typeof fruits);
// console.log(Array.isArray(fruits));
// fruits.pop();
// fruits.shift();
// fruits.unshift("lemon");
// const fruits1 = ["lemon", "tomato"];
// const result = fruits.concat(fruits1);

// const fruits = [["banana"], ["apple"], ["orange"]];
// console.log(fruits.flat());

// console.log(fruits.slice(0, 2));

// fruits.splice(2, 1, "lemon", "tomato");

// console.log(fruits.sort());
// console.log(fruits.reverse());

const nums = [40, 100, 1, 5, 25, 10];

// function compare(a, b) {
//   return a - b;
// }

// console.log(
//   nums.sort(function (a, b) {
//     return a - b;
//   })
// );

// console.log(nums.sort((a, b) => a - b));

// const evenNumbers = nums.filter((val) => val % 2 == 0).map((val) => val * val);
// console.log(evenNumbers);

// const sum = nums
//   .filter((val) => val % 2 == 0)
//   //   .map((val) => val * val)
//   .reduce((prev, curr) => prev + curr, 100);

// console.log(sum);

// const keys = nums.keys();
// for (let key of keys) {
//   console.log(key);
// }

// const values = nums.values();
// for (let value of values) {
//   console.log(value);
// }

// const entries = nums.entries();
// for (let entry of entries) {
//   console.log(entry);
// }

// console.log(nums.includes(1));

const nums1 = [0, 9, 5, 10];
const nums2 = [10, 19, 15, 110];

const result = [...nums, ...nums1, ...nums2];

console.log(result);

const arr = ["john", 30, "IT"];
