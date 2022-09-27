import java.util.Scanner;

public class Pet {
    // attributes

    private String petType; // sets type of pet
    private String petName; // sets name of pet
    private int petAge; // sets pet age
    private int daysStay; // total number of days stayed
    private int catSpaces; // total number of spaces for cats (unsure if wanted so decided to add)
    private int dogSpaces; // total number of spaces for dogs (unsure if wanted so decided to add)
    private int catSpaceNumber; // number of spaces for cats (unsure if wanted so decided to add)
    private int dogSpaceNumber; // number of spaces for dogs (unsure if wanted so decided to add)
    private double amountDue; // total bill

    // pet constructor for pet info
    public Pet(String petType, String petName, int petAge, int daysStay, int catSpaces, int dogSpaces)
    {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
        this.catSpaceNumber = catSpaceNumber;
        this.dogSpaceNumber = dogSpaceNumber;
        this.catSpaces = catSpaces; // unsure if needed, but decided to add just incase
        this.dogSpaces = dogSpaces; // unsure if needed, but decided to add just incase
    }

    // setters for main pet class
    public setPetName(String petName) {
        this.petName = petName;
    }
    public setPetType(String petType) {
        this.petType = petType;
    }
    public setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }
    public setPetAge(int petAge) {
        this.petAge = petAge;
    }
    public setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    // feedback tool reported missing so added lines 57-68
    public setCatSpaces(int catSpaces){
        this.catSpaces = catSpaces;
    }
    public setDogSpaces(int dogSpaces){
        this.dogSpaces = dogSpaces;
    }
    public setCatSpaceNumber(int catSpaceNumber) {
        this.catSpaceNumber = catSpaceNumber;
    }
    public setDogSpaceNumber(int dogSpaceNumber){
        this.dogSpaceNumber = dogSpaceNumber;
    }
    public int getCatSpaceNumber() {
        return catSpaceNumber;
    }
    public int getCatSpaces() {
        return catSpaces;
    }
    public int getDogSpaces() {
        return dogSpaces;
    }
    public int getDogSpaceNumber() {
        return dogSpaceNumber;
    }

    // getters for main pet class
    public String getPetType() {
        return petType;
    }
    public String getPetName() {
        return petName;
    }
    public int getPetAge() {
        return petAge;
    }
    public int getDaysStay() {
        return daysStay;
    }
    public int getAmountDue() {
        return amountDue;
    }
}