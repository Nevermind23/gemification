package no0;

import ao0.C10126g;
import java.util.ArrayList;
import java.util.List;
import ko0.C16521c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.cardobjective.InfoBadgeData;
import p341ge.bog.designsystem.components.cardobjective.TimerViewData;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;
import p341ge.bog.mobilebank.lifestyleoffers.domain.model.OffersProgressListItemUiModel;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p422fj.C12920b;
import p631uj.C18174a;
import qo0.C17573a;

/* renamed from: no0.a */
public final class C17133a {

    /* renamed from: b */
    public static final C17134a f47954b = new C17134a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C17573a f47955a;

    /* renamed from: no0.a$a */
    public static final class C17134a {
        private C17134a() {
        }

        public /* synthetic */ C17134a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C17133a(C17573a aVar) {
        C41536l.m120489i(aVar, "dictValueHelper");
        this.f47955a = aVar;
    }

    /* renamed from: a */
    public final OffersProgressListItemUiModel mo44555a(C10126g gVar) {
        String str;
        TimerViewData timerViewData;
        String str2;
        String str3;
        C18174a aVar;
        C41536l.m120489i(gVar, "data");
        String l = gVar.mo26648l();
        ArrayList arrayList = null;
        if (C41536l.m120484d(l, PensionStatusResult.STATUS_ACTIVE)) {
            str = "₾";
        } else if (C41536l.m120484d(l, "C")) {
            str = "";
        } else {
            str = null;
        }
        if (gVar.mo26642g() != null) {
            String a = this.f47955a.mo45106a("life.style.campaign.list.days.left", gVar.mo26642g());
            if (gVar.mo26642g().intValue() <= 3) {
                aVar = C18174a.NEGATIVE;
            } else {
                aVar = C18174a.INVERT;
            }
            timerViewData = new TimerViewData(a, aVar);
        } else {
            timerViewData = null;
        }
        C16521c a2 = C16521c.f46671j.mo43680a(gVar.mo26636b());
        if (a2 != null) {
            str2 = a2.name();
        } else {
            str2 = null;
        }
        C41536l.m120486f(str2);
        String f = gVar.mo26641f();
        Integer j = gVar.mo26646j();
        String k = gVar.mo26647k();
        String l2 = gVar.mo26648l();
        Integer d = gVar.mo26638d();
        C41536l.m120486f(d);
        float intValue = (float) d.intValue();
        Integer e = gVar.mo26639e();
        C41536l.m120486f(e);
        C41536l.m120486f(str);
        TextProgressBarView.ProgressModel.Progress progress = new TextProgressBarView.ProgressModel.Progress(intValue, (float) e.intValue(), str, (String) null, (String) null, false, C12920b.POSITIVE, C12920b.PRIMARY, 32, (DefaultConstructorMarker) null);
        String a3 = this.f47955a.mo45106a("life.style.campaign.list.merchants.header", new Object[0]);
        List<String> i = gVar.mo26645i();
        if (i != null) {
            arrayList = new ArrayList(C41343r.m119925u(i, 10));
            for (String infoBadgeData : i) {
                arrayList.add(new InfoBadgeData(infoBadgeData, (Image) null, (InfoBadgeView.C13345a) null, 6, (DefaultConstructorMarker) null));
            }
        }
        String h = gVar.mo26643h();
        List i2 = gVar.mo26645i();
        String c = gVar.mo26637c();
        if (c == null) {
            c = "";
        }
        String a4 = gVar.mo26635a();
        if (a4 == null) {
            str3 = "";
        } else {
            str3 = a4;
        }
        return new OffersProgressListItemUiModel(str2, k, l2, f, j, h, progress, a3, i2, arrayList, timerViewData, c, str3);
    }
}
