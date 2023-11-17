package p403ee;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.util.Log;
import he1.C41234t;
import kotlin.jvm.internal.C41536l;
import p341ge.C12989a;
import p445he.C15489d;
import p445he.C15491f;
import p445he.C15492g;

/* renamed from: ee.d */
public final class C12433d {

    /* renamed from: a */
    public static final C12433d f37101a = new C12433d();

    /* renamed from: b */
    public static final float[] f37102b;

    static {
        float[] fArr = new float[16];
        C12989a.m49014b(fArr);
        f37102b = fArr;
    }

    private C12433d() {
    }

    /* renamed from: a */
    public static final void m47458a(String str) {
        C41536l.m120489i(str, "opName");
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != C15489d.m56021p()) {
            String str2 = "Error during " + str + ": EGL error 0x" + C15492g.m56044b(eglGetError);
            Log.e("Egloo", str2);
            throw new RuntimeException(str2);
        }
    }

    /* renamed from: b */
    public static final void m47459b(String str) {
        C41536l.m120489i(str, "opName");
        int a = C41234t.m119493a(GLES20.glGetError());
        if (a != C15491f.m56033h()) {
            String str2 = "Error during " + str + ": glError 0x" + C15492g.m56044b(a) + ": " + C15492g.m56043a(a);
            Log.e("Egloo", str2);
            throw new RuntimeException(str2);
        }
    }

    /* renamed from: c */
    public static final void m47460c(int i, String str) {
        C41536l.m120489i(str, "label");
        if (i < 0) {
            String str2 = "Unable to locate " + str + " in program";
            Log.e("Egloo", str2);
            throw new RuntimeException(str2);
        }
    }
}
