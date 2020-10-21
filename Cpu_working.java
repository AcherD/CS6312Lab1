public class Cpu_working {
    public String [][] decide(double[][]condition){
        double cpu_load;
        cpu_load = condition[0][1];
        String [][] result  = {{"error","error"}};

        //set the configuration of different level
        String [][] configuration ={    {"Cpu loaded higher than 70%",  "High performance mode: 5V,1.6Ghz"  },
                                        {"Cpu loaded between 30-70%", "Normal mode: 3.5V,1.3Ghz" },
                                        {"Cpu loaded less than 30%",   "Battery saver mode: 2.5V,1.2Ghz"}};


        //decide which mode should cpu go
        if (cpu_load > 70){
            //if cpu loaded more than 70%, pass the configuration
            result[0][0] = configuration[0][0];
            result[0][1] = configuration[0][1];
        }else if (cpu_load > 30){
            //if cpu loaded between 30-80%, pass the configuration
            result[0][0] = configuration[1][0];
            result[0][1] = configuration[1][1];
        }else {
            //if cpu loaded less than 30%, pass the configuration
            result[0][0] = configuration[2][0];
            result[0][1] = configuration[2][1];
        }
        return result;
    }
}
