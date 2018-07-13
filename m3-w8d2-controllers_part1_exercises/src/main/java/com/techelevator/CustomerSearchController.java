package com.techelevator;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.model.Actor;
import com.techelevator.dao.model.Customer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;
    
    @RequestMapping("/searchCustomer")	//the url when searching
    public String showSearchCustomerForum() {
    	return "customerList";
    }
    
    @RequestMapping("/requestCustomer")
    public String searchCustomers(HttpServletRequest request) {
    	String customerName= request.getParameter("name");
    		System.out.println(customerName);
    	String orderBy = request.getParameter("dropDown");
    		System.out.println(orderBy);
   	List<Customer> customerList= customerDao.searchAndSortCustomers(customerName, orderBy);
   	request.setAttribute("customer", customerList);
    	return "customerList";
    }

}