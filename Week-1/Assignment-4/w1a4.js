document.addEventListener("DOMContentLoaded", function () {
  const move_element = document.getElementById("scrollElement");
  const body_element = document.querySelector("body");
  let currentPosY = 0;
  const threshold = move_element.getBoundingClientRect().height - 300;

  window.addEventListener("wheel", function (e) {
    // 計算新位置
    currentPosY -= e.deltaY;
    // 更新元素的位置
    if (currentPosY < 1)
      move_element.style.transform = `translateY(${currentPosY}px)`;
    else currentPosY = 0;

    if (currentPosY < -threshold) {
      body_element.style.overflow = "auto";
      //window.scrollTo(0, 0);
    } else {
      body_element.style.overflow = "hidden";
      //window.scrollTo(0, 0);
    }
  });
});
