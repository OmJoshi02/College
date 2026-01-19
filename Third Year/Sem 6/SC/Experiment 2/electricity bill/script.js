let value = prompt("Enter your consumed unit : ")

let num = Number(value)

if(num >1 && num <= 50){
    alert(`Your bill amount is increased 2 times. TOtal amount : $ ${num*2}`)
}

else if(num >50 && num <= 100){
    alert(`Your bill amount is increased 3 times. Total amount : $ ${num*3}`)
}

else if(num > 100 && num <= 200){

    alert(`Your bill amount is increased 5 times. Total amount : $ ${num*5}`)
}