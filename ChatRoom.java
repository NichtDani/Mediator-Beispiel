import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ChatRoom implements ChatMediator {
    private List<User> users;
    private Map<String, Set<User>> groups;

    public ChatRoom() {
        this.users = new ArrayList<>();
        this.groups = new HashMap<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void createGroup(String groupName) {
        groups.put(groupName, new HashSet<>());
    }

    @Override
    public void addUserToGroup(String groupName, User user) {
        if (groups.containsKey(groupName)) {
            groups.get(groupName).add(user);
        }
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : this.users) {
            // Nachricht nicht an den Benutzer selbst senden
            if (u != user) {
                u.receive(msg);
            }
        }
    }

    @Override
    public void sendMessageToGroup(String msg, String groupName, User user) {
        if (groups.containsKey(groupName)) {
            for (User u : groups.get(groupName)) {
                if (u != user) {
                    u.receive(msg);
                }
            }
        }
    }
}
