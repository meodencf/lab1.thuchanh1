
package bai1.a.thuchanh1;

public class  Vehicle{
    private float Trigiaxe;
    private String tenchuxe;
    private String Loaixe;
    private int Dungtich;

    public Vehicle(float Trigiaxe, String tenchuxe, String Loaixe, int Dungtich) {
        this.Trigiaxe = Trigiaxe;
        this.tenchuxe = tenchuxe;
        this.Loaixe = Loaixe;
        this.Dungtich = Dungtich;
    }

    public float getTrigiaxe() {
        return Trigiaxe;
    }

    public String getTenchuxe() {   
        return tenchuxe;
    }

    public String getLoaixe() {
        return Loaixe;
    }

    public int getDungtich() {
        return Dungtich;
    }

    public void setTrigiaxe(float Trigiaxe) {
        this.Trigiaxe = Trigiaxe;
    }

    public void setTenchuxe(String tenchuxe) {
        this.tenchuxe = tenchuxe;
    }

    public void setLoaixe(String Loaixe) {
        this.Loaixe = Loaixe;
    }

    public void setDungtich(int Dungtich) {
        this.Dungtich = Dungtich;
    }
    
    //hàm tính tien thuê
     public double tinhtienthue() {
        if (Dungtich < 100) {
            return Trigiaxe * 0.01;
        } else if (Dungtich < 200) {
            return Trigiaxe * 0.03;
        } else {
            return Trigiaxe * 0.05;
        }
    }
}
