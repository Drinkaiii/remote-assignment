function count(input) {
  let obj = {};
  input.forEach((x) => {
    //obj沒有該屬性時添加並設定為1
    if (!obj[x]) obj[x] = 1;
    //obj 有該屬性時加1
    else obj[x] += 1;
  });
  return obj;
}
let input1 = ["a", "b", "c", "a", "c", "a", "x"];
console.log(count(input1));
// should print {a:3, b:1, c:2, x:1}

function groupByKey(input) {
  let obj = {};
  input.forEach((x) => {
    if (!obj[x.key]) obj[x.key] = x.value;
    else obj[x.key] += x.value;
  });
  return obj;
}
let input2 = [
  { key: "a", value: 3 },
  { key: "b", value: 1 },
  { key: "c", value: 2 },
  { key: "a", value: 3 },
  { key: "c", value: 5 },
];
console.log(groupByKey(input2));
// should print {a:6, b:1, c:7}
