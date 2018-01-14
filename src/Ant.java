
public class Ant {

	private int posX, posY;
	private Direction dir;

	public Ant(int posX, int posY, Direction dir) {
		this.posX = posX;
		this.posY = posY;
		this.dir = dir;

	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public Direction getDir() {
		return dir;
	}

	public void setDir(Direction dir) {
		this.dir = dir;
	}

	public void moveForward() {

		switch (dir) {
		case NORTH:
			posY--;
			break;
		case SOUTH:
			posY++;
			break;
		case EAST:
			posX++;
			break;
		case WEST:
			posX--;
			break;

		}
	}

	public void rotateRight() {
		if (dir.ordinal() == 3) {
			dir = Direction.NORTH;
		} else
			dir = Direction.values()[(dir.ordinal() + 1) % 4];

	}

	public void rotateLeft() {
		if (dir.ordinal() == 0) {
			dir = Direction.WEST;
		} else
			dir = Direction.values()[(dir.ordinal() - 1) % 4];
	}

}
