package p012ab;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p029bb.C2201b;
import p029bb.C2202c;
import p029bb.C2205d;
import p029bb.C2207e;
import p029bb.C2208f;
import p042cb.C2288a;
import p042cb.C2293f;
import p057db.C5861b;
import p196o7.C7465c;
import p222q7.C7899d;

/* renamed from: ab.c */
public abstract class C0099c implements C7465c.C7467b, C7465c.C7472g, C7465c.C7470e {

    /* renamed from: a */
    private final C5861b f928a;

    /* renamed from: b */
    private final C5861b.C5862a f929b;

    /* renamed from: c */
    private final C5861b.C5862a f930c;

    /* renamed from: d */
    private C2207e f931d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2288a f932e;

    /* renamed from: f */
    private C7465c f933f;

    /* renamed from: g */
    private CameraPosition f934g;

    /* renamed from: h */
    private C0101b f935h;

    /* renamed from: i */
    private final ReadWriteLock f936i;

    /* renamed from: j */
    private C0105f f937j;

    /* renamed from: ab.c$b */
    private class C0101b extends AsyncTask {
        private C0101b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set doInBackground(Float... fArr) {
            C2201b f = C0099c.this.mo175f();
            f.lock();
            try {
                return f.mo7131e(fArr[0].floatValue());
            } finally {
                f.unlock();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Set set) {
            C0099c.this.f932e.mo7335i(set);
        }
    }

    /* renamed from: ab.c$c */
    public interface C0102c {
    }

    /* renamed from: ab.c$d */
    public interface C0103d {
    }

    /* renamed from: ab.c$e */
    public interface C0104e {
    }

    /* renamed from: ab.c$f */
    public interface C0105f {
        /* renamed from: r0 */
        boolean mo188r0(C0098b bVar);
    }

    /* renamed from: ab.c$g */
    public interface C0106g {
    }

    /* renamed from: ab.c$h */
    public interface C0107h {
    }

    public C0099c(Context context, C7465c cVar) {
        this(context, cVar, new C5861b(cVar));
    }

    /* renamed from: a */
    public void mo171a() {
        C2288a aVar = this.f932e;
        if (aVar instanceof C7465c.C7467b) {
            ((C7465c.C7467b) aVar).mo171a();
        }
        this.f931d.mo7139a(this.f933f.mo21876e());
        if (this.f931d.mo7140c()) {
            mo174e();
            return;
        }
        CameraPosition cameraPosition = this.f934g;
        if (cameraPosition == null || cameraPosition.f14037e != this.f933f.mo21876e().f14037e) {
            this.f934g = this.f933f.mo21876e();
            mo174e();
        }
    }

    /* renamed from: b */
    public boolean mo172b(C7899d dVar) {
        return mo179j().mo172b(dVar);
    }

    /* renamed from: d */
    public boolean mo173d(C0098b bVar) {
        C2201b f = mo175f();
        f.lock();
        try {
            return f.mo7130d(bVar);
        } finally {
            f.unlock();
        }
    }

    /* renamed from: e */
    public void mo174e() {
        this.f936i.writeLock().lock();
        try {
            this.f935h.cancel(true);
            C0101b bVar = new C0101b();
            this.f935h = bVar;
            bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Float[]{Float.valueOf(this.f933f.mo21876e().f14037e)});
        } finally {
            this.f936i.writeLock().unlock();
        }
    }

    /* renamed from: f */
    public C2201b mo175f() {
        return this.f931d;
    }

    /* renamed from: g */
    public C5861b.C5862a mo176g() {
        return this.f930c;
    }

    /* renamed from: h */
    public void mo177h(C7899d dVar) {
        mo179j().mo177h(dVar);
    }

    /* renamed from: i */
    public C5861b.C5862a mo178i() {
        return this.f929b;
    }

    /* renamed from: j */
    public C5861b mo179j() {
        return this.f928a;
    }

    /* renamed from: k */
    public C2288a mo180k() {
        return this.f932e;
    }

    /* renamed from: l */
    public boolean mo181l(C0098b bVar) {
        C2201b f = mo175f();
        f.lock();
        try {
            return f.mo7129b(bVar);
        } finally {
            f.unlock();
        }
    }

    /* renamed from: m */
    public void mo182m(C0105f fVar) {
        this.f937j = fVar;
        this.f932e.mo7333g(fVar);
    }

    /* renamed from: n */
    public void mo183n(C2288a aVar) {
        this.f932e.mo7327a((C0102c) null);
        this.f932e.mo7333g((C0105f) null);
        this.f930c.mo19076b();
        this.f929b.mo19076b();
        this.f932e.mo7332f();
        this.f932e = aVar;
        aVar.mo7329c();
        this.f932e.mo7327a((C0102c) null);
        this.f932e.mo7330d((C0103d) null);
        this.f932e.mo7328b((C0104e) null);
        this.f932e.mo7333g(this.f937j);
        this.f932e.mo7331e((C0106g) null);
        this.f932e.mo7334h((C0107h) null);
        mo174e();
    }

    public C0099c(Context context, C7465c cVar, C5861b bVar) {
        this.f936i = new ReentrantReadWriteLock();
        this.f933f = cVar;
        this.f928a = bVar;
        this.f930c = bVar.mo19083l();
        this.f929b = bVar.mo19083l();
        this.f932e = new C2293f(context, cVar, this);
        this.f931d = new C2208f(new C2205d(new C2202c()));
        this.f935h = new C0101b();
        this.f932e.mo7329c();
    }
}
