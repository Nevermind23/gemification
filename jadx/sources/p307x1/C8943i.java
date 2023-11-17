package p307x1;

import java.util.List;
import p268u1.C8525a;
import p268u1.C8545n;

/* renamed from: x1.i */
public class C8943i implements C8947m {

    /* renamed from: a */
    private final C8936b f24938a;

    /* renamed from: b */
    private final C8936b f24939b;

    public C8943i(C8936b bVar, C8936b bVar2) {
        this.f24938a = bVar;
        this.f24939b = bVar2;
    }

    /* renamed from: a */
    public C8525a mo24353a() {
        return new C8545n(this.f24938a.mo24353a(), this.f24939b.mo24353a());
    }

    /* renamed from: b */
    public List mo24354b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    /* renamed from: c */
    public boolean mo24355c() {
        return this.f24938a.mo24355c() && this.f24939b.mo24355c();
    }
}
