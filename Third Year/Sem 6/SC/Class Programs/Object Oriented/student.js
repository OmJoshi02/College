class Student {

    constructor(id, name, age, course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    display() {
        console.log("Student ID:", this.id);
        console.log("Name:", this.name);
        console.log("Age:", this.age);
        console.log("Course:", this.course);
    }
}

let id = parseInt(prompt("Enter student ID:"));
let name = prompt("Enter student name:");
let age = parseInt(prompt("Enter student age:"));
let course = prompt("Enter student course:");

let s1 = new Student(id, name, age, course);

s1.display();
