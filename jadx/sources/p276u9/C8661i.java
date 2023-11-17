package p276u9;

import com.google.firebase.encoders.EncodingException;
import p237r9.C8071b;
import p237r9.C8077f;

/* renamed from: u9.i */
class C8661i implements C8077f {

    /* renamed from: a */
    private boolean f24467a = false;

    /* renamed from: b */
    private boolean f24468b = false;

    /* renamed from: c */
    private C8071b f24469c;

    /* renamed from: d */
    private final C8656f f24470d;

    C8661i(C8656f fVar) {
        this.f24470d = fVar;
    }

    /* renamed from: b */
    private void m32312b() {
        if (!this.f24467a) {
            this.f24467a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* renamed from: a */
    public C8077f mo23258a(String str) {
        m32312b();
        this.f24470d.mo23999h(this.f24469c, str, this.f24468b);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo24012c(C8071b bVar, boolean z) {
        this.f24467a = false;
        this.f24469c = bVar;
        this.f24468b = z;
    }

    /* renamed from: f */
    public C8077f mo23259f(boolean z) {
        m32312b();
        this.f24470d.mo24005n(this.f24469c, z, this.f24468b);
        return this;
    }
}
