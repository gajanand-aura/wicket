function populateStates() {
    const countrySelect = document.getElementById("country");
    const stateSelect = document.getElementById("state");
    const selectedCountry = countrySelect.options[countrySelect.selectedIndex].value;
    const states = {
        "India": ["Karnataka", "Maharashtra", "Delhi"],
        "US": ["California", "Florida", "Texas"],
        "UK": ["London", "Manchester", "Birmingham"]
    };
    stateSelect.innerHTML = "<option value=''>Select State</option>";
    if (selectedCountry !== "") {
        states[selectedCountry].forEach(function(state) {
            const option = document.createElement("option");
            option.text = state;
            option.value = state;
            stateSelect.appendChild(option);
        });
        const abc = document.getElementById('indian');
        if (selectedCountry === 'India') {
        	        abc.checked = true;
        	        
        	    }else{
        	    	abc.checked = false;
        	        
        	    }
    }
    
}

function submitForm(event) {
    event.preventDefault();
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const country = document.getElementById('country').value;
    const state = document.getElementById('state').value;
    const gender = document.querySelector('input[name="gender"]:checked').value;
    const indian = document.getElementById('indian').checked;
    const married = document.getElementById('married').checked;
    const agree = document.getElementById('none').checked;
    
    
    
    if (!/^[A-Za-z\s]+$/.test(name)) {
        var nameInput = document.getElementById("name");
        nameInput.value = "Please enter only Alphabet";
        nameInput.classList.add("error-message");

        return;
    }
    
    if (country === "" || state === "") {
        alert("    Please select both country and state.");
        return;
    }
   
    
    if (!alert) {
        alert("Please agree to the terms and conditions.");
        return;
    }

    let formData = {
        name: name,
        email: email,
        country: country,
        state: state,
        gender: gender,
        indian: indian,
        married: married,
        agree: agree,
    };
    console.log(formData);
    localStorage.setItem('formData', JSON.stringify(formData));

    event.target.reset();
    window.location.href = "formdata.html";
}