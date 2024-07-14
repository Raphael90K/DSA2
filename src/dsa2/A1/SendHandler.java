package dsa2.A1;

public class SendHandler extends Thread {

    private final NetworkNode node;

    public SendHandler(NetworkNode node, String nodeName) {
        this.node = node;
        this.setDaemon(true);
        this.setName("SendHandler" + nodeName);
    }

    @Override
    public void run() {
        node.sendMessages();
    }


}
