package uz.ali.finance98.models;

public class Users {
    String name;
    String trans;
    String sum;

    public Users(String name, String trans, String sum) {
        this.name = name;
        this.trans = trans;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }
}
