package com.billFactoryMethod;

class DemosticPlan extends plan{
	
	@Override
	public void getRate() {
		rate =3.50;
	}

}

class commercialPlan extends plan{
	@Override
	public void getRate() {
		rate = 7.50;
		
	}
	
	
}
class UniversalPlan extends plan{	
	@Override
	public void getRate() {
		rate = 9.50;
		
	}
	
	
}
