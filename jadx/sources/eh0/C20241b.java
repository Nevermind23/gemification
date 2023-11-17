package eh0;

import bh0.C19385a;
import ch0.C19756a;
import ed1.C40749p;
import ed1.C40762x;
import ih0.C25213f;
import j51.C36735g;
import kh0.C25737a;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import m51.C37228a;
import md0.C26186e;
import nd0.C26453c;
import p341ge.bog.mobilebank.gamification.data.entity.GamificationTokenEntity;
import pd0.C27503h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: eh0.b */
public final class C20241b implements C25737a {

    /* renamed from: d */
    private final C19385a f55129d;

    /* renamed from: e */
    private final C36735g f55130e;

    /* renamed from: f */
    private final C19756a f55131f;

    /* renamed from: g */
    private final C27503h f55132g = new C27503h();

    /* renamed from: eh0.b$a */
    /* synthetic */ class C20242a extends C41535k implements C43075l {
        C20242a(Object obj) {
            super(1, obj, C19756a.class, "transform", "transform(Lge/bog/mobilebank/gamification/data/entity/GamificationTokenEntity;)Lge/bog/mobilebank/gamification/domain/model/GamificationToken;", 0);
        }

        /* renamed from: b */
        public final C25213f invoke(GamificationTokenEntity gamificationTokenEntity) {
            C41536l.m120489i(gamificationTokenEntity, "p0");
            return ((C19756a) this.receiver).mo47955a(gamificationTokenEntity);
        }
    }

    /* renamed from: eh0.b$b */
    /* synthetic */ class C20243b extends C41535k implements C43064a {
        C20243b(Object obj) {
            super(0, obj, C20241b.class, "getGamificationObservable", "getGamificationObservable()Lio/reactivex/Observable;", 0);
        }

        public final C40749p invoke() {
            return ((C20241b) this.receiver).m66252b4();
        }
    }

    public C20241b(C19385a aVar, C36735g gVar, C19756a aVar2) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(gVar, "getLoginInfoUseCase");
        C41536l.m120489i(aVar2, "mapper");
        this.f55129d = aVar;
        this.f55130e = gVar;
        this.f55131f = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public final C40749p m66252b4() {
        Long l;
        C19385a aVar = this.f55129d;
        C37228a a = this.f55130e.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        C40749p O = aVar.mo47604a(String.valueOf(l)).mo95062A(new C20240a(new C20242a(this.f55131f))).mo95075O();
        C41536l.m120488h(O, "service.getGamificationT…          .toObservable()");
        return O;
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public static final C25213f m66253c4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25213f) lVar.invoke(obj);
    }

    public void clean() {
        this.f55132g.mo66811l();
    }

    /* renamed from: q1 */
    public C40762x mo48714q1() {
        C40762x h = C26186e.m81990h(C26453c.m82747e(this.f55132g.mo66812m()));
        this.f55132g.mo66814o(true, new C20243b(this)).mo94979E0();
        return h;
    }
}
