// Generated from /home/davevarga/Projects/Intellj/StateModel/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class StateModelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, LCURLY=2, RCURLY=3, DPOINTS=4, RARROW=5, INITIAL=6, TRANSITIONS=7, 
		ERROR=8, STATES=9, NORMAL=10, TRANS=11, STATE_NAME=12, LABEL=13, WS=14, 
		COMMENT=15, LINE_COMMENT=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMA", "LCURLY", "RCURLY", "DPOINTS", "RARROW", "INITIAL", "TRANSITIONS", 
			"ERROR", "STATES", "NORMAL", "TRANS", "STATE_NAME", "LABEL", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'{'", "'}'", "':'", "'->'", "'initial'", "'transitions'", 
			"'error'", "'states'", "'normal'", "'trans'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMA", "LCURLY", "RCURLY", "DPOINTS", "RARROW", "INITIAL", "TRANSITIONS", 
			"ERROR", "STATES", "NORMAL", "TRANS", "STATE_NAME", "LABEL", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public StateModelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StateModel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010\u0085\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0005\u000b]\b\u000b\n\u000b\f\u000b`\t\u000b\u0001\f\u0001\f\u0005\f"+
		"d\b\f\n\f\f\fg\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000eq\b\u000e\n\u000e\f\u000et\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u007f\b\u000f\n\u000f"+
		"\f\u000f\u0082\t\u000f\u0001\u000f\u0001\u000f\u0001r\u0000\u0010\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010\u0001\u0000\u0006\u0001\u0000AZ\u0002\u000009AZ\u0001"+
		"\u0000az\u0002\u000009az\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0088"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001"+
		"\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005%\u0001\u0000\u0000"+
		"\u0000\u0007\'\u0001\u0000\u0000\u0000\t)\u0001\u0000\u0000\u0000\u000b"+
		",\u0001\u0000\u0000\u0000\r4\u0001\u0000\u0000\u0000\u000f@\u0001\u0000"+
		"\u0000\u0000\u0011F\u0001\u0000\u0000\u0000\u0013M\u0001\u0000\u0000\u0000"+
		"\u0015T\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019a"+
		"\u0001\u0000\u0000\u0000\u001bh\u0001\u0000\u0000\u0000\u001dl\u0001\u0000"+
		"\u0000\u0000\u001fz\u0001\u0000\u0000\u0000!\"\u0005,\u0000\u0000\"\u0002"+
		"\u0001\u0000\u0000\u0000#$\u0005{\u0000\u0000$\u0004\u0001\u0000\u0000"+
		"\u0000%&\u0005}\u0000\u0000&\u0006\u0001\u0000\u0000\u0000\'(\u0005:\u0000"+
		"\u0000(\b\u0001\u0000\u0000\u0000)*\u0005-\u0000\u0000*+\u0005>\u0000"+
		"\u0000+\n\u0001\u0000\u0000\u0000,-\u0005i\u0000\u0000-.\u0005n\u0000"+
		"\u0000./\u0005i\u0000\u0000/0\u0005t\u0000\u000001\u0005i\u0000\u0000"+
		"12\u0005a\u0000\u000023\u0005l\u0000\u00003\f\u0001\u0000\u0000\u0000"+
		"45\u0005t\u0000\u000056\u0005r\u0000\u000067\u0005a\u0000\u000078\u0005"+
		"n\u0000\u000089\u0005s\u0000\u00009:\u0005i\u0000\u0000:;\u0005t\u0000"+
		"\u0000;<\u0005i\u0000\u0000<=\u0005o\u0000\u0000=>\u0005n\u0000\u0000"+
		">?\u0005s\u0000\u0000?\u000e\u0001\u0000\u0000\u0000@A\u0005e\u0000\u0000"+
		"AB\u0005r\u0000\u0000BC\u0005r\u0000\u0000CD\u0005o\u0000\u0000DE\u0005"+
		"r\u0000\u0000E\u0010\u0001\u0000\u0000\u0000FG\u0005s\u0000\u0000GH\u0005"+
		"t\u0000\u0000HI\u0005a\u0000\u0000IJ\u0005t\u0000\u0000JK\u0005e\u0000"+
		"\u0000KL\u0005s\u0000\u0000L\u0012\u0001\u0000\u0000\u0000MN\u0005n\u0000"+
		"\u0000NO\u0005o\u0000\u0000OP\u0005r\u0000\u0000PQ\u0005m\u0000\u0000"+
		"QR\u0005a\u0000\u0000RS\u0005l\u0000\u0000S\u0014\u0001\u0000\u0000\u0000"+
		"TU\u0005t\u0000\u0000UV\u0005r\u0000\u0000VW\u0005a\u0000\u0000WX\u0005"+
		"n\u0000\u0000XY\u0005s\u0000\u0000Y\u0016\u0001\u0000\u0000\u0000Z^\u0007"+
		"\u0000\u0000\u0000[]\u0007\u0001\u0000\u0000\\[\u0001\u0000\u0000\u0000"+
		"]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_\u0018\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ae\u0007"+
		"\u0002\u0000\u0000bd\u0007\u0003\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000f\u001a\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0007"+
		"\u0004\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0006\r\u0000\u0000k\u001c"+
		"\u0001\u0000\u0000\u0000lm\u0005/\u0000\u0000mn\u0005*\u0000\u0000nr\u0001"+
		"\u0000\u0000\u0000oq\t\u0000\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005*\u0000\u0000"+
		"vw\u0005/\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0006\u000e\u0000\u0000"+
		"y\u001e\u0001\u0000\u0000\u0000z{\u0005/\u0000\u0000{|\u0005/\u0000\u0000"+
		"|\u0080\u0001\u0000\u0000\u0000}\u007f\b\u0005\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0006\u000f\u0000"+
		"\u0000\u0084 \u0001\u0000\u0000\u0000\u0005\u0000^er\u0080\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}