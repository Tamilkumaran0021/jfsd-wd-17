// // const john = { name: "john", age: 20 };
// // const peter = { name: "peter", age: 20 };

// class Person {
//   constructor(name, age) {
//     this.name = name;
//     this.age = age;
//   }

//   display() {
//     return "hello world";
//   }

//   static hello() {
//     return "hello from static";
//   }

//   get _age() {
//     return this.age;
//   }

//   set setAge(age) {
//     this.age = age;
//   }
// }

// const john = new Person("john", 20);
// console.log(john.display());
// john.setAge = 22;
// console.log(john._age);
// console.log(Person.hello());

class Car {
  constructor(brand) {
    this.brand = brand;
  }

  display() {
    return "hello from Car";
  }
}

class Model extends Car {
  constructor(brand, model) {
    super(brand);
    this.model = model;
  }

  show() {
    return this.brand + "  " + this.model;
  }

  display() {
    return "hello from Model";
  }
}

let car = new Model("BMW", "Q Series");
console.log(car.show());
console.log(car.display());
