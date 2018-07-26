package TestBase;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

public class RestClient extends TestBase {
	
	String URL;
	int Status_Code;
	String URI = "https://reqres.in/";
	
	// For Sending Rest Request
	   
       HttpGet Request  = new HttpGet(URI);
       Request.
	
	// For Reading Rest Response
	
	public CloseableHttpResponse RestClient(String URL) {
		CloseableHttpResponse res =null;
		Status_Code=res.getStatusLine().getStatusCode();
		return res;
	
		
		
	}

}
