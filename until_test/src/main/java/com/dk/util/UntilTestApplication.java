package com.dk.util;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class UntilTestApplication {

    public static void main(String[] args) throws InterruptedException{
        SpringApplication springApplication = new SpringApplication(UntilTestApplication.class);
        // 设置自定义 Banner
        springApplication.setBanner(new customerBanner());
        // 启动 Spring Boot
        springApplication.run(args);

//        SpringApplication.run(UntilTestApplication.class, args);
    }


}
class customerBanner implements Banner {

    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        System.out.println("\n" +
                "   / /            \\\"\\      |\"|              |\"|     / /            \\\"\\    \n" +
                "  | |      ___     | |     | |      o O O   | |    | |      ___     | |   \n" +
                "  | |     / _ \\    | |     | |     o        | |    | |     / _ \\    | |   \n" +
                "  _\\_\\_   \\___/   /_/__   _|_|_   TS__[O]  _|_|_   _\\_\\_   \\___/   /_/__  \n" +
                "_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \n" +
                "\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' ");
    }
}
