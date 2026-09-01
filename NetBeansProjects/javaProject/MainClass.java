/**
 * MainClass
 */

class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Add add = new Add();

        add.add(10, 40);

        Add newAdd = new Math();
        newAdd.add(50, 70);

        String name = "Sabbir";

        name = name.toUpperCase().trim();
        System.out.println(name);

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }

    }
}