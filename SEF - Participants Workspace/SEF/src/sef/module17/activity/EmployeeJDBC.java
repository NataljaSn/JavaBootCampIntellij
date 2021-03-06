package activity;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeJDBC {

	public static void main(String[] args) {
		Employee employee = findEmployeeById(1);
		System.out.println("Employee ID i ID: " +employee.getId());
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println("Employee Salary: "+employee.getSalary());
		Employee employee1 = new Employee(2,"John","Doe",200);
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

	public static Employee findEmployeeById(int id)
	{
		Connection con = createConnection();
		Employee emp=null;
		try {
			// 1 - Create a PreparedStatement with a query
			PreparedStatement statement = con.prepareStatement("SELECT * FROM employee where id=?");
			statement.setInt(1,id);
			// 2 - Search for the given id
			ResultSet rs = statement.executeQuery();

			// 3 - Execute this query


			// 4 - If resultset is not null, then initialize emp object with data

			if(rs.next()) {
				emp = new Employee(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4)
				);
			}

			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emp;
	}

	public ArrayList<Employee> findEmployeesByName(String name)
	{
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();

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

	public ArrayList<Employee> findEmployeesBySalary(int salary)
	{
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();

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

	public static void insertEmployee(Employee emp) {
		Connection con = createConnection();
		try {
			con.setAutoCommit(false);
			PreparedStatement statement = con.prepareStatement("INSERT INTO employee (firstname, lastname, salary) VALUES (?,?,?)");
			statement.setString(1,emp.getFirstName());
			statement.setString(2,emp.getLastName());
			statement.setInt(3,emp.getSalary());
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
