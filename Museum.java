package main;

import java.util.ArrayList;

import models.Art;
import models.Painting;
import models.Sculpture;

public class Museum {

	public static void main(String[] args) {
		
		ArrayList<Art> museum = new ArrayList<Art> ();

		Painting p1 = new Painting("Acrylic", "Fruit Bowl", "Kelsey", "It's a bowl of fruit");
		Painting p2 = new Painting("Oil", "Hand", "David", "It's a hand");
		Painting p3 = new Painting("Watercolor", "Landscape", "Kelsey", "Landscape");
		Sculpture s1 = new Sculpture("Porcelain", "Jug", "Maisy", "To be used for juice");
		Sculpture s2 = new Sculpture("Marble", "Tray", "Rhys", "Serving tray");
		museum.add(s1);
		museum.add(s2);
		museum.add(p3);
		museum.add(p1);
		museum.add(p2);
		
		
		for (Art piece : museum) {
			piece.viewArt();
		}

	}

}
