package models;

public class Painting extends Art {
	private String paintType;
	
	public Painting(String paintType, String title, String author, String description) {
		super(title, author, description);
		this.paintType = paintType;
	}

	@Override
	public void viewArt() {
		System.out.println("Viewing " + this.getTitle() + " in " + this.paintType);
	}
	
	public String getPaintType() {
		return paintType;
	}
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

}
