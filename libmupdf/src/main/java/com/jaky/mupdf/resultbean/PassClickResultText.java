package com.jaky.mupdf.resultbean;

/**
 * @Copyright: Copyright © 2017 Onyx International Inc. All rights reserved.
 * @Project: MyReader
 * @Author: Jack
 * @Date: 2017/10/19 0019,1:33
 * @Version: V1.0
 * @Description: TODO
 */

public class PassClickResultText extends PassClickResult {
    public final String text;

    public PassClickResultText(boolean _changed, String _text) {
        super(_changed);
        text = _text;
    }

    public void acceptVisitor(PassClickResultVisitor visitor) {
        visitor.visitText(this);
    }
}
