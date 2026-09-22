package samplearrays;

public class DogShelter {

    // initialize an array of 3
    private static int[] dogCounts = new int[3];

    public static void main(String[] args) {

        // Adding counts for three types of dogs
        dogCounts[0] = 15;
        dogCounts[1] = 30;
        dogCounts[2] = 20;

        // Display initial dog counts
        System.out.println("Initial Dog Counts:");
        displayDogs();

        // Increase count for second breed of dog
        addBreed(1, 5);

        // Remove the third breed (set to 0, since arrays can't shrink)
        deleteBreed(2);

        // Display updated dog counts
        System.out.println("\nUpdated Dog Counts:");
        displayDogs();
    }

    // Add count to a given index
    public static void addBreed(int index, int count) {
        if (!isValidIndex(index)) return;
        if (count < 0) {
            System.out.println("Invalid dog count.");
            return;
        }
        dogCounts[index] = dogCounts[index] + count;
    }

    // Remove a breed by setting its count to 0
    public static void deleteBreed(int index) {
        if (!isValidIndex(index)) return;
        dogCounts[index] = 0;
    }

    private static boolean isValidIndex(int index) {
        if (index < 0 || index >= dogCounts.length) {
            System.out.println("Invalid breed index.");
            return false;
        }
        return true;
    }

    // Display all dog counts
    public static void displayDogs() {
        // add your code
        for (int i=0; i<dogCounts.length; i++) {
            System.out.println("Breed " + i + " has " + dogCounts[i] + " dogs.");
        }
    }
}

