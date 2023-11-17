package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.d5 */
public final class C9897d5 implements C6201a {

    /* renamed from: d */
    private final LayerView f26899d;

    /* renamed from: e */
    public final LayerView f26900e;

    /* renamed from: f */
    public final AppCompatTextView f26901f;

    /* renamed from: g */
    public final AppCompatImageView f26902g;

    /* renamed from: h */
    public final LayerView f26903h;

    /* renamed from: i */
    public final AppCompatTextView f26904i;

    /* renamed from: j */
    public final LayerView f26905j;

    /* renamed from: k */
    public final AppCompatTextView f26906k;

    /* renamed from: l */
    public final AppCompatTextView f26907l;

    /* renamed from: m */
    public final AppCompatImageView f26908m;

    /* renamed from: n */
    public final LayerView f26909n;

    /* renamed from: o */
    public final AppCompatTextView f26910o;

    /* renamed from: p */
    public final AppCompatTextView f26911p;

    /* renamed from: q */
    public final AppCompatImageView f26912q;

    /* renamed from: r */
    public final LayerView f26913r;

    /* renamed from: s */
    public final AppCompatTextView f26914s;

    private C9897d5(LayerView layerView, LayerView layerView2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, LayerView layerView3, AppCompatTextView appCompatTextView2, LayerView layerView4, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatImageView appCompatImageView2, LayerView layerView5, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatImageView appCompatImageView3, LayerView layerView6, AppCompatTextView appCompatTextView7) {
        this.f26899d = layerView;
        this.f26900e = layerView2;
        this.f26901f = appCompatTextView;
        this.f26902g = appCompatImageView;
        this.f26903h = layerView3;
        this.f26904i = appCompatTextView2;
        this.f26905j = layerView4;
        this.f26906k = appCompatTextView3;
        this.f26907l = appCompatTextView4;
        this.f26908m = appCompatImageView2;
        this.f26909n = layerView5;
        this.f26910o = appCompatTextView5;
        this.f26911p = appCompatTextView6;
        this.f26912q = appCompatImageView3;
        this.f26913r = layerView6;
        this.f26914s = appCompatTextView7;
    }

    /* renamed from: a */
    public static C9897d5 m36301a(View view) {
        View view2 = view;
        LayerView layerView = (LayerView) view2;
        int i = C17782g.bottom_desc;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view2, i);
        if (appCompatTextView != null) {
            i = C17782g.bottom_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view2, i);
            if (appCompatImageView != null) {
                i = C17782g.f49806w0;
                LayerView layerView2 = (LayerView) C6202b.m24689a(view2, i);
                if (layerView2 != null) {
                    i = C17782g.bottom_title;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view2, i);
                    if (appCompatTextView2 != null) {
                        i = C17782g.button_layer;
                        LayerView layerView3 = (LayerView) C6202b.m24689a(view2, i);
                        if (layerView3 != null) {
                            i = C17782g.f49709N0;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view2, i);
                            if (appCompatTextView3 != null) {
                                i = C17782g.f49704L3;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) C6202b.m24689a(view2, i);
                                if (appCompatTextView4 != null) {
                                    i = C17782g.header_icon;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view2, i);
                                    if (appCompatImageView2 != null) {
                                        i = C17782g.header_icon_layer;
                                        LayerView layerView4 = (LayerView) C6202b.m24689a(view2, i);
                                        if (layerView4 != null) {
                                            i = C17782g.f49718P3;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) C6202b.m24689a(view2, i);
                                            if (appCompatTextView5 != null) {
                                                i = C17782g.top_desc;
                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) C6202b.m24689a(view2, i);
                                                if (appCompatTextView6 != null) {
                                                    i = C17782g.top_icon;
                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) C6202b.m24689a(view2, i);
                                                    if (appCompatImageView3 != null) {
                                                        i = C17782g.top_layer;
                                                        LayerView layerView5 = (LayerView) C6202b.m24689a(view2, i);
                                                        if (layerView5 != null) {
                                                            i = C17782g.top_title;
                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) C6202b.m24689a(view2, i);
                                                            if (appCompatTextView7 != null) {
                                                                return new C9897d5(layerView, layerView, appCompatTextView, appCompatImageView, layerView2, appCompatTextView2, layerView3, appCompatTextView3, appCompatTextView4, appCompatImageView2, layerView4, appCompatTextView5, appCompatTextView6, appCompatImageView3, layerView5, appCompatTextView7);
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
    public static C9897d5 m36302d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_solo_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36301a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f26899d;
    }
}
