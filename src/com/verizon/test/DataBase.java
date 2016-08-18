package com.verizon.test;

import java.util.ArrayList;
import java.util.List;

import com.verizon.model.Stores;

public class DataBase {

	List<Stores> ls=new ArrayList<>();
	public List<Stores> getLs() {
		return ls;
	}
	public DataBase() {
		
		Stores s1= new Stores();
		Stores s2= new Stores();
		Stores s3= new Stores();
		Stores s4= new Stores();
		Stores s5= new Stores();
		
		s1.setAddress("1701 Louisville Ave");
		s1.setCity("Waco");
		s1.setCountry("US");
		s1.setLatitude(32.5173940);
		s1.setLongitude(-92.1076769);
		s1.setState("TX");
		
		s2.setAddress("4512 Oleander Dr");
		s2.setCity("Wilmington");
		s2.setCountry("US");
		s2.setLatitude(34.2095756);
		s2.setLongitude(-77.8877435);
		s2.setState("NC");
		
		s3.setAddress("4129 Raeford Rd");
		s3.setCity("Fayetteville");
		s3.setCountry("US");
		s3.setLatitude(31.5336357);
		s3.setLongitude(-78.9486916);
		s3.setState("NC");
		
	
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		
	}

}
