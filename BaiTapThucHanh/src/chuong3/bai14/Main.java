/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 11:02:40 PM
 */

package chuong3.bai14;

/**
 * 
 */
public class Main {
    public static void main(String[] args) {
        Drawing d = new Drawing();
        Shape[] shapes = {
            new Circle(),
            new Quad(),
            new Rectangle(),
            new Triangle(),
            new Polygon()
        };
        for (Shape s : shapes) {
            d.drawShape(s);
            s.move(10, 20);
            s.erase();
        }
    }
}

