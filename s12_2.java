import java.io.*;
import java.sql.*;
public class jdbcseta1
{
public static void main(String g[])
{
Connection con;
ResultSet rs;
Statement st;
try

{
Class.forName("org.postgresql.Driver");

con=DriverManager.getConnection("jdbc:postgresql://localhost/tydb","postgres",
"");

st=con.createStatement();
rs=st.executeQuery("select * from project");
while(rs.next())
{
System.out.println("Project Id:"+rs.getInt(1));
System.out.println("Project Name:"+rs.getString(2));
System.out.println("Project Description:"+rs.getString(3));
System.out.println("Project Status:"+rs.getString(4));
}
}catch(Exception e)
{
System.out.println(e);
}
}}
