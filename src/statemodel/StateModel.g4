grammar StateModel;

// Entrypoint
model: statesBlock transitionsBlock;

// PARSERS
statesBlock:   STATES LCURLY stateDeclaration* RCURLY;

stateDeclaration:   initialState | errorState | normalState;
initialState:       INITIAL stateDefinition;
errorState:   stateDefinition ERROR;
normalState:   stateDefinition;

stateDefinition:   stateName LCURLY (tags (COMMA tags)*)? RCURLY;
stateName: STATE_NAME;
tags: LABEL;

transitionsBlock: TRANSITIONS LCURLY instruction* RCURLY;
instruction:   transitionSchema | transitionDefinition;

transitionSchema:   TRANS transitionType transitionName;
transitionType:   NORMAL | ERROR;
transitionName:   LABEL;

transitionDefinition: transitionName DPOINTS fromState RARROW toState;
fromState: stateName;
toState: stateName;


// LEXERS
COMMA: ',';
LCURLY: '{';
RCURLY: '}';
DPOINTS: ':';
RARROW: '->';

INITIAL: 'initial';
TRANSITIONS: 'transitions';
ERROR: 'error';
STATES: 'states';
NORMAL: 'normal';
TRANS: 'trans';

STATE_NAME: [A-Z][A-Z0-9]*;
LABEL: [a-z][a-z0-9]*;

WS          : (' ' | '\t' | '\n' | '\r') -> skip ;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;