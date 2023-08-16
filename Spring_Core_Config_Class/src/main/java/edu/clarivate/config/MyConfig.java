package edu.clarivate.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "edu.clarivate.pojo", "edu.clarivate.pojoconstructorinjection","edu.clarivate.pojosetterinjection" })
public class MyConfig {

}
