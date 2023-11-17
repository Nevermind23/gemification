package ha0;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import da0.C19951e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.imageselector.ImageSelectorView;

/* renamed from: ha0.z */
public final class C24949z implements C6201a {

    /* renamed from: d */
    private final FrameLayout f64266d;

    /* renamed from: e */
    public final View f64267e;

    /* renamed from: f */
    public final ImageSelectorView f64268f;

    /* renamed from: g */
    public final TextView f64269g;

    private C24949z(FrameLayout frameLayout, View view, ImageSelectorView imageSelectorView, TextView textView) {
        this.f64266d = frameLayout;
        this.f64267e = view;
        this.f64268f = imageSelectorView;
        this.f64269g = textView;
    }

    /* renamed from: a */
    public static C24949z m79776a(View view) {
        int i = C19951e.click_placeholder;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C19951e.image_selector;
            ImageSelectorView imageSelectorView = (ImageSelectorView) C6202b.m24689a(view, i);
            if (imageSelectorView != null) {
                i = C19951e.f54508F0;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    return new C24949z((FrameLayout) view, a, imageSelectorView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f64266d;
    }
}
