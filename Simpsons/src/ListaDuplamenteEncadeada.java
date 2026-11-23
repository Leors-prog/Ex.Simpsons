public class ListaDuplamenteEncadeada {

    // nó
    class No {
        String valor;
        No anterior;
        No proximo;

        No(String valor) {
            this.valor = valor;
            this.anterior = null;
            this.proximo = null;
        }
    }

    No inicio;
    No fim;
    int tamanho;

    ListaDuplamenteEncadeada() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    // Inserir no final
    void inserir(String valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
        tamanho++;
    }

    // Inserir no início
    void inserirNoInicio(String valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
        tamanho++;
    }

    // Inserir na posição
    void inserirNaPosicao(int posicao, String valor) {
        if (posicao <= 0) {
            inserirNoInicio(valor);
        } else if (posicao >= tamanho) {
            inserir(valor);
        } else {
            No atual = inicio;
            for (int i = 0; i < posicao; i++) {
                atual = atual.proximo;
            }
            No anterior = atual.anterior;
            No novoNo = new No(valor);
            novoNo.anterior = anterior;
            novoNo.proximo = atual;
            anterior.proximo = novoNo;
            atual.anterior = novoNo;
            tamanho++;
        }
    }

    // Remover por valor
    void remover(String valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor.equals(valor)) {
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    inicio = atual.proximo;
                }
                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                } else {
                    fim = atual.anterior;
                }
                atual = null;
                tamanho--;
                return;
            }
            atual = atual.proximo;
        }
    }

    // Remover do início
    void removerDoInicio() {
        if (inicio == null) return;
        inicio = inicio.proximo;
        if (inicio != null) {
            inicio.anterior = null;
        } else {
            fim = null;
        }
        tamanho--;
    }

    // Remover do fim
    void removerDoFim() {
        if (fim == null) return;
        fim = fim.anterior;
        if (fim != null) {
            fim.proximo = null;
        } else {
            inicio = null;
        }
        tamanho--;
    }

    // Remover da posição
    void removerDaPosicao(int posicao) {
        if (posicao == 0) {
            removerDoInicio();
            return;
        }
        if (posicao == tamanho - 1) {
            removerDoFim();
            return;
        }
        No atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        atual.anterior.proximo = atual.proximo;
        atual.proximo.anterior = atual.anterior;
        tamanho--;
    }

    // Contem
    boolean contem(String valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor.equals(valor)) return true;
            atual = atual.proximo;
        }
        return false;
    }

    // Tamanho
    int getTamanho() {
        return tamanho;
    }

    // Esvaziar
    void esvaziar() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    // Exibir
    void exibir() {
        No atual = inicio;
        System.out.print("[ ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println("]");
    }
}