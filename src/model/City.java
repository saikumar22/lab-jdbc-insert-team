package model;

public class City {
	private long cityID;
	private String cityName;
	
	
	public City(int id, String cityName) {
		this.cityID=id;
		this.cityName=cityName;
	}
	public City() {
		// TODO Auto-generated constructor stub
	}


	public long getCityID() {
		return cityID;
	}
	public void setCityID(long city_id) {
		this.cityID = city_id;
	}


	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}	
}