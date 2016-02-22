function passwordFunction(form) {
    var pass1 = document.getElementById("password").value;
    var pass2 = document.getElementById("password_confirm").value;
    var ok = true;
    if (pass1 != pass2) {
        document.getElementById("password").style.borderColor = "#E34234";
        document.getElementById("password_confirm").style.borderColor = "#E34234";
        ok = false;
    }
    return ok;
}