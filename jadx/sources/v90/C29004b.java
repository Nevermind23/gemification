package v90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.actioncard.ActionCardView;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import s90.C28164b;
import s90.C28165c;

/* renamed from: v90.b */
public final class C29004b implements C6201a {

    /* renamed from: d */
    private final SwipeRefreshLayout f73945d;

    /* renamed from: e */
    public final LinearLayout f73946e;

    /* renamed from: f */
    public final ActionCardView f73947f;

    /* renamed from: g */
    public final LayerView f73948g;

    /* renamed from: h */
    public final RecyclerView f73949h;

    /* renamed from: i */
    public final ActionSheetTitle f73950i;

    /* renamed from: j */
    public final PageDescriptionView f73951j;

    /* renamed from: k */
    public final LayerView f73952k;

    /* renamed from: l */
    public final LayerView f73953l;

    /* renamed from: m */
    public final LoadingView f73954m;

    /* renamed from: n */
    public final SwipeRefreshLayout f73955n;

    /* renamed from: o */
    public final StateView f73956o;

    /* renamed from: p */
    public final ActionCardView f73957p;

    /* renamed from: q */
    public final LayerView f73958q;

    /* renamed from: r */
    public final RecyclerView f73959r;

    /* renamed from: s */
    public final ActionSheetTitle f73960s;

    private C29004b(SwipeRefreshLayout swipeRefreshLayout, LinearLayout linearLayout, ActionCardView actionCardView, LayerView layerView, RecyclerView recyclerView, ActionSheetTitle actionSheetTitle, PageDescriptionView pageDescriptionView, LayerView layerView2, LayerView layerView3, LoadingView loadingView, SwipeRefreshLayout swipeRefreshLayout2, StateView stateView, ActionCardView actionCardView2, LayerView layerView4, RecyclerView recyclerView2, ActionSheetTitle actionSheetTitle2) {
        this.f73945d = swipeRefreshLayout;
        this.f73946e = linearLayout;
        this.f73947f = actionCardView;
        this.f73948g = layerView;
        this.f73949h = recyclerView;
        this.f73950i = actionSheetTitle;
        this.f73951j = pageDescriptionView;
        this.f73952k = layerView2;
        this.f73953l = layerView3;
        this.f73954m = loadingView;
        this.f73955n = swipeRefreshLayout2;
        this.f73956o = stateView;
        this.f73957p = actionCardView2;
        this.f73958q = layerView4;
        this.f73959r = recyclerView2;
        this.f73960s = actionSheetTitle2;
    }

    /* renamed from: a */
    public static C29004b m88741a(View view) {
        View view2 = view;
        int i = C28164b.f71509a;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
        if (linearLayout != null) {
            i = C28164b.dd_banner;
            ActionCardView actionCardView = (ActionCardView) C6202b.m24689a(view2, i);
            if (actionCardView != null) {
                i = C28164b.dd_list;
                LayerView layerView = (LayerView) C6202b.m24689a(view2, i);
                if (layerView != null) {
                    i = C28164b.dd_recycler;
                    RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view2, i);
                    if (recyclerView != null) {
                        i = C28164b.dd_title;
                        ActionSheetTitle actionSheetTitle = (ActionSheetTitle) C6202b.m24689a(view2, i);
                        if (actionSheetTitle != null) {
                            i = C28164b.empty_banner;
                            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view2, i);
                            if (pageDescriptionView != null) {
                                i = C28164b.empty_banner_container;
                                LayerView layerView2 = (LayerView) C6202b.m24689a(view2, i);
                                if (layerView2 != null) {
                                    i = C28164b.f71510h;
                                    LayerView layerView3 = (LayerView) C6202b.m24689a(view2, i);
                                    if (layerView3 != null) {
                                        i = C28164b.f71514m;
                                        LoadingView loadingView = (LoadingView) C6202b.m24689a(view2, i);
                                        if (loadingView != null) {
                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view2;
                                            i = C28164b.f71517q;
                                            StateView stateView = (StateView) C6202b.m24689a(view2, i);
                                            if (stateView != null) {
                                                i = C28164b.sto_banner;
                                                ActionCardView actionCardView2 = (ActionCardView) C6202b.m24689a(view2, i);
                                                if (actionCardView2 != null) {
                                                    i = C28164b.sto_list;
                                                    LayerView layerView4 = (LayerView) C6202b.m24689a(view2, i);
                                                    if (layerView4 != null) {
                                                        i = C28164b.sto_recycler;
                                                        RecyclerView recyclerView2 = (RecyclerView) C6202b.m24689a(view2, i);
                                                        if (recyclerView2 != null) {
                                                            i = C28164b.sto_title;
                                                            ActionSheetTitle actionSheetTitle2 = (ActionSheetTitle) C6202b.m24689a(view2, i);
                                                            if (actionSheetTitle2 != null) {
                                                                return new C29004b(swipeRefreshLayout, linearLayout, actionCardView, layerView, recyclerView, actionSheetTitle, pageDescriptionView, layerView2, layerView3, loadingView, swipeRefreshLayout, stateView, actionCardView2, layerView4, recyclerView2, actionSheetTitle2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29004b m88742d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28165c.fragment_ddsto_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88741a(inflate);
    }

    /* renamed from: c */
    public SwipeRefreshLayout mo3946b() {
        return this.f73945d;
    }
}
