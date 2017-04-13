package exercise3;

public class FileUtility {
    private static FileUtility fileInstance;

    private FileUtility() {
    }

    public static FileUtility getInstance() {
        if(fileInstance ==null) {
            synchronized (FileUtility.class) {
                if(fileInstance==null) {
                    fileInstance=new FileUtility();
                }
            }
        }
        return fileInstance;
    }
    public void readFile() {
        System.out.println("reading file.....");
    }
}
