package com.ttn.bootcamp.componentmapping.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Salary {

    private float basicsalary;
    private float bonussalary;
    private float taxamount;
    private float specialallowancesalary;

    public float getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(float basicsalary) {
        this.basicsalary = basicsalary;
    }

    public float getBonussalary() {
        return bonussalary;
    }

    public void setBonussalary(float bonussalary) {
        this.bonussalary = bonussalary;
    }

    public float getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(float taxamount) {
        this.taxamount = taxamount;
    }

    public float getSpecialallowancesalary() {
        return specialallowancesalary;
    }

    public void setSpecialallowancesalary(float specialallowancesalary) {
        this.specialallowancesalary = specialallowancesalary;
    }
}
