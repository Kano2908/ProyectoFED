package PClases;

public class Modulo7 {
    int IDD = 44339;
    char sizee = 'L';
    
    int ID;
    char size;
    int inStock;
    float price;
    public void printInfo (int shirtID, char shirtSize){
        int IDD = 44339;
        char sizee = 'L';
        IDD = shirtID;
        sizee = shirtSize;
        System.out.println("ID: " + IDD);
        System.out.println("Size: " + sizee);
    }
    
    public int returnSum(){
        int int1 = 4;
        int int2 = 17;
        return (int1 + int2);
    }
    
    public void subtract(float first, float second){
        if ((first - second) >= 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
            System.out.println("Try Again");
        }
    }
    
    public float printInfo(int shirtID, char shirtSize, float shirtPrice, int shirtInStock){
        ID = shirtID;
        size = shirtSize;
        inStock = shirtInStock;
        price = shirtPrice;
        System.out.println("ID: "+ID);
        System.out.println("Size: "+size);
        System.out.println("Standard price: "+ price);
        System.out.println("Number in Stock: "+inStock);
        if(ID <= 9999){
            ID = ID + 50000;
            System.out.println("Update ID: +ID");
        }
        if((ID > 5524) && (ID < 51000)){
            price = (float) (price * .75);
            System.out.println("Sale price: "+price);
        }
        return (inStock * price);
    }
}
