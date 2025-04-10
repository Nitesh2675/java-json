package com.bridgelabzPractice;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.ArrayList;
import java.util.List;

class Stu{
    public String name;
    public int age;

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class ConvertListIntoObjects {
    public static void main(String[] args) throws JsonProcessingException {
        List<Stu> list=new ArrayList<>();
        list.add(new Stu("nitesh",20));
        list.add(new Stu("dhruv",7890));
        ObjectMapper mapper=new ObjectMapper();
        String node=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
        System.out.println(node);
    }
}
