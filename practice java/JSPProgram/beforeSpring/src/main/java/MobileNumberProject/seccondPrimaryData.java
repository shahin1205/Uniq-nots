package MobileNumberProject;

public class seccondPrimaryData {
    private String mobilenumber;
    private String address;

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "seccondPrimaryData{" +
                "mobilenumber='" + mobilenumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
