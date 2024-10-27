public class EncapsulationAct {
    private String regNo;
    private String name;
    private int age;

    public String getRegNo(){
        return regNo;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setRegNo(String regNo){
        this.regNo=regNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
class TestEncapuslationAct{
    public static void main(String[] args) {
        EncapsulationAct a1 = new EncapsulationAct();
        a1.setRegNo("10001");
        a1.setName("Gayani");
        a1.setAge(23);

        System.out.println(a1.getRegNo());
        System.out.println(a1.getName());
        System.out.println(a1.getAge());
    }}