import domain.FamilyTicket;
import domain.HalfPriceTicket;

public class Main {
    public static void main(String[] args) {
        HalfPriceTicket halfPriceTicket = new HalfPriceTicket(18d, "Madagascar", false);
        FamilyTicket familyTicket = new FamilyTicket(18d, "Madagascar", false, 3);
        FamilyTicket bigFamilyTicket = new FamilyTicket(18d, "Madagascar", false, 6);

        System.out.println("Half Price Ticket: " + halfPriceTicket.finalValue());
        System.out.println("Family Ticket: " + familyTicket.finalValue());
        System.out.println("Big Familt Ticket: " + bigFamilyTicket.finalValue());
    }
}
