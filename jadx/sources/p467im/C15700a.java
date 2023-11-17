package p467im;

import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import gb1.C32393w;
import hd0.C24978b;
import he1.C41232r;
import i31.C36344a;
import i31.C36345b;
import i31.C36346c;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cardapplications.data.entity.ActiveCardEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.CardApplicationTypeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.CardBenefitsEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.CardClientCountryInfoEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.CardDailyLimitEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.CardSmallImageEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.CardSubTypeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.CsDefaultDepartmentEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.CsFlag;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardAppAccountEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardCommissionEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardCurrencyEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardFeeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardNicknameEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardPayrollInfoEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardPinDeliveryTypeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardRegTypeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardTextContainerEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardTextsEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.RecoverCardEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.RegionEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.ScoolCardInfoEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.ScoolCardOwnerEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.delivery.CardDeliveryAddressesEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.delivery.DeliveryCityEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.delivery.DeliveryDistrictEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.delivery.DeliveryFeeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.instantcards.InstantCardActivationResultEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.instantcards.InstantDeliveryPointEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.instantcards.PointTypeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.instantcards.ValidatedInstantCardEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.insurance.DebitCardInsuranceFeeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.insurance.DebitCardInsuranceInfoEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.insurance.DebitCardInsuranceTypeEntity;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.CardExternalFileEntity;
import p537nm.C17069a;
import p537nm.C17070a0;
import p537nm.C17071b;
import p537nm.C17073b0;
import p537nm.C17074c;
import p537nm.C17077d;
import p537nm.C17078d0;
import p537nm.C17080e;
import p537nm.C17081e0;
import p537nm.C17082f;
import p537nm.C17083f0;
import p537nm.C17084g;
import p537nm.C17085g0;
import p537nm.C17086h;
import p537nm.C17087h0;
import p537nm.C17088i;
import p537nm.C17090i0;
import p537nm.C17093j0;
import p537nm.C17094k;
import p537nm.C17095l;
import p537nm.C17096m;
import p537nm.C17097n;
import p537nm.C17098o;
import p537nm.C17099p;
import p537nm.C17101r;
import p537nm.C17102s;
import p537nm.C17104u;
import p537nm.C17106w;
import p537nm.C17107x;
import p537nm.C17108y;
import p551om.C17265a;
import p551om.C17266b;
import p551om.C17267c;
import p565pm.C17387b;
import p565pm.C17389d;
import p565pm.C17390e;
import p565pm.C17391f;
import p717bs.C19401a;

/* renamed from: im.a */
public final class C15700a {

    /* renamed from: im.a$a */
    public /* synthetic */ class C15701a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44526a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f44527b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003b */
        static {
            /*
                ge.bog.mobilebank.cardapplications.data.entity.instantcards.PointTypeEntity[] r0 = p341ge.bog.mobilebank.cardapplications.data.entity.instantcards.PointTypeEntity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ge.bog.mobilebank.cardapplications.data.entity.instantcards.PointTypeEntity r2 = p341ge.bog.mobilebank.cardapplications.data.entity.instantcards.PointTypeEntity.ADDRESS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ge.bog.mobilebank.cardapplications.data.entity.instantcards.PointTypeEntity r3 = p341ge.bog.mobilebank.cardapplications.data.entity.instantcards.PointTypeEntity.COUNTRY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                ge.bog.mobilebank.cardapplications.data.entity.instantcards.PointTypeEntity r4 = p341ge.bog.mobilebank.cardapplications.data.entity.instantcards.PointTypeEntity.CITY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f44526a = r0
                pm.e[] r0 = p565pm.C17390e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                pm.e r4 = p565pm.C17390e.ADDRESS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                pm.e r1 = p565pm.C17390e.COUNTRY     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                pm.e r1 = p565pm.C17390e.CITY     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                f44527b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p467im.C15700a.C15701a.<clinit>():void");
        }
    }

    /* renamed from: J */
    private final List m56545J(List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m56547g((ActiveCardEntity) it.next()));
        }
        return arrayList;
    }

    /* renamed from: M */
    private final List m56546M(List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo43013D((DeliveryDistrictEntity) it.next()));
        }
        return arrayList;
    }

    /* renamed from: g */
    private final C17069a m56547g(ActiveCardEntity activeCardEntity) {
        long j;
        long j2;
        String str;
        C17086h hVar;
        boolean z;
        long id = activeCardEntity.getId();
        long cardForTypeDescKeyId = activeCardEntity.getCardForTypeDescKeyId();
        String lastFour = activeCardEntity.getLastFour();
        long expDate = activeCardEntity.getExpDate();
        String acctNo = activeCardEntity.getAcctNo();
        long acctKey = activeCardEntity.getAcctKey();
        long clientKey = activeCardEntity.getClientKey();
        long cardId = activeCardEntity.getCardId();
        String subProductCode = activeCardEntity.getSubProductCode();
        String cardNameKey = activeCardEntity.getCardNameKey();
        String cardNameValue = activeCardEntity.getCardNameValue();
        CardExternalFileEntity cardExternalFile = activeCardEntity.getCardExternalFile();
        if (cardExternalFile != null) {
            String fileSubType = cardExternalFile.getFileSubType();
            if (fileSubType == null) {
                fileSubType = activeCardEntity.getSubProductCode();
            }
            j2 = cardId;
            str = subProductCode;
            String str2 = fileSubType;
            if (cardExternalFile.isDark() == YesNoApiEntity.YES) {
                z = true;
            } else {
                z = false;
            }
            j = clientKey;
            hVar = new C17086h(z, cardExternalFile.getFileUrl(), cardExternalFile.getFileType(), str2);
        } else {
            j = clientKey;
            j2 = cardId;
            str = subProductCode;
            hVar = null;
        }
        return new C17069a(id, cardForTypeDescKeyId, lastFour, expDate, acctNo, acctKey, j, j2, str, cardNameKey, cardNameValue, (String) null, hVar);
    }

    /* renamed from: n */
    private final C17095l m56548n(CardSubTypeEntity cardSubTypeEntity) {
        boolean z;
        String product = cardSubTypeEntity.getProduct();
        String subProductCode = cardSubTypeEntity.getSubProductCode();
        String orderNumber = cardSubTypeEntity.getOrderNumber();
        String regionId = cardSubTypeEntity.getRegionId();
        if (cardSubTypeEntity.getDigitalCardFlag() == YesNoApiEntity.YES) {
            z = true;
        } else {
            z = false;
        }
        return new C17095l(product, subProductCode, orderNumber, regionId, z);
    }

    /* renamed from: A */
    public final C17087h0 mo43010A(RegionEntity regionEntity) {
        boolean z;
        C24978b a;
        C41536l.m120489i(regionEntity, "region");
        String regionId = regionEntity.getRegionId();
        String regionName = regionEntity.getRegionName();
        YesNoApiEntity regionFlag = regionEntity.getRegionFlag();
        if (regionFlag == null || (a = C19401a.m64892a(regionFlag)) == null) {
            z = false;
        } else {
            z = a.mo63390c();
        }
        return new C17087h0(regionId, regionName, z);
    }

    /* renamed from: B */
    public final C17090i0 mo43011B(ScoolCardInfoEntity scoolCardInfoEntity) {
        boolean z;
        C41536l.m120489i(scoolCardInfoEntity, "scoolCardInfoEntity");
        String plcClass = scoolCardInfoEntity.getPlcClass();
        String plcType = scoolCardInfoEntity.getPlcType();
        String typeName = scoolCardInfoEntity.getTypeName();
        String product = scoolCardInfoEntity.getProduct();
        long linkId = scoolCardInfoEntity.getLinkId();
        String subProductCode = scoolCardInfoEntity.getSubProductCode();
        String cardNameKey = scoolCardInfoEntity.getCardNameKey();
        if (scoolCardInfoEntity.getCsFlag() == CsFlag.A) {
            z = true;
        } else {
            z = false;
        }
        return new C17090i0(plcClass, plcType, typeName, product, linkId, subProductCode, cardNameKey, z, scoolCardInfoEntity.getCardNameValue(), C19401a.m64892a(scoolCardInfoEntity.getRegionFlag()).mo63390c());
    }

    /* renamed from: C */
    public final C17093j0 mo43012C(ScoolCardOwnerEntity scoolCardOwnerEntity) {
        C41536l.m120489i(scoolCardOwnerEntity, "scoolCardOwnerEntity");
        return new C17093j0(scoolCardOwnerEntity.getChildClientKey(), scoolCardOwnerEntity.getFirstName(), scoolCardOwnerEntity.getLastName(), String.valueOf(scoolCardOwnerEntity.getFirstNameInt()), String.valueOf(scoolCardOwnerEntity.getLastNameInt()), scoolCardOwnerEntity.getBirthDate(), String.valueOf(scoolCardOwnerEntity.getPin()));
    }

    /* renamed from: D */
    public final C17266b mo43013D(DeliveryDistrictEntity deliveryDistrictEntity) {
        C41536l.m120489i(deliveryDistrictEntity, "entity");
        return new C17266b(deliveryDistrictEntity.getDistrictName(), deliveryDistrictEntity.getId(), deliveryDistrictEntity.getCityId());
    }

    /* renamed from: E */
    public final C17267c mo43014E(DeliveryFeeEntity deliveryFeeEntity) {
        C41536l.m120489i(deliveryFeeEntity, "entity");
        return new C17267c(deliveryFeeEntity.getFeeAmount(), deliveryFeeEntity.getFeeCcy());
    }

    /* renamed from: F */
    public final C17387b mo43015F(InstantCardActivationResultEntity instantCardActivationResultEntity) {
        long j;
        C41536l.m120489i(instantCardActivationResultEntity, "entity");
        Long cardId = instantCardActivationResultEntity.getCardId();
        if (cardId != null) {
            j = cardId.longValue();
        } else {
            j = -1;
        }
        return new C17387b(j);
    }

    /* renamed from: G */
    public final C17389d mo43016G(InstantDeliveryPointEntity instantDeliveryPointEntity) {
        ArrayList arrayList;
        C41536l.m120489i(instantDeliveryPointEntity, "entity");
        long id = instantDeliveryPointEntity.getId();
        String parentId = instantDeliveryPointEntity.getParentId();
        String langCode = instantDeliveryPointEntity.getLangCode();
        C17390e H = mo43017H(instantDeliveryPointEntity.getPointType());
        String pointValue = instantDeliveryPointEntity.getPointValue();
        String pointDesc = instantDeliveryPointEntity.getPointDesc();
        List<InstantDeliveryPointEntity> points = instantDeliveryPointEntity.getPoints();
        if (points != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(points, 10));
            for (InstantDeliveryPointEntity G : points) {
                arrayList2.add(mo43016G(G));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new C17389d(id, parentId, langCode, H, pointValue, pointDesc, arrayList);
    }

    /* renamed from: H */
    public final C17390e mo43017H(PointTypeEntity pointTypeEntity) {
        int i;
        if (pointTypeEntity == null) {
            i = -1;
        } else {
            i = C15701a.f44526a[pointTypeEntity.ordinal()];
        }
        if (i == 1) {
            return C17390e.ADDRESS;
        }
        if (i == 2) {
            return C17390e.COUNTRY;
        }
        if (i != 3) {
            return C17390e.COUNTRY;
        }
        return C17390e.CITY;
    }

    /* renamed from: I */
    public final C17391f mo43018I(ValidatedInstantCardEntity validatedInstantCardEntity) {
        C41536l.m120489i(validatedInstantCardEntity, "entity");
        String cardClass = validatedInstantCardEntity.getCardClass();
        String cardType = validatedInstantCardEntity.getCardType();
        String pinDeliveryType = validatedInstantCardEntity.getPinDeliveryType();
        C17081e0 e0Var = C17081e0.SMS;
        if (!C41536l.m120484d(pinDeliveryType, e0Var.name())) {
            e0Var = C17081e0.ENVELOPE;
        }
        return new C17391f(new C17107x(cardClass, cardType, e0Var, ""), validatedInstantCardEntity.getCardType(), validatedInstantCardEntity.getCardClass(), validatedInstantCardEntity.getProduct());
    }

    /* renamed from: K */
    public final List mo43019K(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17074c h = mo43029h((CardApplicationTypeEntity) it.next());
            if (h != null) {
                arrayList.add(h);
            }
        }
        return arrayList;
    }

    /* renamed from: L */
    public final List mo43020L(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CsDefaultDepartmentEntity csDefaultDepartmentEntity = (CsDefaultDepartmentEntity) it.next();
            arrayList.add(new C17096m(csDefaultDepartmentEntity.getId(), csDefaultDepartmentEntity.getCsDefDepartment()));
        }
        return arrayList;
    }

    /* renamed from: N */
    public final List mo43021N(List list) {
        C41536l.m120489i(list, "cards");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo43046z((RecoverCardEntity) it.next()));
        }
        return arrayList;
    }

    /* renamed from: O */
    public final List mo43022O(List list) {
        C41536l.m120489i(list, "limits");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo43032k((CardDailyLimitEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final he1.C41232r mo43023a(p341ge.bog.mobilebank.cardapplications.data.entity.CardApplicationTypeEntity r7) {
        /*
            r6 = this;
            java.lang.String r0 = "entity"
            kotlin.jvm.internal.C41536l.m120489i(r7, r0)
            java.util.List r0 = r7.getCardAppType()
            r1 = 0
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = ie1.C41358y.m120009Y(r0)
            ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity r0 = (p341ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity) r0
            if (r0 == 0) goto L_0x001f
            nm.b$a r2 = p537nm.C17071b.f47693g
            java.lang.String r0 = r0.getLookupValue()
            nm.b r0 = r2.mo44271a(r0)
            goto L_0x0020
        L_0x001f:
            r0 = r1
        L_0x0020:
            java.util.List r2 = r7.getCardAppType()
            if (r2 == 0) goto L_0x004e
            java.util.Iterator r2 = r2.iterator()
        L_0x002a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0044
            java.lang.Object r3 = r2.next()
            r4 = r3
            ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity r4 = (p341ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity) r4
            java.lang.String r4 = r4.getLookupName()
            java.lang.String r5 = "CARD_APP_TYPE"
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x002a
            goto L_0x0045
        L_0x0044:
            r3 = r1
        L_0x0045:
            ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity r3 = (p341ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity) r3
            if (r3 == 0) goto L_0x004e
            java.lang.String r2 = r3.getDictionaryKey()
            goto L_0x004f
        L_0x004e:
            r2 = r1
        L_0x004f:
            java.util.List r7 = r7.getCardAppType()
            if (r7 == 0) goto L_0x007c
            java.util.Iterator r7 = r7.iterator()
        L_0x0059:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0073
            java.lang.Object r3 = r7.next()
            r4 = r3
            ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity r4 = (p341ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity) r4
            java.lang.String r4 = r4.getLookupName()
            java.lang.String r5 = "CARD_APP_TYPE_DESC"
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x0059
            goto L_0x0074
        L_0x0073:
            r3 = r1
        L_0x0074:
            ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity r3 = (p341ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity) r3
            if (r3 == 0) goto L_0x007c
            java.lang.String r1 = r3.getDictionaryKey()
        L_0x007c:
            he1.r r7 = new he1.r
            r7.<init>(r0, r2, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p467im.C15700a.mo43023a(ge.bog.mobilebank.cardapplications.data.entity.CardApplicationTypeEntity):he1.r");
    }

    /* renamed from: b */
    public final C36344a mo43024b(DebitCardInsuranceFeeEntity debitCardInsuranceFeeEntity) {
        double d;
        C41536l.m120489i(debitCardInsuranceFeeEntity, "fee");
        Double fee = debitCardInsuranceFeeEntity.getFee();
        if (fee != null) {
            d = fee.doubleValue();
        } else {
            d = Utils.DOUBLE_EPSILON;
        }
        String insuranceType = debitCardInsuranceFeeEntity.getInsuranceType();
        if (insuranceType == null) {
            insuranceType = "";
        }
        return new C36344a(d, insuranceType, debitCardInsuranceFeeEntity.getInsuranceRealFee());
    }

    /* renamed from: c */
    public final C36345b mo43025c(DebitCardInsuranceInfoEntity debitCardInsuranceInfoEntity) {
        List list;
        List list2;
        int i;
        C41536l.m120489i(debitCardInsuranceInfoEntity, "entity");
        List<DebitCardInsuranceFeeEntity> insuranceFee = debitCardInsuranceInfoEntity.getInsuranceFee();
        if (insuranceFee != null) {
            list = new ArrayList(C41343r.m119925u(insuranceFee, 10));
            for (DebitCardInsuranceFeeEntity b : insuranceFee) {
                list.add(mo43024b(b));
            }
        } else {
            list = C41341q.m119907j();
        }
        List<DebitCardInsuranceTypeEntity> insuranceTypes = debitCardInsuranceInfoEntity.getInsuranceTypes();
        if (insuranceTypes != null) {
            list2 = new ArrayList(C41343r.m119925u(insuranceTypes, 10));
            for (DebitCardInsuranceTypeEntity d : insuranceTypes) {
                list2.add(mo43026d(d));
            }
        } else {
            list2 = C41341q.m119907j();
        }
        Integer numberOfRecords = debitCardInsuranceInfoEntity.getNumberOfRecords();
        if (numberOfRecords != null) {
            i = numberOfRecords.intValue();
        } else {
            i = 0;
        }
        return new C36345b(list, list2, i);
    }

    /* renamed from: d */
    public final C36346c mo43026d(DebitCardInsuranceTypeEntity debitCardInsuranceTypeEntity) {
        C41536l.m120489i(debitCardInsuranceTypeEntity, "type");
        return new C36346c(debitCardInsuranceTypeEntity.getId(), debitCardInsuranceTypeEntity.getInsuranceType(), debitCardInsuranceTypeEntity.getCardSubProductCode(), debitCardInsuranceTypeEntity.getDictionaryKey(), debitCardInsuranceTypeEntity.getDetailsDictionaryKey(), debitCardInsuranceTypeEntity.getInsuranceLimitPosValue(), debitCardInsuranceTypeEntity.getInsuranceLimitOnlinePaymentsValue());
    }

    /* renamed from: e */
    public final List mo43027e(CardDeliveryAddressesEntity cardDeliveryAddressesEntity) {
        C41536l.m120489i(cardDeliveryAddressesEntity, "deliveryAddressesEntity");
        List<DeliveryCityEntity> cities = cardDeliveryAddressesEntity.getCities();
        if (cities == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(cities, 10));
        for (DeliveryCityEntity deliveryCityEntity : cities) {
            String cityName = deliveryCityEntity.getCityName();
            List<DeliveryDistrictEntity> districts = deliveryCityEntity.getDistricts();
            if (districts == null) {
                districts = C41341q.m119907j();
            }
            arrayList.add(new C17265a(cityName, m56546M(districts), deliveryCityEntity.getId()));
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List mo43028f(List list) {
        C41536l.m120489i(list, "debitCardEntities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo43035o((DebitCardEntity) it.next()));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final C17074c mo43029h(CardApplicationTypeEntity cardApplicationTypeEntity) {
        C17088i iVar;
        C41536l.m120489i(cardApplicationTypeEntity, "entity");
        C41232r a = mo43023a(cardApplicationTypeEntity);
        C17071b bVar = (C17071b) a.mo95688a();
        String str = (String) a.mo95689b();
        String str2 = (String) a.mo95690c();
        ArrayList arrayList = null;
        if (bVar == null) {
            return null;
        }
        C17077d dVar = new C17077d(bVar, str, str2);
        String clientCountry = cardApplicationTypeEntity.getClientCountry();
        String cardOrderAgreementStatus = cardApplicationTypeEntity.getCardOrderAgreementStatus();
        if (cardOrderAgreementStatus != null) {
            iVar = C17088i.f47791e.mo44364a(cardOrderAgreementStatus);
        } else {
            iVar = null;
        }
        String countryNameGe = cardApplicationTypeEntity.getCountryNameGe();
        String countryNameEn = cardApplicationTypeEntity.getCountryNameEn();
        boolean e = C32393w.m95664e(cardApplicationTypeEntity.getShowInstantCard());
        List<RegionEntity> regions = cardApplicationTypeEntity.getRegions();
        if (regions != null) {
            arrayList = new ArrayList(C41343r.m119925u(regions, 10));
            for (RegionEntity A : regions) {
                arrayList.add(mo43010A(A));
            }
        }
        return new C17074c(dVar, clientCountry, iVar, countryNameGe, countryNameEn, e, arrayList);
    }

    /* renamed from: i */
    public final C17080e mo43030i(CardBenefitsEntity cardBenefitsEntity) {
        C41536l.m120489i(cardBenefitsEntity, "cardBenefitsEntity");
        return new C17080e(cardBenefitsEntity.getId(), cardBenefitsEntity.getObjectType(), cardBenefitsEntity.getObjectCode(), cardBenefitsEntity.getObjectUrl(), cardBenefitsEntity.getLanguageCode());
    }

    /* renamed from: j */
    public final C17082f mo43031j(CardClientCountryInfoEntity cardClientCountryInfoEntity) {
        boolean z;
        C41536l.m120489i(cardClientCountryInfoEntity, "entity");
        String clientCountry = cardClientCountryInfoEntity.getClientCountry();
        C17088i a = C17088i.f47791e.mo44364a(cardClientCountryInfoEntity.getCardOrderAgreementStatus());
        String countryNameGe = cardClientCountryInfoEntity.getCountryNameGe();
        String countryNameEn = cardClientCountryInfoEntity.getCountryNameEn();
        if (cardClientCountryInfoEntity.getShowInstantCard() == YesNoApiEntity.YES) {
            z = true;
        } else {
            z = false;
        }
        return new C17082f(clientCountry, a, countryNameGe, countryNameEn, z);
    }

    /* renamed from: k */
    public final C17084g mo43032k(CardDailyLimitEntity cardDailyLimitEntity) {
        boolean z;
        C41536l.m120489i(cardDailyLimitEntity, "entity");
        long id = cardDailyLimitEntity.getId();
        String prodType = cardDailyLimitEntity.getProdType();
        String dailyLimitType = cardDailyLimitEntity.getDailyLimitType();
        String limitTypeDesc = cardDailyLimitEntity.getLimitTypeDesc();
        if (cardDailyLimitEntity.getShowFlag() == YesNoApiEntity.YES) {
            z = true;
        } else {
            z = false;
        }
        return new C17084g(id, prodType, dailyLimitType, limitTypeDesc, z);
    }

    /* renamed from: l */
    public final C17086h mo43033l(CardExternalFileEntity cardExternalFileEntity) {
        boolean z;
        C41536l.m120489i(cardExternalFileEntity, "externalFile");
        String valueOf = String.valueOf(cardExternalFileEntity.getFileSubType());
        if (cardExternalFileEntity.isDark() == YesNoApiEntity.YES) {
            z = true;
        } else {
            z = false;
        }
        return new C17086h(z, cardExternalFileEntity.getFileUrl(), cardExternalFileEntity.getFileType(), valueOf);
    }

    /* renamed from: m */
    public final C17094k mo43034m(CardSmallImageEntity cardSmallImageEntity) {
        boolean z;
        C41536l.m120489i(cardSmallImageEntity, "image");
        if (cardSmallImageEntity.isDark() == YesNoApiEntity.YES) {
            z = true;
        } else {
            z = false;
        }
        return new C17094k(z, cardSmallImageEntity.getFileUrl());
    }

    /* renamed from: o */
    public final C17097n mo43035o(DebitCardEntity debitCardEntity) {
        boolean z;
        ArrayList arrayList;
        String str;
        boolean z2;
        boolean z3;
        ArrayList arrayList2;
        boolean z4;
        ArrayList arrayList3;
        C17094k kVar;
        boolean z5;
        List list;
        C41536l.m120489i(debitCardEntity, "debitCardEntity");
        String plcClass = debitCardEntity.getPlcClass();
        String plcType = debitCardEntity.getPlcType();
        String typeName = debitCardEntity.getTypeName();
        String isCreditCard = debitCardEntity.isCreditCard();
        String appType = debitCardEntity.getAppType();
        String prodGroup = debitCardEntity.getProdGroup();
        String product = debitCardEntity.getProduct();
        long linkId = debitCardEntity.getLinkId();
        String customDesignFlag = debitCardEntity.getCustomDesignFlag();
        String subProductCode = debitCardEntity.getSubProductCode();
        String objectUrl = debitCardEntity.getObjectUrl();
        if (debitCardEntity.isStudentCard() == YesNoApiEntity.YES) {
            z = true;
        } else {
            z = false;
        }
        String cardNameKey = debitCardEntity.getCardNameKey();
        String advantagesKey = debitCardEntity.getAdvantagesKey();
        String cardDetailsKey = debitCardEntity.getCardDetailsKey();
        String cardPriceKey = debitCardEntity.getCardPriceKey();
        String expDateKey = debitCardEntity.getExpDateKey();
        String useClientNickname = debitCardEntity.getUseClientNickname();
        String minAmountKey = debitCardEntity.getMinAmountKey();
        String digitalCardFlag = debitCardEntity.getDigitalCardFlag();
        String digitalCardPriceKey = debitCardEntity.getDigitalCardPriceKey();
        String digitalCardPriceValue = debitCardEntity.getDigitalCardPriceValue();
        String cardPriceValue = debitCardEntity.getCardPriceValue();
        C17070a0 x = mo43044x(debitCardEntity.getTexts());
        List<CardSubTypeEntity> cardSubTypes = debitCardEntity.getCardSubTypes();
        String str2 = cardNameKey;
        if (cardSubTypes != null) {
            z2 = z;
            str = objectUrl;
            ArrayList arrayList4 = new ArrayList(C41343r.m119925u(cardSubTypes, 10));
            for (CardSubTypeEntity n : cardSubTypes) {
                arrayList4.add(m56548n(n));
            }
            arrayList = arrayList4;
        } else {
            str = objectUrl;
            z2 = z;
            arrayList = null;
        }
        if (debitCardEntity.getCsFlag() == CsFlag.A) {
            z3 = true;
        } else {
            z3 = false;
        }
        List<DebitCardPayrollInfoEntity> clientPayrollInfo = debitCardEntity.getClientPayrollInfo();
        if (clientPayrollInfo != null) {
            ArrayList arrayList5 = new ArrayList(C41343r.m119925u(clientPayrollInfo, 10));
            for (DebitCardPayrollInfoEntity u : clientPayrollInfo) {
                arrayList5.add(mo43041u(u));
            }
            arrayList2 = arrayList5;
        } else {
            arrayList2 = C41341q.m119907j();
        }
        String cardNameValue = debitCardEntity.getCardNameValue();
        if (debitCardEntity.getPlcSchoolFlag() == YesNoApiEntity.YES) {
            z4 = true;
        } else {
            z4 = false;
        }
        List<ScoolCardOwnerEntity> clientChildren = debitCardEntity.getClientChildren();
        if (clientChildren != null) {
            ArrayList arrayList6 = new ArrayList(C41343r.m119925u(clientChildren, 10));
            for (ScoolCardOwnerEntity C : clientChildren) {
                arrayList6.add(mo43012C(C));
            }
            arrayList3 = arrayList6;
        } else {
            arrayList3 = C41341q.m119907j();
        }
        String cardLimitCheck = debitCardEntity.getCardLimitCheck();
        CardSmallImageEntity cardSmallImage = debitCardEntity.getCardSmallImage();
        if (cardSmallImage != null) {
            kVar = mo43034m(cardSmallImage);
        } else {
            kVar = null;
        }
        C17078d0 a = C17078d0.f47733e.mo44301a(debitCardEntity.getDefaultCard());
        String regionId = debitCardEntity.getRegionId();
        String detailsUrl = debitCardEntity.getDetailsUrl();
        if (debitCardEntity.getConciergeFlag() == YesNoApiEntity.YES) {
            z5 = true;
        } else {
            z5 = false;
        }
        String designId = debitCardEntity.getDesignId();
        List<String> cardAdditionalParams = debitCardEntity.getCardAdditionalParams();
        if (cardAdditionalParams == null || (list = C41358y.m120004T(cardAdditionalParams)) == null) {
            list = C41341q.m119907j();
        }
        List list2 = list;
        List<CardBenefitsEntity> cardBenefits = debitCardEntity.getCardBenefits();
        ArrayList arrayList7 = new ArrayList(C41343r.m119925u(cardBenefits, 10));
        for (CardBenefitsEntity i : cardBenefits) {
            arrayList7.add(mo43030i(i));
        }
        return new C17097n(plcClass, plcType, typeName, isCreditCard, appType, prodGroup, product, linkId, customDesignFlag, subProductCode, str, z2, str2, advantagesKey, cardDetailsKey, cardPriceKey, expDateKey, useClientNickname, minAmountKey, digitalCardFlag, digitalCardPriceKey, digitalCardPriceValue, cardPriceValue, x, arrayList, z3, arrayList2, cardNameValue, z4, arrayList3, cardLimitCheck, kVar, a, regionId, detailsUrl, z5, designId, list2, arrayList7);
    }

    /* renamed from: p */
    public final C17098o mo43036p(DebitCardAppAccountEntity debitCardAppAccountEntity) {
        String str;
        C41536l.m120489i(debitCardAppAccountEntity, "debitCardAppAccountEntity");
        long acctKey = debitCardAppAccountEntity.getAcctKey();
        String acctNo = debitCardAppAccountEntity.getAcctNo();
        String ccy = debitCardAppAccountEntity.getCcy();
        String planType = debitCardAppAccountEntity.getPlanType();
        String planCode = debitCardAppAccountEntity.getPlanCode();
        long clientKey = debitCardAppAccountEntity.getClientKey();
        String cardClass = debitCardAppAccountEntity.getCardClass();
        String cardType = debitCardAppAccountEntity.getCardType();
        String availableAmount = debitCardAppAccountEntity.getAvailableAmount();
        String acctDesc = debitCardAppAccountEntity.getAcctDesc();
        if (acctDesc == null) {
            str = debitCardAppAccountEntity.getAcctNo();
        } else {
            str = acctDesc;
        }
        return new C17098o(acctKey, acctNo, ccy, planType, planCode, clientKey, cardClass, cardType, availableAmount, str);
    }

    /* renamed from: q */
    public final C17099p mo43037q(DebitCardCommissionEntity debitCardCommissionEntity) {
        C41536l.m120489i(debitCardCommissionEntity, "entity");
        return new C17099p(debitCardCommissionEntity.getComAmount(), debitCardCommissionEntity.getComCcy(), C41536l.m120484d(debitCardCommissionEntity.getNewAccPackage(), C24978b.YES.mo63391e()));
    }

    /* renamed from: r */
    public final C17101r mo43038r(DebitCardCurrencyEntity debitCardCurrencyEntity) {
        C41536l.m120489i(debitCardCurrencyEntity, "debitCardCurrencyEntity");
        return new C17101r(debitCardCurrencyEntity.getCcy(), debitCardCurrencyEntity.getLinkId());
    }

    /* renamed from: s */
    public final C17102s mo43039s(DebitCardFeeEntity debitCardFeeEntity) {
        boolean z;
        boolean z2;
        double d;
        if (debitCardFeeEntity != null) {
            C24978b cardRecoveryFlag = debitCardFeeEntity.getCardRecoveryFlag();
            if (cardRecoveryFlag != null) {
                z = cardRecoveryFlag.mo63390c();
            } else {
                z = false;
            }
            List<ActiveCardEntity> cardData = debitCardFeeEntity.getCardData();
            if (cardData == null) {
                cardData = C41341q.m119907j();
            }
            List J = m56545J(cardData);
            double comAmount = debitCardFeeEntity.getComAmount();
            String comCcy = debitCardFeeEntity.getComCcy();
            C24978b packageRegFlag = debitCardFeeEntity.getPackageRegFlag();
            if (packageRegFlag != null) {
                z2 = packageRegFlag.mo63390c();
            } else {
                z2 = false;
            }
            Double packFeeAmount = debitCardFeeEntity.getPackFeeAmount();
            if (packFeeAmount != null) {
                d = packFeeAmount.doubleValue();
            } else {
                d = Utils.DOUBLE_EPSILON;
            }
            double d2 = d;
            String packFeeCcy = debitCardFeeEntity.getPackFeeCcy();
            if (packFeeCcy == null) {
                packFeeCcy = "";
            }
            return new C17102s(z, J, comAmount, comCcy, z2, d2, packFeeCcy, (C17267c) null, (Long) null, C11398b.f33139r, (DefaultConstructorMarker) null);
        }
        return null;
    }

    /* renamed from: t */
    public final C17104u mo43040t(DebitCardNicknameEntity debitCardNicknameEntity) {
        C41536l.m120489i(debitCardNicknameEntity, "cardNicknameEntity");
        return new C17104u(debitCardNicknameEntity.getCardNickname(), debitCardNicknameEntity.getClientNickname());
    }

    /* renamed from: u */
    public final C17106w mo43041u(DebitCardPayrollInfoEntity debitCardPayrollInfoEntity) {
        String str;
        String str2;
        boolean z;
        C41536l.m120489i(debitCardPayrollInfoEntity, "clientPayrollInfo");
        long orgId = debitCardPayrollInfoEntity.getOrgId();
        String orgNameGe = debitCardPayrollInfoEntity.getOrgNameGe();
        if (orgNameGe == null) {
            str = "";
        } else {
            str = orgNameGe;
        }
        String orgNameEn = debitCardPayrollInfoEntity.getOrgNameEn();
        if (orgNameEn == null) {
            str2 = "";
        } else {
            str2 = orgNameEn;
        }
        Long acctKey = debitCardPayrollInfoEntity.getAcctKey();
        if (debitCardPayrollInfoEntity.isArmyCard() == YesNoApiEntity.YES) {
            z = true;
        } else {
            z = false;
        }
        return new C17106w(orgId, str, str2, acctKey, z);
    }

    /* renamed from: v */
    public final C17107x mo43042v(DebitCardPinDeliveryTypeEntity debitCardPinDeliveryTypeEntity) {
        C41536l.m120489i(debitCardPinDeliveryTypeEntity, "debitCardPinDeliveryTypeEntity");
        return new C17107x(debitCardPinDeliveryTypeEntity.getPlcClass(), debitCardPinDeliveryTypeEntity.getPlcType(), C17081e0.valueOf(debitCardPinDeliveryTypeEntity.getDeliveryType().name()), debitCardPinDeliveryTypeEntity.getDictionaryKey());
    }

    /* renamed from: w */
    public final C17108y mo43043w(DebitCardRegTypeEntity debitCardRegTypeEntity) {
        C41536l.m120489i(debitCardRegTypeEntity, "debitCardRegTypeEntity");
        return new C17108y(C17085g0.valueOf(debitCardRegTypeEntity.getRegType().name()), debitCardRegTypeEntity.getDictionaryKey());
    }

    /* renamed from: x */
    public final C17070a0 mo43044x(DebitCardTextContainerEntity debitCardTextContainerEntity) {
        C17073b0 b0Var;
        C41536l.m120489i(debitCardTextContainerEntity, "debitCardTextContainerEntity");
        DebitCardTextsEntity plasticCard = debitCardTextContainerEntity.getPlasticCard();
        C17073b0 b0Var2 = null;
        if (plasticCard != null) {
            b0Var = mo43045y(plasticCard);
        } else {
            b0Var = null;
        }
        DebitCardTextsEntity digitalCard = debitCardTextContainerEntity.getDigitalCard();
        if (digitalCard != null) {
            b0Var2 = mo43045y(digitalCard);
        }
        return new C17070a0(b0Var, b0Var2);
    }

    /* renamed from: y */
    public final C17073b0 mo43045y(DebitCardTextsEntity debitCardTextsEntity) {
        C41536l.m120489i(debitCardTextsEntity, "debitCardTextsEntity");
        return new C17073b0(debitCardTextsEntity.getAdvantagesKey(), debitCardTextsEntity.getAdvantagesValue(), debitCardTextsEntity.getExpDateKey(), debitCardTextsEntity.getExpDateValue(), debitCardTextsEntity.getMinAmountKey(), debitCardTextsEntity.getMinAmountValue(), debitCardTextsEntity.getCardDetailsKey(), debitCardTextsEntity.getCardDetailsValue(), debitCardTextsEntity.getCardPriceKey(), debitCardTextsEntity.getCardPriceValue(), debitCardTextsEntity.getShortDescKey(), debitCardTextsEntity.getShortDescValue());
    }

    /* renamed from: z */
    public final C17083f0 mo43046z(RecoverCardEntity recoverCardEntity) {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        C17086h hVar;
        boolean z4;
        C41536l.m120489i(recoverCardEntity, "entity");
        long cardId = recoverCardEntity.getCardId();
        long acctKey = recoverCardEntity.getAcctKey();
        long clientKey = recoverCardEntity.getClientKey();
        String cardClass = recoverCardEntity.getCardClass();
        String cardClassCode = recoverCardEntity.getCardClassCode();
        String cardType = recoverCardEntity.getCardType();
        String cardName = recoverCardEntity.getCardName();
        String productCode = recoverCardEntity.getProductCode();
        String subProductCode = recoverCardEntity.getSubProductCode();
        String cardHolder = recoverCardEntity.getCardHolder();
        Long expDate = recoverCardEntity.getExpDate();
        if (expDate != null) {
            j = expDate.longValue();
        } else {
            j = 0;
        }
        String str = subProductCode;
        String str2 = cardHolder;
        Date date = new Date(j);
        String ccy = recoverCardEntity.getCcy();
        if (ccy == null) {
            ccy = "GEL";
        }
        String str3 = ccy;
        YesNoApiEntity mainCurrency = recoverCardEntity.getMainCurrency();
        YesNoApiEntity yesNoApiEntity = YesNoApiEntity.YES;
        if (mainCurrency == yesNoApiEntity) {
            z = true;
        } else {
            z = false;
        }
        String pan2 = recoverCardEntity.getPan2();
        String cardMask = recoverCardEntity.getCardMask();
        if (recoverCardEntity.getExpFlag() == yesNoApiEntity) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (recoverCardEntity.getRecoveryFlag() == yesNoApiEntity) {
            z3 = true;
        } else {
            z3 = false;
        }
        Long orgId = recoverCardEntity.getOrgId();
        String nameDictionaryKey = recoverCardEntity.getNameDictionaryKey();
        String nameDictionaryValue = recoverCardEntity.getNameDictionaryValue();
        CardExternalFileEntity externalFile = recoverCardEntity.getExternalFile();
        C17086h hVar2 = null;
        if (externalFile != null) {
            hVar = mo43033l(externalFile);
        } else {
            hVar = null;
        }
        CardExternalFileEntity cardExternalFile = recoverCardEntity.getCardExternalFile();
        if (cardExternalFile != null) {
            hVar2 = mo43033l(cardExternalFile);
        }
        String lastFour = recoverCardEntity.getLastFour();
        if (recoverCardEntity.isDigitalCard() == yesNoApiEntity) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new C17083f0(cardId, acctKey, clientKey, cardClass, cardClassCode, cardType, cardName, productCode, str, str2, date, str3, z, pan2, cardMask, z2, z3, orgId, nameDictionaryKey, nameDictionaryValue, lastFour, hVar, hVar2, z4);
    }
}
