package p685yj;

import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: yj.c */
public final class C18927c implements C18925a {

    /* renamed from: a */
    private final Path f52927a = new Path();

    /* renamed from: b */
    private final Paint f52928b = new Paint(1);

    /* renamed from: c */
    private C18926b f52929c;

    public C18927c() {
        mo46977d().setColor(-16777216);
        mo46977d().setStyle(Paint.Style.FILL);
        mo46977d().setAntiAlias(true);
        mo46977d().setStrokeWidth(1.0f);
    }

    /* renamed from: c */
    private final Path m64009c(int i, int i2) {
        C18926b bVar = this.f52929c;
        if (bVar != null) {
            return bVar.mo37147a(i, i2);
        }
        return null;
    }

    /* renamed from: a */
    public Path mo46974a() {
        return this.f52927a;
    }

    /* renamed from: b */
    public void mo46975b(int i, int i2) {
        this.f52927a.reset();
        Path c = m64009c(i, i2);
        if (c != null) {
            this.f52927a.set(c);
        }
    }

    /* renamed from: d */
    public Paint mo46977d() {
        return this.f52928b;
    }

    /* renamed from: e */
    public final void mo46978e(C18926b bVar) {
        this.f52929c = bVar;
    }

    /* renamed from: z */
    public Path mo46976z() {
        return this.f52927a;
    }
}
