
package PClases;

import java.util.Scanner;

public class Modulo5{
    public void pag13() {
        Scanner entrada = new Scanner (System.in);
        int ageyears, agedays;
        long ageseconds;
        
        ageyears = entrada.nextInt();
        agedays = ageyears * 365;
        ageseconds = (ageyears * 365 * 24L * 60 * 60);
        
        System.out.println("You are " +agedays + " days old");
        System.out.println("you are " + ageseconds + " seconds old");    
    }

    public void pag18() {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("ingresa Hora: ");
        int hour = entrada.nextInt();
        System.out.println("ingresa Grado: ");
        int grade = entrada.nextInt();
        
        if(hour >= 6 && hour < 12){
            System.out.println("Drink Coffee");
        }
        
        if(grade >=90){
            System.out.println("A");
        }
    }
    
    public void pag19(){
        Scanner entrada = new Scanner (System.in);
        int hour = entrada.nextInt();
        
        if(hour >= 8 && hour < 12){
            System.out.println("Drink Coffer");
        }
        else{
            System.out.println("Drink Tea");
        }
    }

    public void pag20() {
        Scanner entrada = new Scanner (System.in);
        int grade = entrada.nextInt();
        if(grade >= 90){
            System.out.println("A");
        }
        else{
            System.out.println("Not an A");
        }
    }

    public void pag22() {
        Scanner entrada = new Scanner (System.in);
        
        int hour = entrada.nextInt();
        
        if(hour >= 8 && hour < 12){
            System.out.println("Drink Coffee");
        }
        else if(hour >= 12 && hour < 17){
            System.out.println("Drink Tea");
        }
        else{
            System.out.println("Drink Water");
        }
    }

    public void pag23() {
        Scanner entrada = new Scanner (System.in);
        int grade = entrada.nextInt();
        
        if(grade >= 90){
            System.out.println("A");
        }
        else if(grade >= 80){
            System.out.println("B");
        }
        else if(grade >= 70){
            System.out.println("C");
        }
        else if(grade >= 60){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }
    }
    
    public void pag24(){
        Scanner entrda = new Scanner (System.in);
        
        int whichCard = (int) (Math.random() * 52);
        System.out.println("The number generated was " + whichCard);
        int suit = whichCard / 13;
        int number = whichCard % 13;
        
        if(number == 0){
            System.out.println("Ace of");
        }
        else if(number == 10){
            System.out.println("Jack of");
        }
        else if(number == 11){
            System.out.println("Queen of");
        }
        else if(number == 12){
            System.out.println("King of");
        }
        else{
            System.out.println((number+1) + " of");
        }
        if(suit == 0){
            System.out.println("Diamonds");
        }
        else if (suit == 1){
            System.out.println("Spades");
        }
        else if(suit == 2){
            System.out.println("Clubs");
        }
        else {
            System.out.println("Hearts");
        }
    }
    
    public void pag26() {
        Scanner entrada = new Scanner (System.in);
        int month = entrada.nextInt();
        
        if(month == 1 || month == 3 || month == 5 || month == 7 ||month == 8 || month == 10 || month == 12){
            System.out.println("There are 31 days in that month");
        }
        else if(month == 2){
            System.out.println("Tehere are 28 days in that month");
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("There are 30 days in that month");
        }
        else{
            System.out.println("Invalid month");
        }
    }
    
    public void pag29() {
        Scanner entrada = new Scanner(System.in);
        String weather = entrada.nextLine();
        int age = entrada.nextInt();

        if (weather.equals("snow")) {
            if (age < 15) {
                System.out.println("Build a Snowman");
            } else if (age < 90) {
                System.out.println("Shobel the driveway");
            } else {
                System.out.println("Enjoy watching thw show");
            }
        } else if (weather.contentEquals("rain") || weather.contentEquals("aleet")) {
            if (age >= 16) {
                System.out.println("Drive safely");
            } else {
                System.out.println("Walk safely");
            }
        } else {
            if (age > 15 && age < 25) {
                System.out.println("Hang out at the beach");
            } else {
                System.out.println("Enjoy the sun");
            }
        }
        if (!weather.equals("sunny")) {
            System.out.println("Bring an umbrella");
        }
    }
}
