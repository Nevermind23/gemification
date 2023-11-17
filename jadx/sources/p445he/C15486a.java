package p445he;

import android.opengl.EGLConfig;
import kotlin.jvm.internal.C41536l;

/* renamed from: he.a */
public final class C15486a {

    /* renamed from: a */
    private final EGLConfig f43951a;

    public C15486a(EGLConfig eGLConfig) {
        C41536l.m120489i(eGLConfig, "native");
        this.f43951a = eGLConfig;
    }

    /* renamed from: a */
    public final EGLConfig mo42580a() {
        return this.f43951a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15486a) && C41536l.m120484d(this.f43951a, ((C15486a) obj).f43951a);
    }

    public int hashCode() {
        return this.f43951a.hashCode();
    }

    public String toString() {
        return "EglConfig(native=" + this.f43951a + ')';
    }
}
