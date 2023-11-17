package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.j4 */
public final class C27338j4 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69073d;

    /* renamed from: e */
    public final BigDividerView f69074e;

    /* renamed from: f */
    public final Switch f69075f;

    /* renamed from: g */
    public final RelativeLayout f69076g;

    /* renamed from: h */
    public final RelativeLayout f69077h;

    /* renamed from: i */
    public final Switch f69078i;

    private C27338j4(LinearLayout linearLayout, BigDividerView bigDividerView, Switch switchR, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, Switch switchR2) {
        this.f69073d = linearLayout;
        this.f69074e = bigDividerView;
        this.f69075f = switchR;
        this.f69076g = relativeLayout;
        this.f69077h = relativeLayout2;
        this.f69078i = switchR2;
    }

    /* renamed from: a */
    public static C27338j4 m84661a(View view) {
        int i = C10322k.big_divider;
        BigDividerView bigDividerView = (BigDividerView) C6202b.m24689a(view, i);
        if (bigDividerView != null) {
            i = C10322k.sms_switch;
            Switch switchR = (Switch) C6202b.m24689a(view, i);
            if (switchR != null) {
                i = C10322k.sms_switch_container;
                RelativeLayout relativeLayout = (RelativeLayout) C6202b.m24689a(view, i);
                if (relativeLayout != null) {
                    i = C10322k.sms_with_money_container;
                    RelativeLayout relativeLayout2 = (RelativeLayout) C6202b.m24689a(view, i);
                    if (relativeLayout2 != null) {
                        i = C10322k.sms_with_money_switch;
                        Switch switchR2 = (Switch) C6202b.m24689a(view, i);
                        if (switchR2 != null) {
                            return new C27338j4((LinearLayout) view, bigDividerView, switchR, relativeLayout, relativeLayout2, switchR2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27338j4 m84662d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_sms_contact_notification_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84661a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69073d;
    }
}
