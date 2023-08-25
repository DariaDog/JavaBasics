package Class9;

public class HWCountries {
    public static void main(String[] args) {

        String [][] countries={{"Canada","United States","Greenland","Mexico","Nicaragua",
                                 "Honduras","Cuba", "Guatemala", "Panama", "Costa Rica",
                                 "Dominican Republic", "Haiti", "Belize", "El Salvador",
                                 "Bahamas", "Jamaica", "Puerto Rico"},

                               {"Argentina", "Bolivia", "Brazil", "Chile", "Colombia", "Ecuador",
                               "Guyana", "Paraguay", "Peru", "Suriname", "Uruguay","Venezuela"},

                               {"Russia","Germany","United Kingdom","France", "Italy", "Spain",
                               "Poland", "Ukraine", "Romania", "Netherlands", "Belgium",
                               "Sweden", "Czech Republic", "Greece", "Portugal"},

                               {"India", "China", "Indonesia", "Pakistan", "Bangladesh", "Japan",
                               "Philippines", "Vietnam","Iran", "Turkey", "Thailand", "Myanmar",
                               "South Korea", "Iraq", "Afghanistan"},

                                {"Egypt", "Equatorial Guinea", "Eritrea", "Eswatini", "Ethiopia",
                               "Gabon", "Gambia", "Ghana", "Guinea","Kenya", "Lesotho"}};

        for (int row = 0; row < countries.length; row++) {
            for (int col = 0; col < countries[row].length; col++) {
                System.out.print(countries[row][col]+" ");

            }
            System.out.println();
        }
        System.out.println();
     for(String []row:countries){
         for(String col:row){
             System.out.print(col+" ");
         }
         System.out.println();
     }
       int total=0;
        for (int i = 0; i < countries.length; i++) {
            total+=countries[i].length;
            }
        System.out.println(total);

        }

    }

