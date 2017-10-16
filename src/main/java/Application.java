import io.sudheer.pluralsight.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.sudheer.pluralsight.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService customerService = appCtx.getBean("customerService", CustomerService.class);
		System.out.println(customerService);

		List<Customer> customerList = new ArrayList<Customer>(customerService.findAll());
		customerList.forEach( customer ->
			System.out.println(customer.getFirstName() + " " + customer.getLastName())
		);
	}

}
