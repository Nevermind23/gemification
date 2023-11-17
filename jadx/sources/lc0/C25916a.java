package lc0;

import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41536l;
import p603si.C17799b;
import ue1.C43075l;

/* renamed from: lc0.a */
public final class C25916a implements C17799b {

    /* renamed from: d */
    private final double f65935d;

    /* renamed from: e */
    private final double f65936e;

    /* renamed from: f */
    private final String f65937f;

    /* renamed from: g */
    private final C43075l f65938g;

    public C25916a(double d, double d2, String str, C43075l lVar) {
        C41536l.m120489i(str, "errorMessage");
        C41536l.m120489i(lVar, "inputListener");
        this.f65935d = d;
        this.f65936e = d2;
        this.f65937f = str;
        this.f65938g = lVar;
    }

    /* renamed from: b */
    public String mo45383b() {
        return this.f65937f;
    }

    /* renamed from: c */
    public Object[] mo45384c() {
        return C17799b.C17802c.m61543b(this);
    }

    /* renamed from: g */
    public boolean mo45386g(String... strArr) {
        double d;
        C41536l.m120489i(strArr, "inputs");
        try {
            int length = strArr.length;
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= length) {
                    return true;
                }
                Double h = C40437u.m117096h(strArr[i]);
                double d2 = Utils.DOUBLE_EPSILON;
                if (h != null) {
                    d = h.doubleValue();
                } else {
                    d = 0.0d;
                }
                if (d < this.f65935d || d >= this.f65936e) {
                    z = false;
                }
                C43075l lVar = this.f65938g;
                if (z) {
                    d2 = d;
                }
                lVar.invoke(Double.valueOf(d2));
                if (!z) {
                    return false;
                }
                i++;
            }
        } catch (Exception unused) {
            return false;
        }
    }
}
