package p445he;

import android.opengl.EGLDisplay;
import kotlin.jvm.internal.C41536l;

/* renamed from: he.c */
public final class C15488c {

    /* renamed from: a */
    private final EGLDisplay f43953a;

    public C15488c(EGLDisplay eGLDisplay) {
        this.f43953a = eGLDisplay;
    }

    /* renamed from: a */
    public final EGLDisplay mo42588a() {
        return this.f43953a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15488c) && C41536l.m120484d(this.f43953a, ((C15488c) obj).f43953a);
    }

    public int hashCode() {
        EGLDisplay eGLDisplay = this.f43953a;
        if (eGLDisplay == null) {
            return 0;
        }
        return eGLDisplay.hashCode();
    }

    public String toString() {
        return "EglDisplay(native=" + this.f43953a + ')';
    }
}
