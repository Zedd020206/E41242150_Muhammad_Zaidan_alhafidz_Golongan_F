package Praktik_wsibd_minggu2_hari1;

public class Praktik_No3 {
    static class book {
        int price;
        int pages;
        
        public void set (int price, int pages) {
            this.price = price;
            this.pages = pages;
            
        }
        public void show (){
            System.out.println("book information ");
            System.out.println("book price      : " +price);
            System.out.println("number of pages : " +pages);
        }
    }
   
            public static void main(String[] args) {
            book javabook = new book();
            javabook.set(60000, 100);
            javabook.show();
            
        }
    }
    
        
