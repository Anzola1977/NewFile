import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Main {
    public static void main(String[] args)  {
        File file = new File("C:\\Users\\zolaa\\Downloads\\pvz-abonnement-kuendigen.docx");
        Calendar calendar = Calendar.getInstance();
        //long modifiedFile = file.lastModified();
        //calendar.setTimeInMillis(modifiedFile);
        calendar.setTimeInMillis(file.lastModified());
        System.out.println(calendar.getTime());
        File file2 = new File("C:\\Users\\zolaa\\Test");
        boolean isCreated = file2.mkdir();

        File file3 = new File("C:\\Users\\zolaa\\Test\\Test1.txt");

        boolean isCreated3;
        try {
            isCreated3 = file3.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //System.out.println(isCreated3);
        System.out.println(file.length());
        //file3.delete();
        //System.out.println(file3.exists());
        //file2.delete();
        //System.out.println(file2.exists());
    }
}