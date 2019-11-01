package com.tecnoshared.estadistica.Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    private String url,user,clave;

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getClave() {
        return clave;
    }

    public conexion() {
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
    
    public Connection conectar(){
        Connection link = null;
        try {
            //Cargamos el driver de conexion
            Class.forName("org.postgresql.Driver");
            link = DriverManager.getConnection(getUrl(),getUser(),getClave());
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }
}
