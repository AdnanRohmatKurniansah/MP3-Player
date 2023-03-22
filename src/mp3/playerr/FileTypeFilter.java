/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3.playerr;

import java.io.File;
// membaca atau menulis file
import javax.swing.filechooser.FileFilter;
// memfilter jenis file

/**
 *
 * @author Acer
 */
//import javax.swing.filechooser.FileFilter;
public class FileTypeFilter extends FileFilter{
    
    private final String extension;
    // menyimpan ekstensi yg ingin difilter
    private final String description;
    //menyimpan deskripsi filter yg ingin ditampilkan
    
    // Constructor Method
    public FileTypeFilter(String extension, String description){
        
        this.extension = extension;
        this.description = description;
        // set value
    }
    @Override
    public boolean accept(File file) {
        
        if(file.isDirectory()){
            return true;
        }//memeriksa apakah suatu file merupakan sebuah direktori (folder
        
        return file.getName().endsWith(extension);
        //statement ini akan memeriksa apakah ekstensi file sesuai dengan nilai dari variabel instance extension yang telah ditentukan pada konstruktor.
    }

    @Override
    public String getDescription() {
        
        return description + String.format(" (*%s)", extension);
        //untuk mengembalikan deskripsi filter file beserta ekstensi file yang dapat diterima oleh filter tersebut
    }
}
