<%@page language="java" %>
<html>
<head>
    <title>Form Submission Success</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            padding: 20px;
        }
    </style>
</head>
<body>
    <h1>Form Submission Successful</h1>
    <form action="result">
   		<button>View Updated Details for SSO ID: <%= session.getAttribute("sso") %></button>
    </form>
</body>
</html>
