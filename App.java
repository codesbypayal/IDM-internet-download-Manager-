package JavaIDM;

public class App extends Application
{
    private static Scene scene;
    public void start(Stage stage) throws IOException 
    {
        scene = new scene(laodFXML("primary")),640,480);
        stage.setScene(scene);
        stage.show();
        
    }


}
