import java.math.BigDecimal;

public class Main {

    // Exercício 1
    static void ex1() {
        int nota = 8;
        Integer notaObj = nota;
        System.out.println(nota);
        System.out.println(notaObj);
        System.out.println(notaObj.getClass().getSimpleName()); // Integer
    }

    // Exercício 2
    static void ex2() {
        Integer x = null;
        // int y = x; // NullPointerException: unboxing de null
        System.out.println("Ex2: tentativa de unboxing de null lança NullPointerException");
    }

    // Exercício 3
    static void ex3() {
        Integer a = 127, b = 127;
        System.out.println(a == b);      // true (cache -128 a 127)

        Integer c = 200, d = 200;
        System.out.println(c == d);      // false (objetos diferentes)
        System.out.println(c.equals(d)); // true (compara valor)
    }

    // Exercício 4
    static void ex4() {
        BigDecimal preco    = new BigDecimal("49.90");
        BigDecimal qtd      = new BigDecimal("3");
        BigDecimal desconto = new BigDecimal("0.95");
        BigDecimal total    = preco.multiply(qtd).multiply(desconto);
        System.out.println("Total: R$ " + total); // R$ 142.2150
    }

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }
}