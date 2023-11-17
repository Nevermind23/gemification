package vt0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import rt0.C38341c;
import rt0.C38342d;

/* renamed from: vt0.d */
public final class C39467d implements C6201a {

    /* renamed from: d */
    private final LinearLayout f93889d;

    /* renamed from: e */
    public final RecyclerView f93890e;

    /* renamed from: f */
    public final ActionSheetTitle f93891f;

    /* renamed from: g */
    public final AppCompatImageView f93892g;

    /* renamed from: h */
    public final LayerView f93893h;

    /* renamed from: i */
    public final TwoLineTextItem f93894i;

    private C39467d(LinearLayout linearLayout, RecyclerView recyclerView, ActionSheetTitle actionSheetTitle, AppCompatImageView appCompatImageView, LayerView layerView, TwoLineTextItem twoLineTextItem) {
        this.f93889d = linearLayout;
        this.f93890e = recyclerView;
        this.f93891f = actionSheetTitle;
        this.f93892g = appCompatImageView;
        this.f93893h = layerView;
        this.f93894i = twoLineTextItem;
    }

    /* renamed from: a */
    public static C39467d m114724a(View view) {
        int i = C38341c.benefits_recycler;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C38341c.status_benefits_title;
            ActionSheetTitle actionSheetTitle = (ActionSheetTitle) C6202b.m24689a(view, i);
            if (actionSheetTitle != null) {
                i = C38341c.status_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    i = C38341c.status_layer;
                    LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                    if (layerView != null) {
                        i = C38341c.status_texts;
                        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
                        if (twoLineTextItem != null) {
                            return new C39467d((LinearLayout) view, recyclerView, actionSheetTitle, appCompatImageView, layerView, twoLineTextItem);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39467d m114725d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38342d.fragment_benefits, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114724a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f93889d;
    }
}
