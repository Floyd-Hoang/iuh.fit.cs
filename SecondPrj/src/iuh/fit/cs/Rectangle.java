/**
 * @description: Lớp mô tả hình chữ nhật, chứa các thuộc tính chiều dài, chiều rộng và các phương thức tính diện tích, chu vi.
 * @author: Hoàng Tiến Phát
 * @version: 1.0
 * @created: 30-Aug-2025 12:02:38 PM
 */

package iuh.fit.cs;

/**
 * 
 */
public class Rectangle {
	private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }
    public void setLength(double newVal) {
        if (newVal < 0) throw new IllegalArgumentException("Length must be greater than 0");
        this.length = newVal;
    }
    public void setWidth(double newVal) {
        if (newVal < 0) throw new IllegalArgumentException("Width must be greater than 0");
        this.width = newVal;
    }
    public double getArea() { return length * width; }
    public double getPerimeter() { return 2 * (length + width); }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
}
}
