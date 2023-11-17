package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p90.C27272c8;

/* renamed from: ue0.r */
public final class C28748r implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73431d;

    /* renamed from: e */
    public final CreditCardSmallPickerView f73432e;

    /* renamed from: f */
    public final Button f73433f;

    /* renamed from: g */
    public final TextView f73434g;

    /* renamed from: h */
    public final TextView f73435h;

    /* renamed from: i */
    public final RelativeLayout f73436i;

    /* renamed from: j */
    public final TextView f73437j;

    /* renamed from: k */
    public final TextView f73438k;

    /* renamed from: l */
    public final StateView f73439l;

    /* renamed from: m */
    public final LinearLayout f73440m;

    /* renamed from: n */
    public final RelativeLayout f73441n;

    /* renamed from: o */
    public final BigInputView f73442o;

    /* renamed from: p */
    public final LoadingView f73443p;

    /* renamed from: q */
    public final NumericKeyboardView f73444q;

    /* renamed from: r */
    public final View f73445r;

    /* renamed from: s */
    public final View f73446s;

    /* renamed from: t */
    public final C27272c8 f73447t;

    private C28748r(ConstraintLayout constraintLayout, CreditCardSmallPickerView creditCardSmallPickerView, Button button, TextView textView, TextView textView2, RelativeLayout relativeLayout, TextView textView3, TextView textView4, StateView stateView, LinearLayout linearLayout, RelativeLayout relativeLayout2, BigInputView bigInputView, LoadingView loadingView, NumericKeyboardView numericKeyboardView, View view, View view2, C27272c8 c8Var) {
        this.f73431d = constraintLayout;
        this.f73432e = creditCardSmallPickerView;
        this.f73433f = button;
        this.f73434g = textView;
        this.f73435h = textView2;
        this.f73436i = relativeLayout;
        this.f73437j = textView3;
        this.f73438k = textView4;
        this.f73439l = stateView;
        this.f73440m = linearLayout;
        this.f73441n = relativeLayout2;
        this.f73442o = bigInputView;
        this.f73443p = loadingView;
        this.f73444q = numericKeyboardView;
        this.f73445r = view;
        this.f73446s = view2;
        this.f73447t = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        r1 = ie0.C25187g.f64673G3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        r1 = ie0.C25187g.separatorBottom;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        r1 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28748r m88118a(android.view.View r21) {
        /*
            r0 = r21
            int r1 = ie0.C25187g.accountSelector
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView r5 = (p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView) r5
            if (r5 == 0) goto L_0x00b9
            int r1 = ie0.C25187g.f64700i
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.buttons.Button r6 = (p341ge.bog.designsystem.components.buttons.Button) r6
            if (r6 == 0) goto L_0x00b9
            int r1 = ie0.C25187g.availableCashTitle
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x00b9
            int r1 = ie0.C25187g.availableCashValue
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x00b9
            int r1 = ie0.C25187g.buyingPowerCon
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            if (r9 == 0) goto L_0x00b9
            int r1 = ie0.C25187g.buyingPowerTitle
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x00b9
            int r1 = ie0.C25187g.buyingPowerValue
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x00b9
            int r1 = ie0.C25187g.cashDataState
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r12 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r12
            if (r12 == 0) goto L_0x00b9
            int r1 = ie0.C25187g.f64670E0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            if (r13 == 0) goto L_0x00b9
            int r1 = ie0.C25187g.freeCashCon
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            android.widget.RelativeLayout r14 = (android.widget.RelativeLayout) r14
            if (r14 == 0) goto L_0x00b9
            int r1 = ie0.C25187g.inputView
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.biginput.BigInputView r15 = (p341ge.bog.designsystem.components.biginput.BigInputView) r15
            if (r15 == 0) goto L_0x00b9
            int r1 = ie0.C25187g.f64702j2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.loading.LoadingView r16 = (p341ge.bog.designsystem.components.loading.LoadingView) r16
            if (r16 == 0) goto L_0x00b9
            int r1 = ie0.C25187g.numericKeyboardView
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView r17 = (p341ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView) r17
            if (r17 == 0) goto L_0x00b9
            int r1 = ie0.C25187g.f64673G3
            android.view.View r18 = p086g1.C6202b.m24689a(r0, r1)
            if (r18 == 0) goto L_0x00b9
            int r1 = ie0.C25187g.separatorBottom
            android.view.View r19 = p086g1.C6202b.m24689a(r0, r1)
            if (r19 == 0) goto L_0x00b9
            int r1 = ie0.C25187g.f64733z4
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00b9
            p90.c8 r20 = p90.C27272c8.m84388a(r2)
            ue0.r r1 = new ue0.r
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x00b9:
            android.content.res.Resources r0 = r21.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28748r.m88118a(android.view.View):ue0.r");
    }

    /* renamed from: d */
    public static C28748r m88119d(LayoutInflater layoutInflater) {
        return m88120e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28748r m88120e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt_exchange, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88118a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73431d;
    }
}
