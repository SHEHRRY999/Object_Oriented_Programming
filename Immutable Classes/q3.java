/*   Write a Java class representing an immutable currency, with fields representing the code 
(e.g. "USD", "EUR"), the symbol (e.g. "$", "€"), and the exchange rate to a base currency (e.g. 
USD). Include a constructor and getter methods for each field, as well as a method to convert 
an amount from the currency to the base currency. */
final class Currency {
    private final String code;
    private final String symbol;
    private final double exchangeRateToBase;

    public Currency(String code, String symbol, double exchangeRateToBase) {
        this.code = code;
        this.symbol = symbol;
        this.exchangeRateToBase = exchangeRateToBase;
    }

    public String getCode() {
        return code;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getExchangeRateToBase() {
        return exchangeRateToBase;
    }

    public double convertToBase(double amount) {
        return amount * exchangeRateToBase;
    }
}
class q3
{
    public static void main(String[] args) {
        Currency usd = new Currency("USD", "$", 1.0);
        Currency eur = new Currency("EUR", "€", 0.85);

        double amountInEur = 100.0;
        double amountInUsd = eur.convertToBase(amountInEur);

        System.out.println(amountInEur + " " + eur.getCode() + " is equal to " + amountInUsd + " " + usd.getCode());
    }
}
