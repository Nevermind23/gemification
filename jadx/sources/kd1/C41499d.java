package kd1;

import ed1.C40737d;
import ed1.C40746m;
import ed1.C40756v;
import ed1.C40764z;
import md1.C41735d;

/* renamed from: kd1.d */
public enum C41499d implements C41735d {
    INSTANCE,
    NEVER;

    /* renamed from: a */
    public static void m120379a(C40737d dVar) {
        dVar.onSubscribe(INSTANCE);
        dVar.onComplete();
    }

    /* renamed from: b */
    public static void m120380b(C40746m mVar) {
        mVar.onSubscribe(INSTANCE);
        mVar.onComplete();
    }

    /* renamed from: g */
    public static void m120381g(C40756v vVar) {
        vVar.onSubscribe(INSTANCE);
        vVar.onComplete();
    }

    /* renamed from: h */
    public static void m120382h(Throwable th, C40737d dVar) {
        dVar.onSubscribe(INSTANCE);
        dVar.onError(th);
    }

    /* renamed from: l */
    public static void m120383l(Throwable th, C40746m mVar) {
        mVar.onSubscribe(INSTANCE);
        mVar.onError(th);
    }

    /* renamed from: n */
    public static void m120384n(Throwable th, C40756v vVar) {
        vVar.onSubscribe(INSTANCE);
        vVar.onError(th);
    }

    /* renamed from: o */
    public static void m120385o(Throwable th, C40764z zVar) {
        zVar.onSubscribe(INSTANCE);
        zVar.onError(th);
    }

    /* renamed from: c */
    public Object mo96258c() {
        return null;
    }

    public void clear() {
    }

    public void dispose() {
    }

    /* renamed from: e */
    public int mo96260e(int i) {
        return i & 2;
    }

    /* renamed from: f */
    public boolean mo96261f(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public boolean isDisposed() {
        return this == INSTANCE;
    }

    public boolean isEmpty() {
        return true;
    }
}
