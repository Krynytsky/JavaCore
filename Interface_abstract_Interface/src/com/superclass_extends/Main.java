package com.superclass_extends;

class Main {

    public static void main(String[] args) {

//	Coordinator coordinator = new Coordinator();
//	coordinator.setUserName("Yurii");
//	coordinator.setId(12);
//	coordinator.setStatus("coordinator");
//	coordinator.greeteng();
//	System.out.println(coordinator);



    }
}


 class Worker {
    private int id;
    private String userName;

    public void greeteng() {
        System.out.println("hello " + this.userName);
    }

    public Worker() {
    }

    public Worker(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Worker{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}

class Coordinator extends Worker {
    private String status;

    public Coordinator(){

    }

    public Coordinator(String status) {
        this.status = status;
    }

    public Coordinator(int id, String userName, String status) {
        super(id, userName);
        this.status = status;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Coordinator{" +
                "status='" + status + '\'' +
                "} " + super.toString();
    }

    @java.lang.Override
    public  void greeteng() {
        System.out.println("hello my dear" + " "
                + super.getUserName()+" yo are the best coordinator");
    }
}


