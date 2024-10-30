package lab4;

import java.util.HashMap;
import java.util.Map;


/**
 * Цей клас представляє Фабрику легковагових об'єктів.
 * Відповідає за створення та управління легковаговими об'єктами.
 * Дозволяє перевикористовувати об'єкти з одинаковою властивістю "колір-розмір".
 *
 */
public class GraphicObjectFactory {
	
	/**
	 * Ця мапа зберігає графічні об'єкти, базуючись на їхніх властивостях кольору та розміру.
	 */
	private static Map<String, iGraphicObject> primitives = new HashMap<>();
	
	
	/**
	 * Цей метод повертає існуючий об'єкт або створює новий, якщо 
	 * об'єкта з такими значеннями кольору та розміру не існує.
	 *
	 * @param color Колір графічного об'єкта.
	 * @param size Розмір графічного об'єкта.
	 * @return об'єкт типу {@link iGraphicObject}
	 */
	public static iGraphicObject getGraphicObject(String color, int size) {
		String key = color + "-" + size;
		iGraphicObject primitive = primitives.get(key);
		if (primitive == null) {
			primitive = new PrimitiveObject(color, size);
			primitives.put(key, primitive);
		}
		return primitive;
	}
}
