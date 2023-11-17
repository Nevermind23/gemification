package p341ge.bog.mobilebank.lifestyleoffers.presentation.shared;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.shared.VisibilityPercentageLayoutManager */
public final class VisibilityPercentageLayoutManager extends LinearLayoutManager {

    /* renamed from: M */
    public static final C15113a f43390M = new C15113a((DefaultConstructorMarker) null);

    /* renamed from: L */
    private double f43391L = 0.7d;

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.shared.VisibilityPercentageLayoutManager$a */
    public static final class C15113a {
        private C15113a() {
        }

        public /* synthetic */ C15113a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public VisibilityPercentageLayoutManager(Context context) {
        super(context);
    }

    /* renamed from: c3 */
    private final boolean m55282c3(View view, boolean z) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        ViewParent parent = view.getParent();
        C41536l.m120487g(parent, "null cannot be cast to non-null type android.view.View");
        Rect rect = new Rect();
        ((View) parent).getGlobalVisibleRect(rect);
        if (mo5191B2() == 0) {
            int i = iArr[0];
            double width = ((double) i) + (((double) view.getWidth()) * this.f43391L);
            if (z) {
                if (i < rect.left || width > ((double) rect.right)) {
                    return false;
                }
            } else if (i > rect.right || width < ((double) rect.left)) {
                return false;
            }
        } else {
            int i2 = iArr[1];
            double height = ((double) i2) + (((double) view.getHeight()) * this.f43391L);
            if (z) {
                if (i2 < rect.top || height > ((double) rect.bottom)) {
                    return false;
                }
            } else if (i2 > rect.bottom || height < ((double) rect.top)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d3 */
    private final View m55283d3(int i, int i2, boolean z) {
        int i3;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View U = mo5658U(i);
            if (U != null) {
                if (m55282c3(U, z)) {
                    return U;
                }
                i += i3;
            }
        }
        return null;
    }

    /* renamed from: j2 */
    public int mo5215j2() {
        View d3 = m55283d3(0, mo5660V(), true);
        if (d3 == null) {
            return -1;
        }
        return mo5700q0(d3);
    }

    /* renamed from: n2 */
    public int mo5219n2() {
        View d3 = m55283d3(0, mo5660V(), false);
        if (d3 == null) {
            return -1;
        }
        return mo5700q0(d3);
    }

    /* renamed from: o2 */
    public int mo5221o2() {
        View d3 = m55283d3(mo5660V() - 1, -1, true);
        if (d3 == null) {
            return -1;
        }
        return mo5700q0(d3);
    }

    /* renamed from: q2 */
    public int mo5223q2() {
        View d3 = m55283d3(mo5660V() - 1, -1, false);
        if (d3 == null) {
            return -1;
        }
        return mo5700q0(d3);
    }
}
