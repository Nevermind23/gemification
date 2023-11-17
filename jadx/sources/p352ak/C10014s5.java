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

/* renamed from: ak.s5 */
public final class C10014s5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27542d;

    /* renamed from: e */
    public final FlexboxLayout f27543e;

    /* renamed from: f */
    public final AppCompatTextView f27544f;

    /* renamed from: g */
    public final C10021t5 f27545g;

    /* renamed from: h */
    public final LottieAnimationView f27546h;

    /* renamed from: i */
    public final TimerView f27547i;

    private C10014s5(ConstraintLayout constraintLayout, FlexboxLayout flexboxLayout, AppCompatTextView appCompatTextView, C10021t5 t5Var, LottieAnimationView lottieAnimationView, TimerView timerView) {
        this.f27542d = constraintLayout;
        this.f27543e = flexboxLayout;
        this.f27544f = appCompatTextView;
        this.f27545g = t5Var;
        this.f27546h = lottieAnimationView;
        this.f27547i = timerView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = p601sg.C17782g.f49696J2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C10014s5 m36729a(android.view.View r9) {
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
            ak.s5 r0 = new ak.s5
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
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C10014s5.m36729a(android.view.View):ak.s5");
    }

    /* renamed from: d */
    public static C10014s5 m36730d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_image_card_big, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36729a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27542d;
    }
}
