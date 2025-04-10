package com.bridgelabzPractice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonStudent {
    public static void main(String[] args) throws Exception{
        ObjectMapper mapper=new ObjectMapper();
        ObjectNode student=mapper.createObjectNode();
        student.put("name","Nitesh");
        student.put("age",22);

        ArrayNode subjects=mapper.createArrayNode();
        subjects.add("maths");
        subjects.add("science");
        student.set("subjects",subjects);

        String jsonString=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
        System.out.println(jsonString);
    }
}
