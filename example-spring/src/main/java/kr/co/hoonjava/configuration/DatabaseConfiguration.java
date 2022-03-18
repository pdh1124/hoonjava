package kr.co.hoonjava.configuration;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

public class DatabaseConfiguration {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource") //해당 여기에 사용할 프로퍼티를 prefix ="경로"에 사용하겠다.
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
}
