package smart.city.service;

import java.util.Collections;
import java.util.List;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Plan;
import com.stripe.model.PlanCollection;
import com.stripe.model.Product;
import com.stripe.model.ProductCollection;

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
		}
		catch (StripeException e) {
			// TODO: Add correct handling errors
			return Collections.emptyList();
		}
	}
	
	public static List<Product> getStripeProducts(){
		try {
			ProductCollection products = Product.list(Collections.emptyMap());
			return products.getData();
		}
		catch (StripeException e) {
			// TODO: Add correct handling errors
			return Collections.emptyList();
		}
	}
}
