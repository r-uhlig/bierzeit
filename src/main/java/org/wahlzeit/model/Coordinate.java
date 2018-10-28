package org.wahlzeit.model;

public class Coordinate {
	private double x;
	private double y;
	private double z;

	Coordinate(double latitude, double longitude) {
		this.x = latitude;
		this.y = longitude;
		this.z = 0;
	}

	Coordinate(double latitude, double longitude, double height) {
		this.x = latitude;
		this.y = longitude;
		this.z = height;
	}

	/**
	 * @return distance in decimal degrees (ignores height)
	 */
	public double getDistance(Coordinate other) {
		return Math.sqrt(  Math.pow(this.x - other.x, 2)
		                 + Math.pow(this.y - other.y, 2));
	}

	public boolean isEqual(Coordinate other) {
		return this.getDistance(other) < 0.001;
	}

	public boolean equals(Coordinate other) {
		return this.isEqual(other);
	}
}
