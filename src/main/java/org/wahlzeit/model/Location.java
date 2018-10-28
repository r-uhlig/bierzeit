package org.wahlzeit.model;

public class Location {
	private Coordinate coordinate;
	private String name;
	private String address;

	Location(String name, String address, Coordinate coordinate) {
		this.name = name;
		this.address = address;
		this.coordinate = coordinate;
	}

	public boolean equals(Location other) {
		if (!this.name.equals(other.name))
			return false;
		if (!this.address.equals(other.address))
			return false;
		return this.coordinate.equals(other.coordinate);
	}
}
