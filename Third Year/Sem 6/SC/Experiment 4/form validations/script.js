function validate() {
    let num = document.getElementById('numberInput').value;
    let email = document.getElementById('emailInput').value;
    let password = document.getElementById('passwordInput').value;
    let image = document.getElementById('imageFile').value
    let error = document.getElementById('error');

    // Field must not be empty
    if (num === "") {
        error.innerHTML = "roll number field cannot be empty";
        alert("Input field cannot be empty");
        return false;
    }

    // Only numbers allowed
    if (isNaN(num)) {
        error.innerHTML = "Only numbers are allowed";
        return false;
    }

    if(email === ""){
        error.innerHTML = "email field cannot be empty";
        alert("Email field cannot be empty");
        return false;
    }

    let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if(!emailPattern.test(email)){
        error.innerHTML = "Enter valid email"
        return false;
    }

    if(password === ""){
        error.innerHTML = "password cannot be empty";
        return false;
    }

    if(password.length < 6){
        error.innerHTML = "Length must be greater than 6";
        return false
    }


    let allowed = image.split(".").pop().toLowerCase();

    if (allowed !== "jpg" && allowed !== "jpeg" && allowed !== "png" && allowed !== "gif") {
        error.innerHTML = "Only image files allowed (jpg, jpeg, png, gif)";
        return false;
    }

    error.innerHTML = ""
    alert("Form submitted successfully")
    return true;
}
