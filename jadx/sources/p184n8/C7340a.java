package p184n8;

import android.graphics.Typeface;

/* renamed from: n8.a */
public final class C7340a extends C7348f {

    /* renamed from: a */
    private final Typeface f21533a;

    /* renamed from: b */
    private final C7341a f21534b;

    /* renamed from: c */
    private boolean f21535c;

    /* renamed from: n8.a$a */
    public interface C7341a {
        /* renamed from: a */
        void mo16498a(Typeface typeface);
    }

    public C7340a(C7341a aVar, Typeface typeface) {
        this.f21533a = typeface;
        this.f21534b = aVar;
    }

    /* renamed from: d */
    private void m27992d(Typeface typeface) {
        if (!this.f21535c) {
            this.f21534b.mo16498a(typeface);
        }
    }

    /* renamed from: a */
    public void mo16009a(int i) {
        m27992d(this.f21533a);
    }

    /* renamed from: b */
    public void mo16010b(Typeface typeface, boolean z) {
        m27992d(typeface);
    }

    /* renamed from: c */
    public void mo21715c() {
        this.f21535c = true;
    }
}
