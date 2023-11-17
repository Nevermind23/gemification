package nh0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import hd1.C41204a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lh0.C26011b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;

/* renamed from: nh0.e */
public final class C26498e extends C21481a implements C26495b, C26496c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C26011b f67085d;

    /* renamed from: e */
    private final C26495b f67086e = this;

    /* renamed from: f */
    private final C26496c f67087f = this;

    /* renamed from: g */
    private final C1644x f67088g;

    /* renamed from: nh0.e$a */
    static final class C26499a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26498e f67089d;

        /* renamed from: e */
        final /* synthetic */ String f67090e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26499a(C26498e eVar, String str) {
            super(1);
            this.f67089d = eVar;
            this.f67090e = str;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return C31270e.m92880i(this.f67089d.f67085d.mo64899c(this.f67090e), num.intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26498e(C26011b bVar, String str) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getGamificationUrl");
        this.f67085d = bVar;
        C1644x xVar = new C1644x();
        this.f67088g = xVar;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C26497d(new C26499a(this, str)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…ervable(it)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m82799ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: gw */
    public final C26496c mo65778gw() {
        return this.f67087f;
    }

    /* renamed from: ks */
    public LiveData mo65777ks() {
        return this.f67088g;
    }
}
