package com.tecnoshared.estadistica.Logica;

import java.sql.Connection;

public class Datos {
    private String db,url,user,clave;
    private conexion postgres=new conexion();
    private Connection cn=postgres.conectar();
    private String sSQL="";
    public Integer totalregistros;

    public Datos() {
    }

    public void setDb(String db) {
        this.db = db;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDb() {
        return db;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getClave() {
        return clave;
    }
    
    
}
