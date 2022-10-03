package model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Animal;


public class AnimalDAO extends DAO {
    private static AnimalDAO instance;

    private AnimalDAO() {
        getConnection();
        createTable();
    }

    // Singleton
    public static AnimalDAO getInstance() {
        return (instance==null?(instance = new AnimalDAO()):instance);
    }

// CRUD    
    public PreparedStatement create(Integer id, String nome, Integer nascimento, String sexo, String especie) {
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("INSERT INTO animal (id,  nome,  nascimento,  sexo,  especie) VALUES (?,?,?,?,?)");
            stmt.setInt(1,id);
            stmt.setString(2, nome);
            stmt.setInt(3, nascimento);
            stmt.setString(4, sexo);
            stmt.setString(5, especie);
            executeUpdate(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (PreparedStatement) this.retrieveById(lastId("animal","id"));
    }
    
    // Uma pequena gambiarra, depois explico...
    public boolean isLastEmpty(){
        Animal lastAnimal = this.retrieveById(lastId("animal","id"));
        if (lastAnimal != null) {
            return lastAnimal.getNome().isBlank();
        }
        return false;
    }

    private Animal buildObject(ResultSet rs) {
        Animal animal = null;
        try {
            animal = new Animal(rs.getInt("id"), rs.getString("nome"), rs.getInt("nascimento"), rs.getString("sexo"), rs.getString("cep"));
        } catch (SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return animal;
    }

    // Generic Retriever
    public List retrieve(String query) {
        List<Animal> animals = new ArrayList();
        ResultSet rs = getResultSet(query);
        try {
            while (rs.next()) {
                animals.add(buildObject(rs));
            }
        } catch (SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return animals;
    }
    
    // RetrieveAll
    public List retrieveAll() {
        return this.retrieve("SELECT * FROM animal");
    }

    // RetrieveLast
    public List retrieveLast(){
        return this.retrieve("SELECT * FROM animal WHERE id = " + lastId("animal","id"));
    }

    // RetrieveById
    public Animal retrieveById(int id) {
        List<Animal> animals = this.retrieve("SELECT * FROM animal WHERE id = " + id);
        return (animals.isEmpty()?null:animals.get(0));
    }

    // RetrieveBySimilarName
    public List retrieveBySimilarName(String nome) {
        return this.retrieve("SELECT * FROM animal WHERE nome LIKE '%" + nome + "%'");
    }    
        
    // Updade
    public void update(Animal animal) {
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("UPDATE animal SET nome=?, end=?, cep=?, email=?, telefone=? WHERE id=?");
            stmt.setString(1, animal.getNome());
            stmt.setInt(2, animal.getNascimento());
            stmt.setString(3, animal.getSexo());
            stmt.setString(4, animal.getEspecie());
            stmt.setInt(5, animal.getId());
            executeUpdate(stmt);
        } catch (SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
        // Delete   
    public void delete(Animal animal) {
        PreparedStatement stmt;
        try {
            stmt = DAO.getConnection().prepareStatement("DELETE FROM animal WHERE id = ?");
            stmt.setInt(1, animal.getId());
            executeUpdate(stmt);
        } catch (SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

}
