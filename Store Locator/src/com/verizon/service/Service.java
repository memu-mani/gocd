package com.verizon.service;

import com.verizon.model.Stores;
import com.verizon.test.DataBase;

import java.util.*;

public class Service 
{

		public String distanceCalculator(double latsrc, double longsrc) throws java.lang.Exception
		{
			DataBase db=new DataBase();
			List<Stores> storesList = db.getLs();
			double minDistance=80000;
			String storeToSend="";
			for (Stores store : storesList) {
				double temp = distance(latsrc, longsrc, store.getLatitude(), store.getLongitude(), "K") ;
				if(temp < minDistance){
					minDistance = temp;
					storeToSend = store.getAddress()+", "+store.getCity()+", "+store.getState();
				}
			}
			return storeToSend;
			
		}

		   public double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
			double theta = lon1 - lon2;
			double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
			dist = Math.acos(dist);
			dist = rad2deg(dist);
			dist = dist * 60 * 1.1515;
			if (unit == "K") {
				dist = dist * 1.609344;
			} else if (unit == "N") {
				dist = dist * 0.8684;
			}

			return (dist);
		}
		

		   private static double deg2rad(double deg) {
				return (deg * Math.PI / 180.0);
			}
		   private static double rad2deg(double rad) {
				return (rad * 180 / Math.PI);
			}

		
		
	

}
