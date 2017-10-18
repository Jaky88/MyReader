package com.jaky.mupdf.resultbean;

/**
 * @Copyright: Copyright © 2017 Onyx International Inc. All rights reserved.
 * @Project: MyReader
 * @Author: Jack
 * @Date: 2017/10/19 0019,1:30
 * @Version: V1.0
 * @Description: TODO
 */

public class PassClickResult {
    public final boolean changed;

    public PassClickResult(boolean _changed) {
        changed = _changed;
    }

    public void acceptVisitor(PassClickResultVisitor visitor) {
    }
}
