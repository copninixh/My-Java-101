/*
    Static is a Java keyword reffering to how objectsare handled in memory
*/

public class MathClassI {
    public static void main(String[] args) {
        double absolute1 = Math.abs(100.53);
        double powerOf2 = Math.pow(2.0, 7.0); // 2^7
        System.out.println(absolute1 );
        System.err.println(powerOf2);
        System.out.println(Math.random() *100); // number between 0.0 - 1.0
        System.out.println((int)(Math.random() *100 +1)); // 1-100
        System.out.println((int)(Math.random() *36) +25); 
        // 25-60 หลักการคือว่า ถ้าต้องการเลขใน range ไหน สมมติ 25-60 ให้เอา 60-25  = จำนวนเลขที่อยู่ในช่วงทั้งหมด +อีก 1 ได้ 36
        // ส่วนอยากเริ่มเลขไหน ให้ไปอยู่หลัง *36
    }
    
}
