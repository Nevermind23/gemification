package p445he;

import android.opengl.EGLSurface;
import kotlin.jvm.internal.C41536l;

/* renamed from: he.e */
public final class C15490e {

    /* renamed from: a */
    private final EGLSurface f43974a;

    public C15490e(EGLSurface eGLSurface) {
        this.f43974a = eGLSurface;
    }

    /* renamed from: a */
    public final EGLSurface mo42592a() {
        return this.f43974a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15490e) && C41536l.m120484d(this.f43974a, ((C15490e) obj).f43974a);
    }

    public int hashCode() {
        EGLSurface eGLSurface = this.f43974a;
        if (eGLSurface == null) {
            return 0;
        }
        return eGLSurface.hashCode();
    }

    public String toString() {
        return "EglSurface(native=" + this.f43974a + ')';
    }
}
