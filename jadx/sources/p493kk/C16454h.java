package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p451hk.C15526d;
import p451hk.C15527e;

/* renamed from: kk.h */
public final class C16454h implements C6201a {

    /* renamed from: d */
    private final LinearLayout f46483d;

    /* renamed from: e */
    public final BigInputView f46484e;

    /* renamed from: f */
    public final PageDescriptionView f46485f;

    /* renamed from: g */
    public final InlineFeedback f46486g;

    /* renamed from: h */
    public final ChipGroup f46487h;

    /* renamed from: i */
    public final FixedButtonView f46488i;

    /* renamed from: j */
    public final CheckboxView f46489j;

    /* renamed from: k */
    public final CheckboxView f46490k;

    /* renamed from: l */
    public final Chip f46491l;

    /* renamed from: m */
    public final Chip f46492m;

    private C16454h(LinearLayout linearLayout, BigInputView bigInputView, PageDescriptionView pageDescriptionView, InlineFeedback inlineFeedback, ChipGroup chipGroup, FixedButtonView fixedButtonView, CheckboxView checkboxView, CheckboxView checkboxView2, Chip chip, Chip chip2) {
        this.f46483d = linearLayout;
        this.f46484e = bigInputView;
        this.f46485f = pageDescriptionView;
        this.f46486g = inlineFeedback;
        this.f46487h = chipGroup;
        this.f46488i = fixedButtonView;
        this.f46489j = checkboxView;
        this.f46490k = checkboxView2;
        this.f46491l = chip;
        this.f46492m = chip2;
    }

    /* renamed from: a */
    public static C16454h m58620a(View view) {
        int i = C15526d.car_number_input;
        BigInputView bigInputView = (BigInputView) C6202b.m24689a(view, i);
        if (bigInputView != null) {
            i = C15526d.car_number_input_desc;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                i = C15526d.car_number_input_feedback;
                InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
                if (inlineFeedback != null) {
                    i = C15526d.car_owner_chip_group;
                    ChipGroup chipGroup = (ChipGroup) C6202b.m24689a(view, i);
                    if (chipGroup != null) {
                        i = C15526d.f44068e0;
                        FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view, i);
                        if (fixedButtonView != null) {
                            i = C15526d.insurance_conditions_check_box;
                            CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
                            if (checkboxView != null) {
                                i = C15526d.mia_conditions_check_box;
                                CheckboxView checkboxView2 = (CheckboxView) C6202b.m24689a(view, i);
                                if (checkboxView2 != null) {
                                    i = C15526d.my_car_chip;
                                    Chip chip = (Chip) C6202b.m24689a(view, i);
                                    if (chip != null) {
                                        i = C15526d.somebody_elses_car_chip;
                                        Chip chip2 = (Chip) C6202b.m24689a(view, i);
                                        if (chip2 != null) {
                                            return new C16454h((LinearLayout) view, bigInputView, pageDescriptionView, inlineFeedback, chipGroup, fixedButtonView, checkboxView, checkboxView2, chip, chip2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16454h m58621d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.fragment_car_number_input, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58620a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f46483d;
    }
}
