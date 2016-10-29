// Generated from new_Enkel.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link new_EnkelParser}.
 */
public interface new_EnkelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link new_EnkelParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(new_EnkelParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_EnkelParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(new_EnkelParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_EnkelParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(new_EnkelParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_EnkelParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(new_EnkelParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_EnkelParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(new_EnkelParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_EnkelParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(new_EnkelParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_EnkelParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(new_EnkelParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_EnkelParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(new_EnkelParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_EnkelParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(new_EnkelParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_EnkelParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(new_EnkelParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_EnkelParser#ifLable}.
	 * @param ctx the parse tree
	 */
	void enterIfLable(new_EnkelParser.IfLableContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_EnkelParser#ifLable}.
	 * @param ctx the parse tree
	 */
	void exitIfLable(new_EnkelParser.IfLableContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_EnkelParser#elseLable}.
	 * @param ctx the parse tree
	 */
	void enterElseLable(new_EnkelParser.ElseLableContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_EnkelParser#elseLable}.
	 * @param ctx the parse tree
	 */
	void exitElseLable(new_EnkelParser.ElseLableContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_EnkelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(new_EnkelParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_EnkelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(new_EnkelParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link new_EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(new_EnkelParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link new_EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(new_EnkelParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VALUE}
	 * labeled alternative in {@link new_EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVALUE(new_EnkelParser.VALUEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VALUE}
	 * labeled alternative in {@link new_EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVALUE(new_EnkelParser.VALUEContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_EnkelParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(new_EnkelParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_EnkelParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(new_EnkelParser.ValueContext ctx);
}