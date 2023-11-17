package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: androidx.viewpager2.widget.a */
final class C1937a {

    /* renamed from: b */
    private static final ViewGroup.MarginLayoutParams f5835b;

    /* renamed from: a */
    private LinearLayoutManager f5836a;

    /* renamed from: androidx.viewpager2.widget.a$a */
    class C1938a implements Comparator {
        C1938a() {
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f5835b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    C1937a(LinearLayoutManager linearLayoutManager) {
        this.f5836a = linearLayoutManager;
    }

    /* renamed from: a */
    private boolean m7609a() {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int V = this.f5836a.mo5660V();
        if (V == 0) {
            return true;
        }
        if (this.f5836a.mo5191B2() == 0) {
            z = true;
        } else {
            z = false;
        }
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = V;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        int i5 = 0;
        while (i5 < V) {
            View U = this.f5836a.mo5658U(i5);
            if (U != null) {
                ViewGroup.LayoutParams layoutParams = U.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f5835b;
                }
                int[] iArr3 = iArr2[i5];
                if (z) {
                    i2 = U.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    i2 = U.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr3[0] = i2 - i;
                int[] iArr4 = iArr2[i5];
                if (z) {
                    i4 = U.getRight();
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i4 = U.getBottom();
                    i3 = marginLayoutParams.bottomMargin;
                }
                iArr4[1] = i4 + i3;
                i5++;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr2, new C1938a());
        for (int i6 = 1; i6 < V; i6++) {
            if (iArr2[i6 - 1][1] != iArr2[i6][0]) {
                return false;
            }
        }
        int[] iArr5 = iArr2[0];
        int i7 = iArr5[1];
        int i8 = iArr5[0];
        int i9 = i7 - i8;
        if (i8 > 0 || iArr2[V - 1][1] < i9) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m7610b() {
        int V = this.f5836a.mo5660V();
        for (int i = 0; i < V; i++) {
            if (m7611c(this.f5836a.mo5658U(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m7611c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m7611c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo6656d() {
        if ((!m7609a() || this.f5836a.mo5660V() <= 1) && m7610b()) {
            return true;
        }
        return false;
    }
}
