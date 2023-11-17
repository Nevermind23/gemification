package p333z3;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.bitmap.C2504g;
import p166m3.C7088h;
import p192o3.C7430c;
import p205p3.C7676d;
import p321y3.C9046c;

/* renamed from: z3.c */
public final class C9201c implements C9203e {

    /* renamed from: a */
    private final C7676d f25618a;

    /* renamed from: b */
    private final C9203e f25619b;

    /* renamed from: c */
    private final C9203e f25620c;

    public C9201c(C7676d dVar, C9203e eVar, C9203e eVar2) {
        this.f25618a = dVar;
        this.f25619b = eVar;
        this.f25620c = eVar2;
    }

    /* renamed from: b */
    private static C7430c m34012b(C7430c cVar) {
        return cVar;
    }

    /* renamed from: a */
    public C7430c mo24838a(C7430c cVar, C7088h hVar) {
        Drawable drawable = (Drawable) cVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f25619b.mo24838a(C2504g.m9689e(((BitmapDrawable) drawable).getBitmap(), this.f25618a), hVar);
        }
        if (drawable instanceof C9046c) {
            return this.f25620c.mo24838a(m34012b(cVar), hVar);
        }
        return null;
    }
}
