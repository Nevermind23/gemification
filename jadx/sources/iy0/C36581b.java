package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.onetimepassword.OneTimePasswordView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.pagestate.PageState;

/* renamed from: iy0.b */
public final class C36581b implements C6201a {

    /* renamed from: d */
    private final FrameLayout f88142d;

    /* renamed from: e */
    public final Button f88143e;

    /* renamed from: f */
    public final LinearLayout f88144f;

    /* renamed from: g */
    public final Button f88145g;

    /* renamed from: h */
    public final Button f88146h;

    /* renamed from: i */
    public final LinearLayout f88147i;

    /* renamed from: j */
    public final Button f88148j;

    /* renamed from: k */
    public final Input f88149k;

    /* renamed from: l */
    public final OneTimePasswordView f88150l;

    /* renamed from: m */
    public final PageDescriptionView f88151m;

    /* renamed from: n */
    public final CardView f88152n;

    /* renamed from: o */
    public final LinearLayout f88153o;

    /* renamed from: p */
    public final PageState f88154p;

    private C36581b(FrameLayout frameLayout, Button button, LinearLayout linearLayout, Button button2, Button button3, LinearLayout linearLayout2, Button button4, Input input, OneTimePasswordView oneTimePasswordView, PageDescriptionView pageDescriptionView, CardView cardView, LinearLayout linearLayout3, PageState pageState) {
        this.f88142d = frameLayout;
        this.f88143e = button;
        this.f88144f = linearLayout;
        this.f88145g = button2;
        this.f88146h = button3;
        this.f88147i = linearLayout2;
        this.f88148j = button4;
        this.f88149k = input;
        this.f88150l = oneTimePasswordView;
        this.f88151m = pageDescriptionView;
        this.f88152n = cardView;
        this.f88153o = linearLayout3;
        this.f88154p = pageState;
    }

    /* renamed from: a */
    public static C36581b m108449a(View view) {
        View view2 = view;
        int i = C36271e.f87515f;
        Button button = (Button) C6202b.m24689a(view2, i);
        if (button != null) {
            i = C36271e.add_number_layout;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
            if (linearLayout != null) {
                i = C36271e.another_number_button;
                Button button2 = (Button) C6202b.m24689a(view2, i);
                if (button2 != null) {
                    i = C36271e.f87495O;
                    Button button3 = (Button) C6202b.m24689a(view2, i);
                    if (button3 != null) {
                        i = C36271e.confirm_number_layout;
                        LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view2, i);
                        if (linearLayout2 != null) {
                            i = C36271e.f87513e0;
                            Button button4 = (Button) C6202b.m24689a(view2, i);
                            if (button4 != null) {
                                i = C36271e.f87485C1;
                                Input input = (Input) C6202b.m24689a(view2, i);
                                if (input != null) {
                                    i = C36271e.f87488F1;
                                    OneTimePasswordView oneTimePasswordView = (OneTimePasswordView) C6202b.m24689a(view2, i);
                                    if (oneTimePasswordView != null) {
                                        i = C36271e.f87490I1;
                                        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view2, i);
                                        if (pageDescriptionView != null) {
                                            i = C36271e.f87500U1;
                                            CardView cardView = (CardView) C6202b.m24689a(view2, i);
                                            if (cardView != null) {
                                                i = C36271e.f87537n2;
                                                LinearLayout linearLayout3 = (LinearLayout) C6202b.m24689a(view2, i);
                                                if (linearLayout3 != null) {
                                                    i = C36271e.f87538o2;
                                                    PageState pageState = (PageState) C6202b.m24689a(view2, i);
                                                    if (pageState != null) {
                                                        return new C36581b((FrameLayout) view2, button, linearLayout, button2, button3, linearLayout2, button4, input, oneTimePasswordView, pageDescriptionView, cardView, linearLayout3, pageState);
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
    public static C36581b m108450d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.action_sheet_add_child_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108449a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f88142d;
    }
}
