package mr.anrpts.config.ds;

import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "orderEntityManagerFactory", transactionManagerRef = "orderTransactionManager", basePackages = {
		"mr.anrpts.orders.repository" })
public class OrderConfig {

	@Bean(name = "orderDataSource")
	@ConfigurationProperties(prefix = "order.datasource")
	public DataSource orderDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "orderEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("orderDataSource") DataSource dataSource) {
		HashMap< String, Object> properties =new HashMap<>();
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		properties.put("hibernate.hbm2ddl.auto", "none");

		return builder.dataSource(dataSource).packages("mr.anrpts.orders.model").persistenceUnit("order").properties(properties).build();
	}

	@Bean(name = "orderTransactionManager")
	public PlatformTransactionManager orderTransactionManager(
			@Qualifier("orderEntityManagerFactory") EntityManagerFactory orderEntityManagerFactory) {
		return new JpaTransactionManager(orderEntityManagerFactory);
	}

}
