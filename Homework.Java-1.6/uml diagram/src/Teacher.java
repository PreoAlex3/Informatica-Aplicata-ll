class Teacher extends Person {
    private String specialization;
    Teacher(String name, Address address, String specialization) {
        super(name, address);
        this.specialization = specialization;
    }
    public void changeTeacherAddress(Address address) {

        super.changeAddress(address);
    }

}
