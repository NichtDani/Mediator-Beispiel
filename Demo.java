public class Demo {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();
        User user1 = new User("Kayn", mediator);
        User user2 = new User("AAtrox", mediator);
        User user3 = new User("Varus", mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hello!");
        user2.send("...");
        user3.send("Hi");

        user2.createGroup("Darkin");
        user1.joinGroup("Darkin");
        user2.joinGroup("Darkin");
        user3.joinGroup("Darkin");

        user2.sendToGroup("Welcome to the Darkin group!", "Darkin");
        user3.sendToGroup("Uhhh fresh", "Darkin");
        user2.sendToGroup("Varus, 'V' 'A' 'R' 'U' 'S', your name should have an 'A' and then another 'A', Varus. There was a memo, Varus, there was a memo!", "Darkin");
    }
}
