package com.example.payroll;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import java.io.InputStream;
import java.util.List;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        return args -> {
            ClassPathResource resource = new ClassPathResource("MOCK_DATA.json");
            ObjectMapper objectMapper = new ObjectMapper();
            try (InputStream inputStream = resource.getInputStream()) {
                List<Employee> employees = objectMapper.readValue(inputStream, new TypeReference<List<Employee>>() {
                });
                repository.saveAll(employees);
                log.info("Preloaded " + employees.size() + " employees.");
            } catch (Exception e) {
                log.error("Error preloading data: " + e.getMessage());
            }

        };
    }
}
