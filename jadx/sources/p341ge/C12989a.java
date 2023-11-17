package p341ge;

import kotlin.jvm.internal.C41536l;
import p445he.C15492g;

/* renamed from: ge.a */
public abstract class C12989a {
    /* renamed from: a */
    private static final void m49013a(float[] fArr) {
        if (fArr.length != 16) {
            throw new RuntimeException("Need a 16 values matrix.");
        }
    }

    /* renamed from: b */
    public static final float[] m49014b(float[] fArr) {
        C41536l.m120489i(fArr, "<this>");
        m49013a(fArr);
        C15492g.m56046d(fArr);
        return fArr;
    }
}
