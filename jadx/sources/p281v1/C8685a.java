package p281v1;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.C2307a;
import java.util.HashMap;
import java.util.Map;
import p048d2.C5804f;
import p294w1.C8736c;
import p294w1.C8742i;

/* renamed from: v1.a */
public class C8685a {

    /* renamed from: a */
    private final C8742i f24502a = new C8742i();

    /* renamed from: b */
    private final Map f24503b = new HashMap();

    /* renamed from: c */
    private final Map f24504c = new HashMap();

    /* renamed from: d */
    private final AssetManager f24505d;

    /* renamed from: e */
    private String f24506e = ".ttf";

    public C8685a(Drawable.Callback callback, C2307a aVar) {
        if (!(callback instanceof View)) {
            C5804f.m23334c("LottieDrawable must be inside of a view for images to work.");
            this.f24505d = null;
            return;
        }
        this.f24505d = ((View) callback).getContext().getAssets();
    }

    /* renamed from: a */
    private Typeface m32405a(C8736c cVar) {
        String a = cVar.mo24127a();
        Typeface typeface = (Typeface) this.f24504c.get(a);
        if (typeface != null) {
            return typeface;
        }
        cVar.mo24129c();
        cVar.mo24128b();
        if (cVar.mo24130d() != null) {
            return cVar.mo24130d();
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f24505d, "fonts/" + a + this.f24506e);
        this.f24504c.put(a, createFromAsset);
        return createFromAsset;
    }

    /* renamed from: e */
    private Typeface m32406e(Typeface typeface, String str) {
        int i;
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        if (contains && contains2) {
            i = 3;
        } else if (contains) {
            i = 2;
        } else if (contains2) {
            i = 1;
        } else {
            i = 0;
        }
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }

    /* renamed from: b */
    public Typeface mo24058b(C8736c cVar) {
        this.f24502a.mo24148b(cVar.mo24127a(), cVar.mo24129c());
        Typeface typeface = (Typeface) this.f24503b.get(this.f24502a);
        if (typeface != null) {
            return typeface;
        }
        Typeface e = m32406e(m32405a(cVar), cVar.mo24129c());
        this.f24503b.put(this.f24502a, e);
        return e;
    }

    /* renamed from: c */
    public void mo24059c(String str) {
        this.f24506e = str;
    }

    /* renamed from: d */
    public void mo24060d(C2307a aVar) {
    }
}
