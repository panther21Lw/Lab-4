package lab4;


/** 
 * Цей клас реалізує інтерфейс {@link iGraphicObject}.
 * Даний клас представляє внутрішню (спільну) частину легковагового об'єкта. 
 * Клас представляє примітивний графічний об'єкт з конкретним розміром та кольором.
 *
 */
public class PrimitiveObject implements iGraphicObject{
	/**
	 * Це поле представляє колір примітивного об'єкта.
	 */
	private String color;
	/**
	 * Це поле представляє розмір примітивного об'єкта.
	 */
	private int size;
	
	/**
	 * Конструктор класу {@link PrimitiveObject}, що встановлює колір та розмір об'єкта.
	 *
	 * @param color Колір примітивного об'єкта. 
	 * @param size Розмір примітивного об'єкта.
	 */
	public PrimitiveObject(String color, int size) {
		this.color = color;
		this.size = size;
	}
	
	/**
	 * Цей метод малює примітивний об'єкт на заданих координатах.
	 *
	 * @param x Координата x для малювання примітивного об'єкта.
	 * @param y Координата y для малювання примітивного об'єкта.
	 *
	 */
	@Override 
	public void draw(int x, int y) {
		System.out.println("Drawing the primitive object of color " + color + " and size " + size + " at position"
				+ " ("+x+"; " + y+")");
	}
}
