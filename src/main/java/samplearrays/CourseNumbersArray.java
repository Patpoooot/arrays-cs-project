package samplearrays;

public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};

        int[] updatedCourses = new int[registeredCourses.length + 1]; // the new array where we gonna put courses
        int newCourse = 3120; // new course to append

        // copying all elements in the registeredCourses array into the updatedCourses array
        for (int i=0; i<registeredCourses.length; i++) {
            updatedCourses[i] = registeredCourses[i];
        }

        // add the last new course
        updatedCourses[registeredCourses.length] = newCourse;

        System.out.println("Courses included are the followings: ");
        for(int c : updatedCourses) System.out.println("-" + c);

        // Check if the array of the updated courses contains the course 1010 (which needs to be true)
        int target = 1010;
        boolean isFound = false;

        for(int c : updatedCourses) {
            if (c == target) {
                isFound = true;
                break;
            }
        }

        System.out.println("the array updatedCourses does " + (isFound ? " contain the course 1010" : " not contain the course 1010"));
    }
}
