package xd1;

import md1.C41737f;
import uh1.C43107b;

/* renamed from: xd1.c */
public enum C43258c implements C41737f {
    INSTANCE;

    /* renamed from: a */
    public static void m124212a(C43107b bVar) {
        bVar.mo27070b(INSTANCE);
        bVar.onComplete();
    }

    /* renamed from: b */
    public static void m124213b(Throwable th, C43107b bVar) {
        bVar.mo27070b(INSTANCE);
        bVar.onError(th);
    }

    /* renamed from: c */
    public Object mo96258c() {
        return null;
    }

    public void cancel() {
    }

    public void clear() {
    }

    /* renamed from: e */
    public int mo96260e(int i) {
        return i & 2;
    }

    /* renamed from: f */
    public boolean mo96261f(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public boolean isEmpty() {
        return true;
    }

    /* renamed from: l */
    public void mo94357l(long j) {
        C43259d.m124223g(j);
    }

    public String toString() {
        return "EmptySubscription";
    }
}
