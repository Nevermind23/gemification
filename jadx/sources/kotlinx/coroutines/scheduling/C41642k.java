package kotlinx.coroutines.scheduling;

import ef1.C40832l0;

/* renamed from: kotlinx.coroutines.scheduling.k */
public final class C41642k extends C41639h {

    /* renamed from: f */
    public final Runnable f97877f;

    public C41642k(Runnable runnable, long j, C41640i iVar) {
        super(j, iVar);
        this.f97877f = runnable;
    }

    public void run() {
        try {
            this.f97877f.run();
        } finally {
            this.f97875e.mo96447a();
        }
    }

    public String toString() {
        return "Task[" + C40832l0.m118329a(this.f97877f) + '@' + C40832l0.m118330b(this.f97877f) + ", " + this.f97874d + ", " + this.f97875e + ']';
    }
}
