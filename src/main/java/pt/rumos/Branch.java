package pt.rumos;

public class Branch {
    String branchName;
    int branchCode;
    int clientCount;

    public String getBranchName() {
        return branchName;
    }
    public void setBranchName(String newBranchName) {
        this.branchName = newBranchName;
    }

    public int getBranchCode() {
        return branchCode;
    }
    public void setBranchCode(int newBranchCode) {
        this.branchCode = newBranchCode;
    }

    public int getClientCount() {
        return clientCount;
    }
    public void setClientCount(int newClientCount) {
        this.clientCount = newClientCount;
    }

}
