package b31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;
import x11.C39771d;
import x11.C39772e;

/* renamed from: b31.h */
public final class C31119h implements C6201a {

    /* renamed from: d */
    private final LinearLayout f77341d;

    /* renamed from: e */
    public final RadioButtonView f77342e;

    /* renamed from: f */
    public final SingleLineTextItem f77343f;

    private C31119h(LinearLayout linearLayout, RadioButtonView radioButtonView, SingleLineTextItem singleLineTextItem) {
        this.f77341d = linearLayout;
        this.f77342e = radioButtonView;
        this.f77343f = singleLineTextItem;
    }

    /* renamed from: a */
    public static C31119h m92595a(View view) {
        int i = C39771d.card_limit_checkbox;
        RadioButtonView radioButtonView = (RadioButtonView) C6202b.m24689a(view, i);
        if (radioButtonView != null) {
            i = C39771d.card_limit_title;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                return new C31119h((LinearLayout) view, radioButtonView, singleLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31119h m92596d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39772e.item_card_limit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92595a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f77341d;
    }
}
