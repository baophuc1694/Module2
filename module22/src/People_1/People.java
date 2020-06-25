package People_1;

public class People implements Doctor, Teacher {
    @Override
    public void injecting(){
        System.out.println("Injecting...");
    }
    @Override
    public void teaching(){
        System.out.println("Teaching...");
    }
}
