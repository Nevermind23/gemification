package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import bv0.C31204d;
import bv0.C31205e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: ev0.j */
public final class C31829j implements C6201a {

    /* renamed from: d */
    private final StateView f78510d;

    /* renamed from: e */
    public final Button f78511e;

    /* renamed from: f */
    public final LinearLayout f78512f;

    /* renamed from: g */
    public final PageDescriptionView f78513g;

    /* renamed from: h */
    public final RecyclerView f78514h;

    /* renamed from: i */
    public final TextView f78515i;

    /* renamed from: j */
    public final TextView f78516j;

    /* renamed from: k */
    public final TextView f78517k;

    /* renamed from: l */
    public final NotificationBadgeView f78518l;

    /* renamed from: m */
    public final NotificationBadgeView f78519m;

    /* renamed from: n */
    public final NotificationBadgeView f78520n;

    /* renamed from: o */
    public final ScrollView f78521o;

    /* renamed from: p */
    public final PageDescriptionView f78522p;

    /* renamed from: q */
    public final Button f78523q;

    /* renamed from: r */
    public final LoadingView f78524r;

    /* renamed from: s */
    public final SwipeRefreshLayout f78525s;

    private C31829j(StateView stateView, Button button, LinearLayout linearLayout, PageDescriptionView pageDescriptionView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, NotificationBadgeView notificationBadgeView, NotificationBadgeView notificationBadgeView2, NotificationBadgeView notificationBadgeView3, ScrollView scrollView, PageDescriptionView pageDescriptionView2, Button button2, LoadingView loadingView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f78510d = stateView;
        this.f78511e = button;
        this.f78512f = linearLayout;
        this.f78513g = pageDescriptionView;
        this.f78514h = recyclerView;
        this.f78515i = textView;
        this.f78516j = textView2;
        this.f78517k = textView3;
        this.f78518l = notificationBadgeView;
        this.f78519m = notificationBadgeView2;
        this.f78520n = notificationBadgeView3;
        this.f78521o = scrollView;
        this.f78522p = pageDescriptionView2;
        this.f78523q = button2;
        this.f78524r = loadingView;
        this.f78525s = swipeRefreshLayout;
    }

    /* renamed from: a */
    public static C31829j m94105a(View view) {
        View view2 = view;
        int i = C31204d.f77525b;
        Button button = (Button) C6202b.m24689a(view2, i);
        if (button != null) {
            i = C31204d.f77536s;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
            if (linearLayout != null) {
                i = C31204d.f77537u;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view2, i);
                if (pageDescriptionView != null) {
                    i = C31204d.f77510C;
                    RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view2, i);
                    if (recyclerView != null) {
                        i = C31204d.no_data_info_description_1;
                        TextView textView = (TextView) C6202b.m24689a(view2, i);
                        if (textView != null) {
                            i = C31204d.no_data_info_description_2;
                            TextView textView2 = (TextView) C6202b.m24689a(view2, i);
                            if (textView2 != null) {
                                i = C31204d.no_data_info_description_3;
                                TextView textView3 = (TextView) C6202b.m24689a(view2, i);
                                if (textView3 != null) {
                                    i = C31204d.no_data_info_description_badge_1;
                                    NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view2, i);
                                    if (notificationBadgeView != null) {
                                        i = C31204d.no_data_info_description_badge_2;
                                        NotificationBadgeView notificationBadgeView2 = (NotificationBadgeView) C6202b.m24689a(view2, i);
                                        if (notificationBadgeView2 != null) {
                                            i = C31204d.no_data_info_description_badge_3;
                                            NotificationBadgeView notificationBadgeView3 = (NotificationBadgeView) C6202b.m24689a(view2, i);
                                            if (notificationBadgeView3 != null) {
                                                i = C31204d.f77512L;
                                                ScrollView scrollView = (ScrollView) C6202b.m24689a(view2, i);
                                                if (scrollView != null) {
                                                    i = C31204d.f77513M;
                                                    PageDescriptionView pageDescriptionView2 = (PageDescriptionView) C6202b.m24689a(view2, i);
                                                    if (pageDescriptionView2 != null) {
                                                        i = C31204d.f77519T;
                                                        Button button2 = (Button) C6202b.m24689a(view2, i);
                                                        if (button2 != null) {
                                                            i = C31204d.f77524a0;
                                                            LoadingView loadingView = (LoadingView) C6202b.m24689a(view2, i);
                                                            if (loadingView != null) {
                                                                i = C31204d.f77528c0;
                                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C6202b.m24689a(view2, i);
                                                                if (swipeRefreshLayout != null) {
                                                                    return new C31829j((StateView) view2, button, linearLayout, pageDescriptionView, recyclerView, textView, textView2, textView3, notificationBadgeView, notificationBadgeView2, notificationBadgeView3, scrollView, pageDescriptionView2, button2, loadingView, swipeRefreshLayout);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31829j m94106d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.fragment_other_banks_products, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94105a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f78510d;
    }
}
