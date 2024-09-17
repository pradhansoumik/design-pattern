/**
 * Pros of abstarct factory design pattern:
 * 1. Good for abstraction and family of similar objects.
 * 2. Loose coupling between client and concrete code.
 * 3. All classes follow single responsibility principle.
 * 4. Supports open/closed principle.
 * 
 * Cons of abstract factory design pattern
 * 1. Code becomes complex/complicated.
 * 2. Pattern inside a pattern.
 */

public class Client {
    public static void main(String[] args) {

        int entranceExamScore = 125;
        UniversityFactory abstractUniversityFactory = UniversityFactory.getUniversityFactory(entranceExamScore);
        
        AdmitCard admitCard = abstractUniversityFactory.getAdmitCard("Math");
        System.out.println("Class called:  "+admitCard.getClass()); // MIT
        FeeCalculator feeCalculator = abstractUniversityFactory.getFeeCalculator("Math");
        System.out.println(feeCalculator.calculateFee()); // 30000
    
        AdmitCard admitCardTwo = abstractUniversityFactory.getAdmitCard("Physics"); // CalTech
        System.out.println("Class called:  "+admitCardTwo.getClass());
        feeCalculator = abstractUniversityFactory.getFeeCalculator("Physics"); // 40000
        System.out.println(feeCalculator.calculateFee());

        AdmitCard admitCardThree = abstractUniversityFactory.getAdmitCard("CS"); // GeorgiaTech
        System.out.println("Class called:  "+admitCardThree.getClass());
        feeCalculator = abstractUniversityFactory.getFeeCalculator("CS"); //55000
        System.out.println(feeCalculator.calculateFee());


        entranceExamScore = 105;
        UniversityFactory abstractUniversityFactoryTwo = UniversityFactory.getUniversityFactory(entranceExamScore);

        AdmitCard admitCardFour = abstractUniversityFactoryTwo.getAdmitCard("CS"); // ASU
        System.out.println("Class called:  "+admitCardFour.getClass());
        feeCalculator = abstractUniversityFactoryTwo.getFeeCalculator("CS"); // 59000
        System.out.println(feeCalculator.calculateFee());
    }
    
}
