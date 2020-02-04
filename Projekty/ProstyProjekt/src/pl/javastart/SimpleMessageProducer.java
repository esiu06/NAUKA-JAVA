package pl.javastart;

public class SimpleMessageProducer implements MessageProducer{
    @Override
    public String getMessage() {
        return "Example text " + System.currentTimeMillis();
    }
}
