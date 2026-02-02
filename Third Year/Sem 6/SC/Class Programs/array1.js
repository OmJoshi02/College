let size = parseInt(prompt("Enter array size"));

let array = [];

for (let i = 0; i < size; i++) {
    let num = parseInt(prompt("Enter number : "));
    array.push(num);
}

console.log("Array elements:");

for (let i = 0; i < array.length; i++) {
    console.log(array[i]);
}

alert(array)
