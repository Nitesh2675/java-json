package com.bridgelabz;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;



public class JsonToXML {
    public static void main(String[] args) throws IOException {
        XmlMapper xmlmapper=new XmlMapper();
        ObjectMapper mapper=new ObjectMapper();
        JsonNode node=mapper.readTree(new File("data.json"));
        String xml=xmlmapper.writeValueAsString(node);
        System.out.println(xml);
    }
}
