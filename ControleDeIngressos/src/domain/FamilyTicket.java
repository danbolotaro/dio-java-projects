package domain;

public non-sealed class FamilyTicket extends Ticket {
    private int numberOfPeople;

    public FamilyTicket(double value, String movieName, boolean itIsSubtitled, int numberOfPeople) {
        this.value = value;
        this.movieName = movieName;
        this.itIsSubtitled = itIsSubtitled;
        this.numberOfPeople = numberOfPeople;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public String finalValue() {
        if(this.numberOfPeople <= 3){
            return "R$" + (this.value * this.numberOfPeople);
        }

        return "R$" + ((this.value * this.numberOfPeople) - ((this.value * this.numberOfPeople) * 0.05));

    }
}
