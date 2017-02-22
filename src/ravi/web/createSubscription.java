package ravi.web;

import java.io.IOException;
import java.io.PrintWriter; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import ravi.model.SuccessData;
import ravi.services.OAuthValidation;
//@WebServlet(name = "createSubscription")
public class createSubscription extends HttpServlet{

	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.setContentType("application/json");
	        PrintWriter out = response.getWriter();
	        String eventUrl=(String)request.getParameter("eventUrl");
	        ObjectMapper mapper = new ObjectMapper();
	        // TestJson testJson = new TestJson();
	         //testJson.setEventUrl(eventUrl);
	         // HandleEventUrl.callUrl(eventUrl);
	         SuccessData demo=new SuccessData();
	         System.out.println("^^^^^^^^^eventUrl^^^^^^^^^^^^"+eventUrl);
	         demo.setAccountIdentifier("AppDirect_data");
	         demo.setSuccess("true");
	         String OAuthData;
	         OAuthData=OAuthValidation.getJsonDataFromEventUrl(eventUrl);
	         System.out.println(OAuthData);
	         String json = mapper.writeValueAsString(demo);
	         out.print(json);
	    }
}
