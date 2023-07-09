package dao;



import java.sql.*;



import ConnectionManager.ConnectionManager;

import Model.Login;



public class LoginDAO {

public boolean validate(Login login)throws ClassNotFoundException,SQLException

{

String username=login.getUsername();

String password=login.getPassword();



ConnectionManager conn=new ConnectionManager();

Connection con=conn.establishConnection();



// create a statement obj to execute query

Statement st=con.createStatement();



// execte the statement obj and return a query resultset

ResultSet rs=st.executeQuery("select * from login");

while(rs.next())

{

if(username.equals(rs.getString("username"))&& password.equals(rs.getString("password")))

{

// close the connection

conn.closeConnection();

return true;

}

}

conn.closeConnection();

return false;



}



}