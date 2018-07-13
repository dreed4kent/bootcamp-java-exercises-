package com.techelevator.dao;

import com.techelevator.dao.model.Actor;
import com.techelevator.dao.model.Customer;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

/**
 * JDBCCustomerDao
 */
@Component
public class JDBCCustomerDao implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCCustomerDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public List<Customer> searchAndSortCustomers(String search, String sort) {
		List<Customer> matchingCustomers = new ArrayList<>();
        String customerSearchSql = "SELECT * FROM customer WHERE last_name ILIKE ? order by " + sort;
        
        
        SqlRowSet results = jdbcTemplate.queryForRowSet(customerSearchSql, "%" + search + "%");
        while(results.next()) {
            matchingCustomers.add(mapRowToCustomer(results));
        }
        return matchingCustomers;
	}
	
	private Customer mapRowToCustomer(SqlRowSet results) {
		Customer customer = new Customer();
		customer.setFirstName(results.getString("first_name"));
		customer.setLastName(results.getString("last_name"));
		customer.setEmail(results.getString("email"));
		customer.setActive(results.getBoolean("active"));
		
		return customer;
	}

    
}