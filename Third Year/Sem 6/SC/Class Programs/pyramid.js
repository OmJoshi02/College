function printPyramid(stages = 5) {
    for (let i = 1; i <= stages; i++) {
        let row = "";

        // spaces
        for (let s = stages - i; s > 0; s--) {
            row += " ";
        }

        // stars
        for (let j = 1; j <= i; j++) {
            row += "* ";
        }

        console.log(row);
    }
}
printPyramid()