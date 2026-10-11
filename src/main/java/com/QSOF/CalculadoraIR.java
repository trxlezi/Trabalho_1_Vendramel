package com.QSOF;

public class CalculadoraIR
{
    public static double calcularIR(double salario)
    {
        if (salario < 0)
        {
            throw new IllegalArgumentException(
                "O rendimento não pode ser negativo."
            );
        }

        double impostoBruto = salario * 0.275;
        double desconto;

        if (salario <= 5000.00)
        {
            desconto = 100.0;
        }
        else if (salario <= 5500.00)
        {
            desconto = 75.0;
        }
        else if (salario <= 6000.00)
        {
            desconto = 50.0;
        }
        else if (salario <= 6500.00)
        {
            desconto = 25.0;
        }
        else if (salario <= 7350.00)
        {
            desconto = 10.0;
        }
        else
        {
            desconto = 0.0;
        }

        return impostoBruto * (1 - desconto / 100.0);
    }
}
