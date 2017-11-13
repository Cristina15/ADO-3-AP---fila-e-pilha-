
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.charAt;

/**
 * MATHEUS DE JESUS MAIA E VITORIA CRISTINA SILVA
 */
public class EXE1 {

    static String cripMessagem(String Messangem) {
        Pilha pilha = new Pilha();
        String mesgCrip = "";
        for (int i = 0; i < Messangem.length(); i++) {
            pilha.push(charAt(Messangem, i));

            if (charAt(Messangem, i).equals(" ") || (i + 1) == Messangem.length()) {
                do {
                    mesgCrip = mesgCrip + (String) pilha.pop();
                } while (pilha.isEmpty() == false);
                mesgCrip = mesgCrip + " ";
            }

        }

        return mesgCrip;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("1 - Criptografar Mensagem");
        System.out.println("2 - Descriptografar Mensagem\n"
                + "0 - Sair");
        int op = console.nextInt();
        do{
            if (op == 1) {
            System.out.print("Digite a messagem: ");
            String messa = console.next();
            String messagem = cripMessagem(messa);
            System.out.println("CRIPTOGRAFADA: " + messagem);
        } else if (op == 2) {
            System.out.print("Digite a messagem criptografada: ");
            String messa = console.next();
            String messagem = cripMessagem(messa);
            System.out.println("DESCRIPTOGRAFADA: " + messagem);
        }
        }while (op != 0);

    }
}
