package oe1;

import kotlin.coroutines.Continuation;
import me1.C41752f;

/* renamed from: oe1.c */
public final class C41852c implements Continuation {

    /* renamed from: d */
    public static final C41852c f98230d = new C41852c();

    private C41852c() {
    }

    /* renamed from: b */
    public C41752f mo94380b() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    /* renamed from: h */
    public void mo94382h(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
