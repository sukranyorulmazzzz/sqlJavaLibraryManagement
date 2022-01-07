/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oraclejava.library;

/**
 *
 * @author sukra
 */
public class Librarian {
    private int librarianId;
    private String librarianName;
    private String librarianSurname;
    private String librarianTel;
    private String librarianUsername;
    private String librarianPassword;

    public Librarian(int librarianId, String librarianName, String librarianSurname, String librarianTel,String librarianUsername,String librarianPassword) {
        this.librarianId = librarianId;
        this.librarianName = librarianName;
        this.librarianSurname = librarianSurname;
        this.librarianTel = librarianTel;
        this.librarianUsername=librarianUsername;
        this.librarianPassword=librarianPassword;
    }

    public String getLibrarianUsername() {
        return librarianUsername;
    }

    public void setLibrarianUsername(String librarianUsername) {
        this.librarianUsername = librarianUsername;
    }

    public String getLibrarianPassword() {
        return librarianPassword;
    }

    public void setLibrarianPassword(String librarianPassword) {
        this.librarianPassword = librarianPassword;
    }

    public int getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(int librarianId) {
        this.librarianId = librarianId;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    public String getLibrarianSurname() {
        return librarianSurname;
    }

    public void setLibrarianSurname(String librarianSurname) {
        this.librarianSurname = librarianSurname;
    }

    public String getLibrarianTel() {
        return librarianTel;
    }

    public void setLibrarianTel(String librarianTel) {
        this.librarianTel = librarianTel;
    }
    
    
}
