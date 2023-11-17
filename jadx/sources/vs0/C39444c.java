package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import rs0.C38336c;
import rs0.C38337d;

/* renamed from: vs0.c */
public final class C39444c implements C6201a {

    /* renamed from: A */
    public final Button f93688A;

    /* renamed from: B */
    public final StateView f93689B;

    /* renamed from: C */
    public final ToolbarView f93690C;

    /* renamed from: D */
    public final TwoLineReverseTextItem f93691D;

    /* renamed from: d */
    private final ConstraintLayout f93692d;

    /* renamed from: e */
    public final AppBarLayout f93693e;

    /* renamed from: f */
    public final PageDescriptionView f93694f;

    /* renamed from: g */
    public final LinearLayout f93695g;

    /* renamed from: h */
    public final FixedButtonView f93696h;

    /* renamed from: i */
    public final LayerView f93697i;

    /* renamed from: j */
    public final InlineFeedback f93698j;

    /* renamed from: k */
    public final EmptyWidget f93699k;

    /* renamed from: l */
    public final ConstraintLayout f93700l;

    /* renamed from: m */
    public final ListItem f93701m;

    /* renamed from: n */
    public final ImageView f93702n;

    /* renamed from: o */
    public final ImageView f93703o;

    /* renamed from: p */
    public final Input f93704p;

    /* renamed from: q */
    public final LoadingView f93705q;

    /* renamed from: r */
    public final AppCompatTextView f93706r;

    /* renamed from: s */
    public final AppCompatTextView f93707s;

    /* renamed from: t */
    public final NestedScrollView f93708t;

    /* renamed from: u */
    public final ListItem f93709u;

    /* renamed from: v */
    public final AppCompatTextView f93710v;

    /* renamed from: w */
    public final AppCompatTextView f93711w;

    /* renamed from: x */
    public final LinearLayout f93712x;

    /* renamed from: y */
    public final TwoLineReverseTextItem f93713y;

    /* renamed from: z */
    public final LinearLayout f93714z;

    private C39444c(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, PageDescriptionView pageDescriptionView, LinearLayout linearLayout, FixedButtonView fixedButtonView, LayerView layerView, InlineFeedback inlineFeedback, EmptyWidget emptyWidget, ConstraintLayout constraintLayout2, ListItem listItem, ImageView imageView, ImageView imageView2, Input input, LoadingView loadingView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, NestedScrollView nestedScrollView, ListItem listItem2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, LinearLayout linearLayout2, TwoLineReverseTextItem twoLineReverseTextItem, LinearLayout linearLayout3, Button button, StateView stateView, ToolbarView toolbarView, TwoLineReverseTextItem twoLineReverseTextItem2) {
        this.f93692d = constraintLayout;
        this.f93693e = appBarLayout;
        this.f93694f = pageDescriptionView;
        this.f93695g = linearLayout;
        this.f93696h = fixedButtonView;
        this.f93697i = layerView;
        this.f93698j = inlineFeedback;
        this.f93699k = emptyWidget;
        this.f93700l = constraintLayout2;
        this.f93701m = listItem;
        this.f93702n = imageView;
        this.f93703o = imageView2;
        this.f93704p = input;
        this.f93705q = loadingView;
        this.f93706r = appCompatTextView;
        this.f93707s = appCompatTextView2;
        this.f93708t = nestedScrollView;
        this.f93709u = listItem2;
        this.f93710v = appCompatTextView3;
        this.f93711w = appCompatTextView4;
        this.f93712x = linearLayout2;
        this.f93713y = twoLineReverseTextItem;
        this.f93714z = linearLayout3;
        this.f93688A = button;
        this.f93689B = stateView;
        this.f93690C = toolbarView;
        this.f93691D = twoLineReverseTextItem2;
    }

    /* renamed from: a */
    public static C39444c m114626a(View view) {
        View view2 = view;
        int i = C38336c.f91892t;
        AppBarLayout appBarLayout = (AppBarLayout) C6202b.m24689a(view2, i);
        if (appBarLayout != null) {
            i = C38336c.f91860Q;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view2, i);
            if (pageDescriptionView != null) {
                i = C38336c.errorViewLayout;
                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
                if (linearLayout != null) {
                    i = C38336c.exchange_button;
                    FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view2, i);
                    if (fixedButtonView != null) {
                        i = C38336c.exchange_content_layer_view;
                        LayerView layerView = (LayerView) C6202b.m24689a(view2, i);
                        if (layerView != null) {
                            i = C38336c.exchange_feedback;
                            InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view2, i);
                            if (inlineFeedback != null) {
                                i = C38336c.exchange_mr_to_plus_title;
                                EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view2, i);
                                if (emptyWidget != null) {
                                    i = C38336c.exchange_page_content;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view2, i);
                                    if (constraintLayout != null) {
                                        i = C38336c.header_list_item;
                                        ListItem listItem = (ListItem) C6202b.m24689a(view2, i);
                                        if (listItem != null) {
                                            i = C38336c.image_exchange;
                                            ImageView imageView = (ImageView) C6202b.m24689a(view2, i);
                                            if (imageView != null) {
                                                i = C38336c.image_plus;
                                                ImageView imageView2 = (ImageView) C6202b.m24689a(view2, i);
                                                if (imageView2 != null) {
                                                    i = C38336c.input_mr_exchange;
                                                    Input input = (Input) C6202b.m24689a(view2, i);
                                                    if (input != null) {
                                                        i = C38336c.loading_exchange_skeleton;
                                                        LoadingView loadingView = (LoadingView) C6202b.m24689a(view2, i);
                                                        if (loadingView != null) {
                                                            i = C38336c.mr_amount_in_gel_text_view;
                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view2, i);
                                                            if (appCompatTextView != null) {
                                                                i = C38336c.mr_points_text_view;
                                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view2, i);
                                                                if (appCompatTextView2 != null) {
                                                                    i = C38336c.nestedScrollContent;
                                                                    NestedScrollView nestedScrollView = (NestedScrollView) C6202b.m24689a(view2, i);
                                                                    if (nestedScrollView != null) {
                                                                        i = C38336c.plus_list_item;
                                                                        ListItem listItem2 = (ListItem) C6202b.m24689a(view2, i);
                                                                        if (listItem2 != null) {
                                                                            i = C38336c.f91862S0;
                                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view2, i);
                                                                            if (appCompatTextView3 != null) {
                                                                                i = C38336c.plus_points_in_gel;
                                                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) C6202b.m24689a(view2, i);
                                                                                if (appCompatTextView4 != null) {
                                                                                    i = C38336c.plus_points_linear_layout;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view2, i);
                                                                                    if (linearLayout2 != null) {
                                                                                        i = C38336c.plus_two_line_text_item;
                                                                                        TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view2, i);
                                                                                        if (twoLineReverseTextItem != null) {
                                                                                            i = C38336c.points_linear_layout;
                                                                                            LinearLayout linearLayout3 = (LinearLayout) C6202b.m24689a(view2, i);
                                                                                            if (linearLayout3 != null) {
                                                                                                i = C38336c.f91877j1;
                                                                                                Button button = (Button) C6202b.m24689a(view2, i);
                                                                                                if (button != null) {
                                                                                                    i = C38336c.f91889q1;
                                                                                                    StateView stateView = (StateView) C6202b.m24689a(view2, i);
                                                                                                    if (stateView != null) {
                                                                                                        i = C38336c.f91899x1;
                                                                                                        ToolbarView toolbarView = (ToolbarView) C6202b.m24689a(view2, i);
                                                                                                        if (toolbarView != null) {
                                                                                                            i = C38336c.f91852B1;
                                                                                                            TwoLineReverseTextItem twoLineReverseTextItem2 = (TwoLineReverseTextItem) C6202b.m24689a(view2, i);
                                                                                                            if (twoLineReverseTextItem2 != null) {
                                                                                                                return new C39444c((ConstraintLayout) view2, appBarLayout, pageDescriptionView, linearLayout, fixedButtonView, layerView, inlineFeedback, emptyWidget, constraintLayout, listItem, imageView, imageView2, input, loadingView, appCompatTextView, appCompatTextView2, nestedScrollView, listItem2, appCompatTextView3, appCompatTextView4, linearLayout2, twoLineReverseTextItem, linearLayout3, button, stateView, toolbarView, twoLineReverseTextItem2);
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
    public static C39444c m114627d(LayoutInflater layoutInflater) {
        return m114628e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C39444c m114628e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.activity_exchange_plus_points, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114626a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f93692d;
    }
}
