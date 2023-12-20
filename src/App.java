/**
 * My Awesome Project
 * <p>
 * Description: This project does something amazing and solves a specific problem.
 *
 * @author Lis de Lima
 * @version 1.0
 * @project Default (Template) Project
 * @since 20/12/2023 - 12:02
 * <p>
 * Copyright (c) 2023 Lis de Lima. All rights reserved.
 */
    public class App {
        public static void main(String[] args) {
            PessoaFisica lis = new PessoaFisica("Lis", "Taguatinga","liscandeia523@gmail.com",7000.00,"00099900099");
            PessoaJuridica leo = new PessoaJuridica("Leandro","Taguatinga Sul", "12344@gmail.com",15000.00,"99990000/999");
            print(lis);
            print(leo);
        }
        public static void print (Pessoa pessoa){
            if (pessoa.getType().equals("PF")){
                PessoaFisica pessoaFisica = (PessoaFisica) pessoa;
                System.out.println("Olá "+ pessoa.getName() + " de cpf: "+ ((PessoaFisica) pessoa).getCpf() + " você entrou como pessoa física e seu saldo livre de impostos é de:  " + pessoa.calculateTax());
            } else if (pessoa.getType().equals("PJ")) {
                PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoa;
                System.out.println("Olá " + pessoa.getName() + " de cnpj: " + ((PessoaJuridica) pessoa).getCnpj() + " você entrou como pessoa juridica e seu livre de impostos é de: " + pessoa.calculateTax());
            }
        }
    }
