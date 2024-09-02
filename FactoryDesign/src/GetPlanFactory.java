public class GetPlanFactory {
    public Plan getPlan(String planName) {

        if(planName == null){
            return null;
        }
        if(planName.equalsIgnoreCase("DOMESTICPLAN")){
            return new DomesticPlan();
        }
        if(planName.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        if(planName.equalsIgnoreCase("INSTITUITIONALPLAN")){
            return new InstituitionalPlan();
        }
        return null;
    }
}
