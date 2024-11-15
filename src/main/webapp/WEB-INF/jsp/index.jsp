<%@page language="java" %>
<html>
<body>
<h2>Enter SSO ID: </h2>
<form action="employee" method="get" onSubmit="return validateForm()">
<input type="number" id="sso" name="sso"/>
<input type="submit"/>
<input type="reset"/>
</form>
</body>
<script>
function validateForm() {
	if (document.getElementById("SSO").value.trim() === ''){
		alert("Please Enter SSO ID");
		return false;
	}
	
	return true;
}
</script>
</html>