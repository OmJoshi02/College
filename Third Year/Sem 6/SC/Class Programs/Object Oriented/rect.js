class Rectangle {

    constructor(length, breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    area() {
        return this.length * this.breadth;
    }
}

let length = parseFloat(prompt("Enter length:"));
let breadth = parseFloat(prompt("Enter breadth:"));

let rect = new Rectangle(length, breadth);

console.log("Area of Rectangle:", rect.area());
