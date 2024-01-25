/**
 * Das ChatMediator-Interface definiert die Methoden zur Verwaltung von Benutzern und Gruppen in einem Chatroom.
 */
public interface ChatMediator {

    /**
     * Sendet eine Nachricht an alle.
     *
     * @param msg  Die zu sendende Nachricht.
     * @param user Der dazugehörige Benutzer.
     */
    void sendMessage(String msg, User user);

    /**
     * Fügt einen neuen Benutzer hinzu.
     *
     * @param user Der hinzuzufügende Benutzer.
     */
    void addUser(User user);

    /**
     * Erstellt eine neue Gruppe.
     *
     * @param groupName Der Name der Gruppe.
     */
    void createGroup(String groupName);

    /**
     * Fügt einen Benutzer zu einer bestehenden Gruppe hinzu.
     *
     * @param groupName Der Name der Gruppe, zu der der Benutzer hinzugefügt werden soll.
     * @param user      Der hinzuzufügende Benutzer.
     */
    void addUserToGroup(String groupName, User user);

    /**
     * Sendet eine Nachricht an eine bestimmte Gruppe.
     *
     * @param msg       Die zu sendende Nachricht.
     * @param groupName Der Name der Gruppe, an die die Nachricht gesendet werden soll.
     * @param user      Der Benutzer, der die Nachricht sendet.
     */
    void sendMessageToGroup(String msg, String groupName, User user);
}