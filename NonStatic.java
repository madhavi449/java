public class NonStatic{
    public void add()
    {
        int a = 8;
        int b = 5;
        int c = a+b;
        System.out.println(c);
    }
        public static void main(String[] args){
            Main m = new Main();
			m.add();
        }
}