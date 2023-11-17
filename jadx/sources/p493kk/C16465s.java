package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p451hk.C15526d;
import p451hk.C15527e;

/* renamed from: kk.s */
public final class C16465s implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f46607d;

    /* renamed from: e */
    public final ChipGroup f46608e;

    /* renamed from: f */
    public final Group f46609f;

    /* renamed from: g */
    public final TextView f46610g;

    /* renamed from: h */
    public final PageDescriptionView f46611h;

    private C16465s(ConstraintLayout constraintLayout, ChipGroup chipGroup, Group group, TextView textView, PageDescriptionView pageDescriptionView) {
        this.f46607d = constraintLayout;
        this.f46608e = chipGroup;
        this.f46609f = group;
        this.f46610g = textView;
        this.f46611h = pageDescriptionView;
    }

    /* renamed from: a */
    public static C16465s m58665a(View view) {
        int i = C15526d.ccy_chip_group;
        ChipGroup chipGroup = (ChipGroup) C6202b.m24689a(view, i);
        if (chipGroup != null) {
            i = C15526d.ccy_group;
            Group group = (Group) C6202b.m24689a(view, i);
            if (group != null) {
                i = C15526d.ccy_title;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C15526d.f44070g0;
                    PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                    if (pageDescriptionView != null) {
                        return new C16465s((ConstraintLayout) view, chipGroup, group, textView, pageDescriptionView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16465s m58666d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.item_insurance_provider_list_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58665a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f46607d;
    }
}
