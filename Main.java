import rootuser.RootUser;
import rootuser.RootUserEnum;
import rootuser.RootUserLazy;
import rootuser.RootUserPublicStatic;

public class Main {
    public static void main(String[] args) {
        System.out.println("Create a RootUser with \'new\'");
        RootUser rootUser = new RootUser();
        System.out.println(rootUser);
        
        // 1. lazy initialization
        System.out.println("\n1. Create a RootUser with lazy initialization:");
        RootUser rootUserLazy = RootUserLazy.getInstance();
        System.out.println(rootUserLazy);

        // 2. public static final Instance field
        System.out.println("\n2. Create a RootUser with public static final Instance field:");
        RootUser rootUserPublicStatic = RootUserPublicStatic.getInstance();
        System.out.println(rootUserPublicStatic);

        // 3. enum
        System.out.println("\n3. Create a RootUser with enum:");
        RootUser rootUserEnum = RootUserEnum.INSTANCE.getInstance();
        System.out.println(rootUserEnum);
    }
}