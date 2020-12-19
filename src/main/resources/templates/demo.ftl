<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<#list model as user>
    <td>${user.tid}</td><br>
    <td>${user.tname}</td><br>
    <td>${user.tsalary}</td><br>
    <td>${user.tdate}</td>
</#list>
</body>
</html>