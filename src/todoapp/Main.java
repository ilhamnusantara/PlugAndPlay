/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todoapp;
import java.io.IOException;
import todoapp.Controllers.ApiControllers;
/**
 *
 * @author maxxoto
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        ApiControllers ap = new ApiControllers();
        
        String req = ap.getRequest();    
        String req2 = ap.postRequst();
        System.out.println(req);
    }
    
}
