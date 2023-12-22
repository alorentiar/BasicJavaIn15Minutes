public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Cat.dingDong();

        Cat myCat = new Cat();
        myCat.age  = 9;
        myCat.name = "Andi";

        Cat anotherCat = new Cat();
        anotherCat.age = 10;
        anotherCat.name = "Fandi";

        int myInt = 9;
        double shoeSize = 9.5;
        char myInitial = 'J';

        double result = myInt * shoeSize;

        String myName = "Joko";
        Integer lenName =  myName.length();

        System.out.println(myName.toLowerCase());
        burp("Asoy",99);

        for (int i = 0; i< 100; i++){
            System.out.println("Ini mantap ada "+i+1);
        }
    }

    private static String burp(String name, int number){
        if(name.equals("joko")){
            System.out.println("He is joko");
        }
        else if(name.equals("owi")){
            System.out.println("He is owi");
        }else{
            System.out.println("Not joko and not owi");
        }

        System.out.println("Burrrrp" + name + number);
        return "My name is"+name+number;
    }


}