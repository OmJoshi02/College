let marks = prompt("Enter your total makrs out of 100 : ")

let num = Number(marks)

if(marks > 91){
    alert("You got A grade")
}

else if(marks > 81){
    alert("You got B grade")
}

else if(marks > 71){
    alert("You got C grade")
}

else if(marks > 61){
    alert("You got D grade")
}

else if(marks > 51){
    alert("You got E grade")
}

else{
    alert("Sorry, try best in next semester")
}