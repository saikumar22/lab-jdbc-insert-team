package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;

public class Main{
	public static void main(String args[]) throws Exception {
		
		CityDAO citydao = new CityDAO();
		TeamDAO teamdao = new TeamDAO();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter city name");
		String cityName=br.readLine();
		
		System.out.println("Enter city id");
		int id=Integer.parseInt(br.readLine());
		
		City city=new City(id ,cityName);
		
		System.out.println("Enter Your Id");
		int id1 = Integer.parseInt(br.readLine());

		System.out.println("Enter the name");
		String name=br.readLine();
		
		System.out.println("Enter coach name");
		String coach = br.readLine();
		
		System.out.println("Enter home_city");
		int home_city = Integer.parseInt(br.readLine());
		
		System.out.println("Enter captain name");
		int captain = Integer.parseInt(br.readLine());
		
		Team team = new Team(id1 , name, coach, home_city , captain);
		
		citydao.createCity(city);
		teamdao.createTeam(team);			
	}
}