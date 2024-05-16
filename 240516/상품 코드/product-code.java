import java.util.Scanner;

class Product {
    String name;
    int code;

    Product() {
        name = "codetree";
        code = 50;
    }

    Product(String str, int n) {
        this.name = str;
        this.code = n;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product pr = new Product();
        System.out.printf("product %d is %s\n", pr.code, pr.name);
        
        Product pr2 = new Product(sc.next(), sc.nextInt());
        System.out.printf("product %d is %s\n", pr2.code, pr2.name);
    }
}