class Employee{

    constructor(id, name){
        this.id = id;
        this.name = name;
    }

    detail(){
        console.log(this.id+" "+this.name);
    }
}

let e1 = new Employee(1, "Om")
e1.detail()