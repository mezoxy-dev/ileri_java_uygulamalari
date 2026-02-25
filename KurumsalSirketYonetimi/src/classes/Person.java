package classes;

public abstract class Person extends BaseEntity {
    protected String name;
    protected int age;

    public void showProfile(){
        System.out.println("Adınız: "+this.name+"Yaşı: "+this.age);
    }
}
