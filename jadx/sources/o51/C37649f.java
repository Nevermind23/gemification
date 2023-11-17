package o51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import n51.C37356b;
import n51.C37357c;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.datefilter.DateFilterView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p341ge.bog.designsystem.components.search.SearchView;
import p341ge.bog.designsystem.components.textgroup.TextGroupView;

/* renamed from: o51.f */
public final class C37649f implements C6201a {

    /* renamed from: d */
    private final LinearLayout f90473d;

    /* renamed from: e */
    public final DateFilterView f90474e;

    /* renamed from: f */
    public final Button f90475f;

    /* renamed from: g */
    public final Button f90476g;

    /* renamed from: h */
    public final Button f90477h;

    /* renamed from: i */
    public final NotificationBadgeView f90478i;

    /* renamed from: j */
    public final Button f90479j;

    /* renamed from: k */
    public final LinearLayout f90480k;

    /* renamed from: l */
    public final LinearLayout f90481l;

    /* renamed from: m */
    public final TextGroupView f90482m;

    /* renamed from: n */
    public final LinearLayout f90483n;

    /* renamed from: o */
    public final TextGroupView f90484o;

    /* renamed from: p */
    public final RecyclerView f90485p;

    /* renamed from: q */
    public final SwipeRefreshLayout f90486q;

    /* renamed from: r */
    public final SearchView f90487r;

    private C37649f(LinearLayout linearLayout, DateFilterView dateFilterView, Button button, Button button2, Button button3, NotificationBadgeView notificationBadgeView, Button button4, LinearLayout linearLayout2, LinearLayout linearLayout3, TextGroupView textGroupView, LinearLayout linearLayout4, TextGroupView textGroupView2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, SearchView searchView) {
        this.f90473d = linearLayout;
        this.f90474e = dateFilterView;
        this.f90475f = button;
        this.f90476g = button2;
        this.f90477h = button3;
        this.f90478i = notificationBadgeView;
        this.f90479j = button4;
        this.f90480k = linearLayout2;
        this.f90481l = linearLayout3;
        this.f90482m = textGroupView;
        this.f90483n = linearLayout4;
        this.f90484o = textGroupView2;
        this.f90485p = recyclerView;
        this.f90486q = swipeRefreshLayout;
        this.f90487r = searchView;
    }

    /* renamed from: a */
    public static C37649f m110689a(View view) {
        View view2 = view;
        int i = C37356b.date_range;
        DateFilterView dateFilterView = (DateFilterView) C6202b.m24689a(view2, i);
        if (dateFilterView != null) {
            i = C37356b.f89816H;
            Button button = (Button) C6202b.m24689a(view2, i);
            if (button != null) {
                i = C37356b.f89817J;
                Button button2 = (Button) C6202b.m24689a(view2, i);
                if (button2 != null) {
                    i = C37356b.error_refresh_button;
                    Button button3 = (Button) C6202b.m24689a(view2, i);
                    if (button3 != null) {
                        i = C37356b.filter_badge;
                        NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view2, i);
                        if (notificationBadgeView != null) {
                            i = C37356b.f89820U;
                            Button button4 = (Button) C6202b.m24689a(view2, i);
                            if (button4 != null) {
                                i = C37356b.filters;
                                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
                                if (linearLayout != null) {
                                    i = C37356b.loading_failed;
                                    LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view2, i);
                                    if (linearLayout2 != null) {
                                        i = C37356b.f89824f0;
                                        TextGroupView textGroupView = (TextGroupView) C6202b.m24689a(view2, i);
                                        if (textGroupView != null) {
                                            i = C37356b.no_items_found;
                                            LinearLayout linearLayout3 = (LinearLayout) C6202b.m24689a(view2, i);
                                            if (linearLayout3 != null) {
                                                i = C37356b.f89826j0;
                                                TextGroupView textGroupView2 = (TextGroupView) C6202b.m24689a(view2, i);
                                                if (textGroupView2 != null) {
                                                    i = C37356b.f89827k0;
                                                    RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view2, i);
                                                    if (recyclerView != null) {
                                                        i = C37356b.refresher;
                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C6202b.m24689a(view2, i);
                                                        if (swipeRefreshLayout != null) {
                                                            i = C37356b.f89831o0;
                                                            SearchView searchView = (SearchView) C6202b.m24689a(view2, i);
                                                            if (searchView != null) {
                                                                return new C37649f((LinearLayout) view2, dateFilterView, button, button2, button3, notificationBadgeView, button4, linearLayout, linearLayout2, textGroupView, linearLayout3, textGroupView2, recyclerView, swipeRefreshLayout, searchView);
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
    public static C37649f m110690d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37357c.fragment_statements, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m110689a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f90473d;
    }
}
