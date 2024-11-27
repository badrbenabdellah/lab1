<%--
  Created by IntelliJ IDEA.
  User: benab
  Date: 27/11/2024
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tableau d'utilisateurs</title>
    <style>
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            text-align: center;
            padding: 8px;
        }
        th {
            background-color: #f4f4f4;
        }
        button {
            margin: 5px;
            padding: 5px 10px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
        .btn-supprimer {
            background-color: #e74c3c;
            color: white;
        }
        .btn-modifier {
            background-color: #3498db;
            color: white;
        }
        button:hover {
            opacity: 0.9;
        }
    </style>
</head>
<body>
<h1 style="text-align: center;">Liste des Clients</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Nom</th>
        <th>Prénom</th>
        <th>Email</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <!-- Boucle pour afficher les utilisateurs -->
    <jsp:useBean id="clients" scope="request" type="java.util.List"/>
    <c:forEach var="client" items="${clients}">
        <tr>
            <td>${client.id}</td>
            <td>${client.lastName}</td>
            <td>${client.firstName}</td>
            <td>${client.email}</td>
            <td>
                <button class="btn-supprimer">Supprimer</button>
                <button class="btn-modifier">Modifier</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
