package OOP_Homework;

public class Calculator {
    String manufacturer;
    String color;
    float numberA;
    float numberB;
    float mathConstantPi = 3.14f;

    public Calculator() {
        }

    public String getManufacturer() {
        return manufacturer;
        }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        }

    public String getColor() {
        return color;
        }
    public void setColor(String color) {
        this.color = color;
        }

    public void setNumberA(float numberA) {
        this.numberA = numberA;
        }

    public void setNumberB(float numberB) {
        this.numberB = numberB;
        }

    float sum() {
        return this.numberA+this.numberB;
        }

    float difference() {
        return this.numberA-this.numberB;
        }

    float product() {
        return this.numberA*this.numberB;
        }

    float quotient() {
        return this.numberA/this.numberB;
    }

    int sumOfArrayNumbers(int[] numberArray) {
        int sum=0;
        for (int i=0; i<numberArray.length; i++) {
            sum = sum + numberArray[i];
        }
        return sum;
    }

    int productOfArrayNumbers(int[] numberArray) {
        int product=1;
        for (int i=0; i<numberArray.length; i++) {
            product = product*numberArray[i];
        }
        return product;
    }
}