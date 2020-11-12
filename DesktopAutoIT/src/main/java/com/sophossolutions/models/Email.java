package com.sophossolutions.models;

public class Email {

    private String destinatario;
    private String asunto;
    private String contenido;

    public Email(String destinatario, String asunto, String contenido) {
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.contenido = contenido;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
