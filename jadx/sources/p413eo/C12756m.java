package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.input.Input;
import p356ao.C10115g;
import p90.C27486z7;

/* renamed from: eo.m */
public final class C12756m implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f37781d;

    /* renamed from: e */
    public final Button f37782e;

    /* renamed from: f */
    public final ChipGroup f37783f;

    /* renamed from: g */
    public final TextView f37784g;

    /* renamed from: h */
    public final View f37785h;

    /* renamed from: i */
    public final LinearLayout f37786i;

    /* renamed from: j */
    public final Input f37787j;

    /* renamed from: k */
    public final FrameLayout f37788k;

    /* renamed from: l */
    public final C27486z7 f37789l;

    /* renamed from: m */
    public final CardView f37790m;

    private C12756m(ConstraintLayout constraintLayout, Button button, ChipGroup chipGroup, TextView textView, View view, LinearLayout linearLayout, Input input, FrameLayout frameLayout, C27486z7 z7Var, CardView cardView) {
        this.f37781d = constraintLayout;
        this.f37782e = button;
        this.f37783f = chipGroup;
        this.f37784g = textView;
        this.f37785h = view;
        this.f37786i = linearLayout;
        this.f37787j = input;
        this.f37788k = frameLayout;
        this.f37789l = z7Var;
        this.f37790m = cardView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        r0 = p356ao.C10114f.f27955g1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = p356ao.C10114f.f27944Y;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p413eo.C12756m m48418a(android.view.View r13) {
        /*
            int r0 = p356ao.C10114f.add_info_button
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x006b
            int r0 = p356ao.C10114f.f27930M
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r5 = r1
            ge.bog.designsystem.components.chips.ChipGroup r5 = (p341ge.bog.designsystem.components.chips.ChipGroup) r5
            if (r5 == 0) goto L_0x006b
            int r0 = p356ao.C10114f.f27939T
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x006b
            int r0 = p356ao.C10114f.f27944Y
            android.view.View r7 = p086g1.C6202b.m24689a(r13, r0)
            if (r7 == 0) goto L_0x006b
            int r0 = p356ao.C10114f.f27976w0
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r8 = r1
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x006b
            int r0 = p356ao.C10114f.monthly_income_input
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r9 = r1
            ge.bog.designsystem.components.input.Input r9 = (p341ge.bog.designsystem.components.input.Input) r9
            if (r9 == 0) goto L_0x006b
            int r0 = p356ao.C10114f.f27943X0
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r10 = r1
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            if (r10 == 0) goto L_0x006b
            int r0 = p356ao.C10114f.f27955g1
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            if (r1 == 0) goto L_0x006b
            p90.z7 r11 = p90.C27486z7.m85250a(r1)
            int r0 = p356ao.C10114f.f27957h1
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r12 = r1
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            if (r12 == 0) goto L_0x006b
            eo.m r0 = new eo.m
            r3 = r13
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x006b:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p413eo.C12756m.m48418a(android.view.View):eo.m");
    }

    /* renamed from: d */
    public static C12756m m48419d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.fragment_financial_info_amount, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48418a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f37781d;
    }
}
