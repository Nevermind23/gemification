package en0;

import an0.C10107c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.input.Input;

/* renamed from: en0.j */
public final class C12724j implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f37653d;

    /* renamed from: e */
    public final Input f37654e;

    /* renamed from: f */
    public final C12722h f37655f;

    private C12724j(ConstraintLayout constraintLayout, Input input, C12722h hVar) {
        this.f37653d = constraintLayout;
        this.f37654e = input;
        this.f37655f = hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = an0.C10106b.f27890x;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static en0.C12724j m48289a(android.view.View r3) {
        /*
            int r0 = an0.C10106b.business_name_input
            android.view.View r1 = p086g1.C6202b.m24689a(r3, r0)
            ge.bog.designsystem.components.input.Input r1 = (p341ge.bog.designsystem.components.input.Input) r1
            if (r1 == 0) goto L_0x001e
            int r0 = an0.C10106b.f27890x
            android.view.View r2 = p086g1.C6202b.m24689a(r3, r0)
            if (r2 == 0) goto L_0x001e
            en0.h r0 = en0.C12722h.m48281a(r2)
            en0.j r2 = new en0.j
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2.<init>(r3, r1, r0)
            return r2
        L_0x001e:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: en0.C12724j.m48289a(android.view.View):en0.j");
    }

    /* renamed from: d */
    public static C12724j m48290d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10107c.item_occupation_personal_bussiness, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48289a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f37653d;
    }
}
