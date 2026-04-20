let age = parseInt(prompt("Enter your age : "));

try{
    if(age < 18){
        throw new Error("Cannot give vote")
    }
    alert("You're eligible for vote")
}catch(e){
    alert("Error occured : "+e.message)
}