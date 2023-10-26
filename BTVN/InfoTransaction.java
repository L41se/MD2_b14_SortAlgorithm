package BTVN;

public class InfoTransaction {
    private String name;
    private String typeOfTransaction;;
    private double amount;
    private String date;

    public InfoTransaction(String name, String typeOfTransaction, double amount, String date) {
        this.name = name;
        this.typeOfTransaction = typeOfTransaction;
        this.amount = amount;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfTransaction() {
        return typeOfTransaction;
    }

    public void setTypeOfTransaction(String typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "InfoTransaction{" +
                "name='" + name + '\'' +
                ", typeOfTransaction='" + typeOfTransaction + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
}
