package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsersInsert {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String pass = "tiger";
	
	public UsersInsert() {
		//1. Driver class loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver loading OK!!");
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, pass);
	}
	
	
	public static void main(String[] args) {
		UsersInsert users = new UsersInsert();
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "insert into users values (?,?,?,?)";
		try {
			con = users.getConnection();
			stmt = con.prepareStatement(sql);
			//?�� ����� ���� �־��ֱ�
			stmt.setString(1, "hamletshu");
			stmt.setString(2, "�Ƚÿ�");
			stmt.setString(3, "��");
			stmt.setString(4, "����");
			int cnt = stmt.executeUpdate();
			System.out.println("��ϵ� �Ǽ� : " + cnt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
