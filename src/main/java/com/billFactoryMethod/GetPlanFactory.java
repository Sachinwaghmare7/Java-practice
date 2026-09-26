package com.billFactoryMethod;

public class GetPlanFactory {
	
	public plan getPlan(String planType) {
		if(planType == null) {
		   return null;
		}	
		if(planType.equalsIgnoreCase("DOMESTIC")){
			return new DemosticPlan();
		}
		else if(planType.equalsIgnoreCase("COMMERCIAL")) {
				return new commercialPlan();
				
		}
		else if(planType.equalsIgnoreCase("INDUSTRIAL")) {
			return new  UniversalPlan();
			
	}
		return null;
	} 

}
