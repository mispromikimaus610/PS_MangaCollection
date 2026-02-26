/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Manga;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import model.Autor;
import model.Zanr;

/**
 *
 * @author milos
 */
public class DBBroker {

    public List<Manga> ucitajListuMangiIzBaze() {
        List<Manga> lista = new ArrayList<>();
        try {
            String upit = "SELECT * FROM manga m JOIN autor a ON m.autorid=a.id";
            Statement st = Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs= st.executeQuery(upit);
            while(rs.next()){
                int id = rs.getInt("m.id");
                String naziv = rs.getString("m.naziv");
                int godinaIzdanja =  rs.getInt("m.godinaIzdanja");
                String isbn = rs.getString("m.ISBN");
                String zanr = rs.getString("m.zanr");
                Zanr z = Zanr.valueOf(zanr);
                int tom = rs.getInt("m.tom");
                int poslednjiTom = rs.getInt("m.poslednjiTom");
                
                int ida = rs.getInt("a.id");
                String ime = rs.getString("a.ime");
                String prezime = rs.getString("a.prezime");
                int godinaRodjenja = rs.getInt("a.godinaRodjenja");
                String biografija = rs.getString("a.biografija");
                
                Autor a = new Autor(ida, ime, prezime, godinaRodjenja, biografija);
                
                Manga m = new Manga(id,naziv,a,isbn,godinaIzdanja,z,tom,poslednjiTom);
                lista.add(m);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public List<Autor> ucitajListuAutoraIzBaze() {
        List<Autor> listaA = new ArrayList<>();
        try {
            String upit = "SELECT * FROM autor a";
            Statement st = Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs= st.executeQuery(upit);
            while(rs.next()){
                
                int ida = rs.getInt("a.id");
                String ime = rs.getString("a.ime");
                String prezime = rs.getString("a.prezime");
                int godinaRodjenja = rs.getInt("a.godinaRodjenja");
                String biografija = rs.getString("a.biografija");
                
                Autor a = new Autor(ida, ime, prezime, godinaRodjenja, biografija);
                listaA.add(a);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaA;
    }

    public void obrisiManguIzBaze(int id) {
        PreparedStatement ps = null;
        try {
            String upit = "DELETE FROM manga WHERE id=?";
            ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setInt(1, id);
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public void dodajMangu(Manga novaManga) {
        try {
            System.out.println("Pokusavam da dodam mangu: " + novaManga.getNaziv());
            System.out.println("ID Autora koji saljem: " + novaManga.getAutor().getId());
        
            String upit = "INSERT INTO manga (id,naziv, autorId, godinaIzdanja, ISBN, zanr, tom, poslednjiTom)"
                    + " VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setInt(1, novaManga.getId());
            ps.setString(2, novaManga.getNaziv());
            ps.setInt(3, novaManga.getAutor().getId());
            ps.setInt(4, novaManga.getGodinaIzdanja());
            ps.setString(5,novaManga.getISBN());
            ps.setString(6, String.valueOf(novaManga.getZanr()));
            ps.setInt(7, novaManga.getTom());
            ps.setInt(8, novaManga.getPoslednjiTom());
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
            System.out.println("USPESNO DODATA MANGA!");
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public void azurirajMangu(Manga mangaZaIzmenu) {
        try {
        
            String upit = "UPDATE manga SET naziv=?, autorId=?, godinaIzdanja=?, Zanr=?, tom=?, poslednjiTom=? where id=?";
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setString(1, mangaZaIzmenu.getNaziv());
            ps.setInt(2, mangaZaIzmenu.getAutor().getId());
            ps.setInt(3, mangaZaIzmenu.getGodinaIzdanja());
            ps.setString(4, String.valueOf(mangaZaIzmenu.getZanr()));
            ps.setInt(5, mangaZaIzmenu.getTom());
            ps.setInt(6, mangaZaIzmenu.getPoslednjiTom());
            ps.setInt(7, mangaZaIzmenu.getId());
            
            
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
            System.out.println("USPESNO IZMENJENA MANGA!");
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
