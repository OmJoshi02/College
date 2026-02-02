function findMinMidMax(a, b, c) {
    let min, mid, max;

    if (a >= b && a >= c) {
        max = a;
        if (b >= c) {
            mid = b;
            min = c;
        } else {
            mid = c;
            min = b;
        }
    } 
    else if (b >= a && b >= c) {
        max = b;
        if (a >= c) {
            mid = a;
            min = c;
        } else {
            mid = c;
            min = a;
        }
    } 
    else {
        max = c;
        if (a >= b) {
            mid = a;
            min = b;
        } else {
            mid = b;
            min = a;
        }
    }

    return { min, mid, max };
}

console.log(findMinMidMax(5,1,2));
