let a = 30;
let b = 30;
let c = 30;

function sort(a,b,c){
    if(a > b && a > c){
        console.log("a is greater");
        
    }
    else if(b > a && b > c){
        console.log("b is greater");
        
    }
    else{
        console.log("C is greater");
        
    }
}

sort(a,b,c)