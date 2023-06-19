/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mr.anrpts.shipping.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mailer
 */
@Entity
@Table(name = "document")
public class Document implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)

    @Column(name = "nud")
    private String nud;

    @Column(name = "etap")
    private int status;

    public Document() {
    }

    public String getNud() {
        return nud;
    }

    public void setNud(String nud) {
        this.nud = nud;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
   

}
