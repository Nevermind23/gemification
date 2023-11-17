package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p411em.C12488e;
import p411em.C12489f;

/* renamed from: jm.s */
public final class C16240s implements C6201a {

    /* renamed from: d */
    private final ListItem f45984d;

    /* renamed from: e */
    public final AppCompatImageView f45985e;

    /* renamed from: f */
    public final SingleLineTextItem f45986f;

    /* renamed from: g */
    public final AppCompatImageView f45987g;

    private C16240s(ListItem listItem, AppCompatImageView appCompatImageView, SingleLineTextItem singleLineTextItem, AppCompatImageView appCompatImageView2) {
        this.f45984d = listItem;
        this.f45985e = appCompatImageView;
        this.f45986f = singleLineTextItem;
        this.f45987g = appCompatImageView2;
    }

    /* renamed from: a */
    public static C16240s m57895a(View view) {
        int i = C12488e.address_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C12488e.address_name_text;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                i = C12488e.f37187R;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView2 != null) {
                    return new C16240s((ListItem) view, appCompatImageView, singleLineTextItem, appCompatImageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16240s m57896d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.item_address_component, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57895a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f45984d;
    }
}
