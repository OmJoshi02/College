let a = 7, b = 2, c = 5;

if (a > b) {
  a = a + b;
  b = a - b;
  a = a - b;
}

if (a > c) {
  a = a + c;
  c = a - c;
  a = a - c;
}

if (b > c) {
  b = b + c;
  c = b - c;
  b = b - c;
}

console.log(a, b, c); // 2 5 7
