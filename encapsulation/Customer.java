
package encapsulation;


public class Customer {

    private String name;
    private String domicile;
    private String typeShoes;
    private int size;
    private double price;
    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getDomicile() {
        return domicile;
    }

    
    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    
    public String getTypeShoes() {
        return typeShoes;
    }

    
    public void setTypeShoes(String typeShoes) {
        this.typeShoes = typeShoes;
    }

    
    public int getSize() {
        return size;
    }

    
    public void setSize(int size) {
        this.size = size;
    }

    
    public double getPrice() {
        return price;
    }

    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void ToString(){
        System.out.println("Nama : " + this.name);
        System.out.println("Domisili : " + this.domicile);
        System.out.println("Jenis Sepatu : " + this.typeShoes);
        System.out.println("Ukuran : " + this.size);
        System.out.println("Harga : " + this.price + "\n");
    }
    
}
