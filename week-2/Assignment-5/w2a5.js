function binarySearchPosition(numbers, target) {
  //過濾極端輸入
  if (numbers.length === 0) return -1;
  if (numbers.length === 1) return numbers[0];
  //定義前後
  let first = 0;
  let last = numbers.length - 1;
  //binary search
  for (let i = 0; i < numbers.length; i++)
    if (numbers[Math.floor((first + last) / 2)] === target)
      return Math.floor((first + last) / 2);
    else if (numbers[Math.floor((first + last) / 2)] < target)
      first = Math.floor((first + last) / 2);
    else if (numbers[Math.floor((first + last) / 2)] > target)
      last = Math.floor((first + last) / 2);
  //都沒有找到時回傳-1
  return -1;
}

console.log(binarySearchPosition([1, 2, 5, 6, 7], 1)); // should print 0
console.log(binarySearchPosition([1, 2, 5, 6, 7], 6)); // should print 3
