package p442gp;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import g91.C32343x;
import hd1.C41204a;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p441go.C15391n;
import p470ip.C15732a;
import ue1.C43075l;

/* renamed from: gp.k */
public final class C15439k extends C21481a implements C15435g, C15436h {

    /* renamed from: d */
    private final C15435g f43843d = this;

    /* renamed from: e */
    private final C15436h f43844e = this;

    /* renamed from: f */
    private final C1644x f43845f;

    /* renamed from: gp.k$a */
    static final class C15440a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15391n f43846d;

        /* renamed from: e */
        final /* synthetic */ long f43847e;

        /* renamed from: f */
        final /* synthetic */ C15732a f43848f;

        /* renamed from: gp.k$a$a */
        /* synthetic */ class C15441a extends C41535k implements C43075l {
            C15441a(Object obj) {
                super(1, obj, C15732a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C15732a) this.receiver).mo43112b(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15440a(C15391n nVar, long j, C15732a aVar) {
            super(1);
            this.f43846d = nVar;
            this.f43847e = j;
            this.f43848f = aVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40762x A = this.f43846d.mo42491a(this.f43847e).mo95062A(new C15438j(new C15441a(this.f43848f)));
            C41536l.m120488h(A, "getStatisticsTransaction…  .map(mapper::transform)");
            return C31270e.m92880i(A, -1);
        }
    }

    /* renamed from: gp.k$b */
    public interface C15442b {
        /* renamed from: a */
        C15439k mo32778a(long j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15439k(C15391n nVar, C15732a aVar, long j) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(nVar, "getStatisticsTransactions");
        C41536l.m120489i(aVar, "mapper");
        C1644x xVar = new C1644x();
        this.f43845f = xVar;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C15437i(new C15440a(nVar, j, aVar)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…QUEST_CODE)\n            }");
        C31270e.m92876e(C32343x.m95413R0(L0), xVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m55916ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: a6 */
    public LiveData mo42522a6() {
        return this.f43845f;
    }

    /* renamed from: fw */
    public final C15436h mo42523fw() {
        return this.f43844e;
    }
}
