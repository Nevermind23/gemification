package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import p086g1.C6201a;
import p086g1.C6202b;
import y71.C40030d;
import y71.C40031e;

/* renamed from: z71.u */
public final class C40194u implements C6201a {

    /* renamed from: d */
    private final LinearLayoutCompat f95574d;

    /* renamed from: e */
    public final AppCompatImageView f95575e;

    /* renamed from: f */
    public final LinearLayoutCompat f95576f;

    /* renamed from: g */
    public final AppCompatTextView f95577g;

    private C40194u(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat2, AppCompatTextView appCompatTextView) {
        this.f95574d = linearLayoutCompat;
        this.f95575e = appCompatImageView;
        this.f95576f = linearLayoutCompat2;
        this.f95577g = appCompatTextView;
    }

    /* renamed from: a */
    public static C40194u m116483a(View view) {
        int i = C40030d.f95104j;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
            int i2 = C40030d.f95123z0;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i2);
            if (appCompatTextView != null) {
                return new C40194u(linearLayoutCompat, appCompatImageView, linearLayoutCompat, appCompatTextView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C40194u m116484d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.item_select_insurance_person, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116483a(inflate);
    }

    /* renamed from: c */
    public LinearLayoutCompat mo3946b() {
        return this.f95574d;
    }
}
