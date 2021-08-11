package customException;

import java.io.FileNotFoundException;

public class CustomChecked extends FileNotFoundException {
    public CustomChecked(String message)
    {
        super(message);
    }

}
