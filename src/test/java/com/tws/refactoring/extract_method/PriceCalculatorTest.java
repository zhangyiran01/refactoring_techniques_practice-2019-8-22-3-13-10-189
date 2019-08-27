package com.tws.refactoring.extract_method;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tws.refactoring.extract_variable.PriceCalculator;

public class PriceCalculatorTest {
	@Test
	public void should_return_correct_result_given_quantity_greater_than_500() {
		PriceCalculator priceCalculator =new PriceCalculator();
		double result = priceCalculator.getPrice(600,10);
		assertEquals(6050, result,0);
	}
	
	@Test
	public void should_return_correct_result_given_quantity_less_than_500() {
		PriceCalculator priceCalculator =new PriceCalculator();
		double result = priceCalculator.getPrice(400,10);
		assertEquals(4100, result,0);
	}
	
}
