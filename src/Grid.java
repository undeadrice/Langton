import java.util.Arrays;

public class Grid {

	private GridField[][] fields;

	public Grid(int width, int height, int scale) {

		fields = new GridField[width / scale][height / scale];
		int cols = fields.length;
		int rows = fields[0].length;

		System.out.println(cols);
		System.out.println(rows);

		for (int row = 0; row < fields[0].length; row++) {
			for (int col = 0; col < fields.length; col++) {
				fields[col][row] = new GridField( width / cols, height / rows, 0, row * width / rows,
						col * height / cols);

			}

		}

	}

	public GridField[][] getFields() {
		return fields;
	}

}
