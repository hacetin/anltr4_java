import java.io.File;
import java.util.Map;


public class Compiler {

    public static void main(String[] args) throws Exception {
        new Compiler().compile();
    }

    public void compile() throws Exception {
        final File new_EnkelFile = new File("first.enk");
        //String fileName = enkelFile.getName();
        String fileAbsolutePath = new_EnkelFile.getAbsolutePath();
        //String className = fileName.substring(0,fileName.length()-4);//To remove ".enk"
        SyntaxTreeTraverser stTraverser = new SyntaxTreeTraverser();
        stTraverser.walk(fileAbsolutePath);
    }
}
