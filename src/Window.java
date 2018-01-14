import javax.swing.JFrame;

public class Window extends JFrame {

	Renderer renderer;
	Grid grid;
	
	public Window(int width, int height, Grid grid){
		
		setSize(width,height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
		setAlwaysOnTop(true);
		
		renderer = new Renderer(width,height,grid);
		add(renderer);
		pack();
		
		
	}
	
}
