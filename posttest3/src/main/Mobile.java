package main;

public class Mobile {
    int idMobile;
    String Status;
    public Mobile(String name,int price,int idmobile,String Status){
        super();
        this.idMobile = idmobile;
        this.Status = Status;
    }
    public int getIdMobile() {
        return idMobile;
    }
 
    public String getStatus() {
        return Status;
    }
    public void setIdMobile(int idMobile) {
        this.idMobile = idMobile;
    }
  
    public void setStatus(String status) {
        Status = status;
    }
}
