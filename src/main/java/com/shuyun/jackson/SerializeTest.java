package com.shuyun.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shuyun on 2016/8/11.
 */
public class SerializeTest {
    public static void main(String[] args) throws IOException {
        Zoo zoo = new Zoo("SH Wild Park", "ShangHai");
        Lion lion = new Lion("Samba");
        Elephant elephant = new Elephant("Manny");
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(lion);
        animals.add(elephant);
        zoo.setAnimals(animals);

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapper.writeValue(new File("zoo.json"), zoo);
    }
}
