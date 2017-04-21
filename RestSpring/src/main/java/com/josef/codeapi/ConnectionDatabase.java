package com.josef.codeapi;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by josef on 4/21/17.
 */
public class ConnectionDatabase {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/CodeAPI";


    //  Database credentials
    static final String USER = "root";
    static final String PASS = "hallo";

    private Connection connection;
    private Statement statement;

    public ConnectionDatabase() {
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Skill> cands(int userID) throws SQLException {
        statement = connection.createStatement();

        ResultSet rs = statement.executeQuery("SELECT c_s.ID, c_s.name, c_s.description, nm_user_cs.level, c_s.parentID FROM user JOIN nm_user_cs ON user.ID = nm_user_cs.userID JOIN c_s ON nm_user_cs.csID = c_s.ID WHERE id = " + userID);

        List<Skill> skills = new ArrayList<Skill>();
        while (rs.next()) {
            Skill skill = new Skill();
            skill.ID = rs.getInt("ID");
            skill.name = rs.getString("name");
            skill.description = rs.getString("description");
            skill.level = rs.getInt("level");
            skill.parentID = rs.getInt("parentID");
            skills.add(skill);
        }
        return skills;
    }

    public List<User> search(String[] skills) throws SQLException {
        // Statements allow to issue SQL queries to the database
        statement = connection.createStatement();
        // Result set get the result of the SQL query
        // String
        for(int i = 0; i < skills.length; i++) {
            // String
        }
            ResultSet rs = statement
                    .executeQuery("SELECT * FROM user JOIN nm_user_cs ON user.ID = nm_user_cs.userID JOIN c_s ON c_s.ID = nm_user_cs.csID WHERE c_s.name = 'Soft Skills'");


        List<User> list = new ArrayList<User>();
        while (rs.next()) {
            //Retrieve by column name
            int id = rs.getInt("ID");
            String name = rs.getString("name");
            String first_name = rs.getString("first_name");
            String mail = rs.getString("mail");
            String lack_link = rs.getString("lack_link");
            String icon = rs.getString("icon");
            int semester = rs.getInt("semester");

            User user = new User();
            user.setID(id);
            user.setName(name);
            user.setFirst_name(first_name);
            user.setMail(mail);
            user.setSlack_link(lack_link);
            user.setIcon(icon);
            user.setSemester(semester);
            list.add(user);
        }
        return list;
    }




    public void closeConnection() {
        if(connection!=null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }



}
