import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.gui.TreeViewer;

public class SyntaxTreeTraverser {
    public void walk(String fileAbsolutePath) throws Exception {
        CharStream charStream = new ANTLRFileStream(fileAbsolutePath); //fileAbolutePath - file containing first enk code file
        new_EnkelLexer lexer = new new_EnkelLexer(charStream);  //create lexer (pass enk file to it)
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        new_EnkelParser parser = new new_EnkelParser(tokenStream);
        new_EnkelTreeWalkListener listener = new new_EnkelTreeWalkListener(); //new_EnkelTreeWalkListener extends new_EnkelBaseLitener - handles parse tree visiting events
        parser.addParseListener(listener);
        new_EnkelParser.CompilationUnitContext tree = parser.compilationUnit(); //compilation unit is root parser rule - start from it!
        
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 500);
        frame.setVisible(true);
    }
}
