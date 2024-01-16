package rootuser;

public class RootUserLazy {
    private static RootUser instance;

    private RootUserLazy() {}

    public static RootUser getInstance() {
        if (instance == null) {
            instance = new RootUser();
        }
        return instance;
    }
}