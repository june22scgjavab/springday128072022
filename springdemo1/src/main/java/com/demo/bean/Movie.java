package com.demo.bean;

public class Movie {
private int id;
private String name;
private String leadActor;

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

public String getLeadActor() {
	return leadActor;
}

public void setLeadActor(String leadActor) {
	this.leadActor = leadActor;
}

public Movie() {
	super();
	// TODO Auto-generated constructor stub
}

public Movie(int id, String name, String leadActor) {
	super();
	this.id = id;
	this.name = name;
	this.leadActor = leadActor;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((leadActor == null) ? 0 : leadActor.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Movie other = (Movie) obj;
	if (id != other.id)
		return false;
	if (leadActor == null) {
		if (other.leadActor != null)
			return false;
	} else if (!leadActor.equals(other.leadActor))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

@Override
public String toString() {
	return "Movie [id=" + id + ", name=" + name + ", leadActor=" + leadActor + "]";
}

}
