document.addEventListener("DOMContentLoaded", function () {
    const courseSelect = document.getElementById("course-select");

    // List of courses
    const courses = ["Web Development", "Data Science", "Full Stack", "Cloud Computing", "Cyber Security"];

    // Populate the dropdown
    courses.forEach(course => {
        let option = document.createElement("option");
        option.value = course.toLowerCase().replace(/\s+/g, "-");
        option.textContent = course;
        courseSelect.appendChild(option);
    });document.addEventListener("DOMContentLoaded", function () {
        const form = document.getElementById("enrollment-form");
    
        form.addEventListener("submit", function (event) {
            event.preventDefault(); // Prevent default form submission
    
            // Get input values
            const name = document.getElementById("name").value.trim();
            const email = document.getElementById("email").value.trim();
            const phone = document.getElementById("phone").value.trim();
            const course = document.getElementById("course-select").value;
    
            // Clear previous error messages
            clearErrors();
    
            let isValid = true;
    
            // Name validation
            if (name === "") {
                showError("name", "Full Name is required");
                isValid = false;
            }
    
            // Email validation (Regex for proper email format)
            if (!/^\S+@\S+\.\S+$/.test(email)) {
                showError("email", "Enter a valid email address");
                isValid = false;
            }
    
            // Phone number validation (Only digits, length 10-15)
            if (!/^\d+$/.test(phone) || phone.length < 10 || phone.length > 10) {
                showError("phone", "Enter a valid phone number (10-15 digits only)");
                isValid = false;
            }
    
            // Course selection validation
            if (course === "") {
                showError("course-select", "Please select a course");
                isValid = false;
            }
    
            // If all fields are valid, show success message
            if (isValid) {
                alert("Enrollment Successful! We will contact you soon.");
                form.reset(); // Clear the form after successful submission
            }
        });
    
        // Function to display error messages
        function showError(inputId, message) {
            const inputElement = document.getElementById(inputId);
            const errorMessage = document.createElement("small");
            errorMessage.className = "error-message";
            errorMessage.style.color = "red";
            errorMessage.textContent = message;
            inputElement.insertAdjacentElement("afterend", errorMessage);
        }
    
        // Function to clear previous errors
        function clearErrors() {
            const errors = document.querySelectorAll(".error-message");
            errors.forEach(error => error.remove());
        }
    });
     
});