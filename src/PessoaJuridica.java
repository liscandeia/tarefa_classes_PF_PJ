/**
 * My Awesome Project
 * <p>
 * Description: This project does something amazing and solves a specific problem.
 *
 * @author Lis de Lima
 * @version 1.0
 * @project exercicio_classes_PF_PJ
 * @since 20/12/2023 - 12:05
 * <p>
 * Copyright (c) 2023 Lis de Lima. All rights reserved.
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getType() {
        return "PJ";
    }

    public String setType() {
        return null;
    }

    public PessoaJuridica(String name, String adress, String email, Double proft, String cnpj) {
        super(name, adress, email, proft);
        this.cnpj = cnpj;
    }

    public Double calculateTax() {
        return this.getProft() - this.getProft() * 0.05;
    }
}

