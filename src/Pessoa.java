/**
 * My Awesome Project
 * <p>
 * Description: This project does something amazing and solves a specific problem.
 *
 * @author Lis de Lima
 * @version 1.0
 * @project exercicio_classes_PF_PJ
 * @since 20/12/2023 - 12:04
 * <p>
 * Copyright (c) 2023 Lis de Lima. All rights reserved.
 */
public abstract class Pessoa {
    private String name;
    private String adress;
    private String email;
    private Double proft;
    private String type;

    public String getType() {
        return "generic";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getProft() {
        return this.proft;
    }

    public void setProft(Double proft) {
        this.proft = proft;
    }

    public Pessoa(String name, String adress, String email, Double proft) {
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.proft = proft;
    }

    public abstract String setType();

    public abstract Double calculateTax();
}
