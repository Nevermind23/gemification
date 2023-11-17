package en0;

import an0.C10107c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.input.Input;

/* renamed from: en0.i */
public final class C12723i implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f37648d;

    /* renamed from: e */
    public final Input f37649e;

    /* renamed from: f */
    public final C12722h f37650f;

    /* renamed from: g */
    public final Group f37651g;

    /* renamed from: h */
    public final Input f37652h;

    private C12723i(ConstraintLayout constraintLayout, Input input, C12722h hVar, Group group, Input input2) {
        this.f37648d = constraintLayout;
        this.f37649e = input;
        this.f37650f = hVar;
        this.f37651g = group;
        this.f37652h = input2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = an0.C10106b.f27890x;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static en0.C12723i m48285a(android.view.View r8) {
        /*
            int r0 = an0.C10106b.employer_input
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            ge.bog.designsystem.components.input.Input r4 = (p341ge.bog.designsystem.components.input.Input) r4
            if (r4 == 0) goto L_0x0037
            int r0 = an0.C10106b.f27890x
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0037
            en0.h r5 = en0.C12722h.m48281a(r1)
            int r0 = an0.C10106b.input_group
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r6 = r1
            androidx.constraintlayout.widget.Group r6 = (androidx.constraintlayout.widget.Group) r6
            if (r6 == 0) goto L_0x0037
            int r0 = an0.C10106b.position_input
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r7 = r1
            ge.bog.designsystem.components.input.Input r7 = (p341ge.bog.designsystem.components.input.Input) r7
            if (r7 == 0) goto L_0x0037
            en0.i r0 = new en0.i
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
        throw new UnsupportedOperationException("Method not decompiled: en0.C12723i.m48285a(android.view.View):en0.i");
    }

    /* renamed from: d */
    public static C12723i m48286d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10107c.item_occupation_employed, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48285a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f37648d;
    }
}
