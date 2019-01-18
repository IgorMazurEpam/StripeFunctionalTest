package smart.city.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.CustomerCollection;
import com.stripe.model.CustomerSubscriptionCollection;
import com.stripe.model.Plan;
import com.stripe.model.PlanCollection;
import com.stripe.model.Product;
import com.stripe.model.ProductCollection;
import com.stripe.model.Subscription;

public class StripeUtils {

	private StripeUtils() {
		// It's utils class
	}

	static {
		Stripe.apiKey = "sk_test_YtLEdaJJb3thkexYwdgcYDcp";
	}

	public static List<Plan> getStripePlans() {
		try {
			PlanCollection plans = Plan.list(Collections.emptyMap());
			return plans.getData();
		} catch (StripeException e) {
			// TODO: Add correct handling errors
			return Collections.emptyList();
		}
	}

	public static List<Product> getStripeProducts() {
		try {
			ProductCollection products = Product.list(Collections.emptyMap());
			return products.getData();
		} catch (StripeException e) {
			// TODO: Add correct handling errors
			return Collections.emptyList();
		}
	}

	public static boolean createStripeCustomer(String token) { // https://stripe.com/docs/saving-cards
		try {
			Map<String, Object> customerParams = new HashMap<>();
			customerParams.put("source", token);
			Customer.create(customerParams);
			return true;
		} catch (StripeException e) {
			// TODO: Add correct handling errors
			return false;
		}
	}
	
	public static List<Customer> getStripeCustomers() {
		try {
			CustomerCollection products = Customer.list(Collections.emptyMap());
			Map<String, Object> cardParams = new HashMap<String, Object>();
			//cardParams.put("object", "card");
			for(Customer customer : products.getData()) {
				CustomerSubscriptionCollection subscriptions = customer.getSubscriptions();
				for(Subscription subscription : subscriptions.getData()) {
					
				}
			}				
			return products.getData();
		} catch (StripeException e) {
			// TODO: Add correct handling errors
			return Collections.emptyList();
		}
	}
}
