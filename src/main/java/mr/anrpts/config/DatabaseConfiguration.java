package mr.anrpts.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
// @EnableJpaAuditing(auditorAwareRef = "springSecurityAuditorAware")
@EnableTransactionManagement
@EnableJpaRepositories(
 entityManagerFactoryRef = "shippingEntityManagerFactory",
 transactionManagerRef = "shippingTransactionManager",
 basePackages = {
  "mr.anrpts.shipping.dao"
 }
)
public class DatabaseConfiguration {

    // private final Logger log = LoggerFactory.getLogger(DatabaseConfiguration.class);
    @Primary
    @Bean(name = "shippingDataSource")
    @ConfigurationProperties(prefix = "shipping.datasource")
    public DataSource shippingDataSource() {
     return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "shippingEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean
    entityManagerFactory(
     EntityManagerFactoryBuilder builder,
     @Qualifier("shippingDataSource") DataSource dataSource
    ) {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        LocalContainerEntityManagerFactoryBean bean = builder
      .dataSource(dataSource)
      .packages("mr.anrpts.shipping.entity")
      .persistenceUnit("shipping")
      .build();
      bean.setJpaProperties(properties);
      return bean;
    }

    @Primary
    @Bean(name = "shippingTransactionManager")
    public PlatformTransactionManager shippingTransactionManager(
     @Qualifier("shippingEntityManagerFactory") EntityManagerFactory shippingEntityManagerFactory
    ) {
     return new JpaTransactionManager(shippingEntityManagerFactory);
    }
}
