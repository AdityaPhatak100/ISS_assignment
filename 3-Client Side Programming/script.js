let form = document.getElementById("registrationForm")

form.addEventListener("submit", function (event) {
    event.preventDefault()
    if (validateForm()) {
        form.submit()
        window.location.href = "form-success.html"
    }

    function validateForm() {
        resetErrorMessages()
        let nameSuccess = validateName()
        let mobileSuccess = validateMobile()
        let emailSuccess = validateEmail()
        let dobSuccess = validateDOB()
        let passwordSuccess = validatePassword()

        return nameSuccess && mobileSuccess && emailSuccess && dobSuccess && passwordSuccess
    }

    function resetErrorMessages() {
        let errorElements = document.querySelectorAll(".error")
        errorElements.forEach(function (errorElement) {
            errorElement.textContent = ""
        })
    }

    function validateName() {
        let name = document.getElementById("name").value
        let nameError = document.getElementById("nameError")

        if (!name) {
            nameError.textContent = "Name is required."
            return false

        }
        return true
    }

    function validateMobile() {
        let mobile = document.getElementById("mobile").value
        let mobileError = document.getElementById("mobileError")

        if (!mobile) {
            mobileError.textContent = "Mobile number is required."
            return false

        }
        return true
    }

    function validateEmail() {
        let email = document.getElementById("email").value
        let emailError = document.getElementById("emailError")

        if (!email) {
            emailError.textContent = "Email is required."
            return false
        }
        return true
    }

    function validateDOB() {
        let dob = document.getElementById("dob").value
        let dobError = document.getElementById("dobError")

        if (!dob) {
            dobError.textContent = "Date of Birth is required."
            return false
        }
        return true
    }

    function validatePassword() {
        let password = document.getElementById("password").value
        let passwordError = document.getElementById("passwordError")

        if (!password) {
            passwordError.textContent = "Password is required."
            return false
        }
        return true
    }
})
