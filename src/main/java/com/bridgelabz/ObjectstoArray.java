package com.bridgelabz;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ObjectstoArray {
    public static void main(String[] args) {
        ObjectMapper mapper=new ObjectMapper();
        Student stu1=new Student("Praveen",22);
        Student stu2=new Student("Dhruv",20);
        ArrayNode node=mapper.createArrayNode();
        node.add(mapper.valueToTree(stu1));
        node.add(mapper.valueToTree(stu2));

        System.out.println(node);

    }
}
