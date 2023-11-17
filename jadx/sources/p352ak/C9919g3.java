package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.g3 */
public final class C9919g3 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27023d;

    /* renamed from: e */
    public final Button f27024e;

    /* renamed from: f */
    public final AppCompatTextView f27025f;

    /* renamed from: g */
    public final ChipGroup f27026g;

    /* renamed from: h */
    public final Button f27027h;

    /* renamed from: i */
    public final Button f27028i;

    /* renamed from: j */
    public final AppCompatTextView f27029j;

    private C9919g3(LinearLayout linearLayout, Button button, AppCompatTextView appCompatTextView, ChipGroup chipGroup, Button button2, Button button3, AppCompatTextView appCompatTextView2) {
        this.f27023d = linearLayout;
        this.f27024e = button;
        this.f27025f = appCompatTextView;
        this.f27026g = chipGroup;
        this.f27027h = button2;
        this.f27028i = button3;
        this.f27029j = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9919g3 m36384a(View view) {
        int i = C17782g.additional_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C17782g.bottom_information_text;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C17782g.f49812y1;
                ChipGroup chipGroup = (ChipGroup) C6202b.m24689a(view, i);
                if (chipGroup != null) {
                    i = C17782g.f49802v2;
                    Button button2 = (Button) C6202b.m24689a(view, i);
                    if (button2 != null) {
                        i = C17782g.f49815z3;
                        Button button3 = (Button) C6202b.m24689a(view, i);
                        if (button3 != null) {
                            i = C17782g.information_text;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                            if (appCompatTextView2 != null) {
                                return new C9919g3((LinearLayout) view, button, appCompatTextView, chipGroup, button2, button3, appCompatTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9919g3 m36385d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_fixed_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36384a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27023d;
    }
}
