package smart.city.service.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ProductDto {

	private String id;
	
	private String name;
	
	private String rusName;
	
	private String blrName;
	
	private String fraName;
	
	private String trkName;
	
	private boolean isActive;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy hh:mm:ss")
	private LocalDateTime created;
	
	private List<PlanDto> plans;
	
	private Map<String, String> metadata;
	
	// Getters & Setters
	public String getId() {
		return id;
	}
	
	public ProductDto setId(String id) {
		this.id = id;
		return this;
	}
	
	public String getName() {
		return name;
	}
	
	public ProductDto setName(String name) {
		this.name = name;
		return this;
	}
	
	public String getRusName() {
		return rusName;
	}
	
	public ProductDto setRusName(String rusName) {
		this.rusName = rusName;
		return this;
	}
	
	public String getBlrName() {
		return blrName;
	}
	
	public ProductDto setBlrName(String blrName) {
		this.blrName = blrName;
		return this;
	}
	
	public String getFraName() {
		return fraName;
	}
	
	public ProductDto setFraName(String fraName) {
		this.fraName = fraName;
		return this;
	}
	
	public String getTrkName() {
		return trkName;
	}
	
	public ProductDto setTrkName(String trkName) {
		this.trkName = trkName;
		return this;
	}
	
	public boolean isActive() {
		return isActive;
	}
	
	public ProductDto setActive(boolean isActive) {
		this.isActive = isActive;
		return this;
	}
	
	public LocalDateTime getCreated() {
		return created;
	}
	
	public ProductDto setCreated(LocalDateTime created) {
		this.created = created;
		return this;
	}
	
	public List<PlanDto> getPlans() {
		return plans;
	}
	
	public ProductDto setPlans(List<PlanDto> plans) {
		this.plans = plans;
		return this;
	}
	
	public Map<String, String> getMetadata() {
		return metadata;
	}
	
	public ProductDto setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
		return this;
	}	
}
