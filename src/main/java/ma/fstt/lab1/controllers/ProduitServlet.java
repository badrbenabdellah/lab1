package ma.fstt.lab1.controllers;


import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ma.fstt.lab1.dao.ClientDAO;
import ma.fstt.lab1.dao.ProduitDAO;
import ma.fstt.lab1.entities.Client;
import ma.fstt.lab1.entities.Produit;

import java.io.IOException;
import java.util.List;

@WebServlet("/ajouterProduit")
public class ProduitServlet extends HttpServlet {
    @Inject
    private ProduitDAO produitDAO ;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Affichez la page de formulaire pour ajouter un client
        List<Produit> produits = produitDAO.listerProduits();
        request.setAttribute("clients", produits);
        request.getRequestDispatcher("/JSPs/list-clients.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Récupérer les données depuis la formulaire
        String nom = request.getParameter("nom");
        String prix = request.getParameter("prix");
        String stock = request.getParameter("stock");

        //Créer une instance de Client
        Produit produit = new Produit();
        produit.setNom(nom);
        produit.setPrix(Integer.parseInt(prix));
        produit.setStock(Integer.parseInt(stock));

        //ajouter les données dans DB
        produitDAO.ajouterProduit(produit);

        //response.sendRedirect("/JSPs/list-clients.jsp");
        List<Produit> produits = produitDAO.listerProduits();
        request.setAttribute("produits", produits); // Ajouter la liste des clients comme attribut
        request.getRequestDispatcher("/listClients").forward(request, response);
    }
}
