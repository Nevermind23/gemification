package p857pq;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloApplicationDataUiModel;
import p735dr.C20050b;
import p817lq.C26056a;

/* renamed from: pq.a */
public final class C27603a {

    /* renamed from: a */
    private final C27604b f70535a;

    /* renamed from: b */
    private final C20050b f70536b;

    public C27603a(C27604b bVar, C20050b bVar2) {
        C41536l.m120489i(bVar, "dropdownUiMapper");
        C41536l.m120489i(bVar2, "serviceCenterUiMapper");
        this.f70535a = bVar;
        this.f70536b = bVar2;
    }

    /* renamed from: a */
    public final BecomeSoloApplicationDataUiModel mo66973a(C26056a aVar) {
        C41536l.m120489i(aVar, "data");
        return new BecomeSoloApplicationDataUiModel(this.f70535a.mo66974a(aVar.mo64956b()), this.f70536b.mo48461a(aVar.mo64958d()), aVar.mo64957c(), aVar.mo64955a());
    }
}
