// Generated from /home/davevarga/Projects/Intellj/StateModel/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StateModelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StateModelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(StateModelParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#statesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatesBlock(StateModelParser.StatesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#stateDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateDeclaration(StateModelParser.StateDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#initialState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialState(StateModelParser.InitialStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#errorState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorState(StateModelParser.ErrorStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#normalState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalState(StateModelParser.NormalStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#stateDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateDefinition(StateModelParser.StateDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#stateName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateName(StateModelParser.StateNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTags(StateModelParser.TagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#transitionsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionsBlock(StateModelParser.TransitionsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(StateModelParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#transitionSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionSchema(StateModelParser.TransitionSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#transitionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionType(StateModelParser.TransitionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#transitionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionName(StateModelParser.TransitionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#transitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionDefinition(StateModelParser.TransitionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#fromState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromState(StateModelParser.FromStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#toState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToState(StateModelParser.ToStateContext ctx);
}