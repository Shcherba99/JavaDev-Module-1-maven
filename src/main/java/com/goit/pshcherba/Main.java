package com.goit.pshcherba;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Person person = new Person("Pavlo", "Shcherba");
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String jsonPerson = mapper.writeValueAsString(person);
        System.out.println(jsonPerson);
    }
}
