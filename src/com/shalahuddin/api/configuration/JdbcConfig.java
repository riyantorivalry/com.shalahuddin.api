package com.shalahuddin.api.configuration;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@ComponentScan(basePackages = "com.shalahuddin.api")
@PropertySource("classpath:/persistent.properties")
public class JdbcConfig {
	Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource dataSource() throws SQLException {
		logger.info("run : " + env.getProperty("shalahuddin.api.url"));
		PGSimpleDataSource dataSource = new PGSimpleDataSource();
		dataSource.setServerName(env.getProperty("shalahuddin.api.server"));
		dataSource.setDatabaseName(env.getProperty("shalahuddin.api.databaseName"));
		int iPortNumber = Integer.parseInt(env.getProperty("shalahuddin.api.port"));
		dataSource.setPortNumber(iPortNumber);
		dataSource.setUser(env.getProperty("shalahuddin.api.user"));
		dataSource.setPassword(env.getProperty("shalahuddin.api.password"));

		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.setResultsMapCaseInsensitive(true);
		return jdbcTemplate;
	}
	
	@Bean
	 public PlatformTransactionManager transactionManager() throws SQLException {
	      DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
	      transactionManager.setDataSource(dataSource());
	      return transactionManager;
	  }
}
