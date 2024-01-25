/**
 * Die Klasse User implementiert das IUser-Interface.
 * Diese Klasse repräsentiert einen Benutzer in einem Chat.
 */
public class User implements IUser{
    private String name;
    private ChatMediator mediator;

    /**
     * Konstruktor für User
     * Erstellt einen neuen User mit einem gegebenen Namen und einem zugehörigen ChatMediator.
     * 
     * @param name Der Name des Benutzers.
     * @param mediator Der Mediator, der für die Vermittlung des Chats zwischen Benutzern verwendet wird.
     */
    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void createGroup(String groupName) {
        mediator.createGroup(groupName);
    }

    @Override
    public void joinGroup(String groupName) {
        mediator.addUserToGroup(groupName, this);
    }

    @Override
    public void sendToGroup(String msg, String groupName) {
        System.out.println(this.name + ": Sending message to group [" + groupName + "] = " + msg);
        mediator.sendMessageToGroup(msg, groupName, this);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sending message = " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Received message = " + msg);
    }
}
