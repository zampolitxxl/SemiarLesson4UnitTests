package Seminar5;

public class Contact {
    private String name;
    private String phone;
    public Contact(String name, String  phone) {

        this.name = name;
        this.phone = phone;

    }

    public  void  changeContactNamePhone(String name, String phone){
        this.name =name;
        this.phone =phone;

    }

    public  String getName (){
        return this.name;
    }



}
