/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import javax.swing.JOptionPane;

/**
 *
 * @author Tsukinami
 */
public class Popup {
    
    public static void main (String[] args){
        JOptionPane.showMessageDialog(null, "Selamat datang di Sistem Perpustakaan");
        new login().setVisible(true);
    }
    
    
}
