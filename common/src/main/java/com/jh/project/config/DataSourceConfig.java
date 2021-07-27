//package com.jh.project.config;
//
//import static com.jh.project.config.DataSourceConfig.ENTITY_MANAGER_FACTORY;
//import static com.jh.project.config.DataSourceConfig.TX_MANAGER;
//import static com.jh.project.config.DataSourceConfig.PACKAGE;
//
//import com.zaxxer.hikari.HikariDataSource;
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//import lombok.RequiredArgsConstructor;
//import org.hibernate.jpa.HibernatePersistenceProvider;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//
//@Configuration
//@RequiredArgsConstructor
//@EnableJpaRepositories(
//    basePackages = PACKAGE,
//    entityManagerFactoryRef = ENTITY_MANAGER_FACTORY,
//    transactionManagerRef = TX_MANAGER
//)
//public class DataSourceConfig {
//
//    public static final String PACKAGE = "com.jh.project";
//    public static final String ENTITY_MANAGER_FACTORY = "myEntityManagerFactory";
//    public static final String TX_MANAGER = "myTransactionManager";
//
//    private static final String DATASOURCE = "myDataSource";
//    private static final String PERSISTENCE_UNIT = "myPersistenceUnit";
//    private static final String DATASOURCE_PREFIX = "spring.datasource.hikari";
//
//    private final DataSourceProperties dataSourceProperties;
//
//    @Bean
//    @Primary
//    @ConfigurationProperties(prefix = DATASOURCE_PREFIX)
//    public DataSource myDataSource() {
//        return DataSourceBuilder.create()
//            .type(HikariDataSource.class)
//            .build();
//    }
//
//    @Bean
//    @Primary
//    public LocalContainerEntityManagerFactoryBean myEntityManagerFactory(@Qualifier(DATASOURCE) DataSource dataSource) {
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//
//        entityManagerFactoryBean.setPersistenceProvider(new HibernatePersistenceProvider());
//        entityManagerFactoryBean.setPackagesToScan(PACKAGE);
//        entityManagerFactoryBean.setDataSource(dataSource);
//        entityManagerFactoryBean.setJpaPropertyMap(dataSourceProperties.getProperties());
//        entityManagerFactoryBean.setPersistenceUnitName(PERSISTENCE_UNIT);
//
//        return entityManagerFactoryBean;
//    }
//
//    @Bean
//    @Primary
//    public PlatformTransactionManager myTransactionManager(@Qualifier(ENTITY_MANAGER_FACTORY) EntityManagerFactory entityManagerFactory) {
//        return new JpaTransactionManager(entityManagerFactory);
//    }
//}
