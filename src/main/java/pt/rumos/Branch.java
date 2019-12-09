package pt.rumos;

public class Branch {
    String branchName;
    int branchCode;
    int clientCount;

    public String getAgencyName() {
        return branchName;
    }
    public void setAgencyName(String newAgencyName) {
        this.branchName = newAgencyName;
    }

    public int getAgencyCode() {
        return branchCode;
    }
    public void setAgencyCode(int newAgencyCode) {
        this.branchCode = newAgencyCode;
    }

    public int getClientCount() {
        return clientCount;
    }
    public void setClientCount(int newClientCount) {
        this.clientCount = newClientCount;
    }

}
