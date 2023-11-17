package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;

/* renamed from: ua1.i */
public final class C28648i implements C6201a {

    /* renamed from: d */
    private final ListItem f72756d;

    /* renamed from: e */
    public final AppCompatImageView f72757e;

    /* renamed from: f */
    public final SingleLineTextItem f72758f;

    /* renamed from: g */
    public final RadioButtonView f72759g;

    private C28648i(ListItem listItem, AppCompatImageView appCompatImageView, SingleLineTextItem singleLineTextItem, RadioButtonView radioButtonView) {
        this.f72756d = listItem;
        this.f72757e = appCompatImageView;
        this.f72758f = singleLineTextItem;
        this.f72759g = radioButtonView;
    }

    /* renamed from: a */
    public static C28648i m87696a(View view) {
        int i = C10216u.company_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C10216u.company_name;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                i = C10216u.f28326g2;
                RadioButtonView radioButtonView = (RadioButtonView) C6202b.m24689a(view, i);
                if (radioButtonView != null) {
                    return new C28648i((ListItem) view, appCompatImageView, singleLineTextItem, radioButtonView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28648i m87697d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.choose_company_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87696a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f72756d;
    }
}
