public enum RootUserEnum {
    ROOTUSER;

    private RootUser rootUser;

    private RootUserEnum() {
        rootUser = new RootUser();
    }

    public RootUser getRootUser() {
        return rootUser;
    }
}