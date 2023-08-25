package Class9;

public class T32DArrays {
    public static void main(String[] args) {


        String[][] students = {{"Aysha", "Giulia", "John", "Deepali"},
                {"A", "B", "C", "D"}
        };


        for (int row = 0; row < 4; row++) {
            if (students[1][row].equals("A") || students[1][row].equals("B")) {
                System.out.println(students[0][row]);

            }


        }
    }
}
