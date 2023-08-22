package com.demo.day3.components;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ex1 {
@Value("1")
public int id;
@Value("lalith")
public String name;
@Value("19")
public int age;
@Value("20000")
public long salary;
@RequestMapping("/map")
public String day() {
	return id+"-"+name+"-"+age+"-"+salary;
}
}