package obliczenia;


import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Mime {
    String ext;
    String mt;

    public Mime(String ext, String mt){
        this.ext = ext.toLowerCase();
        this.mt = mt;
    }

    public String getExt(){
        return this.ext;
    }
    public String getMt(){
        return this.mt;
    }

}

class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        List<Mime> list = new ArrayList();

        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            Mime mime = new Mime(EXT,MT);
            list.add(mime);
        }
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine();// One file name per line.
            if(FNAME.contains(".")){
                int lastDot = FNAME.lastIndexOf('.');
                String searchEXT = FNAME.substring(lastDot + 1).toLowerCase();
                for(int j=0;j<list.size();j++){
                    if(searchEXT.equals(list.get(j).getExt())) {
                        System.out.println(list.get(j).getMt());
                    }
                }
            }else System.out.println("UNKNOWN");

        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");


        // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
        //System.out.println("UNKNOWN");
    }
}