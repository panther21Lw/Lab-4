package lab4;

import java.util.ArrayList;
import java.util.List;

/**
 * Цей клас представляє зображення: клієнта. 
 * Він використовує об'єкти класу {@link Dot} та {@link PrimitiveObject}, які бере з 
 * фабрики {@link GraphicObjectFactory}.
 * Цей клас малює зображення, використовуючи множину точок з визначеними координатами, кольором та розміром.
 */
public class Image {
	/**
	 * Цей список представляє точки, з яких складається зображення.
	 */
	private List<Dot> points = new ArrayList<>();
	
	/**
	 * Додає точку до зображення, створюючи точку {@link Dot} з визначеними параметрами.
	 *
	 * @param x Координата x точки.
	 * @param y Координата y точки.
	 * @param color Колір точки.
	 * @param size Розмір точки.
	 */
	public void addPoint(int x, int y, String color, int size) {
		iGraphicObject primitive = GraphicObjectFactory.getGraphicObject(color, size);
		Dot point = new Dot(x, y, primitive);
		points.add(point);
	}
	
	/**
	 * Цей метод промальовує всі точки, які містить зображення.
	 */
	public void draw() {
		for (Dot point: points) {
			point.draw();
		}
	}
}
