package com.sales.repository.help;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.io.File;

public class JsonConversion {

    final static ObjectMapper objectMapper = new ObjectMapper();

    private <T> T transformToObjList(String jsonContent, Class<?> contentClass) throws JsonProcessingException {
        return (T) Arrays.asList(objectMapper.readValue(jsonContent, contentClass);
    }
    private <T> T transformToObj(String jsonContent, Class<?> contentClass) throws JsonProcessingException {
        return (T) objectMapper.readValue(jsonContent, contentClass);
    }

    public static <T> T convertJsonToPOJO(String filePath, Class<?> target) throws JsonParseException, JsonMappingException, IOException, ClassNotFoundException {
        return objectMapper.readValue(new File(filePath), objectMapper .getTypeFactory().constructCollectionType(List.class, Class.forName(target.getName())));
    }
}
