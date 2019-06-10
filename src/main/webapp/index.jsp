<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户注册</title>

</head>
<body>
<form action="/hotel_war/add.do" method="post">
    <table>
        <tr>
            <th>用户注册</th>
        </tr>
        <tr>
            <td>用户名：</td>
            <td><input type="text" id="userName" name="userName"/></td>
        </tr>

        <tr>
            <td>密码：</td>
            <td><input type="password" id="password" name="password"/></td>
        </tr>

        <tr>
            <td>确认密码：</td>
            <td><input type="password" id="password1" name="password1"/></td>
        </tr>

        <tr>
            <td><input type="submit" value="提交"></td>
            <td><input type="button" value="重置"/></td>
        </tr>
    </table>
</form>
</body>
</html>