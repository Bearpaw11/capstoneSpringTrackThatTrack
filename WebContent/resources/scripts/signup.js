//ES6 JS function

 checkPass = () => {
	console.log("working")
    if (document.getElementById('password').value ==
            document.getElementById('confirm').value) {
        document.getElementById('submit').disabled = false;
        console.log("working")
    } else {
        document.getElementById('submit').disabled = true;
		alert("passwords do not match")
    }
}
