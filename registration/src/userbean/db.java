package userbean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import encap.names;

public class db {
public static void add(names n)  {
	try{ 
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kranthi","kranthi");
	PreparedStatement pst=con.prepareStatement("insert into empdata values(?,?,?)");
	pst.setString(1, n.getUsername());
	pst.setString(2, n.getPassword());
	pst.setString(3, n.getEmail());
	System.out.println(n.getUsername());
	System.out.println(n.getEmail());
	int i=pst.executeUpdate();
	if(i==1) {
		System.out.println("inserted");
	}
	else {
		System.out.println("not inserted");
	}
}catch(Exception e) {
	e.printStackTrace();
}
}
}