package samplearrays;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student oldest = students[0];

        for (Student s : students) {
            if (s.getAge() > oldest.getAge()) oldest = s;
        }
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int count = 0;

        for (Student s : students) {
            if (s.getAge() >= 18) count++;
        }

        return count;
    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        double sum = 0;
        for(Student s : students) {
            if(s.getGrade() != Double.NaN) sum += s.getGrade();
        }

        return sum / students.length;

    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        name = name.toLowerCase();

        for(Student s : students) {
            if(s.getName().toLowerCase() == name) {
                return s;
            }
        }

        return  null;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        for(int i=1; i<students.length; i++) {
            if (students[i-1].getGrade() < students[i].getGrade()) {
                Student temp = students[i-1];
                students[i-1] = students[i];
                students[i] = temp;
            }
        }
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for(Student s : students) {
            if (s.getGrade() >= 15) 
                System.out.println(s.toString());
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for(Student s : students) {
            if (s.getId() == id) {
                s.setGrade(newGrade);
                return true;
            }
        }

        return false;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        String[] names = new String[students.length];
        int idx = 0;

        for(Student s : students) {
            for (String name : names) {
                if (name == s.getName()) {
                    System.out.println("Douplicate found.");
                    return true;
                } else {
                    names[idx] = s.getName();
                    idx++;
                }
            }
        }

        return false;
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] updatedStudents = new Student[students.length+1];

        for(int i=0; i<students.length; i++) {
            updatedStudents[i] = students[i];
        }

        updatedStudents[students.length] = newStudent;

        return updatedStudents;
    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] arr = {
            new Student(1, "Adam", 20, 16),
            new Student(2, "Youssef", 21, 17),
            new Student(3, "Malak", 19, 17),
            new Student(4, "Adam", 20, 16),
            new Student(5, "Ahmad", 18, 15)
        };

        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest
        Student oldest = findOldest(arr);
        System.out.println("The oldest student in the class is : " + oldest.toString());

        // 3) Count adults
        int adults = countAdults(arr);
        System.out.println("There are " + adults + " adults in the calss");

        // 4) Average grade
        double avg = averageGrade(arr);
        System.out.println("The average grade of the class is : " + avg);

        // 5) Find by name
        Student target = findStudentByName(arr, "Adam");
        System.out.println((target == null ? "We didn't find student 'Adam' " : "We find student 'Adam' "));

        // 6) Sort by grade desc
        sortByGradeDesc(arr);
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        boolean updated = updateGrade(arr, 4, 19);
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names
        hasDuplicateNames(arr);

        // 10) Append new student
        Student newStudent = new Student(6, "Yahia", 19, 13);
        appendStudent(arr, newStudent);
    }
}

