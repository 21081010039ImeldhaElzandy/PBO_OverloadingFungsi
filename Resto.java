package resto;

public class Resto {
    
    // MENU
    public static class Menu {
        String nama_menu;
        int harga;
    
    public Menu(String nama_menu, int harga) {
        this.nama_menu = nama_menu;
        this.harga = harga;
    }
    
    public String toString() {
        return "Nama Menu = " + this.nama_menu + "\n" +
                "Harga = " + this.harga;
    }
}
    
    // MAKANAN
    public static class Makanan extends Menu {
        String deskripsi;
        
        public Makanan(String nama_menu, int harga, String deskripsi){
            super(nama_menu, harga);
            this.deskripsi = deskripsi;
        }
        
        public String toString() {
            return "Nama Makanan = " + this.nama_menu + "\n" + 
                    "Harga = " + this.harga + "\n" +
                    "Deskripsi Makanan = " + this.deskripsi + "\n";
        }
    }
    
    // MINUMAN
    public static class Minuman extends Menu {
        String banyak;
        
        public Minuman(String nama_menu, int harga, String banyak) {
            super(nama_menu, harga);
            this.banyak = banyak;
        }
        
        public String toString(){
            return "Nama Minuman = " + this.nama_menu + "\n" + 
                    "Harga = " + this.harga + "\n" +
                    "Banyak = " + this.banyak;
        }
    }
    // MAIN
    public static void main(String[] args) {
        Makanan makanan = new Makanan("Nasi Goreng", 
                20000, 
                "Nasi Goreng Seafood");
        System.out.println(makanan.toString());
        
        Minuman minuman = new Minuman("Es Teh", 
                5000, 
                "2 gelas");
        System.out.println(minuman.toString());
    }
}
