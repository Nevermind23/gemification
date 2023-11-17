package df1;

import df1.C40660j;

/* renamed from: df1.h */
public final class C40658h implements C40660j {

    /* renamed from: a */
    public static final C40658h f96292a = new C40658h();

    /* renamed from: b */
    private static final long f96293b = System.nanoTime();

    private C40658h() {
    }

    /* renamed from: d */
    private final long m117518d() {
        return System.nanoTime() - f96293b;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C40659i mo94648a() {
        return C40660j.C40661a.C40662a.m117525a(mo94650c());
    }

    /* renamed from: b */
    public final long mo94649b(long j, long j2) {
        return C40657g.m117517b(j, j2);
    }

    /* renamed from: c */
    public long mo94650c() {
        return C40660j.C40661a.C40662a.m117526c(m117518d());
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
