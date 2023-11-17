package p342j$.util.function;

import p342j$.util.function.Predicate;

/* renamed from: j$.util.function.r0 */
public final /* synthetic */ class C9482r0 implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f26125a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f26126b;

    /* renamed from: c */
    public final /* synthetic */ Predicate f26127c;

    public /* synthetic */ C9482r0(Predicate predicate, Predicate predicate2, int i) {
        this.f26125a = i;
        this.f26126b = predicate;
        this.f26127c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f26125a) {
            case 0:
                return Predicate.CC.$default$and(this, predicate);
            default:
                return Predicate.CC.$default$and(this, predicate);
        }
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f26125a) {
            case 0:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo25500or(Predicate predicate) {
        switch (this.f26125a) {
            case 0:
                return Predicate.CC.$default$or(this, predicate);
            default:
                return Predicate.CC.$default$or(this, predicate);
        }
    }

    public final boolean test(Object obj) {
        int i = this.f26125a;
        Predicate predicate = this.f26127c;
        Predicate predicate2 = this.f26126b;
        switch (i) {
            case 0:
                return predicate2.test(obj) && predicate.test(obj);
            default:
                return predicate2.test(obj) || predicate.test(obj);
        }
    }
}
