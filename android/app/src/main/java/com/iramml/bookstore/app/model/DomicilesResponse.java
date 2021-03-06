package com.iramml.bookstore.app.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DomicilesResponse {
    private String code, message;
    private ArrayList<Domicile> domiciles;

    public DomicilesResponse() {
    }

    public DomicilesResponse(String code, String message, ArrayList<Domicile> domiciles) {
        this.code = code;
        this.message = message;
        this.domiciles = domiciles;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<Domicile> getDomiciles() {
        return domiciles;
    }

    public void setDomiciles(ArrayList<Domicile> domiciles) {
        this.domiciles = domiciles;
    }
}
