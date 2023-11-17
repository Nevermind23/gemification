package p398dn;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import g91.C32343x;
import hd0.C24978b;
import he1.C41224m;
import he1.C41233s;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m70.C26148a;
import p341ge.bog.mobilebank.cardapplications.data.model.OrderCardParamsObject;
import p341ge.bog.mobilebank.cardapplications.data.model.OrderCardPreContractParams;
import p341ge.bog.mobilebank.cardapplications.presentation.model.C14235a;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardSubTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCurrencyUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPayrollInfoUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPinDeliveryTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardReceiveTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRecipientTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRegTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryDistrictUiModel;
import p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel;
import p341ge.bog.mobilebank.cleanarch.utm.data.entity.UtmParamsEntity;
import p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.CardDailyLimitUiModel;
import p383cn.C10515c;
import p537nm.C17071b;
import p537nm.C17081e0;
import p537nm.C17085g0;
import p537nm.C17102s;
import p551om.C17267c;
import p565pm.C17389d;
import p603si.C17799b;
import p674xm.C18805i;
import p674xm.C18807j;
import p674xm.C18810l;
import p674xm.C18811m;
import p674xm.C18815q;
import p674xm.C18833r;
import p702zm.C19072a;
import p702zm.C19073b;
import p702zm.C19079d;
import ue1.C43075l;

/* renamed from: dn.d */
public final class C12330d {

    /* renamed from: a */
    public static final C12330d f36975a = new C12330d();

    /* renamed from: dn.d$a */
    static final class C12331a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C12331a f36976d = new C12331a();

        C12331a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(DebitCardCurrencyUiModel debitCardCurrencyUiModel) {
            C41536l.m120489i(debitCardCurrencyUiModel, "it");
            return debitCardCurrencyUiModel.mo39510a();
        }
    }

    /* renamed from: dn.d$b */
    static final class C12332b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18811m f36977d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12332b(C18811m mVar) {
            super(1);
            this.f36977d = mVar;
        }

        /* renamed from: a */
        public final Boolean invoke(ServiceCenterUiModel serviceCenterUiModel) {
            String str;
            DebitCardDeliveryDistrictUiModel b;
            C41536l.m120489i(serviceCenterUiModel, "it");
            String f = serviceCenterUiModel.mo55428f();
            C18811m mVar = this.f36977d;
            if (mVar == null || (b = mVar.mo46653b()) == null) {
                str = null;
            } else {
                str = b.mo39912a();
            }
            return Boolean.valueOf(C41536l.m120484d(f, str));
        }
    }

    private C12330d() {
    }

    /* renamed from: e */
    private final String m47258e(DebitCardUiModel debitCardUiModel, OrderDebitCardData orderDebitCardData, C18833r rVar) {
        String b;
        List<CardSubTypeUiModel> cardSubTypes;
        T t;
        RegionUiModel e = rVar.mo46781t().mo46669a();
        String str = null;
        if (!(e == null || (b = e.mo39835b()) == null || (cardSubTypes = debitCardUiModel.getCardSubTypes()) == null)) {
            Iterator<T> it = cardSubTypes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C41536l.m120484d(((CardSubTypeUiModel) t).mo39464b(), b)) {
                    break;
                }
            }
            CardSubTypeUiModel cardSubTypeUiModel = (CardSubTypeUiModel) t;
            if (cardSubTypeUiModel != null) {
                str = cardSubTypeUiModel.mo39463a();
            }
        }
        return (String) mo32928h(str, !orderDebitCardData.mo39792k());
    }

    /* renamed from: a */
    public final String mo32922a(String str, boolean z) {
        if (z) {
            return "";
        }
        if (str == null) {
            return String.valueOf(str);
        }
        return str;
    }

    /* renamed from: b */
    public final OrderCardParamsObject mo32923b(C18833r rVar, C14235a aVar, UtmParamsEntity utmParamsEntity, C17267c cVar, String str, String str2, String str3, String str4, String str5) {
        CardApplicationTypeData.PayRollCardOrderData payRollCardOrderData;
        Long l;
        CardApplicationTypeData.SchoolCardOrderData schoolCardOrderData;
        JuniorRequestDataUiModel juniorRequestDataUiModel;
        boolean z;
        C17085g0 g0Var;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z2;
        String str10;
        C18805i iVar;
        boolean z3;
        String str11;
        C18807j jVar;
        boolean z4;
        String str12;
        C18815q.C18832q qVar;
        boolean z5;
        String str13;
        String str14;
        CardApplicationTypeData.PayRollCardOrderData payRollCardOrderData2;
        Long l2;
        CardApplicationTypeData.SchoolCardOrderData schoolCardOrderData2;
        Long l3;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        boolean z6;
        String str21;
        DebitCardDeliveryDistrictUiModel b;
        RecoverCardUiModel i;
        RecoverCardUiModel i2;
        C17081e0 a;
        ServiceCenterUiModel b2;
        String l4;
        C18833r rVar2 = rVar;
        C41536l.m120489i(rVar2, "input");
        C41536l.m120489i(aVar, "resources");
        DebitCardUiModel d = aVar.mo39882d();
        OrderDebitCardData g = aVar.mo39886g();
        C26148a c = rVar.mo46763d().mo46669a();
        boolean e = rVar.mo46773l().mo46728e();
        CardApplicationTypeData a2 = g.mo39780a();
        if (a2 instanceof CardApplicationTypeData.PayRollCardOrderData) {
            payRollCardOrderData = (CardApplicationTypeData.PayRollCardOrderData) a2;
        } else {
            payRollCardOrderData = null;
        }
        if (payRollCardOrderData != null) {
            l = payRollCardOrderData.mo39296i();
        } else {
            l = null;
        }
        CardApplicationTypeData a3 = g.mo39780a();
        if (a3 instanceof CardApplicationTypeData.SchoolCardOrderData) {
            schoolCardOrderData = (CardApplicationTypeData.SchoolCardOrderData) a3;
        } else {
            schoolCardOrderData = null;
        }
        if (schoolCardOrderData != null) {
            juniorRequestDataUiModel = schoolCardOrderData.mo39319j();
        } else {
            juniorRequestDataUiModel = null;
        }
        if (juniorRequestDataUiModel != null) {
            z = true;
        } else {
            z = false;
        }
        String appType = d.getAppType();
        DebitCardRegTypeUiModel e2 = rVar.mo46764e().mo46669a();
        if (e2 == null || (g0Var = e2.mo39595b()) == null) {
            g0Var = C17085g0.NEW_ACCOUNT;
        }
        String b3 = g0Var.mo44353b();
        C12330d dVar = f36975a;
        String e3 = dVar.m47258e(d, g, rVar2);
        if (e3 == null) {
            e3 = d.getProduct();
        }
        String valueOf = String.valueOf(rVar.mo46771j().mo46669a());
        DebitCardCurrencyUiModel c2 = rVar.mo46766f().mo46669a();
        if (c2 == null || (str6 = c2.mo39510a()) == null) {
            if (c != null) {
                str6 = c.mo65094h();
            } else {
                str6 = "GEL";
            }
        }
        if (l != null && (l4 = l.toString()) != null) {
            str7 = l4;
        } else if (c != null) {
            str7 = Long.valueOf(c.mo65087b()).toString();
        } else {
            str7 = null;
        }
        C18810l e4 = rVar.mo46783u().mo46669a();
        if (e4 == null || (b2 = e4.mo46648b()) == null || (str8 = b2.mo55428f()) == null) {
            str8 = "";
        }
        String a4 = dVar.mo32922a(str8, g.mo39786f());
        DebitCardPinDeliveryTypeUiModel e5 = rVar.mo46775n().mo46669a();
        if (e5 == null || (a = e5.mo39561a()) == null) {
            str9 = null;
        } else {
            str9 = a.name();
        }
        String valueOf2 = String.valueOf(str9);
        String valueOf3 = String.valueOf(rVar.mo46774m().mo46669a());
        int m1 = C32343x.m95468m1(false);
        String e6 = C24978b.m79846b(Boolean.valueOf(g.mo39786f())).mo63391e();
        CardApplicationTypeData.RecoverCardOrderData a5 = g.mo39780a().mo39286a();
        if (a5 == null || (i2 = a5.mo39308i()) == null || !i2.mo39825m()) {
            z2 = false;
        } else {
            z2 = true;
        }
        String e7 = C24978b.m79846b(Boolean.valueOf(z2)).mo63391e();
        CardApplicationTypeData.RecoverCardOrderData a6 = g.mo39780a().mo39286a();
        if (a6 == null || (i = a6.mo39308i()) == null) {
            str10 = null;
        } else {
            str10 = Long.valueOf(i.mo39815e()).toString();
        }
        DebitCardReceiveTypeUiModel c3 = rVar.mo46773l().mo46669a();
        if (c3 != null) {
            iVar = c3.mo39572a();
        } else {
            iVar = null;
        }
        if (iVar == C18805i.HOME) {
            z3 = true;
        } else {
            z3 = false;
        }
        String e8 = C24978b.m79846b(Boolean.valueOf(z3)).mo63391e();
        C18811m f = rVar.mo46768h().mo46669a();
        if (f == null || (b = f.mo46653b()) == null) {
            str11 = null;
        } else {
            str11 = Long.valueOf(b.mo39914d()).toString();
        }
        String str22 = (String) dVar.mo32928h(str11, !e);
        String str23 = (String) dVar.mo32928h(rVar.mo46767g().mo46669a(), !e);
        DebitCardRecipientTypeUiModel e9 = rVar.mo46780s().mo46669a();
        if (e9 != null) {
            jVar = e9.mo39584b();
        } else {
            jVar = null;
        }
        if (jVar != C18807j.OTHER) {
            z4 = true;
        } else {
            z4 = false;
        }
        String a7 = dVar.mo32922a(C24978b.m79846b(Boolean.valueOf(z4)).mo63391e(), !e);
        String c4 = rVar.mo46777p().mo46669a();
        if (c4 == null) {
            c4 = aVar.mo39891k();
        }
        String str24 = (String) dVar.mo32928h(c4, !e);
        String c5 = rVar.mo46778q().mo46669a();
        if (c5 == null) {
            c5 = (String) dVar.mo32928h(aVar.mo39892l(), !e);
        }
        String str25 = c5;
        Long e12 = rVar.mo46776o().mo46669a();
        if (e12 != null) {
            str12 = e12.toString();
        } else {
            str12 = null;
        }
        String str26 = (String) dVar.mo32928h(str12, !e);
        if (dVar.mo32927g(rVar.mo46780s().mo46669a())) {
            qVar = rVar.mo46772k();
        } else {
            qVar = rVar.mo46779r();
        }
        String c6 = qVar.mo46669a();
        if (!e || rVar.mo46780s().mo46669a() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        String str27 = (String) dVar.mo32928h(c6, z5);
        if (cVar != null) {
            str13 = Double.valueOf(cVar.mo44665a()).toString();
        } else {
            str13 = null;
        }
        String str28 = (String) dVar.mo32928h(str13, !e);
        if (cVar != null) {
            str14 = cVar.mo44666b();
        } else {
            str14 = null;
        }
        String str29 = (String) dVar.mo32928h(str14, !e);
        CardApplicationTypeData a8 = g.mo39780a();
        if (a8 instanceof CardApplicationTypeData.PayRollCardOrderData) {
            payRollCardOrderData2 = (CardApplicationTypeData.PayRollCardOrderData) a8;
        } else {
            payRollCardOrderData2 = null;
        }
        if (payRollCardOrderData2 != null) {
            l2 = Long.valueOf(payRollCardOrderData2.mo39297j());
        } else {
            l2 = null;
        }
        CardApplicationTypeData a9 = g.mo39780a();
        if (a9 instanceof CardApplicationTypeData.SchoolCardOrderData) {
            schoolCardOrderData2 = (CardApplicationTypeData.SchoolCardOrderData) a9;
        } else {
            schoolCardOrderData2 = null;
        }
        if (schoolCardOrderData2 != null) {
            l3 = Long.valueOf(schoolCardOrderData2.mo39318i());
        } else {
            l3 = null;
        }
        if (utmParamsEntity != null) {
            str15 = utmParamsEntity.getMedium();
        } else {
            str15 = null;
        }
        if (utmParamsEntity != null) {
            str16 = utmParamsEntity.getSource();
        } else {
            str16 = null;
        }
        if (utmParamsEntity != null) {
            str17 = utmParamsEntity.getCampaign();
        } else {
            str17 = null;
        }
        DebitCardInsuranceTypeUiModel e13 = rVar.mo46770i().mo46669a();
        if (e13 != null) {
            str18 = e13.mo49682d();
        } else {
            str18 = null;
        }
        CardDailyLimitUiModel e14 = rVar.mo46762c().mo46669a();
        if (e14 != null) {
            str19 = e14.mo84222a();
        } else {
            str19 = null;
        }
        if (z) {
            str20 = C24978b.YES.mo63391e();
        } else {
            str20 = null;
        }
        String designId = d.getDesignId();
        if (g.mo39780a().mo39288d() == C17071b.WISHCARD) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            designId = null;
        }
        if (designId == null) {
            str21 = "";
        } else {
            str21 = designId;
        }
        C41536l.m120488h(e6, C11755a.C11756a.f34100b);
        C41536l.m120488h(e7, C11755a.C11756a.f34100b);
        C41536l.m120488h(e8, C11755a.C11756a.f34100b);
        return new OrderCardParamsObject(appType, b3, e3, valueOf, str6, str7, a4, valueOf2, valueOf3, m1, e6, e7, str10, e8, str22, str23, a7, str24, str25, str26, str27, str28, str29, l2, l3, str15, str16, str17, str18, str19, str20, str, str5, str21, (String) null, str2, str3, str4, 0, 4, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0221  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.mobilebank.cardapplications.data.model.OrderCardPreContractParams mo32924c(p674xm.C18833r r48, p341ge.bog.mobilebank.cardapplications.presentation.model.C14235a r49, p537nm.C17099p r50, p551om.C17267c r51) {
        /*
            r47 = this;
            java.lang.String r0 = "<this>"
            r1 = r48
            kotlin.jvm.internal.C41536l.m120489i(r1, r0)
            java.lang.String r0 = "resources"
            r2 = r49
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData r0 = r49.mo39886g()
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData r0 = r0.mo39780a()
            boolean r3 = r0 instanceof p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.SchoolCardOrderData
            if (r3 == 0) goto L_0x001d
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$SchoolCardOrderData r0 = (p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.SchoolCardOrderData) r0
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 == 0) goto L_0x0025
            ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel r0 = r0.mo39319j()
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r5 = 1
            if (r0 == 0) goto L_0x002b
            r0 = r5
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            xm.q$d r6 = r48.mo46764e()
            ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRegTypeUiModel r6 = r6.mo46669a()
            if (r6 == 0) goto L_0x003c
            nm.g0 r6 = r6.mo39595b()
            if (r6 != 0) goto L_0x003e
        L_0x003c:
            nm.g0 r6 = p537nm.C17085g0.NEW_ACCOUNT
        L_0x003e:
            ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData r7 = r49.mo39886g()
            boolean r7 = r7.mo39786f()
            nm.t r8 = r49.mo39889i()
            if (r8 == 0) goto L_0x0051
            nm.s r8 = r8.mo44487a()
            goto L_0x0052
        L_0x0051:
            r8 = 0
        L_0x0052:
            xm.q$g r9 = r48.mo46768h()
            xm.m r9 = r9.mo46669a()
            if (r9 == 0) goto L_0x0061
            ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryCityUiModel r9 = r9.mo46652a()
            goto L_0x0062
        L_0x0061:
            r9 = 0
        L_0x0062:
            xm.q$g r10 = r48.mo46768h()
            xm.m r10 = r10.mo46669a()
            if (r10 == 0) goto L_0x0071
            ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryDistrictUiModel r10 = r10.mo46653b()
            goto L_0x0072
        L_0x0071:
            r10 = 0
        L_0x0072:
            he1.m r9 = he1.C41233s.m119492a(r9, r10)
            java.lang.Object r10 = r9.mo95675a()
            ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryCityUiModel r10 = (p341ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryCityUiModel) r10
            java.lang.Object r9 = r9.mo95676b()
            ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryDistrictUiModel r9 = (p341ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryDistrictUiModel) r9
            ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData r11 = r49.mo39886g()
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData r11 = r11.mo39780a()
            boolean r11 = r11 instanceof p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.PayRollCardOrderData
            ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData r12 = r49.mo39886g()
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData r12 = r12.mo39780a()
            boolean r13 = r12 instanceof p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.PayRollCardOrderData
            if (r13 == 0) goto L_0x009b
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$PayRollCardOrderData r12 = (p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.PayRollCardOrderData) r12
            goto L_0x009c
        L_0x009b:
            r12 = 0
        L_0x009c:
            if (r12 == 0) goto L_0x00cd
            ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel r13 = r49.mo39882d()
            java.util.List r13 = r13.getClientPayrollInfo()
            java.util.Iterator r13 = r13.iterator()
        L_0x00aa:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00c9
            java.lang.Object r14 = r13.next()
            r15 = r14
            ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPayrollInfoUiModel r15 = (p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPayrollInfoUiModel) r15
            long r15 = r15.mo39548b()
            long r17 = r12.mo39297j()
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 != 0) goto L_0x00c5
            r15 = r5
            goto L_0x00c6
        L_0x00c5:
            r15 = 0
        L_0x00c6:
            if (r15 == 0) goto L_0x00aa
            goto L_0x00ca
        L_0x00c9:
            r14 = 0
        L_0x00ca:
            ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPayrollInfoUiModel r14 = (p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPayrollInfoUiModel) r14
            goto L_0x00ce
        L_0x00cd:
            r14 = 0
        L_0x00ce:
            dn.d r12 = f36975a
            xm.q$n r13 = r48.mo46780s()
            ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRecipientTypeUiModel r13 = r13.mo46669a()
            boolean r13 = r12.mo32927g(r13)
            xm.q$l r15 = r48.mo46773l()
            boolean r15 = r15.mo46728e()
            java.lang.String r16 = "CARD_DELIVERY_APPLICATION_FORM"
            if (r0 == 0) goto L_0x00eb
        L_0x00e8:
            r18 = r16
            goto L_0x00f0
        L_0x00eb:
            if (r7 == 0) goto L_0x00e8
            java.lang.String r16 = "VIRTUAL_CARD_APPLICATION_FORM"
            goto L_0x00e8
        L_0x00f0:
            ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel r0 = r49.mo39882d()
            java.lang.String r19 = r0.getProduct()
            xm.q$k r0 = r48.mo46774m()
            java.lang.String r0 = r0.mo46669a()
            java.lang.String r20 = java.lang.String.valueOf(r0)
            java.lang.String r21 = r6.mo44353b()
            xm.q$c r0 = r48.mo46763d()
            m70.a r0 = r0.mo46669a()
            if (r0 == 0) goto L_0x0117
            java.lang.String r0 = r0.mo65111w()
            goto L_0x0118
        L_0x0117:
            r0 = 0
        L_0x0118:
            xm.q$c r16 = r48.mo46763d()
            m70.a r16 = r16.mo46669a()
            if (r16 == 0) goto L_0x0129
            java.lang.String r16 = r16.mo65094h()
            r3 = r16
            goto L_0x012a
        L_0x0129:
            r3 = 0
        L_0x012a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            nm.g0 r3 = p537nm.C17085g0.NEW_ACCOUNT
            if (r6 != r3) goto L_0x013f
            r4 = r5
            goto L_0x0140
        L_0x013f:
            r4 = 0
        L_0x0140:
            java.lang.Object r0 = r12.mo32928h(r0, r4)
            r22 = r0
            java.lang.String r22 = (java.lang.String) r22
            java.lang.String r0 = ""
            if (r6 != r3) goto L_0x0160
            xm.q$e r4 = r48.mo46766f()
            ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCurrencyUiModel r4 = r4.mo46669a()
            if (r4 == 0) goto L_0x015d
            java.lang.String r4 = r4.mo39510a()
            r23 = r4
            goto L_0x0162
        L_0x015d:
            r23 = 0
            goto L_0x0162
        L_0x0160:
            r23 = r0
        L_0x0162:
            if (r6 != r3) goto L_0x017c
            java.util.List r24 = r49.mo39885f()
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            dn.d$a r30 = p398dn.C12330d.C12331a.f36976d
            r31 = 31
            r32 = 0
            java.lang.String r0 = ie1.C41358y.m120017g0(r24, r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x017c:
            r24 = r0
            if (r7 == 0) goto L_0x0199
            if (r50 == 0) goto L_0x0187
            boolean r0 = r50.mo44466c()
            goto L_0x0188
        L_0x0187:
            r0 = 0
        L_0x0188:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            hd0.b r0 = hd0.C24978b.m79846b(r0)
            java.lang.String r0 = r0.mo63391e()
            if (r0 != 0) goto L_0x01ad
            hd0.b r0 = hd0.C24978b.NO
            goto L_0x01a9
        L_0x0199:
            if (r8 == 0) goto L_0x01a0
            boolean r0 = r8.mo44483e()
            goto L_0x01a1
        L_0x01a0:
            r0 = 0
        L_0x01a1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            hd0.b r0 = hd0.C24978b.m79846b(r0)
        L_0x01a9:
            java.lang.String r0 = r0.mo63391e()
        L_0x01ad:
            r25 = r0
            if (r8 == 0) goto L_0x01b6
            boolean r0 = r8.mo44483e()
            goto L_0x01b7
        L_0x01b6:
            r0 = 0
        L_0x01b7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            hd0.b r0 = hd0.C24978b.m79846b(r0)
            java.lang.String r26 = r0.mo63391e()
            if (r10 == 0) goto L_0x01ca
            java.lang.String r0 = r10.mo39900a()
            goto L_0x01cb
        L_0x01ca:
            r0 = 0
        L_0x01cb:
            if (r9 == 0) goto L_0x01d2
            java.lang.String r3 = r9.mo39913b()
            goto L_0x01d3
        L_0x01d2:
            r3 = 0
        L_0x01d3:
            xm.q$q r4 = r48.mo46767g()
            java.lang.String r4 = r4.mo46669a()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r0 = ", "
            r6.append(r0)
            r6.append(r3)
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            r3 = r15 ^ 1
            java.lang.Object r0 = r12.mo32928h(r0, r3)
            r27 = r0
            java.lang.String r27 = (java.lang.String) r27
            xm.q$q r0 = r48.mo46777p()
            java.lang.String r0 = r0.mo46669a()
            if (r0 != 0) goto L_0x020d
            java.lang.String r0 = r49.mo39891k()
        L_0x020d:
            r3 = r15 ^ 1
            java.lang.Object r0 = r12.mo32928h(r0, r3)
            r28 = r0
            java.lang.String r28 = (java.lang.String) r28
            xm.q$q r0 = r48.mo46778q()
            java.lang.String r0 = r0.mo46669a()
            if (r0 != 0) goto L_0x0225
            java.lang.String r0 = r49.mo39892l()
        L_0x0225:
            r3 = r15 ^ 1
            java.lang.Object r0 = r12.mo32928h(r0, r3)
            r29 = r0
            java.lang.String r29 = (java.lang.String) r29
            if (r13 == 0) goto L_0x0236
            xm.q$q r0 = r48.mo46772k()
            goto L_0x023a
        L_0x0236:
            xm.q$q r0 = r48.mo46779r()
        L_0x023a:
            java.lang.String r0 = r0.mo46669a()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3 = r15 ^ 1
            java.lang.Object r0 = r12.mo32928h(r0, r3)
            r30 = r0
            java.lang.String r30 = (java.lang.String) r30
            if (r51 == 0) goto L_0x025b
            double r3 = r51.mo44665a()
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            java.lang.String r0 = r0.toString()
            goto L_0x025c
        L_0x025b:
            r0 = 0
        L_0x025c:
            r3 = r15 ^ 1
            java.lang.Object r0 = r12.mo32928h(r0, r3)
            r31 = r0
            java.lang.String r31 = (java.lang.String) r31
            if (r51 == 0) goto L_0x026d
            java.lang.String r0 = r51.mo44666b()
            goto L_0x026e
        L_0x026d:
            r0 = 0
        L_0x026e:
            r3 = r15 ^ 1
            java.lang.Object r0 = r12.mo32928h(r0, r3)
            r32 = r0
            java.lang.String r32 = (java.lang.String) r32
            xm.q$p r0 = r48.mo46783u()
            xm.l r0 = r0.mo46669a()
            if (r0 == 0) goto L_0x0287
            java.lang.String r0 = r0.mo46647a()
            goto L_0x0288
        L_0x0287:
            r0 = 0
        L_0x0288:
            r3 = r15 ^ 1
            java.lang.Object r0 = r12.mo32928h(r0, r3)
            r33 = r0
            java.lang.String r33 = (java.lang.String) r33
            ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData r0 = r49.mo39886g()
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData r0 = r0.mo39780a()
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$RecoverCardOrderData r0 = r0.mo39286a()
            if (r0 == 0) goto L_0x02b3
            ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel r0 = r0.mo39308i()
            if (r0 == 0) goto L_0x02b3
            long r3 = r0.mo39815e()
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = r0.toString()
            goto L_0x02b4
        L_0x02b3:
            r0 = 0
        L_0x02b4:
            ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData r3 = r49.mo39886g()
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData r3 = r3.mo39780a()
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$RecoverCardOrderData r3 = r3.mo39286a()
            if (r3 == 0) goto L_0x02d0
            ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel r3 = r3.mo39308i()
            if (r3 == 0) goto L_0x02d0
            boolean r3 = r3.mo39819h()
            if (r3 != r5) goto L_0x02d0
            r3 = r5
            goto L_0x02d1
        L_0x02d0:
            r3 = 0
        L_0x02d1:
            java.lang.Object r0 = r12.mo32928h(r0, r3)
            r34 = r0
            java.lang.String r34 = (java.lang.String) r34
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            hd0.b r0 = hd0.C24978b.m79846b(r0)
            java.lang.String r0 = r0.mo63391e()
            java.lang.String r3 = "fromBoolean(isPayroll).value"
            kotlin.jvm.internal.C41536l.m120488h(r0, r3)
            if (r14 == 0) goto L_0x02f3
            dn.b r3 = p398dn.C12327b.f36972a
            java.lang.String r3 = r3.mo32916g(r14)
            goto L_0x02f4
        L_0x02f3:
            r3 = 0
        L_0x02f4:
            r4 = r11 ^ 1
            java.lang.Object r3 = r12.mo32928h(r3, r4)
            r36 = r3
            java.lang.String r36 = (java.lang.String) r36
            if (r14 == 0) goto L_0x0315
            boolean r3 = r14.mo39553f()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            hd0.b r3 = hd0.C24978b.m79846b(r3)
            if (r3 == 0) goto L_0x0315
            java.lang.String r4 = r3.mo63391e()
            r37 = r4
            goto L_0x0317
        L_0x0315:
            r37 = 0
        L_0x0317:
            ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel r2 = r49.mo39882d()
            boolean r2 = r2.getPlcSchoolFlag()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            hd0.b r2 = hd0.C24978b.m79846b(r2)
            java.lang.String r38 = r2.mo63391e()
            xm.q$i r1 = r48.mo46770i()
            ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel r1 = r1.mo46669a()
            if (r1 != 0) goto L_0x0337
            ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel$NoInsurance r1 = p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel.NoInsurance.f56170d
        L_0x0337:
            boolean r1 = r1 instanceof p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel.NoInsurance
            r1 = r1 ^ r5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            hd0.b r1 = hd0.C24978b.m79846b(r1)
            java.lang.String r39 = r1.mo63391e()
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 130023424(0x7c00000, float:2.888895E-34)
            r46 = 0
            ge.bog.mobilebank.cardapplications.data.model.OrderCardPreContractParams r1 = new ge.bog.mobilebank.cardapplications.data.model.OrderCardPreContractParams
            r17 = r1
            r35 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p398dn.C12330d.mo32924c(xm.r, ge.bog.mobilebank.cardapplications.presentation.model.a, nm.p, om.c):ge.bog.mobilebank.cardapplications.data.model.OrderCardPreContractParams");
    }

    /* renamed from: d */
    public final OrderCardPreContractParams mo32925d(C19079d dVar, C19073b bVar, C17267c cVar) {
        CardApplicationTypeData.SchoolCardOrderData schoolCardOrderData;
        JuniorRequestDataUiModel juniorRequestDataUiModel;
        boolean z;
        C17389d dVar2;
        C17389d dVar3;
        CardApplicationTypeData.PayRollCardOrderData payRollCardOrderData;
        DebitCardPayrollInfoUiModel debitCardPayrollInfoUiModel;
        C17085g0 g0Var;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C24978b b;
        RecoverCardUiModel i;
        RecoverCardUiModel i2;
        T t;
        boolean z4;
        C41536l.m120489i(dVar, "<this>");
        C41536l.m120489i(bVar, "resources");
        CardApplicationTypeData a = bVar.mo47259b().mo39780a();
        String str7 = null;
        if (a instanceof CardApplicationTypeData.SchoolCardOrderData) {
            schoolCardOrderData = (CardApplicationTypeData.SchoolCardOrderData) a;
        } else {
            schoolCardOrderData = null;
        }
        if (schoolCardOrderData != null) {
            juniorRequestDataUiModel = schoolCardOrderData.mo39319j();
        } else {
            juniorRequestDataUiModel = null;
        }
        boolean z5 = false;
        if (juniorRequestDataUiModel != null) {
            z = true;
        } else {
            z = false;
        }
        boolean f = bVar.mo47259b().mo39786f();
        C17102s a2 = bVar.mo47262e().mo44487a();
        C19072a b2 = dVar.mo47283c().mo47271b();
        if (b2 != null) {
            dVar2 = b2.mo47256a();
        } else {
            dVar2 = null;
        }
        C19072a b3 = dVar.mo47283c().mo47271b();
        if (b3 != null) {
            dVar3 = b3.mo47257b();
        } else {
            dVar3 = null;
        }
        C41224m a3 = C41233s.m119492a(dVar2, dVar3);
        C17389d dVar4 = (C17389d) a3.mo95675a();
        C17389d dVar5 = (C17389d) a3.mo95676b();
        boolean z6 = bVar.mo47259b().mo39780a() instanceof CardApplicationTypeData.PayRollCardOrderData;
        CardApplicationTypeData a4 = bVar.mo47259b().mo39780a();
        if (a4 instanceof CardApplicationTypeData.PayRollCardOrderData) {
            payRollCardOrderData = (CardApplicationTypeData.PayRollCardOrderData) a4;
        } else {
            payRollCardOrderData = null;
        }
        if (payRollCardOrderData != null) {
            Iterator<T> it = bVar.mo47258a().getClientPayrollInfo().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((DebitCardPayrollInfoUiModel) t).mo39548b() == payRollCardOrderData.mo39297j()) {
                    z4 = true;
                    continue;
                } else {
                    z4 = false;
                    continue;
                }
                if (z4) {
                    break;
                }
            }
            debitCardPayrollInfoUiModel = (DebitCardPayrollInfoUiModel) t;
        } else {
            debitCardPayrollInfoUiModel = null;
        }
        if (bVar.mo47259b().mo39790i()) {
            g0Var = C17085g0.EXISTING_ACCOUNT;
        } else {
            g0Var = C17085g0.NEW_ACCOUNT;
        }
        String str8 = "CARD_DELIVERY_APPLICATION_FORM";
        if (!z && f) {
            str8 = "VIRTUAL_CARD_APPLICATION_FORM";
        }
        String str9 = str8;
        String product = bVar.mo47258a().getProduct();
        String valueOf = String.valueOf(dVar.mo47285e().mo47275a());
        String b4 = g0Var.mo44353b();
        String g0 = C41358y.m120017g0(C41341q.m119910m("GEL", "USD", "EUR", "GBP"), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
        if (a2 != null) {
            z2 = a2.mo44483e();
        } else {
            z2 = false;
        }
        String e = C24978b.m79846b(Boolean.valueOf(z2)).mo63391e();
        if (a2 != null) {
            z3 = a2.mo44483e();
        } else {
            z3 = false;
        }
        String e2 = C24978b.m79846b(Boolean.valueOf(z3)).mo63391e();
        C12330d dVar6 = f36975a;
        if (dVar4 != null) {
            str = dVar4.mo44908b();
        } else {
            str = null;
        }
        if (dVar5 != null) {
            str2 = dVar5.mo44908b();
        } else {
            str2 = null;
        }
        String str10 = (String) dVar6.mo32928h(str + ", " + str2 + ", " + dVar.mo47284d().mo47275a(), false);
        String str11 = (String) dVar6.mo32928h(bVar.mo47263f(), false);
        String str12 = (String) dVar6.mo32928h(bVar.mo47264g(), false);
        String str13 = (String) dVar6.mo32928h(String.valueOf(dVar.mo47285e().mo47275a()), false);
        if (cVar != null) {
            str3 = Double.valueOf(cVar.mo44665a()).toString();
        } else {
            str3 = null;
        }
        String str14 = (String) dVar6.mo32928h(str3, false);
        if (cVar != null) {
            str4 = cVar.mo44666b();
        } else {
            str4 = null;
        }
        String str15 = (String) dVar6.mo32928h(str4, false);
        CardApplicationTypeData.RecoverCardOrderData a5 = bVar.mo47259b().mo39780a().mo39286a();
        if (a5 == null || (i2 = a5.mo39308i()) == null) {
            str5 = null;
        } else {
            str5 = Long.valueOf(i2.mo39815e()).toString();
        }
        CardApplicationTypeData.RecoverCardOrderData a6 = bVar.mo47259b().mo39780a().mo39286a();
        if (!(a6 == null || (i = a6.mo39308i()) == null || !i.mo39819h())) {
            z5 = true;
        }
        String str16 = (String) dVar6.mo32928h(str5, z5);
        String e3 = C24978b.m79846b(Boolean.valueOf(z6)).mo63391e();
        C41536l.m120488h(e3, "fromBoolean(isPayroll).value");
        if (debitCardPayrollInfoUiModel != null) {
            str6 = C12327b.f36972a.mo32916g(debitCardPayrollInfoUiModel);
        } else {
            str6 = null;
        }
        String str17 = (String) dVar6.mo32928h(str6, true ^ z6);
        if (!(debitCardPayrollInfoUiModel == null || (b = C24978b.m79846b(Boolean.valueOf(debitCardPayrollInfoUiModel.mo39553f()))) == null)) {
            str7 = b.mo63391e();
        }
        return new OrderCardPreContractParams(str9, product, valueOf, b4, (String) null, "GEL", g0, e, e2, str10, str11, str12, str13, str14, str15, (String) null, str16, e3, str17, str7, C24978b.m79846b(Boolean.valueOf(bVar.mo47258a().getPlcSchoolFlag())).mo63391e(), C24978b.m79846b(Boolean.FALSE).mo63391e(), (String) null, (String) null, (String) null, (String) null, (String) null, 130023424, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public final boolean mo32926f(DebitCardReceiveTypeUiModel debitCardReceiveTypeUiModel) {
        return (debitCardReceiveTypeUiModel != null ? debitCardReceiveTypeUiModel.mo39572a() : null) == C18805i.HOME;
    }

    /* renamed from: g */
    public final boolean mo32927g(DebitCardRecipientTypeUiModel debitCardRecipientTypeUiModel) {
        return (debitCardRecipientTypeUiModel != null ? debitCardRecipientTypeUiModel.mo39584b() : null) == C18807j.OTHER;
    }

    /* renamed from: h */
    public final Object mo32928h(Object obj, boolean z) {
        if (z) {
            return null;
        }
        return obj;
    }

    /* renamed from: i */
    public final C18833r mo32929i(C18833r rVar, C18811m mVar, List list) {
        C18815q.C18831p pVar;
        C18811m mVar2 = mVar;
        List list2 = list;
        C41536l.m120489i(rVar, "<this>");
        C41536l.m120489i(list2, "cities");
        C18815q.C18822g d = C18815q.C18822g.m63629d(rVar.mo46768h(), mVar2, false, 2, (Object) null);
        if (rVar.mo46783u().mo46669a() == null) {
            pVar = C18815q.C18831p.m63677d(rVar.mo46783u(), C12327b.f36972a.mo32911b(list2, new C12332b(mVar2)), false, 2, (Object) null);
        } else {
            pVar = rVar.mo46783u();
        }
        return C18833r.m63688b(rVar, (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, pVar, (C18815q.C18827l) null, (C18815q.C18829n) null, d, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1047999, (Object) null);
    }

    /* renamed from: j */
    public final C18833r mo32930j(C18833r rVar, C18815q.C18827l lVar, DebitCardPinDeliveryTypeUiModel debitCardPinDeliveryTypeUiModel, Integer num) {
        Integer num2;
        boolean z;
        DebitCardPinDeliveryTypeUiModel debitCardPinDeliveryTypeUiModel2;
        C41536l.m120489i(rVar, "<this>");
        C41536l.m120489i(lVar, "pickupType");
        boolean e = lVar.mo46728e();
        if (!e || num == null) {
            num2 = rVar.mo46775n().mo46735f();
        } else {
            num2 = num;
        }
        C18815q.C18822g d = C18815q.C18822g.m63629d(rVar.mo46768h(), (C18811m) null, e, 1, (Object) null);
        C18815q.C18832q g = C18815q.C18832q.m63681g(rVar.mo46767g(), (String) null, false, e, (C17799b) null, 11, (Object) null);
        C18815q.C18832q r = rVar.mo46779r();
        if (!e || mo32927g(rVar.mo46780s().mo46669a())) {
            z = false;
        } else {
            z = true;
        }
        C18833r b = C18833r.m63688b(rVar, (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, (C18815q.C18831p) null, lVar, (C18815q.C18829n) null, d, g, (C18815q.C18832q) null, (C18815q.C18832q) null, C18815q.C18832q.m63681g(r, (String) null, false, z, (C17799b) null, 11, (Object) null), (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1038719, (Object) null);
        C18815q.C18828m n = rVar.mo46775n();
        boolean z2 = !lVar.mo46728e();
        if (lVar.mo46728e()) {
            debitCardPinDeliveryTypeUiModel2 = debitCardPinDeliveryTypeUiModel;
        } else {
            debitCardPinDeliveryTypeUiModel2 = rVar.mo46775n().mo46669a();
        }
        return mo32933m(mo32931k(b, C18815q.C18828m.m63659d(n, debitCardPinDeliveryTypeUiModel2, num2, (C10515c) null, z2, 4, (Object) null)), C18815q.C18829n.m63666d(rVar.mo46780s(), (DebitCardRecipientTypeUiModel) null, 0, e, 3, (Object) null));
    }

    /* renamed from: k */
    public final C18833r mo32931k(C18833r rVar, C18815q.C18828m mVar) {
        C17081e0 e0Var;
        boolean z;
        C41536l.m120489i(rVar, "<this>");
        C41536l.m120489i(mVar, "pinDeliveryType");
        C18815q.C18826k m = rVar.mo46774m();
        DebitCardPinDeliveryTypeUiModel e = mVar.mo46669a();
        if (e != null) {
            e0Var = e.mo39561a();
        } else {
            e0Var = null;
        }
        if (e0Var == C17081e0.SMS) {
            z = true;
        } else {
            z = false;
        }
        return C18833r.m63688b(rVar, (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, mVar, (C18815q.C18820e) null, C18815q.C18826k.m63649g(m, (String) null, z, (C17799b) null, 5, (Object) null), (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1048535, (Object) null);
    }

    /* renamed from: l */
    public final C18833r mo32932l(C18833r rVar, String str) {
        C41536l.m120489i(rVar, "<this>");
        C41536l.m120489i(str, "number");
        if (mo32927g(rVar.mo46780s().mo46669a())) {
            return C18833r.m63688b(rVar, (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, C18815q.C18832q.m63681g(rVar.mo46772k(), str, false, false, (C17799b) null, 14, (Object) null), (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1032191, (Object) null);
        }
        return C18833r.m63688b(rVar, (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, C18815q.C18832q.m63681g(rVar.mo46779r(), str, false, false, (C17799b) null, 14, (Object) null), (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1040383, (Object) null);
    }

    /* renamed from: m */
    public final C18833r mo32933m(C18833r rVar, C18815q.C18829n nVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C41536l.m120489i(rVar, "<this>");
        C41536l.m120489i(nVar, "recipientType");
        boolean g = mo32927g(nVar.mo46669a());
        boolean e = rVar.mo46773l().mo46728e();
        C18815q.C18832q p = rVar.mo46777p();
        if (!e || !g) {
            z = false;
        } else {
            z = true;
        }
        C18815q.C18832q g2 = C18815q.C18832q.m63681g(p, (String) null, false, z, (C17799b) null, 11, (Object) null);
        C18815q.C18832q q = rVar.mo46778q();
        if (!e || !g) {
            z2 = false;
        } else {
            z2 = true;
        }
        C18815q.C18832q g3 = C18815q.C18832q.m63681g(q, (String) null, false, z2, (C17799b) null, 11, (Object) null);
        C18815q.C18825j o = rVar.mo46776o();
        if (!e || !g) {
            z3 = false;
        } else {
            z3 = true;
        }
        C18815q.C18825j d = C18815q.C18825j.m63643d(o, (Long) null, z3, false, 5, (Object) null);
        C18815q.C18832q k = rVar.mo46772k();
        if (!e || !g) {
            z4 = false;
        } else {
            z4 = true;
        }
        C18815q.C18832q g4 = C18815q.C18832q.m63681g(k, (String) null, false, z4, (C17799b) null, 11, (Object) null);
        C18815q.C18832q r = rVar.mo46779r();
        if (!e || mo32927g(nVar.mo46669a())) {
            z5 = false;
        } else {
            z5 = true;
        }
        return C18833r.m63688b(rVar, (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, (C18815q.C18831p) null, (C18815q.C18827l) null, nVar, (C18815q.C18822g) null, (C18815q.C18832q) null, g2, g3, C18815q.C18832q.m63681g(r, (String) null, false, z5, (C17799b) null, 11, (Object) null), g4, d, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 984831, (Object) null);
    }
}
