/**
 * Die Klasse Demo dient als Eintrittspunkt für das Chat-Anwendungsszenario.
 * Sie demonstriert die Erstellung von Benutzern, das Senden von Nachrichten und die Interaktion
 * in einer Chatgruppe. 
 */
public class Demo {
    public static void main(String[] args) {
        // Erstellen eines ChatMediators
        ChatMediator mediator = new ChatRoom();

        // Erstellen von Benutzern
        User user1 = new User("Kayn", mediator);
        User user2 = new User("AAtrox", mediator);
        User user3 = new User("Varus", mediator);

        // Hinzufügen von Benutzern zum ChatMediator
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        // Benutzer senden Nachrichten
        user1.send("Hello!");
        user2.send("...");
        user3.send("Hi");

        // Benutzer erstellen eine Gruppe und treten dieser bei
        user2.createGroup("Darkin");
        user1.joinGroup("Darkin");
        user2.joinGroup("Darkin");
        user3.joinGroup("Darkin");

        // Benutzer senden Nachrichten in einer Gruppe
        user2.sendToGroup("Welcome to the Darkin group!", "Darkin");
        user3.sendToGroup("Uhhh fresh", "Darkin");
        user2.sendToGroup("Varus, 'V' 'A' 'R' 'U' 'S', your name should have an 'A' and then another 'A', Varus. There was a memo, Varus, there was a memo!", "Darkin");
    }
}
