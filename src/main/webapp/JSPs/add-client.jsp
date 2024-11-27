<%--
  Created by IntelliJ IDEA.
  User: benab
  Date: 27/11/2024
  Time: 07:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Client</title>
</head>
<body>
<h1>Ajouter un nouveau Client</h1>
<form method="post" action="ajouterClient">
    <label for="firstName">Prénom :</label>
    <input type="text" id="firstName" name="firstName" required>
    <br>

    <label for="lastName">Nom :</label>
    <input type="text" id="lastName" name="lastName" required>
    <br>

    <label for="email">Email :</label>
    <input type="email" id="email" name="email" required>
    <br>

    <button type="submit">Ajouter</button>
</form>
</body>
</html>
