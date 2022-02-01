// Authors: Lucas King & Mason Harless
// Assignment: C06A Git and Stove (Pair)

// Authors: Lucas King & Mason Harless
// Assignment: C06A Git and Stove (Pair)

public class Burner {
    // Create enum Temperature
    public enum Temperature{
        BLAZING, HOT, WARM, COLD;
    }

    // Create a variable of Temperature called myTemperature
    private Temperature myTemperature;

    // Getter for myTemperature
    public Temperature getMyTemperature() {
        return myTemperature;
    }

    // Create a variable of type Setting called mySetting
    private Setting mySetting;

    // Create a variable of type int called timer
    private int timer;

    // Create a constant int named TIME_DURATION
    public static final int TIME_DURATION = 2;

    // Buner constructor
    public Burner() {
        super();
        // Set temperature to COLD
        this.myTemperature = Temperature.COLD;
        // Set setting to OFF
        this.mySetting = Setting.OFF;
    }

    // Plus button method
    public void plusButton() {
        // Reset timer to TIME_DURATION
        timer = TIME_DURATION;

        // Switch statement
        switch(mySetting) {
            // HIGH -> HIGH
            case HIGH:
                break;
            // OFF -> LOW
            case OFF:
                mySetting = Setting.LOW;
                break;
            // LOW -> MEDIUM
            case LOW:
                mySetting = Setting.MEDIUM;
                break;
            // MEDIUM -> HIGH
            case MEDIUM:
                mySetting = Setting.HIGH;
                break;
        }
    }

    // Minus button method
    public void minusButton() {
        // Reset timer to TIME_DURATION
        timer = TIME_DURATION;

        // Switch statement
        switch(mySetting) {
            // OFF -> OFF
            case OFF:
                break;
            // HIGH -> MEDIUM
            case HIGH:
                mySetting = Setting.MEDIUM;
                break;
            // MEDIUM -> LOW
            case MEDIUM:
                mySetting = Setting.LOW;
                break;
            // LOW -> OFF
            case LOW:
                mySetting = Setting.OFF;
                break;
        }
    }

    //
    public void updateTemperature() {
        timer --;

//		if(timer == 0) {


        if (mySetting != Setting.Off) {

            if (myTemperature == )









        }













        // If the stove is on
        if (mySetting != Setting.OFF) {
            // BLAZING -> HOT
            if ((myTemperature == Temperature.BLAZING) && (mySetting != Setting.HIGH)) {
                myTemperature = Temperature.HOT;
                timer = TIME_DURATION;
            }
            // HOT -> BLAZING
            else if ((myTemperature == Temperature.HOT) && (mySetting == Setting.HIGH)) {
                myTemperature = Temperature.BLAZING;
                timer = TIME_DURATION;
            }
            // HOT -> WARM
            else if ((myTemperature == Temperature.HOT) && (mySetting == Setting.LOW)) {
                myTemperature = Temperature.WARM;
                timer = TIME_DURATION;
            }
            // WARM -> HOT
            else if ((myTemperature == Temperature.WARM) && (mySetting == Setting.HIGH)) {
                myTemperature = Temperature.HOT;
                timer = TIME_DURATION;
            }

            // COLD -> WARM
            else if ((myTemperature == Temperature.COLD) && (mySetting != Setting.LOW)) {
                myTemperature = Temperature.WARM;
                timer = TIME_DURATION;
            }
        }
        // Stove is off
        else {
            // Switch statement
            switch(myTemperature) {
                // COLD -> COLD
                case COLD:
                    break;
                // WARM -> COLD
                case WARM:
                    myTemperature = Temperature.COLD;
                    timer = TIME_DURATION;
                    break;
                // HOT -> WARM
                case HOT:
                    myTemperature = Temperature.WARM;
                    timer = TIME_DURATION;
                    break;
                // BLAZING -> HOT
                case BLAZING:
                    myTemperature = Temperature.HOT;
                    timer = TIME_DURATION;
                    break;
            }
        }
//		}
    }

    public void display() {
        // Print COLD
        if(myTemperature == Temperature.COLD) {
            System.out.println("[" + mySetting.toString() + "].....cooool");
        }

        // Print WARM
        if(myTemperature == Temperature.WARM) {
            System.out.println("[" + mySetting.toString() + "].....warm");
        }

        // Print HOT
        if(myTemperature == Temperature.HOT) {
            System.out.println("[" + mySetting.toString() + "].....CAREFUL");
        }

        // Print BLAZING
        if(myTemperature == Temperature.BLAZING) {
            System.out.println("[" + mySetting.toString() + "].....VERY HOT! DON'T TOUCH");
        }
    }


}
