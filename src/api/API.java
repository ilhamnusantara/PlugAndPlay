/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.net.URI;
import java.net.http.*;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.*;

/**
 *
 * @author asus
 */
public class API {

    /**
     * @param args the command line arguments
     */
    
    public void getTodoList(String uri) throws Exception {
        //Create http client
        HttpClient client = HttpClient.newHttpClient();
        
        //Request body from a String
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://foo.com"))
                .header("Content-Type","application/json; charset=UTF-8")
//        .POST(BodyPublishers.ofString("JSON payload string"))
                .build();
        
        HttpResponse<Path> response = 
                client.send(request, BodyHandlers.ofFile(Paths.get("todo.json")));
        
    }
    
    
}
