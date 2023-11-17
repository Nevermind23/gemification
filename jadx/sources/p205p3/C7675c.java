package p205p3;

import java.util.Queue;
import p089g4.C6224l;

/* renamed from: p3.c */
abstract class C7675c {

    /* renamed from: a */
    private final Queue f22327a = C6224l.m24737f(20);

    C7675c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C7690m mo22390a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C7690m mo22391b() {
        C7690m mVar = (C7690m) this.f22327a.poll();
        if (mVar == null) {
            return mo22390a();
        }
        return mVar;
    }

    /* renamed from: c */
    public void mo22392c(C7690m mVar) {
        if (this.f22327a.size() < 20) {
            this.f22327a.offer(mVar);
        }
    }
}
