package lu0;

import com.google.gson.Gson;
import j31.C36725a;
import j31.C36726b;
import j31.C36727c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductType;
import p341ge.bog.mobilebank.nbo.data.entity.NboOfferEntity;
import p341ge.bog.mobilebank.nbo.data.entity.OfferProductTypeEntity;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;
import p341ge.bog.mobilebank.shared.data.deeplink.UrlDataEntity;
import p341ge.bog.mobilebank.shared.data.deeplink.UrlParamEntity;
import su0.C38536a;
import su0.C38537b;
import su0.C38557c;
import su0.C38559d;

/* renamed from: lu0.a */
public final class C37155a {

    /* renamed from: a */
    private final Gson f89491a;

    /* renamed from: lu0.a$a */
    public /* synthetic */ class C37156a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f89492a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                su0.c[] r0 = su0.C38557c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                su0.c r1 = su0.C38557c.LOAN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                su0.c r1 = su0.C38557c.CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f89492a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lu0.C37155a.C37156a.<clinit>():void");
        }
    }

    public C37155a(Gson gson) {
        C41536l.m120489i(gson, "gson");
        this.f89491a = gson;
    }

    /* renamed from: a */
    private final UrlDataEntity m109823a(String str) {
        try {
            return (UrlDataEntity) this.f89491a.mo18170l(str, UrlDataEntity.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private final OfferInfo.C20999b m109824b(C38559d dVar) {
        if (C41536l.m120484d(dVar, C38559d.C38560a.f92412b)) {
            return OfferInfo.C20999b.BNPL;
        }
        return OfferInfo.C20999b.UNKNOWN;
    }

    /* renamed from: d */
    private final OfferProductCode m109825d(C38537b bVar) {
        if (C41536l.m120484d(bVar, C38537b.C38556s.f92403c)) {
            return OfferProductCode.SMS_LOAN.f56481f;
        }
        if (C41536l.m120484d(bVar, C38537b.C38549l.f92396c)) {
            return OfferProductCode.EXP_LOAN.f56475f;
        }
        if (C41536l.m120484d(bVar, C38537b.C38553p.f92400c)) {
            return OfferProductCode.C21021PL.f56478f;
        }
        if (C41536l.m120484d(bVar, C38537b.C38551n.f92398c)) {
            return OfferProductCode.C21019ML.f56477f;
        }
        if (C41536l.m120484d(bVar, C38537b.C38555r.f92402c)) {
            return OfferProductCode.C21025SL.f56480f;
        }
        if (C41536l.m120484d(bVar, C38537b.C38538a.f92386c)) {
            return OfferProductCode.C21000AC.f56467f;
        }
        if (C41536l.m120484d(bVar, C38537b.C38542e.f92390c)) {
            return OfferProductCode.C21008CL.f56471f;
        }
        if (C41536l.m120484d(bVar, C38537b.C38541d.f92389c)) {
            return OfferProductCode.C21006BL.f56470f;
        }
        if (C41536l.m120484d(bVar, C38537b.C38546i.f92393c)) {
            return OfferProductCode.C21012EL.f56473f;
        }
        if (C41536l.m120484d(bVar, C38537b.C38548k.f92395c)) {
            return OfferProductCode.C21014EX.f56474f;
        }
        if (C41536l.m120484d(bVar, C38537b.C38545h.f92392c)) {
            return OfferProductCode.C21010EC.f56472f;
        }
        if (C41536l.m120484d(bVar, C38537b.C38540c.f92388c)) {
            return OfferProductCode.C21004BE.f56469f;
        }
        if (C41536l.m120484d(bVar, C38537b.C38539b.f92387c)) {
            return OfferProductCode.C21002BA.f56468f;
        }
        if (C41536l.m120484d(bVar, C38537b.C38554q.f92401c)) {
            return OfferProductCode.C21023RL.f56479f;
        }
        if (C41536l.m120484d(bVar, C38537b.C38550m.f92397c)) {
            return OfferProductCode.C21017LC.f56476f;
        }
        return null;
    }

    /* renamed from: e */
    private final OfferProductType m109826e(C38557c cVar) {
        int i;
        if (cVar == null) {
            i = -1;
        } else {
            i = C37156a.f89492a[cVar.ordinal()];
        }
        if (i == 1) {
            return OfferProductType.LOAN.f56486f;
        }
        if (i != 2) {
            return null;
        }
        return OfferProductType.CREDIT_CARD.f56485f;
    }

    /* renamed from: f */
    private final C36726b m109827f(UrlDataEntity urlDataEntity) {
        List list;
        String type = urlDataEntity.getType();
        List<UrlParamEntity> parameters = urlDataEntity.getParameters();
        if (parameters != null) {
            list = new ArrayList(C41343r.m119925u(parameters, 10));
            for (UrlParamEntity g : parameters) {
                list.add(m109828g(g));
            }
        } else {
            list = C41341q.m119907j();
        }
        return new C36726b(type, list);
    }

    /* renamed from: g */
    private final C36727c m109828g(UrlParamEntity urlParamEntity) {
        return new C36727c(urlParamEntity.getKey(), urlParamEntity.getValue());
    }

    /* renamed from: c */
    public final OfferInfo mo90145c(C38536a aVar) {
        OfferProductCode d;
        C41536l.m120489i(aVar, "nboOffer");
        long i = aVar.mo92133i();
        String k = aVar.mo92135k();
        OfferProductType e = m109826e(aVar.mo92120B());
        C38537b y = aVar.mo92150y();
        if (y == null || (d = m109825d(y)) == null) {
            return null;
        }
        return new OfferInfo(i, k, e, d, aVar.mo92151z(), aVar.mo92119A(), aVar.mo92146u(), aVar.mo92143s(), aVar.mo92147v(), aVar.mo92130g(), aVar.mo92125c(), aVar.mo92142r(), aVar.mo92148w(), String.valueOf(aVar.mo92127e()), aVar.mo92131h(), aVar.mo92140p(), aVar.mo92141q(), aVar.mo92126d(), aVar.mo92122D(), m109824b(aVar.mo92144t()));
    }

    /* renamed from: h */
    public final C38536a mo90146h(NboOfferEntity nboOfferEntity) {
        String str;
        C36726b bVar;
        Double d;
        boolean z;
        C38559d dVar;
        C36725a aVar;
        UrlDataEntity a;
        C41536l.m120489i(nboOfferEntity, "entity");
        long id = nboOfferEntity.getId();
        String langCode = nboOfferEntity.getLangCode();
        C38557c.C38558a aVar2 = C38557c.f92404e;
        OfferProductTypeEntity productType = nboOfferEntity.getProductType();
        if (productType != null) {
            str = productType.getValue();
        } else {
            str = null;
        }
        C38557c a2 = aVar2.mo92158a(String.valueOf(str));
        C38537b a3 = C38537b.f92384b.mo92153a(String.valueOf(nboOfferEntity.getProductCode()));
        String productName = nboOfferEntity.getProductName();
        String productText = nboOfferEntity.getProductText();
        String offerText = nboOfferEntity.getOfferText();
        String offerProduct = nboOfferEntity.getOfferProduct();
        String operType = nboOfferEntity.getOperType();
        String extraCode = nboOfferEntity.getExtraCode();
        String productUrl = nboOfferEntity.getProductUrl();
        if (productUrl == null || (a = m109823a(productUrl)) == null) {
            bVar = null;
        } else {
            bVar = m109827f(a);
        }
        String attachmentFileBase64 = nboOfferEntity.getAttachmentFileBase64();
        String offerNo = nboOfferEntity.getOfferNo();
        Integer orderNo = nboOfferEntity.getOrderNo();
        String effectiveInterestRate = nboOfferEntity.getEffectiveInterestRate();
        if (effectiveInterestRate != null) {
            d = C40437u.m117096h(effectiveInterestRate);
        } else {
            d = null;
        }
        Integer priority = nboOfferEntity.getPriority();
        String hasPromotion = nboOfferEntity.getHasPromotion();
        if (hasPromotion != null) {
            z = C41536l.m120484d(hasPromotion, "PLUS_CAMPAIGNS");
        } else {
            z = false;
        }
        boolean z2 = z;
        String offerAmount = nboOfferEntity.getOfferAmount();
        String valueOf = String.valueOf(nboOfferEntity.getOfferCcy());
        boolean d2 = C41536l.m120484d(nboOfferEntity.getDisplayBannerOnHome(), Boolean.TRUE);
        String requestedAmount = nboOfferEntity.getRequestedAmount();
        if (C41536l.m120484d(nboOfferEntity.getOfferScheme(), "PL3")) {
            dVar = C38559d.C38560a.f92412b;
        } else {
            dVar = new C38559d.C38561b(nboOfferEntity.getOfferScheme());
        }
        C38559d dVar2 = dVar;
        String nboTitle = nboOfferEntity.getNboTitle();
        String nboDesc = nboOfferEntity.getNboDesc();
        String nboTitleKey = nboOfferEntity.getNboTitleKey();
        String nboDescKey = nboOfferEntity.getNboDescKey();
        ExternalFileEntity externalFile = nboOfferEntity.getExternalFile();
        if (externalFile != null) {
            aVar = externalFile.asDomainModel();
        } else {
            aVar = null;
        }
        return new C38536a(id, langCode, a2, a3, productName, productText, offerText, offerProduct, operType, extraCode, bVar, attachmentFileBase64, offerNo, orderNo, d, priority, z2, offerAmount, valueOf, d2, requestedAmount, dVar2, nboTitle, nboDesc, nboTitleKey, nboDescKey, aVar, (Integer) null, nboOfferEntity.getResponseId(), 134217728, (DefaultConstructorMarker) null);
    }

    /* renamed from: i */
    public final List mo90147i(List list) {
        C41536l.m120489i(list, "offers");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo90146h((NboOfferEntity) it.next()));
        }
        return arrayList;
    }
}
