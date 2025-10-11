/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 10:59:36 PM
 */

package chuong3.bai14;

/**
 * 
 */
public class Circle extends Shape {
    @Override
    public void draw()   { System.out.println("Circle drawn"); }
    @Override
    public void erase()  { System.out.println("Circle erased"); }
    @Override
    public void move(int x, int y) {
        System.out.println("Circle moved to " + x + "," + y);
    }
}

