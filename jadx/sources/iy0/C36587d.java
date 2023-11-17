package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p90.C27486z7;

/* renamed from: iy0.d */
public final class C36587d implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88165d;

    /* renamed from: e */
    public final Button f88166e;

    /* renamed from: f */
    public final TextView f88167f;

    /* renamed from: g */
    public final View f88168g;

    /* renamed from: h */
    public final CardView f88169h;

    /* renamed from: i */
    public final C27486z7 f88170i;

    /* renamed from: j */
    public final CardView f88171j;

    /* renamed from: k */
    public final NestedScrollView f88172k;

    private C36587d(ConstraintLayout constraintLayout, Button button, TextView textView, View view, CardView cardView, C27486z7 z7Var, CardView cardView2, NestedScrollView nestedScrollView) {
        this.f88165d = constraintLayout;
        this.f88166e = button;
        this.f88167f = textView;
        this.f88168g = view;
        this.f88169h = cardView;
        this.f88170i = z7Var;
        this.f88171j = cardView2;
        this.f88172k = nestedScrollView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = hy0.C36271e.f87516f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        r0 = hy0.C36271e.f87509b2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static iy0.C36587d m108474a(android.view.View r11) {
        /*
            int r0 = hy0.C36271e.f87498T
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x0055
            int r0 = hy0.C36271e.f87499U
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0055
            int r0 = hy0.C36271e.f87516f0
            android.view.View r6 = p086g1.C6202b.m24689a(r11, r0)
            if (r6 == 0) goto L_0x0055
            int r0 = hy0.C36271e.f87500U1
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            androidx.cardview.widget.CardView r7 = (androidx.cardview.widget.CardView) r7
            if (r7 == 0) goto L_0x0055
            int r0 = hy0.C36271e.f87509b2
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x0055
            p90.z7 r8 = p90.C27486z7.m85250a(r1)
            int r0 = hy0.C36271e.f87510c2
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            androidx.cardview.widget.CardView r9 = (androidx.cardview.widget.CardView) r9
            if (r9 == 0) goto L_0x0055
            int r0 = hy0.C36271e.scroll_View
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r10 = r1
            androidx.core.widget.NestedScrollView r10 = (androidx.core.widget.NestedScrollView) r10
            if (r10 == 0) goto L_0x0055
            iy0.d r0 = new iy0.d
            r3 = r11
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0055:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C36587d.m108474a(android.view.View):iy0.d");
    }

    /* renamed from: d */
    public static C36587d m108475d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.action_sheet_child_mbank_contract, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108474a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88165d;
    }
}
