public class ATM {

    private String Colour = "White";

    private int AtmNumber = 14;

    private String Company = "Shah's";

    ATM(String Colour, int AtmNumber, String Company) {
        this.Colour = Colour;
        this.AtmNumber = AtmNumber;
        this.Company = Company;

    } public String getColour() {
        return this.Colour;

    } public int getAtmNumber() {
        return this.AtmNumber;

    } public String getCompany() {
        return this.Company;
    }
}
