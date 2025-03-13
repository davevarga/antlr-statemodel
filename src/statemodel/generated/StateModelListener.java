// Generated from /home/davevarga/Projects/Intellj/StateModel/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StateModelParser}.
 */
public interface StateModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(StateModelParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(StateModelParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#statesBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatesBlock(StateModelParser.StatesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#statesBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatesBlock(StateModelParser.StatesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#stateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStateDeclaration(StateModelParser.StateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#stateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStateDeclaration(StateModelParser.StateDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#initialState}.
	 * @param ctx the parse tree
	 */
	void enterInitialState(StateModelParser.InitialStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#initialState}.
	 * @param ctx the parse tree
	 */
	void exitInitialState(StateModelParser.InitialStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#errorState}.
	 * @param ctx the parse tree
	 */
	void enterErrorState(StateModelParser.ErrorStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#errorState}.
	 * @param ctx the parse tree
	 */
	void exitErrorState(StateModelParser.ErrorStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#normalState}.
	 * @param ctx the parse tree
	 */
	void enterNormalState(StateModelParser.NormalStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#normalState}.
	 * @param ctx the parse tree
	 */
	void exitNormalState(StateModelParser.NormalStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#stateDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStateDefinition(StateModelParser.StateDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#stateDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStateDefinition(StateModelParser.StateDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#stateName}.
	 * @param ctx the parse tree
	 */
	void enterStateName(StateModelParser.StateNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#stateName}.
	 * @param ctx the parse tree
	 */
	void exitStateName(StateModelParser.StateNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(StateModelParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(StateModelParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transitionsBlock}.
	 * @param ctx the parse tree
	 */
	void enterTransitionsBlock(StateModelParser.TransitionsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transitionsBlock}.
	 * @param ctx the parse tree
	 */
	void exitTransitionsBlock(StateModelParser.TransitionsBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(StateModelParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(StateModelParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transitionSchema}.
	 * @param ctx the parse tree
	 */
	void enterTransitionSchema(StateModelParser.TransitionSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transitionSchema}.
	 * @param ctx the parse tree
	 */
	void exitTransitionSchema(StateModelParser.TransitionSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transitionType}.
	 * @param ctx the parse tree
	 */
	void enterTransitionType(StateModelParser.TransitionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transitionType}.
	 * @param ctx the parse tree
	 */
	void exitTransitionType(StateModelParser.TransitionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transitionName}.
	 * @param ctx the parse tree
	 */
	void enterTransitionName(StateModelParser.TransitionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transitionName}.
	 * @param ctx the parse tree
	 */
	void exitTransitionName(StateModelParser.TransitionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTransitionDefinition(StateModelParser.TransitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTransitionDefinition(StateModelParser.TransitionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#fromState}.
	 * @param ctx the parse tree
	 */
	void enterFromState(StateModelParser.FromStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#fromState}.
	 * @param ctx the parse tree
	 */
	void exitFromState(StateModelParser.FromStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#toState}.
	 * @param ctx the parse tree
	 */
	void enterToState(StateModelParser.ToStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#toState}.
	 * @param ctx the parse tree
	 */
	void exitToState(StateModelParser.ToStateContext ctx);
}