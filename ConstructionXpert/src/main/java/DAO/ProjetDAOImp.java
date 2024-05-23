package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import metier.Projet;

public class ProjetDAOImp implements ProjetDAO{

    @Override
    public void addProjet(Projet projet) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnect.getConnection();
        String sql = "INSERT INTO project (nom, description, date_debut, date_fin, budget)\n" +
                "VALUES (?, ?, ?, ?, ?);";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, projet.getNom());
            statement.setString(2, projet.getDescription());
            statement.setString(3, projet.getDate_debut());
            statement.setString(4, projet.getDate_fin());
            statement.setString(5, projet.getBudget());
            statement.executeUpdate();
        }

    }

    @Override
    public ArrayList<Projet> showProjet() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnect.getConnection();
        ArrayList<Projet> projets = new ArrayList<>();
        String sql = "SELECT * FROM project";
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultat = statement.executeQuery()) {
            while (resultat.next()) {
                Integer id_projet = resultat.getInt("id_projet");
                String nom = resultat.getString("nom");
                String description = resultat.getString("description");
                String date_debut = resultat.getString("date_debut");
                String date_fin = resultat.getString("date_fin");
                String budget = resultat.getString("budget");

                Projet projet = new Projet(id_projet, nom, description, date_debut, date_fin, budget);
                projets.add(projet);
            }
        }
        return projets;
    }

    @Override
    public void editProjet(Projet projet) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnect.getConnection();
        String sql = "UPDATE projet SET  nom=?, description=?, date_debut=?, date_fin=?, budget=? WHERE id_projet=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, projet.getNom());
            statement.setString(2, projet.getDescription());
            statement.setString(3, projet.getDate_debut());
            statement.setString(4, projet.getDate_fin());
            statement.setString(5, projet.getBudget());
            statement.setInt(6, projet.getId_projet());
            statement.executeUpdate();
        }
    }

    @Override
    public void deleteProjet(int id_projet) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnect.getConnection();
        String sql = "DELETE FROM projets WHERE id_projet=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id_projet);
            statement.executeUpdate();
        }
    }

    @Override
    public Projet selectBiId(int id) throws SQLException, ClassNotFoundException {
        Projet projet = null;
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM projets WHERE projet_Id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            projet = new Projet(
                    resultSet.getInt("id_projet"),
                    resultSet.getString("nom"),
                    resultSet.getString("description"),
                    resultSet.getString("date_debut"),
                    resultSet.getString("date_fin"),
                    resultSet.getString("budget")
            );
        }
        return projet;
    }

}