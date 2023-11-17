package p376cg;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p653wf.C18588q;

/* renamed from: cg.m */
public final class C10434m implements C6201a {

    /* renamed from: d */
    private final LinearLayout f29715d;

    /* renamed from: e */
    public final ImageView f29716e;

    /* renamed from: f */
    public final TextBadgeView f29717f;

    /* renamed from: g */
    public final Button f29718g;

    /* renamed from: h */
    public final AppCompatTextView f29719h;

    /* renamed from: i */
    public final AppCompatTextView f29720i;

    private C10434m(LinearLayout linearLayout, ImageView imageView, TextBadgeView textBadgeView, Button button, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f29715d = linearLayout;
        this.f29716e = imageView;
        this.f29717f = textBadgeView;
        this.f29718g = button;
        this.f29719h = appCompatTextView;
        this.f29720i = appCompatTextView2;
    }

    /* renamed from: a */
    public static C10434m m37900a(View view) {
        int i = C18588q.bankLogo;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C18588q.digital_assistant_badge;
            TextBadgeView textBadgeView = (TextBadgeView) C6202b.m24689a(view, i);
            if (textBadgeView != null) {
                i = C18588q.f52160d0;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    i = C18588q.operatorTextView;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView != null) {
                        i = C18588q.participantName;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                        if (appCompatTextView2 != null) {
                            return new C10434m((LinearLayout) view, imageView, textBadgeView, button, appCompatTextView, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f29715d;
    }
}
