package controller;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;

public class Main{
	public static void main(String[] args) throws Exception
	{
		City city = null;
		@SuppressWarnings("unused")
		CityDAO cityDao = null;
		Team team = null;
		@SuppressWarnings("unused")
		TeamDAO teamDao = null;
		cityDao =new CityDAO();
		TeamDAO teamdao=new TeamDAO();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter city name"); 
		String cityName=br.readLine();
		
		System.out.println("Enter city id");
		long city_id=Integer.parseInt(br.readLine());
		
		
		System.out.println("Enter team id");
		long team_id=Integer.parseInt(br.readLine());
		
		System.out.println("Enter team name");
		String name=br.readLine();
		
		System.out.println("Enter coach name");
		String coachName=br.readLine();
		
		city=new City();
		city.setCityID(city_id);
		city.setCityName(cityName);
		
		 team = new Team(team_id, name, coachName,city); 
		 teamdao.createTeam(team);
	
	}
}