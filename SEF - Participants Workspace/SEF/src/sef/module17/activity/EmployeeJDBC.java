package activity;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeJDBC {
	Employee emp = new Employee();

	public static void main(String arg[]) {
		Connection con = createConnection();
		Employee e1 = new Employee();
		e1 = findEmployeeById(2);
		System.out.println(e1.getFirstName());
	}

	public static Connection createConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost/activity";
		String user = "root";
		String pass = "Mmurzilka123";

		try {
			Class.forName("com.mysql.jdbc.Driver");
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

	public static Employee findEmployeeById(int id) {
		Connection con = createConnection();
		Employee emp = null;
		try {
			// 1 - Create a PreparedStatement with a query
			PreparedStatement pStmt = con.prepareStatement("select * from employee where id = ?");

			// 2 - Search for the given id
			pStmt.setInt(1, id);

			// 3 - Execute this query
			ResultSet rs = pStmt.executeQuery();

			// 4 - If resultset is not null, then initialize emp object with data
			if (rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setSalary(rs.getInt(4));
			}

			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emp;
	}


	public ArrayList<Employee> findEmployeesByName(String name) {
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

	public ArrayList<Employee> findEmployeesBySalary(int salary) {
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();

		//try {
		// 1 - Create a PreparedStatement with a query

		//		}

		// 2 - Search for the given salary


		// 3 - Execute this query


		// 4 - While there are records, continue

		//con.close();
		//} catch (SQLException e) {
		// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}

		//return list;
//	}

		public static void insertEmployee (Employee emp){
			Connection con = createConnection();
			//1 - Create a PreparedStatement with a query "insert into employee values(?,?,?,?)"
			try {
				con.setAutoCommit(false);
				PreparedStatement statement = con.prepareStatement("INSERT INTO employee (FirstName, LastName, Salary) VALUES(?,?,?)");
				statement.setString(1, emp.getFirstName());
				statement.setString(2, emp.getLastName());
				statement.setInt(3, emp.getSalary());
				int result = statement.executeUpdate();
				if (result == 1) {
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
}
