package p445he;

import android.opengl.GLU;
import android.opengl.Matrix;
import kotlin.jvm.internal.C41536l;

/* renamed from: he.g */
public abstract class C15492g {
    /* renamed from: a */
    public static final String m56043a(int i) {
        String gluErrorString = GLU.gluErrorString(i);
        C41536l.m120488h(gluErrorString, "gluErrorString(value)");
        return gluErrorString;
    }

    /* renamed from: b */
    public static final String m56044b(int i) {
        String hexString = Integer.toHexString(i);
        C41536l.m120488h(hexString, "toHexString(value)");
        return hexString;
    }

    /* renamed from: c */
    public static final float[] m56045c(float[] fArr) {
        C41536l.m120489i(fArr, "matrix");
        return (float[]) fArr.clone();
    }

    /* renamed from: d */
    public static final void m56046d(float[] fArr) {
        C41536l.m120489i(fArr, "matrix");
        Matrix.setIdentityM(fArr, 0);
    }
}
