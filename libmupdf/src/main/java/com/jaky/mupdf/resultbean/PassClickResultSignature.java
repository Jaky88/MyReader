package com.jaky.mupdf.resultbean;

/**
 * @Copyright: Copyright © 2017 Onyx International Inc. All rights reserved.
 * @Project: MyReader
 * @Author: Jack
 * @Date: 2017/10/19 0019,1:34
 * @Version: V1.0
 * @Description: TODO
 */

public class PassClickResultSignature extends PassClickResult {
    public final SignatureState state;

    public enum SignatureState {
        NoSupport,
        Unsigned,
        Signed
    }

    public PassClickResultSignature(boolean _changed, int _state) {
        super(_changed);
        state = SignatureState.values()[_state];
    }

    public void acceptVisitor(PassClickResultVisitor visitor) {
        visitor.visitSignature(this);
    }
}


