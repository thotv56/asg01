public class Print {
    int a=9;
    public static void main(String [] args){
        System.out.print("Ho Ten: Trần Văn Thọ \t");
        System.out.print("MSSV: 11020318 \t");
        System.out.print("Lop: K56CB \t");
        System.out.print("TK GitHub: thotv56 \t");
        System.out.print("email: thotv_56@vnu.edu.vn \n");
        Print p = new Print();
        p.print(9);
    }
    public void print(int a){
        for (int i=a;i>1;i--){
            System.out.println(i+" bottles of beer on the wall, "+i+" bottles of beer");
            System.out.println("Take one down, pass it around \n");
            
        }
            System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
			System.out.println("Take one down, pass it around,");
			System.out.println("No more bottles of beer on the wall.");
    }
 
   
}
