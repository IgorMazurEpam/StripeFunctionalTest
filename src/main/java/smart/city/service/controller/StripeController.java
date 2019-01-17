package smart.city.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import smart.city.service.StripeService;
import smart.city.service.model.ProductDto;

@RestController
public class StripeController {

	@Autowired
    private StripeService stripeService;
	
	/**
     * Get subscription products from customer's dashboard
     * @return  products.
     */
    @GetMapping("/products")
    public List<ProductDto> getClaimedCredits() {
        return stripeService.getProducts();
    }
}
