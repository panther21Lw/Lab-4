package lab4;

/**
 * Це інтерфейс, за допомогою якого пристосуванці можуть отримувати зовнішній стан 
 * і якось змінювати його.
 * <p>
 *	Цей інтерфейс представляє графічний об'єкт, що може бути нарисований на екрані.
 * </p>
 */
public interface iGraphicObject {
	
	/**
	 * Цей метод рисує графічний об'єкт на заданих координатах.
	 * 
	 * @param x Координата x для малювання графічного об'єкта.
	 * @param y Координата y для малювання графічного об'єкта.
	 */
	void draw(int x, int y);
}
