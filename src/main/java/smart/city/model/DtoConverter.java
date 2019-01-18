package smart.city.model;

import java.time.Instant;
import java.time.ZoneId;
import java.util.stream.Collectors;

import com.stripe.model.Customer;
import com.stripe.model.Plan;
import com.stripe.model.Product;

public class DtoConverter {

	private DtoConverter() {
		// It's utils class
	}
	
	public static ProductDto convert (Product source) {
		return new ProductDto()		
			.setId(source.getId())
			.setName(source.getName()) 
			.setActive(source.getActive())		
	        .setCreated(Instant.ofEpochSecond(source.getCreated()).atZone(ZoneId.systemDefault()).toLocalDateTime()) 
			.setRusName(source.getMetadata().getOrDefault("RUS_NAME", "")) 
			.setBlrName(source.getMetadata().getOrDefault("BLR_NAME", "")) 
			.setFraName(source.getMetadata().getOrDefault("FRA_NAME", "")) 
			.setTrkName(source.getMetadata().getOrDefault("TRK_NAME", "")) 	
		    .setMetadata(source.getMetadata());				
	}
	
	public static PlanDto convert (Plan source) {
		return new PlanDto()		
			.setId(source.getId()) 
			.setAmount(source.getAmount()/100.) 
			.setCurrency(source.getCurrency()) 
			.setInterval(source.getInterval()) 
			.setIntervalCount(source.getIntervalCount()) 
			// TODO: replace deprecated method
			.setFreePeriod(source.getTrialPeriodDays());		
	}
	
	public static CustomerDto convert(Customer source) {
		return new CustomerDto()
				.setId(source.getId())
				.setCreated(Instant.ofEpochSecond(source.getCreated()).atZone(ZoneId.systemDefault()).toLocalDateTime()) 
				.setCardId(source.getDefaultSource())
				.setSubscriptions(source.getSubscriptions().getData().stream().map(s -> s.getId()).collect(Collectors.toList()));
	}
}
