function ajax(src, callback) {
  const xhttp = new XMLHttpRequest();
  xhttp.open("GET", src);
  xhttp.send();
  xhttp.onreadystatechange = function () {
    if (xhttp.readyState === 4 && xhttp.status === 200)
      callback(xhttp.responseText);
    else if (xhttp.readyState === 2 || xhttp.readyState === 3)
      console.log(`xhttp.readyState:${xhttp.readyState}`);
    else console.log("Something went wrong.");
  };
}
function render(data) {
  const div = document.querySelector("div");
  const dataArr = JSON.parse(data);
  for (let someData of dataArr) {
    const h2Name = document.createElement("h2");
    const pPrice = document.createElement("p");
    const pDescription = document.createElement("p");
    h2Name.textContent = someData.name;
    pPrice.textContent = someData.price;
    pDescription.textContent = someData.description;
    div.append(h2Name, pPrice, pDescription);
  }
}

//input
ajax(
  "https://remote-assignment.s3.ap-northeast-1.amazonaws.com/products",
  function (response) {
    render(response);
  }
); // you should get product information in JSON format and render data in the page
