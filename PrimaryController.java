package JavaIDM;

import java.io.IOException;

public class PrimaryController 
{
    private void switchToSecondary() throws IOException
    {
        App.setRoot("secondary");
    }    
}
