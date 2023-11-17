package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p366bk.C10324m;

/* renamed from: p90.b */
public final class C27253b implements C6201a {

    /* renamed from: d */
    private final ScrollView f68334d;

    /* renamed from: e */
    public final BogButton f68335e;

    /* renamed from: f */
    public final ConstraintLayout f68336f;

    /* renamed from: g */
    public final InlineFeedback f68337g;

    /* renamed from: h */
    public final CardView f68338h;

    /* renamed from: i */
    public final RadioGroup f68339i;

    /* renamed from: j */
    public final C27486z7 f68340j;

    /* renamed from: k */
    public final CardView f68341k;

    private C27253b(ScrollView scrollView, BogButton bogButton, ConstraintLayout constraintLayout, InlineFeedback inlineFeedback, CardView cardView, RadioGroup radioGroup, C27486z7 z7Var, CardView cardView2) {
        this.f68334d = scrollView;
        this.f68335e = bogButton;
        this.f68336f = constraintLayout;
        this.f68337g = inlineFeedback;
        this.f68338h = cardView;
        this.f68339i = radioGroup;
        this.f68340j = z7Var;
        this.f68341k = cardView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = p366bk.C10322k.f28774Ns;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27253b m84309a(android.view.View r11) {
        /*
            int r0 = p366bk.C10322k.f28911y8
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            ge.bog.mobilebank.ui.views.widgets.BogButton r4 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogButton) r4
            if (r4 == 0) goto L_0x0058
            int r0 = p366bk.C10322k.constraint_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            if (r5 == 0) goto L_0x0058
            int r0 = p366bk.C10322k.f28873nh
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r6 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r6
            if (r6 == 0) goto L_0x0058
            int r0 = p366bk.C10322k.f28719Dq
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            androidx.cardview.widget.CardView r7 = (androidx.cardview.widget.CardView) r7
            if (r7 == 0) goto L_0x0058
            int r0 = p366bk.C10322k.radio_button_group
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            android.widget.RadioGroup r8 = (android.widget.RadioGroup) r8
            if (r8 == 0) goto L_0x0058
            int r0 = p366bk.C10322k.f28774Ns
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x0058
            p90.z7 r9 = p90.C27486z7.m85250a(r1)
            int r0 = p366bk.C10322k.f28799Us
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r10 = r1
            androidx.cardview.widget.CardView r10 = (androidx.cardview.widget.CardView) r10
            if (r10 == 0) goto L_0x0058
            p90.b r0 = new p90.b
            r3 = r11
            android.widget.ScrollView r3 = (android.widget.ScrollView) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0058:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27253b.m84309a(android.view.View):p90.b");
    }

    /* renamed from: d */
    public static C27253b m84310d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.action_sheet_installment_reversal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84309a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f68334d;
    }
}
