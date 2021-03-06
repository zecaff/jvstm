package jvstm.test.point.impl;

import jvstm.test.point.core.Point;
import jvstm.test.point.core.PointFactory;

public class AomIntegerPointFactory implements PointFactory<Integer>{

    @Override
    public Point<Integer> make(Number x, Number y) {
        return new AomIntegerPoint(x.intValue(), y.intValue());
    }

}
