package com.pw.box.core.db.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "KVS".
 */
public class Kvs {

    private String k;
    private byte[] v;

    public Kvs() {
    }

    public Kvs(String k) {
        this.k = k;
    }

    public Kvs(String k, byte[] v) {
        this.k = k;
        this.v = v;
    }

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public byte[] getV() {
        return v;
    }

    public void setV(byte[] v) {
        this.v = v;
    }

}
