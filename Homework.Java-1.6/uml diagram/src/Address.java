class Address {
    private String street;
    private String city;
    private int postalCode;
    Address(String street, String city, int postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public void print()
    {
        System.out.print("Address: ");
        System.out.println(street+" "+city+" "+postalCode);
    }
}
