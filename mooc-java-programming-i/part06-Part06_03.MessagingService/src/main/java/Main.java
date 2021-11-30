public class Main {

    public static void main(String[] args) {
        Message test = new Message ("Tester", "Content");
        Message test2 = new Message ("Tester", "Content");
    MessagingService ms = new MessagingService();
    ms.add(test);
     ms.add(test2);
System.out.println(ms.getMessages());
    }
}
