let value = prompt("Enter your consumed unit : ")

let num = Number(value)
let energy = 0

if(num <= 100){
    energy = num * 4.03;
    alert(`Your total bill is : $ ${energy}`)
}

else if(num <= 300){
    energy = (100*4.03) + ((num - 100)*7.86)
    alert(`Your total bill is : $ ${energy}`)
}

else if(num <= 500){
    energy = (100*4.03) + (200*7.86) + ((num-300)*10.29)
    alert(`Your total bill is : $ ${energy}`)
}
else{
    energy = num*11.63
    alert(`Your total bill is : $ ${energy}`)
}
