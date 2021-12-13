package lasvegas;

import java.io.*;

public class Teste {

    public static void main(String[] args) {
        leitor();
    }

    private  static void escritor(){
        Hospede hospede = new Hospede("anderson","2348789237","28344");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hospede.ser"))){
            oos.writeObject(hospede);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private  static void leitor(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("hospede.ser"))){
            Hospede hospede = (Hospede) ois.readObject();
            System.out.println(hospede);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
