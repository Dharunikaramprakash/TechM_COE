import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.Serializable;
import java.io.IOException;
import java.io.ObjectInputStream;
public class EmpDetails implements Serializable{
    String name;
    String EmpID;
    transient String Email;
    EmpDetails(String name,String EmpID,String Email){
        this.name=name;
        this.EmpID=EmpID;
        this.Email=Email;
    }

public static void serialization(){
    try {
        EmpDetails em=new EmpDetails("ram","e101","ram101@gmail.com");
        FileOutputStream fout=new FileOutputStream("file1.txt");
        ObjectOutputStream objout=new ObjectOutputStream(fout);
        objout.writeObject(em);
        objout.flush();
        objout.close();
        System.out.println("serialization done successfully");
    } catch (IOException e) {
        System.out.println("IOexception occured " +e);
    }
}
public static void deserialization(){
        try{
            ObjectInputStream objin=new ObjectInputStream(new FileInputStream("file1.txt"));
            EmpDetails emp=(EmpDetails) objin.readObject();
            System.out.println("deserialized employee: "+emp.name+" "+emp.EmpID+" "+emp.Email);
            objin.close();


        } catch (Exception e) {
            System.out.println("deserialization error: "+ e);
        }
}

    public static void main(String[] args) {
        EmpDetails n = new EmpDetails("ram","e101","ram101@gmail.com");

        System.out.println(n.Email);
        serialization();
        deserialization();
    }
}



