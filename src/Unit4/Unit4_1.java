package Unit4;

public class Unit4_1 {
    public static void main(String[] args) {
        String[] friends = {"Peter","Paul","Petra","Pinochio","Paula"};
        double gpas[] = {4.3, 3.7, 4.0, 2.5, 3.9};

        //print the first value for both arrays "Peter: 4.3"
        System.out.println(friends[0] + ": " + gpas[0]);

        //change the first name with your name
        friends[0] = "Mery";
        //change the fGPA to 4.0
        gpas[0] = 4.0;
        System.out.println(friends[0] + ": " + gpas[0]);


        String names[] = new String[5];
        names[0] = "Jay";
        names[1] = "Jonas";
        names[2] = "Janice";
        names[3] = "Joe";
        names[4] = "Jazmine";
        // names[5] = "Mery"; error, position 5 does not exist
    }
}
