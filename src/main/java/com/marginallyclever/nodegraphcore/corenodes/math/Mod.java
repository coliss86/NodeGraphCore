package com.marginallyclever.nodegraphcore.corenodes.math;

import com.marginallyclever.nodegraphcore.Node;
import com.marginallyclever.nodegraphcore.NodeVariable;

/**
 * C=mod(A,B)
 * @author Dan Royer
 * @since 2022-02-01
 */
public class Mod extends Node {
    private final NodeVariable<Number> a = NodeVariable.newInstance("A",Number.class,0,true,false);
    private final NodeVariable<Number> b = NodeVariable.newInstance("B",Number.class,0,true,false);
    private final NodeVariable<Number> c = NodeVariable.newInstance("output",Number.class,0,false,true);

    /**
     * Constructor for subclasses to call.
     */
    public Mod() {
        super("Mod");
        addVariable(a);
        addVariable(b);
        addVariable(c);
    }

    /**
     * Constructor for subclasses to call.
     * @param a the starting value.
     * @param b the starting value.
     */
    public Mod(double a, double b) {
        this();
        this.a.setValue(a);
        this.b.setValue(b);
    }

    @Override
    public Node create() {
        return new Mod();
    }

    @Override
    public void update() {
        double av = a.getValue().doubleValue();
        double bv = b.getValue().doubleValue();
        c.setValue(av%bv);
        cleanAllInputs();
    }
}
