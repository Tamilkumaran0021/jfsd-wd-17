// setTimeout(() => console.log("hello world"), 2000);
// console.log("hi");

const fs = require("fs");

// callback hell
fs.readFile("js/demo.txt", "utf-8", (err, data) => {
  if (err) {
    console.error(err.message);
  } else {
    fs.readFile("js/demo2.txt", "utf-8", (err, data1) => {
      if (err) {
        console.error(err.message);
      } else {
        fs.readFile("js/demo3.txt", "utf-8", (err, data2) => {
          if (err) {
            console.error(err.message);
          } else {
            console.log(data);
            console.log(data1);
            console.log(data2);
          }
        });
      }
    });
  }
});
