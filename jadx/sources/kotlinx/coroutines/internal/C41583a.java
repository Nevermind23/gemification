package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.a */
public class C41583a {

    /* renamed from: a */
    private Object[] f97770a = new Object[16];

    /* renamed from: b */
    private int f97771b;

    /* renamed from: c */
    private int f97772c;

    /* renamed from: b */
    private final void m120621b() {
        Object[] objArr = this.f97770a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        Object[] unused = C41331l.m119763g(objArr, objArr3, 0, this.f97771b, 0, 10, (Object) null);
        Object[] objArr4 = this.f97770a;
        int length2 = objArr4.length;
        int i = this.f97771b;
        Object[] unused2 = C41331l.m119763g(objArr4, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f97770a = objArr3;
        this.f97771b = 0;
        this.f97772c = length;
    }

    /* renamed from: a */
    public final void mo96351a(Object obj) {
        Object[] objArr = this.f97770a;
        int i = this.f97772c;
        objArr[i] = obj;
        int length = (objArr.length - 1) & (i + 1);
        this.f97772c = length;
        if (length == this.f97771b) {
            m120621b();
        }
    }

    /* renamed from: c */
    public final boolean mo96352c() {
        return this.f97771b == this.f97772c;
    }

    /* renamed from: d */
    public final Object mo96353d() {
        int i = this.f97771b;
        if (i == this.f97772c) {
            return null;
        }
        Object[] objArr = this.f97770a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f97771b = (i + 1) & (objArr.length - 1);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
