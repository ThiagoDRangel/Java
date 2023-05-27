package services;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public double percentage;
    public int valor;

    public double percentValue(int valor, double percentage) {
        double result = valor * (1 - (percentage / 100));
        System.out.println(result);
        return result;
    }
}
