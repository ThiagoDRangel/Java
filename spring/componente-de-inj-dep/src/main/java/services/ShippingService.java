package services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double valor;
    public double frete;

    public double calculo(double valor) {
        if (valor < 100) {
            frete = 20.00;
        }
        else if (valor >= 100 && valor < 200) {
            frete = 12.00;
        }
        else {
            frete = 0;
        }
        return frete;
    }
}
