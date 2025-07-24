let form = document.querySelector("#addForm");
let itemList = document.querySelector("#items");
let filter = document.querySelector("#filter");

form.addEventListener("submit", (e) => {
  e.preventDefault();
  let newItem = document.querySelector("#item").value;
  let li = document.createElement("li");
  li.className = "list-group-item";
  let textNode = document.createTextNode(newItem);
  li.appendChild(textNode);

  let deleteBtn = document.createElement("button");
  deleteBtn.className = "btn btn-danger btn-sm float-right delete";
  deleteBtn.appendChild(document.createTextNode("X"));

  li.appendChild(deleteBtn);

  itemList.appendChild(li);
});

itemList.addEventListener("click", (e) => {
  if (e.target.classList.contains("delete")) {
    if (confirm("Are you Sure ?")) {
      let li = e.target.parentElement;
      itemList.removeChild(li);
    }
  }
});

filter.addEventListener("keyup", (e) => {
  let text = e.target.value.toLowerCase();
  let items = itemList.querySelectorAll("li");

  Array.from(items).forEach((item) => {
    let itemName = item.firstChild.textContent;
    if (itemName.toLowerCase().indexOf(text) == -1) {
      item.style.display = "none";
    }
  });
});
