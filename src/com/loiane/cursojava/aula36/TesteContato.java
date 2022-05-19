package com.loiane.cursojava.aula36;

public class TesteContato {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Samara");
        //contato.setEndereco("Rua Azul");
        //contato.setTelefone("(11) 99999-9999");

        //criar objeto enderco
        Endereco endereco = new Endereco();
        endereco.setNomeRua("Rua Azul");
        endereco.setComplemento("Perto da Rua Rosa");
        endereco.setCidade("Quatro-Bocas");
        endereco.setEstado("PA");
        endereco.setCep("99999-0000");
        endereco.setNumero("999");

        contato.setEndereco(endereco);

        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco().getCidade());
        System.out.println(contato.getTelefones());

        Telefone telefone = new Telefone();

        telefone.setTipo("casa");
        telefone.setDdd("(94)");
        telefone.setNumero("8888-999");


        Telefone telefone2 = new Telefone();

        telefone2.setTipo("celular");
        telefone2.setDdd("(91)");
        telefone2.setNumero("9999-999");

        //Telefone[] telefones new = Telefone[2];
        //telefones[0] = telefone;
        //telefone2[1] = telefone2;
    }
}
