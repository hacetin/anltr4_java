import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class new_EnkelTreeWalkListener extends new_EnkelBaseListener {
	PrintWriter out;
	Controller c = new Controller();
	int counter;
	Stack<Controller> bStack;
	public new_EnkelTreeWalkListener() {
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter("output.py")));
			out.close();// To delete old rows
			out = new PrintWriter(new BufferedWriter(new FileWriter("output.py", true)));
			counter = 0;
			bStack = new Stack<Controller>();
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
		c.oldPointer = c.pointer;
		c.pointer = id;
	}

	@Override
	public void enterCompilationUnit(new_EnkelParser.CompilationUnitContext ctx) {
		int nodeId = ++counter;
		out.print("");
		startGraphViz("Control Flow Graph");
		changePointer(nodeId);
		addNodeToGraphviz(nodeId, "START");
	}

	@Override
	public void exitCompilationUnit(new_EnkelParser.CompilationUnitContext ctx) {
		out.println("dot.render(filename=\'graph1\')");
		out.close();
	}

	@Override
	public void exitVariable(new_EnkelParser.VariableContext ctx) {
		TerminalNode id = ctx.ID();
		int nodeId = ++counter;
		addNodeToGraphviz(nodeId, "var " + id);
		changePointer(nodeId);
		addEdgeToGraphviz(c.oldPointer, nodeId);		
	}

	@Override
	public void exitPrint(new_EnkelParser.PrintContext ctx) {
		TerminalNode id = ctx.ID();
		int nodeId = ++counter;
		addNodeToGraphviz(nodeId, "print " + id);
		changePointer(nodeId);
		addEdgeToGraphviz(c.oldPointer, nodeId);
	}

	@Override
	public void enterIfStatement(new_EnkelParser.IfStatementContext ctx) {
		//c = new Controller(c.oldPointer,c.pointer,c.branchPointer);
		bStack.push(c);
		c = new Controller(c.oldPointer, c.pointer, c.branchPointer);
		int nodeId = ++counter;
		addNodeToGraphviz(nodeId, "if start");
		changePointer(nodeId);
		addEdgeToGraphviz(c.oldPointer, nodeId);
		c.branchPointer = c.pointer;
	}

	@Override
	public void exitIfStatement(new_EnkelParser.IfStatementContext ctx) {
		int nodeId = ++counter;
		addNodeToGraphviz(nodeId, "if end");
		changePointer(nodeId);
		addEdgeToGraphviz(c.branchPointer, nodeId);
		addEdgeToGraphviz(c.oldPointer, nodeId);
		int temp = c.pointer;
		c = bStack.pop();
		c.pointer = temp;
	}

	@Override
	public void enterIfLable(new_EnkelParser.IfLableContext ctx) {
		int nodeId = ++counter;
		addNodeToGraphviz(nodeId, "if true");
		changePointer(nodeId);
		addEdgeToGraphviz(c.branchPointer, nodeId);
	}

	@Override
	public void exitIfLable(new_EnkelParser.IfLableContext ctx) {

	}

	@Override
	public void enterElseLable(new_EnkelParser.ElseLableContext ctx) {
		int nodeId = ++counter;
		addNodeToGraphviz(nodeId, "else");
		changePointer(nodeId);
		addEdgeToGraphviz(c.branchPointer, nodeId);
		c.branchPointer = c.oldPointer;// end of "if true" node is brachPointer now
	}

	@Override
	public void exitElseLable(new_EnkelParser.ElseLableContext ctx) {
	}
}
