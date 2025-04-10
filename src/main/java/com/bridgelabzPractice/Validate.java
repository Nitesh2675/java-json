package com.bridgelabzPractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Validate {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(new File("data.json"));
            if (root.has("name") && root.has("age")) {
                System.out.println("valid");
            } else {
                System.out.println("missing fields");
            }

        } catch (Exception e) {
            System.out.println("invalid "+e.getMessage());
        }
    }
}
