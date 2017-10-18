package com.jaky.mupdf.resultbean;

/**
 * @Copyright: Copyright © 2017 Onyx International Inc. All rights reserved.
 * @Project: MyReader
 * @Author: Jack
 * @Date: 2017/10/19 0019,1:33
 * @Version: V1.0
 * @Description: TODO
 */

public class PassClickResultChoice extends PassClickResult {
    public final String[] options;
    public final String[] selected;

    public PassClickResultChoice(boolean _changed, String[] _options,
                                 String[] _selected) {
        super(_changed);
        options = _options;
        selected = _selected;
    }

    public void acceptVisitor(PassClickResultVisitor visitor) {
        visitor.visitChoice(this);
    }
}
