/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 30-Aug-2025 12:17:32 PM
 */

package iuh.fit.cs;

/**
 * 
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseList {
    private final int capacity;
    private final List<Course> courses;

    public CourseList(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Length of the array must be greater than 0");
        this.capacity = capacity;
        this.courses = new ArrayList<>();
    }

    public boolean addCourse(Course c) {
        if (c == null) return false;
        if (courses.size() >= capacity) return false;
        if (exists(c.getId())) return false;
        courses.add(c);
        return true;
    }

    public boolean exists(String id) {
        if (id == null) return false;
        for (Course c : courses) if (c.getId().equalsIgnoreCase(id.trim())) return true;
        return false;
    }

    public boolean removeCourse(String id) {
        if (id == null) return false;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId().equalsIgnoreCase(id.trim())) {
                courses.remove(i);
                return true;
            }
        }
        return false;
    }

    public Course searchCourseById(String id) {
        if (id == null) return null;
        for (Course c : courses) if (c.getId().equalsIgnoreCase(id.trim())) return c;
        return null;
    }

    public Course[] searchCourseByTitle(String keyword) {
        if (keyword == null) return null;
        String k = keyword.trim().toLowerCase();
        List<Course> found = new ArrayList<>();
        for (Course c : courses) if (c.getTitle().toLowerCase().contains(k)) found.add(c);
        return found.isEmpty() ? null : found.toArray(new Course[0]);
    }

    public Course[] searchCourseByDepartment(String dept) {
        if (dept == null) return null;
        String d = dept.trim().toLowerCase();
        List<Course> found = new ArrayList<>();
        for (Course c : courses) if (c.getDepartment().toLowerCase().equals(d)) found.add(c);
        return found.isEmpty() ? null : found.toArray(new Course[0]);
    }

    public Course[] findMaxCreditCourse() {
        if (courses.isEmpty()) return null;
        int max = courses.stream().mapToInt(Course::getCredit).max().orElse(0);
        List<Course> list = new ArrayList<>();
        for (Course c : courses) if (c.getCredit() == max) list.add(c);
        return list.toArray(new Course[0]);
    }

    public String findDepartmentWithMostCourse() {
        if (courses.isEmpty()) return null;
        Map<String, Integer> cnt = new HashMap<>();
        for (Course c : courses) {
            String d = c.getDepartment();
            cnt.put(d, cnt.getOrDefault(d, 0) + 1);
        }
        String best = null; int bestCount = 0;
        for (Map.Entry<String, Integer> e : cnt.entrySet()) {
            if (e.getValue() > bestCount) { best = e.getKey(); bestCount = e.getValue(); }
        }
        return best;
    }

    public Course[] sortCoursesByTitle() {
        List<Course> copy = new ArrayList<>(courses);
        copy.sort(Comparator.comparing(c -> c.getTitle().toLowerCase()));
        return copy.toArray(new Course[0]);
    }

    public Course[] getCourses() {
        return courses.isEmpty() ? new Course[0] : courses.toArray(new Course[0]);
    }

    public int size() {
        return courses.size();
    }

    public int getCapacity() {
        return capacity;
    }
}
