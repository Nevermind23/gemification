package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p411em.C12488e;
import p411em.C12489f;

/* renamed from: jm.u */
public final class C16242u implements C6201a {

    /* renamed from: d */
    private final ListItem f45991d;

    /* renamed from: e */
    public final TwoLineTextItem f45992e;

    /* renamed from: f */
    public final AppCompatImageView f45993f;

    private C16242u(ListItem listItem, TwoLineTextItem twoLineTextItem, AppCompatImageView appCompatImageView) {
        this.f45991d = listItem;
        this.f45992e = twoLineTextItem;
        this.f45993f = appCompatImageView;
    }

    /* renamed from: a */
    public static C16242u m57903a(View view) {
        int i = C12488e.card_term_description;
        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
        if (twoLineTextItem != null) {
            i = C12488e.term_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                return new C16242u((ListItem) view, twoLineTextItem, appCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16242u m57904d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.item_card_term, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57903a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f45991d;
    }
}
