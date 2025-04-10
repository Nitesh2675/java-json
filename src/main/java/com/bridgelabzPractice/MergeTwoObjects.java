package com.bridgelabzPractice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

class Students{
    public String name;
    public int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

}


public class MergeTwoObjects {
    public static void main(String[] args) throws  Exception{
        Students student1=new Students("Nitesh",19);
        Students student2=new Students("Dhruv",20);
        ObjectMapper mapper=new ObjectMapper();
        ObjectNode combined = mapper.createObjectNode();
        combined.set("student1", mapper.valueToTree(student1));
        combined.set("student2", mapper.valueToTree(student2));

        String mergedJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(combined);
        System.out.println(mergedJson);

        ObjectNode obj1 = mapper.createObjectNode();
        obj1.put("name", "Nitesh");
        obj1.put("age", 21);

        // Second JSON object
        ObjectNode obj2 = mapper.createObjectNode();
        obj2.put("email", "nitesh@example.com");
        obj2.put("city", "Pune");

        // Merge obj2 into obj1
        obj1.setAll(obj2);  // Adds all fields from obj2 into obj1

        // Print merged JSON
        String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1);
        System.out.println(result);

    }
}
