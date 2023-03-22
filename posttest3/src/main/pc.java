package main;

public class pc extends Item{
    int idpc;
    String status;
    public pc(String name, int price,int idpc,String status) {
        super(name, price);
        this.idpc = idpc;
        this.status = status;
}
public String getStatus() {
    return status;
}

public int getIdpc() {
    return idpc;
}
public void setIdpc(int idpc) {
    this.idpc = idpc;
}

public void setStatus(String status) {
    this.status = status;
}

}
