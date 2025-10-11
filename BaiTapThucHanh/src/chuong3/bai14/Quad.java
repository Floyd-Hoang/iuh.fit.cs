/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 11:00:10 PM
 */

package chuong3.bai14;

/**
 * 
 */
public class Quad extends Shape {
    @Override
    public void draw()   { System.out.println("Quad drawn"); }
    @Override
    public void erase()  { System.out.println("Quad erased"); }
    @Override
    public void move(int x, int y) {
        System.out.println("Quad moved to " + x + "," + y);
    }
}

