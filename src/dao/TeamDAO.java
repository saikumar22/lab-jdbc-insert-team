package dao;

import java.sql.PreparedStatement;
import java.sql.Statement;

import model.City;
import model.Team;
import utility.ConnectionManager;

@SuppressWarnings("unused")
public class TeamDAO{
	public void createTeam(Team team)throws Exception {
		System.out.println("Create team dao");
		Statement stmt = ConnectionManager.getConnection().createStatement();
		long id = team.getID();
		String name=team.getName();
		String coach=team.getCoach();
		//long home_city=team.getHome_city();
		long city=team.getCity().getCityID();
		ConnectionManager cm=new ConnectionManager();
		String sql1="INSERT INTO CITY VALUES ("+team.getCity().getCityID()+","+"'"+team.getCity().getCityName()+"'"+")";
	    int i=stmt.executeUpdate(sql1);
        
	String sql="Insert into TEAM(ID,NAME,COACH,HOME_CITY) VALUES(?,?,?,?)";
	
		PreparedStatement st=ConnectionManager.getConnection().prepareStatement(sql);
		st.setLong(1, id);
		st.setString(2, name);
		st.setString(3, coach);
		st.setLong(4, city);
		System.out.println("established");
		
		int x =st.executeUpdate();
		System.out.println(x);
		
		//ConnectionManager.getConnection().close();  
	}
} 