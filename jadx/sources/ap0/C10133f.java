package ap0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import wo0.C18652b;
import wo0.C18653c;

/* renamed from: ap0.f */
public final class C10133f implements C6201a {

    /* renamed from: d */
    private final StateView f28081d;

    /* renamed from: e */
    public final Button f28082e;

    /* renamed from: f */
    public final Button f28083f;

    /* renamed from: g */
    public final LinearLayout f28084g;

    /* renamed from: h */
    public final EmptyWidget f28085h;

    /* renamed from: i */
    public final EmptyWidget f28086i;

    /* renamed from: j */
    public final InlineFeedback f28087j;

    /* renamed from: k */
    public final InlineFeedback f28088k;

    /* renamed from: l */
    public final ConstraintLayout f28089l;

    /* renamed from: m */
    public final ListItem f28090m;

    /* renamed from: n */
    public final LinearLayout f28091n;

    /* renamed from: o */
    public final CreditCardSmallPickerView f28092o;

    /* renamed from: p */
    public final PageDescriptionView f28093p;

    /* renamed from: q */
    public final Button f28094q;

    /* renamed from: r */
    public final StateView f28095r;

    /* renamed from: s */
    public final TwoLineTextItem f28096s;

    private C10133f(StateView stateView, Button button, Button button2, LinearLayout linearLayout, EmptyWidget emptyWidget, EmptyWidget emptyWidget2, InlineFeedback inlineFeedback, InlineFeedback inlineFeedback2, ConstraintLayout constraintLayout, ListItem listItem, LinearLayout linearLayout2, CreditCardSmallPickerView creditCardSmallPickerView, PageDescriptionView pageDescriptionView, Button button3, StateView stateView2, TwoLineTextItem twoLineTextItem) {
        this.f28081d = stateView;
        this.f28082e = button;
        this.f28083f = button2;
        this.f28084g = linearLayout;
        this.f28085h = emptyWidget;
        this.f28086i = emptyWidget2;
        this.f28087j = inlineFeedback;
        this.f28088k = inlineFeedback2;
        this.f28089l = constraintLayout;
        this.f28090m = listItem;
        this.f28091n = linearLayout2;
        this.f28092o = creditCardSmallPickerView;
        this.f28093p = pageDescriptionView;
        this.f28094q = button3;
        this.f28095r = stateView2;
        this.f28096s = twoLineTextItem;
    }

    /* renamed from: a */
    public static C10133f m37060a(View view) {
        View view2 = view;
        int i = C18652b.button_copy;
        Button button = (Button) C6202b.m24689a(view2, i);
        if (button != null) {
            i = C18652b.f52253m;
            Button button2 = (Button) C6202b.m24689a(view2, i);
            if (button2 != null) {
                i = C18652b.f52256s;
                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
                if (linearLayout != null) {
                    i = C18652b.empty_widget_account_title;
                    EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view2, i);
                    if (emptyWidget != null) {
                        i = C18652b.empty_widget_link_title;
                        EmptyWidget emptyWidget2 = (EmptyWidget) C6202b.m24689a(view2, i);
                        if (emptyWidget2 != null) {
                            i = C18652b.feedback_account;
                            InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view2, i);
                            if (inlineFeedback != null) {
                                i = C18652b.feedback_link;
                                InlineFeedback inlineFeedback2 = (InlineFeedback) C6202b.m24689a(view2, i);
                                if (inlineFeedback2 != null) {
                                    i = C18652b.layout_error;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view2, i);
                                    if (constraintLayout != null) {
                                        i = C18652b.list_item_link;
                                        ListItem listItem = (ListItem) C6202b.m24689a(view2, i);
                                        if (listItem != null) {
                                            i = C18652b.loading_content;
                                            LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view2, i);
                                            if (linearLayout2 != null) {
                                                i = C18652b.p2p_link_choose_account;
                                                CreditCardSmallPickerView creditCardSmallPickerView = (CreditCardSmallPickerView) C6202b.m24689a(view2, i);
                                                if (creditCardSmallPickerView != null) {
                                                    i = C18652b.p2p_link_page_description;
                                                    PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view2, i);
                                                    if (pageDescriptionView != null) {
                                                        i = C18652b.p2p_link_retry_btn;
                                                        Button button3 = (Button) C6202b.m24689a(view2, i);
                                                        if (button3 != null) {
                                                            StateView stateView = (StateView) view2;
                                                            i = C18652b.two_line_text_link;
                                                            TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view2, i);
                                                            if (twoLineTextItem != null) {
                                                                return new C10133f(stateView, button, button2, linearLayout, emptyWidget, emptyWidget2, inlineFeedback, inlineFeedback2, constraintLayout, listItem, linearLayout2, creditCardSmallPickerView, pageDescriptionView, button3, stateView, twoLineTextItem);
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
    public static C10133f m37061d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18653c.fragment_p2p_link_sharing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37060a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f28081d;
    }
}
