const fs = require("fs").promises;

async function display() {
  try {
    let data = await fs.readFile("js/demo.txt", "utf-8");
    console.log(data);

    data = await fs.readFile("js/demo2.txt", "utf-8");
    console.log(data);

    data = await fs.readFile("js/demo3.txt", "utf-8");
    console.log(data);
  } catch (error) {
    console.error(error.message);
  }
}

display();
