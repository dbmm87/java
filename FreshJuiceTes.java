class FreshJuice{
    enum FreshJuiceSize { SMALL, MEDIUM, LARGE}
    FreshJuiceSize Size;
}
public class FreshJuiceTes{
    public static void main( String []args){
        FreshJuice juice = new FreshJuice();
        juice.Size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Size:" + juice.Size);
    }
}