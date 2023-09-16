package org.example.Human;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class HumanJson {
    public static void main(String[] args) {
        Human human = new Human("Teodor", "Poshyvak");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println(gson.toJson(human));
    }

}
