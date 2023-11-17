package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import p086g1.C6201a;
import p601sg.C17783h;

/* renamed from: ak.b6 */
public final class C9882b6 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f26823d;

    /* renamed from: e */
    public final AppCompatTextView f26824e;

    /* renamed from: f */
    public final C10021t5 f26825f;

    /* renamed from: g */
    public final LottieAnimationView f26826g;

    private C9882b6(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, C10021t5 t5Var, LottieAnimationView lottieAnimationView) {
        this.f26823d = constraintLayout;
        this.f26824e = appCompatTextView;
        this.f26825f = t5Var;
        this.f26826g = lottieAnimationView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = p601sg.C17782g.f49696J2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C9882b6 m36245a(android.view.View r4) {
        /*
            int r0 = p601sg.C17782g.f49677C2
            android.view.View r1 = p086g1.C6202b.m24689a(r4, r0)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            if (r1 == 0) goto L_0x0029
            int r0 = p601sg.C17782g.f49696J2
            android.view.View r2 = p086g1.C6202b.m24689a(r4, r0)
            if (r2 == 0) goto L_0x0029
            ak.t5 r0 = p352ak.C10021t5.m36755a(r2)
            int r2 = p601sg.C17782g.f49787r4
            android.view.View r3 = p086g1.C6202b.m24689a(r4, r2)
            com.airbnb.lottie.LottieAnimationView r3 = (com.airbnb.lottie.LottieAnimationView) r3
            if (r3 == 0) goto L_0x0028
            ak.b6 r2 = new ak.b6
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r2.<init>(r4, r1, r0, r3)
            return r2
        L_0x0028:
            r0 = r2
        L_0x0029:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C9882b6.m36245a(android.view.View):ak.b6");
    }

    /* renamed from: d */
    public static C9882b6 m36246d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_image_cards_square_text, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36245a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f26823d;
    }
}
