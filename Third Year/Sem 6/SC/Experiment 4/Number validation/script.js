function validate() {
    let num = document.getElementById('numberInput').value;
    let error = document.getElementById('error');

    // Field must not be empty
    if (num === "") {
        error.innerHTML = "Field cannot be empty";
        alert("Input field cannot be empty");
        return false;
    }

    // Only numbers allowed
    if (isNaN(num)) {
        error.innerHTML = "Only numbers are allowed";
        return false;
    }

    // Valid
    valid.innerHTML = "Field accepted";
    alert("Roll number accepted")
    return true;
}
