var form = document.getElementById("login")
var username = document.getElementById("username")
var pass1 = document.getElementById("password")
var usernameError = document.getElementById("username_error")
var pass1Error = document.getElementById("password_error")
	
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
	
	return true
}