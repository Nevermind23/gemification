package p218q3;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p089g4.C6223k;

/* renamed from: q3.c */
final class C7868c {

    /* renamed from: a */
    private final Map f22807a = new HashMap();

    /* renamed from: b */
    private final C7870b f22808b = new C7870b();

    /* renamed from: q3.c$a */
    private static class C7869a {

        /* renamed from: a */
        final Lock f22809a = new ReentrantLock();

        /* renamed from: b */
        int f22810b;

        C7869a() {
        }
    }

    /* renamed from: q3.c$b */
    private static class C7870b {

        /* renamed from: a */
        private final Queue f22811a = new ArrayDeque();

        C7870b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C7869a mo22838a() {
            C7869a aVar;
            synchronized (this.f22811a) {
                aVar = (C7869a) this.f22811a.poll();
            }
            if (aVar == null) {
                return new C7869a();
            }
            return aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo22839b(C7869a aVar) {
            synchronized (this.f22811a) {
                if (this.f22811a.size() < 10) {
                    this.f22811a.offer(aVar);
                }
            }
        }
    }

    C7868c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo22836a(String str) {
        C7869a aVar;
        synchronized (this) {
            aVar = (C7869a) this.f22807a.get(str);
            if (aVar == null) {
                aVar = this.f22808b.mo22838a();
                this.f22807a.put(str, aVar);
            }
            aVar.f22810b++;
        }
        aVar.f22809a.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo22837b(String str) {
        C7869a aVar;
        synchronized (this) {
            aVar = (C7869a) C6223k.m24730d(this.f22807a.get(str));
            int i = aVar.f22810b;
            if (i >= 1) {
                int i2 = i - 1;
                aVar.f22810b = i2;
                if (i2 == 0) {
                    C7869a aVar2 = (C7869a) this.f22807a.remove(str);
                    if (aVar2.equals(aVar)) {
                        this.f22808b.mo22839b(aVar2);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f22810b);
            }
        }
        aVar.f22809a.unlock();
    }
}
