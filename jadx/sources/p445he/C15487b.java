package p445he;

import android.opengl.EGLContext;
import kotlin.jvm.internal.C41536l;

/* renamed from: he.b */
public final class C15487b {

    /* renamed from: a */
    private final EGLContext f43952a;

    public C15487b(EGLContext eGLContext) {
        this.f43952a = eGLContext;
    }

    /* renamed from: a */
    public final EGLContext mo42584a() {
        return this.f43952a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15487b) && C41536l.m120484d(this.f43952a, ((C15487b) obj).f43952a);
    }

    public int hashCode() {
        EGLContext eGLContext = this.f43952a;
        if (eGLContext == null) {
            return 0;
        }
        return eGLContext.hashCode();
    }

    public String toString() {
        return "EglContext(native=" + this.f43952a + ')';
    }
}
