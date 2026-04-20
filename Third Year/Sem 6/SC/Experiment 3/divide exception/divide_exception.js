let num1 = parseInt(prompt("Enter first number : "));
let num2 = parseInt(prompt("Enter second number : "));

try{

    if(num2 == 0){
        throw new Error("Cannot divide by zero")
    }
    alert(num1/num2);
    
}catch(e){
    alert("Error occured : "+e.message);
    
}