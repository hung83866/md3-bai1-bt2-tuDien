package model;

public class Library {
    private String VN;
    private String EngLish;

    public Library(String VN, String engLish) {
        this.VN = VN;
        EngLish = engLish;
    }

    public Library() {
    }

    public String getVN() {
        return VN;
    }

    public void setVN(String VN) {
        this.VN = VN;
    }

    public String getEngLish() {
        return EngLish;
    }

    public void setEngLish(String engLish) {
        EngLish = engLish;
    }
}
