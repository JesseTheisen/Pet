public class Cat {
        // attributes
        private int catSpaceNumber; // boarding space for
        private int petAge; // age of pet
        private int daysStay; // total number of days
        private double amountDue; // total bill due

        private String petType; // sets pet type to cat or dog, cat in this case and updates if adding a new pet or sets type of old one in database
        private String petName; // sets name of pet in database

        // constructor with temp cat info, let me know if I should change? Think I have it correct but unsure exactly.
    public Cat()
        {
            petName = "Penguin";
            petType = "Cat";
            petAge = 12;
            catSpaceNumber = -1; // sets number of boarding space in database
            daysStay = 6;
            amountDue = 125.45;
        }
        // accessors and mutators
        public void setCatSpaceNumber (int num)
        {
            catSpaceNumber = num; // csn = catSpaceNumber
        }
        public void setPetAge(int num)
        {
            petAge = num;
        }
        public void setPetType(String pt)
        {
            petType = pt;
        }
        public void setDaysStay(int ds)
        {
            daysStay = ds;
        }
        public void setPetName(String pn)
        {
            petName = pn;
        }
        public void setAmountDue(double ad)
        {
            amountDue = ad;
        }
        public int getCatSpaceNumber(int num)  // gets the boarding space number of cat in database
        {
            return num;
        }
        // other accessors and mutators
        public int getPetAge(int petAge) // gets the current age of the cat in database
        {
            return petAge;
        }
        public int getDaysStay(int daysStay) // gets the total amount of days pet has stayed
        {
            return daysStay;
        }
        public double getAmountDue(double amountDue) // gets total amount of bill due at time of picking up pet
        {
            return amountDue;
        }
    }