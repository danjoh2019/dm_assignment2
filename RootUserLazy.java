public class RootUserLazy {
    private static RootUser rootUser;

    private RootUserLazy() {}

    public static RootUser getRootUser() {
        if (rootUser == null) {
            rootUser = new RootUser();
        }
        return rootUser;
    }
}
