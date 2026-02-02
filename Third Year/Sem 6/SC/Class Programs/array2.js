let arr = [10, 20, 30, 40, 50];

console.log("Original Array:", arr);

arr.push(60);
console.log("After push:", arr);

arr.pop();
console.log("After pop:", arr);

arr.unshift(5);
console.log("After unshift:", arr);

arr.shift();
console.log("After shift:", arr);

console.log("Length:", arr.length);

console.log("Index of 30:", arr.indexOf(30));

console.log("Includes 40", arr.includes(40));

let sliced = arr.slice(1, 4);
console.log("Sliced array:", sliced);

arr.splice(2, 1, 99); // remove 1 element, add 99
console.log("After splice:", arr);

let joined = arr.join("-");
console.log("Joined:", joined);