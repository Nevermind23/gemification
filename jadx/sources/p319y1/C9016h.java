package p319y1;

import p307x1.C8938d;
import p307x1.C8942h;

/* renamed from: y1.h */
public class C9016h {

    /* renamed from: a */
    private final C9017a f25075a;

    /* renamed from: b */
    private final C8942h f25076b;

    /* renamed from: c */
    private final C8938d f25077c;

    /* renamed from: d */
    private final boolean f25078d;

    /* renamed from: y1.h$a */
    public enum C9017a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public C9016h(C9017a aVar, C8942h hVar, C8938d dVar, boolean z) {
        this.f25075a = aVar;
        this.f25076b = hVar;
        this.f25077c = dVar;
        this.f25078d = z;
    }

    /* renamed from: a */
    public C9017a mo24447a() {
        return this.f25075a;
    }

    /* renamed from: b */
    public C8942h mo24448b() {
        return this.f25076b;
    }

    /* renamed from: c */
    public C8938d mo24449c() {
        return this.f25077c;
    }

    /* renamed from: d */
    public boolean mo24450d() {
        return this.f25078d;
    }
}
