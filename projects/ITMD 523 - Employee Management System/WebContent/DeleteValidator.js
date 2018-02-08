function validateForm() {

	var b = document.forms["myForm"]["emp_id"].value;
	if (b == null || b == 0) {
		alert("Please enter a valid Employee ID ");
		return false;
	}

}