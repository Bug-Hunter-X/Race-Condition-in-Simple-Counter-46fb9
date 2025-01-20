import java.util.concurrent.atomic.AtomicInteger;

public class FixedCounter {
    private AtomicInteger x = new AtomicInteger(0);

    public void incrementX() {
        x.incrementAndGet();
    }

    public int getX(){
        return x.get();
    }
}