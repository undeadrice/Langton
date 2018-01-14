import java.awt.Color;
import java.awt.Graphics;

public class GridField {

	private boolean containsAnt;
	private int width, height;
	private int posX, posY;
	private int color;

	public GridField(int width, int height, int color, int posX, int posY) {
		this.containsAnt = false;
		this.width = width;
		this.height = height;
		this.color = color;
		this.posX = posX;
		this.posY = posY;

	}

	public void draw(Graphics g) {
		switch (color) {
		case 0:
			g.setColor(Color.white);
			break;
		case 1:
			g.setColor(Color.black);
			break;

		}
		g.fillRect(posX, posY, width, height);
	
		if (containsAnt) {
			g.setColor(Color.red);
			g.fillRect(posX, posY, width, height);

		}
	}

	public boolean isContainsAnt() {
		return containsAnt;
	}

	public void setContainsAnt(boolean containsAnt) {
		this.containsAnt = containsAnt;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

}
