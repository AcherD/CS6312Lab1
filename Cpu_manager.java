
public class Cpu_manager {
    //get the condition {battery,cpu_load}
    public String [][] Cpu_manager(double[][]condition) throws InterruptedException {
        String [][] result  = {{"error","error"}};//create the result for return
        String events, decision;
        events = " ";
        decision = " ";
        double battery, cpu_load;
        battery = condition[0][0];
        cpu_load = condition[0][1];



        //start to judgement
        if (battery <= 30){
            events = "Low battery!";
        }else {
            if(cpu_load < 10){

                events = "Cpu idle for 10 min";

            }else{
                events = "go Cpu_working!";
            }
        }

        //write the decision to result
        switch (events){
            case "Low battery!":
                decision = "2.5v, 800Mhz";
                result [0][0] = events;
                result [0][1] = decision;
                break;
            case "Cpu idle for 10 min":
                decision = new Cpu_idle().decide();
                result [0][0] = events;
                result [0][1] = decision;
                break;
            case "go Cpu_working!":
                result = new Cpu_working().decide(condition);
                break;
            default:
                System.out.print("error!!!!!");
        }



        return result;
    }
}
