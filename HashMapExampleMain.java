package collection_framework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExampleMain {

	public static void main(String[] args) {
			Map<String, country> countryMap = new HashMap<>();
			country ind = new country();
			country ud= new country("usa","wishigton");
			country jpn = new country("japn","tokoy");
			country ger= new country("germny","berlin");
			country far= new country("france","parise");
			countryMap.put("IND", ind);
			countryMap.put("UD",  ud);
			countryMap.put("GRE", ger);
			countryMap.put("JPN", jpn);
			countryMap.put("fAR", far);

			Set<String> allkeys= countryMap.keySet();
			for(String currentkey:allkeys) {
				country	currentValue = countryMap.get(currentkey) ;
				System.out.println("key"+currentkey);
				System.out.println("Value"+currentValue);
				System.out.println("=-=-=-=-=-==-=-==-=-=-==-=-=-=-=-=-=-=-=-=");
				}
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
			Set<Map.Entry<String, country>> setOfEntries=
			countryMap.entrySet();
			for(Map.Entry<String, country> currentEntry: setOfEntries) {
				String currentkey=currentEntry.getKey();
				country	currentValue= currentEntry.getValue();
				System.out.println("key"+currentkey);
				System.out.println("Value"+currentValue);
				System.out.println("=-=-=-=-=-==-=-==-=-=-==-=-=-=-=-=-=-=-=-=");
			}
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
			 Collection<country> allcountries= countryMap.values();
			 for(country currenycountry:allcountries)
				 System.out.println(currenycountry);
			}
	
	}
				
			
			


	
