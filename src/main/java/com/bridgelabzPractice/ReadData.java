package com.bridgelabzPractice;

import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadData {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper=new ObjectMapper();
        TreeNode root=mapper.readTree(new File("data.json"));
        String name=root.get("name").toString();
        TreeNode age= root.get("age");
        System.out.println("Name: " + name + ", age " + age);

    }
}
