<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 23/05/2024
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>Cons</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/style.css">

    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f0f0;
            background-color: aqua;
        }
        .container {
            max-width: 600px;
            margin: 20px auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            color: #333;
        }
        .detail {
            margin-bottom: 10px;
        }
        .detail span {
            font-weight: bold;
        }
    </style>

</head>
<body>

<div class="wrapper d-flex align-items-stretch">
    <nav id="sidebar" class="active" style="background-color: #B51B75;">
        <div class="custom-menu">
            <button type="button" id="sidebarCollapse" class="btn btn-primary">
                <i class="fa fa-bars"></i>
                <span class="sr-only">Toggle Menu</span>
            </button>
        </div>
        <div class="p-4" style="height: 600px;">
            <h1><a href="index.html" class="logo">ConsXpert</a></h1>
            <ul class="list-unstyled components mb-5">
                <li class="active">
                    <a href="index.html"><span class="fa fa-home mr-3"></span> Home</a>
                </li>
                <li>
                    <a href="Projet.html"><span class="fa fa-user mr-3"></span> Projets</a>
                </li>
                <li>
                    <a href="#"><span class="fa fa-briefcase mr-3"></span> Tâches</a>
                </li>
                <li>
                    <a href="#"><span class="fa fa-sticky-note mr-3"></span> Ressources</a>
                </li>

            </ul>



            <div class="footer">
                <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with Youssef<i class="icon-heart" aria-hidden="true"></i> CHERKAOUI <a style="color: azure;" target="_blank">Youssefessaddik.cherk@gmail.com</a>
                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
            </div>

        </div>
    </nav>

    <div class="container" style="width: 30%; height:50% ; margin-right: 45%;">
        <h2>Détails du Projet</h2>
        <div class="detail">
            <span>Nom du Projet:</span> <span id="nom_projet">Nom du Projet</span>
        </div>
        <div class="detail">
            <span>Description:</span> <span id="description">Description du Projet</span>
        </div>
        <div class="detail">
            <span>Budget:</span> <span id="budget">0 €</span>
        </div>
        <div class="detail">
            <span>Date de Début:</span> <span id="date_debut">Date de Début</span>
        </div>
        <div class="detail">
            <span>Date de Fin:</span> <span id="date_fin">Date de Fin</span>
        </div>
    </div>

    <script src="js/jquery.min.js"></script>
    <script src="js/popper.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>
</body>
</html>

