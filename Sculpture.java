package models;

public class Sculpture extends Art {
	private String material;
	
	public Sculpture(String material, String title, String author, String description) {
		super(title, author, description);
		this.material = material;
	}

	@Override
	public void viewArt() {
		System.out.println("Viewing " + this.getTitle() + " in " + this.material);
	}

}
