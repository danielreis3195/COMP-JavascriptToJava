public final class JS2Java {
    private static ArrayList<String> cars = {{
        add("BMW");
        add("Volvo");
        add("Saab");
        add("Ford");
    }};

    private static String text2 = "";

    private static int i = 0;

    private static int i2 = 0;

    private static String text = "";

    public static void main(String[] args) {
        while(cars.get(i)){
            text = cars.get(i) + "<br>";

            i++;
        }
        do{
            if (i.equals(i2)) System.out.println("it matches!");


            text2 = "The number is " + i2;

            i2++;
        }while(i2 < 5);
    }
}
