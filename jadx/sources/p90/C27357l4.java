package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.components.BogProgressBar;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.ProviderDetailTypeView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.l4 */
public final class C27357l4 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f69228d;

    /* renamed from: e */
    public final BogInputLayout f69229e;

    /* renamed from: f */
    public final LinearLayout f69230f;

    /* renamed from: g */
    public final ProviderDetailTypeView f69231g;

    /* renamed from: h */
    public final ProviderDetailTypeView f69232h;

    /* renamed from: i */
    public final RecyclerView f69233i;

    /* renamed from: j */
    public final RecyclerView f69234j;

    /* renamed from: k */
    public final BogTextView f69235k;

    /* renamed from: l */
    public final RecyclerView f69236l;

    /* renamed from: m */
    public final BogProgressBar f69237m;

    /* renamed from: n */
    public final LinearLayout f69238n;

    /* renamed from: o */
    public final BogTextView f69239o;

    /* renamed from: p */
    public final RecyclerView f69240p;

    /* renamed from: q */
    public final LinearLayout f69241q;

    /* renamed from: r */
    public final BogTextView f69242r;

    /* renamed from: s */
    public final FrameLayout f69243s;

    /* renamed from: t */
    public final LinearLayout f69244t;

    /* renamed from: u */
    public final BogInputLayout f69245u;

    /* renamed from: v */
    public final BogTextView f69246v;

    /* renamed from: w */
    public final RelativeLayout f69247w;

    /* renamed from: x */
    public final BogInputLayout f69248x;

    private C27357l4(FrameLayout frameLayout, BogInputLayout bogInputLayout, LinearLayout linearLayout, ProviderDetailTypeView providerDetailTypeView, ProviderDetailTypeView providerDetailTypeView2, RecyclerView recyclerView, RecyclerView recyclerView2, BogTextView bogTextView, RecyclerView recyclerView3, BogProgressBar bogProgressBar, LinearLayout linearLayout2, BogTextView bogTextView2, RecyclerView recyclerView4, LinearLayout linearLayout3, BogTextView bogTextView3, FrameLayout frameLayout2, LinearLayout linearLayout4, BogInputLayout bogInputLayout2, BogTextView bogTextView4, RelativeLayout relativeLayout, BogInputLayout bogInputLayout3) {
        this.f69228d = frameLayout;
        this.f69229e = bogInputLayout;
        this.f69230f = linearLayout;
        this.f69231g = providerDetailTypeView;
        this.f69232h = providerDetailTypeView2;
        this.f69233i = recyclerView;
        this.f69234j = recyclerView2;
        this.f69235k = bogTextView;
        this.f69236l = recyclerView3;
        this.f69237m = bogProgressBar;
        this.f69238n = linearLayout2;
        this.f69239o = bogTextView2;
        this.f69240p = recyclerView4;
        this.f69241q = linearLayout3;
        this.f69242r = bogTextView3;
        this.f69243s = frameLayout2;
        this.f69244t = linearLayout4;
        this.f69245u = bogInputLayout2;
        this.f69246v = bogTextView4;
        this.f69247w = relativeLayout;
        this.f69248x = bogInputLayout3;
    }

    /* renamed from: a */
    public static C27357l4 m84737a(View view) {
        View view2 = view;
        int i = C10322k.exchange_request_from_amount_layout;
        BogInputLayout bogInputLayout = (BogInputLayout) C6202b.m24689a(view2, i);
        if (bogInputLayout != null) {
            i = C10322k.mbank_rate_container;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
            if (linearLayout != null) {
                i = C10322k.transfer_saved_amount;
                ProviderDetailTypeView providerDetailTypeView = (ProviderDetailTypeView) C6202b.m24689a(view2, i);
                if (providerDetailTypeView != null) {
                    i = C10322k.transfer_standard_rate;
                    ProviderDetailTypeView providerDetailTypeView2 = (ProviderDetailTypeView) C6202b.m24689a(view2, i);
                    if (providerDetailTypeView2 != null) {
                        i = C10322k.transfer_wizard_account_choose_recycler;
                        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view2, i);
                        if (recyclerView != null) {
                            i = C10322k.transfer_wizard_account_details_recycler;
                            RecyclerView recyclerView2 = (RecyclerView) C6202b.m24689a(view2, i);
                            if (recyclerView2 != null) {
                                i = C10322k.transfer_wizard_error_tv;
                                BogTextView bogTextView = (BogTextView) C6202b.m24689a(view2, i);
                                if (bogTextView != null) {
                                    i = C10322k.transfer_wizard_other_account_chooser_recycler;
                                    RecyclerView recyclerView3 = (RecyclerView) C6202b.m24689a(view2, i);
                                    if (recyclerView3 != null) {
                                        i = C10322k.transfer_wizard_progressbar;
                                        BogProgressBar bogProgressBar = (BogProgressBar) C6202b.m24689a(view2, i);
                                        if (bogProgressBar != null) {
                                            i = C10322k.transfer_wizard_selector_container;
                                            LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view2, i);
                                            if (linearLayout2 != null) {
                                                i = C10322k.transfer_wizard_selector_details;
                                                BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view2, i);
                                                if (bogTextView2 != null) {
                                                    i = C10322k.transfer_wizard_selector_recycler;
                                                    RecyclerView recyclerView4 = (RecyclerView) C6202b.m24689a(view2, i);
                                                    if (recyclerView4 != null) {
                                                        i = C10322k.transfer_wizard_selector_recycler_layout;
                                                        LinearLayout linearLayout3 = (LinearLayout) C6202b.m24689a(view2, i);
                                                        if (linearLayout3 != null) {
                                                            i = C10322k.transfer_wizard_selector_title;
                                                            BogTextView bogTextView3 = (BogTextView) C6202b.m24689a(view2, i);
                                                            if (bogTextView3 != null) {
                                                                i = C10322k.transfer_wizard_selector_title_layout;
                                                                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view2, i);
                                                                if (frameLayout != null) {
                                                                    i = C10322k.transfer_wizard_text_input_layout;
                                                                    LinearLayout linearLayout4 = (LinearLayout) C6202b.m24689a(view2, i);
                                                                    if (linearLayout4 != null) {
                                                                        i = C10322k.wizard_amount_receive_layout;
                                                                        BogInputLayout bogInputLayout2 = (BogInputLayout) C6202b.m24689a(view2, i);
                                                                        if (bogInputLayout2 != null) {
                                                                            i = C10322k.wizard_input_bottom_title;
                                                                            BogTextView bogTextView4 = (BogTextView) C6202b.m24689a(view2, i);
                                                                            if (bogTextView4 != null) {
                                                                                i = C10322k.wizard_input_container;
                                                                                RelativeLayout relativeLayout = (RelativeLayout) C6202b.m24689a(view2, i);
                                                                                if (relativeLayout != null) {
                                                                                    i = C10322k.wizard_input_layout;
                                                                                    BogInputLayout bogInputLayout3 = (BogInputLayout) C6202b.m24689a(view2, i);
                                                                                    if (bogInputLayout3 != null) {
                                                                                        return new C27357l4((FrameLayout) view2, bogInputLayout, linearLayout, providerDetailTypeView, providerDetailTypeView2, recyclerView, recyclerView2, bogTextView, recyclerView3, bogProgressBar, linearLayout2, bogTextView2, recyclerView4, linearLayout3, bogTextView3, frameLayout, linearLayout4, bogInputLayout2, bogTextView4, relativeLayout, bogInputLayout3);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static C27357l4 m84738d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_transfer_wizard, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84737a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f69228d;
    }
}
