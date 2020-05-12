package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.user.vo.UserVO;

public class UsersDAO {
	
	//������
	public UsersDAO() {
		try {
			//1. Driver Class Loading
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loading ����");
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public List<UserVO> getUsers(){
		List<UserVO> list = new ArrayList<>();
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			//2. Connection ��ü ����
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection:" + con.getClass().getName());
			//3. Statement ��ü ����
			stmt = con.createStatement();
			System.out.println("Statement:" + stmt.getClass().getName());
			//4. SQL ����/ ��� ó��
			String sql = "SELECT * FROM USERS";
			ResultSet rs = stmt.executeQuery(sql);
			
			UserVO userVO = null;
			while(rs.next()) {
				String userid = rs.getString("userid");
				String name = rs.getString(2);
				String gender = rs.getString("gender");
				String addr = rs.getString("city");
//				System.out.println(userid + " " + name + " " + gender + " " + addr);
				userVO = new UserVO(userid, name, gender.charAt(0), addr);
				list.add(userVO);
			}
			
			System.out.println(list);
			
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
		return list;
	}
}
