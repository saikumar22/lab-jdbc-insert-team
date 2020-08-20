package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.City;
import utility.ConnectionManager;

public class CityDAO{
	public City getCityByName(String name) throws Exception {
        String sql = "SELECT * FROM CITY";
		
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		ResultSet result = st.executeQuery();
		
		while(result.next()) {
			String checkName = result.getString("name");
			if(name.equals(checkName))
				System.out.println("Equal");
		}
		return null;
		
	}
	public void createCity(City city) throws Exception {
		String sql = "INSERT INTO CITY VALUES (?,?)";
		
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		
		st.setInt(1, city.getCityid());
		st.setString(2, city.getCityname());
		
		int x = st.executeUpdate();
		
		System.out.println(x);

	}

}