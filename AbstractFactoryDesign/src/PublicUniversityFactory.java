public class PublicUniversityFactory extends UniversityFactory {

    @Override
    public AdmitCard getAdmitCard(String course) {
        switch (course) {
            case "Math":
                return new USCAdmitCard();
            case "Physics":
                return new VSUAdmitCard();
            case "CS":
                return new ASUAdmitCard();
            default:
                break;
        }
        return null;
    }

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        switch (course) {
            case "Math":
                return new USCCalculator();
            case "Physics":
                return new VSUFeeCalculator();
            case "CS":
                return new ASUFeeCalculator();
            default:
                break;
        }
        return null;
    }

}
