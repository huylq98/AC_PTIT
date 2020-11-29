// Generated from es\u005Cucm\fdi\ac\lexers\PHPParser.g4 by ANTLR 4.5.3
package es.ucm.fdi.ac.lexers;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PHPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_DTD=2, HTML_EntityRef=3, HTML_CharRef=4, SEA_WS=5, 
		OPEN=6, HTML_TEXT=7, PHP_Start=8, HTML_CLOSE=9, HTML_SLASH_CLOSE=10, HTML_SLASH=11, 
		HTML_EQUALS=12, HTML_QUOTED_STRING=13, HTML_HEX=14, HTML_Name=15, S=16, 
		PHP_END=17, MultiLineComment=18, SinglelineComment=19, UnixComment=20, 
		RealE=21, As=22, SemiColon=23, Instanceof=24, And=25, List=26, Const=27, 
		Or=28, Xor=29, Global=30, Continue=31, Return=32, Implements=33, Var=34, 
		Class=35, Extends=36, Do=37, Switch=38, Case=39, Default=40, Function=41, 
		Break=42, If=43, Else=44, ElseIf=45, For=46, Foreach=47, While=48, Equals=49, 
		New=50, Clone=51, Ampersand=52, Pipe=53, Bang=54, Plus=55, Minus=56, Asterisk=57, 
		Percent=58, Forwardslash=59, Tilde=60, InstanceMember=61, SuppressWarnings=62, 
		Dollar=63, Dot=64, ArrayAssign=65, LogicalOr=66, LogicalAnd=67, ClassMember=68, 
		QuestionMark=69, OpenRoundBracket=70, CloseRoundBracket=71, OpenSquareBracket=72, 
		CloseSquareBracket=73, OpenCurlyBracket=74, CloseCurlyBracket=75, Interface=76, 
		Comma=77, Colon=78, Abstract=79, Static=80, Array=81, RequireOperator=82, 
		PrimitiveType=83, AccessModifier=84, DecimalNumber=85, HexNumber=86, OctalNumber=87, 
		Float=88, Digits=89, Boolean=90, SingleQuotedString=91, DoubleQuotedString_Start=92, 
		Identifier=93, AssignmentOperator=94, EqualityOperator=95, ComparisionOperator=96, 
		ShiftOperator=97, IncrementOperator=98, WS=99, DoubleQuotedStringBody=100, 
		VarName=101, DoubleQuotedString_End=102;
	public static final int
		RULE_htmlDocument = 0, RULE_htmlDTD = 1, RULE_htmlElements = 2, RULE_htmlElement = 3, 
		RULE_htmlContent = 4, RULE_htmlReference = 5, RULE_htmlAttribute = 6, 
		RULE_htmlLiteral = 7, RULE_htmlChardata = 8, RULE_htmlMisc = 9, RULE_htmlComment = 10, 
		RULE_phpBlock = 11, RULE_prolog = 12, RULE_epilog = 13, RULE_statement = 14, 
		RULE_complexStatement = 15, RULE_forstatement = 16, RULE_ifstatement = 17, 
		RULE_foreachstatement = 18, RULE_whilestatement = 19, RULE_dostatement = 20, 
		RULE_switchstatement = 21, RULE_simpleStatement = 22, RULE_globalStatement = 23, 
		RULE_staticVariableAssignmentStatement = 24, RULE_breakStatement = 25, 
		RULE_continueStatement = 26, RULE_returnStatement = 27, RULE_requireStatement = 28, 
		RULE_cases = 29, RULE_casestatement = 30, RULE_defaultcase = 31, RULE_variable = 32, 
		RULE_variablename = 33, RULE_name = 34, RULE_staticMemberAccess = 35, 
		RULE_memberAccess = 36, RULE_bracketedBlock = 37, RULE_interfaceDefinition = 38, 
		RULE_interfaceName = 39, RULE_interfaceExtends = 40, RULE_interfaceMember = 41, 
		RULE_className = 42, RULE_classDefinition = 43, RULE_classImplements = 44, 
		RULE_classMember = 45, RULE_classModifier = 46, RULE_constDefinition = 47, 
		RULE_fieldDefinition = 48, RULE_fieldModifier = 49, RULE_fieldName = 50, 
		RULE_functionDefinition = 51, RULE_parametersDefinition = 52, RULE_functionInvocation = 53, 
		RULE_functionName = 54, RULE_functionInvocationParameters = 55, RULE_paramDef = 56, 
		RULE_paramName = 57, RULE_commaList = 58, RULE_expression = 59, RULE_weakLogicalOr = 60, 
		RULE_weakLogicalXor = 61, RULE_weakLogicalAnd = 62, RULE_assignment = 63, 
		RULE_listVariables = 64, RULE_ternary = 65, RULE_logicalOr = 66, RULE_logicalAnd = 67, 
		RULE_bitwiseOr = 68, RULE_bitWiseAnd = 69, RULE_equalityCheck = 70, RULE_comparisionCheck = 71, 
		RULE_bitWiseShift = 72, RULE_addition = 73, RULE_multiplication = 74, 
		RULE_logicalNot = 75, RULE_instanceOf = 76, RULE_negateOrCast = 77, RULE_increment = 78, 
		RULE_newOrClone = 79, RULE_atomOrReference = 80, RULE_arrayDeclaration = 81, 
		RULE_arrayEntry = 82, RULE_keyValuePair = 83, RULE_atom = 84, RULE_reference = 85, 
		RULE_bool = 86, RULE_number = 87, RULE_integer = 88, RULE_real = 89, RULE_string = 90, 
		RULE_doubleQuotedString = 91, RULE_doubleQuotedStringBody = 92;
	public static final String[] ruleNames = {
		"htmlDocument", "htmlDTD", "htmlElements", "htmlElement", "htmlContent", 
		"htmlReference", "htmlAttribute", "htmlLiteral", "htmlChardata", "htmlMisc", 
		"htmlComment", "phpBlock", "prolog", "epilog", "statement", "complexStatement", 
		"forstatement", "ifstatement", "foreachstatement", "whilestatement", "dostatement", 
		"switchstatement", "simpleStatement", "globalStatement", "staticVariableAssignmentStatement", 
		"breakStatement", "continueStatement", "returnStatement", "requireStatement", 
		"cases", "casestatement", "defaultcase", "variable", "variablename", "name", 
		"staticMemberAccess", "memberAccess", "bracketedBlock", "interfaceDefinition", 
		"interfaceName", "interfaceExtends", "interfaceMember", "className", "classDefinition", 
		"classImplements", "classMember", "classModifier", "constDefinition", 
		"fieldDefinition", "fieldModifier", "fieldName", "functionDefinition", 
		"parametersDefinition", "functionInvocation", "functionName", "functionInvocationParameters", 
		"paramDef", "paramName", "commaList", "expression", "weakLogicalOr", "weakLogicalXor", 
		"weakLogicalAnd", "assignment", "listVariables", "ternary", "logicalOr", 
		"logicalAnd", "bitwiseOr", "bitWiseAnd", "equalityCheck", "comparisionCheck", 
		"bitWiseShift", "addition", "multiplication", "logicalNot", "instanceOf", 
		"negateOrCast", "increment", "newOrClone", "atomOrReference", "arrayDeclaration", 
		"arrayEntry", "keyValuePair", "atom", "reference", "bool", "number", "integer", 
		"real", "string", "doubleQuotedString", "doubleQuotedStringBody"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'<'", null, null, "'>'", "'/>'", 
		null, null, null, null, null, null, "'?>'", null, null, null, null, "'as'", 
		"';'", "'instanceof'", "'and'", "'list'", "'const'", "'or'", "'xor'", 
		"'global'", "'continue'", "'return'", "'implements'", "'var'", "'class'", 
		"'extends'", "'do'", "'switch'", "'case'", "'default'", "'function'", 
		"'break'", "'if'", "'else'", "'elseif'", "'for'", "'foreach'", "'while'", 
		null, "'new'", "'clone'", "'&'", "'|'", "'!'", "'+'", "'-'", "'*'", "'%'", 
		null, "'~'", "'->'", "'@'", "'$'", "'.'", "'=>'", "'||'", "'&&'", "'::'", 
		"'?'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'Interface'", "','", 
		"':'", "'abstract'", "'static'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HTML_COMMENT", "HTML_DTD", "HTML_EntityRef", "HTML_CharRef", "SEA_WS", 
		"OPEN", "HTML_TEXT", "PHP_Start", "HTML_CLOSE", "HTML_SLASH_CLOSE", "HTML_SLASH", 
		"HTML_EQUALS", "HTML_QUOTED_STRING", "HTML_HEX", "HTML_Name", "S", "PHP_END", 
		"MultiLineComment", "SinglelineComment", "UnixComment", "RealE", "As", 
		"SemiColon", "Instanceof", "And", "List", "Const", "Or", "Xor", "Global", 
		"Continue", "Return", "Implements", "Var", "Class", "Extends", "Do", "Switch", 
		"Case", "Default", "Function", "Break", "If", "Else", "ElseIf", "For", 
		"Foreach", "While", "Equals", "New", "Clone", "Ampersand", "Pipe", "Bang", 
		"Plus", "Minus", "Asterisk", "Percent", "Forwardslash", "Tilde", "InstanceMember", 
		"SuppressWarnings", "Dollar", "Dot", "ArrayAssign", "LogicalOr", "LogicalAnd", 
		"ClassMember", "QuestionMark", "OpenRoundBracket", "CloseRoundBracket", 
		"OpenSquareBracket", "CloseSquareBracket", "OpenCurlyBracket", "CloseCurlyBracket", 
		"Interface", "Comma", "Colon", "Abstract", "Static", "Array", "RequireOperator", 
		"PrimitiveType", "AccessModifier", "DecimalNumber", "HexNumber", "OctalNumber", 
		"Float", "Digits", "Boolean", "SingleQuotedString", "DoubleQuotedString_Start", 
		"Identifier", "AssignmentOperator", "EqualityOperator", "ComparisionOperator", 
		"ShiftOperator", "IncrementOperator", "WS", "DoubleQuotedStringBody", 
		"VarName", "DoubleQuotedString_End"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PHPParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PHPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class HtmlDocumentContext extends ParserRuleContext {
		public HtmlDTDContext htmlDTD() {
			return getRuleContext(HtmlDTDContext.class,0);
		}
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlDocument(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if (_la==HTML_DTD) {
				{
				setState(186);
				htmlDTD();
				}
			}

			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HTML_COMMENT) | (1L << SEA_WS) | (1L << OPEN) | (1L << PHP_Start))) != 0)) {
				{
				{
				setState(189);
				htmlElements();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlDTDContext extends ParserRuleContext {
		public TerminalNode HTML_DTD() { return getToken(PHPParser.HTML_DTD, 0); }
		public HtmlDTDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDTD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlDTD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlDTD(this);
		}
	}

	public final HtmlDTDContext htmlDTD() throws RecognitionException {
		HtmlDTDContext _localctx = new HtmlDTDContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlDTD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(HTML_DTD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public PhpBlockContext phpBlock() {
			return getRuleContext(PhpBlockContext.class,0);
		}
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlElements(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HTML_COMMENT || _la==SEA_WS) {
				{
				{
				setState(197);
				htmlMisc();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			switch (_input.LA(1)) {
			case OPEN:
				{
				setState(203);
				htmlElement();
				}
				break;
			case PHP_Start:
				{
				setState(204);
				phpBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					htmlMisc();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementContext extends ParserRuleContext {
		public List<TerminalNode> HTML_Name() { return getTokens(PHPParser.HTML_Name); }
		public TerminalNode HTML_Name(int i) {
			return getToken(PHPParser.HTML_Name, i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode HTML_SLASH() { return getToken(PHPParser.HTML_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlElement(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlElement);
		int _la;
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(OPEN);
				setState(214);
				match(HTML_Name);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HTML_Name) {
					{
					{
					setState(215);
					htmlAttribute();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(HTML_CLOSE);
				setState(222);
				htmlContent();
				setState(223);
				match(OPEN);
				setState(224);
				match(HTML_SLASH);
				setState(225);
				match(HTML_Name);
				setState(226);
				match(HTML_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(OPEN);
				setState(229);
				match(HTML_Name);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HTML_Name) {
					{
					{
					setState(230);
					htmlAttribute();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				match(HTML_SLASH_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(OPEN);
				setState(238);
				match(HTML_Name);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HTML_Name) {
					{
					{
					setState(239);
					htmlAttribute();
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245);
				match(HTML_CLOSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlChardataContext> htmlChardata() {
			return getRuleContexts(HtmlChardataContext.class);
		}
		public HtmlChardataContext htmlChardata(int i) {
			return getRuleContext(HtmlChardataContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<HtmlReferenceContext> htmlReference() {
			return getRuleContexts(HtmlReferenceContext.class);
		}
		public HtmlReferenceContext htmlReference(int i) {
			return getRuleContext(HtmlReferenceContext.class,i);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public List<PhpBlockContext> phpBlock() {
			return getRuleContexts(PhpBlockContext.class);
		}
		public PhpBlockContext phpBlock(int i) {
			return getRuleContext(PhpBlockContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlContent(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==HTML_TEXT) {
				{
				setState(248);
				htmlChardata();
				}
			}

			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					switch (_input.LA(1)) {
					case OPEN:
						{
						setState(251);
						htmlElement();
						}
						break;
					case HTML_EntityRef:
					case HTML_CharRef:
						{
						setState(252);
						htmlReference();
						}
						break;
					case HTML_COMMENT:
						{
						setState(253);
						htmlComment();
						}
						break;
					case PHP_Start:
						{
						setState(254);
						phpBlock();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(258);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==HTML_TEXT) {
						{
						setState(257);
						htmlChardata();
						}
					}

					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlReferenceContext extends ParserRuleContext {
		public TerminalNode HTML_EntityRef() { return getToken(PHPParser.HTML_EntityRef, 0); }
		public TerminalNode HTML_CharRef() { return getToken(PHPParser.HTML_CharRef, 0); }
		public HtmlReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlReference(this);
		}
	}

	public final HtmlReferenceContext htmlReference() throws RecognitionException {
		HtmlReferenceContext _localctx = new HtmlReferenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !(_la==HTML_EntityRef || _la==HTML_CharRef) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode HTML_Name() { return getToken(PHPParser.HTML_Name, 0); }
		public TerminalNode HTML_EQUALS() { return getToken(PHPParser.HTML_EQUALS, 0); }
		public HtmlLiteralContext htmlLiteral() {
			return getRuleContext(HtmlLiteralContext.class,0);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlAttribute(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(HTML_Name);
			setState(268);
			match(HTML_EQUALS);
			setState(269);
			htmlLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlLiteralContext extends ParserRuleContext {
		public TerminalNode HTML_QUOTED_STRING() { return getToken(PHPParser.HTML_QUOTED_STRING, 0); }
		public TerminalNode HTML_HEX() { return getToken(PHPParser.HTML_HEX, 0); }
		public HtmlLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlLiteral(this);
		}
	}

	public final HtmlLiteralContext htmlLiteral() throws RecognitionException {
		HtmlLiteralContext _localctx = new HtmlLiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_htmlLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==HTML_QUOTED_STRING || _la==HTML_HEX) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlChardataContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(PHPParser.HTML_TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(PHPParser.SEA_WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlChardata(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==HTML_TEXT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public TerminalNode SEA_WS() { return getToken(PHPParser.SEA_WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlMisc(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_htmlMisc);
		try {
			setState(277);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				htmlComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(SEA_WS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(PHPParser.HTML_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlComment(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_htmlComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(HTML_COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PhpBlockContext extends ParserRuleContext {
		public PrologContext prolog() {
			return getRuleContext(PrologContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public EpilogContext epilog() {
			return getRuleContext(EpilogContext.class,0);
		}
		public PhpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phpBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterPhpBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitPhpBlock(this);
		}
	}

	public final PhpBlockContext phpBlock() throws RecognitionException {
		PhpBlockContext _localctx = new PhpBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_phpBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			prolog();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << List) | (1L << Global) | (1L << Continue) | (1L << Return) | (1L << Class) | (1L << Do) | (1L << Switch) | (1L << Function) | (1L << Break) | (1L << If) | (1L << For) | (1L << Foreach) | (1L << While) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings) | (1L << Dollar))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenRoundBracket - 70)) | (1L << (OpenCurlyBracket - 70)) | (1L << (Interface - 70)) | (1L << (Abstract - 70)) | (1L << (Static - 70)) | (1L << (Array - 70)) | (1L << (RequireOperator - 70)) | (1L << (DecimalNumber - 70)) | (1L << (HexNumber - 70)) | (1L << (OctalNumber - 70)) | (1L << (Float - 70)) | (1L << (Boolean - 70)) | (1L << (SingleQuotedString - 70)) | (1L << (DoubleQuotedString_Start - 70)) | (1L << (Identifier - 70)) | (1L << (IncrementOperator - 70)))) != 0)) {
				{
				{
				setState(282);
				statement();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			_la = _input.LA(1);
			if (_la==PHP_END) {
				{
				setState(288);
				epilog();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrologContext extends ParserRuleContext {
		public TerminalNode PHP_Start() { return getToken(PHPParser.PHP_Start, 0); }
		public PrologContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prolog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterProlog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitProlog(this);
		}
	}

	public final PrologContext prolog() throws RecognitionException {
		PrologContext _localctx = new PrologContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_prolog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(PHP_Start);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EpilogContext extends ParserRuleContext {
		public TerminalNode PHP_END() { return getToken(PHPParser.PHP_END, 0); }
		public EpilogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epilog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterEpilog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitEpilog(this);
		}
	}

	public final EpilogContext epilog() throws RecognitionException {
		EpilogContext _localctx = new EpilogContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_epilog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(PHP_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BracketedBlockContext bracketedBlock() {
			return getRuleContext(BracketedBlockContext.class,0);
		}
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public InterfaceDefinitionContext interfaceDefinition() {
			return getRuleContext(InterfaceDefinitionContext.class,0);
		}
		public ComplexStatementContext complexStatement() {
			return getRuleContext(ComplexStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(OpenCurlyBracket);
				setState(296);
				statement();
				setState(297);
				match(CloseCurlyBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				bracketedBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				classDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				interfaceDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				complexStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				simpleStatement();
				setState(304);
				match(SemiColon);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexStatementContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public ForeachstatementContext foreachstatement() {
			return getRuleContext(ForeachstatementContext.class,0);
		}
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public DostatementContext dostatement() {
			return getRuleContext(DostatementContext.class,0);
		}
		public SwitchstatementContext switchstatement() {
			return getRuleContext(SwitchstatementContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ComplexStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterComplexStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitComplexStatement(this);
		}
	}

	public final ComplexStatementContext complexStatement() throws RecognitionException {
		ComplexStatementContext _localctx = new ComplexStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_complexStatement);
		try {
			setState(315);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				ifstatement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				forstatement();
				}
				break;
			case Foreach:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				foreachstatement();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				whilestatement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 5);
				{
				setState(312);
				dostatement();
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 6);
				{
				setState(313);
				switchstatement();
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 7);
				{
				setState(314);
				functionDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForstatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(PHPParser.For, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterForstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitForstatement(this);
		}
	}

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(For);
			setState(318);
			match(OpenRoundBracket);
			setState(319);
			expression();
			setState(320);
			match(SemiColon);
			setState(321);
			expression();
			setState(322);
			match(SemiColon);
			setState(323);
			expression();
			setState(324);
			match(CloseRoundBracket);
			setState(325);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(PHPParser.If, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ElseIf() { return getTokens(PHPParser.ElseIf); }
		public TerminalNode ElseIf(int i) {
			return getToken(PHPParser.ElseIf, i);
		}
		public TerminalNode Else() { return getToken(PHPParser.Else, 0); }
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitIfstatement(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifstatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(If);
			setState(328);
			match(OpenRoundBracket);
			setState(329);
			expression();
			setState(330);
			match(CloseRoundBracket);
			setState(331);
			statement();
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332);
					match(ElseIf);
					setState(333);
					match(OpenRoundBracket);
					setState(334);
					expression();
					setState(335);
					match(CloseRoundBracket);
					setState(336);
					statement();
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(343);
				match(Else);
				setState(344);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachstatementContext extends ParserRuleContext {
		public TerminalNode Foreach() { return getToken(PHPParser.Foreach, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArrayEntryContext arrayEntry() {
			return getRuleContext(ArrayEntryContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForeachstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterForeachstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitForeachstatement(this);
		}
	}

	public final ForeachstatementContext foreachstatement() throws RecognitionException {
		ForeachstatementContext _localctx = new ForeachstatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_foreachstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(Foreach);
			setState(348);
			match(OpenRoundBracket);
			setState(349);
			variable();
			setState(350);
			match(As);
			setState(351);
			arrayEntry();
			setState(352);
			match(CloseRoundBracket);
			setState(353);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilestatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(PHPParser.While, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterWhilestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitWhilestatement(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whilestatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(While);
			setState(356);
			match(OpenRoundBracket);
			setState(358);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << List) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings) | (1L << Dollar))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenRoundBracket - 70)) | (1L << (Array - 70)) | (1L << (DecimalNumber - 70)) | (1L << (HexNumber - 70)) | (1L << (OctalNumber - 70)) | (1L << (Float - 70)) | (1L << (Boolean - 70)) | (1L << (SingleQuotedString - 70)) | (1L << (DoubleQuotedString_Start - 70)) | (1L << (Identifier - 70)) | (1L << (IncrementOperator - 70)))) != 0)) {
				{
				setState(357);
				expression();
				}
			}

			setState(360);
			match(CloseRoundBracket);
			setState(361);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DostatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(PHPParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(PHPParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DostatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dostatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterDostatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitDostatement(this);
		}
	}

	public final DostatementContext dostatement() throws RecognitionException {
		DostatementContext _localctx = new DostatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dostatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(Do);
			setState(364);
			statement();
			setState(365);
			match(While);
			setState(366);
			match(OpenRoundBracket);
			setState(367);
			expression();
			setState(368);
			match(CloseRoundBracket);
			setState(369);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchstatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(PHPParser.Switch, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public SwitchstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterSwitchstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitSwitchstatement(this);
		}
	}

	public final SwitchstatementContext switchstatement() throws RecognitionException {
		SwitchstatementContext _localctx = new SwitchstatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switchstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(Switch);
			setState(372);
			match(OpenRoundBracket);
			setState(373);
			expression();
			setState(374);
			match(CloseRoundBracket);
			setState(375);
			match(OpenCurlyBracket);
			setState(376);
			cases();
			setState(377);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public GlobalStatementContext globalStatement() {
			return getRuleContext(GlobalStatementContext.class,0);
		}
		public StaticVariableAssignmentStatementContext staticVariableAssignmentStatement() {
			return getRuleContext(StaticVariableAssignmentStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public RequireStatementContext requireStatement() {
			return getRuleContext(RequireStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_simpleStatement);
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				globalStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				staticVariableAssignmentStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				breakStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				continueStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(383);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(384);
				requireStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(385);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalStatementContext extends ParserRuleContext {
		public TerminalNode Global() { return getToken(PHPParser.Global, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PHPParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PHPParser.Comma, i);
		}
		public GlobalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterGlobalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitGlobalStatement(this);
		}
	}

	public final GlobalStatementContext globalStatement() throws RecognitionException {
		GlobalStatementContext _localctx = new GlobalStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_globalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(Global);
			setState(389);
			name();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(390);
				match(Comma);
				setState(391);
				name();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticVariableAssignmentStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Equals() { return getToken(PHPParser.Equals, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(PHPParser.Static, 0); }
		public StaticVariableAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticVariableAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterStaticVariableAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitStaticVariableAssignmentStatement(this);
		}
	}

	public final StaticVariableAssignmentStatementContext staticVariableAssignmentStatement() throws RecognitionException {
		StaticVariableAssignmentStatementContext _localctx = new StaticVariableAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_staticVariableAssignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(397);
				match(Static);
				}
			}

			setState(400);
			variable();
			setState(401);
			match(Equals);
			setState(402);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(PHPParser.Break, 0); }
		public TerminalNode DecimalNumber() { return getToken(PHPParser.DecimalNumber, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(Break);
			setState(406);
			_la = _input.LA(1);
			if (_la==DecimalNumber) {
				{
				setState(405);
				match(DecimalNumber);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(PHPParser.Continue, 0); }
		public TerminalNode DecimalNumber() { return getToken(PHPParser.DecimalNumber, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(Continue);
			setState(410);
			_la = _input.LA(1);
			if (_la==DecimalNumber) {
				{
				setState(409);
				match(DecimalNumber);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(PHPParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(Return);
			setState(414);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << List) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings) | (1L << Dollar))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenRoundBracket - 70)) | (1L << (Array - 70)) | (1L << (DecimalNumber - 70)) | (1L << (HexNumber - 70)) | (1L << (OctalNumber - 70)) | (1L << (Float - 70)) | (1L << (Boolean - 70)) | (1L << (SingleQuotedString - 70)) | (1L << (DoubleQuotedString_Start - 70)) | (1L << (Identifier - 70)) | (1L << (IncrementOperator - 70)))) != 0)) {
				{
				setState(413);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequireStatementContext extends ParserRuleContext {
		public TerminalNode RequireOperator() { return getToken(PHPParser.RequireOperator, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RequireStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requireStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterRequireStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitRequireStatement(this);
		}
	}

	public final RequireStatementContext requireStatement() throws RecognitionException {
		RequireStatementContext _localctx = new RequireStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_requireStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(RequireOperator);
			setState(417);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasesContext extends ParserRuleContext {
		public DefaultcaseContext defaultcase() {
			return getRuleContext(DefaultcaseContext.class,0);
		}
		public List<CasestatementContext> casestatement() {
			return getRuleContexts(CasestatementContext.class);
		}
		public CasestatementContext casestatement(int i) {
			return getRuleContext(CasestatementContext.class,i);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitCases(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case) {
				{
				{
				setState(419);
				casestatement();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
			defaultcase();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasestatementContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(PHPParser.Case, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PHPParser.Colon, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CasestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterCasestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitCasestatement(this);
		}
	}

	public final CasestatementContext casestatement() throws RecognitionException {
		CasestatementContext _localctx = new CasestatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_casestatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(Case);
			setState(428);
			expression();
			setState(429);
			match(Colon);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << List) | (1L << Global) | (1L << Continue) | (1L << Return) | (1L << Class) | (1L << Do) | (1L << Switch) | (1L << Function) | (1L << Break) | (1L << If) | (1L << For) | (1L << Foreach) | (1L << While) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings) | (1L << Dollar))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenRoundBracket - 70)) | (1L << (OpenCurlyBracket - 70)) | (1L << (Interface - 70)) | (1L << (Abstract - 70)) | (1L << (Static - 70)) | (1L << (Array - 70)) | (1L << (RequireOperator - 70)) | (1L << (DecimalNumber - 70)) | (1L << (HexNumber - 70)) | (1L << (OctalNumber - 70)) | (1L << (Float - 70)) | (1L << (Boolean - 70)) | (1L << (SingleQuotedString - 70)) | (1L << (DoubleQuotedString_Start - 70)) | (1L << (Identifier - 70)) | (1L << (IncrementOperator - 70)))) != 0)) {
				{
				{
				setState(430);
				statement();
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultcaseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(PHPParser.Default, 0); }
		public TerminalNode Colon() { return getToken(PHPParser.Colon, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DefaultcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterDefaultcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitDefaultcase(this);
		}
	}

	public final DefaultcaseContext defaultcase() throws RecognitionException {
		DefaultcaseContext _localctx = new DefaultcaseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_defaultcase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(436);
			match(Default);
			setState(437);
			match(Colon);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << List) | (1L << Global) | (1L << Continue) | (1L << Return) | (1L << Class) | (1L << Do) | (1L << Switch) | (1L << Function) | (1L << Break) | (1L << If) | (1L << For) | (1L << Foreach) | (1L << While) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings) | (1L << Dollar))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenRoundBracket - 70)) | (1L << (OpenCurlyBracket - 70)) | (1L << (Interface - 70)) | (1L << (Abstract - 70)) | (1L << (Static - 70)) | (1L << (Array - 70)) | (1L << (RequireOperator - 70)) | (1L << (DecimalNumber - 70)) | (1L << (HexNumber - 70)) | (1L << (OctalNumber - 70)) | (1L << (Float - 70)) | (1L << (Boolean - 70)) | (1L << (SingleQuotedString - 70)) | (1L << (DoubleQuotedString_Start - 70)) | (1L << (Identifier - 70)) | (1L << (IncrementOperator - 70)))) != 0)) {
				{
				{
				setState(438);
				statement();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Dollar() { return getToken(PHPParser.Dollar, 0); }
		public List<VariablenameContext> variablename() {
			return getRuleContexts(VariablenameContext.class);
		}
		public VariablenameContext variablename(int i) {
			return getRuleContext(VariablenameContext.class,i);
		}
		public TerminalNode InstanceMember() { return getToken(PHPParser.InstanceMember, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variable);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(Dollar);
				setState(445);
				variablename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(Dollar);
				setState(447);
				variablename();
				setState(448);
				match(InstanceMember);
				setState(449);
				variablename();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PHPParser.Identifier, 0); }
		public VariablenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterVariablename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitVariablename(this);
		}
	}

	public final VariablenameContext variablename() throws RecognitionException {
		VariablenameContext _localctx = new VariablenameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variablename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public StaticMemberAccessContext staticMemberAccess() {
			return getRuleContext(StaticMemberAccessContext.class,0);
		}
		public MemberAccessContext memberAccess() {
			return getRuleContext(MemberAccessContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_name);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				staticMemberAccess();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				memberAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				variable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticMemberAccessContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PHPParser.Identifier, 0); }
		public TerminalNode ClassMember() { return getToken(PHPParser.ClassMember, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public StaticMemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticMemberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterStaticMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitStaticMemberAccess(this);
		}
	}

	public final StaticMemberAccessContext staticMemberAccess() throws RecognitionException {
		StaticMemberAccessContext _localctx = new StaticMemberAccessContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_staticMemberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(Identifier);
			setState(461);
			match(ClassMember);
			setState(462);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberAccessContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> OpenSquareBracket() { return getTokens(PHPParser.OpenSquareBracket); }
		public TerminalNode OpenSquareBracket(int i) {
			return getToken(PHPParser.OpenSquareBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CloseSquareBracket() { return getTokens(PHPParser.CloseSquareBracket); }
		public TerminalNode CloseSquareBracket(int i) {
			return getToken(PHPParser.CloseSquareBracket, i);
		}
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMemberAccess(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_memberAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			variable();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenSquareBracket) {
				{
				{
				setState(465);
				match(OpenSquareBracket);
				setState(466);
				expression();
				setState(467);
				match(CloseSquareBracket);
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracketedBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BracketedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketedBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBracketedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBracketedBlock(this);
		}
	}

	public final BracketedBlockContext bracketedBlock() throws RecognitionException {
		BracketedBlockContext _localctx = new BracketedBlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_bracketedBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(OpenCurlyBracket);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << List) | (1L << Global) | (1L << Continue) | (1L << Return) | (1L << Class) | (1L << Do) | (1L << Switch) | (1L << Function) | (1L << Break) | (1L << If) | (1L << For) | (1L << Foreach) | (1L << While) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings) | (1L << Dollar))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenRoundBracket - 70)) | (1L << (OpenCurlyBracket - 70)) | (1L << (Interface - 70)) | (1L << (Abstract - 70)) | (1L << (Static - 70)) | (1L << (Array - 70)) | (1L << (RequireOperator - 70)) | (1L << (DecimalNumber - 70)) | (1L << (HexNumber - 70)) | (1L << (OctalNumber - 70)) | (1L << (Float - 70)) | (1L << (Boolean - 70)) | (1L << (SingleQuotedString - 70)) | (1L << (DoubleQuotedString_Start - 70)) | (1L << (Identifier - 70)) | (1L << (IncrementOperator - 70)))) != 0)) {
				{
				{
				setState(475);
				statement();
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(481);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDefinitionContext extends ParserRuleContext {
		public TerminalNode Interface() { return getToken(PHPParser.Interface, 0); }
		public InterfaceNameContext interfaceName() {
			return getRuleContext(InterfaceNameContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PHPParser.CloseCurlyBracket, 0); }
		public InterfaceExtendsContext interfaceExtends() {
			return getRuleContext(InterfaceExtendsContext.class,0);
		}
		public List<InterfaceMemberContext> interfaceMember() {
			return getRuleContexts(InterfaceMemberContext.class);
		}
		public InterfaceMemberContext interfaceMember(int i) {
			return getRuleContext(InterfaceMemberContext.class,i);
		}
		public InterfaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInterfaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInterfaceDefinition(this);
		}
	}

	public final InterfaceDefinitionContext interfaceDefinition() throws RecognitionException {
		InterfaceDefinitionContext _localctx = new InterfaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_interfaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(Interface);
			setState(484);
			interfaceName();
			setState(486);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(485);
				interfaceExtends();
				}
			}

			setState(488);
			match(OpenCurlyBracket);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (Const - 27)) | (1L << (Function - 27)) | (1L << (Abstract - 27)) | (1L << (Static - 27)) | (1L << (AccessModifier - 27)))) != 0)) {
				{
				{
				setState(489);
				interfaceMember();
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PHPParser.Identifier, 0); }
		public InterfaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInterfaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInterfaceName(this);
		}
	}

	public final InterfaceNameContext interfaceName() throws RecognitionException {
		InterfaceNameContext _localctx = new InterfaceNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_interfaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceExtendsContext extends ParserRuleContext {
		public TerminalNode Extends() { return getToken(PHPParser.Extends, 0); }
		public List<InterfaceNameContext> interfaceName() {
			return getRuleContexts(InterfaceNameContext.class);
		}
		public InterfaceNameContext interfaceName(int i) {
			return getRuleContext(InterfaceNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PHPParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PHPParser.Comma, i);
		}
		public InterfaceExtendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceExtends; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInterfaceExtends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInterfaceExtends(this);
		}
	}

	public final InterfaceExtendsContext interfaceExtends() throws RecognitionException {
		InterfaceExtendsContext _localctx = new InterfaceExtendsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_interfaceExtends);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(Extends);
			setState(500);
			interfaceName();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(501);
				match(Comma);
				setState(502);
				interfaceName();
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(PHPParser.Const, 0); }
		public TerminalNode Identifier() { return getToken(PHPParser.Identifier, 0); }
		public TerminalNode Equals() { return getToken(PHPParser.Equals, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode Function() { return getToken(PHPParser.Function, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public ParametersDefinitionContext parametersDefinition() {
			return getRuleContext(ParametersDefinitionContext.class,0);
		}
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public InterfaceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInterfaceMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInterfaceMember(this);
		}
	}

	public final InterfaceMemberContext interfaceMember() throws RecognitionException {
		InterfaceMemberContext _localctx = new InterfaceMemberContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_interfaceMember);
		int _la;
		try {
			setState(526);
			switch (_input.LA(1)) {
			case Const:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				match(Const);
				setState(509);
				match(Identifier);
				setState(512);
				_la = _input.LA(1);
				if (_la==Equals) {
					{
					setState(510);
					match(Equals);
					setState(511);
					atom();
					}
				}

				setState(514);
				match(SemiColon);
				}
				break;
			case Function:
			case Abstract:
			case Static:
			case AccessModifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Abstract - 79)) | (1L << (Static - 79)) | (1L << (AccessModifier - 79)))) != 0)) {
					{
					{
					setState(515);
					fieldModifier();
					}
					}
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(521);
				match(Function);
				setState(522);
				functionName();
				setState(523);
				parametersDefinition();
				setState(524);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PHPParser.Identifier, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(PHPParser.Class, 0); }
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PHPParser.CloseCurlyBracket, 0); }
		public ClassModifierContext classModifier() {
			return getRuleContext(ClassModifierContext.class,0);
		}
		public TerminalNode Extends() { return getToken(PHPParser.Extends, 0); }
		public ClassImplementsContext classImplements() {
			return getRuleContext(ClassImplementsContext.class,0);
		}
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassDefinition(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_la = _input.LA(1);
			if (_la==Abstract) {
				{
				setState(530);
				classModifier();
				}
			}

			setState(533);
			match(Class);
			setState(534);
			className();
			setState(537);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(535);
				match(Extends);
				setState(536);
				className();
				}
			}

			setState(540);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(539);
				classImplements();
				}
			}

			setState(542);
			match(OpenCurlyBracket);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (Const - 27)) | (1L << (Var - 27)) | (1L << (Function - 27)) | (1L << (Dollar - 27)) | (1L << (Abstract - 27)) | (1L << (Static - 27)) | (1L << (AccessModifier - 27)))) != 0)) {
				{
				{
				setState(543);
				classMember();
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassImplementsContext extends ParserRuleContext {
		public TerminalNode Implements() { return getToken(PHPParser.Implements, 0); }
		public List<InterfaceNameContext> interfaceName() {
			return getRuleContexts(InterfaceNameContext.class);
		}
		public InterfaceNameContext interfaceName(int i) {
			return getRuleContext(InterfaceNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PHPParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PHPParser.Comma, i);
		}
		public ClassImplementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classImplements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassImplements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassImplements(this);
		}
	}

	public final ClassImplementsContext classImplements() throws RecognitionException {
		ClassImplementsContext _localctx = new ClassImplementsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_classImplements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(Implements);
			{
			setState(552);
			interfaceName();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(553);
				match(Comma);
				setState(554);
				interfaceName();
				}
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(PHPParser.Function, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public ParametersDefinitionContext parametersDefinition() {
			return getRuleContext(ParametersDefinitionContext.class,0);
		}
		public BracketedBlockContext bracketedBlock() {
			return getRuleContext(BracketedBlockContext.class,0);
		}
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public ConstDefinitionContext constDefinition() {
			return getRuleContext(ConstDefinitionContext.class,0);
		}
		public FieldDefinitionContext fieldDefinition() {
			return getRuleContext(FieldDefinitionContext.class,0);
		}
		public TerminalNode Var() { return getToken(PHPParser.Var, 0); }
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassMember(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_classMember);
		int _la;
		try {
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Abstract - 79)) | (1L << (Static - 79)) | (1L << (AccessModifier - 79)))) != 0)) {
					{
					{
					setState(560);
					fieldModifier();
					}
					}
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(566);
				match(Function);
				setState(567);
				functionName();
				setState(568);
				parametersDefinition();
				setState(571);
				switch (_input.LA(1)) {
				case OpenCurlyBracket:
					{
					setState(569);
					bracketedBlock();
					}
					break;
				case SemiColon:
					{
					setState(570);
					match(SemiColon);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				constDefinition();
				setState(574);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				_la = _input.LA(1);
				if (_la==Var) {
					{
					setState(576);
					match(Var);
					}
				}

				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Abstract - 79)) | (1L << (Static - 79)) | (1L << (AccessModifier - 79)))) != 0)) {
					{
					{
					setState(579);
					fieldModifier();
					}
					}
					setState(584);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(585);
				fieldDefinition();
				setState(586);
				match(SemiColon);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(PHPParser.Abstract, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(Abstract);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDefinitionContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(PHPParser.Const, 0); }
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
		}
		public TerminalNode Equals() { return getToken(PHPParser.Equals, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ConstDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterConstDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitConstDefinition(this);
		}
	}

	public final ConstDefinitionContext constDefinition() throws RecognitionException {
		ConstDefinitionContext _localctx = new ConstDefinitionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_constDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(Const);
			setState(593);
			variablename();
			setState(594);
			match(Equals);
			setState(595);
			atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDefinitionContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode Equals() { return getToken(PHPParser.Equals, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public FieldDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFieldDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFieldDefinition(this);
		}
	}

	public final FieldDefinitionContext fieldDefinition() throws RecognitionException {
		FieldDefinitionContext _localctx = new FieldDefinitionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fieldDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			fieldName();
			setState(600);
			_la = _input.LA(1);
			if (_la==Equals) {
				{
				setState(598);
				match(Equals);
				setState(599);
				atom();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public TerminalNode AccessModifier() { return getToken(PHPParser.AccessModifier, 0); }
		public TerminalNode Abstract() { return getToken(PHPParser.Abstract, 0); }
		public TerminalNode Static() { return getToken(PHPParser.Static, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFieldModifier(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Abstract - 79)) | (1L << (Static - 79)) | (1L << (AccessModifier - 79)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldNameContext extends ParserRuleContext {
		public TerminalNode Dollar() { return getToken(PHPParser.Dollar, 0); }
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
		}
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFieldName(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_fieldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(Dollar);
			setState(605);
			variablename();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(PHPParser.Function, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public ParametersDefinitionContext parametersDefinition() {
			return getRuleContext(ParametersDefinitionContext.class,0);
		}
		public BracketedBlockContext bracketedBlock() {
			return getRuleContext(BracketedBlockContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(Function);
			setState(608);
			functionName();
			setState(609);
			parametersDefinition();
			setState(610);
			bracketedBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersDefinitionContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(PHPParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PHPParser.CloseRoundBracket, 0); }
		public List<ParamDefContext> paramDef() {
			return getRuleContexts(ParamDefContext.class);
		}
		public ParamDefContext paramDef(int i) {
			return getRuleContext(ParamDefContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PHPParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PHPParser.Comma, i);
		}
		public ParametersDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterParametersDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitParametersDefinition(this);
		}
	}

	public final ParametersDefinitionContext parametersDefinition() throws RecognitionException {
		ParametersDefinitionContext _localctx = new ParametersDefinitionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_parametersDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(OpenRoundBracket);
			setState(621);
			_la = _input.LA(1);
			if (_la==Ampersand || _la==Dollar) {
				{
				setState(613);
				paramDef();
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(614);
					match(Comma);
					setState(615);
					paramDef();
					}
					}
					setState(620);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(623);
			match(CloseRoundBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionInvocationContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionInvocationParametersContext functionInvocationParameters() {
			return getRuleContext(FunctionInvocationParametersContext.class,0);
		}
		public FunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFunctionInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFunctionInvocation(this);
		}
	}

	public final FunctionInvocationContext functionInvocation() throws RecognitionException {
		FunctionInvocationContext _localctx = new FunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_functionInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			functionName();
			setState(626);
			functionInvocationParameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PHPParser.Identifier, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionInvocationParametersContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(PHPParser.OpenRoundBracket, 0); }
		public CommaListContext commaList() {
			return getRuleContext(CommaListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PHPParser.CloseRoundBracket, 0); }
		public FunctionInvocationParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvocationParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFunctionInvocationParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFunctionInvocationParameters(this);
		}
	}

	public final FunctionInvocationParametersContext functionInvocationParameters() throws RecognitionException {
		FunctionInvocationParametersContext _localctx = new FunctionInvocationParametersContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_functionInvocationParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(630);
				match(OpenRoundBracket);
				}
				break;
			}
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(633);
				commaList();
				}
				break;
			}
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(636);
				match(CloseRoundBracket);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamDefContext extends ParserRuleContext {
		public ParamNameContext paramName() {
			return getRuleContext(ParamNameContext.class,0);
		}
		public TerminalNode Equals() { return getToken(PHPParser.Equals, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ParamDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterParamDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitParamDef(this);
		}
	}

	public final ParamDefContext paramDef() throws RecognitionException {
		ParamDefContext _localctx = new ParamDefContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_paramDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			paramName();
			setState(642);
			_la = _input.LA(1);
			if (_la==Equals) {
				{
				setState(640);
				match(Equals);
				setState(641);
				atom();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamNameContext extends ParserRuleContext {
		public TerminalNode Dollar() { return getToken(PHPParser.Dollar, 0); }
		public TerminalNode Identifier() { return getToken(PHPParser.Identifier, 0); }
		public TerminalNode Ampersand() { return getToken(PHPParser.Ampersand, 0); }
		public ParamNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterParamName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitParamName(this);
		}
	}

	public final ParamNameContext paramName() throws RecognitionException {
		ParamNameContext _localctx = new ParamNameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_paramName);
		try {
			setState(649);
			switch (_input.LA(1)) {
			case Dollar:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				match(Dollar);
				setState(645);
				match(Identifier);
				}
				break;
			case Ampersand:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(Ampersand);
				setState(647);
				match(Dollar);
				setState(648);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommaListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CommaListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterCommaList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitCommaList(this);
		}
	}

	public final CommaListContext commaList() throws RecognitionException {
		CommaListContext _localctx = new CommaListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_commaList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			expression();
			setState(656);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(652);
					match(Comma);
					setState(653);
					expression();
					}
					} 
				}
				setState(658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public WeakLogicalOrContext weakLogicalOr() {
			return getRuleContext(WeakLogicalOrContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			weakLogicalOr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WeakLogicalOrContext extends ParserRuleContext {
		public List<WeakLogicalXorContext> weakLogicalXor() {
			return getRuleContexts(WeakLogicalXorContext.class);
		}
		public WeakLogicalXorContext weakLogicalXor(int i) {
			return getRuleContext(WeakLogicalXorContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(PHPParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(PHPParser.Or, i);
		}
		public WeakLogicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weakLogicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterWeakLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitWeakLogicalOr(this);
		}
	}

	public final WeakLogicalOrContext weakLogicalOr() throws RecognitionException {
		WeakLogicalOrContext _localctx = new WeakLogicalOrContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_weakLogicalOr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			weakLogicalXor();
			setState(666);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(662);
					match(Or);
					setState(663);
					weakLogicalXor();
					}
					} 
				}
				setState(668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WeakLogicalXorContext extends ParserRuleContext {
		public List<WeakLogicalAndContext> weakLogicalAnd() {
			return getRuleContexts(WeakLogicalAndContext.class);
		}
		public WeakLogicalAndContext weakLogicalAnd(int i) {
			return getRuleContext(WeakLogicalAndContext.class,i);
		}
		public List<TerminalNode> Xor() { return getTokens(PHPParser.Xor); }
		public TerminalNode Xor(int i) {
			return getToken(PHPParser.Xor, i);
		}
		public WeakLogicalXorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weakLogicalXor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterWeakLogicalXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitWeakLogicalXor(this);
		}
	}

	public final WeakLogicalXorContext weakLogicalXor() throws RecognitionException {
		WeakLogicalXorContext _localctx = new WeakLogicalXorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_weakLogicalXor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			weakLogicalAnd();
			setState(674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(670);
					match(Xor);
					setState(671);
					weakLogicalAnd();
					}
					} 
				}
				setState(676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WeakLogicalAndContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(PHPParser.And); }
		public TerminalNode And(int i) {
			return getToken(PHPParser.And, i);
		}
		public WeakLogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weakLogicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterWeakLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitWeakLogicalAnd(this);
		}
	}

	public final WeakLogicalAndContext weakLogicalAnd() throws RecognitionException {
		WeakLogicalAndContext _localctx = new WeakLogicalAndContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_weakLogicalAnd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			assignment();
			setState(682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(678);
					match(And);
					setState(679);
					assignment();
					}
					} 
				}
				setState(684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public ListVariablesContext listVariables() {
			return getRuleContext(ListVariablesContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode Equals() { return getToken(PHPParser.Equals, 0); }
		public TerminalNode AssignmentOperator() { return getToken(PHPParser.AssignmentOperator, 0); }
		public TernaryContext ternary() {
			return getRuleContext(TernaryContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_assignment);
		int _la;
		try {
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				listVariables();
				{
				setState(686);
				_la = _input.LA(1);
				if ( !(_la==Equals || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(687);
				assignment();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				ternary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListVariablesContext extends ParserRuleContext {
		public TerminalNode List() { return getToken(PHPParser.List, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PHPParser.OpenRoundBracket, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PHPParser.CloseRoundBracket, 0); }
		public ListVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterListVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitListVariables(this);
		}
	}

	public final ListVariablesContext listVariables() throws RecognitionException {
		ListVariablesContext _localctx = new ListVariablesContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_listVariables);
		int _la;
		try {
			setState(705);
			switch (_input.LA(1)) {
			case List:
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				match(List);
				setState(693);
				match(OpenRoundBracket);
				setState(694);
				name();
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(695);
					match(Comma);
					setState(696);
					name();
					}
					}
					setState(701);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(702);
				match(CloseRoundBracket);
				}
				break;
			case Dollar:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TernaryContext extends ParserRuleContext {
		public LogicalOrContext logicalOr() {
			return getRuleContext(LogicalOrContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(PHPParser.QuestionMark, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Colon() { return getToken(PHPParser.Colon, 0); }
		public TernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTernary(this);
		}
	}

	public final TernaryContext ternary() throws RecognitionException {
		TernaryContext _localctx = new TernaryContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_ternary);
		try {
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				logicalOr();
				setState(708);
				match(QuestionMark);
				setState(709);
				expression();
				setState(710);
				match(Colon);
				setState(711);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				logicalOr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrContext extends ParserRuleContext {
		public List<LogicalAndContext> logicalAnd() {
			return getRuleContexts(LogicalAndContext.class);
		}
		public LogicalAndContext logicalAnd(int i) {
			return getRuleContext(LogicalAndContext.class,i);
		}
		public List<TerminalNode> LogicalOr() { return getTokens(PHPParser.LogicalOr); }
		public TerminalNode LogicalOr(int i) {
			return getToken(PHPParser.LogicalOr, i);
		}
		public LogicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitLogicalOr(this);
		}
	}

	public final LogicalOrContext logicalOr() throws RecognitionException {
		LogicalOrContext _localctx = new LogicalOrContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_logicalOr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			logicalAnd();
			setState(721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(717);
					match(LogicalOr);
					setState(718);
					logicalAnd();
					}
					} 
				}
				setState(723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalAndContext extends ParserRuleContext {
		public List<BitwiseOrContext> bitwiseOr() {
			return getRuleContexts(BitwiseOrContext.class);
		}
		public BitwiseOrContext bitwiseOr(int i) {
			return getRuleContext(BitwiseOrContext.class,i);
		}
		public List<TerminalNode> LogicalAnd() { return getTokens(PHPParser.LogicalAnd); }
		public TerminalNode LogicalAnd(int i) {
			return getToken(PHPParser.LogicalAnd, i);
		}
		public LogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitLogicalAnd(this);
		}
	}

	public final LogicalAndContext logicalAnd() throws RecognitionException {
		LogicalAndContext _localctx = new LogicalAndContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_logicalAnd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			bitwiseOr();
			setState(729);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(725);
					match(LogicalAnd);
					setState(726);
					bitwiseOr();
					}
					} 
				}
				setState(731);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitwiseOrContext extends ParserRuleContext {
		public List<BitWiseAndContext> bitWiseAnd() {
			return getRuleContexts(BitWiseAndContext.class);
		}
		public BitWiseAndContext bitWiseAnd(int i) {
			return getRuleContext(BitWiseAndContext.class,i);
		}
		public List<TerminalNode> Pipe() { return getTokens(PHPParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(PHPParser.Pipe, i);
		}
		public BitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBitwiseOr(this);
		}
	}

	public final BitwiseOrContext bitwiseOr() throws RecognitionException {
		BitwiseOrContext _localctx = new BitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_bitwiseOr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			bitWiseAnd();
			setState(737);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(733);
					match(Pipe);
					setState(734);
					bitWiseAnd();
					}
					} 
				}
				setState(739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitWiseAndContext extends ParserRuleContext {
		public List<EqualityCheckContext> equalityCheck() {
			return getRuleContexts(EqualityCheckContext.class);
		}
		public EqualityCheckContext equalityCheck(int i) {
			return getRuleContext(EqualityCheckContext.class,i);
		}
		public List<TerminalNode> Ampersand() { return getTokens(PHPParser.Ampersand); }
		public TerminalNode Ampersand(int i) {
			return getToken(PHPParser.Ampersand, i);
		}
		public BitWiseAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitWiseAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBitWiseAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBitWiseAnd(this);
		}
	}

	public final BitWiseAndContext bitWiseAnd() throws RecognitionException {
		BitWiseAndContext _localctx = new BitWiseAndContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_bitWiseAnd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			equalityCheck();
			setState(745);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(741);
					match(Ampersand);
					setState(742);
					equalityCheck();
					}
					} 
				}
				setState(747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityCheckContext extends ParserRuleContext {
		public List<ComparisionCheckContext> comparisionCheck() {
			return getRuleContexts(ComparisionCheckContext.class);
		}
		public ComparisionCheckContext comparisionCheck(int i) {
			return getRuleContext(ComparisionCheckContext.class,i);
		}
		public TerminalNode EqualityOperator() { return getToken(PHPParser.EqualityOperator, 0); }
		public EqualityCheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityCheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterEqualityCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitEqualityCheck(this);
		}
	}

	public final EqualityCheckContext equalityCheck() throws RecognitionException {
		EqualityCheckContext _localctx = new EqualityCheckContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_equalityCheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			comparisionCheck();
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(749);
				match(EqualityOperator);
				setState(750);
				comparisionCheck();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisionCheckContext extends ParserRuleContext {
		public List<BitWiseShiftContext> bitWiseShift() {
			return getRuleContexts(BitWiseShiftContext.class);
		}
		public BitWiseShiftContext bitWiseShift(int i) {
			return getRuleContext(BitWiseShiftContext.class,i);
		}
		public TerminalNode ComparisionOperator() { return getToken(PHPParser.ComparisionOperator, 0); }
		public ComparisionCheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisionCheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterComparisionCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitComparisionCheck(this);
		}
	}

	public final ComparisionCheckContext comparisionCheck() throws RecognitionException {
		ComparisionCheckContext _localctx = new ComparisionCheckContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_comparisionCheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			bitWiseShift();
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(754);
				match(ComparisionOperator);
				setState(755);
				bitWiseShift();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitWiseShiftContext extends ParserRuleContext {
		public List<AdditionContext> addition() {
			return getRuleContexts(AdditionContext.class);
		}
		public AdditionContext addition(int i) {
			return getRuleContext(AdditionContext.class,i);
		}
		public List<TerminalNode> ShiftOperator() { return getTokens(PHPParser.ShiftOperator); }
		public TerminalNode ShiftOperator(int i) {
			return getToken(PHPParser.ShiftOperator, i);
		}
		public BitWiseShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitWiseShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBitWiseShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBitWiseShift(this);
		}
	}

	public final BitWiseShiftContext bitWiseShift() throws RecognitionException {
		BitWiseShiftContext _localctx = new BitWiseShiftContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_bitWiseShift);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			addition();
			setState(763);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(759);
					match(ShiftOperator);
					setState(760);
					addition();
					}
					} 
				}
				setState(765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionContext extends ParserRuleContext {
		public List<MultiplicationContext> multiplication() {
			return getRuleContexts(MultiplicationContext.class);
		}
		public MultiplicationContext multiplication(int i) {
			return getRuleContext(MultiplicationContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(PHPParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(PHPParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(PHPParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(PHPParser.Minus, i);
		}
		public List<TerminalNode> Dot() { return getTokens(PHPParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(PHPParser.Dot, i);
		}
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAddition(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_addition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			multiplication();
			setState(771);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(767);
					_la = _input.LA(1);
					if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (Plus - 55)) | (1L << (Minus - 55)) | (1L << (Dot - 55)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(768);
					multiplication();
					}
					} 
				}
				setState(773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicationContext extends ParserRuleContext {
		public List<LogicalNotContext> logicalNot() {
			return getRuleContexts(LogicalNotContext.class);
		}
		public LogicalNotContext logicalNot(int i) {
			return getRuleContext(LogicalNotContext.class,i);
		}
		public List<TerminalNode> Asterisk() { return getTokens(PHPParser.Asterisk); }
		public TerminalNode Asterisk(int i) {
			return getToken(PHPParser.Asterisk, i);
		}
		public List<TerminalNode> Forwardslash() { return getTokens(PHPParser.Forwardslash); }
		public TerminalNode Forwardslash(int i) {
			return getToken(PHPParser.Forwardslash, i);
		}
		public List<TerminalNode> Percent() { return getTokens(PHPParser.Percent); }
		public TerminalNode Percent(int i) {
			return getToken(PHPParser.Percent, i);
		}
		public MultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMultiplication(this);
		}
	}

	public final MultiplicationContext multiplication() throws RecognitionException {
		MultiplicationContext _localctx = new MultiplicationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_multiplication);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			logicalNot();
			setState(779);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(775);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Asterisk) | (1L << Percent) | (1L << Forwardslash))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(776);
					logicalNot();
					}
					} 
				}
				setState(781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalNotContext extends ParserRuleContext {
		public TerminalNode Bang() { return getToken(PHPParser.Bang, 0); }
		public LogicalNotContext logicalNot() {
			return getRuleContext(LogicalNotContext.class,0);
		}
		public InstanceOfContext instanceOf() {
			return getRuleContext(InstanceOfContext.class,0);
		}
		public LogicalNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitLogicalNot(this);
		}
	}

	public final LogicalNotContext logicalNot() throws RecognitionException {
		LogicalNotContext _localctx = new LogicalNotContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_logicalNot);
		try {
			setState(785);
			switch (_input.LA(1)) {
			case Bang:
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				match(Bang);
				setState(783);
				logicalNot();
				}
				break;
			case New:
			case Clone:
			case Ampersand:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case Array:
			case DecimalNumber:
			case HexNumber:
			case OctalNumber:
			case Float:
			case Boolean:
			case SingleQuotedString:
			case DoubleQuotedString_Start:
			case Identifier:
			case IncrementOperator:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				instanceOf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceOfContext extends ParserRuleContext {
		public List<NegateOrCastContext> negateOrCast() {
			return getRuleContexts(NegateOrCastContext.class);
		}
		public NegateOrCastContext negateOrCast(int i) {
			return getRuleContext(NegateOrCastContext.class,i);
		}
		public TerminalNode Instanceof() { return getToken(PHPParser.Instanceof, 0); }
		public InstanceOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInstanceOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInstanceOf(this);
		}
	}

	public final InstanceOfContext instanceOf() throws RecognitionException {
		InstanceOfContext _localctx = new InstanceOfContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_instanceOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			negateOrCast();
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(788);
				match(Instanceof);
				setState(789);
				negateOrCast();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegateOrCastContext extends ParserRuleContext {
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(PHPParser.Tilde, 0); }
		public TerminalNode Minus() { return getToken(PHPParser.Minus, 0); }
		public TerminalNode SuppressWarnings() { return getToken(PHPParser.SuppressWarnings, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PHPParser.OpenRoundBracket, 0); }
		public TerminalNode PrimitiveType() { return getToken(PHPParser.PrimitiveType, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PHPParser.CloseRoundBracket, 0); }
		public WeakLogicalAndContext weakLogicalAnd() {
			return getRuleContext(WeakLogicalAndContext.class,0);
		}
		public NegateOrCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negateOrCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNegateOrCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNegateOrCast(this);
		}
	}

	public final NegateOrCastContext negateOrCast() throws RecognitionException {
		NegateOrCastContext _localctx = new NegateOrCastContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_negateOrCast);
		int _la;
		try {
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(793);
				increment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				match(OpenRoundBracket);
				setState(795);
				match(PrimitiveType);
				setState(796);
				match(CloseRoundBracket);
				setState(797);
				increment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(798);
				match(OpenRoundBracket);
				setState(799);
				weakLogicalAnd();
				setState(800);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(802);
				increment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode IncrementOperator() { return getToken(PHPParser.IncrementOperator, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NewOrCloneContext newOrClone() {
			return getRuleContext(NewOrCloneContext.class,0);
		}
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitIncrement(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_increment);
		try {
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				match(IncrementOperator);
				setState(806);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				name();
				setState(808);
				match(IncrementOperator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(810);
				newOrClone();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewOrCloneContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(PHPParser.New, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode Clone() { return getToken(PHPParser.Clone, 0); }
		public AtomOrReferenceContext atomOrReference() {
			return getRuleContext(AtomOrReferenceContext.class,0);
		}
		public NewOrCloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newOrClone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNewOrClone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNewOrClone(this);
		}
	}

	public final NewOrCloneContext newOrClone() throws RecognitionException {
		NewOrCloneContext _localctx = new NewOrCloneContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_newOrClone);
		try {
			setState(818);
			switch (_input.LA(1)) {
			case New:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				match(New);
				setState(814);
				name();
				}
				break;
			case Clone:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				match(Clone);
				setState(816);
				name();
				}
				break;
			case Ampersand:
			case Dollar:
			case Array:
			case DecimalNumber:
			case HexNumber:
			case OctalNumber:
			case Float:
			case Boolean:
			case SingleQuotedString:
			case DoubleQuotedString_Start:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(817);
				atomOrReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomOrReferenceContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public AtomOrReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomOrReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAtomOrReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAtomOrReference(this);
		}
	}

	public final AtomOrReferenceContext atomOrReference() throws RecognitionException {
		AtomOrReferenceContext _localctx = new AtomOrReferenceContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_atomOrReference);
		try {
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				reference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode Array() { return getToken(PHPParser.Array, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PHPParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PHPParser.CloseRoundBracket, 0); }
		public List<ArrayEntryContext> arrayEntry() {
			return getRuleContexts(ArrayEntryContext.class);
		}
		public ArrayEntryContext arrayEntry(int i) {
			return getRuleContext(ArrayEntryContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PHPParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PHPParser.Comma, i);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitArrayDeclaration(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(Array);
			setState(825);
			match(OpenRoundBracket);
			setState(834);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << List) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings) | (1L << Dollar))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenRoundBracket - 70)) | (1L << (Array - 70)) | (1L << (DecimalNumber - 70)) | (1L << (HexNumber - 70)) | (1L << (OctalNumber - 70)) | (1L << (Float - 70)) | (1L << (Boolean - 70)) | (1L << (SingleQuotedString - 70)) | (1L << (DoubleQuotedString_Start - 70)) | (1L << (Identifier - 70)) | (1L << (IncrementOperator - 70)))) != 0)) {
				{
				setState(826);
				arrayEntry();
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(827);
					match(Comma);
					setState(828);
					arrayEntry();
					}
					}
					setState(833);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(836);
			match(CloseRoundBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayEntryContext extends ParserRuleContext {
		public KeyValuePairContext keyValuePair() {
			return getRuleContext(KeyValuePairContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterArrayEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitArrayEntry(this);
		}
	}

	public final ArrayEntryContext arrayEntry() throws RecognitionException {
		ArrayEntryContext _localctx = new ArrayEntryContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_arrayEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(838);
				keyValuePair();
				}
				break;
			case 2:
				{
				setState(839);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyValuePairContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ArrayAssign() { return getToken(PHPParser.ArrayAssign, 0); }
		public KeyValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterKeyValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitKeyValuePair(this);
		}
	}

	public final KeyValuePairContext keyValuePair() throws RecognitionException {
		KeyValuePairContext _localctx = new KeyValuePairContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_keyValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(842);
			expression();
			setState(843);
			match(ArrayAssign);
			setState(844);
			expression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_atom);
		try {
			setState(851);
			switch (_input.LA(1)) {
			case DecimalNumber:
			case HexNumber:
			case OctalNumber:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				number();
				}
				break;
			case SingleQuotedString:
			case DoubleQuotedString_Start:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				string();
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 3);
				{
				setState(848);
				bool();
				}
				break;
			case Array:
				enterOuterAlt(_localctx, 4);
				{
				setState(849);
				arrayDeclaration();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(850);
				functionInvocation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode Ampersand() { return getToken(PHPParser.Ampersand, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_reference);
		try {
			setState(856);
			switch (_input.LA(1)) {
			case Ampersand:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				match(Ampersand);
				setState(854);
				name();
				}
				break;
			case Dollar:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode Boolean() { return getToken(PHPParser.Boolean, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(Boolean);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_number);
		try {
			setState(862);
			switch (_input.LA(1)) {
			case DecimalNumber:
			case HexNumber:
			case OctalNumber:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				integer();
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				real();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(PHPParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(PHPParser.HexNumber, 0); }
		public TerminalNode OctalNumber() { return getToken(PHPParser.OctalNumber, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (OctalNumber - 85)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealContext extends ParserRuleContext {
		public List<TerminalNode> Float() { return getTokens(PHPParser.Float); }
		public TerminalNode Float(int i) {
			return getToken(PHPParser.Float, i);
		}
		public List<TerminalNode> RealE() { return getTokens(PHPParser.RealE); }
		public TerminalNode RealE(int i) {
			return getToken(PHPParser.RealE, i);
		}
		public List<TerminalNode> DecimalNumber() { return getTokens(PHPParser.DecimalNumber); }
		public TerminalNode DecimalNumber(int i) {
			return getToken(PHPParser.DecimalNumber, i);
		}
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitReal(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			match(Float);
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RealE) {
				{
				{
				setState(867);
				match(RealE);
				setState(868);
				_la = _input.LA(1);
				if ( !(_la==DecimalNumber || _la==Float) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode SingleQuotedString() { return getToken(PHPParser.SingleQuotedString, 0); }
		public DoubleQuotedStringContext doubleQuotedString() {
			return getRuleContext(DoubleQuotedStringContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_string);
		try {
			setState(876);
			switch (_input.LA(1)) {
			case SingleQuotedString:
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				match(SingleQuotedString);
				}
				break;
			case DoubleQuotedString_Start:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
				doubleQuotedString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoubleQuotedStringContext extends ParserRuleContext {
		public TerminalNode DoubleQuotedString_Start() { return getToken(PHPParser.DoubleQuotedString_Start, 0); }
		public TerminalNode DoubleQuotedString_End() { return getToken(PHPParser.DoubleQuotedString_End, 0); }
		public DoubleQuotedStringBodyContext doubleQuotedStringBody() {
			return getRuleContext(DoubleQuotedStringBodyContext.class,0);
		}
		public DoubleQuotedStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleQuotedString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterDoubleQuotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitDoubleQuotedString(this);
		}
	}

	public final DoubleQuotedStringContext doubleQuotedString() throws RecognitionException {
		DoubleQuotedStringContext _localctx = new DoubleQuotedStringContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_doubleQuotedString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(DoubleQuotedString_Start);
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(879);
				doubleQuotedStringBody();
				}
				break;
			}
			setState(882);
			match(DoubleQuotedString_End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoubleQuotedStringBodyContext extends ParserRuleContext {
		public List<TerminalNode> DoubleQuotedStringBody() { return getTokens(PHPParser.DoubleQuotedStringBody); }
		public TerminalNode DoubleQuotedStringBody(int i) {
			return getToken(PHPParser.DoubleQuotedStringBody, i);
		}
		public List<TerminalNode> VarName() { return getTokens(PHPParser.VarName); }
		public TerminalNode VarName(int i) {
			return getToken(PHPParser.VarName, i);
		}
		public DoubleQuotedStringBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleQuotedStringBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterDoubleQuotedStringBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitDoubleQuotedStringBody(this);
		}
	}

	public final DoubleQuotedStringBodyContext doubleQuotedStringBody() throws RecognitionException {
		DoubleQuotedStringBodyContext _localctx = new DoubleQuotedStringBodyContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_doubleQuotedStringBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DoubleQuotedStringBody || _la==VarName) {
				{
				{
				setState(884);
				_la = _input.LA(1);
				if ( !(_la==DoubleQuotedStringBody || _la==VarName) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3h\u037d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\3\2\5\2"+
		"\u00be\n\2\3\2\7\2\u00c1\n\2\f\2\16\2\u00c4\13\2\3\3\3\3\3\4\7\4\u00c9"+
		"\n\4\f\4\16\4\u00cc\13\4\3\4\3\4\5\4\u00d0\n\4\3\4\7\4\u00d3\n\4\f\4\16"+
		"\4\u00d6\13\4\3\5\3\5\3\5\7\5\u00db\n\5\f\5\16\5\u00de\13\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00ea\n\5\f\5\16\5\u00ed\13\5\3\5\3"+
		"\5\3\5\3\5\7\5\u00f3\n\5\f\5\16\5\u00f6\13\5\3\5\5\5\u00f9\n\5\3\6\5\6"+
		"\u00fc\n\6\3\6\3\6\3\6\3\6\5\6\u0102\n\6\3\6\5\6\u0105\n\6\7\6\u0107\n"+
		"\6\f\6\16\6\u010a\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\5\13\u0118\n\13\3\f\3\f\3\r\3\r\7\r\u011e\n\r\f\r\16\r\u0121\13\r"+
		"\3\r\5\r\u0124\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u0135\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u013e\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0155\n\23"+
		"\f\23\16\23\u0158\13\23\3\23\3\23\5\23\u015c\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u0169\n\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0185\n\30\3\31\3\31\3\31"+
		"\3\31\7\31\u018b\n\31\f\31\16\31\u018e\13\31\3\32\5\32\u0191\n\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\5\33\u0199\n\33\3\34\3\34\5\34\u019d\n\34\3"+
		"\35\3\35\5\35\u01a1\n\35\3\36\3\36\3\36\3\37\7\37\u01a7\n\37\f\37\16\37"+
		"\u01aa\13\37\3\37\3\37\3 \3 \3 \3 \7 \u01b2\n \f \16 \u01b5\13 \3!\3!"+
		"\3!\7!\u01ba\n!\f!\16!\u01bd\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01c6"+
		"\n\"\3#\3#\3$\3$\3$\5$\u01cd\n$\3%\3%\3%\3%\3&\3&\3&\3&\3&\7&\u01d8\n"+
		"&\f&\16&\u01db\13&\3\'\3\'\7\'\u01df\n\'\f\'\16\'\u01e2\13\'\3\'\3\'\3"+
		"(\3(\3(\5(\u01e9\n(\3(\3(\7(\u01ed\n(\f(\16(\u01f0\13(\3(\3(\3)\3)\3*"+
		"\3*\3*\3*\7*\u01fa\n*\f*\16*\u01fd\13*\3+\3+\3+\3+\5+\u0203\n+\3+\3+\7"+
		"+\u0207\n+\f+\16+\u020a\13+\3+\3+\3+\3+\3+\5+\u0211\n+\3,\3,\3-\5-\u0216"+
		"\n-\3-\3-\3-\3-\5-\u021c\n-\3-\5-\u021f\n-\3-\3-\7-\u0223\n-\f-\16-\u0226"+
		"\13-\3-\3-\3.\3.\3.\3.\7.\u022e\n.\f.\16.\u0231\13.\3/\7/\u0234\n/\f/"+
		"\16/\u0237\13/\3/\3/\3/\3/\3/\5/\u023e\n/\3/\3/\3/\3/\5/\u0244\n/\3/\7"+
		"/\u0247\n/\f/\16/\u024a\13/\3/\3/\3/\5/\u024f\n/\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\5\62\u025b\n\62\3\63\3\63\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u026b\n\66\f\66\16"+
		"\66\u026e\13\66\5\66\u0270\n\66\3\66\3\66\3\67\3\67\3\67\38\38\39\59\u027a"+
		"\n9\39\59\u027d\n9\39\59\u0280\n9\3:\3:\3:\5:\u0285\n:\3;\3;\3;\3;\3;"+
		"\5;\u028c\n;\3<\3<\3<\7<\u0291\n<\f<\16<\u0294\13<\3=\3=\3>\3>\3>\7>\u029b"+
		"\n>\f>\16>\u029e\13>\3?\3?\3?\7?\u02a3\n?\f?\16?\u02a6\13?\3@\3@\3@\7"+
		"@\u02ab\n@\f@\16@\u02ae\13@\3A\3A\3A\3A\3A\5A\u02b5\nA\3B\3B\3B\3B\3B"+
		"\7B\u02bc\nB\fB\16B\u02bf\13B\3B\3B\3B\5B\u02c4\nB\3C\3C\3C\3C\3C\3C\3"+
		"C\5C\u02cd\nC\3D\3D\3D\7D\u02d2\nD\fD\16D\u02d5\13D\3E\3E\3E\7E\u02da"+
		"\nE\fE\16E\u02dd\13E\3F\3F\3F\7F\u02e2\nF\fF\16F\u02e5\13F\3G\3G\3G\7"+
		"G\u02ea\nG\fG\16G\u02ed\13G\3H\3H\3H\5H\u02f2\nH\3I\3I\3I\5I\u02f7\nI"+
		"\3J\3J\3J\7J\u02fc\nJ\fJ\16J\u02ff\13J\3K\3K\3K\7K\u0304\nK\fK\16K\u0307"+
		"\13K\3L\3L\3L\7L\u030c\nL\fL\16L\u030f\13L\3M\3M\3M\5M\u0314\nM\3N\3N"+
		"\3N\5N\u0319\nN\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0326\nO\3P\3P\3P"+
		"\3P\3P\3P\5P\u032e\nP\3Q\3Q\3Q\3Q\3Q\5Q\u0335\nQ\3R\3R\5R\u0339\nR\3S"+
		"\3S\3S\3S\3S\7S\u0340\nS\fS\16S\u0343\13S\5S\u0345\nS\3S\3S\3T\3T\5T\u034b"+
		"\nT\3U\3U\3U\3U\3V\3V\3V\3V\3V\5V\u0356\nV\3W\3W\3W\5W\u035b\nW\3X\3X"+
		"\3Y\3Y\5Y\u0361\nY\3Z\3Z\3[\3[\3[\7[\u0368\n[\f[\16[\u036b\13[\3\\\3\\"+
		"\5\\\u036f\n\\\3]\3]\5]\u0373\n]\3]\3]\3^\7^\u0378\n^\f^\16^\u037b\13"+
		"^\3^\2\2_\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\2\r\3\2\5\6\3\2\17\20\4\2\7\7\t\t\4\2QRVV\4\2\63\63``\4\29:BB\3\2;=\5"+
		"\2::>>@@\3\2WY\4\2WWZZ\3\2fg\u0394\2\u00bd\3\2\2\2\4\u00c5\3\2\2\2\6\u00ca"+
		"\3\2\2\2\b\u00f8\3\2\2\2\n\u00fb\3\2\2\2\f\u010b\3\2\2\2\16\u010d\3\2"+
		"\2\2\20\u0111\3\2\2\2\22\u0113\3\2\2\2\24\u0117\3\2\2\2\26\u0119\3\2\2"+
		"\2\30\u011b\3\2\2\2\32\u0125\3\2\2\2\34\u0127\3\2\2\2\36\u0134\3\2\2\2"+
		" \u013d\3\2\2\2\"\u013f\3\2\2\2$\u0149\3\2\2\2&\u015d\3\2\2\2(\u0165\3"+
		"\2\2\2*\u016d\3\2\2\2,\u0175\3\2\2\2.\u0184\3\2\2\2\60\u0186\3\2\2\2\62"+
		"\u0190\3\2\2\2\64\u0196\3\2\2\2\66\u019a\3\2\2\28\u019e\3\2\2\2:\u01a2"+
		"\3\2\2\2<\u01a8\3\2\2\2>\u01ad\3\2\2\2@\u01b6\3\2\2\2B\u01c5\3\2\2\2D"+
		"\u01c7\3\2\2\2F\u01cc\3\2\2\2H\u01ce\3\2\2\2J\u01d2\3\2\2\2L\u01dc\3\2"+
		"\2\2N\u01e5\3\2\2\2P\u01f3\3\2\2\2R\u01f5\3\2\2\2T\u0210\3\2\2\2V\u0212"+
		"\3\2\2\2X\u0215\3\2\2\2Z\u0229\3\2\2\2\\\u024e\3\2\2\2^\u0250\3\2\2\2"+
		"`\u0252\3\2\2\2b\u0257\3\2\2\2d\u025c\3\2\2\2f\u025e\3\2\2\2h\u0261\3"+
		"\2\2\2j\u0266\3\2\2\2l\u0273\3\2\2\2n\u0276\3\2\2\2p\u0279\3\2\2\2r\u0281"+
		"\3\2\2\2t\u028b\3\2\2\2v\u028d\3\2\2\2x\u0295\3\2\2\2z\u0297\3\2\2\2|"+
		"\u029f\3\2\2\2~\u02a7\3\2\2\2\u0080\u02b4\3\2\2\2\u0082\u02c3\3\2\2\2"+
		"\u0084\u02cc\3\2\2\2\u0086\u02ce\3\2\2\2\u0088\u02d6\3\2\2\2\u008a\u02de"+
		"\3\2\2\2\u008c\u02e6\3\2\2\2\u008e\u02ee\3\2\2\2\u0090\u02f3\3\2\2\2\u0092"+
		"\u02f8\3\2\2\2\u0094\u0300\3\2\2\2\u0096\u0308\3\2\2\2\u0098\u0313\3\2"+
		"\2\2\u009a\u0315\3\2\2\2\u009c\u0325\3\2\2\2\u009e\u032d\3\2\2\2\u00a0"+
		"\u0334\3\2\2\2\u00a2\u0338\3\2\2\2\u00a4\u033a\3\2\2\2\u00a6\u034a\3\2"+
		"\2\2\u00a8\u034c\3\2\2\2\u00aa\u0355\3\2\2\2\u00ac\u035a\3\2\2\2\u00ae"+
		"\u035c\3\2\2\2\u00b0\u0360\3\2\2\2\u00b2\u0362\3\2\2\2\u00b4\u0364\3\2"+
		"\2\2\u00b6\u036e\3\2\2\2\u00b8\u0370\3\2\2\2\u00ba\u0379\3\2\2\2\u00bc"+
		"\u00be\5\4\3\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c2\3\2"+
		"\2\2\u00bf\u00c1\5\6\4\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\3\3\2\2\2\u00c4\u00c2\3\2\2\2"+
		"\u00c5\u00c6\7\4\2\2\u00c6\5\3\2\2\2\u00c7\u00c9\5\24\13\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cf\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\5\b\5\2\u00ce\u00d0\5\30"+
		"\r\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d4\3\2\2\2\u00d1"+
		"\u00d3\5\24\13\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3"+
		"\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8"+
		"\7\b\2\2\u00d8\u00dc\7\21\2\2\u00d9\u00db\5\16\b\2\u00da\u00d9\3\2\2\2"+
		"\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\13\2\2\u00e0\u00e1\5\n\6\2"+
		"\u00e1\u00e2\7\b\2\2\u00e2\u00e3\7\r\2\2\u00e3\u00e4\7\21\2\2\u00e4\u00e5"+
		"\7\13\2\2\u00e5\u00f9\3\2\2\2\u00e6\u00e7\7\b\2\2\u00e7\u00eb\7\21\2\2"+
		"\u00e8\u00ea\5\16\b\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f9\7\f\2\2\u00ef\u00f0\7\b\2\2\u00f0\u00f4\7\21\2\2\u00f1\u00f3\5"+
		"\16\b\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\7\13"+
		"\2\2\u00f8\u00d7\3\2\2\2\u00f8\u00e6\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f9"+
		"\t\3\2\2\2\u00fa\u00fc\5\22\n\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2"+
		"\2\u00fc\u0108\3\2\2\2\u00fd\u0102\5\b\5\2\u00fe\u0102\5\f\7\2\u00ff\u0102"+
		"\5\26\f\2\u0100\u0102\5\30\r\2\u0101\u00fd\3\2\2\2\u0101\u00fe\3\2\2\2"+
		"\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0105"+
		"\5\22\n\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2"+
		"\u0106\u0101\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\13\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\t\2\2\2\u010c"+
		"\r\3\2\2\2\u010d\u010e\7\21\2\2\u010e\u010f\7\16\2\2\u010f\u0110\5\20"+
		"\t\2\u0110\17\3\2\2\2\u0111\u0112\t\3\2\2\u0112\21\3\2\2\2\u0113\u0114"+
		"\t\4\2\2\u0114\23\3\2\2\2\u0115\u0118\5\26\f\2\u0116\u0118\7\7\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\25\3\2\2\2\u0119\u011a\7\3\2"+
		"\2\u011a\27\3\2\2\2\u011b\u011f\5\32\16\2\u011c\u011e\5\36\20\2\u011d"+
		"\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\5\34\17\2\u0123"+
		"\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\31\3\2\2\2\u0125\u0126\7\n\2"+
		"\2\u0126\33\3\2\2\2\u0127\u0128\7\23\2\2\u0128\35\3\2\2\2\u0129\u012a"+
		"\7L\2\2\u012a\u012b\5\36\20\2\u012b\u012c\7M\2\2\u012c\u0135\3\2\2\2\u012d"+
		"\u0135\5L\'\2\u012e\u0135\5X-\2\u012f\u0135\5N(\2\u0130\u0135\5 \21\2"+
		"\u0131\u0132\5.\30\2\u0132\u0133\7\31\2\2\u0133\u0135\3\2\2\2\u0134\u0129"+
		"\3\2\2\2\u0134\u012d\3\2\2\2\u0134\u012e\3\2\2\2\u0134\u012f\3\2\2\2\u0134"+
		"\u0130\3\2\2\2\u0134\u0131\3\2\2\2\u0135\37\3\2\2\2\u0136\u013e\5$\23"+
		"\2\u0137\u013e\5\"\22\2\u0138\u013e\5&\24\2\u0139\u013e\5(\25\2\u013a"+
		"\u013e\5*\26\2\u013b\u013e\5,\27\2\u013c\u013e\5h\65\2\u013d\u0136\3\2"+
		"\2\2\u013d\u0137\3\2\2\2\u013d\u0138\3\2\2\2\u013d\u0139\3\2\2\2\u013d"+
		"\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e!\3\2\2\2"+
		"\u013f\u0140\7\60\2\2\u0140\u0141\7H\2\2\u0141\u0142\5x=\2\u0142\u0143"+
		"\7\31\2\2\u0143\u0144\5x=\2\u0144\u0145\7\31\2\2\u0145\u0146\5x=\2\u0146"+
		"\u0147\7I\2\2\u0147\u0148\5\36\20\2\u0148#\3\2\2\2\u0149\u014a\7-\2\2"+
		"\u014a\u014b\7H\2\2\u014b\u014c\5x=\2\u014c\u014d\7I\2\2\u014d\u0156\5"+
		"\36\20\2\u014e\u014f\7/\2\2\u014f\u0150\7H\2\2\u0150\u0151\5x=\2\u0151"+
		"\u0152\7I\2\2\u0152\u0153\5\36\20\2\u0153\u0155\3\2\2\2\u0154\u014e\3"+
		"\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u015b\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7.\2\2\u015a\u015c\5\36"+
		"\20\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c%\3\2\2\2\u015d\u015e"+
		"\7\61\2\2\u015e\u015f\7H\2\2\u015f\u0160\5B\"\2\u0160\u0161\7\30\2\2\u0161"+
		"\u0162\5\u00a6T\2\u0162\u0163\7I\2\2\u0163\u0164\5\36\20\2\u0164\'\3\2"+
		"\2\2\u0165\u0166\7\62\2\2\u0166\u0168\7H\2\2\u0167\u0169\5x=\2\u0168\u0167"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\7I\2\2\u016b"+
		"\u016c\5\36\20\2\u016c)\3\2\2\2\u016d\u016e\7\'\2\2\u016e\u016f\5\36\20"+
		"\2\u016f\u0170\7\62\2\2\u0170\u0171\7H\2\2\u0171\u0172\5x=\2\u0172\u0173"+
		"\7I\2\2\u0173\u0174\7\31\2\2\u0174+\3\2\2\2\u0175\u0176\7(\2\2\u0176\u0177"+
		"\7H\2\2\u0177\u0178\5x=\2\u0178\u0179\7I\2\2\u0179\u017a\7L\2\2\u017a"+
		"\u017b\5<\37\2\u017b\u017c\7M\2\2\u017c-\3\2\2\2\u017d\u0185\5\60\31\2"+
		"\u017e\u0185\5\62\32\2\u017f\u0185\5\64\33\2\u0180\u0185\5\66\34\2\u0181"+
		"\u0185\58\35\2\u0182\u0185\5:\36\2\u0183\u0185\5x=\2\u0184\u017d\3\2\2"+
		"\2\u0184\u017e\3\2\2\2\u0184\u017f\3\2\2\2\u0184\u0180\3\2\2\2\u0184\u0181"+
		"\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185/\3\2\2\2\u0186"+
		"\u0187\7 \2\2\u0187\u018c\5F$\2\u0188\u0189\7O\2\2\u0189\u018b\5F$\2\u018a"+
		"\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\61\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\7R\2\2\u0190\u018f"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\5B\"\2\u0193"+
		"\u0194\7\63\2\2\u0194\u0195\5x=\2\u0195\63\3\2\2\2\u0196\u0198\7,\2\2"+
		"\u0197\u0199\7W\2\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\65\3"+
		"\2\2\2\u019a\u019c\7!\2\2\u019b\u019d\7W\2\2\u019c\u019b\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\67\3\2\2\2\u019e\u01a0\7\"\2\2\u019f\u01a1\5x=\2"+
		"\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a19\3\2\2\2\u01a2\u01a3\7"+
		"T\2\2\u01a3\u01a4\5x=\2\u01a4;\3\2\2\2\u01a5\u01a7\5> \2\u01a6\u01a5\3"+
		"\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\5@!\2\u01ac=\3\2\2\2\u01ad"+
		"\u01ae\7)\2\2\u01ae\u01af\5x=\2\u01af\u01b3\7P\2\2\u01b0\u01b2\5\36\20"+
		"\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4"+
		"\3\2\2\2\u01b4?\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\7*\2\2\u01b7\u01bb"+
		"\7P\2\2\u01b8\u01ba\5\36\20\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2"+
		"\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bcA\3\2\2\2\u01bd\u01bb\3"+
		"\2\2\2\u01be\u01bf\7A\2\2\u01bf\u01c6\5D#\2\u01c0\u01c1\7A\2\2\u01c1\u01c2"+
		"\5D#\2\u01c2\u01c3\7?\2\2\u01c3\u01c4\5D#\2\u01c4\u01c6\3\2\2\2\u01c5"+
		"\u01be\3\2\2\2\u01c5\u01c0\3\2\2\2\u01c6C\3\2\2\2\u01c7\u01c8\7_\2\2\u01c8"+
		"E\3\2\2\2\u01c9\u01cd\5H%\2\u01ca\u01cd\5J&\2\u01cb\u01cd\5B\"\2\u01cc"+
		"\u01c9\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cdG\3\2\2\2"+
		"\u01ce\u01cf\7_\2\2\u01cf\u01d0\7F\2\2\u01d0\u01d1\5B\"\2\u01d1I\3\2\2"+
		"\2\u01d2\u01d9\5B\"\2\u01d3\u01d4\7J\2\2\u01d4\u01d5\5x=\2\u01d5\u01d6"+
		"\7K\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d3\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9"+
		"\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01daK\3\2\2\2\u01db\u01d9\3\2\2\2"+
		"\u01dc\u01e0\7L\2\2\u01dd\u01df\5\36\20\2\u01de\u01dd\3\2\2\2\u01df\u01e2"+
		"\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e3\u01e4\7M\2\2\u01e4M\3\2\2\2\u01e5\u01e6\7N\2\2\u01e6"+
		"\u01e8\5P)\2\u01e7\u01e9\5R*\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2"+
		"\u01e9\u01ea\3\2\2\2\u01ea\u01ee\7L\2\2\u01eb\u01ed\5T+\2\u01ec\u01eb"+
		"\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f2\7M\2\2\u01f2O\3\2\2\2\u01f3"+
		"\u01f4\7_\2\2\u01f4Q\3\2\2\2\u01f5\u01f6\7&\2\2\u01f6\u01fb\5P)\2\u01f7"+
		"\u01f8\7O\2\2\u01f8\u01fa\5P)\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\3\2\2"+
		"\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fcS\3\2\2\2\u01fd\u01fb"+
		"\3\2\2\2\u01fe\u01ff\7\35\2\2\u01ff\u0202\7_\2\2\u0200\u0201\7\63\2\2"+
		"\u0201\u0203\5\u00aaV\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0211\7\31\2\2\u0205\u0207\5d\63\2\u0206\u0205\3"+
		"\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020b\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020c\7+\2\2\u020c\u020d\5n8"+
		"\2\u020d\u020e\5j\66\2\u020e\u020f\7\31\2\2\u020f\u0211\3\2\2\2\u0210"+
		"\u01fe\3\2\2\2\u0210\u0208\3\2\2\2\u0211U\3\2\2\2\u0212\u0213\7_\2\2\u0213"+
		"W\3\2\2\2\u0214\u0216\5^\60\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2"+
		"\u0216\u0217\3\2\2\2\u0217\u0218\7%\2\2\u0218\u021b\5V,\2\u0219\u021a"+
		"\7&\2\2\u021a\u021c\5V,\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021e\3\2\2\2\u021d\u021f\5Z.\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2"+
		"\2\u021f\u0220\3\2\2\2\u0220\u0224\7L\2\2\u0221\u0223\5\\/\2\u0222\u0221"+
		"\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\7M\2\2\u0228Y\3\2\2\2\u0229"+
		"\u022a\7#\2\2\u022a\u022f\5P)\2\u022b\u022c\7O\2\2\u022c\u022e\5P)\2\u022d"+
		"\u022b\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2"+
		"\2\2\u0230[\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0234\5d\63\2\u0233\u0232"+
		"\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"\u0238\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u0239\7+\2\2\u0239\u023a\5n8"+
		"\2\u023a\u023d\5j\66\2\u023b\u023e\5L\'\2\u023c\u023e\7\31\2\2\u023d\u023b"+
		"\3\2\2\2\u023d\u023c\3\2\2\2\u023e\u024f\3\2\2\2\u023f\u0240\5`\61\2\u0240"+
		"\u0241\7\31\2\2\u0241\u024f\3\2\2\2\u0242\u0244\7$\2\2\u0243\u0242\3\2"+
		"\2\2\u0243\u0244\3\2\2\2\u0244\u0248\3\2\2\2\u0245\u0247\5d\63\2\u0246"+
		"\u0245\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2"+
		"\2\2\u0249\u024b\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024c\5b\62\2\u024c"+
		"\u024d\7\31\2\2\u024d\u024f\3\2\2\2\u024e\u0235\3\2\2\2\u024e\u023f\3"+
		"\2\2\2\u024e\u0243\3\2\2\2\u024f]\3\2\2\2\u0250\u0251\7Q\2\2\u0251_\3"+
		"\2\2\2\u0252\u0253\7\35\2\2\u0253\u0254\5D#\2\u0254\u0255\7\63\2\2\u0255"+
		"\u0256\5\u00aaV\2\u0256a\3\2\2\2\u0257\u025a\5f\64\2\u0258\u0259\7\63"+
		"\2\2\u0259\u025b\5\u00aaV\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"c\3\2\2\2\u025c\u025d\t\5\2\2\u025de\3\2\2\2\u025e\u025f\7A\2\2\u025f"+
		"\u0260\5D#\2\u0260g\3\2\2\2\u0261\u0262\7+\2\2\u0262\u0263\5n8\2\u0263"+
		"\u0264\5j\66\2\u0264\u0265\5L\'\2\u0265i\3\2\2\2\u0266\u026f\7H\2\2\u0267"+
		"\u026c\5r:\2\u0268\u0269\7O\2\2\u0269\u026b\5r:\2\u026a\u0268\3\2\2\2"+
		"\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u0270"+
		"\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0267\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u0272\7I\2\2\u0272k\3\2\2\2\u0273\u0274\5n8\2\u0274"+
		"\u0275\5p9\2\u0275m\3\2\2\2\u0276\u0277\7_\2\2\u0277o\3\2\2\2\u0278\u027a"+
		"\7H\2\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\3\2\2\2\u027b"+
		"\u027d\5v<\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2\2"+
		"\2\u027e\u0280\7I\2\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280q\3"+
		"\2\2\2\u0281\u0284\5t;\2\u0282\u0283\7\63\2\2\u0283\u0285\5\u00aaV\2\u0284"+
		"\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285s\3\2\2\2\u0286\u0287\7A\2\2\u0287"+
		"\u028c\7_\2\2\u0288\u0289\7\66\2\2\u0289\u028a\7A\2\2\u028a\u028c\7_\2"+
		"\2\u028b\u0286\3\2\2\2\u028b\u0288\3\2\2\2\u028cu\3\2\2\2\u028d\u0292"+
		"\5x=\2\u028e\u028f\7O\2\2\u028f\u0291\5x=\2\u0290\u028e\3\2\2\2\u0291"+
		"\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293w\3\2\2\2"+
		"\u0294\u0292\3\2\2\2\u0295\u0296\5z>\2\u0296y\3\2\2\2\u0297\u029c\5|?"+
		"\2\u0298\u0299\7\36\2\2\u0299\u029b\5|?\2\u029a\u0298\3\2\2\2\u029b\u029e"+
		"\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d{\3\2\2\2\u029e"+
		"\u029c\3\2\2\2\u029f\u02a4\5~@\2\u02a0\u02a1\7\37\2\2\u02a1\u02a3\5~@"+
		"\2\u02a2\u02a0\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5"+
		"\3\2\2\2\u02a5}\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02ac\5\u0080A\2\u02a8"+
		"\u02a9\7\33\2\2\u02a9\u02ab\5\u0080A\2\u02aa\u02a8\3\2\2\2\u02ab\u02ae"+
		"\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\177\3\2\2\2\u02ae"+
		"\u02ac\3\2\2\2\u02af\u02b0\5\u0082B\2\u02b0\u02b1\t\6\2\2\u02b1\u02b2"+
		"\5\u0080A\2\u02b2\u02b5\3\2\2\2\u02b3\u02b5\5\u0084C\2\u02b4\u02af\3\2"+
		"\2\2\u02b4\u02b3\3\2\2\2\u02b5\u0081\3\2\2\2\u02b6\u02b7\7\34\2\2\u02b7"+
		"\u02b8\7H\2\2\u02b8\u02bd\5F$\2\u02b9\u02ba\7O\2\2\u02ba\u02bc\5F$\2\u02bb"+
		"\u02b9\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2"+
		"\2\2\u02be\u02c0\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c1\7I\2\2\u02c1"+
		"\u02c4\3\2\2\2\u02c2\u02c4\5F$\2\u02c3\u02b6\3\2\2\2\u02c3\u02c2\3\2\2"+
		"\2\u02c4\u0083\3\2\2\2\u02c5\u02c6\5\u0086D\2\u02c6\u02c7\7G\2\2\u02c7"+
		"\u02c8\5x=\2\u02c8\u02c9\7P\2\2\u02c9\u02ca\5x=\2\u02ca\u02cd\3\2\2\2"+
		"\u02cb\u02cd\5\u0086D\2\u02cc\u02c5\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cd"+
		"\u0085\3\2\2\2\u02ce\u02d3\5\u0088E\2\u02cf\u02d0\7D\2\2\u02d0\u02d2\5"+
		"\u0088E\2\u02d1\u02cf\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2"+
		"\u02d3\u02d4\3\2\2\2\u02d4\u0087\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02db"+
		"\5\u008aF\2\u02d7\u02d8\7E\2\2\u02d8\u02da\5\u008aF\2\u02d9\u02d7\3\2"+
		"\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u0089\3\2\2\2\u02dd\u02db\3\2\2\2\u02de\u02e3\5\u008cG\2\u02df\u02e0"+
		"\7\67\2\2\u02e0\u02e2\5\u008cG\2\u02e1\u02df\3\2\2\2\u02e2\u02e5\3\2\2"+
		"\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u008b\3\2\2\2\u02e5\u02e3"+
		"\3\2\2\2\u02e6\u02eb\5\u008eH\2\u02e7\u02e8\7\66\2\2\u02e8\u02ea\5\u008e"+
		"H\2\u02e9\u02e7\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb"+
		"\u02ec\3\2\2\2\u02ec\u008d\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02f1\5\u0090"+
		"I\2\u02ef\u02f0\7a\2\2\u02f0\u02f2\5\u0090I\2\u02f1\u02ef\3\2\2\2\u02f1"+
		"\u02f2\3\2\2\2\u02f2\u008f\3\2\2\2\u02f3\u02f6\5\u0092J\2\u02f4\u02f5"+
		"\7b\2\2\u02f5\u02f7\5\u0092J\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2"+
		"\u02f7\u0091\3\2\2\2\u02f8\u02fd\5\u0094K\2\u02f9\u02fa\7c\2\2\u02fa\u02fc"+
		"\5\u0094K\2\u02fb\u02f9\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2"+
		"\2\u02fd\u02fe\3\2\2\2\u02fe\u0093\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300\u0305"+
		"\5\u0096L\2\u0301\u0302\t\7\2\2\u0302\u0304\5\u0096L\2\u0303\u0301\3\2"+
		"\2\2\u0304\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306"+
		"\u0095\3\2\2\2\u0307\u0305\3\2\2\2\u0308\u030d\5\u0098M\2\u0309\u030a"+
		"\t\b\2\2\u030a\u030c\5\u0098M\2\u030b\u0309\3\2\2\2\u030c\u030f\3\2\2"+
		"\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0097\3\2\2\2\u030f\u030d"+
		"\3\2\2\2\u0310\u0311\78\2\2\u0311\u0314\5\u0098M\2\u0312\u0314\5\u009a"+
		"N\2\u0313\u0310\3\2\2\2\u0313\u0312\3\2\2\2\u0314\u0099\3\2\2\2\u0315"+
		"\u0318\5\u009cO\2\u0316\u0317\7\32\2\2\u0317\u0319\5\u009cO\2\u0318\u0316"+
		"\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u009b\3\2\2\2\u031a\u031b\t\t\2\2\u031b"+
		"\u0326\5\u009eP\2\u031c\u031d\7H\2\2\u031d\u031e\7U\2\2\u031e\u031f\7"+
		"I\2\2\u031f\u0326\5\u009eP\2\u0320\u0321\7H\2\2\u0321\u0322\5~@\2\u0322"+
		"\u0323\7I\2\2\u0323\u0326\3\2\2\2\u0324\u0326\5\u009eP\2\u0325\u031a\3"+
		"\2\2\2\u0325\u031c\3\2\2\2\u0325\u0320\3\2\2\2\u0325\u0324\3\2\2\2\u0326"+
		"\u009d\3\2\2\2\u0327\u0328\7d\2\2\u0328\u032e\5F$\2\u0329\u032a\5F$\2"+
		"\u032a\u032b\7d\2\2\u032b\u032e\3\2\2\2\u032c\u032e\5\u00a0Q\2\u032d\u0327"+
		"\3\2\2\2\u032d\u0329\3\2\2\2\u032d\u032c\3\2\2\2\u032e\u009f\3\2\2\2\u032f"+
		"\u0330\7\64\2\2\u0330\u0335\5F$\2\u0331\u0332\7\65\2\2\u0332\u0335\5F"+
		"$\2\u0333\u0335\5\u00a2R\2\u0334\u032f\3\2\2\2\u0334\u0331\3\2\2\2\u0334"+
		"\u0333\3\2\2\2\u0335\u00a1\3\2\2\2\u0336\u0339\5\u00aaV\2\u0337\u0339"+
		"\5\u00acW\2\u0338\u0336\3\2\2\2\u0338\u0337\3\2\2\2\u0339\u00a3\3\2\2"+
		"\2\u033a\u033b\7S\2\2\u033b\u0344\7H\2\2\u033c\u0341\5\u00a6T\2\u033d"+
		"\u033e\7O\2\2\u033e\u0340\5\u00a6T\2\u033f\u033d\3\2\2\2\u0340\u0343\3"+
		"\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0345\3\2\2\2\u0343"+
		"\u0341\3\2\2\2\u0344\u033c\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2"+
		"\2\2\u0346\u0347\7I\2\2\u0347\u00a5\3\2\2\2\u0348\u034b\5\u00a8U\2\u0349"+
		"\u034b\5x=\2\u034a\u0348\3\2\2\2\u034a\u0349\3\2\2\2\u034b\u00a7\3\2\2"+
		"\2\u034c\u034d\5x=\2\u034d\u034e\7C\2\2\u034e\u034f\5x=\2\u034f\u00a9"+
		"\3\2\2\2\u0350\u0356\5\u00b0Y\2\u0351\u0356\5\u00b6\\\2\u0352\u0356\5"+
		"\u00aeX\2\u0353\u0356\5\u00a4S\2\u0354\u0356\5l\67\2\u0355\u0350\3\2\2"+
		"\2\u0355\u0351\3\2\2\2\u0355\u0352\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0354"+
		"\3\2\2\2\u0356\u00ab\3\2\2\2\u0357\u0358\7\66\2\2\u0358\u035b\5F$\2\u0359"+
		"\u035b\5F$\2\u035a\u0357\3\2\2\2\u035a\u0359\3\2\2\2\u035b\u00ad\3\2\2"+
		"\2\u035c\u035d\7\\\2\2\u035d\u00af\3\2\2\2\u035e\u0361\5\u00b2Z\2\u035f"+
		"\u0361\5\u00b4[\2\u0360\u035e\3\2\2\2\u0360\u035f\3\2\2\2\u0361\u00b1"+
		"\3\2\2\2\u0362\u0363\t\n\2\2\u0363\u00b3\3\2\2\2\u0364\u0369\7Z\2\2\u0365"+
		"\u0366\7\27\2\2\u0366\u0368\t\13\2\2\u0367\u0365\3\2\2\2\u0368\u036b\3"+
		"\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u00b5\3\2\2\2\u036b"+
		"\u0369\3\2\2\2\u036c\u036f\7]\2\2\u036d\u036f\5\u00b8]\2\u036e\u036c\3"+
		"\2\2\2\u036e\u036d\3\2\2\2\u036f\u00b7\3\2\2\2\u0370\u0372\7^\2\2\u0371"+
		"\u0373\5\u00ba^\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374"+
		"\3\2\2\2\u0374\u0375\7h\2\2\u0375\u00b9\3\2\2\2\u0376\u0378\t\f\2\2\u0377"+
		"\u0376\3\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2"+
		"\2\2\u037a\u00bb\3\2\2\2\u037b\u0379\3\2\2\2]\u00bd\u00c2\u00ca\u00cf"+
		"\u00d4\u00dc\u00eb\u00f4\u00f8\u00fb\u0101\u0104\u0108\u0117\u011f\u0123"+
		"\u0134\u013d\u0156\u015b\u0168\u0184\u018c\u0190\u0198\u019c\u01a0\u01a8"+
		"\u01b3\u01bb\u01c5\u01cc\u01d9\u01e0\u01e8\u01ee\u01fb\u0202\u0208\u0210"+
		"\u0215\u021b\u021e\u0224\u022f\u0235\u023d\u0243\u0248\u024e\u025a\u026c"+
		"\u026f\u0279\u027c\u027f\u0284\u028b\u0292\u029c\u02a4\u02ac\u02b4\u02bd"+
		"\u02c3\u02cc\u02d3\u02db\u02e3\u02eb\u02f1\u02f6\u02fd\u0305\u030d\u0313"+
		"\u0318\u0325\u032d\u0334\u0338\u0341\u0344\u034a\u0355\u035a\u0360\u0369"+
		"\u036e\u0372\u0379";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}