package ai1;

import zh1.C43510v;

/* renamed from: ai1.d */
public final class C40321d {

    /* renamed from: a */
    private final C43510v f95779a;

    /* renamed from: b */
    private final Throwable f95780b;

    private C40321d(C43510v vVar, Throwable th) {
        this.f95779a = vVar;
        this.f95780b = th;
    }

    /* renamed from: a */
    public static C40321d m116754a(Throwable th) {
        if (th != null) {
            return new C40321d((C43510v) null, th);
        }
        throw new NullPointerException("error == null");
    }

    /* renamed from: b */
    public static C40321d m116755b(C43510v vVar) {
        if (vVar != null) {
            return new C40321d(vVar, (Throwable) null);
        }
        throw new NullPointerException("response == null");
    }
}
