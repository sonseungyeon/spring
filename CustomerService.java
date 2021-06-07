package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mapper.CustomerWithOrders;

@Service
public class CustomerService {
	
	@Autowired
	CustomerWithOrders customerWithOrders;
	
	//특정 예외로 지정하여!
	@Transactional(rollbackFor=Exception.class)
	public int deleteCustomerAndOrders(int customerId) throws Exception {
		customerWithOrders.deleteCustomer(customerId);
		
//		위에 꺼가 실행이안되면 밑에꺼도 안되야 되기 때문에 억지로 
		int num=1;
		if(num==1) {
			throw new Exception();	
		}
		customerWithOrders.deleteOrdersWithCustomerId(customerId);
		return 0;
	}
}
