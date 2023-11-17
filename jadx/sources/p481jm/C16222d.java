package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import p086g1.C6201a;
import p086g1.C6202b;
import p411em.C12488e;
import p411em.C12489f;

/* renamed from: jm.d */
public final class C16222d implements C6201a {

    /* renamed from: d */
    private final LinearLayoutCompat f45785d;

    /* renamed from: e */
    public final C16246y f45786e;

    /* renamed from: f */
    public final C16246y f45787f;

    private C16222d(LinearLayoutCompat linearLayoutCompat, C16246y yVar, C16246y yVar2) {
        this.f45785d = linearLayoutCompat;
        this.f45786e = yVar;
        this.f45787f = yVar2;
    }

    /* renamed from: a */
    public static C16222d m57816a(View view) {
        int i = C12488e.instant_option;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            C16246y a2 = C16246y.m57919a(a);
            int i2 = C12488e.standard_option;
            View a3 = C6202b.m24689a(view, i2);
            if (a3 != null) {
                return new C16222d((LinearLayoutCompat) view, a2, C16246y.m57919a(a3));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16222d m57817d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.action_sheet_instant_delivery_options, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57816a(inflate);
    }

    /* renamed from: c */
    public LinearLayoutCompat mo3946b() {
        return this.f45785d;
    }
}
