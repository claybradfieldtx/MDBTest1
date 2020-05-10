package test1;

import org.bson.types.ObjectId;

public class Info {
	
	ObjectId id;
	String name;
	String city;
	String state;
	boolean enrolled;
	public ObjectId getId() {
		return id;
	}
	public void setId(final ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(final String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(final String state) {
		this.state = state;
	}
	public boolean isEnrolled() {
		return enrolled;
	}
	public void setEnrolled(final boolean enrolled) {
		this.enrolled = enrolled;
	}
	
	
	

}
