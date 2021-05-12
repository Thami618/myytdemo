public class Shirt {
    public String description;
    public char colorCode;

    //constructor
    public Shirt(String desc, char colCode){
        desc = " This is my favourite shirt";
        colCode = 'U';
    }
    //methods
    public void display(){
        System.out.println("Shirt Descrtion - " + description);
    } 

    
    public static int number(int number) {
        number ++;
        return number;
    }
    public static String letters(String letters){
        letters += "D";
        return letters;
    }
    
    public static void main(String[] args) {
        //Shirt myShirt = new Shirt();
        //myShirt.display();
        int number = 2;
        String letters = "abc";
        number = number(number);
        letters(letters);
        System.out.println(number+letters);
        
        
        
    }

}
    