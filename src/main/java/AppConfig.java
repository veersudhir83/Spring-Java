import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.sudheer.pluralsight.repository.CustomerRepository;
import io.sudheer.pluralsight.repository.HibernateCustomerRepositoryImpl;
import io.sudheer.pluralsight.service.CustomerService;
import io.sudheer.pluralsight.service.CustomerServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service = new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());
		return service;
	}

	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
}