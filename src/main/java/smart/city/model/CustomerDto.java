package smart.city.model;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CustomerDto {
	
	private String id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy hh:mm:ss")
	private LocalDateTime created;
	
	private String cardId;
	
	private List<String> subscriptions;
	
	public String getId() {
		return id;
	}
	
	public CustomerDto setId(String id) {
		this.id = id;
		return this;
	}
	
	public List<String> getSubscriptions() {
		return subscriptions;
	}

	public CustomerDto setSubscriptions(List<String> subscriptions) {
		this.subscriptions = subscriptions;
		return this;
	}

	public LocalDateTime getCreated() {
		return created;
	}
	
	public CustomerDto setCreated(LocalDateTime created) {
		this.created = created;
		return this;
	}
	
	public String getCardId() {
		return cardId;
	}
	
	public CustomerDto setCardId(String cardId) {
		this.cardId = cardId;
		return this;
	}	
}
