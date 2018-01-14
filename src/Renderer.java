import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Renderer extends JPanel {

	private Grid grid;

	public Renderer(int width, int height, Grid grid) {
		this.grid = grid;
		setPreferredSize(new Dimension(width, height));
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		for (GridField[] col : grid.getFields()) {
			for (GridField field : col) {
				field.draw(g2d);
			}

		}
		g2d.scale(2, 2);
		g2d.setColor(Color.green);
		g2d.drawString("Steps: " + Langton.getStep(), 10, 10);
		g2d.scale(-2,-2);
	}

}
