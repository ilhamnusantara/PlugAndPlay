package todoapp.Controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

/**
 *
 * @author maxxoto
 */
public class ApiControllers {
    
    public String getRequest() throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://evening-badlands-83186.herokuapp.com/todos"))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
    
    public String postRequst() throws IOException, InterruptedException{
            HashMap values = new HashMap<String, String>() {{
            put("todo_description", "Dari netbean");
            put ("todo_responsible", "Ilham");
            put ("todo_priority", "High");
        }};

        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(values);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://evening-badlands-83186.herokuapp.com/todos/add"))
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        return null;

    }

}
