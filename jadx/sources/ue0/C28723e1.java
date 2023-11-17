package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.github.mikephil.charting.charts.LineChart;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.designsystem.components.loading.LoadingView;

/* renamed from: ue0.e1 */
public final class C28723e1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f73213d;

    /* renamed from: e */
    public final FrameLayout f73214e;

    /* renamed from: f */
    public final ImageView f73215f;

    /* renamed from: g */
    public final LineChart f73216g;

    /* renamed from: h */
    public final AppCompatImageView f73217h;

    /* renamed from: i */
    public final TwoLineReverseTextItem f73218i;

    /* renamed from: j */
    public final LoadingView f73219j;

    /* renamed from: k */
    public final TwoLineReverseTextItem f73220k;

    private C28723e1(LinearLayout linearLayout, FrameLayout frameLayout, ImageView imageView, LineChart lineChart, AppCompatImageView appCompatImageView, TwoLineReverseTextItem twoLineReverseTextItem, LoadingView loadingView, TwoLineReverseTextItem twoLineReverseTextItem2) {
        this.f73213d = linearLayout;
        this.f73214e = frameLayout;
        this.f73215f = imageView;
        this.f73216g = lineChart;
        this.f73217h = appCompatImageView;
        this.f73218i = twoLineReverseTextItem;
        this.f73219j = loadingView;
        this.f73220k = twoLineReverseTextItem2;
    }

    /* renamed from: a */
    public static C28723e1 m88011a(View view) {
        int i = C25187g.chartContainer;
        FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
        if (frameLayout != null) {
            i = C25187g.chart_image;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C25187g.chartView;
                LineChart lineChart = (LineChart) C6202b.m24689a(view, i);
                if (lineChart != null) {
                    i = C25187g.company_image;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                    if (appCompatImageView != null) {
                        i = C25187g.company_two_line_item;
                        TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
                        if (twoLineReverseTextItem != null) {
                            i = C25187g.f64722v1;
                            LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
                            if (loadingView != null) {
                                i = C25187g.values_two_line_item;
                                TwoLineReverseTextItem twoLineReverseTextItem2 = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
                                if (twoLineReverseTextItem2 != null) {
                                    return new C28723e1((LinearLayout) view, frameLayout, imageView, lineChart, appCompatImageView, twoLineReverseTextItem, loadingView, twoLineReverseTextItem2);
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
    public static C28723e1 m88012d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.search_symbol_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88011a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f73213d;
    }
}
