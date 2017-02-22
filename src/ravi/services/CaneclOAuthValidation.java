package ravi.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

import Bean.BeanMain;
import DAO.createOAuthDAO;
import DAO.cancelOAuthDAO;
import oauth.signpost.basic.DefaultOAuthConsumer;

public class CaneclOAuthValidation {
	static cancelOAuthDAO cancelDAO;
	static{
		cancelDAO = new cancelOAuthDAO();
	}
	public static String getJsonDataFromEventUrl(String eventUrl) {
	    
	    
		String jsonResponse = "";

	      try {
	          DefaultOAuthConsumer e = new DefaultOAuthConsumer("web13app13-151983","lxFJ6bYdKjeuT3Km");
	          URL url = new URL(eventUrl);
	          HttpURLConnection request = (HttpURLConnection)url.openConnection();
	          request.setRequestProperty("Accept", "application/json");
	          e.sign(request);
	          int responseCode = request.getResponseCode();
	          System.out.println("Sending \'GET\' request to URL : {}"+ eventUrl);
	          System.out.println("Response Code : {}" +  Integer.valueOf(responseCode));
	          BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));
	          StringBuffer response = new StringBuffer();

	          String inputLine;
	          while((inputLine = in.readLine()) != null) {
	              response.append(inputLine);
	          }

	          in.close();
	          jsonResponse = response.toString();
	          System.out.println("Response json from app direct server is - {}" +  jsonResponse);
	          BeanMain bean = new BeanMain();
	          bean = new ObjectMapper().readValue(jsonResponse, BeanMain.class);
	          System.out.println("^^^^^^^^^^^^" + bean.getFlag());
	          cancelDAO.create(bean);
	      } catch (Exception var9) {
	    	  System.out.println("Error fetching data from eventUrl - {}" + var9.getMessage());
	      }

	      return jsonResponse;
}

}
