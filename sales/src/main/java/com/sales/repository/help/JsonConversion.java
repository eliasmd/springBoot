package com.sales.repository.help;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

public class JsonConversion {

    final ObjectMapper objectMapper = new ObjectMapper();

    private <T> T transformToObjList(String jsonContent, Class<?> contentClass) throws JsonProcessingException {
        return (T) Arrays.asList(objectMapper.readValue(jsonContent, contentClass));
    }
    private <T> T transformToObj(String jsonContent, Class<?> contentClass) throws JsonProcessingException {
        return (T) objectMapper.readValue(jsonContent, contentClass);
    }

    public <T> T convertJsonToPOJO(String filePath, Class<?> target) throws JsonParseException, JsonMappingException, IOException, ClassNotFoundException {
        return objectMapper.readValue(extractJsonFromUrl(new URL(filePath)), objectMapper .getTypeFactory().constructCollectionType(List.class, Class.forName(target.getName())));
        //return (T) objectMapper.readValue(extractJsonFromUrl(new URL(filePath)), target);
    }

    private String extractJsonFromUrl(URL url) throws IOException {
        try (InputStream input = url.openStream()) {
            InputStreamReader isr = new InputStreamReader(input);
            BufferedReader reader = new BufferedReader(isr);
            StringBuilder json = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                json.append((char) c);
            }
            return json.toString();
        }
    }
}
