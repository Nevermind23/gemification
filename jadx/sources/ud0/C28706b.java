package ud0;

import ed1.C40762x;
import j51.C36735g;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m51.C37228a;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.endyearcampaign2022.data.entity.EndYearCampaignInfoEntity;
import p748eu.C20292b;
import p758fu.C20557a;
import sd0.C28190a;
import td0.C28357a;
import ue1.C43075l;
import yd0.C30003b;
import yd0.C30004c;
import zd0.C30289a;

/* renamed from: ud0.b */
public final class C28706b implements C30289a {

    /* renamed from: e */
    public static final C28707a f73101e = new C28707a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C28190a f73102a;

    /* renamed from: b */
    private final C36735g f73103b;

    /* renamed from: c */
    private final C20292b f73104c;

    /* renamed from: d */
    private final C28357a f73105d;

    /* renamed from: ud0.b$a */
    public static final class C28707a {
        private C28707a() {
        }

        public /* synthetic */ C28707a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ud0.b$b */
    /* synthetic */ class C28708b extends C41535k implements C43075l {
        C28708b(Object obj) {
            super(1, obj, C28357a.class, "transform", "transform(Lge/bog/mobilebank/endyearcampaign2022/data/entity/EndYearCampaignInfoEntity;)Lge/bog/mobilebank/endyearcampaign2022/domain/model/EndYearCampaignInfo;", 0);
        }

        /* renamed from: b */
        public final C30003b invoke(EndYearCampaignInfoEntity endYearCampaignInfoEntity) {
            C41536l.m120489i(endYearCampaignInfoEntity, "p0");
            return ((C28357a) this.receiver).mo67990a(endYearCampaignInfoEntity);
        }
    }

    public C28706b(C28190a aVar, C36735g gVar, C20292b bVar, C28357a aVar2) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(bVar, "getAppSettingByName");
        C41536l.m120489i(aVar2, "mapper");
        this.f73102a = aVar;
        this.f73103b = gVar;
        this.f73104c = bVar;
        this.f73105d = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C30003b m87949c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C30003b) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo68441a() {
        String str;
        C20557a a = this.f73104c.mo48774a("CAMPAIGN_IS_ACTIVE");
        Long l = null;
        if (a != null) {
            str = a.mo49087d();
        } else {
            str = null;
        }
        if (C41536l.m120484d(str, YesNoApiEntity.YES.getValue())) {
            C28190a aVar = this.f73102a;
            C37228a a2 = this.f73103b.mo89562a();
            if (a2 != null) {
                l = Long.valueOf(a2.mo90305b());
            }
            C40762x A = aVar.mo67705a(String.valueOf(l)).mo95062A(new C28705a(new C28708b(this.f73105d)));
            C41536l.m120488h(A, "{\n            service.ge…per::transform)\n        }");
            return A;
        }
        C40762x z = C40762x.m118162z(new C30003b(false, (Long) null, (C30004c) null, false, false, 31, (DefaultConstructorMarker) null));
        C41536l.m120488h(z, "{\n            Single.jus…CampaignInfo())\n        }");
        return z;
    }
}
