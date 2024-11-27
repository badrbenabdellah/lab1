package ma.fstt.lab1.controllers;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ma.fstt.lab1.dao.ClientDAO;
import ma.fstt.lab1.entities.Client;

import java.io.IOException;
import java.util.List;


@WebServlet("/ajouterClient")
public class ClientServlet extends HttpServlet {
    @Inject
    private ClientDAO clientDAO ;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Affichez la page de formulaire pour ajouter un client
        List<Client> clients = clientDAO.listerClients();
        request.setAttribute("clients", clients);
        request.getRequestDispatcher("/JSPs/list-clients.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Récupérer les données depuis la formulaire
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");

        //Créer une instance de Client
        Client client = new Client();
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setEmail(email);

        //ajouter les données dans DB
        clientDAO.ajouterClient(client);

        //response.sendRedirect("/JSPs/list-clients.jsp");
        List<Client> clients = clientDAO.listerClients();
        request.setAttribute("clients", clients); // Ajouter la liste des clients comme attribut
        request.getRequestDispatcher("/listClients").forward(request, response);
    }

}
