package g71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import c71.C31284d;
import c71.C31285e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: g71.e */
public final class C32112e implements C6201a {

    /* renamed from: d */
    private final LinearLayout f78974d;

    /* renamed from: e */
    public final PageDescriptionView f78975e;

    /* renamed from: f */
    public final RecyclerView f78976f;

    private C32112e(LinearLayout linearLayout, PageDescriptionView pageDescriptionView, RecyclerView recyclerView) {
        this.f78974d = linearLayout;
        this.f78975e = pageDescriptionView;
        this.f78976f = recyclerView;
    }

    /* renamed from: a */
    public static C32112e m94581a(View view) {
        int i = C31284d.tc_pass_device_page_description;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C31284d.tc_pass_device_recycler_view;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                return new C32112e((LinearLayout) view, pageDescriptionView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C32112e m94582d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31285e.dialog_select_transport_card_pass_devices, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94581a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f78974d;
    }
}
