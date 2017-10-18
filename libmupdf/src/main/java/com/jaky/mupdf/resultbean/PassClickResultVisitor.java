package com.jaky.mupdf.resultbean;

/**
 * @Copyright: Copyright © 2017 Onyx International Inc. All rights reserved.
 * @Project: MyReader
 * @Author: Jack
 * @Date: 2017/10/19 0019,1:30
 * @Version: V1.0
 * @Description: TODO
 */

public abstract class PassClickResultVisitor {
    public abstract void visitText(PassClickResultText result);
    public abstract void visitChoice(PassClickResultChoice result);
    public abstract void visitSignature(PassClickResultSignature result);
}
