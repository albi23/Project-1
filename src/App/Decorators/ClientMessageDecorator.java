package App.Decorators;

public class ClientMessageDecorator extends MessageDecorator {
    @Override
    public String log(String message) {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append("[").append(Message).append("]").append("[Client]  ").append(message).toString();
    }
}
