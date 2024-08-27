package com.sales.repository.helper;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sales.domain.entity.Product;
import org.springframework.beans.BeanUtils;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonConversion {

    final ObjectMapper objectMapper = new ObjectMapper();

    public <T> T convertJsonToPOJO(String filePath, Class<?> target) throws JsonParseException, JsonMappingException, IOException, ClassNotFoundException {
        return objectMapper.readValue(extractJsonFromUrl(new URL(filePath)), objectMapper .getTypeFactory().constructCollectionType(List.class, Class.forName(target.getName())));
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

    public <T> T parseArrays(List<?> sourceList, Class<?> targetClass) throws InstantiationException, IllegalAccessException {
        List<T> targetList = new ArrayList<>();
        for (Object source: sourceList) {
            T target= (T) targetClass.newInstance();
            BeanUtils.copyProperties(source , target);
            targetList.add(target);
        }
        return (T) targetList;
    }
}
