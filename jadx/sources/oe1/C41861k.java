package oe1;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41533i;
import kotlin.jvm.internal.C41536l;

/* renamed from: oe1.k */
public abstract class C41861k extends C41860j implements C41533i {

    /* renamed from: e */
    private final int f98239e;

    public C41861k(int i, Continuation continuation) {
        super(continuation);
        this.f98239e = i;
    }

    public int getArity() {
        return this.f98239e;
    }

    public String toString() {
        if (mo96643c() != null) {
            return super.toString();
        }
        String h = C41520a0.m120442h(this);
        C41536l.m120488h(h, "renderLambdaToString(this)");
        return h;
    }
}
