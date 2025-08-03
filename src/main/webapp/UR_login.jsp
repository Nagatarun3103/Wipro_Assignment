<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
    <style>
        body { font-family: Arial; }
        label { display: inline-block; width: 140px; vertical-align: top; }
        .centered { text-align: center; }
        .container { margin: 30px auto; width: 500px; }
    </style>
</head>
<body>
    <div class="container">
        <h2 class="centered">User Registration</h2>
        <form method="post" action="register">
            <label>Full name:</label>
            <input type="text" name="fullname" required /><br><br>
            <label>E-mail:</label>
            <input type="email" name="email" required /><br><br>
            <label>Password:</label>
            <input type="password" name="password" required /><br><br>
            <label>Birthday (yyyy-mm-dd):</label>
            <input type="date" name="birthday" required /><br><br>
            <label>Gender:</label>
            <input type="radio" name="gender" value="Male" required /> Male
            <input type="radio" name="gender" value="Female" required /> Female<br><br>
            <label>Profession:</label>
            <select name="profession">
                <option value="Developer">Developer</option>
                <option value="Manager">Manager</option>
                <option value="Tester">Tester</option>
                <option value="Designer">Designer</option>
            </select><br><br>
            <label>Married?</label>
            <input type="checkbox" name="married"/><br><br>
            <label>Note:</label>
            <textarea name="note" rows="4" cols="30"></textarea><br><br>
            <div class="centered">
                <input type="submit" value="Register"/>
            </div>
        </form>
    </div>
</body>
</html>
