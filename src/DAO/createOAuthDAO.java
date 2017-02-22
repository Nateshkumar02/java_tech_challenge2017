package DAO;
import Bean.BeanMain;
import ravi.util.DBConnectionManager;
import java.sql.*;

public class createOAuthDAO {

	    public void create(BeanMain bean) throws SQLException{
	       
	       Connection con = (Connection) DBConnectionManager.getConnection();
	       PreparedStatement ps=null;
	       String query_one = "INSERT INTO marketplace(partner, baseUrl, uuid, openId, email) VALUES (?,?,?,?,?)";
	       ps = (PreparedStatement) con.prepareStatement(query_one);
	       ps.setString(1, bean.getMarketplace().getPartner());
	       ps.setString(2, bean.getMarketplace().getBaseUrl());
	       ps.setString(3, bean.getCreator().getUuid());
	       ps.setString(4, bean.getCreator().getOpenId());
	       ps.setString(5, bean.getCreator().getEmail());
	       ps.executeUpdate();
	      
	       String query_two= "INSERT INTO company(uuid,name,email,phone,website,country,m_uuid) VALUES (?,?,?,?,?,?,?) ";
	       ps = (PreparedStatement) con.prepareStatement(query_two);
	       ps.setString(1, bean.getPayload().getCompany().getUuid());
	       ps.setString(2, bean.getPayload().getCompany().getName());
	       ps.setString(3, bean.getPayload().getCompany().getEmail());
	       ps.setString(4, bean.getPayload().getCompany().getPhoneNumber());
	       ps.setString(5, bean.getPayload().getCompany().getWebsite());
	       ps.setString(6, bean.getPayload().getCompany().getCountry());
	       ps.setString(7, bean.getCreator().getUuid());
	       ps.executeUpdate();
	    
	}

	
}
