function Person(name, age) {
  this.name = name;
  this.age = age;
}

const john = new Person("john", 20);
Person.prototype.graduated = true;

const peter = new Person("peter", 20);

console.log(peter.graduated);
