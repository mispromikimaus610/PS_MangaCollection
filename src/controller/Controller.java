/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import baza.DBBroker;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SpringLayout;
import model.Autor;
import model.Manga;
import model.User;
import model.Zanr;

/**
 *
 * @author milos
 */
public class Controller {
    private DBBroker dbb;
    private List<Manga> listaMangi = new ArrayList<>();
    private List<Autor> listaAutora = new ArrayList<>();
    private List<User> listaUsera = new ArrayList<>();

    private static Controller instance; // Singleton

    public static Controller getInstance() {
        
        if(instance==null){
            instance=new Controller();
        }
        return instance;
    }
    public List<Manga> ucitajListuMangiIzBaze(){
        return dbb.ucitajListuMangiIzBaze();
    }
    
    
    private Controller() {
        dbb = new DBBroker();
        
//        User u1 = new User(1, "admin", "admin1");
//        User u2 = new User(2, "admin2", "admin2");
//        User u3 = new User(3, "admin3", "Admin3");
//        
//        listaUsera.add(u1);
//        listaUsera.add(u2);
//        listaUsera.add(u3);

        
        
    //        Autor autor1= new Autor("Tomohito", "Oda", 1991, "Oda je odrastao u prefekturi Aichi i još tokom srednje škole pokazivao izrazit talenat za crtanje. Inspiraciju za karijeru mangake dobio je nakon čitanja mange koju mu je preporučio brat. Njegov rani rad World’s Worst One naišao je na slabu recepciju, ali je iskustvo usmerilo njegov umetnički razvoj i stil.\n" +" ");
    //        Autor autor2= new Autor ("Chugong", null, 1984, "Прави идентитет аутора није откривен; „Chugong“ остаје псеудоним, док је познато да писац активно учествује у надгледању адаптација и одговара повремено на питања фанова. Његова дискретност и конзистентан квалитет писања учинили су га кључном фигуром у савременој дигиталној књижевности.");
    //        Autor autor3= new Autor("Eiichiro", "Oda", 1975, "Godine 1996. Oda je objavio dve piratske priče pod nazivom Romance Dawn, koje su bile prototip One Piece-a. Serijal je započeo 1997. i brzo postao globalni fenomen zahvaljujući složenom svetu, emotivnim likovima i temama poput slobode i pravde. One Piece je najprodavaniji strip svih vremena, premašivši i Batman-ove ukupne tiraže, a Oda drži Guinnessov rekord za najviše prodatih kopija jedne serije po autoru");
    //     
    //        Manga manga1= new Manga("Komi ne ume da komunicira", autor1, "9781974707126", 2016, Zanr.SLICE_OF_LIFE, 1, 30);
    //        Manga manga2= new Manga("Solo Leveling", autor2, "9791134868093", 2018, Zanr.ACTION, 1, 14);
    //        Manga manga3= new Manga("One Piece", autor3, "9781569319017", 1997, Zanr.SHONEN, 1, 107);
    //            
    //            listaMangi.add(manga1);
    //            listaMangi.add(manga2);
    //            listaMangi.add(manga3);
    //            
    //            listaAutora.add(autor1);
    //            listaAutora.add(autor2);
    //            listaAutora.add(autor3);
            
            
    }           

    public List<User> getListaUsera() {
        return listaUsera;
    }

    public void setListaUsera(List<User> listaUsera) {
        this.listaUsera = listaUsera;
    }

    
    
    public List<Manga> getListaMangi() {
        return listaMangi;
    }

    public void setListaMangi(List<Manga> listaMangi) {
        this.listaMangi = listaMangi;
    }

    public List<Autor> getListaAutora() {
        return listaAutora;
    }

    public void setListaAutora(List<Autor> listaAutora) {
        this.listaAutora = listaAutora;
    }

    public void obrisiMangu(int id) {
        
        dbb.obrisiManguIzBaze(id);
    }

    public void dodajMangu(Manga novaManga) {
//        listaMangi.add(novaManga);
//        System.out.println("MANGA JE DODATA");
//        System.out.println(listaMangi);
        dbb.dodajMangu(novaManga);
    
        }

    public List<Autor> ucitajListuAutoraIzBaze() {
        return dbb.ucitajListuAutoraIzBaze();
    }

    public void azurirajMangu(Manga mangaZaIzmenu) {
        dbb.azurirajMangu(mangaZaIzmenu);
    }

    public boolean proveriSifru(String user, String pass) {
//        for(User u:listaUsera){
//            if(u.getUsername().equals(user) && u.getPassword().equals(pass)){
//                return true;
//            }
//        }
//        return false;
        return dbb.proveriSifru(user, pass);
        
    }

}
