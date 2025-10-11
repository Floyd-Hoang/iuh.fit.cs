/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 11:00:38 PM
 */

package chuong3.bai14;

/**
 * 
 */
public class Rectangle extends Quad {
    @Override
    public void draw()   { System.out.println("Rectangle drawn"); }
    @Override
    public void erase()  { System.out.println("Rectangle erased"); }
    @Override
    public void move(int x, int y) {
        System.out.println("Rectangle moved to " + x + "," + y);
    }
}

