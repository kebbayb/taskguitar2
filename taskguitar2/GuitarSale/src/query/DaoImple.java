package query;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.guitar;
import model.guitarspec;

import conn.dbconn;

public class DaoImple implements DAO{
	
	private static final List<guitar> Inventory = null;


	@Override
	public List<guitar> search(String price) {
		List<guitar> listguitar = new ArrayList<guitar>();
		String sql = "select * from Guitar where price=?";
		Connection Conn = dbconn.open();
		try {
			PreparedStatement pstmt = Conn.prepareStatement(sql);
			pstmt.setString(1,price);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				guitar guitar=new guitar();
				guitarspec guitarspec=new guitarspec();
				guitar.setPrice(price);
				guitarspec.setBuilder(rs.getString(2));
				guitarspec.setType(rs.getString(3));
				guitarspec.setBackWood(rs.getString(4));
				guitar.setID(rs.getString(5));
				listguitar.add(guitar);
			}
			return listguitar;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			conn.dbconn.close(Conn);
		}
	return null;
}


@Override
public List<guitar> guitars() {
	Connection Conn =conn.dbconn.open();
	String sql = "select * from Guitar";
	try {
		PreparedStatement pstmt = Conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			guitar guitar=new guitar();
			guitarspec guitarspec=new guitarspec();
			guitar.setID(rs.getString(1));
			guitarspec.setBuilder(rs.getString(2));
			guitarspec.setType(rs.getString(3));
			guitarspec.setBackWood(rs.getString(4));
			guitar.setPrice(rs.getString(5));
			Inventory.add(guitar);
		}
		return Inventory;
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
		conn.dbconn.close(Conn);
	}
	return null;
}



}
