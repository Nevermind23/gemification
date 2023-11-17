package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import rs0.C38336c;
import rs0.C38337d;

/* renamed from: vs0.g */
public final class C39448g implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f93747d;

    /* renamed from: e */
    public final AppBarLayout f93748e;

    /* renamed from: f */
    public final ListItem f93749f;

    /* renamed from: g */
    public final EmptyWidget f93750g;

    /* renamed from: h */
    public final Button f93751h;

    /* renamed from: i */
    public final NestedScrollView f93752i;

    /* renamed from: j */
    public final PageState f93753j;

    /* renamed from: k */
    public final AppCompatTextView f93754k;

    /* renamed from: l */
    public final AppCompatTextView f93755l;

    /* renamed from: m */
    public final AppCompatTextView f93756m;

    /* renamed from: n */
    public final TwoLineReverseTextItem f93757n;

    /* renamed from: o */
    public final ImageView f93758o;

    /* renamed from: p */
    public final AppCompatTextView f93759p;

    /* renamed from: q */
    public final ShimmerFrameLayout f93760q;

    /* renamed from: r */
    public final TwoLineReverseTextItem f93761r;

    /* renamed from: s */
    public final AppCompatTextView f93762s;

    /* renamed from: t */
    public final AppCompatTextView f93763t;

    /* renamed from: u */
    public final TwoLineReverseTextItem f93764u;

    /* renamed from: v */
    public final ToolbarView f93765v;

    private C39448g(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, ListItem listItem, EmptyWidget emptyWidget, Button button, NestedScrollView nestedScrollView, PageState pageState, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, TwoLineReverseTextItem twoLineReverseTextItem, ImageView imageView, AppCompatTextView appCompatTextView4, ShimmerFrameLayout shimmerFrameLayout, TwoLineReverseTextItem twoLineReverseTextItem2, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, TwoLineReverseTextItem twoLineReverseTextItem3, ToolbarView toolbarView) {
        this.f93747d = constraintLayout;
        this.f93748e = appBarLayout;
        this.f93749f = listItem;
        this.f93750g = emptyWidget;
        this.f93751h = button;
        this.f93752i = nestedScrollView;
        this.f93753j = pageState;
        this.f93754k = appCompatTextView;
        this.f93755l = appCompatTextView2;
        this.f93756m = appCompatTextView3;
        this.f93757n = twoLineReverseTextItem;
        this.f93758o = imageView;
        this.f93759p = appCompatTextView4;
        this.f93760q = shimmerFrameLayout;
        this.f93761r = twoLineReverseTextItem2;
        this.f93762s = appCompatTextView5;
        this.f93763t = appCompatTextView6;
        this.f93764u = twoLineReverseTextItem3;
        this.f93765v = toolbarView;
    }

    /* renamed from: a */
    public static C39448g m114646a(View view) {
        View view2 = view;
        int i = C38336c.f91892t;
        AppBarLayout appBarLayout = (AppBarLayout) C6202b.m24689a(view2, i);
        if (appBarLayout != null) {
            i = C38336c.f91895v;
            ListItem listItem = (ListItem) C6202b.m24689a(view2, i);
            if (listItem != null) {
                i = C38336c.f91856K;
                EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view2, i);
                if (emptyWidget != null) {
                    i = C38336c.f91873f0;
                    Button button = (Button) C6202b.m24689a(view2, i);
                    if (button != null) {
                        i = C38336c.f91896w0;
                        NestedScrollView nestedScrollView = (NestedScrollView) C6202b.m24689a(view2, i);
                        if (nestedScrollView != null) {
                            i = C38336c.f91898x0;
                            PageState pageState = (PageState) C6202b.m24689a(view2, i);
                            if (pageState != null) {
                                i = C38336c.points;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view2, i);
                                if (appCompatTextView != null) {
                                    i = C38336c.points_from;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view2, i);
                                    if (appCompatTextView2 != null) {
                                        i = C38336c.points_from_in_gel;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view2, i);
                                        if (appCompatTextView3 != null) {
                                            i = C38336c.points_from_text;
                                            TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view2, i);
                                            if (twoLineReverseTextItem != null) {
                                                i = C38336c.points_icon;
                                                ImageView imageView = (ImageView) C6202b.m24689a(view2, i);
                                                if (imageView != null) {
                                                    i = C38336c.points_in_gel;
                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) C6202b.m24689a(view2, i);
                                                    if (appCompatTextView4 != null) {
                                                        i = C38336c.points_loading;
                                                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C6202b.m24689a(view2, i);
                                                        if (shimmerFrameLayout != null) {
                                                            i = C38336c.points_text;
                                                            TwoLineReverseTextItem twoLineReverseTextItem2 = (TwoLineReverseTextItem) C6202b.m24689a(view2, i);
                                                            if (twoLineReverseTextItem2 != null) {
                                                                i = C38336c.points_to;
                                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) C6202b.m24689a(view2, i);
                                                                if (appCompatTextView5 != null) {
                                                                    i = C38336c.points_to_in_gel;
                                                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) C6202b.m24689a(view2, i);
                                                                    if (appCompatTextView6 != null) {
                                                                        i = C38336c.points_to_text;
                                                                        TwoLineReverseTextItem twoLineReverseTextItem3 = (TwoLineReverseTextItem) C6202b.m24689a(view2, i);
                                                                        if (twoLineReverseTextItem3 != null) {
                                                                            i = C38336c.f91899x1;
                                                                            ToolbarView toolbarView = (ToolbarView) C6202b.m24689a(view2, i);
                                                                            if (toolbarView != null) {
                                                                                return new C39448g((ConstraintLayout) view2, appBarLayout, listItem, emptyWidget, button, nestedScrollView, pageState, appCompatTextView, appCompatTextView2, appCompatTextView3, twoLineReverseTextItem, imageView, appCompatTextView4, shimmerFrameLayout, twoLineReverseTextItem2, appCompatTextView5, appCompatTextView6, twoLineReverseTextItem3, toolbarView);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39448g m114647d(LayoutInflater layoutInflater) {
        return m114648e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C39448g m114648e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.activity_points_exchange_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114646a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f93747d;
    }
}
