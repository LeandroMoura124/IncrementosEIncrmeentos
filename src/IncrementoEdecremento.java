
public class IncrementoEdecremento{
    public static void main(String[] args){
        int i = 5;
        // i-- Ele pega o valor do i, e tira 1
        i--;
        System.out.println(i);//retorna 4

        i++; // adiciona 1, ao contrário do --
        System.out.println(i);

        //pré incremento e pós incremento - ++i --i -- i++ -- i--
        //vale lembrar que é sempre importante compreender a leitura do compilador do JAVA
        //ex, se eu mandar printar e adicionar, só que informar a variavel antes de atribuir o ++ 
        //ele irá ler apenas o valor antigo da variável, e depois adicionar 1

        int t = 6;
        System.out.println(t++); // retorna 6, leu o ++ depois 

        //jeito certo
        int e = 6;
        System.out.println(++e); // retorna 7, atribuiu um número antes de ler a variável


        //adiciona o resultado da operação no junto ao valor anterior

        int b = 10;

        b -=5;
        System.out.println(b); // retorna 5

        int z = 10;
        z +=5;
        System.out.println(z); // retorna 15

        int f = 10;
        f *=5;
        System.out.println(f); // retorna 50

        int a = 10;
        a /=2;
        System.out.println(a); // retorna 5

        int r = 10;
        r *=20;
        r %=3;
        System.out.println(r); //retorna 2, pois 200 dividido por 3 sobra 2


        byte o = 15;
        o +=200;
        System.out.println(o); // o byte estoura, entao o compilador se vira e acaba retornando um numero negativo

        

    }
}