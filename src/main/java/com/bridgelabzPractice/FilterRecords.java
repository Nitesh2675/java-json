package com.bridgelabzPractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class FilterRecords {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper=new ObjectMapper();

        JsonNode root=mapper.readTree(new File("data.json"));
        for(JsonNode a:root){
            if(a.get("age").asInt()>25){
                System.out.println(a);
            }
        }

    }
}
