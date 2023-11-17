package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.progressbadge.ProgressBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.i5 */
public final class C9937i5 implements C6201a {

    /* renamed from: d */
    private final View f27116d;

    /* renamed from: e */
    public final ProgressBadgeView f27117e;

    /* renamed from: f */
    public final LinearLayout f27118f;

    /* renamed from: g */
    public final ProgressBadgeView f27119g;

    /* renamed from: h */
    public final RecyclerView f27120h;

    /* renamed from: i */
    public final AppCompatTextView f27121i;

    /* renamed from: j */
    public final AppCompatTextView f27122j;

    /* renamed from: k */
    public final ProgressBadgeView f27123k;

    private C9937i5(View view, ProgressBadgeView progressBadgeView, LinearLayout linearLayout, ProgressBadgeView progressBadgeView2, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ProgressBadgeView progressBadgeView3) {
        this.f27116d = view;
        this.f27117e = progressBadgeView;
        this.f27118f = linearLayout;
        this.f27119g = progressBadgeView2;
        this.f27120h = recyclerView;
        this.f27121i = appCompatTextView;
        this.f27122j = appCompatTextView2;
        this.f27123k = progressBadgeView3;
    }

    /* renamed from: a */
    public static C9937i5 m36448a(View view) {
        int i = C17782g.first_progress_bar;
        ProgressBadgeView progressBadgeView = (ProgressBadgeView) C6202b.m24689a(view, i);
        if (progressBadgeView != null) {
            i = C17782g.f49730T6;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C17782g.second_progress_bar;
                ProgressBadgeView progressBadgeView2 = (ProgressBadgeView) C6202b.m24689a(view, i);
                if (progressBadgeView2 != null) {
                    i = C17782g.status_list_recycler_view;
                    RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                    if (recyclerView != null) {
                        i = C17782g.strength_info_text;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                        if (appCompatTextView != null) {
                            i = C17782g.strength_title_text;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                            if (appCompatTextView2 != null) {
                                i = C17782g.third_progress_bar;
                                ProgressBadgeView progressBadgeView3 = (ProgressBadgeView) C6202b.m24689a(view, i);
                                if (progressBadgeView3 != null) {
                                    return new C9937i5(view, progressBadgeView, linearLayout, progressBadgeView2, recyclerView, appCompatTextView, appCompatTextView2, progressBadgeView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9937i5 m36449c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_strength, viewGroup);
            return m36448a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27116d;
    }
}
