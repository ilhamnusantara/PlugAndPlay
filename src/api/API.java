/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 *
 * @author asus
 */
public class API {

    /**
     * @param args the command line arguments
     */
    private static HttpURLConnection con;

    public static void main(String[] args) throws IOException{

        var url = "https://evening-badlands-83186.herokuapp.com/todos";

        try {

            var myurl = new URL(url);
            con = (HttpURLConnection) myurl.openConnection();

            con.setRequestMethod("GET");

            StringBuilder content;

            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {

                String line;
                content = new StringBuilder();

                while ((line = in.readLine()) != null) {

                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }

            System.out.println(content.toString());

        } finally {

            con.disconnect();
        }
    }
}  
    
//    public void getTodoList(String uri) throws Exception {
//        //Create http client
//        HttpClient client = HttpClient.newHttpClient();
//        
//        //Request body from a String
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://evening-badlands-83186.herokuapp.com/todos/create"))
//                .header("Content-Type","application/json; charset=UTF-8")
////        .POST(BodyPublishers.ofString("JSON payload string"))
//                .build();
//        
//        HttpResponse<Path> response = 
//                client.send(request, BodyHandlers.ofFile(Paths.get("todo.json")));
//        
//    }
//    
//    
//}
