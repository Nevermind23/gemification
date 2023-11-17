package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10324m;

/* renamed from: p90.i4 */
public final class C27328i4 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68974d;

    /* renamed from: e */
    public final View f68975e;

    /* renamed from: f */
    public final View f68976f;

    /* renamed from: g */
    public final FrameLayout f68977g;

    /* renamed from: h */
    public final LinearLayout f68978h;

    /* renamed from: i */
    public final Switch f68979i;

    /* renamed from: j */
    public final View f68980j;

    /* renamed from: k */
    public final BogTextView f68981k;

    /* renamed from: l */
    public final C27252a8 f68982l;

    /* renamed from: m */
    public final RelativeLayout f68983m;

    private C27328i4(LinearLayout linearLayout, View view, View view2, FrameLayout frameLayout, LinearLayout linearLayout2, Switch switchR, View view3, BogTextView bogTextView, C27252a8 a8Var, RelativeLayout relativeLayout) {
        this.f68974d = linearLayout;
        this.f68975e = view;
        this.f68976f = view2;
        this.f68977g = frameLayout;
        this.f68978h = linearLayout2;
        this.f68979i = switchR;
        this.f68980j = view3;
        this.f68981k = bogTextView;
        this.f68982l = a8Var;
        this.f68983m = relativeLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r0 = p366bk.C10322k.language_divider;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        r0 = p366bk.C10322k.sms_contact_list_item;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = p366bk.C10322k.bottom_view;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27328i4 m84621a(android.view.View r12) {
        /*
            int r0 = p366bk.C10322k.f28891s4
            android.view.View r3 = p086g1.C6202b.m24689a(r12, r0)
            if (r3 == 0) goto L_0x0065
            int r0 = p366bk.C10322k.bottom_view
            android.view.View r4 = p086g1.C6202b.m24689a(r12, r0)
            if (r4 == 0) goto L_0x0065
            int r0 = p366bk.C10322k.change_language_container
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r5 = r1
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            if (r5 == 0) goto L_0x0065
            int r0 = p366bk.C10322k.contact_group_type_container
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r6 = r1
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L_0x0065
            int r0 = p366bk.C10322k.contact_switch
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r7 = r1
            android.widget.Switch r7 = (android.widget.Switch) r7
            if (r7 == 0) goto L_0x0065
            int r0 = p366bk.C10322k.language_divider
            android.view.View r8 = p086g1.C6202b.m24689a(r12, r0)
            if (r8 == 0) goto L_0x0065
            int r0 = p366bk.C10322k.f28900up
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r9 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r9 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r9
            if (r9 == 0) goto L_0x0065
            int r0 = p366bk.C10322k.sms_contact_list_item
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            if (r1 == 0) goto L_0x0065
            p90.a8 r10 = p90.C27252a8.m84306a(r1)
            int r0 = p366bk.C10322k.switch_wrapper
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r11 = r1
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            if (r11 == 0) goto L_0x0065
            p90.i4 r0 = new p90.i4
            r2 = r12
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0065:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27328i4.m84621a(android.view.View):p90.i4");
    }

    /* renamed from: d */
    public static C27328i4 m84622d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_sms_contact_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84621a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68974d;
    }
}
