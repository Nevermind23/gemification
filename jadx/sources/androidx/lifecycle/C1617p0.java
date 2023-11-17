package androidx.lifecycle;

import af1.C40296c;
import androidx.lifecycle.C1620q0;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import te1.C42994a;
import ue1.C43064a;

/* renamed from: androidx.lifecycle.p0 */
public final class C1617p0 implements C41217g {

    /* renamed from: d */
    private final C40296c f4630d;

    /* renamed from: e */
    private final C43064a f4631e;

    /* renamed from: f */
    private final C43064a f4632f;

    /* renamed from: g */
    private final C43064a f4633g;

    /* renamed from: h */
    private C1613n0 f4634h;

    /* renamed from: androidx.lifecycle.p0$a */
    static final class C1618a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C1618a f4635d = new C1618a();

        C1618a() {
            super(0);
        }

        /* renamed from: b */
        public final C7047a.C7048a invoke() {
            return C7047a.C7048a.f20987b;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1617p0(C40296c cVar, C43064a aVar, C43064a aVar2) {
        this(cVar, aVar, aVar2, (C43064a) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "viewModelClass");
        C41536l.m120489i(aVar, "storeProducer");
        C41536l.m120489i(aVar2, "factoryProducer");
    }

    /* renamed from: a */
    public boolean mo4932a() {
        return this.f4634h != null;
    }

    /* renamed from: b */
    public C1613n0 getValue() {
        C1613n0 n0Var = this.f4634h;
        if (n0Var != null) {
            return n0Var;
        }
        C1613n0 a = new C1620q0((C1636t0) this.f4631e.invoke(), (C1620q0.C1624b) this.f4632f.invoke(), (C7047a) this.f4633g.invoke()).mo4936a(C42994a.m123348a(this.f4630d));
        this.f4634h = a;
        return a;
    }

    public C1617p0(C40296c cVar, C43064a aVar, C43064a aVar2, C43064a aVar3) {
        C41536l.m120489i(cVar, "viewModelClass");
        C41536l.m120489i(aVar, "storeProducer");
        C41536l.m120489i(aVar2, "factoryProducer");
        C41536l.m120489i(aVar3, "extrasProducer");
        this.f4630d = cVar;
        this.f4631e = aVar;
        this.f4632f = aVar2;
        this.f4633g = aVar3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1617p0(C40296c cVar, C43064a aVar, C43064a aVar2, C43064a aVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, aVar, aVar2, (i & 8) != 0 ? C1618a.f4635d : aVar3);
    }
}
