package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p90.C27272c8;
import rs0.C38337d;

/* renamed from: vs0.b */
public final class C39443b implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f93680d;

    /* renamed from: e */
    public final FixedButtonView f93681e;

    /* renamed from: f */
    public final View f93682f;

    /* renamed from: g */
    public final ConstraintLayout f93683g;

    /* renamed from: h */
    public final AppCompatTextView f93684h;

    /* renamed from: i */
    public final FragmentContainerView f93685i;

    /* renamed from: j */
    public final Button f93686j;

    /* renamed from: k */
    public final C27272c8 f93687k;

    private C39443b(ConstraintLayout constraintLayout, FixedButtonView fixedButtonView, View view, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, FragmentContainerView fragmentContainerView, Button button, C27272c8 c8Var) {
        this.f93680d = constraintLayout;
        this.f93681e = fixedButtonView;
        this.f93682f = view;
        this.f93683g = constraintLayout2;
        this.f93684h = appCompatTextView;
        this.f93685i = fragmentContainerView;
        this.f93686j = button;
        this.f93687k = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r0 = rs0.C38336c.f91897w1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = rs0.C38336c.f91857L;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static vs0.C39443b m114621a(android.view.View r11) {
        /*
            int r0 = rs0.C38336c.f91874h
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r4 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonView) r4
            if (r4 == 0) goto L_0x0055
            int r0 = rs0.C38336c.f91857L
            android.view.View r5 = p086g1.C6202b.m24689a(r11, r0)
            if (r5 == 0) goto L_0x0055
            int r0 = rs0.C38336c.f91859P
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            if (r6 == 0) goto L_0x0055
            int r0 = rs0.C38336c.f91861R
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            if (r7 == 0) goto L_0x0055
            int r0 = rs0.C38336c.f91863X
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            androidx.fragment.app.FragmentContainerView r8 = (androidx.fragment.app.FragmentContainerView) r8
            if (r8 == 0) goto L_0x0055
            int r0 = rs0.C38336c.f91881m1
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            ge.bog.designsystem.components.buttons.Button r9 = (p341ge.bog.designsystem.components.buttons.Button) r9
            if (r9 == 0) goto L_0x0055
            int r0 = rs0.C38336c.f91897w1
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x0055
            p90.c8 r10 = p90.C27272c8.m84388a(r1)
            vs0.b r0 = new vs0.b
            r3 = r11
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0055:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vs0.C39443b.m114621a(android.view.View):vs0.b");
    }

    /* renamed from: d */
    public static C39443b m114622d(LayoutInflater layoutInflater) {
        return m114623e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C39443b m114623e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.activity_create_piggy_bank, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114621a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f93680d;
    }
}
