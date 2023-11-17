package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: th0.b */
public final class C28390b implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f71980d;

    /* renamed from: e */
    public final TextView f71981e;

    /* renamed from: f */
    public final AppCompatImageView f71982f;

    /* renamed from: g */
    public final CardView f71983g;

    /* renamed from: h */
    public final AppCompatImageView f71984h;

    /* renamed from: i */
    public final PageDescriptionView f71985i;

    private C28390b(ConstraintLayout constraintLayout, TextView textView, AppCompatImageView appCompatImageView, CardView cardView, AppCompatImageView appCompatImageView2, PageDescriptionView pageDescriptionView) {
        this.f71980d = constraintLayout;
        this.f71981e = textView;
        this.f71982f = appCompatImageView;
        this.f71983g = cardView;
        this.f71984h = appCompatImageView2;
        this.f71985i = pageDescriptionView;
    }

    /* renamed from: a */
    public static C28390b m87080a(View view) {
        int i = C27010e.f67828l;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C27010e.card_background;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C27010e.card_view_container;
                CardView cardView = (CardView) C6202b.m24689a(view, i);
                if (cardView != null) {
                    i = C27010e.merchant_logo;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                    if (appCompatImageView2 != null) {
                        i = C27010e.page_description_container;
                        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                        if (pageDescriptionView != null) {
                            return new C28390b((ConstraintLayout) view, textView, appCompatImageView, cardView, appCompatImageView2, pageDescriptionView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28390b m87081d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.action_sheet_gift_card_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87080a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f71980d;
    }
}
