package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.n0 */
public final class C9972n0 implements C6201a {

    /* renamed from: d */
    private final LayerView f27285d;

    /* renamed from: e */
    public final FrameLayout f27286e;

    /* renamed from: f */
    public final LinearLayout f27287f;

    /* renamed from: g */
    public final InlineFeedback f27288g;

    /* renamed from: h */
    public final EmptyWidget f27289h;

    /* renamed from: i */
    public final Button f27290i;

    /* renamed from: j */
    public final Button f27291j;

    /* renamed from: k */
    public final FlexboxLayout f27292k;

    /* renamed from: l */
    public final Button f27293l;

    /* renamed from: m */
    public final RecyclerView f27294m;

    /* renamed from: n */
    public final TextProgressBarView f27295n;

    private C9972n0(LayerView layerView, FrameLayout frameLayout, LinearLayout linearLayout, InlineFeedback inlineFeedback, EmptyWidget emptyWidget, Button button, Button button2, FlexboxLayout flexboxLayout, Button button3, RecyclerView recyclerView, TextProgressBarView textProgressBarView) {
        this.f27285d = layerView;
        this.f27286e = frameLayout;
        this.f27287f = linearLayout;
        this.f27288g = inlineFeedback;
        this.f27289h = emptyWidget;
        this.f27290i = button;
        this.f27291j = button2;
        this.f27292k = flexboxLayout;
        this.f27293l = button3;
        this.f27294m = recyclerView;
        this.f27295n = textProgressBarView;
    }

    /* renamed from: a */
    public static C9972n0 m36576a(View view) {
        int i = C17782g.action_layout;
        FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
        if (frameLayout != null) {
            i = C17782g.f49731U1;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C17782g.f49782q3;
                InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
                if (inlineFeedback != null) {
                    i = C17782g.f49685G3;
                    EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                    if (emptyWidget != null) {
                        i = C17782g.icon_button;
                        Button button = (Button) C6202b.m24689a(view, i);
                        if (button != null) {
                            i = C17782g.icon_text_button;
                            Button button2 = (Button) C6202b.m24689a(view, i);
                            if (button2 != null) {
                                i = C17782g.progress_badge;
                                FlexboxLayout flexboxLayout = (FlexboxLayout) C6202b.m24689a(view, i);
                                if (flexboxLayout != null) {
                                    i = C17782g.small_text_button;
                                    Button button3 = (Button) C6202b.m24689a(view, i);
                                    if (button3 != null) {
                                        i = C17782g.statisticsRecycler;
                                        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                                        if (recyclerView != null) {
                                            i = C17782g.f49698J8;
                                            TextProgressBarView textProgressBarView = (TextProgressBarView) C6202b.m24689a(view, i);
                                            if (textProgressBarView != null) {
                                                return new C9972n0((LayerView) view, frameLayout, linearLayout, inlineFeedback, emptyWidget, button, button2, flexboxLayout, button3, recyclerView, textProgressBarView);
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
    public static C9972n0 m36577d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.statistics_widget, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36576a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f27285d;
    }
}
