//question 1
function button_1() {
  delayedResult(4, 5, 3000, function (result) {
    console.log(result);
  }); // 9 (4+5) will be shown in the console after 3 seconds

  delayedResult(-5, 10, 2000, function (result) {
    console.log(result);
  }); // 5 (-5+10) will be shown in the console after 2 seconds
}
function delayedResult(n1, n2, delayTime, callback) {
  window.setTimeout(function () {
    callback(n1 + n2);
  }, delayTime);
}

//question 2
function button_2() {
  delayedResultPromise(4, 5, 3000).then(console.log);
  // 9 (4+5) will be shown in the console after 3 seconds
}
function delayedResultPromise(n1, n2, delayTime) {
  const promiseObj = new Promise(function (resolve, reject) {
    setTimeout(function () {
      let sum = n1 + n2;
      resolve(sum);
    }, delayTime);
  });
  return promiseObj;
}

//question 3
async function main() {
  const answer = await delayedResultPromise(4, 5, 3000);
  console.log(answer);
}
