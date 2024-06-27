//標題點擊後改成 Have a Good Time!
const title = document.querySelector("#welcomeMessage h1");
title.addEventListener(
  "click",
  () => (title.textContent = "Have a Good Time!")
);

//點選 Call to Action 按鈕後出現更多內容
const ActionButton = document.querySelector("#CallToAction");
const moreContent = document.querySelector("#moreContent");
moreContent.style.display = "none"; //先調整為 none
ActionButton.addEventListener("click", () => {
  if (moreContent.style.display !== "flex") moreContent.style.display = "flex";
  else moreContent.style.display = "none";
});
