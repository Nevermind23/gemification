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

/* renamed from: jm.v */
public final class C16243v implements C6201a {

    /* renamed from: d */
    private final ListItem f45994d;

    /* renamed from: e */
    public final SingleLineTextItem f45995e;

    /* renamed from: f */
    public final ListItem f45996f;

    /* renamed from: g */
    public final AppCompatImageView f45997g;

    /* renamed from: h */
    public final AppCompatImageView f45998h;

    private C16243v(ListItem listItem, SingleLineTextItem singleLineTextItem, ListItem listItem2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f45994d = listItem;
        this.f45995e = singleLineTextItem;
        this.f45996f = listItem2;
        this.f45997g = appCompatImageView;
        this.f45998h = appCompatImageView2;
    }

    /* renamed from: a */
    public static C16243v m57907a(View view) {
        int i = C12488e.card_other_terms_label;
        SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
        if (singleLineTextItem != null) {
            ListItem listItem = (ListItem) view;
            i = C12488e.other_terms_external_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C12488e.other_terms_icon;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView2 != null) {
                    return new C16243v(listItem, singleLineTextItem, listItem, appCompatImageView, appCompatImageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16243v m57908d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.item_clickable_card_term, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57907a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f45994d;
    }
}
