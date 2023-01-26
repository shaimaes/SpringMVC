package fr.formation.inti.model;

/* PREMIERE PARTIE OU ON A FAIT L INTERNATIONALISATION
 * ET LES ANNOTATIONS
 * */

public class Employee {

	private int id;
	private String name;
	private String role;
	private String Gender;
	private String[] Food;  
	
	
	public String[] getFood() {
		return Food;
	}
	public void setFood(String[] food) {
		Food = food;
	}
	
	
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}



