package com.example.demo.config;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = {"com.example.demo.repository"})
public class MongoDbConfig {

}
