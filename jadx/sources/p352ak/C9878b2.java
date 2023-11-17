package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;
import p341ge.bog.designsystem.components.timer.TimerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.b2 */
public final class C9878b2 implements C6201a {

    /* renamed from: d */
    private final LayerView f26797d;

    /* renamed from: e */
    public final TextView f26798e;

    /* renamed from: f */
    public final TextView f26799f;

    /* renamed from: g */
    public final ImageView f26800g;

    /* renamed from: h */
    public final FrameLayout f26801h;

    /* renamed from: i */
    public final TextView f26802i;

    /* renamed from: j */
    public final TextProgressBarView f26803j;

    /* renamed from: k */
    public final RecyclerView f26804k;

    /* renamed from: l */
    public final ConstraintLayout f26805l;

    /* renamed from: m */
    public final TimerView f26806m;

    /* renamed from: n */
    public final TextView f26807n;

    private C9878b2(LayerView layerView, TextView textView, TextView textView2, ImageView imageView, FrameLayout frameLayout, TextView textView3, TextProgressBarView textProgressBarView, RecyclerView recyclerView, ConstraintLayout constraintLayout, TimerView timerView, TextView textView4) {
        this.f26797d = layerView;
        this.f26798e = textView;
        this.f26799f = textView2;
        this.f26800g = imageView;
        this.f26801h = frameLayout;
        this.f26802i = textView3;
        this.f26803j = textProgressBarView;
        this.f26804k = recyclerView;
        this.f26805l = constraintLayout;
        this.f26806m = timerView;
        this.f26807n = textView4;
    }

    /* renamed from: a */
    public static C9878b2 m36232a(View view) {
        int i = C17782g.f49676C;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C17782g.f49682E2;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                i = C17782g.f49787r4;
                ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                if (imageView != null) {
                    i = C17782g.img_frame;
                    FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                    if (frameLayout != null) {
                        i = C17782g.info_title_text;
                        TextView textView3 = (TextView) C6202b.m24689a(view, i);
                        if (textView3 != null) {
                            i = C17782g.f49722R6;
                            TextProgressBarView textProgressBarView = (TextProgressBarView) C6202b.m24689a(view, i);
                            if (textProgressBarView != null) {
                                i = C17782g.f49750c7;
                                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                                if (recyclerView != null) {
                                    i = C17782g.right_image_container;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view, i);
                                    if (constraintLayout != null) {
                                        i = C17782g.f49735V8;
                                        TimerView timerView = (TimerView) C6202b.m24689a(view, i);
                                        if (timerView != null) {
                                            i = C17782g.f49687G9;
                                            TextView textView4 = (TextView) C6202b.m24689a(view, i);
                                            if (textView4 != null) {
                                                return new C9878b2((LayerView) view, textView, textView2, imageView, frameLayout, textView3, textProgressBarView, recyclerView, constraintLayout, timerView, textView4);
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
    public static C9878b2 m36233d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_card_objective, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36232a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f26797d;
    }
}
