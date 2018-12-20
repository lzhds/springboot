package com.example.springboot.pojo;

import java.io.Serializable;

public class Customer implements Serializable{
    private Integer id;

    private String customer_name;

    private String customer_contact;

    private String customer_leader;

    private String customer_telephone;

    private String customer_email;

    private String customer_address;

    private int customer_state;

    private Integer start;
    private Integer rows;


    public Integer getStart() {
        return start;
    }
    public void setStart(Integer start) {
        this.start = start;
    }
    public Integer getRows() {
        return rows;
    }
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_contact() {
        return customer_contact;
    }

    public void setCustomer_contact(String customer_contact) {
        this.customer_contact = customer_contact;
    }

    public String getCustomer_leader() {
        return customer_leader;
    }

    public void setCustomer_leader(String customer_leader) {
        this.customer_leader = customer_leader;
    }

    public String getCustomer_telephone() {
        return customer_telephone;
    }

    public void setCustomer_telephone(String customer_telephone) {
        this.customer_telephone = customer_telephone;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public int getCustomer_state() {
        return customer_state;
    }

    public Customer(Integer id, String customer_name, String customer_contact, String customer_leader,
                    String customer_telephone, String customer_email, String customer_address, int customer_state
    ) {
        super();
        this.id = id;
        this.customer_name = customer_name;
        this.customer_contact = customer_contact;
        this.customer_leader = customer_leader;
        this.customer_telephone = customer_telephone;
        this.customer_email = customer_email;
        this.customer_address = customer_address;
        this.customer_state = customer_state;

    }
    public Customer() {
        super();
    }
    public void setCustomer_state(int customer_state) {
        this.customer_state = customer_state;
    }


    @Override
    public String toString() {
        return "User [id=" + id + ", customer_name=" + customer_name + ", customer_contact=" + customer_contact
                + ", customer_leader=" + customer_leader + ", customer_telephone=" + customer_telephone
                + ", customer_email=" + customer_email + ", customer_state" + customer_state + ", customer_address="
                + customer_address + "]";
    }
}