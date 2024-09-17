/**
 * Abstract Factory class
 */
public abstract class UniversityFactory {

    public static int cutoff = 109;
    public static UniversityFactory getUniversityFactory(int entranceExamScore) {
        if(entranceExamScore > cutoff){
            return new IvyLeagueUniversityFactory();
        }else{
            return new PublicUniversityFactory();
        }
    }

    public abstract AdmitCard getAdmitCard(String string);

    public abstract FeeCalculator getFeeCalculator(String string);

}
