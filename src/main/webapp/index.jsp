<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 20px;
        }
        button {
            margin: 10px;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }
        .btn-primary {
            background-color: #3498db;
            color: white;
        }
        .btn-secondary {
            background-color: #2ecc71;
            color: white;
        }
        .btn-warning {
            background-color: #f1c40f;
            color: white;
        }
        .btn-danger {
            background-color: #e74c3c;
            color: white;
        }
        button:hover {
            opacity: 0.9;
        }
    </style>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<!-- Boutons avec différentes actions -->
<button class="btn-primary" onclick="location.href='JSPs/add-client.jsp';">Gestion Client</button>
<button class="btn-secondary" onclick="location.href='action2.jsp';">Gestion Product</button>
<button class="btn-warning" onclick="location.href='action3.jsp';">Gestion Command</button>
<button class="btn-danger" onclick="location.href='action4.jsp';">Action 4</button>
</body>
</html>
