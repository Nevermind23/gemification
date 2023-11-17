package hf1;

import kotlin.coroutines.Continuation;
import me1.C41752f;
import oe1.C41854e;

/* renamed from: hf1.m */
final class C41260m implements Continuation, C41854e {

    /* renamed from: d */
    private final Continuation f97270d;

    /* renamed from: e */
    private final C41752f f97271e;

    public C41260m(Continuation continuation, C41752f fVar) {
        this.f97270d = continuation;
        this.f97271e = fVar;
    }

    /* renamed from: b */
    public C41752f mo94380b() {
        return this.f97271e;
    }

    /* renamed from: g */
    public C41854e mo95202g() {
        Continuation continuation = this.f97270d;
        if (continuation instanceof C41854e) {
            return (C41854e) continuation;
        }
        return null;
    }

    /* renamed from: h */
    public void mo94382h(Object obj) {
        this.f97270d.mo94382h(obj);
    }
}
