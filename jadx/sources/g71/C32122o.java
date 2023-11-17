package g71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c71.C31285e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textselectorcard.TextSelectorCardView;

/* renamed from: g71.o */
public final class C32122o implements C6201a {

    /* renamed from: d */
    private final TextSelectorCardView f79066d;

    /* renamed from: e */
    public final TextSelectorCardView f79067e;

    private C32122o(TextSelectorCardView textSelectorCardView, TextSelectorCardView textSelectorCardView2) {
        this.f79066d = textSelectorCardView;
        this.f79067e = textSelectorCardView2;
    }

    /* renamed from: a */
    public static C32122o m94622a(View view) {
        if (view != null) {
            TextSelectorCardView textSelectorCardView = (TextSelectorCardView) view;
            return new C32122o(textSelectorCardView, textSelectorCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C32122o m94623d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31285e.transport_card_pass_type_recycler_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94622a(inflate);
    }

    /* renamed from: c */
    public TextSelectorCardView mo3946b() {
        return this.f79066d;
    }
}
