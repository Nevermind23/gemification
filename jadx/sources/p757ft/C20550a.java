package p757ft;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.TransactionApiEntity;
import p342j$.util.DesugarTimeZone;

/* renamed from: ft.a */
public final class C20550a {

    /* renamed from: b */
    public static final C20551a f55576b = new C20551a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final SimpleDateFormat f55577c;

    /* renamed from: a */
    private final String f55578a;

    /* renamed from: ft.a$a */
    public static final class C20551a {
        private C20551a() {
        }

        public /* synthetic */ C20551a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo49079a(Long l) {
            if (l == null) {
                return (String) l;
            }
            return C20550a.f55577c.format(new Date(l.longValue()));
        }
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        f55577c = simpleDateFormat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = r2.mo89812a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20550a(j51.C36737i r2) {
        /*
            r1 = this;
            java.lang.String r0 = "getUserDetails"
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            r1.<init>()
            k51.c r2 = r2.mo89563a()
            if (r2 == 0) goto L_0x0014
            ge.bog.mobilebank.model.usrinfo.ClientCategory r2 = r2.mo89812a()
            if (r2 != 0) goto L_0x0016
        L_0x0014:
            ge.bog.mobilebank.model.usrinfo.ClientCategory r2 = p341ge.bog.mobilebank.model.usrinfo.ClientCategory.RETAIL
        L_0x0016:
            java.lang.String r2 = r2.getValue()
            r1.f55578a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p757ft.C20550a.<init>(j51.i):void");
    }

    /* renamed from: b */
    private final String m66801b(TransactionApiEntity transactionApiEntity) {
        StringBuilder sb = new StringBuilder();
        sb.append("serviceId=IDENTITY_GET_AVATAR_SERVICE_ID");
        String printFormType = transactionApiEntity.getPrintFormType();
        sb.append("&printFormType=" + printFormType);
        String essServiceId = transactionApiEntity.getEssServiceId();
        sb.append("&essServiceId=" + essServiceId);
        String merchantId = transactionApiEntity.getMerchantId();
        sb.append("&merchantId=" + merchantId);
        sb.append("&userAddress=127.0.0.1");
        Long counterPartyClient = transactionApiEntity.getCounterPartyClient();
        if (counterPartyClient != null) {
            long longValue = counterPartyClient.longValue();
            sb.append("&linkedClientKey=" + longValue);
        }
        String groupImageId = transactionApiEntity.getGroupImageId();
        sb.append("&groupImageId=" + groupImageId);
        String str = this.f55578a;
        sb.append("&clientSegment=" + str);
        Long groupImageIdSolo = transactionApiEntity.getGroupImageIdSolo();
        sb.append("&groupImageIdSolo=" + groupImageIdSolo);
        Long groupImageIdWm = transactionApiEntity.getGroupImageIdWm();
        sb.append("&groupImageIdWm=" + groupImageIdWm);
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: c */
    private final Long m66802c(String str) {
        if (str == null) {
            return (Long) str;
        }
        try {
            Date parse = f55577c.parse(str);
            if (parse != null) {
                return Long.valueOf(parse.getTime());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a3, code lost:
        if (r1 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0087 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p793iw.C25264c mo49078d(p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.TransactionsSumApiEntity r61, p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.TransactionsApiEntity r62) {
        /*
            r60 = this;
            r0 = r60
            java.lang.String r1 = "responseSum"
            r2 = r61
            kotlin.jvm.internal.C41536l.m120489i(r2, r1)
            java.lang.String r1 = "responseTransactions"
            r3 = r62
            kotlin.jvm.internal.C41536l.m120489i(r3, r1)
            ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.AggregationsDtoApiEntity r1 = r61.getAggregationsDto()
            if (r1 == 0) goto L_0x0057
            java.util.List r1 = r1.getDocDirection()
            if (r1 == 0) goto L_0x0057
            java.util.Iterator r1 = r1.iterator()
        L_0x0020:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x003e
            java.lang.Object r5 = r1.next()
            r6 = r5
            ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.DocDirection r6 = (p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.DocDirection) r6
            java.lang.String r6 = r6.getDocDirection()
            gt.a r7 = p771gt.C24778a.INCOME
            java.lang.String r7 = r7.mo63196b()
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)
            if (r6 == 0) goto L_0x0020
            goto L_0x003f
        L_0x003e:
            r5 = 0
        L_0x003f:
            ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.DocDirection r5 = (p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.DocDirection) r5
            if (r5 == 0) goto L_0x0057
            java.lang.Double r1 = r5.getAmount()
            if (r1 == 0) goto L_0x0057
            java.math.BigDecimal r5 = new java.math.BigDecimal
            double r6 = r1.doubleValue()
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r5.<init>(r1)
            goto L_0x0059
        L_0x0057:
            java.math.BigDecimal r5 = java.math.BigDecimal.ZERO
        L_0x0059:
            ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.AggregationsDtoApiEntity r1 = r61.getAggregationsDto()
            if (r1 == 0) goto L_0x00a6
            java.util.List r1 = r1.getDocDirection()
            if (r1 == 0) goto L_0x00a6
            java.util.Iterator r1 = r1.iterator()
        L_0x0069:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0087
            java.lang.Object r2 = r1.next()
            r6 = r2
            ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.DocDirection r6 = (p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.DocDirection) r6
            java.lang.String r6 = r6.getDocDirection()
            gt.a r7 = p771gt.C24778a.EXPENSE
            java.lang.String r7 = r7.mo63196b()
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)
            if (r6 == 0) goto L_0x0069
            goto L_0x0088
        L_0x0087:
            r2 = 0
        L_0x0088:
            ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.DocDirection r2 = (p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.DocDirection) r2
            if (r2 == 0) goto L_0x00a6
            java.lang.Double r1 = r2.getAmount()
            if (r1 == 0) goto L_0x00a6
            java.math.BigDecimal r2 = new java.math.BigDecimal
            double r6 = r1.doubleValue()
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r2.<init>(r1)
            java.math.BigDecimal r1 = r2.abs()
            if (r1 == 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO
        L_0x00a8:
            java.util.List r2 = r62.getData()
            if (r2 == 0) goto L_0x0251
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = 10
            int r6 = ie1.C41343r.m119925u(r2, r6)
            r3.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x00bd:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0255
            java.lang.Object r6 = r2.next()
            ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.TransactionApiEntity r6 = (p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.TransactionApiEntity) r6
            iw.b r14 = new iw.b
            java.lang.String r7 = r6.getEntryId()
            if (r7 == 0) goto L_0x00da
            long r7 = java.lang.Long.parseLong(r7)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            goto L_0x00db
        L_0x00da:
            r7 = 0
        L_0x00db:
            kotlin.jvm.internal.C41536l.m120486f(r7)
            long r8 = r7.longValue()
            java.lang.Long r7 = r6.getDocKey()
            kotlin.jvm.internal.C41536l.m120486f(r7)
            long r10 = r7.longValue()
            java.lang.String r12 = r6.getEssId()
            java.lang.String r13 = r6.getNomination()
            java.lang.String r7 = r6.getPostDate()
            if (r7 == 0) goto L_0x0100
            java.lang.Long r7 = r0.m66802c(r7)
            goto L_0x0101
        L_0x0100:
            r7 = 0
        L_0x0101:
            kotlin.jvm.internal.C41536l.m120486f(r7)
            long r15 = r7.longValue()
            java.lang.String r7 = r6.getAmount()
            if (r7 == 0) goto L_0x0114
            java.math.BigDecimal r4 = new java.math.BigDecimal
            r4.<init>(r7)
            goto L_0x0115
        L_0x0114:
            r4 = 0
        L_0x0115:
            java.lang.String r17 = r6.getCcy()
            java.lang.String r18 = r6.getStatus()
            java.lang.Double r7 = r6.getBonusPoint()
            r61 = r2
            if (r7 == 0) goto L_0x0135
            java.math.BigDecimal r2 = new java.math.BigDecimal
            double r19 = r7.doubleValue()
            java.lang.String r7 = java.lang.String.valueOf(r19)
            r2.<init>(r7)
            r19 = r2
            goto L_0x0137
        L_0x0135:
            r19 = 0
        L_0x0137:
            java.lang.String r20 = r6.getMerchantName()
            java.lang.String r21 = r6.getMerchantNameInt()
            java.lang.String r22 = r6.getEntryGroupDValue()
            java.lang.String r23 = r6.getEssServiceId()
            java.lang.String r24 = r6.getBonusType()
            java.lang.Boolean r2 = r6.isRepeatAllowed()
            if (r2 == 0) goto L_0x0158
            boolean r2 = r2.booleanValue()
            r25 = r2
            goto L_0x015a
        L_0x0158:
            r25 = 0
        L_0x015a:
            java.lang.Boolean r2 = r6.isTemplateAllowed()
            if (r2 == 0) goto L_0x0167
            boolean r2 = r2.booleanValue()
            r26 = r2
            goto L_0x0169
        L_0x0167:
            r26 = 0
        L_0x0169:
            java.lang.Boolean r2 = r6.getCanSplit()
            if (r2 == 0) goto L_0x0176
            boolean r2 = r2.booleanValue()
            r27 = r2
            goto L_0x0178
        L_0x0176:
            r27 = 0
        L_0x0178:
            java.lang.Boolean r2 = r6.isDDSTOAlllowed()
            if (r2 == 0) goto L_0x0185
            boolean r2 = r2.booleanValue()
            r28 = r2
            goto L_0x0187
        L_0x0185:
            r28 = 0
        L_0x0187:
            java.lang.String r29 = r6.getOperationTitle()
            java.lang.String r30 = r0.m66801b(r6)
            java.lang.Double r2 = r6.getBonusPoint()
            if (r2 == 0) goto L_0x01a5
            java.math.BigDecimal r7 = new java.math.BigDecimal
            double r31 = r2.doubleValue()
            java.lang.String r2 = java.lang.String.valueOf(r31)
            r7.<init>(r2)
            r31 = r7
            goto L_0x01a7
        L_0x01a5:
            r31 = 0
        L_0x01a7:
            java.lang.String r32 = r6.getBonusInfo()
            java.lang.String r33 = r6.getPrintFormType()
            java.lang.String r34 = r6.getPrintForm()
            java.lang.String r2 = r6.getOperationDate()
            java.lang.Long r2 = r0.m66802c(r2)
            kotlin.jvm.internal.C41536l.m120486f(r2)
            long r35 = r2.longValue()
            hd0.b r2 = r6.getHasTransferBack()
            if (r2 == 0) goto L_0x01cf
            boolean r2 = r2.mo63390c()
            r37 = r2
            goto L_0x01d1
        L_0x01cf:
            r37 = 0
        L_0x01d1:
            r38 = 0
            iw.a$a r2 = p793iw.C25261a.f64855d
            java.lang.String r7 = r6.getDeviceType()
            iw.a r39 = r2.mo63796a(r7)
            java.lang.Long r40 = r6.getPfmId()
            java.lang.String r41 = r6.getPfmForecast()
            java.lang.Long r42 = r6.getPfmCatId()
            java.lang.String r43 = r6.getPfmCatName()
            java.lang.Long r44 = r6.getPfmParentCatId()
            java.lang.String r45 = r6.getPfmParentCatName()
            java.lang.String r46 = r6.getPfmRecurring()
            java.lang.String r47 = r6.getPfmSplit()
            java.lang.Long r48 = r6.getPfmParentOpId()
            java.lang.Long r49 = r6.getPfmTagId()
            java.lang.String r50 = r6.getPfmTagName()
            java.lang.Integer r2 = r6.getPfmComputable()
            if (r2 == 0) goto L_0x0214
            int r2 = r2.intValue()
            goto L_0x0215
        L_0x0214:
            r2 = 0
        L_0x0215:
            if (r2 <= 0) goto L_0x021b
            r2 = 1
            r51 = r2
            goto L_0x021d
        L_0x021b:
            r51 = 0
        L_0x021d:
            r52 = 0
            r53 = 0
            java.lang.String r2 = r6.getAmountBase()
            if (r2 == 0) goto L_0x0232
            double r54 = java.lang.Double.parseDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r54)
            r54 = r2
            goto L_0x0234
        L_0x0232:
            r54 = 0
        L_0x0234:
            java.util.ArrayList r55 = r6.getSort()
            java.lang.Long r56 = r6.getCounterPartyClient()
            r57 = 0
            r58 = 256(0x100, float:3.59E-43)
            r59 = 0
            r7 = r14
            r2 = r14
            r14 = r15
            r16 = r4
            r7.<init>(r8, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            r3.add(r2)
            r2 = r61
            goto L_0x00bd
        L_0x0251:
            java.util.List r3 = ie1.C41341q.m119907j()
        L_0x0255:
            iw.c r2 = new iw.c
            r2.<init>(r1, r5, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p757ft.C20550a.mo49078d(ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.TransactionsSumApiEntity, ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.TransactionsApiEntity):iw.c");
    }
}
