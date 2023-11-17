package p321y3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.bumptech.glide.C2396k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p035c4.C2256h;
import p050d4.C5817c;
import p063e4.C6032d;
import p076f4.C6156d;
import p089g4.C6223k;
import p089g4.C6224l;
import p153l3.C6874a;
import p166m3.C7083e;
import p166m3.C7092l;
import p192o3.C7423a;
import p205p3.C7676d;

/* renamed from: y3.g */
class C9051g {

    /* renamed from: a */
    private final C6874a f25211a;

    /* renamed from: b */
    private final Handler f25212b;

    /* renamed from: c */
    private final List f25213c;

    /* renamed from: d */
    final C2396k f25214d;

    /* renamed from: e */
    private final C7676d f25215e;

    /* renamed from: f */
    private boolean f25216f;

    /* renamed from: g */
    private boolean f25217g;

    /* renamed from: h */
    private boolean f25218h;

    /* renamed from: i */
    private C2394j f25219i;

    /* renamed from: j */
    private C9052a f25220j;

    /* renamed from: k */
    private boolean f25221k;

    /* renamed from: l */
    private C9052a f25222l;

    /* renamed from: m */
    private Bitmap f25223m;

    /* renamed from: n */
    private C7092l f25224n;

    /* renamed from: o */
    private C9052a f25225o;

    /* renamed from: p */
    private int f25226p;

    /* renamed from: q */
    private int f25227q;

    /* renamed from: r */
    private int f25228r;

    /* renamed from: y3.g$a */
    static class C9052a extends C5817c {

        /* renamed from: g */
        private final Handler f25229g;

        /* renamed from: h */
        final int f25230h;

        /* renamed from: i */
        private final long f25231i;

        /* renamed from: j */
        private Bitmap f25232j;

        C9052a(Handler handler, int i, long j) {
            this.f25229g = handler;
            this.f25230h = i;
            this.f25231i = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Bitmap mo24571c() {
            return this.f25232j;
        }

        /* renamed from: e */
        public void mo7276b(Bitmap bitmap, C6032d dVar) {
            this.f25232j = bitmap;
            this.f25229g.sendMessageAtTime(this.f25229g.obtainMessage(1, this), this.f25231i);
        }

        /* renamed from: i */
        public void mo7284i(Drawable drawable) {
            this.f25232j = null;
        }
    }

    /* renamed from: y3.g$b */
    public interface C9053b {
        /* renamed from: a */
        void mo24534a();
    }

    /* renamed from: y3.g$c */
    private class C9054c implements Handler.Callback {
        C9054c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C9051g.this.mo24567m((C9052a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                C9051g.this.f25214d.mo7743n((C9052a) message.obj);
                return false;
            }
        }
    }

    C9051g(C2379b bVar, C6874a aVar, int i, int i2, C7092l lVar, Bitmap bitmap) {
        this(bVar.mo7685f(), C2379b.m9210t(bVar.mo7687h()), aVar, (Handler) null, m33510i(C2379b.m9210t(bVar.mo7687h()), i, i2), lVar, bitmap);
    }

    /* renamed from: g */
    private static C7083e m33509g() {
        return new C6156d(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    private static C2394j m33510i(C2396k kVar, int i, int i2) {
        return kVar.mo7740e().mo7215a(((C2256h) ((C2256h) C2256h.m8673A0(C7423a.f21687b).mo7257y0(true)).mo7242o0(true)).mo7218b0(i, i2));
    }

    /* renamed from: l */
    private void m33511l() {
        boolean z;
        if (this.f25216f && !this.f25217g) {
            if (this.f25218h) {
                if (this.f25225o == null) {
                    z = true;
                } else {
                    z = false;
                }
                C6223k.m24727a(z, "Pending target must be null when starting from the first frame");
                this.f25211a.mo20954f();
                this.f25218h = false;
            }
            C9052a aVar = this.f25225o;
            if (aVar != null) {
                this.f25225o = null;
                mo24567m(aVar);
                return;
            }
            this.f25217g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f25211a.mo20953e());
            this.f25211a.mo20949b();
            this.f25222l = new C9052a(this.f25212b, this.f25211a.mo20955g(), uptimeMillis);
            this.f25219i.mo7215a(C2256h.m8674B0(m33509g())).mo7725T0(this.f25211a).mo7716I0(this.f25222l);
        }
    }

    /* renamed from: n */
    private void m33512n() {
        Bitmap bitmap = this.f25223m;
        if (bitmap != null) {
            this.f25215e.mo8047c(bitmap);
            this.f25223m = null;
        }
    }

    /* renamed from: p */
    private void m33513p() {
        if (!this.f25216f) {
            this.f25216f = true;
            this.f25221k = false;
            m33511l();
        }
    }

    /* renamed from: q */
    private void m33514q() {
        this.f25216f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24558a() {
        this.f25213c.clear();
        m33512n();
        m33514q();
        C9052a aVar = this.f25220j;
        if (aVar != null) {
            this.f25214d.mo7743n(aVar);
            this.f25220j = null;
        }
        C9052a aVar2 = this.f25222l;
        if (aVar2 != null) {
            this.f25214d.mo7743n(aVar2);
            this.f25222l = null;
        }
        C9052a aVar3 = this.f25225o;
        if (aVar3 != null) {
            this.f25214d.mo7743n(aVar3);
            this.f25225o = null;
        }
        this.f25211a.clear();
        this.f25221k = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ByteBuffer mo24559b() {
        return this.f25211a.getData().asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Bitmap mo24560c() {
        C9052a aVar = this.f25220j;
        return aVar != null ? aVar.mo24571c() : this.f25223m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo24561d() {
        C9052a aVar = this.f25220j;
        if (aVar != null) {
            return aVar.f25230h;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Bitmap mo24562e() {
        return this.f25223m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo24563f() {
        return this.f25211a.mo20950c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo24564h() {
        return this.f25228r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo24565j() {
        return this.f25211a.mo20957h() + this.f25226p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo24566k() {
        return this.f25227q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo24567m(C9052a aVar) {
        this.f25217g = false;
        if (this.f25221k) {
            this.f25212b.obtainMessage(2, aVar).sendToTarget();
        } else if (this.f25216f) {
            if (aVar.mo24571c() != null) {
                m33512n();
                C9052a aVar2 = this.f25220j;
                this.f25220j = aVar;
                for (int size = this.f25213c.size() - 1; size >= 0; size--) {
                    ((C9053b) this.f25213c.get(size)).mo24534a();
                }
                if (aVar2 != null) {
                    this.f25212b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            m33511l();
        } else if (this.f25218h) {
            this.f25212b.obtainMessage(2, aVar).sendToTarget();
        } else {
            this.f25225o = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo24568o(C7092l lVar, Bitmap bitmap) {
        this.f25224n = (C7092l) C6223k.m24730d(lVar);
        this.f25223m = (Bitmap) C6223k.m24730d(bitmap);
        this.f25219i = this.f25219i.mo7215a(new C2256h().mo7252u0(lVar));
        this.f25226p = C6224l.m24739h(bitmap);
        this.f25227q = bitmap.getWidth();
        this.f25228r = bitmap.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo24569r(C9053b bVar) {
        if (this.f25221k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f25213c.contains(bVar)) {
            boolean isEmpty = this.f25213c.isEmpty();
            this.f25213c.add(bVar);
            if (isEmpty) {
                m33513p();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo24570s(C9053b bVar) {
        this.f25213c.remove(bVar);
        if (this.f25213c.isEmpty()) {
            m33514q();
        }
    }

    C9051g(C7676d dVar, C2396k kVar, C6874a aVar, Handler handler, C2394j jVar, C7092l lVar, Bitmap bitmap) {
        this.f25213c = new ArrayList();
        this.f25214d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C9054c()) : handler;
        this.f25215e = dVar;
        this.f25212b = handler;
        this.f25219i = jVar;
        this.f25211a = aVar;
        mo24568o(lVar, bitmap);
    }
}
