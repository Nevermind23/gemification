package sh0;

import ed1.C40762x;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.giftcards.data.model.GiftCardOfferDetailsApiModel;
import ph0.C27532a;
import rh0.C28040g;
import ue1.C43075l;
import vh0.C29075a;
import vh0.C29076b;
import vh0.C29078d;
import vh0.C29079e;
import xh0.C29790g;
import xh0.C29793j;
import xh0.C29796l;

/* renamed from: sh0.l */
public final class C28226l implements C29079e {

    /* renamed from: a */
    private final C27532a f71583a;

    /* renamed from: b */
    private final C28040g f71584b;

    /* renamed from: c */
    private volatile C29078d f71585c = new C29078d(0, (Long) null, (Long) null, (String) null, (C29075a) null, false, (String) null, (BigDecimal) null, 0, (Long) null, false, (String) null, false, (C29790g) null, (String) null, (String) null, (C29793j) null, (C29796l) null, (C29076b) null, (String) null, 1048575, (DefaultConstructorMarker) null);

    /* renamed from: sh0.l$a */
    /* synthetic */ class C28227a extends C41535k implements C43075l {
        C28227a(Object obj) {
            super(1, obj, C28040g.class, "map", "map(Lge/bog/mobilebank/giftcards/data/model/GiftCardOfferDetailsApiModel;)Lge/bog/mobilebank/giftcards/domain/model/GiftCardOfferDetails;", 0);
        }

        /* renamed from: b */
        public final C29793j invoke(GiftCardOfferDetailsApiModel giftCardOfferDetailsApiModel) {
            C41536l.m120489i(giftCardOfferDetailsApiModel, "p0");
            return ((C28040g) this.receiver).mo67582a(giftCardOfferDetailsApiModel);
        }
    }

    public C28226l(C27532a aVar, C28040g gVar) {
        C27532a aVar2 = aVar;
        C28040g gVar2 = gVar;
        C41536l.m120489i(aVar2, "api");
        C41536l.m120489i(gVar2, "giftCardOfferDetailsMapper");
        this.f71583a = aVar2;
        this.f71584b = gVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C29793j m86753j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29793j) lVar.invoke(obj);
    }

    /* renamed from: H */
    public C40762x mo67745H(long j, String str, String str2) {
        C41536l.m120489i(str, "viewType");
        C41536l.m120489i(str2, "phoneNumber");
        C40762x A = this.f71583a.mo66849H(j, str, str2).mo95062A(new C28225k(new C28227a(this.f71584b)));
        C41536l.m120488h(A, "api.getGiftCardOfferDeta…dOfferDetailsMapper::map)");
        return A;
    }

    /* renamed from: a */
    public void mo67746a(C29793j jVar) {
        C41536l.m120489i(jVar, "giftCardOfferDetails");
        this.f71585c = C29078d.m88927b(this.f71585c, 0, (Long) null, (Long) null, (String) null, (C29075a) null, false, (String) null, (BigDecimal) null, 0, (Long) null, false, (String) null, false, (C29790g) null, (String) null, (String) null, jVar, (C29796l) null, (C29076b) null, (String) null, 983039, (Object) null);
    }

    /* renamed from: b */
    public void mo67747b(String str, boolean z, long j, C29790g gVar, String str2) {
        C41536l.m120489i(str, "amount");
        C29078d dVar = this.f71585c;
        this.f71585c = C29078d.m88927b(dVar, 0, (Long) null, (Long) null, (String) null, (C29075a) null, false, str, (BigDecimal) null, j, (Long) null, z, (String) null, false, gVar, str2, (String) null, (C29793j) null, (C29796l) null, (C29076b) null, (String) null, 1022655, (Object) null);
    }

    /* renamed from: c */
    public void mo67748c(String str, boolean z) {
        C41536l.m120489i(str, "text");
        this.f71585c = C29078d.m88927b(this.f71585c, 0, (Long) null, (Long) null, (String) null, (C29075a) null, false, (String) null, (BigDecimal) null, 0, (Long) null, false, str, z, (C29790g) null, (String) null, (String) null, (C29793j) null, (C29796l) null, (C29076b) null, (String) null, 1042431, (Object) null);
    }

    /* renamed from: d */
    public void mo67749d(String str) {
        C41536l.m120489i(str, "owner");
        this.f71585c = C29078d.m88927b(this.f71585c, 0, (Long) null, (Long) null, (String) null, (C29075a) null, false, (String) null, (BigDecimal) null, 0, (Long) null, false, (String) null, false, (C29790g) null, (String) null, (String) null, (C29793j) null, (C29796l) null, (C29076b) null, str, 524287, (Object) null);
    }

    /* renamed from: e */
    public C29078d mo67750e() {
        return this.f71585c;
    }

    /* renamed from: f */
    public void mo67751f(C29796l lVar) {
        C41536l.m120489i(lVar, "account");
        this.f71585c = C29078d.m88927b(this.f71585c, 0, (Long) null, (Long) null, (String) null, (C29075a) null, false, (String) null, (BigDecimal) null, 0, (Long) null, false, (String) null, false, (C29790g) null, (String) null, (String) null, (C29793j) null, lVar, (C29076b) null, (String) null, 917503, (Object) null);
    }

    /* renamed from: g */
    public void mo67752g(Long l) {
        this.f71585c = C29078d.m88927b(this.f71585c, 0, (Long) null, l, (String) null, (C29075a) null, false, (String) null, (BigDecimal) null, 0, (Long) null, false, (String) null, false, (C29790g) null, (String) null, (String) null, (C29793j) null, (C29796l) null, (C29076b) null, (String) null, 1048571, (Object) null);
    }

    /* renamed from: h */
    public void mo67753h(long j, String str, boolean z, C29075a aVar, String str2, C29076b bVar, BigDecimal bigDecimal, long j2, Long l) {
        Long l2 = l;
        C41536l.m120489i(str, "phoneNumber");
        C41536l.m120489i(aVar, "design");
        C41536l.m120489i(bVar, "flowMode");
        C41536l.m120489i(bigDecimal, "giveAwayAmount");
        C29078d dVar = this.f71585c;
        this.f71585c = C29078d.m88927b(dVar, j, l2, (Long) null, str, aVar, z, (String) null, bigDecimal, 0, Long.valueOf(j2), false, (String) null, false, (C29790g) null, (String) null, str2, (C29793j) null, (C29796l) null, bVar, (String) null, 752964, (Object) null);
    }
}
