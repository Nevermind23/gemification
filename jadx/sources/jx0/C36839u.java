package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;

/* renamed from: jx0.u */
public final class C36839u implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88904d;

    /* renamed from: e */
    public final Chip f88905e;

    /* renamed from: f */
    public final ChipGroup f88906f;

    /* renamed from: g */
    public final Chip f88907g;

    private C36839u(LinearLayout linearLayout, Chip chip, ChipGroup chipGroup, Chip chip2) {
        this.f88904d = linearLayout;
        this.f88905e = chip;
        this.f88906f = chipGroup;
        this.f88907g = chip2;
    }

    /* renamed from: a */
    public static C36839u m109168a(View view) {
        int i = C32024d.chip_first;
        Chip chip = (Chip) C6202b.m24689a(view, i);
        if (chip != null) {
            i = C32024d.f78849n;
            ChipGroup chipGroup = (ChipGroup) C6202b.m24689a(view, i);
            if (chipGroup != null) {
                i = C32024d.chip_second;
                Chip chip2 = (Chip) C6202b.m24689a(view, i);
                if (chip2 != null) {
                    return new C36839u((LinearLayout) view, chip, chipGroup, chip2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36839u m109169d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_payment_form_element_chips, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109168a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88904d;
    }
}
