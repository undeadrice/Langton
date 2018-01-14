
public class Langton {

	private final static int WIDTH = 600, HEIGHT = 600;
	private static Window window;
	private static Grid grid;
	private static Ant ant;
	private static LangtonEngine engine;
	private static final int SCALE = 4;
	private static final int TIME_STEP = 1;
	private static int step = 0;

	public static void main(String[] args) {
		ant = new Ant(WIDTH / (2 * SCALE), HEIGHT / (2 * SCALE), Direction.SOUTH);
		createGrid();
		createWindow();
		engine = new LangtonEngine(window, grid, ant, TIME_STEP);
	}

	private static void createWindow() {
		window = new Window(WIDTH, HEIGHT, grid);
	}

	private static void createGrid() {
		grid = new Grid(WIDTH, HEIGHT, SCALE);
		grid.getFields()[ant.getPosY()][ant.getPosX()].setContainsAnt(true);
		grid.getFields()[ant.getPosY()][ant.getPosX()].setColor(1);
	}

	public static int getStep() {
		return step;
	}

	public static void setStep(int step) {
		Langton.step = step;
	}

}
