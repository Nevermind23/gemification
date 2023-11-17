package p473je;

import kotlin.jvm.internal.C41536l;
import p403ee.C12427a;
import p445he.C15489d;
import p445he.C15490e;

/* renamed from: je.a */
public abstract class C15758a {

    /* renamed from: a */
    private C12427a f44714a;

    /* renamed from: b */
    private C15490e f44715b;

    /* renamed from: c */
    private int f44716c = -1;

    /* renamed from: d */
    private int f44717d = -1;

    public C15758a(C12427a aVar, C15490e eVar) {
        C41536l.m120489i(aVar, "eglCore");
        C41536l.m120489i(eVar, "eglSurface");
        this.f44714a = aVar;
        this.f44715b = eVar;
    }

    /* renamed from: a */
    public final C12427a mo43157a() {
        return this.f44714a;
    }

    /* renamed from: b */
    public final C15490e mo43158b() {
        return this.f44715b;
    }

    /* renamed from: c */
    public final int mo43159c() {
        int i = this.f44717d;
        if (i < 0) {
            return this.f44714a.mo33042d(this.f44715b, C15489d.m56011f());
        }
        return i;
    }

    /* renamed from: d */
    public final int mo43160d() {
        int i = this.f44716c;
        if (i < 0) {
            return this.f44714a.mo33042d(this.f44715b, C15489d.m56023r());
        }
        return i;
    }

    /* renamed from: e */
    public final boolean mo43161e() {
        return this.f44714a.mo33040b(this.f44715b);
    }

    /* renamed from: f */
    public final void mo43162f() {
        this.f44714a.mo33041c(this.f44715b);
    }

    /* renamed from: g */
    public void mo43163g() {
        this.f44714a.mo33044f(this.f44715b);
        this.f44715b = C15489d.m56015j();
        this.f44717d = -1;
        this.f44716c = -1;
    }

    /* renamed from: h */
    public final void mo43164h(long j) {
        this.f44714a.mo33045g(this.f44715b, j);
    }
}
