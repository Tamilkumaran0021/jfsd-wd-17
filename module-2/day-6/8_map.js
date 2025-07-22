let map = new Map();

map.set("name", "John");
map.set("age", 20);
map.set("graduated", true);

// console.log(map);
// console.log(map.get("name"));
// console.log(map.has("age"));
// console.log(map.size);

// map.forEach((value, key) => console.log(key + " " + value));

let keys = Array.from(map.keys());
let values = Array.from(map.values());
let entries = Array.from(map.entries());

console.log(entries);
