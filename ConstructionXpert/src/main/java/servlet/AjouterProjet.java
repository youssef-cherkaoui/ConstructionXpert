
package servlet;

import java.io.IOException;
import java.sql.SQLException;

import DAO.ProjetDAOImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.Projet;


@WebServlet("/Ajouter")
public class AjouterProjet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/Ajouter.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nom =req.getParameter("nom");
        String description =req.getParameter("description");
        String date_debut =req.getParameter("date_debut");
        String date_fin =req.getParameter("date_fin");
        String budget =req.getParameter("budget");

        ProjetDAOImp projetDao = new ProjetDAOImp();
        Projet projet=new Projet(nom,description,date_debut,date_fin,budget);

        try {
            projetDao.addProjet(projet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        resp.sendRedirect("shows");

    }



}

