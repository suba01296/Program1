package demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class TenthBaseClassLink {
	public static void brokenLinkCheck(String link) throws IOException
	{
		  
		if (link == null || link.isEmpty() || !link.startsWith("http")) {
            System.out.println("Skipping invalid link: " + link);
            return;
        }

        // Open link connection
        URL url = new URL(link);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();

        // Get response code
        int responsecode = connection.getResponseCode();

        // Check if link is broken or not
        if (responsecode >= 400) {
            System.out.println("Given Link is Broken link: " + link);
        } 
        else {
            System.out.println("Working link: " + link);
        }

        // Close connection
        connection.disconnect();
    }
}





