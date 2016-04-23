package ESTree.Statements.ControlFlow;

import ESTree.Identifier.Identifier;
import ESTree.Statements.Statement;

/**
 * Created by danny on 23/04/2016.
 */
public class BreakStatement implements Statement {
    private String type = "BreakStatement";
    private Identifier label;

    public BreakStatement(Identifier label){
        this.label=label;
    }
}