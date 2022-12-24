public class Twenty23 {
    public static void main(String[] args){
        CreditCard card = new CreditCard();
        card.setName("Annabeth Chase");
        card.setCreditCardNumber("3242542123112744");
        card.setCvv(633);
        card.setExpirationDate("01/25");
        System.out.println(card.getName());
        System.out.println(card.getCreditCardNumber());
        System.out.println(card.getExpirationDate());
        System.out.println(card.getCvv());
    }
}
