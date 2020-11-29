// Generated from es\u005Cucm\fdi\ac\lexers\PHPLexer.g4 by ANTLR 4.5.3
package es.ucm.fdi.ac.lexers;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PHPLexer extends Lexer {
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
	public static final int INSIDE = 1;
	public static final int PHP = 2;
	public static final int PHPString = 3;
	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE", "PHP", "PHPString"
	};

	public static final String[] ruleNames = {
		"HTML_COMMENT", "HTML_DTD", "HTML_EntityRef", "HTML_CharRef", "SEA_WS", 
		"OPEN", "HTML_TEXT", "PHP_Start", "HTML_CLOSE", "HTML_SLASH_CLOSE", "HTML_SLASH", 
		"HTML_EQUALS", "HTML_QUOTED_STRING", "HTML_HEX", "HTML_Name", "S", "HEXDIGIT", 
		"DIGIT", "NameChar", "NameStartChar", "PHP_END", "MultiLineComment", "SinglelineComment", 
		"UnixComment", "RealE", "As", "SemiColon", "Instanceof", "And", "List", 
		"Const", "Or", "Xor", "Global", "Continue", "Return", "Implements", "Var", 
		"Class", "Extends", "Do", "Switch", "Case", "Default", "Function", "Break", 
		"If", "Else", "ElseIf", "For", "Foreach", "While", "Equals", "New", "Clone", 
		"Ampersand", "Pipe", "Bang", "Plus", "Minus", "Asterisk", "Percent", "Forwardslash", 
		"Tilde", "InstanceMember", "SuppressWarnings", "Dollar", "Dot", "ArrayAssign", 
		"LogicalOr", "LogicalAnd", "ClassMember", "QuestionMark", "OpenRoundBracket", 
		"CloseRoundBracket", "OpenSquareBracket", "CloseSquareBracket", "OpenCurlyBracket", 
		"CloseCurlyBracket", "Interface", "Comma", "Colon", "Abstract", "Static", 
		"Array", "RequireOperator", "PrimitiveType", "AccessModifier", "DecimalNumber", 
		"HexNumber", "OctalNumber", "Float", "Digits", "Boolean", "SingleQuotedString", 
		"DoubleQuotedString_Start", "Identifier", "AssignmentOperator", "EqualityOperator", 
		"ComparisionOperator", "ShiftOperator", "IncrementOperator", "WS", "EscapeCharacter", 
		"DoubleQuotedStringBody", "VarName", "DoubleQuotedString_End"
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


	public PHPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PHPLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2h\u039c\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G"+
		"\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR"+
		"\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4"+
		"^\t^\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\t"+
		"i\4j\tj\4k\tk\4l\tl\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u00e3\n\2\f\2\16\2\u00e6"+
		"\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u00f0\n\3\f\3\16\3\u00f3\13"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5\u00ff\n\5\r\5\16\5\u0100"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u010a\n\5\r\5\16\5\u010b\3\5\3\5\5\5"+
		"\u0110\n\5\3\6\3\6\5\6\u0114\n\6\3\6\6\6\u0117\n\6\r\6\16\6\u0118\3\7"+
		"\3\7\3\7\3\7\3\b\6\b\u0120\n\b\r\b\16\b\u0121\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0130\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\7\16\u0143\n\16\f\16\16\16"+
		"\u0146\13\16\3\16\3\16\3\16\7\16\u014b\n\16\f\16\16\16\u014e\13\16\3\16"+
		"\5\16\u0151\n\16\3\17\3\17\6\17\u0155\n\17\r\17\16\17\u0156\3\20\3\20"+
		"\7\20\u015b\n\20\f\20\16\20\u015e\13\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u016c\n\24\3\25\5\25\u016f\n\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u017a\n\27\f\27\16\27"+
		"\u017d\13\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0188\n"+
		"\30\f\30\16\30\u018b\13\30\3\30\3\30\3\31\3\31\7\31\u0191\n\31\f\31\16"+
		"\31\u0194\13\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#"+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39"+
		"\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3B\3C\3C\3D\3D"+
		"\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N"+
		"\3N\3O\3O\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3S\3S\3T\3T\3T\3T"+
		"\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u02c6\nW\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u02e5"+
		"\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\5Y\u02fd\nY\3Z\6Z\u0300\nZ\rZ\16Z\u0301\3[\3[\3[\6[\u0307\n[\r[\16[\u0308"+
		"\3\\\3\\\6\\\u030d\n\\\r\\\16\\\u030e\3]\7]\u0312\n]\f]\16]\u0315\13]"+
		"\3]\3]\6]\u0319\n]\r]\16]\u031a\3^\6^\u031e\n^\r^\16^\u031f\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\5_\u032b\n_\3`\3`\3`\3`\3`\3`\3`\7`\u0334\n`\f`\16`\u0337"+
		"\13`\3`\3`\3a\3a\3a\3a\3b\3b\7b\u0341\nb\fb\16b\u0344\13b\3c\3c\3c\3c"+
		"\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u035e"+
		"\nc\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u036a\nd\3e\3e\3e\3e\3e\3e\3e\3e"+
		"\5e\u0374\ne\3f\3f\3f\3f\5f\u037a\nf\3g\3g\3g\3g\5g\u0380\ng\3h\6h\u0383"+
		"\nh\rh\16h\u0384\3h\3h\3i\3i\5i\u038b\ni\3j\3j\3j\3j\7j\u0391\nj\fj\16"+
		"j\u0394\13j\3k\3k\3k\3l\3l\3l\3l\5\u00e4\u00f1\u017b\2m\6\3\b\4\n\5\f"+
		"\6\16\7\20\b\22\t\24\n\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\2(\2"+
		"*\2,\2.\23\60\24\62\25\64\26\66\278\30:\31<\32>\33@\34B\35D\36F\37H J"+
		"!L\"N#P$R%T&V\'X(Z)\\*^+`,b-d.f/h\60j\61l\62n\63p\64r\65t\66v\67x8z9|"+
		":~;\u0080<\u0082=\u0084>\u0086?\u0088@\u008aA\u008cB\u008eC\u0090D\u0092"+
		"E\u0094F\u0096G\u0098H\u009aI\u009cJ\u009eK\u00a0L\u00a2M\u00a4N\u00a6"+
		"O\u00a8P\u00aaQ\u00acR\u00aeS\u00b0T\u00b2U\u00b4V\u00b6W\u00b8X\u00ba"+
		"Y\u00bcZ\u00be[\u00c0\\\u00c2]\u00c4^\u00c6_\u00c8`\u00caa\u00ccb\u00ce"+
		"c\u00d0d\u00d2e\u00d4\2\u00d6f\u00d8g\u00dah\6\2\3\4\5\27\4\2\13\13\""+
		"\"\4\2((>>\4\2$$>>\4\2))>>\5\2\13\f\17\17\"\"\5\2\62;CHch\3\2\62;\4\2"+
		"/\60aa\5\2\u00b9\u00b9\u0302\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191"+
		"\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\4\2\f\f\17\17\4\2GGg"+
		"g\4\2CCcc\4\2TTtt\4\2[[{{\4\2ZZzz\4\2))^^\5\2C\\aac|\6\2\62;C\\aac|\b"+
		"\2$$&&^^ppttvv\5\2$$&&^^\u03d7\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f"+
		"\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\3\26\3\2"+
		"\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3"+
		"\"\3\2\2\2\3$\3\2\2\2\4.\3\2\2\2\4\60\3\2\2\2\4\62\3\2\2\2\4\64\3\2\2"+
		"\2\4\66\3\2\2\2\48\3\2\2\2\4:\3\2\2\2\4<\3\2\2\2\4>\3\2\2\2\4@\3\2\2\2"+
		"\4B\3\2\2\2\4D\3\2\2\2\4F\3\2\2\2\4H\3\2\2\2\4J\3\2\2\2\4L\3\2\2\2\4N"+
		"\3\2\2\2\4P\3\2\2\2\4R\3\2\2\2\4T\3\2\2\2\4V\3\2\2\2\4X\3\2\2\2\4Z\3\2"+
		"\2\2\4\\\3\2\2\2\4^\3\2\2\2\4`\3\2\2\2\4b\3\2\2\2\4d\3\2\2\2\4f\3\2\2"+
		"\2\4h\3\2\2\2\4j\3\2\2\2\4l\3\2\2\2\4n\3\2\2\2\4p\3\2\2\2\4r\3\2\2\2\4"+
		"t\3\2\2\2\4v\3\2\2\2\4x\3\2\2\2\4z\3\2\2\2\4|\3\2\2\2\4~\3\2\2\2\4\u0080"+
		"\3\2\2\2\4\u0082\3\2\2\2\4\u0084\3\2\2\2\4\u0086\3\2\2\2\4\u0088\3\2\2"+
		"\2\4\u008a\3\2\2\2\4\u008c\3\2\2\2\4\u008e\3\2\2\2\4\u0090\3\2\2\2\4\u0092"+
		"\3\2\2\2\4\u0094\3\2\2\2\4\u0096\3\2\2\2\4\u0098\3\2\2\2\4\u009a\3\2\2"+
		"\2\4\u009c\3\2\2\2\4\u009e\3\2\2\2\4\u00a0\3\2\2\2\4\u00a2\3\2\2\2\4\u00a4"+
		"\3\2\2\2\4\u00a6\3\2\2\2\4\u00a8\3\2\2\2\4\u00aa\3\2\2\2\4\u00ac\3\2\2"+
		"\2\4\u00ae\3\2\2\2\4\u00b0\3\2\2\2\4\u00b2\3\2\2\2\4\u00b4\3\2\2\2\4\u00b6"+
		"\3\2\2\2\4\u00b8\3\2\2\2\4\u00ba\3\2\2\2\4\u00bc\3\2\2\2\4\u00be\3\2\2"+
		"\2\4\u00c0\3\2\2\2\4\u00c2\3\2\2\2\4\u00c4\3\2\2\2\4\u00c6\3\2\2\2\4\u00c8"+
		"\3\2\2\2\4\u00ca\3\2\2\2\4\u00cc\3\2\2\2\4\u00ce\3\2\2\2\4\u00d0\3\2\2"+
		"\2\4\u00d2\3\2\2\2\5\u00d6\3\2\2\2\5\u00d8\3\2\2\2\5\u00da\3\2\2\2\6\u00dc"+
		"\3\2\2\2\b\u00eb\3\2\2\2\n\u00f6\3\2\2\2\f\u010f\3\2\2\2\16\u0116\3\2"+
		"\2\2\20\u011a\3\2\2\2\22\u011f\3\2\2\2\24\u012f\3\2\2\2\26\u0133\3\2\2"+
		"\2\30\u0137\3\2\2\2\32\u013c\3\2\2\2\34\u013e\3\2\2\2\36\u0150\3\2\2\2"+
		" \u0152\3\2\2\2\"\u0158\3\2\2\2$\u015f\3\2\2\2&\u0163\3\2\2\2(\u0165\3"+
		"\2\2\2*\u016b\3\2\2\2,\u016e\3\2\2\2.\u0170\3\2\2\2\60\u0175\3\2\2\2\62"+
		"\u0183\3\2\2\2\64\u018e\3\2\2\2\66\u0197\3\2\2\28\u0199\3\2\2\2:\u019c"+
		"\3\2\2\2<\u019e\3\2\2\2>\u01a9\3\2\2\2@\u01ad\3\2\2\2B\u01b2\3\2\2\2D"+
		"\u01b8\3\2\2\2F\u01bb\3\2\2\2H\u01bf\3\2\2\2J\u01c6\3\2\2\2L\u01cf\3\2"+
		"\2\2N\u01d6\3\2\2\2P\u01e1\3\2\2\2R\u01e5\3\2\2\2T\u01eb\3\2\2\2V\u01f3"+
		"\3\2\2\2X\u01f6\3\2\2\2Z\u01fd\3\2\2\2\\\u0202\3\2\2\2^\u020a\3\2\2\2"+
		"`\u0213\3\2\2\2b\u0219\3\2\2\2d\u021c\3\2\2\2f\u0221\3\2\2\2h\u0228\3"+
		"\2\2\2j\u022c\3\2\2\2l\u0234\3\2\2\2n\u023a\3\2\2\2p\u023c\3\2\2\2r\u0240"+
		"\3\2\2\2t\u0246\3\2\2\2v\u0248\3\2\2\2x\u024a\3\2\2\2z\u024c\3\2\2\2|"+
		"\u024e\3\2\2\2~\u0250\3\2\2\2\u0080\u0252\3\2\2\2\u0082\u0254\3\2\2\2"+
		"\u0084\u0256\3\2\2\2\u0086\u0258\3\2\2\2\u0088\u025b\3\2\2\2\u008a\u025d"+
		"\3\2\2\2\u008c\u025f\3\2\2\2\u008e\u0261\3\2\2\2\u0090\u0264\3\2\2\2\u0092"+
		"\u0267\3\2\2\2\u0094\u026a\3\2\2\2\u0096\u026d\3\2\2\2\u0098\u026f\3\2"+
		"\2\2\u009a\u0271\3\2\2\2\u009c\u0273\3\2\2\2\u009e\u0275\3\2\2\2\u00a0"+
		"\u0277\3\2\2\2\u00a2\u0279\3\2\2\2\u00a4\u027b\3\2\2\2\u00a6\u0285\3\2"+
		"\2\2\u00a8\u0287\3\2\2\2\u00aa\u0289\3\2\2\2\u00ac\u0292\3\2\2\2\u00ae"+
		"\u0299\3\2\2\2\u00b0\u02c5\3\2\2\2\u00b2\u02e4\3\2\2\2\u00b4\u02fc\3\2"+
		"\2\2\u00b6\u02ff\3\2\2\2\u00b8\u0303\3\2\2\2\u00ba\u030a\3\2\2\2\u00bc"+
		"\u0313\3\2\2\2\u00be\u031d\3\2\2\2\u00c0\u032a\3\2\2\2\u00c2\u032c\3\2"+
		"\2\2\u00c4\u033a\3\2\2\2\u00c6\u033e\3\2\2\2\u00c8\u035d\3\2\2\2\u00ca"+
		"\u0369\3\2\2\2\u00cc\u0373\3\2\2\2\u00ce\u0379\3\2\2\2\u00d0\u037f\3\2"+
		"\2\2\u00d2\u0382\3\2\2\2\u00d4\u038a\3\2\2\2\u00d6\u0392\3\2\2\2\u00d8"+
		"\u0395\3\2\2\2\u00da\u0398\3\2\2\2\u00dc\u00dd\7>\2\2\u00dd\u00de\7#\2"+
		"\2\u00de\u00df\7/\2\2\u00df\u00e0\7/\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e3"+
		"\13\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e5\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8"+
		"\7/\2\2\u00e8\u00e9\7/\2\2\u00e9\u00ea\7@\2\2\u00ea\7\3\2\2\2\u00eb\u00ec"+
		"\7>\2\2\u00ec\u00ed\7#\2\2\u00ed\u00f1\3\2\2\2\u00ee\u00f0\13\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7@\2\2\u00f5"+
		"\t\3\2\2\2\u00f6\u00f7\7(\2\2\u00f7\u00f8\5\"\20\2\u00f8\u00f9\7=\2\2"+
		"\u00f9\13\3\2\2\2\u00fa\u00fb\7(\2\2\u00fb\u00fc\7%\2\2\u00fc\u00fe\3"+
		"\2\2\2\u00fd\u00ff\5(\23\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7="+
		"\2\2\u0103\u0110\3\2\2\2\u0104\u0105\7(\2\2\u0105\u0106\7%\2\2\u0106\u0107"+
		"\7z\2\2\u0107\u0109\3\2\2\2\u0108\u010a\5&\22\2\u0109\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u010e\7=\2\2\u010e\u0110\3\2\2\2\u010f\u00fa\3\2\2\2\u010f"+
		"\u0104\3\2\2\2\u0110\r\3\2\2\2\u0111\u0117\t\2\2\2\u0112\u0114\7\17\2"+
		"\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117"+
		"\7\f\2\2\u0116\u0111\3\2\2\2\u0116\u0113\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\17\3\2\2\2\u011a\u011b\7>\2\2"+
		"\u011b\u011c\3\2\2\2\u011c\u011d\b\7\2\2\u011d\21\3\2\2\2\u011e\u0120"+
		"\n\3\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\23\3\2\2\2\u0123\u0124\7>\2\2\u0124\u0130\7A\2\2"+
		"\u0125\u0126\7>\2\2\u0126\u0127\7A\2\2\u0127\u0128\7r\2\2\u0128\u0129"+
		"\7j\2\2\u0129\u0130\7r\2\2\u012a\u012b\7>\2\2\u012b\u012c\7A\2\2\u012c"+
		"\u012d\7R\2\2\u012d\u012e\7J\2\2\u012e\u0130\7R\2\2\u012f\u0123\3\2\2"+
		"\2\u012f\u0125\3\2\2\2\u012f\u012a\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132"+
		"\b\t\3\2\u0132\25\3\2\2\2\u0133\u0134\7@\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\b\n\4\2\u0136\27\3\2\2\2\u0137\u0138\7\61\2\2\u0138\u0139\7@\2"+
		"\2\u0139\u013a\3\2\2\2\u013a\u013b\b\13\4\2\u013b\31\3\2\2\2\u013c\u013d"+
		"\7\61\2\2\u013d\33\3\2\2\2\u013e\u013f\7?\2\2\u013f\35\3\2\2\2\u0140\u0144"+
		"\7$\2\2\u0141\u0143\n\4\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0147\u0151\7$\2\2\u0148\u014c\7)\2\2\u0149\u014b\n\5\2\2\u014a\u0149"+
		"\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\7)\2\2\u0150\u0140\3\2"+
		"\2\2\u0150\u0148\3\2\2\2\u0151\37\3\2\2\2\u0152\u0154\7%\2\2\u0153\u0155"+
		"\5&\22\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157!\3\2\2\2\u0158\u015c\5,\25\2\u0159\u015b\5*\24\2"+
		"\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d#\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\t\6\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0162\b\21\5\2\u0162%\3\2\2\2\u0163\u0164\t\7\2\2"+
		"\u0164\'\3\2\2\2\u0165\u0166\t\b\2\2\u0166)\3\2\2\2\u0167\u016c\5,\25"+
		"\2\u0168\u016c\t\t\2\2\u0169\u016c\5(\23\2\u016a\u016c\t\n\2\2\u016b\u0167"+
		"\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c"+
		"+\3\2\2\2\u016d\u016f\t\13\2\2\u016e\u016d\3\2\2\2\u016f-\3\2\2\2\u0170"+
		"\u0171\7A\2\2\u0171\u0172\7@\2\2\u0172\u0173\3\2\2\2\u0173\u0174\b\26"+
		"\4\2\u0174/\3\2\2\2\u0175\u0176\7\61\2\2\u0176\u0177\7,\2\2\u0177\u017b"+
		"\3\2\2\2\u0178\u017a\13\2\2\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2"+
		"\u017b\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b"+
		"\3\2\2\2\u017e\u017f\7,\2\2\u017f\u0180\7\61\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0182\b\27\6\2\u0182\61\3\2\2\2\u0183\u0184\7\61\2\2\u0184\u0185\7\61"+
		"\2\2\u0185\u0189\3\2\2\2\u0186\u0188\n\f\2\2\u0187\u0186\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018c\u018d\b\30\6\2\u018d\63\3\2\2\2\u018e\u0192"+
		"\7%\2\2\u018f\u0191\n\f\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2"+
		"\2\2\u0195\u0196\b\31\6\2\u0196\65\3\2\2\2\u0197\u0198\t\r\2\2\u0198\67"+
		"\3\2\2\2\u0199\u019a\7c\2\2\u019a\u019b\7u\2\2\u019b9\3\2\2\2\u019c\u019d"+
		"\7=\2\2\u019d;\3\2\2\2\u019e\u019f\7k\2\2\u019f\u01a0\7p\2\2\u01a0\u01a1"+
		"\7u\2\2\u01a1\u01a2\7v\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7p\2\2\u01a4"+
		"\u01a5\7e\2\2\u01a5\u01a6\7g\2\2\u01a6\u01a7\7q\2\2\u01a7\u01a8\7h\2\2"+
		"\u01a8=\3\2\2\2\u01a9\u01aa\7c\2\2\u01aa\u01ab\7p\2\2\u01ab\u01ac\7f\2"+
		"\2\u01ac?\3\2\2\2\u01ad\u01ae\7n\2\2\u01ae\u01af\7k\2\2\u01af\u01b0\7"+
		"u\2\2\u01b0\u01b1\7v\2\2\u01b1A\3\2\2\2\u01b2\u01b3\7e\2\2\u01b3\u01b4"+
		"\7q\2\2\u01b4\u01b5\7p\2\2\u01b5\u01b6\7u\2\2\u01b6\u01b7\7v\2\2\u01b7"+
		"C\3\2\2\2\u01b8\u01b9\7q\2\2\u01b9\u01ba\7t\2\2\u01baE\3\2\2\2\u01bb\u01bc"+
		"\7z\2\2\u01bc\u01bd\7q\2\2\u01bd\u01be\7t\2\2\u01beG\3\2\2\2\u01bf\u01c0"+
		"\7i\2\2\u01c0\u01c1\7n\2\2\u01c1\u01c2\7q\2\2\u01c2\u01c3\7d\2\2\u01c3"+
		"\u01c4\7c\2\2\u01c4\u01c5\7n\2\2\u01c5I\3\2\2\2\u01c6\u01c7\7e\2\2\u01c7"+
		"\u01c8\7q\2\2\u01c8\u01c9\7p\2\2\u01c9\u01ca\7v\2\2\u01ca\u01cb\7k\2\2"+
		"\u01cb\u01cc\7p\2\2\u01cc\u01cd\7w\2\2\u01cd\u01ce\7g\2\2\u01ceK\3\2\2"+
		"\2\u01cf\u01d0\7t\2\2\u01d0\u01d1\7g\2\2\u01d1\u01d2\7v\2\2\u01d2\u01d3"+
		"\7w\2\2\u01d3\u01d4\7t\2\2\u01d4\u01d5\7p\2\2\u01d5M\3\2\2\2\u01d6\u01d7"+
		"\7k\2\2\u01d7\u01d8\7o\2\2\u01d8\u01d9\7r\2\2\u01d9\u01da\7n\2\2\u01da"+
		"\u01db\7g\2\2\u01db\u01dc\7o\2\2\u01dc\u01dd\7g\2\2\u01dd\u01de\7p\2\2"+
		"\u01de\u01df\7v\2\2\u01df\u01e0\7u\2\2\u01e0O\3\2\2\2\u01e1\u01e2\7x\2"+
		"\2\u01e2\u01e3\7c\2\2\u01e3\u01e4\7t\2\2\u01e4Q\3\2\2\2\u01e5\u01e6\7"+
		"e\2\2\u01e6\u01e7\7n\2\2\u01e7\u01e8\7c\2\2\u01e8\u01e9\7u\2\2\u01e9\u01ea"+
		"\7u\2\2\u01eaS\3\2\2\2\u01eb\u01ec\7g\2\2\u01ec\u01ed\7z\2\2\u01ed\u01ee"+
		"\7v\2\2\u01ee\u01ef\7g\2\2\u01ef\u01f0\7p\2\2\u01f0\u01f1\7f\2\2\u01f1"+
		"\u01f2\7u\2\2\u01f2U\3\2\2\2\u01f3\u01f4\7f\2\2\u01f4\u01f5\7q\2\2\u01f5"+
		"W\3\2\2\2\u01f6\u01f7\7u\2\2\u01f7\u01f8\7y\2\2\u01f8\u01f9\7k\2\2\u01f9"+
		"\u01fa\7v\2\2\u01fa\u01fb\7e\2\2\u01fb\u01fc\7j\2\2\u01fcY\3\2\2\2\u01fd"+
		"\u01fe\7e\2\2\u01fe\u01ff\7c\2\2\u01ff\u0200\7u\2\2\u0200\u0201\7g\2\2"+
		"\u0201[\3\2\2\2\u0202\u0203\7f\2\2\u0203\u0204\7g\2\2\u0204\u0205\7h\2"+
		"\2\u0205\u0206\7c\2\2\u0206\u0207\7w\2\2\u0207\u0208\7n\2\2\u0208\u0209"+
		"\7v\2\2\u0209]\3\2\2\2\u020a\u020b\7h\2\2\u020b\u020c\7w\2\2\u020c\u020d"+
		"\7p\2\2\u020d\u020e\7e\2\2\u020e\u020f\7v\2\2\u020f\u0210\7k\2\2\u0210"+
		"\u0211\7q\2\2\u0211\u0212\7p\2\2\u0212_\3\2\2\2\u0213\u0214\7d\2\2\u0214"+
		"\u0215\7t\2\2\u0215\u0216\7g\2\2\u0216\u0217\7c\2\2\u0217\u0218\7m\2\2"+
		"\u0218a\3\2\2\2\u0219\u021a\7k\2\2\u021a\u021b\7h\2\2\u021bc\3\2\2\2\u021c"+
		"\u021d\7g\2\2\u021d\u021e\7n\2\2\u021e\u021f\7u\2\2\u021f\u0220\7g\2\2"+
		"\u0220e\3\2\2\2\u0221\u0222\7g\2\2\u0222\u0223\7n\2\2\u0223\u0224\7u\2"+
		"\2\u0224\u0225\7g\2\2\u0225\u0226\7k\2\2\u0226\u0227\7h\2\2\u0227g\3\2"+
		"\2\2\u0228\u0229\7h\2\2\u0229\u022a\7q\2\2\u022a\u022b\7t\2\2\u022bi\3"+
		"\2\2\2\u022c\u022d\7h\2\2\u022d\u022e\7q\2\2\u022e\u022f\7t\2\2\u022f"+
		"\u0230\7g\2\2\u0230\u0231\7c\2\2\u0231\u0232\7e\2\2\u0232\u0233\7j\2\2"+
		"\u0233k\3\2\2\2\u0234\u0235\7y\2\2\u0235\u0236\7j\2\2\u0236\u0237\7k\2"+
		"\2\u0237\u0238\7n\2\2\u0238\u0239\7g\2\2\u0239m\3\2\2\2\u023a\u023b\7"+
		"?\2\2\u023bo\3\2\2\2\u023c\u023d\7p\2\2\u023d\u023e\7g\2\2\u023e\u023f"+
		"\7y\2\2\u023fq\3\2\2\2\u0240\u0241\7e\2\2\u0241\u0242\7n\2\2\u0242\u0243"+
		"\7q\2\2\u0243\u0244\7p\2\2\u0244\u0245\7g\2\2\u0245s\3\2\2\2\u0246\u0247"+
		"\7(\2\2\u0247u\3\2\2\2\u0248\u0249\7~\2\2\u0249w\3\2\2\2\u024a\u024b\7"+
		"#\2\2\u024by\3\2\2\2\u024c\u024d\7-\2\2\u024d{\3\2\2\2\u024e\u024f\7/"+
		"\2\2\u024f}\3\2\2\2\u0250\u0251\7,\2\2\u0251\177\3\2\2\2\u0252\u0253\7"+
		"\'\2\2\u0253\u0081\3\2\2\2\u0254\u0255\7\61\2\2\u0255\u0083\3\2\2\2\u0256"+
		"\u0257\7\u0080\2\2\u0257\u0085\3\2\2\2\u0258\u0259\7/\2\2\u0259\u025a"+
		"\7@\2\2\u025a\u0087\3\2\2\2\u025b\u025c\7B\2\2\u025c\u0089\3\2\2\2\u025d"+
		"\u025e\7&\2\2\u025e\u008b\3\2\2\2\u025f\u0260\7\60\2\2\u0260\u008d\3\2"+
		"\2\2\u0261\u0262\7?\2\2\u0262\u0263\7@\2\2\u0263\u008f\3\2\2\2\u0264\u0265"+
		"\7~\2\2\u0265\u0266\7~\2\2\u0266\u0091\3\2\2\2\u0267\u0268\7(\2\2\u0268"+
		"\u0269\7(\2\2\u0269\u0093\3\2\2\2\u026a\u026b\7<\2\2\u026b\u026c\7<\2"+
		"\2\u026c\u0095\3\2\2\2\u026d\u026e\7A\2\2\u026e\u0097\3\2\2\2\u026f\u0270"+
		"\7*\2\2\u0270\u0099\3\2\2\2\u0271\u0272\7+\2\2\u0272\u009b\3\2\2\2\u0273"+
		"\u0274\7]\2\2\u0274\u009d\3\2\2\2\u0275\u0276\7_\2\2\u0276\u009f\3\2\2"+
		"\2\u0277\u0278\7}\2\2\u0278\u00a1\3\2\2\2\u0279\u027a\7\177\2\2\u027a"+
		"\u00a3\3\2\2\2\u027b\u027c\7K\2\2\u027c\u027d\7p\2\2\u027d\u027e\7v\2"+
		"\2\u027e\u027f\7g\2\2\u027f\u0280\7t\2\2\u0280\u0281\7h\2\2\u0281\u0282"+
		"\7c\2\2\u0282\u0283\7e\2\2\u0283\u0284\7g\2\2\u0284\u00a5\3\2\2\2\u0285"+
		"\u0286\7.\2\2\u0286\u00a7\3\2\2\2\u0287\u0288\7<\2\2\u0288\u00a9\3\2\2"+
		"\2\u0289\u028a\7c\2\2\u028a\u028b\7d\2\2\u028b\u028c\7u\2\2\u028c\u028d"+
		"\7v\2\2\u028d\u028e\7t\2\2\u028e\u028f\7c\2\2\u028f\u0290\7e\2\2\u0290"+
		"\u0291\7v\2\2\u0291\u00ab\3\2\2\2\u0292\u0293\7u\2\2\u0293\u0294\7v\2"+
		"\2\u0294\u0295\7c\2\2\u0295\u0296\7v\2\2\u0296\u0297\7k\2\2\u0297\u0298"+
		"\7e\2\2\u0298\u00ad\3\2\2\2\u0299\u029a\t\16\2\2\u029a\u029b\t\17\2\2"+
		"\u029b\u029c\t\17\2\2\u029c\u029d\t\16\2\2\u029d\u029e\t\20\2\2\u029e"+
		"\u00af\3\2\2\2\u029f\u02a0\7t\2\2\u02a0\u02a1\7g\2\2\u02a1\u02a2\7s\2"+
		"\2\u02a2\u02a3\7w\2\2\u02a3\u02a4\7k\2\2\u02a4\u02a5\7t\2\2\u02a5\u02c6"+
		"\7g\2\2\u02a6\u02a7\7t\2\2\u02a7\u02a8\7g\2\2\u02a8\u02a9\7s\2\2\u02a9"+
		"\u02aa\7w\2\2\u02aa\u02ab\7k\2\2\u02ab\u02ac\7t\2\2\u02ac\u02ad\7g\2\2"+
		"\u02ad\u02ae\7a\2\2\u02ae\u02af\7q\2\2\u02af\u02b0\7p\2\2\u02b0\u02b1"+
		"\7e\2\2\u02b1\u02c6\7g\2\2\u02b2\u02b3\7k\2\2\u02b3\u02b4\7p\2\2\u02b4"+
		"\u02b5\7e\2\2\u02b5\u02b6\7n\2\2\u02b6\u02b7\7w\2\2\u02b7\u02b8\7f\2\2"+
		"\u02b8\u02c6\7g\2\2\u02b9\u02ba\7k\2\2\u02ba\u02bb\7p\2\2\u02bb\u02bc"+
		"\7e\2\2\u02bc\u02bd\7n\2\2\u02bd\u02be\7w\2\2\u02be\u02bf\7f\2\2\u02bf"+
		"\u02c0\7g\2\2\u02c0\u02c1\7a\2\2\u02c1\u02c2\7q\2\2\u02c2\u02c3\7p\2\2"+
		"\u02c3\u02c4\7e\2\2\u02c4\u02c6\7g\2\2\u02c5\u029f\3\2\2\2\u02c5\u02a6"+
		"\3\2\2\2\u02c5\u02b2\3\2\2\2\u02c5\u02b9\3\2\2\2\u02c6\u00b1\3\2\2\2\u02c7"+
		"\u02c8\7k\2\2\u02c8\u02c9\7p\2\2\u02c9\u02e5\7v\2\2\u02ca\u02cb\7h\2\2"+
		"\u02cb\u02cc\7n\2\2\u02cc\u02cd\7q\2\2\u02cd\u02ce\7c\2\2\u02ce\u02e5"+
		"\7v\2\2\u02cf\u02d0\7u\2\2\u02d0\u02d1\7v\2\2\u02d1\u02d2\7t\2\2\u02d2"+
		"\u02d3\7k\2\2\u02d3\u02d4\7p\2\2\u02d4\u02e5\7i\2\2\u02d5\u02d6\7c\2\2"+
		"\u02d6\u02d7\7t\2\2\u02d7\u02d8\7t\2\2\u02d8\u02d9\7c\2\2\u02d9\u02e5"+
		"\7{\2\2\u02da\u02db\7q\2\2\u02db\u02dc\7d\2\2\u02dc\u02dd\7l\2\2\u02dd"+
		"\u02de\7g\2\2\u02de\u02df\7e\2\2\u02df\u02e5\7v\2\2\u02e0\u02e1\7d\2\2"+
		"\u02e1\u02e2\7q\2\2\u02e2\u02e3\7q\2\2\u02e3\u02e5\7n\2\2\u02e4\u02c7"+
		"\3\2\2\2\u02e4\u02ca\3\2\2\2\u02e4\u02cf\3\2\2\2\u02e4\u02d5\3\2\2\2\u02e4"+
		"\u02da\3\2\2\2\u02e4\u02e0\3\2\2\2\u02e5\u00b3\3\2\2\2\u02e6\u02e7\7r"+
		"\2\2\u02e7\u02e8\7w\2\2\u02e8\u02e9\7d\2\2\u02e9\u02ea\7n\2\2\u02ea\u02eb"+
		"\7k\2\2\u02eb\u02fd\7e\2\2\u02ec\u02ed\7r\2\2\u02ed\u02ee\7t\2\2\u02ee"+
		"\u02ef\7k\2\2\u02ef\u02f0\7x\2\2\u02f0\u02f1\7c\2\2\u02f1\u02f2\7v\2\2"+
		"\u02f2\u02fd\7g\2\2\u02f3\u02f4\7r\2\2\u02f4\u02f5\7t\2\2\u02f5\u02f6"+
		"\7q\2\2\u02f6\u02f7\7v\2\2\u02f7\u02f8\7g\2\2\u02f8\u02f9\7e\2\2\u02f9"+
		"\u02fa\7v\2\2\u02fa\u02fb\7g\2\2\u02fb\u02fd\7f\2\2\u02fc\u02e6\3\2\2"+
		"\2\u02fc\u02ec\3\2\2\2\u02fc\u02f3\3\2\2\2\u02fd\u00b5\3\2\2\2\u02fe\u0300"+
		"\4\62;\2\u02ff\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u02ff\3\2\2\2\u0301"+
		"\u0302\3\2\2\2\u0302\u00b7\3\2\2\2\u0303\u0304\7\62\2\2\u0304\u0306\t"+
		"\21\2\2\u0305\u0307\t\7\2\2\u0306\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u00b9\3\2\2\2\u030a\u030c\7\62"+
		"\2\2\u030b\u030d\4\629\2\u030c\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e"+
		"\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u00bb\3\2\2\2\u0310\u0312\4\62"+
		";\2\u0311\u0310\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313"+
		"\u0314\3\2\2\2\u0314\u0316\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0318\7\60"+
		"\2\2\u0317\u0319\4\62;\2\u0318\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u00bd\3\2\2\2\u031c\u031e\4\62"+
		";\2\u031d\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u031d\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u00bf\3\2\2\2\u0321\u0322\7v\2\2\u0322\u0323\7t\2"+
		"\2\u0323\u0324\7w\2\2\u0324\u032b\7g\2\2\u0325\u0326\7h\2\2\u0326\u0327"+
		"\7c\2\2\u0327\u0328\7n\2\2\u0328\u0329\7u\2\2\u0329\u032b\7g\2\2\u032a"+
		"\u0321\3\2\2\2\u032a\u0325\3\2\2\2\u032b\u00c1\3\2\2\2\u032c\u0335\7)"+
		"\2\2\u032d\u032e\7^\2\2\u032e\u0334\7)\2\2\u032f\u0330\7^\2\2\u0330\u0334"+
		"\7^\2\2\u0331\u0334\7^\2\2\u0332\u0334\n\22\2\2\u0333\u032d\3\2\2\2\u0333"+
		"\u032f\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0332\3\2\2\2\u0334\u0337\3\2"+
		"\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0338\3\2\2\2\u0337"+
		"\u0335\3\2\2\2\u0338\u0339\7)\2\2\u0339\u00c3\3\2\2\2\u033a\u033b\7$\2"+
		"\2\u033b\u033c\3\2\2\2\u033c\u033d\ba\7\2\u033d\u00c5\3\2\2\2\u033e\u0342"+
		"\t\23\2\2\u033f\u0341\t\24\2\2\u0340\u033f\3\2\2\2\u0341\u0344\3\2\2\2"+
		"\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u00c7\3\2\2\2\u0344\u0342"+
		"\3\2\2\2\u0345\u0346\7-\2\2\u0346\u035e\7?\2\2\u0347\u0348\7/\2\2\u0348"+
		"\u035e\7?\2\2\u0349\u034a\7,\2\2\u034a\u035e\7?\2\2\u034b\u034c\7\61\2"+
		"\2\u034c\u035e\7?\2\2\u034d\u034e\7\60\2\2\u034e\u035e\7?\2\2\u034f\u0350"+
		"\7\'\2\2\u0350\u035e\7?\2\2\u0351\u0352\7(\2\2\u0352\u035e\7?\2\2\u0353"+
		"\u0354\7~\2\2\u0354\u035e\7?\2\2\u0355\u0356\7`\2\2\u0356\u035e\7?\2\2"+
		"\u0357\u0358\7>\2\2\u0358\u0359\7>\2\2\u0359\u035e\7?\2\2\u035a\u035b"+
		"\7@\2\2\u035b\u035c\7@\2\2\u035c\u035e\7?\2\2\u035d\u0345\3\2\2\2\u035d"+
		"\u0347\3\2\2\2\u035d\u0349\3\2\2\2\u035d\u034b\3\2\2\2\u035d\u034d\3\2"+
		"\2\2\u035d\u034f\3\2\2\2\u035d\u0351\3\2\2\2\u035d\u0353\3\2\2\2\u035d"+
		"\u0355\3\2\2\2\u035d\u0357\3\2\2\2\u035d\u035a\3\2\2\2\u035e\u00c9\3\2"+
		"\2\2\u035f\u0360\7?\2\2\u0360\u036a\7?\2\2\u0361\u0362\7#\2\2\u0362\u036a"+
		"\7?\2\2\u0363\u0364\7?\2\2\u0364\u0365\7?\2\2\u0365\u036a\7?\2\2\u0366"+
		"\u0367\7#\2\2\u0367\u0368\7?\2\2\u0368\u036a\7?\2\2\u0369\u035f\3\2\2"+
		"\2\u0369\u0361\3\2\2\2\u0369\u0363\3\2\2\2\u0369\u0366\3\2\2\2\u036a\u00cb"+
		"\3\2\2\2\u036b\u0374\7>\2\2\u036c\u036d\7>\2\2\u036d\u0374\7?\2\2\u036e"+
		"\u0374\7@\2\2\u036f\u0370\7@\2\2\u0370\u0374\7?\2\2\u0371\u0372\7>\2\2"+
		"\u0372\u0374\7@\2\2\u0373\u036b\3\2\2\2\u0373\u036c\3\2\2\2\u0373\u036e"+
		"\3\2\2\2\u0373\u036f\3\2\2\2\u0373\u0371\3\2\2\2\u0374\u00cd\3\2\2\2\u0375"+
		"\u0376\7>\2\2\u0376\u037a\7>\2\2\u0377\u0378\7@\2\2\u0378\u037a\7@\2\2"+
		"\u0379\u0375\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u00cf\3\2\2\2\u037b\u037c"+
		"\7/\2\2\u037c\u0380\7/\2\2\u037d\u037e\7-\2\2\u037e\u0380\7-\2\2\u037f"+
		"\u037b\3\2\2\2\u037f\u037d\3\2\2\2\u0380\u00d1\3\2\2\2\u0381\u0383\t\6"+
		"\2\2\u0382\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0382\3\2\2\2\u0384"+
		"\u0385\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387\bh\5\2\u0387\u00d3\3\2"+
		"\2\2\u0388\u038b\t\25\2\2\u0389\u038b\5\u00be^\2\u038a\u0388\3\2\2\2\u038a"+
		"\u0389\3\2\2\2\u038b\u00d5\3\2\2\2\u038c\u038d\7^\2\2\u038d\u0391\5\u00d4"+
		"i\2\u038e\u0391\7^\2\2\u038f\u0391\n\26\2\2\u0390\u038c\3\2\2\2\u0390"+
		"\u038e\3\2\2\2\u0390\u038f\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2"+
		"\2\2\u0392\u0393\3\2\2\2\u0393\u00d7\3\2\2\2\u0394\u0392\3\2\2\2\u0395"+
		"\u0396\7&\2\2\u0396\u0397\5\u00c6b\2\u0397\u00d9\3\2\2\2\u0398\u0399\7"+
		"$\2\2\u0399\u039a\3\2\2\2\u039a\u039b\bl\4\2\u039b\u00db\3\2\2\2\60\2"+
		"\3\4\5\u00e4\u00f1\u0100\u010b\u010f\u0113\u0116\u0118\u0121\u012f\u0144"+
		"\u014c\u0150\u0156\u015c\u016b\u016e\u017b\u0189\u0192\u02c5\u02e4\u02fc"+
		"\u0301\u0308\u030e\u0313\u031a\u031f\u032a\u0333\u0335\u0342\u035d\u0369"+
		"\u0373\u0379\u037f\u0384\u038a\u0390\u0392\b\7\3\2\7\4\2\6\2\2\b\2\2\2"+
		"\3\2\7\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}