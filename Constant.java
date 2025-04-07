class Studet{
    final int Mole;
    Studet(int m){
        this.Mole=m;
    }
    void print(){
        System.out.println(Mole);
    }

}
public class Constant {
    public static void main(String[] args) {
        Studet s=new Studet(99);
        s.print();
    }
}
