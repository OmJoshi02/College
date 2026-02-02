function fibonacciUntil(n) {
    let fib = [0, 1];

    while (true) {
        let next = fib[fib.length - 1] + fib[fib.length - 2];
        if (next > n) break;
        fib.push(next);
    }

    return fib;
}
console.log(fibonacciUntil(100));
