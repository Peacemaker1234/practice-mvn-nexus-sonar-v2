package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		String name = "vamsi";

		System.out.println(name);

		Integer age = "20";
		System.out.println(age + 5);

	}

}


// package com.example.demo;

// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest


// class DemoApplicationTests {

	// @Before
    // public void setup() {
    //     app = new Application();
    // }
    
    
    // @Test
    // public void testWordCountString() {
    //     int count = app.countWords("this is a test");
    //     assertTrue(count == 4);
    // }

    // @Test
    // public void testWordCountEmpty() {
    //     int count = app.countWords("");
    //     assertTrue(count == 0);
    // }

    // @Test
    // public void testWordCountNull() {
    //     int count = app.countWords(null);
    //     assertTrue(count == 0);
    // }

    // @Test
    // @Ignore
    // public void testWordCountMore() {
    //     int count = app.countWords("this will be skipped");
    //     assertTrue(count == 3);
    // }

    // @Test
    // public void testWordCountSingle() {
    //     int count = app.countWords("test");
    //     assertTrue(count == 1);
    // }

// 	@Test
// 	void contextLoads() {
// 	}

// }
