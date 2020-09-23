<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Login</title>
    <meta charset="UTF-8">
    <meta content='IE=edge' http-equiv='X-UA-Compatible'/>
    <meta name='format-detection' content='telephone=no'/>
    <meta id="_csrf" name="_csrf" content="${_csrf.token}"/>
    <!-- default header name is X-CSRF-TOKEN -->
    <meta id="_csrf_header" name="_csrf_header" content="${_csrf.headerName}"/>
    <title>login</title>

    <%@include file="commonLibs.jsp" %>

</head>
<body>
	<h1>Login</h1>

<form action="/loginProcess" method="post">
	<table>
		<tr>
			<td>username</td><td><input type="text" name="username" placeholder="username"></td>
		</tr>
		<tr>
			<td>password</td><td><input type="text" name="password" placeholder="password"></td>
		</tr>
		<tr>
			<td colspan="2" align="right"><button type="submit">login</button>
		</tr>
	</table>
</form>
</body>
</html>