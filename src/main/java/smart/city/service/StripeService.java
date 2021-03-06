package smart.city.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.stripe.model.Customer;
import com.stripe.model.Plan;
import com.stripe.model.Product;

import smart.city.model.CardTokenDto;
import smart.city.model.CustomerDto;
import smart.city.model.DtoConverter;
import smart.city.model.ProductDto;

// pk_test_LUutNwyKS2029eQWIXGJgqzs

@Service
public class StripeService {

	public List<ProductDto> getProducts(){
		// Get subscription products
		final List<Product> products = StripeUtils.getStripeProducts();
		// Get pricing plans
		final List<Plan> plans = StripeUtils.getStripePlans();
		//
		return products.stream().map(DtoConverter::convert)
				.peek(pd -> pd.setPlans(plans.stream().filter(pl -> pd.getId().equals(pl.getProduct())).map(DtoConverter::convert).collect(Collectors.toList())))
				.collect(Collectors.toList());		
	}
	
	public boolean createCustomer(CardTokenDto cardToken) {
		return StripeUtils.createStripeCustomer(cardToken.getId());
	}
	
	public List<CustomerDto> getCustomers(){
		final List<Customer> customers = StripeUtils.getStripeCustomers();
		return customers.stream().map(DtoConverter::convert).collect(Collectors.toList());	
	}

}
