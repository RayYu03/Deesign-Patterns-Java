package ch8.deepClone;

import java.io.*;

/**
 * Created by RayYu on 2016/12/11.
 */
public class Customer implements Serializable{
    public Address address;
    public Customer(Address address){
        setAddress(address);
    }
    public void setAddress(Address address){
        this.address = address;
    }
    public Address getAddress(){
        return address;
    }
    public Object deepClone() throws IOException, ClassNotFoundException{
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (ois.readObject());
    }
    public void display(){
        getAddress().showAddress();
    }
}