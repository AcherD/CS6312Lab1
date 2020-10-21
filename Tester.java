import java.util.Random;

public class Tester {

    //random the cpu_load and Battery
    public static double[][] create_condition(){
        Random rand = new Random();
        double battery = rand.nextDouble()*100;
        double cpu_load = rand.nextDouble()*100;
//        double cpu_load = 0.09;
        double[][] condition = {{battery,cpu_load}};
        System.out.print("Print the random condition:");
        System.out.println();
        System.out.print("Battery: "+condition[0][0]+"%");
        System.out.println();
        System.out.print("Cpu_load: "+condition[0][1]+"%");
        //return the condition
        return condition;
    }



    public static void main(String[] args) throws InterruptedException {
        //set integer
        double condition [][];
        String result [][];
        //create the condition
        condition = create_condition();
        Cpu_manager test = new Cpu_manager();
        result = test.Cpu_manager(condition);

        //print solution
        System.out.println();
        System.out.print("Print the solution:");
        System.out.println();
        System.out.print("Events: "+result[0][0]);
        System.out.println();
        System.out.print("Desition: "+result[0][1]);




    }
}
