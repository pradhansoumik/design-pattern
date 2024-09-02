import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * it's client class
 */
public class GenerateBill {
    public static void main(String[] args) throws IOException {

        GetPlanFactory PlanFactory = new GetPlanFactory();// Factory Object
        System.out.println("Enter the name of the plan for which the bill be generated ...");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName = br.readLine();
        System.out.println("Enter the number of units for bill will be calculated ...");
        int units = Integer.parseInt(br.readLine());

        Plan plan = PlanFactory.getPlan(planName);
        System.out.println("Bill amount for "+planName+" of "+units+" units is: ");
        plan.getRate();
        plan.calculatedBills(units);

    }
}