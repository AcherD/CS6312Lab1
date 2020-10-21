import java.util.concurrent.TimeUnit;

public class Cpu_idle {
    //count down class, using second to simulate the minute
    public class CountDown {
        private int limitSec;
        public CountDown(int limitSec) throws InterruptedException{
            this.limitSec = limitSec;
            System.out.println("Count from "+limitSec+"minutes");
            while(limitSec > 0){
                System.out.println("remians "+ --limitSec +" m");
                TimeUnit.SECONDS.sleep(1);
            }
            System.out.print("Time is out");
        }}
    public String decide() throws InterruptedException {
        System.out.println("Cpu will go sleep in 10 min...");
        new CountDown(10);
        String decision = "Go deep sleep mode";
        return decision;
    }
}
