package sk.peterrendek.springLearn2Code.zothers.services.impl;

public class PrintService {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void print(){
        System.out.println("@Author "+data+":");
    }
}
