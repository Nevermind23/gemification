package p625ud;

import android.graphics.ImageFormat;
import java.util.concurrent.LinkedBlockingQueue;
import p374ce.C10396b;
import p458id.C15600b;
import p570qd.C17486a;
import p570qd.C17488b;
import p570qd.C17489c;

/* renamed from: ud.c */
public abstract class C18111c {

    /* renamed from: h */
    protected static final C15600b f51368h = C15600b.m56349a(C18111c.class.getSimpleName());

    /* renamed from: a */
    private final int f51369a;

    /* renamed from: b */
    private int f51370b = -1;

    /* renamed from: c */
    private C10396b f51371c = null;

    /* renamed from: d */
    private int f51372d = -1;

    /* renamed from: e */
    private final Class f51373e;

    /* renamed from: f */
    private LinkedBlockingQueue f51374f;

    /* renamed from: g */
    private C17486a f51375g;

    protected C18111c(int i, Class cls) {
        this.f51369a = i;
        this.f51373e = cls;
        this.f51374f = new LinkedBlockingQueue(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo45799a(Object obj) {
        return mo45784g(obj);
    }

    /* renamed from: b */
    public C18110b mo45800b(Object obj, long j) {
        if (mo45804f()) {
            C18110b bVar = (C18110b) this.f51374f.poll();
            if (bVar != null) {
                f51368h.mo42879g("getFrame for time:", Long.valueOf(j), "RECYCLING.");
                C17486a aVar = this.f51375g;
                C17489c cVar = C17489c.SENSOR;
                C17489c cVar2 = C17489c.OUTPUT;
                C17488b bVar2 = C17488b.RELATIVE_TO_SENSOR;
                bVar.mo45798j(obj, j, aVar.mo45010c(cVar, cVar2, bVar2), this.f51375g.mo45010c(cVar, C17489c.VIEW, bVar2), this.f51371c, this.f51372d);
                return bVar;
            }
            f51368h.mo42878c("getFrame for time:", Long.valueOf(j), "NOT AVAILABLE.");
            mo45785h(obj, false);
            return null;
        }
        throw new IllegalStateException("Can't call getFrame() after releasing or before setUp.");
    }

    /* renamed from: c */
    public final int mo45801c() {
        return this.f51370b;
    }

    /* renamed from: d */
    public final Class mo45802d() {
        return this.f51373e;
    }

    /* renamed from: e */
    public final int mo45803e() {
        return this.f51369a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo45804f() {
        return this.f51371c != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract Object mo45784g(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo45785h(Object obj, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo45805i(C18110b bVar, Object obj) {
        if (mo45804f()) {
            mo45785h(obj, this.f51374f.offer(bVar));
        }
    }

    /* renamed from: j */
    public void mo45786j() {
        if (!mo45804f()) {
            f51368h.mo42880h("release called twice. Ignoring.");
            return;
        }
        f51368h.mo42878c("release: Clearing the frame and buffer queue.");
        this.f51374f.clear();
        this.f51370b = -1;
        this.f51371c = null;
        this.f51372d = -1;
        this.f51375g = null;
    }

    /* renamed from: k */
    public void mo45787k(int i, C10396b bVar, C17486a aVar) {
        mo45804f();
        this.f51371c = bVar;
        this.f51372d = i;
        this.f51370b = (int) Math.ceil(((double) ((long) ((bVar.mo27060c() * bVar.mo27062e()) * ImageFormat.getBitsPerPixel(i)))) / 8.0d);
        for (int i2 = 0; i2 < mo45803e(); i2++) {
            this.f51374f.offer(new C18110b(this));
        }
        this.f51375g = aVar;
    }
}
