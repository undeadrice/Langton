
public class LangtonEngine {

	private Ant ant;
	private Grid grid;
	private Window window;
	private int timestep;
	

	public LangtonEngine(Window window, Grid grid, Ant ant, int timestep) {
		this.window = window;
		this.grid = grid;
		this.ant = ant;
		this.timestep = timestep;
		startThread();

	}

	private void startThread() {
		Thread t = new Thread(() -> {

			while (true) {
				try {
					Thread.sleep(timestep);
					Langton.setStep(Langton.getStep()+1);
					grid.getFields()[ant.getPosY()][ant.getPosX()].setContainsAnt(false);
					ant.moveForward();
					checkBounds();
					tileLogic();

					window.repaint();

				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}

			}

		});
		t.start();

	}
	/**
	 * checks the tile color the ant's at and rotates it accordingly
	 */
	private void tileLogic() {
		checkBounds();
		if (grid.getFields()[ant.getPosY()][ant.getPosX()].getColor() == 0) {
			grid.getFields()[ant.getPosY()][ant.getPosX()].setColor(1);
			ant.rotateRight();
		} else if (grid.getFields()[ant.getPosY()][ant.getPosX()].getColor() == 1) {
			grid.getFields()[ant.getPosY()][ant.getPosX()].setColor(0);
			ant.rotateLeft();
		}
		grid.getFields()[ant.getPosY()][ant.getPosX()].setContainsAnt(true);

	}
	/**
	 * checks if the ant posisiton is out of display
	 * and changes it to the opposite side
	 */
	private void checkBounds() {

		if (ant.getPosX() < 0) {
			ant.setPosX(grid.getFields()[0].length - 1);
		}
		if (ant.getPosX() > grid.getFields()[0].length - 1) {
			ant.setPosX(0);
		}

		if (ant.getPosY() < 0) {
			ant.setPosY(grid.getFields().length - 1);
		}
		if (ant.getPosY() > grid.getFields().length - 1) {
			ant.setPosY(0);
		}
	}

}
