package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.p */
public final class C17162p implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f48127d;

    /* renamed from: e */
    public final RelativeLayout f48128e;

    /* renamed from: f */
    public final TextView f48129f;

    private C17162p(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView) {
        this.f48127d = relativeLayout;
        this.f48128e = relativeLayout2;
        this.f48129f = textView;
    }

    /* renamed from: a */
    public static C17162p m60298a(View view) {
        int i = C16347e.again_button;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
        if (relativeLayout != null) {
            i = C16347e.record_begin_title;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                return new C17162p((RelativeLayout) view, relativeLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17162p m60299d(LayoutInflater layoutInflater) {
        return m60300e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17162p m60300e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_no_internet_identomat, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60298a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f48127d;
    }
}
