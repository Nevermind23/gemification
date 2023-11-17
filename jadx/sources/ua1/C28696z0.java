package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import ba1.C10217v;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: ua1.z0 */
public final class C28696z0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73068d;

    /* renamed from: e */
    public final Guideline f73069e;

    /* renamed from: f */
    public final View f73070f;

    /* renamed from: g */
    public final TextView f73071g;

    /* renamed from: h */
    public final AppCompatTextView f73072h;

    /* renamed from: i */
    public final LayerView f73073i;

    /* renamed from: j */
    public final Guideline f73074j;

    /* renamed from: k */
    public final TextView f73075k;

    /* renamed from: l */
    public final Button f73076l;

    /* renamed from: m */
    public final Group f73077m;

    /* renamed from: n */
    public final Guideline f73078n;

    /* renamed from: o */
    public final CheckboxView f73079o;

    /* renamed from: p */
    public final Button f73080p;

    /* renamed from: q */
    public final Guideline f73081q;

    /* renamed from: r */
    public final Input f73082r;

    private C28696z0(ConstraintLayout constraintLayout, Guideline guideline, View view, TextView textView, AppCompatTextView appCompatTextView, LayerView layerView, Guideline guideline2, TextView textView2, Button button, Group group, Guideline guideline3, CheckboxView checkboxView, Button button2, Guideline guideline4, Input input) {
        this.f73068d = constraintLayout;
        this.f73069e = guideline;
        this.f73070f = view;
        this.f73071g = textView;
        this.f73072h = appCompatTextView;
        this.f73073i = layerView;
        this.f73074j = guideline2;
        this.f73075k = textView2;
        this.f73076l = button;
        this.f73077m = group;
        this.f73078n = guideline3;
        this.f73079o = checkboxView;
        this.f73080p = button2;
        this.f73081q = guideline4;
        this.f73082r = input;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = ba1.C10216u.bottom_spacing;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ua1.C28696z0 m87904a(android.view.View r19) {
        /*
            r0 = r19
            int r1 = ba1.C10216u.bottom_guideLine
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            androidx.constraintlayout.widget.Guideline r5 = (androidx.constraintlayout.widget.Guideline) r5
            if (r5 == 0) goto L_0x00a6
            int r1 = ba1.C10216u.bottom_spacing
            android.view.View r6 = p086g1.C6202b.m24689a(r0, r1)
            if (r6 == 0) goto L_0x00a6
            int r1 = ba1.C10216u.forgot_credentials
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x00a6
            int r1 = ba1.C10216u.f28311W0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            if (r8 == 0) goto L_0x00a6
            int r1 = ba1.C10216u.f28325g1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r9 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r9
            if (r9 == 0) goto L_0x00a6
            int r1 = ba1.C10216u.left_guideline
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            androidx.constraintlayout.widget.Guideline r10 = (androidx.constraintlayout.widget.Guideline) r10
            if (r10 == 0) goto L_0x00a6
            int r1 = ba1.C10216u.not_registered_label
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x00a6
            int r1 = ba1.C10216u.register
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.buttons.Button r12 = (p341ge.bog.designsystem.components.buttons.Button) r12
            if (r12 == 0) goto L_0x00a6
            int r1 = ba1.C10216u.register_group
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.constraintlayout.widget.Group r13 = (androidx.constraintlayout.widget.Group) r13
            if (r13 == 0) goto L_0x00a6
            int r1 = ba1.C10216u.right_guideline
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            androidx.constraintlayout.widget.Guideline r14 = (androidx.constraintlayout.widget.Guideline) r14
            if (r14 == 0) goto L_0x00a6
            int r1 = ba1.C10216u.save_me_checkbox
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.checkbox.CheckboxView r15 = (p341ge.bog.designsystem.components.checkbox.CheckboxView) r15
            if (r15 == 0) goto L_0x00a6
            int r1 = ba1.C10216u.submit
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.buttons.Button r16 = (p341ge.bog.designsystem.components.buttons.Button) r16
            if (r16 == 0) goto L_0x00a6
            int r1 = ba1.C10216u.f28330h3
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            androidx.constraintlayout.widget.Guideline r17 = (androidx.constraintlayout.widget.Guideline) r17
            if (r17 == 0) goto L_0x00a6
            int r1 = ba1.C10216u.user_name_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.input.Input r18 = (p341ge.bog.designsystem.components.input.Input) r18
            if (r18 == 0) goto L_0x00a6
            ua1.z0 r1 = new ua1.z0
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
        L_0x00a6:
            android.content.res.Resources r0 = r19.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ua1.C28696z0.m87904a(android.view.View):ua1.z0");
    }

    /* renamed from: d */
    public static C28696z0 m87905d(LayoutInflater layoutInflater) {
        return m87906e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28696z0 m87906e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_username_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87904a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73068d;
    }
}
