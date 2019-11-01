package com.tecnoshared.estadistica.Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    private String db,url,user,clave;

    public conexion() {
    }

    public void setDb(String db) {
        this.db = db;
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
    
    public Connection conectar(){
        Connection link = null;
        try {
            //Cargamos el driver de conexion
            Class.forName("org.postgresql.Driver");
            link = DriverManager.getConnection(getUrl()+getDb(),getUser(),getClave());
            JOptionPane.showConfirmDialog(null, "Conexión establecida con la base de datos llamada: "+ getDb());
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }
}
