package ch8.clone;

/**
 * Created by RayYu on 2016/12/7.
 */
public class Customer implements Cloneable{
    private Address address = null;
    public Customer(Address address){
        this.setAddress(address);
    }
    public Object clone()  {
        Object obj = null;

        try{
            obj = super.clone();
            return obj;
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }

    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void display(){
        getAddress().showAddress();
    }

}
