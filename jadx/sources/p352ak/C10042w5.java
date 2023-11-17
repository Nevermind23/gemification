package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import p086g1.C6201a;
import p601sg.C17783h;

/* renamed from: ak.w5 */
public final class C10042w5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27705d;

    /* renamed from: e */
    public final AppCompatTextView f27706e;

    /* renamed from: f */
    public final C10021t5 f27707f;

    /* renamed from: g */
    public final LottieAnimationView f27708g;

    /* renamed from: h */
    public final AppCompatTextView f27709h;

    private C10042w5(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, C10021t5 t5Var, LottieAnimationView lottieAnimationView, AppCompatTextView appCompatTextView2) {
        this.f27705d = constraintLayout;
        this.f27706e = appCompatTextView;
        this.f27707f = t5Var;
        this.f27708g = lottieAnimationView;
        this.f27709h = appCompatTextView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = p601sg.C17782g.f49696J2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C10042w5 m36832a(android.view.View r8) {
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
            ak.w5 r0 = new ak.w5
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
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C10042w5.m36832a(android.view.View):ak.w5");
    }

    /* renamed from: d */
    public static C10042w5 m36833d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_image_card_large, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36832a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27705d;
    }
}
