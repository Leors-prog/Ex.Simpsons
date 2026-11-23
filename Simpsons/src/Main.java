public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        // 1 Adicione Homer e Marge e imprima
        System.out.println("1.");
        lista.inserir("Homer");
        lista.inserir("Marge");
        lista.exibir();                       // [ Homer Marge ]

        // 2 Esvazie e imprima
        System.out.println("2.");
        lista.esvaziar();
        lista.exibir();                       // [ ]

        // 3 Homer; Bart na pos 0; Moll na pos 1; imprima
        System.out.println("3.");
        lista.inserir("Homer");               // [ Homer ]
        lista.inserirNaPosicao(0, "Bart");    // [ Bart Homer ]
        lista.inserirNaPosicao(1, "Moll");    // [ Bart Moll Homer ]
        lista.exibir();

        // 4 Esvazie
        System.out.println("4.");
        lista.esvaziar();

        // 5 Homer, Bart; Lisa no início; imprima e tamanho
        System.out.println("5.");
        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.inserirNoInicio("Lisa");        // [ Lisa Homer Bart ]
        lista.exibir();
        System.out.println("Tamanho = " + lista.getTamanho()); // 3

        // 6 Esvazie e imprima
        System.out.println("6.");
        lista.esvaziar();
        lista.exibir();

        // 7 Homer, Maggie; Bart pos 0; Marge pos 1; imprima; verifique Lisa
        System.out.println("7.");
        lista.inserir("Homer");
        lista.inserir("Maggie");              // [ Homer Maggie ]
        lista.inserirNaPosicao(0, "Bart");    // [ Bart Homer Maggie ]
        lista.inserirNaPosicao(1, "Marge");   // [ Bart Marge Homer Maggie ]
        lista.exibir();
        System.out.println("Lisa está na lista? " + lista.contem("Lisa")); // false

        // 8 Esvazie
        System.out.println("8.");
        lista.esvaziar();

        // 9 Homer, Bart; imprima e tamanho
        System.out.println("9.");
        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.exibir();                       // [ Homer Bart ]
        System.out.println("Tamanho = " + lista.getTamanho()); // 2

        // 10 Verifique Marge, Homer, Bart, Maggie; imprima e tamanho
        System.out.println("10.");
        System.out.println("Marge?  " + lista.contem("Marge"));
        System.out.println("Homer?  " + lista.contem("Homer"));
        System.out.println("Bart?   " + lista.contem("Bart"));
        System.out.println("Maggie? " + lista.contem("Maggie"));
        lista.exibir();
        System.out.println("Tamanho = " + lista.getTamanho()); // 2

        // 11 Esvazie
        System.out.println("11.");
        lista.esvaziar();

        // 12 Homer e Bart no começo; Marge; Maggie pos 1; Ned Flanders no começo; Sr. Burns no final
        System.out.println("12.");
        lista.inserirNoInicio("Homer");        // [ Homer ]
        lista.inserirNoInicio("Bart");         // [ Bart Homer ]
        lista.inserir("Marge");                // [ Bart Homer Marge ]
        lista.inserirNaPosicao(1, "Maggie");   // [ Bart Maggie Homer Marge ]
        lista.inserirNoInicio("Ned Flanders"); // [ Ned Flanders Bart Maggie Homer Marge ]
        lista.inserir("Sr. Burns");            // [ Ned Flanders Bart Maggie Homer Marge Sr. Burns ]
        lista.exibir();

        // 13 Remova do fim e imprima
        System.out.println("13.");
        lista.removerDoFim();                  // remove Sr. Burns
        lista.exibir();

        // 14 Remova a posição 1; imprima e tamanho
        System.out.println("14.");
        lista.removerDaPosicao(1);             // remove Bart (pos 1)
        lista.exibir();
        System.out.println("Tamanho = " + lista.getTamanho());

        // 15 Verifique Marge, Homer, Bart, Maggie; imprima e tamanho
        System.out.println("15.");
        System.out.println("Marge?  " + lista.contem("Marge"));
        System.out.println("Homer?  " + lista.contem("Homer"));
        System.out.println("Bart?   " + lista.contem("Bart"));
        System.out.println("Maggie? " + lista.contem("Maggie"));
        lista.exibir();
        System.out.println("Tamanho = " + lista.getTamanho());

        // 16 Remova do começo; imprima e tamanho
        System.out.println("16.");
        lista.removerDoInicio();               // remove Ned Flanders
        lista.exibir();
        System.out.println("Tamanho = " + lista.getTamanho());

        // 17 Verifique Marge, Homer, Bart, Maggie; imprima e tamanho
        System.out.println("17.");
        System.out.println("Marge?  " + lista.contem("Marge"));
        System.out.println("Homer?  " + lista.contem("Homer"));
        System.out.println("Bart?   " + lista.contem("Bart"));
        System.out.println("Maggie? " + lista.contem("Maggie"));
        lista.exibir();
        System.out.println("Tamanho = " + lista.getTamanho());

        // 18 Esvazie e imprima
        System.out.println("18.");
        lista.esvaziar();
        lista.exibir();
    }
}