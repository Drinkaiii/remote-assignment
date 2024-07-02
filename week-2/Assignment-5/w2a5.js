function binarySearchPosition(numbers, target) {
  //filter extreme
  if (numbers.length === 0) return -1;
  if (numbers.length === 1) return numbers[0];
  //define first and last
  let first = 0;
  let last = numbers.length - 1;
  let mid = 0;
  //binary search
  for (let i = 0; i < numbers.length; i++){
    mid = Math.floor((first + last) / 2);
    if (numbers[mid] === target)
      return mid;
    else if (numbers[mid] < target)
      first = mid;
    else if (numbers[mid] > target)
      last = mid;
  }
  //if don't have answer return -1
  return -1;
}

console.log(binarySearchPosition([1, 2, 5, 6, 7], 1)); // should print 0
console.log(binarySearchPosition([1, 2, 5, 6, 7], 6)); // should print 3
