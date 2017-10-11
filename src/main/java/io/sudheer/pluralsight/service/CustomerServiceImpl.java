package io.sudheer.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import io.sudheer.pluralsight.model.Customer;
import io.sudheer.pluralsight.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	
	private CustomerRepository customerRepository;
	
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("CustomerService: We are using Constructor Injection");
		this.customerRepository = customerRepository;
	}
	
	public CustomerServiceImpl() {
		
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("CustomerService: We are using Setter Injection");
		this.customerRepository = customerRepository;
	}

}
