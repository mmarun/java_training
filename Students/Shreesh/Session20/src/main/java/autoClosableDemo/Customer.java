package autoClosableDemo;
import lombok.*;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Customer implements AutoCloseable{
    Integer inTime;
    Integer outTime;

    public Integer getTime()
    {
        return outTime-inTime;
    }

    @Override
    public void close() throws Exception {
        System.out.println("closing resource");

    }
}
