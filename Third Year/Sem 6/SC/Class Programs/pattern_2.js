let n = 4;

// Upper part
for (let i = 1; i <= n; i++) {
    let row = "";

    // spaces
    for (let s = n - i; s > 0; s--) {
        row += " ";
    }

    // stars
    for (let j = 1; j <= i; j++) {
        row += "* ";
    }

    console.log(row);
}

// Lower part
for (let i = n - 1; i >= 1; i--) {
    let row = "";

    // spaces
    for (let s = n - i; s > 0; s--) {
        row += " ";
    }

    // stars
    for (let j = 1; j <= i; j++) {
        row += "* ";
    }

    console.log(row);
}
