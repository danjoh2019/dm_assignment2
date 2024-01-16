package rootuser;

public enum RootUserEnum {
    INSTANCE;
    private RootUser instance;

    private RootUserEnum() {
        instance = new RootUser();
    }

    public RootUser getInstance() {
        return instance;
    }
}