package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import p086g1.C6201a;
import p601sg.C17783h;

/* renamed from: ak.z5 */
public final class C10063z5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27822d;

    /* renamed from: e */
    public final Barrier f27823e;

    /* renamed from: f */
    public final AppCompatTextView f27824f;

    /* renamed from: g */
    public final AppCompatTextView f27825g;

    /* renamed from: h */
    public final C10021t5 f27826h;

    /* renamed from: i */
    public final LottieAnimationView f27827i;

    /* renamed from: j */
    public final C9896d4 f27828j;

    /* renamed from: k */
    public final AppCompatTextView f27829k;

    private C10063z5(ConstraintLayout constraintLayout, Barrier barrier, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, C10021t5 t5Var, LottieAnimationView lottieAnimationView, C9896d4 d4Var, AppCompatTextView appCompatTextView3) {
        this.f27822d = constraintLayout;
        this.f27823e = barrier;
        this.f27824f = appCompatTextView;
        this.f27825g = appCompatTextView2;
        this.f27826h = t5Var;
        this.f27827i = lottieAnimationView;
        this.f27828j = d4Var;
        this.f27829k = appCompatTextView3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        r0 = p601sg.C17782g.new_badge_view;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = p601sg.C17782g.f49696J2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C10063z5 m36911a(android.view.View r11) {
        /*
            int r0 = p601sg.C17782g.f49760g0
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            androidx.constraintlayout.widget.Barrier r4 = (androidx.constraintlayout.widget.Barrier) r4
            if (r4 == 0) goto L_0x0059
            int r0 = p601sg.C17782g.f49727T0
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            if (r5 == 0) goto L_0x0059
            int r0 = p601sg.C17782g.f49677C2
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            if (r6 == 0) goto L_0x0059
            int r0 = p601sg.C17782g.f49696J2
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x0059
            ak.t5 r7 = p352ak.C10021t5.m36755a(r1)
            int r0 = p601sg.C17782g.f49787r4
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            com.airbnb.lottie.LottieAnimationView r8 = (com.airbnb.lottie.LottieAnimationView) r8
            if (r8 == 0) goto L_0x0059
            int r0 = p601sg.C17782g.new_badge_view
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x0059
            ak.d4 r9 = p352ak.C9896d4.m36298a(r1)
            int r0 = p601sg.C17782g.f49816z8
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r10 = r1
            androidx.appcompat.widget.AppCompatTextView r10 = (androidx.appcompat.widget.AppCompatTextView) r10
            if (r10 == 0) goto L_0x0059
            ak.z5 r0 = new ak.z5
            r3 = r11
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0059:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C10063z5.m36911a(android.view.View):ak.z5");
    }

    /* renamed from: d */
    public static C10063z5 m36912d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_image_card_wide, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36911a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27822d;
    }
}
