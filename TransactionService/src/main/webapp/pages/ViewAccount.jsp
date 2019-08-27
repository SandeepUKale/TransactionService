<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head></head>
<body>
	<h1>This is the Account details Page.</h1>
	<p>Account Number : ${account.accountNumber}</p>
	<p>Account Name : ${account.accountName}</p>
	<p>bank name : ${account.bankName}</p>
	<p>Holder Name: ${account.holderName}</p>
</body>
</html>