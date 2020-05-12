package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.user.vo.UserVO;

public class UsersSelect {
	
	public static void main(String[] args) {
		try {
			//1. Driver Class Loading
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loading 己傍");
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			//2. Connection 按眉 积己
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection:" + con.getClass().getName());
			//3. Statement 按眉 积己
			stmt = con.createStatement();
			System.out.println("Statement:" + stmt.getClass().getName());
			//4. SQL 角青/ 搬苞 贸府
			String sql = "SELECT * FROM USERS";
			ResultSet rs = stmt.executeQuery(sql);
			
			UserVO userVO = null;
			List<UserVO> userList = new ArrayList<>();
			while(rs.next()) {
				String userid = rs.getString("userid");
				String name = rs.getString(2);
				String gender = rs.getString("gender");
				String addr = rs.getString("city");
//				System.out.println(userid + " " + name + " " + gender + " " + addr);
				userVO = new UserVO(userid, name, gender.charAt(0), addr);
				userList.add(userVO);
			}
			
			System.out.println(userList);
			
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
