//header
grammar new_Enkel;

//parser rules
compilationUnit : ( statement )* EOF; //root rule - globally code consist only of variables and prints (see definition below)

block : '{' statement* '}';

statement : block
		| print
		| variable
		| ifStatement
		| forStatement ;


variable : VARIABLE ID EQUALS value; //requires VAR token followed by ID token followed by EQUALS TOKEN ...
print : PRINT ID ; //print statement must consist of 'print' keyword and ID
ifStatement :  ( ifLabel  ('(')? expression (')')? trueStatement=statement ( elseLabel falseStatement=statement)?);
forStatement : 'for' ('(')? forConditions (')')? statement ;

forConditions : iterator=variableReference  'from' startExpr=expression range='to' endExpr=expression ;
ifLabel : IF ;
elseLabel : ELSE ;

expression :variableReference #VarReference 
		   |value        #VALUE
           //other expression alternatives
           | expression cmp='>' expression #conditionalExpression
           | expression cmp='<' expression #conditionalExpression
           | expression cmp='==' expression #conditionalExpression
           | expression cmp='!=' expression #conditionalExpression
           | expression cmp='>=' expression #conditionalExpression
           | expression cmp='<=' expression #conditionalExpression
           ;

value : NUMBER
      | STRING ; //must be NUMBER or STRING value (defined below)

variableReference : ID ;

//lexer rules (tokens)
IF: 'if' ;
ELSE: 'else' ;
VARIABLE : 'var' ; //VARIABLE TOKEN must match exactly 'var'
PRINT : 'print' ;
EQUALS : '=' ; //must be '='
NUMBER : [0-9]+ ; //must consist only of digits
STRING : '"'.*'"' ; //must be anything in qutoes
ID : [a-zA-Z0-9]+ ; //must be any alphanumeric value
WS: [ \t\n\r]+ -> skip ; //special TOKEN for skipping whitespaces
