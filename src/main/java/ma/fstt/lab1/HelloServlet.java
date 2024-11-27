package ma.fstt.lab1;

import java.io.*;
import java.util.List;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import ma.fstt.lab1.entities.Client;
import ma.fstt.lab1.dao.ClientDAO;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    @Inject
    private ClientDAO clientDAO;

    public void init() {
        message = "Hello World!";
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myentity");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Exemple d'utilisation du DAO
        List<Client> clients = clientDAO.listerClients();
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}