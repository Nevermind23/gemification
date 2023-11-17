package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.u1 */
public final class C27435u1 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f69905d;

    /* renamed from: e */
    public final DecoratedBarcodeView f69906e;

    /* renamed from: f */
    public final ImageView f69907f;

    /* renamed from: g */
    public final FrameLayout f69908g;

    /* renamed from: h */
    public final FrameLayout f69909h;

    private C27435u1(FrameLayout frameLayout, DecoratedBarcodeView decoratedBarcodeView, ImageView imageView, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        this.f69905d = frameLayout;
        this.f69906e = decoratedBarcodeView;
        this.f69907f = imageView;
        this.f69908g = frameLayout2;
        this.f69909h = frameLayout3;
    }

    /* renamed from: a */
    public static C27435u1 m85047a(View view) {
        int i = C10322k.barcode_scanner;
        DecoratedBarcodeView decoratedBarcodeView = (DecoratedBarcodeView) C6202b.m24689a(view, i);
        if (decoratedBarcodeView != null) {
            i = C10322k.f28804X7;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C10322k.f28913yq;
                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                if (frameLayout != null) {
                    FrameLayout frameLayout2 = (FrameLayout) view;
                    return new C27435u1(frameLayout2, decoratedBarcodeView, imageView, frameLayout, frameLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27435u1 m85048d(LayoutInflater layoutInflater) {
        return m85049e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27435u1 m85049e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_qr_scanner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85047a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f69905d;
    }
}
