package org.wahlzeit.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CoordinateTest {
	private Coordinate c1;
	private Coordinate c2;
	private Coordinate c3;
	private Coordinate c4;
	private Location l1;
	private Location l2;
	private Location l3;
	private Location l4;

	@Before
	public void initCoordinate() {
		c1 = new Coordinate(57.37114, -2.05796);
		c2 = new Coordinate(57.37114, -2.05796, 26.75);
		c3 = new Coordinate(57.3711, -2.058);

		c4 = new Coordinate(49.89169, 10.88097,257.25);
	}

	@Test
	public void compareCoordinates(){
		assertTrue(c1.isEqual(c2));
		assertTrue(c1.isEqual(c3));
		assertTrue(Math.abs(c1.getDistance(c2)) < 0.001);
	}

	@Before
	public void initLocation() {
		l1 = new Location("BrewDog", "Balmacassie Way, Waterton, Aberdeenshire, Schottland, AB41 8BX, Vereinigtes Königreich", c1);
		l2 = new Location("BrewDog", "Balmacassie Way, Waterton, Aberdeenshire, Schottland, AB41 8BX, Vereinigtes Königreich", c1);
		l3 = new Location("BrewDog", "Balmacassie Way, Waterton, Aberdeenshire, Schottland, AB41 8BX, Vereinigtes Königreich", c2);

		l4 = new Location("Schlenkerla", "Rauchbierbrauerei Schlenkerla, Dominikanerstraße 6, 96049 Bamberg, Deutschland", c4);
	}

	@Test
	public void compareLocations() {
		assertTrue(l1.equals(l2));
		assertTrue(l2.equals(l3));

		assertFalse(l1.equals(l4));
	}
}
