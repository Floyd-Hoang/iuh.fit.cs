/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 11:01:41 PM
 */

package chuong3.bai14;

/**
 * 
 */
public class Polygon extends Shape {
    @Override
    public void draw()   { System.out.println("Polygon drawn"); }
    @Override
    public void erase()  { System.out.println("Polygon erased"); }
    @Override
    public void move(int x, int y) {
        System.out.println("Polygon moved to " + x + "," + y);
    }
}

