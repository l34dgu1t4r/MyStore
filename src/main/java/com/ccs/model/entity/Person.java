package com.ccs.model.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

/**
 * Created by ANDERSON on 26/03/2016.
 */
@Entity
@Table(name = "persona")
public class Person implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idpersona", unique = true, nullable = false)
    private Integer id;

    @Column(name = "nombre_persona", length = 100)
    private String nombre;

    @Column(name = "apellido_persona", length = 100)
    private String apellido;

    @Column(name = "doc_identidad", unique = true)
    private Integer docIdentidad;

    @Column(name = "tlf_persona", length = 12)
    private String telefono;

    @Column(name = "direccion_persona")
    private String direccion;

    @Column(name = "usuario_id")
    private Integer usuarioId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDocIdentidad() {
        return docIdentidad;
    }

    public void setDocIdentidad(Integer docIdentidad) {
        this.docIdentidad = docIdentidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }
}
