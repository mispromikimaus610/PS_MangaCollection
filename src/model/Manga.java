/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author milos
 */
public class Manga {
    private int id;
    private String naziv;
    private Autor autor;
    private String ISBN;
    private int godinaIzdanja;
    private Zanr zanr;
    private int tom;
    private int poslednjiTom;

    public Manga() {
    }

    public Manga(int id, String naziv, Autor autor, String ISBN, int godinaIzdanja, Zanr zanr, int tom, int poslednjiTom) {
        this.id= id;
        this.naziv = naziv;
        this.autor = autor;
        this.ISBN = ISBN;
        this.godinaIzdanja = godinaIzdanja;
        this.zanr = zanr;
        this.tom = tom;
        this.poslednjiTom = poslednjiTom;
    }
    
    public Manga(String naziv, Autor autor, String ISBN, int godinaIzdanja, Zanr zanr, int tom, int poslednjiTom) {
        this.naziv = naziv;
        this.autor = autor;
        this.ISBN = ISBN;
        this.godinaIzdanja = godinaIzdanja;
        this.zanr = zanr;
        this.tom = tom;
        this.poslednjiTom = poslednjiTom;
    }

    public int getTom() {
        return tom;
    }

    public void setTom(int tom) {
        this.tom = tom;
    }

    public int getPoslednjiTom() {
        return poslednjiTom;
    }

    public void setPoslednjiTom(int poslednjiTom) {
        this.poslednjiTom = poslednjiTom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    

    public Zanr getZanr() {
        return zanr;
    }

    public void setZanr(Zanr zanr) {
        this.zanr = zanr;
    }
    
    

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    @Override
    public String toString() {
        return "Manga{" + "naziv=" + naziv + ", autor=" + autor + ", ISBN=" + ISBN + ", godinaIzdanja=" + godinaIzdanja + ", zanr=" + zanr + ", tom=" + tom + ", poslednjiTom=" + poslednjiTom + '}';
    }
   

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Manga other = (Manga) obj;
        if (this.godinaIzdanja != other.godinaIzdanja) {
            return false;
        }
        if (!Objects.equals(this.naziv, other.naziv)) {
            return false;
        }
        if (!Objects.equals(this.ISBN, other.ISBN)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }
    
    
    
}
