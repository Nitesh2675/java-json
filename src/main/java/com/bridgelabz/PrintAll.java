package com.bridgelabz;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class PrintAll {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        JsonNode root=mapper.readTree(new File("data.json"));
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root));
    }
}
