package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.MemoVO;

public class MemoDAO {
Connection conn;
public MemoDAO() {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "user1", "1111");
		System.out.println(conn);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
public List<MemoVO> searchlist(String search) {
	String sql="select * from memo1 where content like '%"+search+"%'";
	try {
	PreparedStatement pstmt=conn.prepareStatement(sql);
	ResultSet rs=pstmt.executeQuery();
	List list=new ArrayList<MemoVO>();
	while(rs.next()) {
		list.add(new MemoVO(rs.getString("content")));
	}
	return list;
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}
}
