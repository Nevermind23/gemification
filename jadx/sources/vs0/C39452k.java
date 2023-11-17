package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.input.Input;
import rs0.C38336c;
import rs0.C38337d;

/* renamed from: vs0.k */
public final class C39452k implements C6201a {

    /* renamed from: d */
    private final ScrollView f93794d;

    /* renamed from: e */
    public final Input f93795e;

    /* renamed from: f */
    public final ChipGroup f93796f;

    /* renamed from: g */
    public final Guideline f93797g;

    /* renamed from: h */
    public final Guideline f93798h;

    /* renamed from: i */
    public final AppCompatTextView f93799i;

    /* renamed from: j */
    public final AppCompatTextView f93800j;

    /* renamed from: k */
    public final AppCompatImageView f93801k;

    private C39452k(ScrollView scrollView, Input input, ChipGroup chipGroup, Guideline guideline, Guideline guideline2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView) {
        this.f93794d = scrollView;
        this.f93795e = input;
        this.f93796f = chipGroup;
        this.f93797g = guideline;
        this.f93798h = guideline2;
        this.f93799i = appCompatTextView;
        this.f93800j = appCompatTextView2;
        this.f93801k = appCompatImageView;
    }

    /* renamed from: a */
    public static C39452k m114663a(View view) {
        int i = C38336c.f91872f;
        Input input = (Input) C6202b.m24689a(view, i);
        if (input != null) {
            i = C38336c.amount_chip_group;
            ChipGroup chipGroup = (ChipGroup) C6202b.m24689a(view, i);
            if (chipGroup != null) {
                i = C38336c.f91865Z;
                Guideline guideline = (Guideline) C6202b.m24689a(view, i);
                if (guideline != null) {
                    i = C38336c.f91866a0;
                    Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
                    if (guideline2 != null) {
                        i = C38336c.piggy_bank_choose_accounts_label;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                        if (appCompatTextView != null) {
                            i = C38336c.piggy_bank_choose_amount_label;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                            if (appCompatTextView2 != null) {
                                i = C38336c.piggy_bank_image;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                                if (appCompatImageView != null) {
                                    return new C39452k((ScrollView) view, input, chipGroup, guideline, guideline2, appCompatTextView, appCompatTextView2, appCompatImageView);
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
    public static C39452k m114664d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.fragment_open_piggy_bank, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114663a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f93794d;
    }
}
