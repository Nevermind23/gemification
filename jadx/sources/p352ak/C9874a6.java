package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import p086g1.C6201a;
import p601sg.C17783h;

/* renamed from: ak.a6 */
public final class C9874a6 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f26777d;

    /* renamed from: e */
    public final AppCompatTextView f26778e;

    /* renamed from: f */
    public final C10021t5 f26779f;

    /* renamed from: g */
    public final LottieAnimationView f26780g;

    /* renamed from: h */
    public final AppCompatTextView f26781h;

    private C9874a6(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, C10021t5 t5Var, LottieAnimationView lottieAnimationView, AppCompatTextView appCompatTextView2) {
        this.f26777d = constraintLayout;
        this.f26778e = appCompatTextView;
        this.f26779f = t5Var;
        this.f26780g = lottieAnimationView;
        this.f26781h = appCompatTextView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = p601sg.C17782g.f49696J2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C9874a6 m36216a(android.view.View r8) {
        /*
            int r0 = p601sg.C17782g.f49677C2
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            if (r4 == 0) goto L_0x0037
            int r0 = p601sg.C17782g.f49696J2
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0037
            ak.t5 r5 = p352ak.C10021t5.m36755a(r1)
            int r0 = p601sg.C17782g.f49787r4
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r6 = r1
            com.airbnb.lottie.LottieAnimationView r6 = (com.airbnb.lottie.LottieAnimationView) r6
            if (r6 == 0) goto L_0x0037
            int r0 = p601sg.C17782g.f49816z8
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r7 = r1
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            if (r7 == 0) goto L_0x0037
            ak.a6 r0 = new ak.a6
            r3 = r8
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0037:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C9874a6.m36216a(android.view.View):ak.a6");
    }

    /* renamed from: d */
    public static C9874a6 m36217d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_image_cards_square_highlight, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36216a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f26777d;
    }
}
