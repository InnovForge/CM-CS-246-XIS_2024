/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import Helper.HelperArgon2;
import LoginComponent.Login;

/**
 *
 * @author harvous
 */
public class App {

    Login login;
    DB db;

    void run() {
        Helper.HelperArgon2 argon2 = new HelperArgon2();
        String sessionID = Helper.WrSettings.getProperty("sessionID");

        if (db.getSession() != null && argon2.verify(db.getSession(), sessionID.toCharArray())) {
            MainForm mainForm = new MainForm();
            mainForm.setVisible(true);
        } else {
            db.deleteSession();
            login.setVisible(true);
        }


    }

    public App() {
        login = new Login();
        db = new DB();
        db.createSQL();
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
    
}
