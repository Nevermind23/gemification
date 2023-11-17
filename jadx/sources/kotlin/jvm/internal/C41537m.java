package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.m */
public abstract class C41537m implements C41533i, Serializable {
    private final int arity;

    public C41537m(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String i = C41520a0.m120443i(this);
        C41536l.m120488h(i, "renderLambdaToString(this)");
        return i;
    }
}
