package com.xworkz.assosiation.boot;

import com.xworkz.assosiation.things.Area;
import com.xworkz.assosiation.things.City;
import com.xworkz.assosiation.things.Company;
import com.xworkz.assosiation.things.Country;
import com.xworkz.assosiation.things.State;

public class MallRunner {

	public static void main(String[] args) {
		
		Area area = new Area();
		area.setName("jayanagar");
		area.setPopulation("2.2 Lakh");
		area.setStreet("Viayak nagar");
		
		City city = new City();
		city.setName("Mudhol");
		city.setDistrict("Bagalkot");
		city.setState("Karnataka");
       city.setArea(area); 
//        city.display();
	   
	    State state = new State();
	    state.setName("Karnata");
	    state.setcmName("B S Bommai");
	    state.setLang("Kannada");
        state.setCity(city);
//	    state.display();
	    
	    Country country = new Country();
	    country.setName("India");
	    country.setPresident("Narendr Modi");
	    country.setDeveloped(false);
	    country.setState(state);
//	    country.display();
	    
	    Company company =new Company();
	    company.setName("TCS");
	    company.setceoNmae("Rthan Tata");
	    company.setSince(1986);
	    company.setCountry(country);
	    company.display();
	}
}
