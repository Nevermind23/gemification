package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.a4 */
public final class C27248a4 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f68308d;

    /* renamed from: e */
    public final ScrollView f68309e;

    /* renamed from: f */
    public final WebView f68310f;

    /* renamed from: g */
    public final Button f68311g;

    /* renamed from: h */
    public final Button f68312h;

    /* renamed from: i */
    public final TwoLineReverseTextItem f68313i;

    /* renamed from: j */
    public final ListItem f68314j;

    private C27248a4(ConstraintLayout constraintLayout, ScrollView scrollView, WebView webView, Button button, Button button2, TwoLineReverseTextItem twoLineReverseTextItem, ListItem listItem) {
        this.f68308d = constraintLayout;
        this.f68309e = scrollView;
        this.f68310f = webView;
        this.f68311g = button;
        this.f68312h = button2;
        this.f68313i = twoLineReverseTextItem;
        this.f68314j = listItem;
    }

    /* renamed from: a */
    public static C27248a4 m84291a(View view) {
        int i = C10322k.conteiner_web_view;
        ScrollView scrollView = (ScrollView) C6202b.m24689a(view, i);
        if (scrollView != null) {
            i = C10322k.content_web_view;
            WebView webView = (WebView) C6202b.m24689a(view, i);
            if (webView != null) {
                i = C10322k.f28717Da;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    i = C10322k.f28899um;
                    Button button2 = (Button) C6202b.m24689a(view, i);
                    if (button2 != null) {
                        i = C10322k.f28915yx;
                        TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
                        if (twoLineReverseTextItem != null) {
                            i = C10322k.title_item;
                            ListItem listItem = (ListItem) C6202b.m24689a(view, i);
                            if (listItem != null) {
                                return new C27248a4((ConstraintLayout) view, scrollView, webView, button, button2, twoLineReverseTextItem, listItem);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27248a4 m84292d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_notification_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84291a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f68308d;
    }
}
