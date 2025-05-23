package com.arch.catalogue.framework.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;

@Configuration
@EntityScan(basePackages = {"com.arch.library.framework.output.persistence.data"})
@EnableJdbcAuditing
public class PersistenceConfig {

}
