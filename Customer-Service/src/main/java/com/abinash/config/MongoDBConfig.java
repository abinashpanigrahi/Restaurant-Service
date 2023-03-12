package com.abinash.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.abinash")
public class MongoDBConfig extends AbstractMongoClientConfiguration{
	
	@Autowired
	private MongoProperties mongoProperties;
	
	@Override
	protected String getDatabaseName() {
		return mongoProperties.getMongoClientDatabase();
	}
	
	MongoTransactionManager mongoTransactionManager() {
		return new MongoTransactionManager();
	}

}
