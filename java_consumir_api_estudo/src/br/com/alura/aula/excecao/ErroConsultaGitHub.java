package br.com.alura.aula.excecao;

public class ErroConsultaGitHub extends RuntimeException {
    public ErroConsultaGitHub(String mensagem) {
        super(mensagem);
    }
}
