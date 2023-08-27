package GroupProjectJava;

public class Task10 {
    public static void main(String[] args) {

        String [] words={"car","juice","lama","car","sun","tree"};

        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length ; j++) {

                if((words[i].equals(words[j])) && (i !=j)){
                    System.out.println("Duplicate elements is "+words[j]);
                }

            }

        }


    }
}
