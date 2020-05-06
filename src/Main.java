public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("J.K. Rowling", 346);
        myBook.setTitle("Harry Potter and the Sorcerer's Stone");
        myBook.setDescription("An ordinary boy learns he is a wizard.");

        Software mySoftware = new Software();
        mySoftware.setProgrammer("Andrew");
        mySoftware.setOs("Linux");

        System.out.printf("myBook: %s\n" +
                "Author: %s\n" +
                "Description: %s\n" +
                "Pages: %s\n", myBook.toString(), myBook.getAuthor(), myBook.getDescription(), myBook.getPages());

        System.out.printf("mySoftware: %s\n" +
                "Programmer: %s\n" +
                "OS: %s\n", mySoftware.toString(), mySoftware.getProgrammer(), mySoftware.getOs());

        System.out.println(myBook.myAbstractMethod());
        System.out.println(mySoftware.myAbstractMethod());

    }
}
