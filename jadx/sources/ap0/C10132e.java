package ap0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import wo0.C18652b;
import wo0.C18653c;

/* renamed from: ap0.e */
public final class C10132e implements C6201a {

    /* renamed from: d */
    private final StateView f28072d;

    /* renamed from: e */
    public final ConstraintLayout f28073e;

    /* renamed from: f */
    public final ConstraintLayout f28074f;

    /* renamed from: g */
    public final LinearLayout f28075g;

    /* renamed from: h */
    public final Button f28076h;

    /* renamed from: i */
    public final PageDescriptionView f28077i;

    /* renamed from: j */
    public final PageDescriptionView f28078j;

    /* renamed from: k */
    public final Button f28079k;

    /* renamed from: l */
    public final StateView f28080l;

    private C10132e(StateView stateView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, Button button, PageDescriptionView pageDescriptionView, PageDescriptionView pageDescriptionView2, Button button2, StateView stateView2) {
        this.f28072d = stateView;
        this.f28073e = constraintLayout;
        this.f28074f = constraintLayout2;
        this.f28075g = linearLayout;
        this.f28076h = button;
        this.f28077i = pageDescriptionView;
        this.f28078j = pageDescriptionView2;
        this.f28079k = button2;
        this.f28080l = stateView2;
    }

    /* renamed from: a */
    public static C10132e m37056a(View view) {
        int i = C18652b.layout_error;
        ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view, i);
        if (constraintLayout != null) {
            i = C18652b.layout_no_content;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) C6202b.m24689a(view, i);
            if (constraintLayout2 != null) {
                i = C18652b.loading_content;
                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                if (linearLayout != null) {
                    i = C18652b.p2p_link_no_content_order_card;
                    Button button = (Button) C6202b.m24689a(view, i);
                    if (button != null) {
                        i = C18652b.p2p_link_page_description;
                        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                        if (pageDescriptionView != null) {
                            i = C18652b.p2p_link_page_no_content_description;
                            PageDescriptionView pageDescriptionView2 = (PageDescriptionView) C6202b.m24689a(view, i);
                            if (pageDescriptionView2 != null) {
                                i = C18652b.p2p_link_retry_btn;
                                Button button2 = (Button) C6202b.m24689a(view, i);
                                if (button2 != null) {
                                    StateView stateView = (StateView) view;
                                    return new C10132e(stateView, constraintLayout, constraintLayout2, linearLayout, button, pageDescriptionView, pageDescriptionView2, button2, stateView);
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
    public static C10132e m37057d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18653c.fragment_p2p_link_router, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37056a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f28072d;
    }
}
