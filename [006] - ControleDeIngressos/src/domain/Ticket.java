package domain;

abstract sealed class Ticket permits HalfPriceTicket, FamilyTicket {
    protected double value;
    protected String movieName;
    protected boolean itIsSubtitled;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public boolean isItIsSubtitled() {
        return itIsSubtitled;
    }

    public void setItIsSubtitled(boolean itIsSubtitled) {
        this.itIsSubtitled = itIsSubtitled;
    }

    abstract String finalValue();
}
