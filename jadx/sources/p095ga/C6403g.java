package p095ga;

import com.google.firebase.C5270e;
import com.google.firebase.perf.config.C5380a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import ge1.C41084a;
import p327y9.C9142b;
import p339z9.C9270e;

/* renamed from: ga.g */
public final class C6403g implements C41084a {

    /* renamed from: a */
    private final C41084a f19647a;

    /* renamed from: b */
    private final C41084a f19648b;

    /* renamed from: c */
    private final C41084a f19649c;

    /* renamed from: d */
    private final C41084a f19650d;

    /* renamed from: e */
    private final C41084a f19651e;

    /* renamed from: f */
    private final C41084a f19652f;

    /* renamed from: g */
    private final C41084a f19653g;

    public C6403g(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4, C41084a aVar5, C41084a aVar6, C41084a aVar7) {
        this.f19647a = aVar;
        this.f19648b = aVar2;
        this.f19649c = aVar3;
        this.f19650d = aVar4;
        this.f19651e = aVar5;
        this.f19652f = aVar6;
        this.f19653g = aVar7;
    }

    /* renamed from: a */
    public static C6403g m25449a(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4, C41084a aVar5, C41084a aVar6, C41084a aVar7) {
        return new C6403g(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    /* renamed from: c */
    public static C6401e m25450c(C5270e eVar, C9142b bVar, C9270e eVar2, C9142b bVar2, RemoteConfigManager remoteConfigManager, C5380a aVar, SessionManager sessionManager) {
        return new C6401e(eVar, bVar, eVar2, bVar2, remoteConfigManager, aVar, sessionManager);
    }

    /* renamed from: b */
    public C6401e get() {
        return m25450c((C5270e) this.f19647a.get(), (C9142b) this.f19648b.get(), (C9270e) this.f19649c.get(), (C9142b) this.f19650d.get(), (RemoteConfigManager) this.f19651e.get(), (C5380a) this.f19652f.get(), (SessionManager) this.f19653g.get());
    }
}
