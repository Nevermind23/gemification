package yj0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import tj0.C28444b;

/* renamed from: yj0.c */
public final class C30081c implements C6201a {

    /* renamed from: d */
    private final LayerView f75906d;

    /* renamed from: e */
    public final FrameLayout f75907e;

    /* renamed from: f */
    public final View f75908f;

    /* renamed from: g */
    public final PageDescriptionView f75909g;

    /* renamed from: h */
    public final LottieAnimationView f75910h;

    /* renamed from: i */
    public final Button f75911i;

    private C30081c(LayerView layerView, FrameLayout frameLayout, View view, PageDescriptionView pageDescriptionView, LottieAnimationView lottieAnimationView, Button button) {
        this.f75906d = layerView;
        this.f75907e = frameLayout;
        this.f75908f = view;
        this.f75909g = pageDescriptionView;
        this.f75910h = lottieAnimationView;
        this.f75911i = button;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = tj0.C28443a.f72243b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static yj0.C30081c m91050a(android.view.View r9) {
        /*
            int r0 = tj0.C28443a.f72242a
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            if (r4 == 0) goto L_0x003e
            int r0 = tj0.C28443a.f72243b
            android.view.View r5 = p086g1.C6202b.m24689a(r9, r0)
            if (r5 == 0) goto L_0x003e
            int r0 = tj0.C28443a.google_pay_description
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r6 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r6 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r6
            if (r6 == 0) goto L_0x003e
            int r0 = tj0.C28443a.f72244e
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            com.airbnb.lottie.LottieAnimationView r7 = (com.airbnb.lottie.LottieAnimationView) r7
            if (r7 == 0) goto L_0x003e
            int r0 = tj0.C28443a.no_button
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r8 = r1
            ge.bog.designsystem.components.buttons.Button r8 = (p341ge.bog.designsystem.components.buttons.Button) r8
            if (r8 == 0) goto L_0x003e
            yj0.c r0 = new yj0.c
            r3 = r9
            ge.bog.designsystem.components.layersandshadows.LayerView r3 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x003e:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yj0.C30081c.m91050a(android.view.View):yj0.c");
    }

    /* renamed from: d */
    public static C30081c m91051d(LayoutInflater layoutInflater) {
        return m91052e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C30081c m91052e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28444b.fragment_google_pay_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m91050a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f75906d;
    }
}
