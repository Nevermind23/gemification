package p326y8;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import p327y9.C9142b;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: y8.v */
class C9135v implements C9142b {

    /* renamed from: a */
    private volatile Set f25329a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    private volatile Set f25330b = null;

    C9135v(Collection collection) {
        this.f25329a.addAll(collection);
    }

    /* renamed from: b */
    static C9135v m33687b(Collection collection) {
        return new C9135v((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m33688d() {
        for (C9142b bVar : this.f25329a) {
            this.f25330b.add(bVar.get());
        }
        this.f25329a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo24708a(C9142b bVar) {
        if (this.f25330b == null) {
            this.f25329a.add(bVar);
        } else {
            this.f25330b.add(bVar.get());
        }
    }

    /* renamed from: c */
    public Set get() {
        if (this.f25330b == null) {
            synchronized (this) {
                if (this.f25330b == null) {
                    this.f25330b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m33688d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f25330b);
    }
}
