package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.flexbox.FlexboxLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.timer.TimerView;
import p601sg.C17783h;

/* renamed from: ak.x5 */
public final class C10049x5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27754d;

    /* renamed from: e */
    public final FlexboxLayout f27755e;

    /* renamed from: f */
    public final AppCompatTextView f27756f;

    /* renamed from: g */
    public final C10021t5 f27757g;

    /* renamed from: h */
    public final LottieAnimationView f27758h;

    /* renamed from: i */
    public final TimerView f27759i;

    private C10049x5(ConstraintLayout constraintLayout, FlexboxLayout flexboxLayout, AppCompatTextView appCompatTextView, C10021t5 t5Var, LottieAnimationView lottieAnimationView, TimerView timerView) {
        this.f27754d = constraintLayout;
        this.f27755e = flexboxLayout;
        this.f27756f = appCompatTextView;
        this.f27757g = t5Var;
        this.f27758h = lottieAnimationView;
        this.f27759i = timerView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = p601sg.C17782g.f49696J2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C10049x5 m36858a(android.view.View r9) {
        /*
            int r0 = p601sg.C17782g.f49748a0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            com.google.android.flexbox.FlexboxLayout r4 = (com.google.android.flexbox.FlexboxLayout) r4
            if (r4 == 0) goto L_0x0042
            int r0 = p601sg.C17782g.f49677C2
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            if (r5 == 0) goto L_0x0042
            int r0 = p601sg.C17782g.f49696J2
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0042
            ak.t5 r6 = p352ak.C10021t5.m36755a(r1)
            int r0 = p601sg.C17782g.f49787r4
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            com.airbnb.lottie.LottieAnimationView r7 = (com.airbnb.lottie.LottieAnimationView) r7
            if (r7 == 0) goto L_0x0042
            int r0 = p601sg.C17782g.f49735V8
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r8 = r1
            ge.bog.designsystem.components.timer.TimerView r8 = (p341ge.bog.designsystem.components.timer.TimerView) r8
            if (r8 == 0) goto L_0x0042
            ak.x5 r0 = new ak.x5
            r3 = r9
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0042:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C10049x5.m36858a(android.view.View):ak.x5");
    }

    /* renamed from: d */
    public static C10049x5 m36859d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_image_card_small, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36858a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27754d;
    }
}
