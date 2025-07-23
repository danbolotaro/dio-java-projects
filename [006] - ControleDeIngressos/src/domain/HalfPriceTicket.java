package domain;

public non-sealed class HalfPriceTicket extends Ticket {

    public HalfPriceTicket(double value, String movieName, boolean itIsSubtitled) {
        this.value = value;
        this.movieName = movieName;
        this.itIsSubtitled = itIsSubtitled;
    }

    @Override
    public String finalValue() {
        return "R$" + (this.value / 2);

    }
}
