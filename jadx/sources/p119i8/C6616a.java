package p119i8;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.C0825b;
import com.github.mikephil.charting.utils.Utils;
import p009a8.C0072b;
import p080f8.C6170a;
import p184n8.C7342b;

/* renamed from: i8.a */
public class C6616a {

    /* renamed from: f */
    private static final int f20114f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a */
    private final boolean f20115a;

    /* renamed from: b */
    private final int f20116b;

    /* renamed from: c */
    private final int f20117c;

    /* renamed from: d */
    private final int f20118d;

    /* renamed from: e */
    private final float f20119e;

    public C6616a(Context context) {
        this(C7342b.m27998b(context, C0072b.f162v, false), C6170a.m24581b(context, C0072b.f161u, 0), C6170a.m24581b(context, C0072b.elevationOverlayAccentColor, 0), C6170a.m24581b(context, C0072b.f159r, 0), context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: f */
    private boolean m25999f(int i) {
        return C0825b.m3101j(i, C11051p3.f31759c) == this.f20118d;
    }

    /* renamed from: a */
    public float mo20635a(float f) {
        float f2 = this.f20119e;
        if (f2 <= Utils.FLOAT_EPSILON || f <= Utils.FLOAT_EPSILON) {
            return Utils.FLOAT_EPSILON;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int mo20636b(int i, float f) {
        int i2;
        float a = mo20635a(f);
        int alpha = Color.alpha(i);
        int h = C6170a.m24587h(C0825b.m3101j(i, C11051p3.f31759c), this.f20116b, a);
        if (a > Utils.FLOAT_EPSILON && (i2 = this.f20117c) != 0) {
            h = C6170a.m24586g(h, C0825b.m3101j(i2, f20114f));
        }
        return C0825b.m3101j(h, alpha);
    }

    /* renamed from: c */
    public int mo20637c(int i, float f) {
        if (!this.f20115a || !m25999f(i)) {
            return i;
        }
        return mo20636b(i, f);
    }

    /* renamed from: d */
    public int mo20638d(float f) {
        return mo20637c(this.f20118d, f);
    }

    /* renamed from: e */
    public boolean mo20639e() {
        return this.f20115a;
    }

    public C6616a(boolean z, int i, int i2, int i3, float f) {
        this.f20115a = z;
        this.f20116b = i;
        this.f20117c = i2;
        this.f20118d = i3;
        this.f20119e = f;
    }
}
