import javax.swing.plaf.multi.MultiInternalFrameUI;

public class MultiplicationTableOO {
    private int baris;
    private int kolom;

    public void setBaris(int baris){
        this.baris = baris;
    }

    public int getBaris(){
        return baris;
    }

    MultiplicationTableOO(){

    }

    MultiplicationTableOO(int baris, int kolom){
        this.baris = baris;
        this.kolom = kolom;
    }

    public void cetak(){
        // Display the table heading
        System.out.println("           Multiplication Table");

        // Display the number title
        System.out.print("    ");
        for (int j = 1; j <= this.kolom; j++)
        System.out.print("   " + j);

        System.out.println("\n-----------------------------------------");

        // Print table body
        int i = 1;
        while ( i <= this.baris) {
        System.out.print(i + " | ");
        int j = 1;
        while ( j <= this.kolom) {
            // Display the product and align properly
            System.out.printf("%4d", i * j);
            j++;
        }
        System.out.println();
        i++;
        }
    }

  /** Main method */
  public static void main(String[] args) {

    MultiplicationTableOO table = new MultiplicationTableOO(5, 6);
    table.cetak();
    MultiplicationTableOO table37 = new MultiplicationTableOO(100, 7);
    table37.cetak();
    
    }
}
