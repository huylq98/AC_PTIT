// Generated from es\u005Cucm\fdi\ac\lexers\PHPParser.g4 by ANTLR 4.5.3
package es.ucm.fdi.ac.lexers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PHPParser}.
 */
public interface PHPParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PHPParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(PHPParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(PHPParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#htmlDTD}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDTD(PHPParser.HtmlDTDContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#htmlDTD}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDTD(PHPParser.HtmlDTDContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(PHPParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(PHPParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(PHPParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(PHPParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(PHPParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(PHPParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#htmlReference}.
	 * @param ctx the parse tree
	 */
	void enterHtmlReference(PHPParser.HtmlReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#htmlReference}.
	 * @param ctx the parse tree
	 */
	void exitHtmlReference(PHPParser.HtmlReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(PHPParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(PHPParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#htmlLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHtmlLiteral(PHPParser.HtmlLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#htmlLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHtmlLiteral(PHPParser.HtmlLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(PHPParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(PHPParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(PHPParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(PHPParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(PHPParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(PHPParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#phpBlock}.
	 * @param ctx the parse tree
	 */
	void enterPhpBlock(PHPParser.PhpBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#phpBlock}.
	 * @param ctx the parse tree
	 */
	void exitPhpBlock(PHPParser.PhpBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#prolog}.
	 * @param ctx the parse tree
	 */
	void enterProlog(PHPParser.PrologContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#prolog}.
	 * @param ctx the parse tree
	 */
	void exitProlog(PHPParser.PrologContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#epilog}.
	 * @param ctx the parse tree
	 */
	void enterEpilog(PHPParser.EpilogContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#epilog}.
	 * @param ctx the parse tree
	 */
	void exitEpilog(PHPParser.EpilogContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PHPParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PHPParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#complexStatement}.
	 * @param ctx the parse tree
	 */
	void enterComplexStatement(PHPParser.ComplexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#complexStatement}.
	 * @param ctx the parse tree
	 */
	void exitComplexStatement(PHPParser.ComplexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void enterForstatement(PHPParser.ForstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void exitForstatement(PHPParser.ForstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(PHPParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(PHPParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#foreachstatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachstatement(PHPParser.ForeachstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#foreachstatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachstatement(PHPParser.ForeachstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatement(PHPParser.WhilestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatement(PHPParser.WhilestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#dostatement}.
	 * @param ctx the parse tree
	 */
	void enterDostatement(PHPParser.DostatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#dostatement}.
	 * @param ctx the parse tree
	 */
	void exitDostatement(PHPParser.DostatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#switchstatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchstatement(PHPParser.SwitchstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#switchstatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchstatement(PHPParser.SwitchstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PHPParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PHPParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#globalStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStatement(PHPParser.GlobalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#globalStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStatement(PHPParser.GlobalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#staticVariableAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterStaticVariableAssignmentStatement(PHPParser.StaticVariableAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#staticVariableAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitStaticVariableAssignmentStatement(PHPParser.StaticVariableAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(PHPParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(PHPParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(PHPParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(PHPParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(PHPParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(PHPParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#requireStatement}.
	 * @param ctx the parse tree
	 */
	void enterRequireStatement(PHPParser.RequireStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#requireStatement}.
	 * @param ctx the parse tree
	 */
	void exitRequireStatement(PHPParser.RequireStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(PHPParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(PHPParser.CasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#casestatement}.
	 * @param ctx the parse tree
	 */
	void enterCasestatement(PHPParser.CasestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#casestatement}.
	 * @param ctx the parse tree
	 */
	void exitCasestatement(PHPParser.CasestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#defaultcase}.
	 * @param ctx the parse tree
	 */
	void enterDefaultcase(PHPParser.DefaultcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#defaultcase}.
	 * @param ctx the parse tree
	 */
	void exitDefaultcase(PHPParser.DefaultcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PHPParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PHPParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#variablename}.
	 * @param ctx the parse tree
	 */
	void enterVariablename(PHPParser.VariablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#variablename}.
	 * @param ctx the parse tree
	 */
	void exitVariablename(PHPParser.VariablenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(PHPParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(PHPParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#staticMemberAccess}.
	 * @param ctx the parse tree
	 */
	void enterStaticMemberAccess(PHPParser.StaticMemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#staticMemberAccess}.
	 * @param ctx the parse tree
	 */
	void exitStaticMemberAccess(PHPParser.StaticMemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(PHPParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(PHPParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#bracketedBlock}.
	 * @param ctx the parse tree
	 */
	void enterBracketedBlock(PHPParser.BracketedBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#bracketedBlock}.
	 * @param ctx the parse tree
	 */
	void exitBracketedBlock(PHPParser.BracketedBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDefinition(PHPParser.InterfaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDefinition(PHPParser.InterfaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceName(PHPParser.InterfaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceName(PHPParser.InterfaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#interfaceExtends}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceExtends(PHPParser.InterfaceExtendsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#interfaceExtends}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceExtends(PHPParser.InterfaceExtendsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMember(PHPParser.InterfaceMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMember(PHPParser.InterfaceMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(PHPParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(PHPParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(PHPParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(PHPParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#classImplements}.
	 * @param ctx the parse tree
	 */
	void enterClassImplements(PHPParser.ClassImplementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#classImplements}.
	 * @param ctx the parse tree
	 */
	void exitClassImplements(PHPParser.ClassImplementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(PHPParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(PHPParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(PHPParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(PHPParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#constDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstDefinition(PHPParser.ConstDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#constDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstDefinition(PHPParser.ConstDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefinition(PHPParser.FieldDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefinition(PHPParser.FieldDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(PHPParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(PHPParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterFieldName(PHPParser.FieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitFieldName(PHPParser.FieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(PHPParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(PHPParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#parametersDefinition}.
	 * @param ctx the parse tree
	 */
	void enterParametersDefinition(PHPParser.ParametersDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#parametersDefinition}.
	 * @param ctx the parse tree
	 */
	void exitParametersDefinition(PHPParser.ParametersDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInvocation(PHPParser.FunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInvocation(PHPParser.FunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(PHPParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(PHPParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#functionInvocationParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInvocationParameters(PHPParser.FunctionInvocationParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#functionInvocationParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInvocationParameters(PHPParser.FunctionInvocationParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#paramDef}.
	 * @param ctx the parse tree
	 */
	void enterParamDef(PHPParser.ParamDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#paramDef}.
	 * @param ctx the parse tree
	 */
	void exitParamDef(PHPParser.ParamDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#paramName}.
	 * @param ctx the parse tree
	 */
	void enterParamName(PHPParser.ParamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#paramName}.
	 * @param ctx the parse tree
	 */
	void exitParamName(PHPParser.ParamNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#commaList}.
	 * @param ctx the parse tree
	 */
	void enterCommaList(PHPParser.CommaListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#commaList}.
	 * @param ctx the parse tree
	 */
	void exitCommaList(PHPParser.CommaListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PHPParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PHPParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#weakLogicalOr}.
	 * @param ctx the parse tree
	 */
	void enterWeakLogicalOr(PHPParser.WeakLogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#weakLogicalOr}.
	 * @param ctx the parse tree
	 */
	void exitWeakLogicalOr(PHPParser.WeakLogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#weakLogicalXor}.
	 * @param ctx the parse tree
	 */
	void enterWeakLogicalXor(PHPParser.WeakLogicalXorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#weakLogicalXor}.
	 * @param ctx the parse tree
	 */
	void exitWeakLogicalXor(PHPParser.WeakLogicalXorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#weakLogicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterWeakLogicalAnd(PHPParser.WeakLogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#weakLogicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitWeakLogicalAnd(PHPParser.WeakLogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PHPParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PHPParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#listVariables}.
	 * @param ctx the parse tree
	 */
	void enterListVariables(PHPParser.ListVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#listVariables}.
	 * @param ctx the parse tree
	 */
	void exitListVariables(PHPParser.ListVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#ternary}.
	 * @param ctx the parse tree
	 */
	void enterTernary(PHPParser.TernaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#ternary}.
	 * @param ctx the parse tree
	 */
	void exitTernary(PHPParser.TernaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(PHPParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(PHPParser.LogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(PHPParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(PHPParser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#bitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOr(PHPParser.BitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#bitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOr(PHPParser.BitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#bitWiseAnd}.
	 * @param ctx the parse tree
	 */
	void enterBitWiseAnd(PHPParser.BitWiseAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#bitWiseAnd}.
	 * @param ctx the parse tree
	 */
	void exitBitWiseAnd(PHPParser.BitWiseAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#equalityCheck}.
	 * @param ctx the parse tree
	 */
	void enterEqualityCheck(PHPParser.EqualityCheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#equalityCheck}.
	 * @param ctx the parse tree
	 */
	void exitEqualityCheck(PHPParser.EqualityCheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#comparisionCheck}.
	 * @param ctx the parse tree
	 */
	void enterComparisionCheck(PHPParser.ComparisionCheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#comparisionCheck}.
	 * @param ctx the parse tree
	 */
	void exitComparisionCheck(PHPParser.ComparisionCheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#bitWiseShift}.
	 * @param ctx the parse tree
	 */
	void enterBitWiseShift(PHPParser.BitWiseShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#bitWiseShift}.
	 * @param ctx the parse tree
	 */
	void exitBitWiseShift(PHPParser.BitWiseShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(PHPParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(PHPParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(PHPParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(PHPParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#logicalNot}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(PHPParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#logicalNot}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(PHPParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#instanceOf}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOf(PHPParser.InstanceOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#instanceOf}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOf(PHPParser.InstanceOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#negateOrCast}.
	 * @param ctx the parse tree
	 */
	void enterNegateOrCast(PHPParser.NegateOrCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#negateOrCast}.
	 * @param ctx the parse tree
	 */
	void exitNegateOrCast(PHPParser.NegateOrCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(PHPParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(PHPParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#newOrClone}.
	 * @param ctx the parse tree
	 */
	void enterNewOrClone(PHPParser.NewOrCloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#newOrClone}.
	 * @param ctx the parse tree
	 */
	void exitNewOrClone(PHPParser.NewOrCloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#atomOrReference}.
	 * @param ctx the parse tree
	 */
	void enterAtomOrReference(PHPParser.AtomOrReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#atomOrReference}.
	 * @param ctx the parse tree
	 */
	void exitAtomOrReference(PHPParser.AtomOrReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(PHPParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(PHPParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#arrayEntry}.
	 * @param ctx the parse tree
	 */
	void enterArrayEntry(PHPParser.ArrayEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#arrayEntry}.
	 * @param ctx the parse tree
	 */
	void exitArrayEntry(PHPParser.ArrayEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePair(PHPParser.KeyValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePair(PHPParser.KeyValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PHPParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PHPParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(PHPParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(PHPParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(PHPParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(PHPParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PHPParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PHPParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(PHPParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(PHPParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(PHPParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(PHPParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PHPParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PHPParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#doubleQuotedString}.
	 * @param ctx the parse tree
	 */
	void enterDoubleQuotedString(PHPParser.DoubleQuotedStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#doubleQuotedString}.
	 * @param ctx the parse tree
	 */
	void exitDoubleQuotedString(PHPParser.DoubleQuotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PHPParser#doubleQuotedStringBody}.
	 * @param ctx the parse tree
	 */
	void enterDoubleQuotedStringBody(PHPParser.DoubleQuotedStringBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#doubleQuotedStringBody}.
	 * @param ctx the parse tree
	 */
	void exitDoubleQuotedStringBody(PHPParser.DoubleQuotedStringBodyContext ctx);
}