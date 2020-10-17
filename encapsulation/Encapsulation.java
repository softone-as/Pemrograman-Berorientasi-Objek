

package encapsulation;


public class Encapsulation {


    public static void main(String[] args) {
        
        Customer customer1 = new Customer();
        
        customer1.setName("Shofwan");
        customer1.setDomicile("Tasikmalaya");
        customer1.setTypeShoes("Asics Gel Kayano 27");
        customer1.setSize(42);
        customer1.setPrice(650000);
        
        customer1.ToString();
        
        Customer customer2 = new Customer();
        
        customer2.setName("Ahmad");
        customer2.setDomicile("Bandung");
        customer2.setTypeShoes("Adidas Climacool");
        customer2.setSize(42);
        customer2.setPrice(500000);
        
        customer2.ToString();
        
        Customer customer3 = new Customer();
        
        customer3.setName("Syihab");
        customer3.setDomicile("Jakarta");
        customer3.setTypeShoes("Nike Kyrie 4");
        customer3.setSize(43);
        customer3.setPrice(600000);
        
        customer3.ToString();

    }
    
}
