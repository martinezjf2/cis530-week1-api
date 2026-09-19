package week1._api.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "api/hello", produces =MediaType.TEXT_PLAIN_VALUE)
    public String sayHello() {
        return "Welcome to CIS 530 - Week 1 REST API!";
    }


    @GetMapping(path="api/info", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> getCourseInfo() {
        Map<String, Object> courseInfo = new LinkedHashMap<>();

        courseInfo.put("course", "CIS-530");
        courseInfo.put("week", 1);
        courseInfo.put("technology", "Spring Boot 4");

        courseInfo.put("instructor", "Prof. Richard Krasso");
        courseInfo.put("university", "Bellevue University");



        return courseInfo;
    }
}
