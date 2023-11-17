package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import android.view.View;
import p341ge.bog.mobilebank.p975ui.views.widgets.MenuClickableListItem;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.l */
public final /* synthetic */ class C21321l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MenuClickableListItem f57141d;

    /* renamed from: e */
    public final /* synthetic */ MoreFragment f57142e;

    public /* synthetic */ C21321l(MenuClickableListItem menuClickableListItem, MoreFragment moreFragment) {
        this.f57141d = menuClickableListItem;
        this.f57142e = moreFragment;
    }

    public final void onClick(View view) {
        MoreFragment.fillSections1$lambda$12$lambda$11(this.f57141d, this.f57142e, view);
    }
}
