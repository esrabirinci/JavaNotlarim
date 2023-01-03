package day32maps;

public class EnumRunner {
    public static void main(String[] args) {
       String capital = UsStates.CALIFORNIA.getCapital(); //Sacramento

        System.out.println(capital);

        String abbr = UsStates.FLORIDA.getAbbreviation();
        System.out.println(abbr); //FL

        String state = UsStates.getStatedNameFromAbbreviation("FL");
        System.out.println(state);//Florida

        String stateName = UsStates.getStateNameFromCapital("Denver");
        System.out.println(stateName); //Colorado

        String abbreviation = UsStates.getAbbreviationFromCapital("Atlanta");
        System.out.println(abbreviation);

    }
}
