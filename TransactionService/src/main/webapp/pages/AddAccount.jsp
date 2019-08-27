<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Master Planner</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<form method="POST" action="saveAccount">
		<p>
			Account Number : <input type="text" name="accountNumber" path="accountNumber"></input>
		</p>
		<p>
			Account Name : <input type="text" name="accountName" path="accountName"></input>
		</p>
		<p>
			bank name : <input type="text" name="bankName" path="bankName"></input>
		</p>
		<p>
			Holder Name: <input type="text" name="holderName" path="holderName"></input>
		</p>
		<p>
			Phone Number : <input type="text" name="phone" path="phone"></input>
		</p>
		<p>
			<input type="submit" value="AddAccount" />
		</p>
	</form>
</body>
</html>