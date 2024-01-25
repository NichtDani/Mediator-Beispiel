/**
 * Interface zur DEfinition der Benutzeraktionen in einem Chat.
 */
public interface IUser {

    /**
     * Erstellt eine neue Gruppe.
     *
     * @param groupName Der Name der Gruppe.
     */
    void createGroup(String groupName);

    /**
     * Tritt einer bestehenden Gruppe bei.
     *
     * @param groupName Der Name der Gruppe, der beigetreten werden soll.
     */
    void joinGroup(String groupName);

    /**
     * Sendet eine Nachricht an eine bestimmte Gruppe.
     *
     * @param msg Die zu sendende Nachricht.
     * @param groupName Der Name der Gruppe, an die die Nachricht gesendet werden soll.
     */
    void sendToGroup(String msg, String groupName);

    /**
     * Sendet eine Nachricht an alle.
     *
     * @param msg Die zu sendende Nachricht.
     */
    void send(String msg);

    /**
     * Empfängt eine Nachricht.
     *
     * @param msg Die empfangene Nachricht.
     */
    void receive(String msg);
}
