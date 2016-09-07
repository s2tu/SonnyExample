package com.training.domains;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.stereotype.Component;

@Component("food")
public class Food {
	
	@NotNull
	@Pattern(regexp="[0-9]{3}")
	@Value("1")
	private Long foodCode;
	
	@NotEmpty(message= "description must not be blank")
	@Value("Test")
	private String description;
	@Value("2132")
	private double unitPrice;
	
	private String cuisine;
	
	/**
	 * @return the cuisine
	 */
	public String getCuisine() {
		return cuisine;
	}
	/**
	 * @param cuisine the cuisine to set
	 */
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	/**
	 * @return the foodCode
	 */
	public long getFoodCode() {
		return foodCode;
	}
	/**
	 * @param foodCode the foodCode to set
	 */
	public void setFoodCode(long foodCode) {
		this.foodCode = foodCode;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}
	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	/**
	 * @param foodCode
	 * @param description
	 * @param unitPrice
	 */
	public Food(long foodCode, String description, double unitPrice) {
		super();
		this.foodCode = foodCode;
		this.description = description;
		this.unitPrice = unitPrice;
	}
	/**
	 * 
	 */
	public Food() {
		super();
	}
	
	public String toString(){
		return 		"Food Code: " + this.foodCode + " Description:"  + this.description + " Unit Price:" +this.unitPrice + " Cuisine:" + this.cuisine ;
	}
	
}
