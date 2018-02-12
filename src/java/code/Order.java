package code;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Order {

    private long id;
    private String description="";
    private String orderDate="";
    private String totalCost="";

    public Order() {
    }
    
    public Order(long id, String description, String orderDate, String totalCost){
        this.id=id;
        this.description=description;
        this.orderDate=orderDate;
        this.totalCost=totalCost;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }
    
    public void AddOrder(){
        
    try
        {    
            Connection con= MyConnection.getConnection();
             Connection myCon=MyConnection.getConnection();

            String sqlString="INSERT INTO Orders (Description,OrderDate,TotalCost) VALUES ('"+description+"','"+orderDate+"','"+totalCost+"')";
            
            Statement myStatement = myCon.createStatement();
            
            try
            {    
                myStatement.executeUpdate(sqlString);
                myStatement.close();
                myCon.close();
            } catch (SQLException ex) {Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);}
        } catch (SQLException ex) {Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);}  
    }
    

     
}

  