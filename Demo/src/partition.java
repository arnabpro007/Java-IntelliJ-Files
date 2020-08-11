import java.io.*;
import java.util.*;
class partition{
    public static void splitFile(File f) throws IOException {
        int partCounter = 1;
        int content;

        String fileName = f.getName();

        FileReader in = new FileReader(fileName);
        BufferedReader br = new BufferedReader(in);
        String filePartName = String.format("%s.%01d", fileName, partCounter++);
        File newFile = new File(f.getParent(), filePartName);

        while ((content = in.read()) !=-1) {
            char c = (char)content;
            String s= Character.toString(c);
            if(c=='>')
            {
                filePartName = String.format("%s.%01d", fileName, partCounter++);
                newFile = new File(f.getParent(), filePartName);
                try (FileOutputStream out = new FileOutputStream(newFile,true)) {
                    out.write(s.getBytes());
                }
            }
            else
            {
                try (FileOutputStream out = new FileOutputStream(newFile,true)) {
                    out.write(s.getBytes());
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        splitFile(new File("C:\\Users\\Arnab\\IdeaProjects\\Demo\\SRR801638.FASTA"));
    }
}
