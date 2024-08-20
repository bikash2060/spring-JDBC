package org.springJDBC.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@ComponentScan(basePackages = "org.springJDBC.dao") // Scans the specified package for Spring components (e.g., DAOs) to be managed by the Spring container.
@Configuration // Indicates that this class contains Spring configuration.
public class SpringJDBCConfig {

    @Bean
    public DataSource getDataSource() {
        // Creates and configures a DataSource bean to connect to the database.
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); // Sets the JDBC driver class name.
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc"); // Sets the URL of the database.
        dataSource.setUsername("root"); // Sets the username for database connection.
        dataSource.setPassword("Bishal@123"); // Sets the password for database connection.
        return dataSource; // Returns the configured DataSource bean.
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        // Creates and configures a JdbcTemplate bean using the DataSource bean.
        return new JdbcTemplate(dataSource); // Returns the JdbcTemplate bean, which will be used for database operations.
    }
}
