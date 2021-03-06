package FinalActivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//getting values from db for task #4 (employee names & salaries)
public class addressJDBC {
    public static void main(String[] args) {
        address address = findEmployeeById(1);
        System.out.println("Employee ID i ID: " +address.getId());
        System.out.println(address.getName());
        System.out.println("Employee Salary: "+address.getSalary());
        address employee1 = new address(2,"Araju","LV-1047","Doghnut", 155);
        insertEmployee(employee1);
    }

    public static Connection createConnection()
    {
        Connection con=null;
        String url = "jdbc:mysql://localhost/activity";
        String user = "root";
        String pass = "Mmurzilka123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection successfully established!");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return con;
    }

    public static address findEmployeeById(int id)
    {
        Connection con = createConnection();
        address emp=null;
        try {
            // 1 - Create a PreparedStatement with a query
            PreparedStatement statement = con.prepareStatement("SELECT * FROM address where id=?");
            statement.setInt(1,id);
            // 2 - Search for the given id
            ResultSet rs = statement.executeQuery();
            // 3 - Execute this query
            // 4 - If resultset is not null, then initialize emp object with data
            if(rs.next()) {
                emp = new address(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5)
                );
            }

            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return emp;
    }

    public ArrayList<address> findEmployeesByName(String name)
    {
        Connection con = createConnection();
        ArrayList<address> list = new ArrayList<address>();

        try {
            // 1 - Create a PreparedStatement with a query
            // 2 - Search for the given id
            // 3 - Execute this query
            // 4 - While there are some records, continue
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<address> findEmployeesBySalary(int salary)
    {
        Connection con = createConnection();
        ArrayList<address> list = new ArrayList<address>();
        try {
            // 1 - Create a PreparedStatement with a query
            // 2 - Search for the given salary
           // 3 - Execute this query
            // 4 - While there are records, continue
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }

    public static void insertEmployee(address emp) {
        Connection con = createConnection();
        try {
            con.setAutoCommit(false);
            PreparedStatement statement = con.prepareStatement("INSERT INTO address (street, postcode, name, salary) VALUES (?,?,?,?)");
            statement.setString(1,emp.getStreet());
            statement.setString(2,emp.getPostcode());
            statement.setString(3,emp.getName());
            statement.setInt(4,emp.getSalary());
            int result = statement.executeUpdate();
            if(result==1) {
                System.out.println("Successfully inserted values");
            } else {
                System.out.println("Error, something went wrong");
            }
            con.commit();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
