package api.controllers;
import api.desktop;
//import com.google.gson.Gson;
import api.models.Todo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


/**
 *
 * @author maxxoto
 */
public class JsonParser {

    public static void main(String[] args) {
        desktop desktop = new desktop();
        desktop.setVisible(true);
        
        String json = "";
        BufferedReader br = null;
        try {
            String sCurLine;
            br = new BufferedReader(new FileReader("todo.json"));
            while ((sCurLine = br.readLine()) != null) {
                json += sCurLine;
            }
        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();  
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

//        TodoList tdList= new Gson().fromJson(json, TodoList.class);
//        for(Todo st: tdList.getTodoList()){
//            System.out.println(st);
//        }

    }
}
class TodoList{
    private List<Todo> todoList;

    public List<Todo> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<Todo> todoList) {
        this.todoList = todoList;
    }
}
