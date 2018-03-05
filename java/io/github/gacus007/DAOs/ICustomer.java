package io.github.gacus007.DAOs;

import io.github.gacus007.Models.Customer;

public interface ICustomer {

	public void save(Customer object);

	public void delete(Customer object);

	public void update(Customer object);

	public void read(Customer object);

}
