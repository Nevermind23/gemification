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

/* renamed from: jm.c0 */
public final class C16221c0 implements C6201a {

    /* renamed from: d */
    private final ListItem f45782d;

    /* renamed from: e */
    public final AppCompatImageView f45783e;

    /* renamed from: f */
    public final SingleLineTextItem f45784f;

    private C16221c0(ListItem listItem, AppCompatImageView appCompatImageView, SingleLineTextItem singleLineTextItem) {
        this.f45782d = listItem;
        this.f45783e = appCompatImageView;
        this.f45784f = singleLineTextItem;
    }

    /* renamed from: a */
    public static C16221c0 m57812a(View view) {
        int i = C12488e.item_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C12488e.owner_name;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                return new C16221c0((ListItem) view, appCompatImageView, singleLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16221c0 m57813d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.item_scool_card_owner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57812a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f45782d;
    }
}
