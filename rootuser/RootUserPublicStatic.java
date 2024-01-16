package rootuser;

public class RootUserPublicStatic {
    private static RootUser rootUser = new RootUser();

    private RootUserPublicStatic() {}

    public static RootUser getRootUser() {
        return rootUser;
    }
}