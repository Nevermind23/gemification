package gc0;

import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41536l;
import p603si.C17799b;

/* renamed from: gc0.b */
public final class C20793b implements C17799b {

    /* renamed from: d */
    public static final C20793b f56031d = new C20793b();

    private C20793b() {
    }

    /* renamed from: b */
    public String mo45383b() {
        return C17799b.C17802c.m61542a(this);
    }

    /* renamed from: c */
    public Object[] mo45384c() {
        return C17799b.C17802c.m61543b(this);
    }

    /* renamed from: g */
    public boolean mo45386g(String... strArr) {
        C41536l.m120489i(strArr, "inputs");
        int length = strArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            Double h = C40437u.m117096h(strArr[i]);
            if (h == null || h.doubleValue() <= Utils.DOUBLE_EPSILON) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }
}
