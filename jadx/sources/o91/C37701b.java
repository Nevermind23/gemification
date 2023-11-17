package o91;

import ed1.C40749p;
import ed1.C40762x;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m91.C37248a;
import md0.C26186e;
import n91.C37386a;
import nd0.C26453c;
import p341ge.bog.mobilebank.wishcampaign.data.entity.WishDetailsEntity;
import pd0.C27503h;
import s91.C38462a;
import t91.C38737a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: o91.b */
public final class C37701b implements C38737a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C37248a f90571d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C37386a f90572e;

    /* renamed from: f */
    private final C27503h f90573f = new C27503h();

    /* renamed from: o91.b$a */
    static final class C37702a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C37701b f90574d;

        /* renamed from: o91.b$a$a */
        /* synthetic */ class C37703a extends C41535k implements C43075l {
            C37703a(Object obj) {
                super(1, obj, C37386a.class, "transform", "transform(Lge/bog/mobilebank/wishcampaign/data/entity/WishDetailsEntity;)Lge/bog/mobilebank/wishcampaign/domain/model/WishDetails;", 0);
            }

            /* renamed from: b */
            public final C38462a invoke(WishDetailsEntity wishDetailsEntity) {
                C41536l.m120489i(wishDetailsEntity, "p0");
                return ((C37386a) this.receiver).mo90480a(wishDetailsEntity);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37702a(C37701b bVar) {
            super(0);
            this.f90574d = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C38462a m110812c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C38462a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40749p invoke() {
            C40749p O = this.f90574d.f90571d.mo90321a().mo95062A(new C37700a(new C37703a(this.f90574d.f90572e))).mo95075O();
            C41536l.m120488h(O, "service.getWishDetails()…transform).toObservable()");
            return O;
        }
    }

    public C37701b(C37248a aVar, C37386a aVar2) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "mapper");
        this.f90571d = aVar;
        this.f90572e = aVar2;
    }

    public void clean() {
        this.f90573f.mo66811l();
    }

    /* renamed from: r0 */
    public C40762x mo90895r0() {
        C40762x h = C26186e.m81990h(C26453c.m82747e(this.f90573f.mo66812m()));
        C27503h.m85292p(this.f90573f, (C27503h.C27516h) null, new C37702a(this), 1, (Object) null).mo94979E0();
        return h;
    }
}
