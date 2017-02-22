package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Bean.BeanMain;
import ravi.util.DBConnectionManager;

public class cancelOAuthDAO {
	  public void create(BeanMain bean) throws SQLException{
	       
	       Connection con = (Connection) DBConnectionManager.getConnection();
	       PreparedStatement ps=null;
	       String query = "delete from company where m_uuid = ?";
	       ps = (PreparedStatement) con.prepareStatement(query);
	       ps.setString(1, bean.getCreator().getUuid());
	       ps.executeUpdate();
	     
	    
	}
}
