package code;

import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


public class User {

    private long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    
    public User(){
        firstName="";
        lastName="";
        userName="";
        password="";
    }

    public User(String firstName,String lastName, String userName, String password) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.userName=userName;
        this.password=password;
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public static boolean LoginUser(String userName,String password) 
    {
            boolean check =false;
            try 
            {      
                Connection con=MyConnection.getConnection();
               Connection myCon=MyConnection.getConnection();
                
                PreparedStatement ps=myCon.prepareStatement("Select * From LoginForm Where userName=? and Password=?");

                ps.setString(1, userName);
                ps.setString(2, password);
                ResultSet rs =ps.executeQuery();
                check=rs.next();

                myCon.close();        
            }catch(Exception e){e.printStackTrace();}
            
            return check;    
    }
    
      public void RegisterUser()
    {
        try
        {    
            Connection con= MyConnection.getConnection();
             Connection myCon=MyConnection.getConnection();

            String sqlString="INSERT INTO LoginForm (FirstName,LastName,UserName,Password) VALUES ('"+firstName+"','"+lastName+"','"+userName+"','"+password+"')";
            
            Statement myStatement = myCon.createStatement();
            
            try
            {    
                myStatement.executeUpdate(sqlString);
                myStatement.close();
                myCon.close();
            } catch (SQLException ex) {Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);}
        } catch (SQLException ex) {Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);}  
    }
    
       public void GetUser()
    {
            try 
            {      
                Connection con=MyConnection.getConnection();
                  Connection myCon=MyConnection.getConnection();
                
                String sqlString = "SELECT * FROM LoginForm WHERE username = '"+userName+"'";
                Statement myStatement = myCon.createStatement();
                ResultSet rs=myStatement.executeQuery(sqlString);

                while(rs.next())
                {
                   firstName= rs.getString("firstName");
                    lastName = rs.getString("lastName");
                    userName= rs.getString("userName");
                    password= rs.getString("password");
                }
                
                myStatement.close();
                myCon.close();
                
            } catch (SQLException ex) {Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);} 
            
    }
}
