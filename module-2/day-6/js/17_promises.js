// let promise = new Promise((myResolve, myReject) => {
//   let x = 10;

//   //   if (x == 0) {
//   //     myResolve("OK");
//   //   } else {
//   //     myReject("Error");
//   //   }

//   setTimeout(() => myResolve("OK"), 2000);
// });

// console.log(promise);

// promise
//   .then((val) => console.log("then block"))
//   .catch((val) => console.log("from catch"));

const fs = require("fs").promises;

fs.readFile("js/demo.txt", "utf-8")
  .then((data) => {
    console.log(data);
    return fs.readFile("js/demo2.txt", "utf-8");
  })
  .then((data2) => {
    console.log(data2);
    return fs.readFile("js/demo3.txt", "utf-8");
  })
  .then((data3) => {
    console.log(data3);
  })
  .catch((val) => console.error(val.message));
