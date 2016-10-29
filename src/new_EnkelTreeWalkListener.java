import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

//import org.stringtemplate.v4.compiler.Bytecode.Instruction;

public class new_EnkelTreeWalkListener extends new_EnkelBaseListener {
	PrintWriter out;
	int oldPointer, pointer, branchPointer;
	boolean branchFinish;
	
	/*Map<String, Variable> variables = new HashMap<>();

	public Map<String, Variable> getVarMap() {
		return variables;
	}*/

	public new_EnkelTreeWalkListener() {
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter("output.py")));
			out.close();// To delete old rows
			out = new PrintWriter(new BufferedWriter(new FileWriter("output.py", true)));
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
	}
	
	private void startGraphViz(String comment) {
		out.println("from graphviz import Digraph");
		out.println("dot = Digraph(comment=\'" + comment + "\')");
	}

	private void addNodeToGraphviz(int id, String nodeName) {
		out.println("dot.node(\'" + id + "\',\'" + nodeName + "\')");
	}

	private void addEdgeToGraphviz(int id1, int id2) {
		out.println("dot.edge(\'" + id1 + "\',\'" + id2 + "\')");
	}

	private void changePointer(int id) {
		oldPointer = pointer;
		pointer = id;
	}

	@Override
	public void enterCompilationUnit(new_EnkelParser.CompilationUnitContext ctx) {
		out.print("");
		startGraphViz("Control Flow Graph");
		changePointer(ctx.hashCode());
		addNodeToGraphviz(ctx.hashCode(), "START");
	}

	@Override
	public void exitCompilationUnit(new_EnkelParser.CompilationUnitContext ctx) {
		out.println("dot.render(filename=\'graph1\')");
		out.close();
	}

	@Override
	public void exitVariable(new_EnkelParser.VariableContext ctx) {
		TerminalNode id = ctx.ID();
		int nodeId = ctx.hashCode();
		addNodeToGraphviz(nodeId, "var " + id);
		changePointer(nodeId);
		if (branchFinish) {
			branchFinish = false;
			addEdgeToGraphviz(branchPointer, nodeId);
		}
		addEdgeToGraphviz(oldPointer, nodeId);		
	}

	@Override
	public void exitPrint(new_EnkelParser.PrintContext ctx) {
		TerminalNode id = ctx.ID();
		int nodeId = ctx.hashCode();
		addNodeToGraphviz(nodeId, "print " + id);
		changePointer(nodeId);
		if (branchFinish) {
			branchFinish = false;
			addEdgeToGraphviz(branchPointer, nodeId);
		}
		addEdgeToGraphviz(oldPointer, nodeId);
	}

	@Override
	public void enterIfStatement(new_EnkelParser.IfStatementContext ctx) {
		branchPointer = pointer;
	}

	@Override
	public void exitIfStatement(new_EnkelParser.IfStatementContext ctx) {
		branchFinish = true;//To add two edge to next node
	}

	@Override
	public void enterIfLable(new_EnkelParser.IfLableContext ctx) {
		int nodeId = ctx.hashCode();
		addNodeToGraphviz(nodeId, "if true");
		changePointer(nodeId);
		addEdgeToGraphviz(branchPointer, ctx.hashCode());
	}

	@Override
	public void exitIfLable(new_EnkelParser.IfLableContext ctx) {

	}

	@Override
	public void enterElseLable(new_EnkelParser.ElseLableContext ctx) {
		int nodeId = ctx.hashCode();
		addNodeToGraphviz(nodeId, "if false");
		changePointer(nodeId);
		addEdgeToGraphviz(branchPointer, nodeId);
		branchPointer = oldPointer;// end of "if true" node is brachPointer now
		
	}

	@Override

	public void exitElseLable(new_EnkelParser.ElseLableContext ctx) {
		// pointer = branchPointer;
	}
}
