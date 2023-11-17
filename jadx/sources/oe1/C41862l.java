package oe1;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41533i;
import kotlin.jvm.internal.C41536l;

/* renamed from: oe1.l */
public abstract class C41862l extends C41853d implements C41533i {

    /* renamed from: g */
    private final int f98240g;

    public C41862l(int i, Continuation continuation) {
        super(continuation);
        this.f98240g = i;
    }

    public int getArity() {
        return this.f98240g;
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
