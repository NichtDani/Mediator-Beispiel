public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
    void createGroup(String groupName);
    void addUserToGroup(String groupName, User user);
    void sendMessageToGroup(String msg, String groupname, User user);
}
