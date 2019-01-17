package smart.city.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PlanDto {

	private String id;
	private Double amount;
	private String currency;
	private String interval;
	private Long intervalCount;
	private Long freePeriod;
	
	// Getters & Setters
	public String getId() {
		return id;
	}
	
	public PlanDto setId(String id) {
		this.id = id;
		return this;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public PlanDto setAmount(Double amount) {
		this.amount = amount;
		return this;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public PlanDto setCurrency(String currency) {
		this.currency = currency;
		return this;
	}
	
	public String getInterval() {
		return interval;
	}
	
	public PlanDto setInterval(String interval) {
		this.interval = interval;
		return this;
	}
	
	public Long getIntervalCount() {
		return intervalCount;
	}
	
	public PlanDto setIntervalCount(Long intervalCount) {
		this.intervalCount = intervalCount;
		return this;
	}
	
	public Long getFreePeriod() {
		return freePeriod;
	}
	
	public PlanDto setFreePeriod(Long freePeriod) {
		this.freePeriod = freePeriod;
		return this;
	}	
}
