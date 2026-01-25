// Tower of Hanoi problem using recursion
public class TowerOfHanoi {

    // Recursive method to move n disks
    // from source rod to destination rod using auxiliary rod
    public static void hanoi(int n, char source, char auxiliary, char destination) {

        // Base condition: if there is only one disk
        if (n == 1) {
            // Move the single disk directly from source to destination
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move top n-1 disks from source to auxiliary rod
        hanoi(n - 1, source, destination, auxiliary);

        // Step 2: Move the nth (largest) disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move the n-1 disks from auxiliary to destination rod
        hanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int disks = 3; // Number of disks
        hanoi(disks, 'A', 'B', 'C'); // A=Source, B=Auxiliary, C=Destination
    }
}