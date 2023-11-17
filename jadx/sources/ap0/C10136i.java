package ap0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import wo0.C18653c;

/* renamed from: ap0.i */
public final class C10136i implements C6201a {

    /* renamed from: d */
    private final LayerView f28105d;

    /* renamed from: e */
    public final ImageView f28106e;

    /* renamed from: f */
    public final View f28107f;

    /* renamed from: g */
    public final LinearLayout f28108g;

    /* renamed from: h */
    public final Button f28109h;

    /* renamed from: i */
    public final TextView f28110i;

    /* renamed from: j */
    public final ImageView f28111j;

    /* renamed from: k */
    public final Button f28112k;

    /* renamed from: l */
    public final TextView f28113l;

    /* renamed from: m */
    public final Button f28114m;

    /* renamed from: n */
    public final TextView f28115n;

    /* renamed from: o */
    public final View f28116o;

    private C10136i(LayerView layerView, ImageView imageView, View view, LinearLayout linearLayout, Button button, TextView textView, ImageView imageView2, Button button2, TextView textView2, Button button3, TextView textView3, View view2) {
        this.f28105d = layerView;
        this.f28106e = imageView;
        this.f28107f = view;
        this.f28108g = linearLayout;
        this.f28109h = button;
        this.f28110i = textView;
        this.f28111j = imageView2;
        this.f28112k = button2;
        this.f28113l = textView2;
        this.f28114m = button3;
        this.f28115n = textView3;
        this.f28116o = view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        r0 = wo0.C18652b.f52250c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = wo0.C18652b.f52252h;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ap0.C10136i m37072a(android.view.View r15) {
        /*
            int r0 = wo0.C18652b.f52251g
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r4 = r1
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L_0x007d
            int r0 = wo0.C18652b.f52252h
            android.view.View r5 = p086g1.C6202b.m24689a(r15, r0)
            if (r5 == 0) goto L_0x007d
            int r0 = wo0.C18652b.f52254n
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r6 = r1
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L_0x007d
            int r0 = wo0.C18652b.f52255r
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r7 = r1
            ge.bog.designsystem.components.buttons.Button r7 = (p341ge.bog.designsystem.components.buttons.Button) r7
            if (r7 == 0) goto L_0x007d
            int r0 = wo0.C18652b.description_tv
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x007d
            int r0 = wo0.C18652b.illustration_image
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r9 = r1
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r9 == 0) goto L_0x007d
            int r0 = wo0.C18652b.f52245I
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r10 = r1
            ge.bog.designsystem.components.buttons.Button r10 = (p341ge.bog.designsystem.components.buttons.Button) r10
            if (r10 == 0) goto L_0x007d
            int r0 = wo0.C18652b.nickname_tv
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x007d
            int r0 = wo0.C18652b.f52247U
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r12 = r1
            ge.bog.designsystem.components.buttons.Button r12 = (p341ge.bog.designsystem.components.buttons.Button) r12
            if (r12 == 0) goto L_0x007d
            int r0 = wo0.C18652b.f52248a0
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r13 = r1
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L_0x007d
            int r0 = wo0.C18652b.f52250c0
            android.view.View r14 = p086g1.C6202b.m24689a(r15, r0)
            if (r14 == 0) goto L_0x007d
            ap0.i r0 = new ap0.i
            r3 = r15
            ge.bog.designsystem.components.layersandshadows.LayerView r3 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x007d:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ap0.C10136i.m37072a(android.view.View):ap0.i");
    }

    /* renamed from: d */
    public static C10136i m37073d(LayoutInflater layoutInflater) {
        return m37074e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C10136i m37074e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18653c.p2p_check_dialog_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37072a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f28105d;
    }
}
