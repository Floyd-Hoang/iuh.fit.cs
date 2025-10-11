/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 11:01:13 PM
 */

package chuong3.bai14;

/**
 * 
 */
public class Triangle extends Shape {
    @Override
    public void draw()   { System.out.println("Triangle drawn"); }
    @Override
    public void erase()  { System.out.println("Triangle erased"); }
    @Override
    public void move(int x, int y) {
        System.out.println("Triangle moved to " + x + "," + y);
    }
}

