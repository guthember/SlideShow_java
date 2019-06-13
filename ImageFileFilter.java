/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.slideshow;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author tanar
 */
public class ImageFileFilter extends FileFilter{

    @Override
    public boolean accept(File f) {
        boolean directory = f.isDirectory();
        if (directory) {
            return true;
        }
        
        String path = f.getAbsolutePath();
        boolean jpg = path.endsWith(".jpg");
        boolean png = path.endsWith(".png");
        boolean bmp = path.endsWith(".bmp");
        if (jpg || png || bmp) {
            return true;
        }
        
        return false;
    }

    @Override
    public String getDescription() {
        String description = "Images (*.jpg, *.png, *.bmp)";
        return description;
    }
    
}
