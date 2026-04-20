let username = prompt("Enter your username : ")

try{
    if(username === ""){
        throw new Error("Username required !")
    }
    alert("Username : "+username)
}catch(e){
    alert("Exception occured : "+e.message)
}