public class ATM {


    private String Colour = "White";

    private int AtmNumber = 14;

    private String Company = "Shah's";

    ATM(String Colour, int AtmNumber, String Company) {
        this.Colour = Colour;
        this.AtmNumber = AtmNumber;
        this.Company = Company;



    }
    public void setColour(String Colour) {
        this.Colour = Colour;
    }
    public void setAtmNumber(int AtmNumber) {
        this.AtmNumber = AtmNumber;

    }
    public void setCompany(String Company) {
        this.Company = Company;
        if (Company == null) Company = "Unknown";
        String lowercaseCompany = Company.toLowerCase();
        switch (lowercaseCompany) {
            case "Shah's" -> this.Company = Company;
            default -> {
                this.Company = "Invalid";
            }

        }
    }

    public String getColour() {
        return this.Colour;

    } public int getAtmNumber() {
        return this.AtmNumber;

    } public String getCompany() {
        return this.Company;
    }
}

