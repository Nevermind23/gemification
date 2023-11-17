package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.core.widget.e */
public abstract class C1298e {

    /* renamed from: androidx.core.widget.e$a */
    static class C1299a {
        /* renamed from: a */
        static void m4519a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: androidx.core.widget.e$b */
    private static class C1300b {
        /* renamed from: a */
        public static EdgeEffect m4520a(Context context, AttributeSet attributeSet) {
            try {
                C1304i.m4526a();
                return C1303h.m4525a(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m4521b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return Utils.FLOAT_EPSILON;
            }
        }

        /* renamed from: c */
        public static float m4522c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return Utils.FLOAT_EPSILON;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m4515a(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1300b.m4520a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m4516b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1300b.m4521b(edgeEffect);
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: c */
    public static void m4517c(EdgeEffect edgeEffect, float f, float f2) {
        C1299a.m4519a(edgeEffect, f, f2);
    }

    /* renamed from: d */
    public static float m4518d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1300b.m4522c(edgeEffect, f, f2);
        }
        m4517c(edgeEffect, f, f2);
        return f;
    }
}
