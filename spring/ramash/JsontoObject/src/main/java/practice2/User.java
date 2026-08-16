package practice2;

public class User {
    int userID;
    String userName;
    long phoneNumber;

    public User() {}

    public User(int userID, String userName, long phoneNumber) {
        this.userID = userID;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
