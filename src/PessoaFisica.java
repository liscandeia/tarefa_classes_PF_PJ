/**
 * My Awesome Project
 * <p>
 * Description: This project does something amazing and solves a specific problem.
 *
 * @author Lis de Lima
 * @version 1.0
 * @project exercicio_classes_PF_PJ
 * @since 20/12/2023 - 12:03
 * <p>
 * Copyright (c) 2023 Lis de Lima. All rights reserved.
 */
public class PessoaFisica extends Pessoa {
    private String cpf;

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String name, String adress, String email, Double proft, String cpf) {
        super(name, adress, email, proft);
        this.cpf = cpf;
    }

    public String getType() {
        return "PF";
    }

    public String setType() {
        return null;
    }

    public Double calculateTax() {
        return this.getProft() >= 10000.0 ? this.getProft() - this.getProft() * 0.05 : this.getProft();
    }
}

