public interface IUser {
    void createGroup(String groupName);
    void joinGroup(String groupName);
    void sendToGroup(String msg, String groupName);
    void send(String msg);
    void receive(String msg);
}
