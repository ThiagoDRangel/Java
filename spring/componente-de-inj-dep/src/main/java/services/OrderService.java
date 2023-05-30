package services;

import org.springframework.stereotype.Service;

import services.ShippingService;

@Service
public class OrderService {
    public double percentage;
    public double valor;

    public double percentValue(double valor, double percentage) {
        double result = valor * (1 - (percentage / 100));
        System.out.println(result);
        return result;
    }

    public double calculateShipping(double valor) {
        ShippingService shippingService = new ShippingService();
        return shippingService.calculo(valor);
    }
}
