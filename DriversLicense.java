package Lab12;

 public class DriversLicense extends IDCard {
    //declaring variables
    private int expirationYear;
    private Month expirationMonth;

    //constructors
    public DriversLicense() {
        super();
        expirationYear = 1969;
        expirationMonth = expirationMonth.JANUARY;
    }

    public DriversLicense(String name, int idNumber, int expirationYear, Month expirationMonth) {
        super(name, idNumber);
        this.expirationYear = expirationYear;
        this.expirationMonth = expirationMonth;
    }

    //toString Method

    public String toString() {
        return super.toString() +  " Expiration Month & Year: " + expirationMonth + " " + expirationYear;
    }
}



enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER,

}





