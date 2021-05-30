
package Modelo;
import java.sql.*;
public class Conexión {
  


    public static void main(String[] args)
    {

        //inicialización de conexión a base de datos

        Connection con=null;

        try //try conexión de oracle
        {
        
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Oracle JDBC driver loaded ok.");
            con=DriverManager.getConnection("jdbc:oracle:thin:test/123321@localhost:1521:orcl");
            System.out.println("Connect with @oracle:1521:orcl");

     
            Statement stmt = con.createStatement();

            String dropProductTable="drop table product cascade constraints";


            String createProductTable="CREATE TABLE product(" +
             "Nombre: " +
             "Clave: CHAR(20)," +
             "Ingresos: " +
             "Key (pid)" +
             ")"; 

         
            stmt.executeUpdate(dropProductTable);

            stmt.executeUpdate(createProductTable);

            String insertIntoProduct="INSERT INTO product VALUES (1, primero";
            String insertIntoProduct1="INSERT INTO product VALUES (2, segundo";
            String insertIntoProduct2="INSERT INTO product VALUES (3, tercero";
            String insertIntoProduct3="INSERT INTO product VALUES (4,cuarto)";
            String updatePrice="UPDATE product set price=55 where price=20";

            stmt.executeUpdate(insertIntoProduct);
            stmt.executeUpdate(insertIntoProduct1);
            stmt.executeUpdate(insertIntoProduct2);
            stmt.executeUpdate(insertIntoProduct3);

           //update statement
            stmt.executeUpdate(updatePrice);



            //save the select statement in a string
            String selectStat="SELECT * FROM product";
            String selectProduct="SELECT pid, pname from product where price>20";
            //stmt.executeUpdate(selectStat);

            //create a result set
            ResultSet rows = stmt.executeQuery(selectStat);
            ResultSet rows1= stmt.executeQuery(selectProduct);

            //stmt.executeQuery(selectStat);


            int count=0;
            while (rows.next()) {
                count+=1;
                String productNumber = rows.getString("pid");
                String productName = rows.getString("pname");
                String productPrice = rows.getString("price");
                System.out.println("Row #:"+count);
                System.out.println("Dispositivo#: "+productNumber);
                System.out.println("Nombre del dispositivo: "+productName);
                System.out.println("prince: "+productPrice);

                }

            int count1=0;
            while (rows1.next()) {
                count1+=1;
                String productNumber = rows1.getString("pid");
                String productName = rows1.getString("pname");
                String productPrice = rows1.getString("price");
                System.out.println("Row #:"+count);
                System.out.println("Dispositivo#: "+productNumber);
                System.out.println("Nombre del dispositivo: "+productName);
                System.out.println("Price: "+productPrice);

                }

            con.close();

        }
                catch (ClassNotFoundException | SQLException e)
                {
                    System.err.println("Exception:"+e.getMessage());
                }


        }
 } 

