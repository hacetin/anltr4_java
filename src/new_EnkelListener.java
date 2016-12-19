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
	 * Enter a parse tree produced by {@link new_EnkelParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(new_EnkelParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_EnkelParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(new_EnkelParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_EnkelParser#forConditions}.
	 * @param ctx the parse tree
	 */
	void enterForConditions(new_EnkelParser.ForConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_EnkelParser#forConditions}.
	 * @param ctx the parse tree
	 */
	void exitForConditions(new_EnkelParser.ForConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_EnkelParser#ifLabel}.
	 * @param ctx the parse tree
	 */
	void enterIfLabel(new_EnkelParser.IfLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_EnkelParser#ifLabel}.
	 * @param ctx the parse tree
	 */
	void exitIfLabel(new_EnkelParser.IfLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_EnkelParser#elseLabel}.
	 * @param ctx the parse tree
	 */
	void enterElseLabel(new_EnkelParser.ElseLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_EnkelParser#elseLabel}.
	 * @param ctx the parse tree
	 */
	void exitElseLabel(new_EnkelParser.ElseLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link new_EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarReference(new_EnkelParser.VarReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link new_EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarReference(new_EnkelParser.VarReferenceContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link new_EnkelParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(new_EnkelParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_EnkelParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(new_EnkelParser.VariableReferenceContext ctx);
}