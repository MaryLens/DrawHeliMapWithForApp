
public class DrawHeliMapWithForApp {
	public static void main(String[] args) {

		final int SCALE = 10;

		int hX = 5;
		int hY = 4;
//////////////////////HELICOPTER MAP///////////////////////////////
		System.out.println(" Map:");
		for (int y = 1; y <= SCALE; y++) {
			System.out.printf("%2d. ", y);
			for (int x = 1; x <= SCALE; x++) {
				if (x == 1 || y == 1 || x == SCALE || y == SCALE) {
					System.out.print("# ");
				} else if (x == hX && y == hY) {
					System.out.print("H ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
//////////////////////HELICOPTER MAP///////////////////////////////

//////////////////////DANGER MAP////////////////////////// 
		System.out.println(" Danger map:");
		for (int y = 1; y <= SCALE; y++) {
			System.out.printf("%2d. ", y);
			for (int x = 1; x <= SCALE; x++) {
				if (x == 1 || y == 1 || x == SCALE || y == SCALE) {
					System.out.print("# ");
				} else if (x == hX && y == hY) {
					System.out.print("H ");
				} else if ((x == hX + 1 || x == hX + 2 || x == hX - 1 || x == hX - 2) && y == hY
						|| (x == hX + 1 || x == hX || x == hX - 1) && (y == hY - 1 || y == hY + 1)) {
					System.out.print("x ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
//////////////////////DANGER MAP//////////////////////////

//////////////////////HIGH NOISE AREA MAP///////////////////////////
		System.out.println(" High noise area map:");
		for (int y = 1; y <= SCALE; y++) {
			System.out.printf("%2d. ", y);
			for (int x = 1; x <= SCALE; x++) {
				if (x == 1 || y == 1 || x == SCALE || y == SCALE) {
					System.out.print("# ");
				} else if (x == hX && y == hY) {
					System.out.print("H ");
				} else if ((x == hX + 1 || x == hX + 2 || x == hX - 1 || x == hX - 2 || x == hX)
						&& (y == hY || y == hY + 1 || y == hY - 1)
						|| (x == hX + 1 || x == hX || x == hX - 1) && (y == hY - 2 || y == hY + 2)) {
					System.out.print("~ ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
//////////////////////HIGH NOISE AREA MAP///////////////////////////

	}
}
