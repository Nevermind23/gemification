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

/* renamed from: jm.t */
public final class C16241t implements C6201a {

    /* renamed from: d */
    private final ListItem f45988d;

    /* renamed from: e */
    public final SingleLineTextItem f45989e;

    /* renamed from: f */
    public final AppCompatImageView f45990f;

    private C16241t(ListItem listItem, SingleLineTextItem singleLineTextItem, AppCompatImageView appCompatImageView) {
        this.f45988d = listItem;
        this.f45989e = singleLineTextItem;
        this.f45990f = appCompatImageView;
    }

    /* renamed from: a */
    public static C16241t m57899a(View view) {
        int i = C12488e.card_term_description;
        SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
        if (singleLineTextItem != null) {
            i = C12488e.term_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                return new C16241t((ListItem) view, singleLineTextItem, appCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16241t m57900d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.item_card_combined_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57899a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f45988d;
    }
}
