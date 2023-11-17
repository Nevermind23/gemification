package p625ud;

import p374ce.C10396b;
import p458id.C15600b;

/* renamed from: ud.b */
public class C18110b {

    /* renamed from: j */
    private static final C15600b f51358j = C15600b.m56349a(C18110b.class.getSimpleName());

    /* renamed from: a */
    private final C18111c f51359a;

    /* renamed from: b */
    private final Class f51360b;

    /* renamed from: c */
    private Object f51361c = null;

    /* renamed from: d */
    private long f51362d = -1;

    /* renamed from: e */
    private long f51363e = -1;

    /* renamed from: f */
    private int f51364f = 0;

    /* renamed from: g */
    private int f51365g = 0;

    /* renamed from: h */
    private C10396b f51366h = null;

    /* renamed from: i */
    private int f51367i = -1;

    C18110b(C18111c cVar) {
        this.f51359a = cVar;
        this.f51360b = cVar.mo45802d();
    }

    /* renamed from: a */
    private void m62139a() {
        if (!m62140h()) {
            f51358j.mo42877b("Frame is dead! time:", Long.valueOf(this.f51362d), "lastTime:", Long.valueOf(this.f51363e));
            throw new RuntimeException("You should not access a released frame. If this frame was passed to a FrameProcessor, you can only use its contents synchronously, for the duration of the process() method.");
        }
    }

    /* renamed from: h */
    private boolean m62140h() {
        return this.f51361c != null;
    }

    /* renamed from: b */
    public C18110b mo45790b() {
        m62139a();
        C18110b bVar = new C18110b(this.f51359a);
        bVar.mo45798j(this.f51359a.mo45799a(mo45791c()), this.f51362d, this.f51364f, this.f51365g, this.f51366h, this.f51367i);
        return bVar;
    }

    /* renamed from: c */
    public Object mo45791c() {
        m62139a();
        return this.f51361c;
    }

    /* renamed from: d */
    public Class mo45792d() {
        return this.f51360b;
    }

    /* renamed from: e */
    public int mo45793e() {
        m62139a();
        return this.f51364f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C18110b) && ((C18110b) obj).f51362d == this.f51362d;
    }

    /* renamed from: f */
    public C10396b mo45795f() {
        m62139a();
        return this.f51366h;
    }

    /* renamed from: g */
    public long mo45796g() {
        m62139a();
        return this.f51362d;
    }

    /* renamed from: i */
    public void mo45797i() {
        if (m62140h()) {
            f51358j.mo42879g("Frame with time", Long.valueOf(this.f51362d), "is being released.");
            Object obj = this.f51361c;
            this.f51361c = null;
            this.f51364f = 0;
            this.f51365g = 0;
            this.f51362d = -1;
            this.f51366h = null;
            this.f51367i = -1;
            this.f51359a.mo45805i(this, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo45798j(Object obj, long j, int i, int i2, C10396b bVar, int i3) {
        this.f51361c = obj;
        this.f51362d = j;
        this.f51363e = j;
        this.f51364f = i;
        this.f51365g = i2;
        this.f51366h = bVar;
        this.f51367i = i3;
    }
}
