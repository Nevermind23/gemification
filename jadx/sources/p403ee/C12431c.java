package p403ee;

import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.util.Log;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p445he.C15486a;
import p445he.C15487b;
import p445he.C15488c;
import p445he.C15489d;
import p445he.C15490e;

/* renamed from: ee.c */
public abstract class C12431c {

    /* renamed from: e */
    public static final C12432a f37096e = new C12432a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private C15488c f37097a = C15489d.m56014i();

    /* renamed from: b */
    private C15487b f37098b = C15489d.m56013h();

    /* renamed from: c */
    private C15486a f37099c;

    /* renamed from: d */
    private int f37100d = -1;

    /* renamed from: ee.c$a */
    public static final class C12432a {
        private C12432a() {
        }

        public /* synthetic */ C12432a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C12431c(C15487b bVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C15486a a;
        C41536l.m120489i(bVar, "sharedContext");
        C15488c cVar = new C15488c(EGL14.eglGetDisplay(0));
        this.f37097a = cVar;
        if (cVar != C15489d.m56014i()) {
            if (EGL14.eglInitialize(this.f37097a.mo42588a(), new int[1], 0, new int[1], 0)) {
                C12429b bVar2 = new C12429b();
                if ((i & 1) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (a = bVar2.mo33037a(this.f37097a, 3, z)) != null) {
                    C15487b bVar3 = new C15487b(EGL14.eglCreateContext(this.f37097a.mo42588a(), a.mo42580a(), bVar.mo42584a(), new int[]{C15489d.m56008c(), 3, C15489d.m56012g()}, 0));
                    try {
                        C12433d.m47458a("eglCreateContext (3)");
                        this.f37099c = a;
                        this.f37098b = bVar3;
                        this.f37100d = 3;
                    } catch (Exception unused) {
                    }
                }
                if (this.f37098b == C15489d.m56013h()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    C15486a a2 = bVar2.mo33037a(this.f37097a, 2, z);
                    if (a2 != null) {
                        C15487b bVar4 = new C15487b(EGL14.eglCreateContext(this.f37097a.mo42588a(), a2.mo42580a(), bVar.mo42584a(), new int[]{C15489d.m56008c(), 2, C15489d.m56012g()}, 0));
                        C12433d.m47458a("eglCreateContext (2)");
                        this.f37099c = a2;
                        this.f37098b = bVar4;
                        this.f37100d = 2;
                        return;
                    }
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
                return;
            }
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }

    /* renamed from: a */
    public final C15490e mo33039a(Object obj) {
        C41536l.m120489i(obj, "surface");
        int[] iArr = {C15489d.m56012g()};
        C15488c cVar = this.f37097a;
        C15486a aVar = this.f37099c;
        C41536l.m120486f(aVar);
        C15490e eVar = new C15490e(EGL14.eglCreateWindowSurface(cVar.mo42588a(), aVar.mo42580a(), obj, iArr, 0));
        C12433d.m47458a("eglCreateWindowSurface");
        if (eVar != C15489d.m56015j()) {
            return eVar;
        }
        throw new RuntimeException("surface was null");
    }

    /* renamed from: b */
    public final boolean mo33040b(C15490e eVar) {
        C41536l.m120489i(eVar, "eglSurface");
        if (!C41536l.m120484d(this.f37098b, new C15487b(EGL14.eglGetCurrentContext())) || !C41536l.m120484d(eVar, new C15490e(EGL14.eglGetCurrentSurface(C15489d.m56009d())))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo33041c(C15490e eVar) {
        C41536l.m120489i(eVar, "eglSurface");
        if (this.f37097a == C15489d.m56014i()) {
            Log.v("EglCore", "NOTE: makeSurfaceCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(this.f37097a.mo42588a(), eVar.mo42592a(), eVar.mo42592a(), this.f37098b.mo42584a())) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: d */
    public final int mo33042d(C15490e eVar, int i) {
        C41536l.m120489i(eVar, "eglSurface");
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f37097a.mo42588a(), eVar.mo42592a(), i, iArr, 0);
        return iArr[0];
    }

    /* renamed from: e */
    public void mo33043e() {
        if (this.f37097a != C15489d.m56014i()) {
            EGL14.eglMakeCurrent(this.f37097a.mo42588a(), C15489d.m56015j().mo42592a(), C15489d.m56015j().mo42592a(), C15489d.m56013h().mo42584a());
            EGL14.eglDestroyContext(this.f37097a.mo42588a(), this.f37098b.mo42584a());
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f37097a.mo42588a());
        }
        this.f37097a = C15489d.m56014i();
        this.f37098b = C15489d.m56013h();
        this.f37099c = null;
    }

    /* renamed from: f */
    public final void mo33044f(C15490e eVar) {
        C41536l.m120489i(eVar, "eglSurface");
        EGL14.eglDestroySurface(this.f37097a.mo42588a(), eVar.mo42592a());
    }

    /* renamed from: g */
    public final void mo33045g(C15490e eVar, long j) {
        C41536l.m120489i(eVar, "eglSurface");
        EGLExt.eglPresentationTimeANDROID(this.f37097a.mo42588a(), eVar.mo42592a(), j);
    }

    /* renamed from: h */
    public final boolean mo33046h(C15490e eVar) {
        C41536l.m120489i(eVar, "eglSurface");
        return EGL14.eglSwapBuffers(this.f37097a.mo42588a(), eVar.mo42592a());
    }
}
