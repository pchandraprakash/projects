function validateForm() {
	var a = document.forms["myform"]["e_fname"].value;

	if (a == null || a == "") {
		alert("please enter the first name");
		return false;
	}

	var b = document.forms["myform"]["emp_id"].value;
	if (b == null || b == "") {
		alert("please enter the valid employee id");
		return false;
	}

	var date = document.forms["myform"]["doj"].value;
	if (date == null || date == "") {
		alert("please enter date");
		return false;
	}

	var c = document.forms["myform"]["sal"].value;
	if (c == null || c == "") {
		alert("please enter the salary");
		return false;
	}

	var d = document.forms["myform"]["d_name"].value;
	if (d == null || d == "") {
		alert("please enter the Department Name");
		return false;
	}

	var e = document.forms["myform"]["d_id"].value;
	if (e == null || e == "") {
		alert("please enter the Department id");
		return false;
	}

	var f = document.forms["myform"]["d_location"].value;
	if (f == null || f == "") {
		alert("please enter the Department location");
		return false;
	}

}