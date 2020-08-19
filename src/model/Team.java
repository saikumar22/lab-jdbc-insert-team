package model;
public class Team{
	private long ID;
	private String  name;
	private String coach;
	private City city;
	
	public long getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}

	public Team(long team_id, String name, String coach, City city) {
		super();
		this.ID=team_id;
		this.name = name;
		this.coach = coach;
		this.city=city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}

	
	
}