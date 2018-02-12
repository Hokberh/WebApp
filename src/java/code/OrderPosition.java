package code;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderPosition {

    private long id;
    private String orderId="";
    private String  productId="";
    private String  price="";
    private String  itemCount="";

    public OrderPosition() {
    }

    
    public OrderPosition(long id, String  orderId, String  productId, String  price, String  itemCount){
        this.id=id;
        this.productId=productId;
        this.price=price;
        this.orderId=orderId;
        this.itemCount=itemCount;
    }
    
    public long  getId() {
        return id;
    }

    public void setId(long  id) {
        this.id = id;
    }

    public String  getOrderId() {
        return orderId;
    }

    public void setOrderId(String  orderId) {
        this.orderId = orderId;
    }

    public String  getProductId() {
        return productId;
    }

    public void setProductId(String  productId) {
        this.productId = productId;
    }

    public String  getPrice() {
        return price;
    }

    public void setPrice(String  price) {
        this.price = price;
    }

    public String  getItemCount() {
        return itemCount;
    }

    public void setItemCount(String  itemCount) {
        this.itemCount = itemCount;
    }
    
      public void AddOrderPosition(){
        
    try
        {    
            Connection con= MyConnection.getConnection();
             Connection myCon=MyConnection.getConnection();

            String sqlString="INSERT INTO OrdersPositions (OrderID ,ProductID,Price,ItemCount) VALUES ('"+orderId+"','"+productId+"','"+price+","+itemCount+"')";
            
            Statement myStatement = myCon.createStatement();
            
            try
            {    
                myStatement.executeUpdate(sqlString);
                myStatement.close();
                myCon.close();
            } catch (SQLException ex) {Logger.getLogger(OrderPosition.class.getName()).log(Level.SEVERE, null, ex);}
        } catch (SQLException ex) {Logger.getLogger(OrderPosition.class.getName()).log(Level.SEVERE, null, ex);}  
    }
 
}