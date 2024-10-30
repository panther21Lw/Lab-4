package lab4;
/**
 * Головний клас програми.
 * Демонструє створення та малювання зображення, що складається з окремих точок.
 */
public class Main {

	/**
	 * Це головний метод, що запускає програму.
	 * @param args Аргументи командного рядка.
	 */
	public static void main(String[] args) {
		Image image = new Image();
		image.addPoint(10, 10, "red", 3);
		image.addPoint(20, 20, "red", 3);
		image.addPoint(30, 30, "red", 3);
		image.addPoint(40, 40, "red", 3);
		image.addPoint(50, 50, "red", 3);
		image.addPoint(1, 10, "green", 2);
		image.addPoint(10, 5, "black", 2);
		image.addPoint(2, 0, "green", 2);
		
		image.draw();

	}

}
