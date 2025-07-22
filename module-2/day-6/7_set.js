let mySet = new Set();

mySet.add(1);
mySet.add(1);
mySet.add(2);
mySet.add(3);

// mySet.delete(2);
// console.log(mySet.has(2));
// console.log(mySet.size);
// console.log(mySet);

// mySet.forEach((val) => console.log(val));

// let anotherSet = new Set([1, 2, 3]);
// let values = mySet.values();

let arr = Array.from(mySet);
console.log(arr);
