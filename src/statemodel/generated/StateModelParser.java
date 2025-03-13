// Generated from /home/davevarga/Projects/Intellj/StateModel/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class StateModelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, LCURLY=2, RCURLY=3, DPOINTS=4, RARROW=5, INITIAL=6, TRANSITIONS=7, 
		ERROR=8, STATES=9, NORMAL=10, TRANS=11, STATE_NAME=12, LABEL=13, WS=14, 
		COMMENT=15, LINE_COMMENT=16;
	public static final int
		RULE_model = 0, RULE_statesBlock = 1, RULE_stateDeclaration = 2, RULE_initialState = 3, 
		RULE_errorState = 4, RULE_normalState = 5, RULE_stateDefinition = 6, RULE_stateName = 7, 
		RULE_tags = 8, RULE_transitionsBlock = 9, RULE_instruction = 10, RULE_transitionSchema = 11, 
		RULE_transitionType = 12, RULE_transitionName = 13, RULE_transitionDefinition = 14, 
		RULE_fromState = 15, RULE_toState = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "statesBlock", "stateDeclaration", "initialState", "errorState", 
			"normalState", "stateDefinition", "stateName", "tags", "transitionsBlock", 
			"instruction", "transitionSchema", "transitionType", "transitionName", 
			"transitionDefinition", "fromState", "toState"
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

	@Override
	public String getGrammarFileName() { return "StateModel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StateModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelContext extends ParserRuleContext {
		public StatesBlockContext statesBlock() {
			return getRuleContext(StatesBlockContext.class,0);
		}
		public TransitionsBlockContext transitionsBlock() {
			return getRuleContext(TransitionsBlockContext.class,0);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			statesBlock();
			setState(35);
			transitionsBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatesBlockContext extends ParserRuleContext {
		public TerminalNode STATES() { return getToken(StateModelParser.STATES, 0); }
		public TerminalNode LCURLY() { return getToken(StateModelParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(StateModelParser.RCURLY, 0); }
		public List<StateDeclarationContext> stateDeclaration() {
			return getRuleContexts(StateDeclarationContext.class);
		}
		public StateDeclarationContext stateDeclaration(int i) {
			return getRuleContext(StateDeclarationContext.class,i);
		}
		public StatesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterStatesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitStatesBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitStatesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatesBlockContext statesBlock() throws RecognitionException {
		StatesBlockContext _localctx = new StatesBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(STATES);
			setState(38);
			match(LCURLY);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INITIAL || _la==STATE_NAME) {
				{
				{
				setState(39);
				stateDeclaration();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StateDeclarationContext extends ParserRuleContext {
		public InitialStateContext initialState() {
			return getRuleContext(InitialStateContext.class,0);
		}
		public ErrorStateContext errorState() {
			return getRuleContext(ErrorStateContext.class,0);
		}
		public NormalStateContext normalState() {
			return getRuleContext(NormalStateContext.class,0);
		}
		public StateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterStateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitStateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitStateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateDeclarationContext stateDeclaration() throws RecognitionException {
		StateDeclarationContext _localctx = new StateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stateDeclaration);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				initialState();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				errorState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				normalState();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitialStateContext extends ParserRuleContext {
		public TerminalNode INITIAL() { return getToken(StateModelParser.INITIAL, 0); }
		public StateDefinitionContext stateDefinition() {
			return getRuleContext(StateDefinitionContext.class,0);
		}
		public InitialStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterInitialState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitInitialState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitInitialState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialStateContext initialState() throws RecognitionException {
		InitialStateContext _localctx = new InitialStateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_initialState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(INITIAL);
			setState(53);
			stateDefinition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorStateContext extends ParserRuleContext {
		public StateDefinitionContext stateDefinition() {
			return getRuleContext(StateDefinitionContext.class,0);
		}
		public TerminalNode ERROR() { return getToken(StateModelParser.ERROR, 0); }
		public ErrorStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterErrorState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitErrorState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitErrorState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorStateContext errorState() throws RecognitionException {
		ErrorStateContext _localctx = new ErrorStateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_errorState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			stateDefinition();
			setState(56);
			match(ERROR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NormalStateContext extends ParserRuleContext {
		public StateDefinitionContext stateDefinition() {
			return getRuleContext(StateDefinitionContext.class,0);
		}
		public NormalStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterNormalState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitNormalState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitNormalState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalStateContext normalState() throws RecognitionException {
		NormalStateContext _localctx = new NormalStateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_normalState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			stateDefinition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StateDefinitionContext extends ParserRuleContext {
		public StateNameContext stateName() {
			return getRuleContext(StateNameContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(StateModelParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(StateModelParser.RCURLY, 0); }
		public List<TagsContext> tags() {
			return getRuleContexts(TagsContext.class);
		}
		public TagsContext tags(int i) {
			return getRuleContext(TagsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateModelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateModelParser.COMMA, i);
		}
		public StateDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterStateDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitStateDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitStateDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateDefinitionContext stateDefinition() throws RecognitionException {
		StateDefinitionContext _localctx = new StateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stateDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			stateName();
			setState(61);
			match(LCURLY);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL) {
				{
				setState(62);
				tags();
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(63);
					match(COMMA);
					setState(64);
					tags();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(72);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StateNameContext extends ParserRuleContext {
		public TerminalNode STATE_NAME() { return getToken(StateModelParser.STATE_NAME, 0); }
		public StateNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterStateName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitStateName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitStateName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateNameContext stateName() throws RecognitionException {
		StateNameContext _localctx = new StateNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(STATE_NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TagsContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(StateModelParser.LABEL, 0); }
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(LABEL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionsBlockContext extends ParserRuleContext {
		public TerminalNode TRANSITIONS() { return getToken(StateModelParser.TRANSITIONS, 0); }
		public TerminalNode LCURLY() { return getToken(StateModelParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(StateModelParser.RCURLY, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TransitionsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionsBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransitionsBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransitionsBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransitionsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionsBlockContext transitionsBlock() throws RecognitionException {
		TransitionsBlockContext _localctx = new TransitionsBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_transitionsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(TRANSITIONS);
			setState(79);
			match(LCURLY);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TRANS || _la==LABEL) {
				{
				{
				setState(80);
				instruction();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public TransitionSchemaContext transitionSchema() {
			return getRuleContext(TransitionSchemaContext.class,0);
		}
		public TransitionDefinitionContext transitionDefinition() {
			return getRuleContext(TransitionDefinitionContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instruction);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRANS:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				transitionSchema();
				}
				break;
			case LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				transitionDefinition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionSchemaContext extends ParserRuleContext {
		public TerminalNode TRANS() { return getToken(StateModelParser.TRANS, 0); }
		public TransitionTypeContext transitionType() {
			return getRuleContext(TransitionTypeContext.class,0);
		}
		public TransitionNameContext transitionName() {
			return getRuleContext(TransitionNameContext.class,0);
		}
		public TransitionSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransitionSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransitionSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransitionSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionSchemaContext transitionSchema() throws RecognitionException {
		TransitionSchemaContext _localctx = new TransitionSchemaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_transitionSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(TRANS);
			setState(93);
			transitionType();
			setState(94);
			transitionName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionTypeContext extends ParserRuleContext {
		public TerminalNode NORMAL() { return getToken(StateModelParser.NORMAL, 0); }
		public TerminalNode ERROR() { return getToken(StateModelParser.ERROR, 0); }
		public TransitionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransitionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransitionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransitionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionTypeContext transitionType() throws RecognitionException {
		TransitionTypeContext _localctx = new TransitionTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_transitionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==ERROR || _la==NORMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionNameContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(StateModelParser.LABEL, 0); }
		public TransitionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransitionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransitionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransitionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionNameContext transitionName() throws RecognitionException {
		TransitionNameContext _localctx = new TransitionNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_transitionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(LABEL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionDefinitionContext extends ParserRuleContext {
		public TransitionNameContext transitionName() {
			return getRuleContext(TransitionNameContext.class,0);
		}
		public TerminalNode DPOINTS() { return getToken(StateModelParser.DPOINTS, 0); }
		public FromStateContext fromState() {
			return getRuleContext(FromStateContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(StateModelParser.RARROW, 0); }
		public ToStateContext toState() {
			return getRuleContext(ToStateContext.class,0);
		}
		public TransitionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransitionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransitionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransitionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionDefinitionContext transitionDefinition() throws RecognitionException {
		TransitionDefinitionContext _localctx = new TransitionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_transitionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			transitionName();
			setState(101);
			match(DPOINTS);
			setState(102);
			fromState();
			setState(103);
			match(RARROW);
			setState(104);
			toState();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FromStateContext extends ParserRuleContext {
		public StateNameContext stateName() {
			return getRuleContext(StateNameContext.class,0);
		}
		public FromStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterFromState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitFromState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitFromState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStateContext fromState() throws RecognitionException {
		FromStateContext _localctx = new FromStateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fromState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			stateName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ToStateContext extends ParserRuleContext {
		public StateNameContext stateName() {
			return getRuleContext(StateNameContext.class,0);
		}
		public ToStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterToState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitToState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitToState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToStateContext toState() throws RecognitionException {
		ToStateContext _localctx = new ToStateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_toState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			stateName();
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
		"\u0004\u0001\u0010o\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001,\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"3\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006B\b\u0006\n\u0006\f\u0006E\t\u0006"+
		"\u0003\u0006G\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\tR\b\t\n\t\f\tU\t\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0003\n[\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000"+
		"\u0001\u0002\u0000\b\b\n\nd\u0000\"\u0001\u0000\u0000\u0000\u0002%\u0001"+
		"\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000"+
		"\u0000\b7\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000\f<\u0001"+
		"\u0000\u0000\u0000\u000eJ\u0001\u0000\u0000\u0000\u0010L\u0001\u0000\u0000"+
		"\u0000\u0012N\u0001\u0000\u0000\u0000\u0014Z\u0001\u0000\u0000\u0000\u0016"+
		"\\\u0001\u0000\u0000\u0000\u0018`\u0001\u0000\u0000\u0000\u001ab\u0001"+
		"\u0000\u0000\u0000\u001cd\u0001\u0000\u0000\u0000\u001ej\u0001\u0000\u0000"+
		"\u0000 l\u0001\u0000\u0000\u0000\"#\u0003\u0002\u0001\u0000#$\u0003\u0012"+
		"\t\u0000$\u0001\u0001\u0000\u0000\u0000%&\u0005\t\u0000\u0000&*\u0005"+
		"\u0002\u0000\u0000\')\u0003\u0004\u0002\u0000(\'\u0001\u0000\u0000\u0000"+
		"),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0003"+
		"\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/3\u0003\u0006\u0003\u0000"+
		"03\u0003\b\u0004\u000013\u0003\n\u0005\u00002/\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u00003\u0005\u0001\u0000"+
		"\u0000\u000045\u0005\u0006\u0000\u000056\u0003\f\u0006\u00006\u0007\u0001"+
		"\u0000\u0000\u000078\u0003\f\u0006\u000089\u0005\b\u0000\u00009\t\u0001"+
		"\u0000\u0000\u0000:;\u0003\f\u0006\u0000;\u000b\u0001\u0000\u0000\u0000"+
		"<=\u0003\u000e\u0007\u0000=F\u0005\u0002\u0000\u0000>C\u0003\u0010\b\u0000"+
		"?@\u0005\u0001\u0000\u0000@B\u0003\u0010\b\u0000A?\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000F>\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0005"+
		"\u0003\u0000\u0000I\r\u0001\u0000\u0000\u0000JK\u0005\f\u0000\u0000K\u000f"+
		"\u0001\u0000\u0000\u0000LM\u0005\r\u0000\u0000M\u0011\u0001\u0000\u0000"+
		"\u0000NO\u0005\u0007\u0000\u0000OS\u0005\u0002\u0000\u0000PR\u0003\u0014"+
		"\n\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000VW\u0005\u0003\u0000\u0000W\u0013\u0001\u0000\u0000"+
		"\u0000X[\u0003\u0016\u000b\u0000Y[\u0003\u001c\u000e\u0000ZX\u0001\u0000"+
		"\u0000\u0000ZY\u0001\u0000\u0000\u0000[\u0015\u0001\u0000\u0000\u0000"+
		"\\]\u0005\u000b\u0000\u0000]^\u0003\u0018\f\u0000^_\u0003\u001a\r\u0000"+
		"_\u0017\u0001\u0000\u0000\u0000`a\u0007\u0000\u0000\u0000a\u0019\u0001"+
		"\u0000\u0000\u0000bc\u0005\r\u0000\u0000c\u001b\u0001\u0000\u0000\u0000"+
		"de\u0003\u001a\r\u0000ef\u0005\u0004\u0000\u0000fg\u0003\u001e\u000f\u0000"+
		"gh\u0005\u0005\u0000\u0000hi\u0003 \u0010\u0000i\u001d\u0001\u0000\u0000"+
		"\u0000jk\u0003\u000e\u0007\u0000k\u001f\u0001\u0000\u0000\u0000lm\u0003"+
		"\u000e\u0007\u0000m!\u0001\u0000\u0000\u0000\u0006*2CFSZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}