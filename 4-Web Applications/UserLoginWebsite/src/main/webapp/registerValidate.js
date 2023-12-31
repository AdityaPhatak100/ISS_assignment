var form = document.getElementById("registration")
var username = document.getElementById("username")
var pass1 = document.getElementById("password")
var pass2 = document.getElementById("repassword")
var usernameError = document.getElementById("username_error")
var pass1Error = document.getElementById("password_error")
var pass2Error = document.getElementById("repassword_error")
	
form.addEventListener("submit", (e) => {
	e.preventDefault()
	resetErrorMessages()
	
	if (formValidate()) {
		form.submit()
	}
	
})

function resetErrorMessages() {
    let errorElements = document.querySelectorAll(".error")
    errorElements.forEach(function (errorElement) {
        errorElement.textContent = ""
    })
}

function formValidate() {
	if (username.value == "" || username.value == null) {
	usernameError.innerHTML = "Username cannot be empty"
		return false
	}
	
	if (pass1.value == "" || pass1.value == null) {
		pass1Error.innerHTML = "Password cannot be empty"
		return false
	}
	
	if (pass2.value == "" || pass2.value == null) {
		pass2Error.innerHTML = "Re-enter password"
		return false
	}
	
	if (pass1.value !== pass2.value) {
		pass2Error.innerHTML = "Re-entered password does not match"
		return false
	}
	
	return true
}