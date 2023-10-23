public class Account {
    private String name;
    private String pin;
    private String account_number;
    private String phone;

    public Account(String name,String pin,String account_number,String phone){
        this.name=name;
        this.pin=pin;
        this.account_number=account_number;
        this.phone=phone;
    }

    public String getAccount_number() {
        return account_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
