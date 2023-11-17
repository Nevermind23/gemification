package p050d4;

import android.graphics.drawable.Drawable;
import p035c4.C2250d;
import p089g4.C6224l;

/* renamed from: d4.c */
public abstract class C5817c implements C5825i {

    /* renamed from: d */
    private final int f18307d;

    /* renamed from: e */
    private final int f18308e;

    /* renamed from: f */
    private C2250d f18309f;

    public C5817c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public final void mo7275a(C5824h hVar) {
        hVar.mo7299e(this.f18307d, this.f18308e);
    }

    /* renamed from: d */
    public final void mo7278d(C5824h hVar) {
    }

    /* renamed from: f */
    public void mo7279f() {
    }

    /* renamed from: g */
    public void mo7280g(Drawable drawable) {
    }

    /* renamed from: h */
    public final C2250d mo7283h() {
        return this.f18309f;
    }

    /* renamed from: j */
    public final void mo7287j(C2250d dVar) {
        this.f18309f = dVar;
    }

    /* renamed from: k */
    public void mo7288k(Drawable drawable) {
    }

    /* renamed from: o */
    public void mo7289o() {
    }

    public void onDestroy() {
    }

    public C5817c(int i, int i2) {
        if (C6224l.m24752u(i, i2)) {
            this.f18307d = i;
            this.f18308e = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }
}
