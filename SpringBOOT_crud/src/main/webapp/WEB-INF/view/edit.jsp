<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Registration</title>
    <style>
        .btn {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
        }
        .input {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }
    </style>
</head>
<body>
    <h1>Edit Registration</h1>
    
    <form action="update" method="post" modelAttribute="RegisterVO">
        <table>
            <tbody>
                <tr>
                    <td><input type="hidden" name="id" value="${RegisterVO.id}" /></td>
                </tr>
                <tr>
                    <td><input type="text" name="firstName" class="input" value="${RegisterVO.firstName}" placeholder="First Name"/></td>
                </tr>
                <tr>
                    <td><input type="text" name="lastName" class="input" value="${RegisterVO.lastName}" placeholder="Last Name"/></td>
                </tr>
                <tr>
                    <td><input type="submit" class="btn" value="Update"/></td>
                </tr>
            </tbody>
        </table>
    </form>

    <br>
    <a href="search">Cancel</a>
</body>
</html>
