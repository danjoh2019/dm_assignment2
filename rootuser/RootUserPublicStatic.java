package rootuser;

public class RootUserPublicStatic {
    private static RootUser instance = new RootUser();

    private RootUserPublicStatic() {}

    public static RootUser getInstance() {
        return instance;
    }
}