

abstract class Bank {
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 6;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

class HDFC extends Bank {
    int getRateOfInterest() {
        return 10;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");

        b = new ICICI();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");

        b = new HDFC();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
    }
}
