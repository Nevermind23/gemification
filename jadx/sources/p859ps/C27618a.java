package p859ps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.BillSplitExistingOperationCreateApiModel;
import p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.BillSplitNewOperationCreateApiModel;
import p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.BillSplitOperationApiModel;
import p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.BillSplitOperationTypeApiModel;
import p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestApiModel;
import p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantCreateApiModel;
import p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestTypeApiModel;
import p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.RequestDirectionApiModel;
import p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.RequestStateApiModel;
import p341ge.bog.mobilebank.model.Client;
import p746es.C20289a;
import p812kv.C25779b;
import p812kv.C25780c;
import p812kv.C25781d;
import p812kv.C25782e;
import p832mv.C26301a;
import p832mv.C26305b;

/* renamed from: ps.a */
public final class C27618a {

    /* renamed from: a */
    private final C20289a f70558a;

    /* renamed from: b */
    private final Client f70559b;

    /* renamed from: ps.a$a */
    public /* synthetic */ class C27619a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f70560a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f70561b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        static {
            /*
                ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.RequestStateApiModel[] r0 = p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.RequestStateApiModel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.RequestStateApiModel r2 = p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.RequestStateApiModel.DONE_FAILED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.RequestStateApiModel r3 = p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.RequestStateApiModel.DONE_PARTLY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.RequestStateApiModel r3 = p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.RequestStateApiModel.DONE_SUCCESSFULLY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f70560a = r0
                ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestTypeApiModel[] r0 = p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestTypeApiModel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestTypeApiModel r3 = p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestTypeApiModel.BILL_SPLIT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestTypeApiModel r1 = p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestTypeApiModel.MONEY_REQUEST     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f70561b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p859ps.C27618a.C27619a.<clinit>():void");
        }
    }

    public C27618a(C20289a aVar, Client client) {
        C41536l.m120489i(aVar, "contactApiMapper");
        C41536l.m120489i(client, "client");
        this.f70558a = aVar;
        this.f70559b = client;
    }

    /* renamed from: d */
    public static /* synthetic */ List m85467d(C27618a aVar, List list, boolean z, boolean z2, Double d, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            d = null;
        }
        return aVar.mo66989c(list, z, z2, d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r15v1, types: [mv.b$a] */
    /* JADX WARNING: type inference failed for: r6v4, types: [mv.b$b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m85468g(java.util.List r24) {
        /*
            r23 = this;
            r0 = r23
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r24.iterator()
        L_0x000b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0040
            java.lang.Object r3 = r2.next()
            r4 = r3
            ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantApiModel r4 = (p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantApiModel) r4
            ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantTypeApiModel r5 = r4.getType()
            ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantTypeApiModel r6 = p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantTypeApiModel.CONTACT
            if (r5 == r6) goto L_0x0028
            ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantTypeApiModel r5 = r4.getType()
            ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantTypeApiModel r6 = p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantTypeApiModel.CLIENT_KEY
            if (r5 != r6) goto L_0x002e
        L_0x0028:
            ge.bog.mobilebank.cleanarch.data.contact.entity.ContactApiModel r5 = r4.getContact()
            if (r5 != 0) goto L_0x0039
        L_0x002e:
            ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantTypeApiModel r4 = r4.getType()
            ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantTypeApiModel r5 = p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantTypeApiModel.PHONE
            if (r4 != r5) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r4 = 0
            goto L_0x003a
        L_0x0039:
            r4 = 1
        L_0x003a:
            if (r4 == 0) goto L_0x000b
            r1.add(r3)
            goto L_0x000b
        L_0x0040:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = ie1.C41343r.m119925u(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x004f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00c7
            java.lang.Object r3 = r1.next()
            ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantApiModel r3 = (p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantApiModel) r3
            ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantTypeApiModel r4 = r3.getType()
            ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantTypeApiModel r5 = p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantTypeApiModel.CONTACT
            if (r4 == r5) goto L_0x0098
            ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantTypeApiModel r4 = r3.getType()
            ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantTypeApiModel r5 = p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantTypeApiModel.CLIENT_KEY
            if (r4 != r5) goto L_0x006c
            goto L_0x0098
        L_0x006c:
            mv.b$b r4 = new mv.b$b
            java.lang.String r7 = r3.getKey()
            java.lang.String r5 = r3.getName()
            if (r5 != 0) goto L_0x007a
            java.lang.String r5 = ""
        L_0x007a:
            r8 = r5
            double r9 = r3.getRequestedAmount()
            double r11 = r3.getTransferredAmount()
            long r5 = r3.getParticipantId()
            java.lang.String r13 = java.lang.String.valueOf(r5)
            java.lang.String r3 = r3.getParticipantStatus()
            mv.b$c r14 = r0.m85469h(r3)
            r6 = r4
            r6.<init>(r7, r8, r9, r11, r13, r14)
            goto L_0x00c3
        L_0x0098:
            mv.b$a r4 = new mv.b$a
            es.a r5 = r0.f70558a
            ge.bog.mobilebank.cleanarch.data.contact.entity.ContactApiModel r6 = r3.getContact()
            kotlin.jvm.internal.C41536l.m120486f(r6)
            su.a r16 = r5.mo48768b(r6)
            double r17 = r3.getRequestedAmount()
            double r19 = r3.getTransferredAmount()
            long r5 = r3.getParticipantId()
            java.lang.String r21 = java.lang.String.valueOf(r5)
            java.lang.String r3 = r3.getParticipantStatus()
            mv.b$c r22 = r0.m85469h(r3)
            r15 = r4
            r15.<init>(r16, r17, r19, r21, r22)
        L_0x00c3:
            r2.add(r4)
            goto L_0x004f
        L_0x00c7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p859ps.C27618a.m85468g(java.util.List):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r3.equals("P") == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r3.equals("D") != false) goto L_0x002e;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p832mv.C26305b.C26308c m85469h(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = 68
            if (r0 == r1) goto L_0x0026
            r1 = 80
            if (r0 == r1) goto L_0x001d
            r1 = 82
            if (r0 == r1) goto L_0x0011
            goto L_0x0031
        L_0x0011:
            java.lang.String r0 = "R"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x001a
            goto L_0x0031
        L_0x001a:
            mv.b$c r3 = p832mv.C26305b.C26308c.f66669f
            goto L_0x0033
        L_0x001d:
            java.lang.String r0 = "P"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x002e
            goto L_0x0031
        L_0x0026:
            java.lang.String r0 = "D"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0031
        L_0x002e:
            mv.b$c r3 = p832mv.C26305b.C26308c.COMPLETED
            goto L_0x0033
        L_0x0031:
            mv.b$c r3 = p832mv.C26305b.C26308c.ACTIVE
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p859ps.C27618a.m85469h(java.lang.String):mv.b$c");
    }

    /* renamed from: i */
    private final C25781d m85470i(MoneyRequestTypeApiModel moneyRequestTypeApiModel) {
        int i = C27619a.f70561b[moneyRequestTypeApiModel.ordinal()];
        if (i == 1) {
            return C25781d.BILL_SPLIT;
        }
        if (i == 2) {
            return C25781d.MONEY_REQUEST;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: j */
    private final C25782e m85471j(RequestStateApiModel requestStateApiModel) {
        int i;
        if (requestStateApiModel == null) {
            i = -1;
        } else {
            i = C27619a.f70560a[requestStateApiModel.ordinal()];
        }
        if (i == 1) {
            return C25782e.DONE_FAILED;
        }
        if (i == 2) {
            return C25782e.DONE_PARTLY;
        }
        if (i != 3) {
            return null;
        }
        return C25782e.DONE_SUCCESSFULLY;
    }

    /* renamed from: k */
    private final List m85472k(List list) {
        ArrayList arrayList;
        boolean z;
        boolean z2;
        if (list != null) {
            arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            long j = Long.MAX_VALUE;
            while (it.hasNext()) {
                BillSplitOperationApiModel billSplitOperationApiModel = (BillSplitOperationApiModel) it.next();
                long j2 = j - 1;
                if (billSplitOperationApiModel.getOperationType() != BillSplitOperationTypeApiModel.DOC_KEY) {
                    z = true;
                } else {
                    z = false;
                }
                double amount = billSplitOperationApiModel.getAmount();
                String description = billSplitOperationApiModel.getDescription();
                String imageUrl = billSplitOperationApiModel.getImageUrl();
                Boolean canTint = billSplitOperationApiModel.getCanTint();
                if (canTint != null) {
                    z2 = canTint.booleanValue();
                } else {
                    z2 = false;
                }
                arrayList.add(new C25780c(j, z, amount, description, imageUrl, z2));
                j = j2;
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return C41341q.m119907j();
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List mo66987a(List list) {
        C41536l.m120489i(list, "operations");
        ArrayList<C26301a.C26302a> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (next instanceof C26301a.C26302a) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C26301a.C26302a aVar : arrayList) {
            arrayList2.add(new BillSplitNewOperationCreateApiModel(aVar.mo65458d(), aVar.mo65459e()));
        }
        return arrayList2;
    }

    /* renamed from: b */
    public final List mo66988b(List list) {
        C41536l.m120489i(list, "operations");
        ArrayList<C26301a.C26304b> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (next instanceof C26301a.C26304b) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C26301a.C26304b bVar : arrayList) {
            arrayList2.add(new BillSplitExistingOperationCreateApiModel(bVar.mo65465b().mo63829m(), bVar.mo65465b().mo63831o()));
        }
        return arrayList2;
    }

    /* renamed from: c */
    public final List mo66989c(List list, boolean z, boolean z2, Double d) {
        MoneyRequestParticipantCreateApiModel moneyRequestParticipantCreateApiModel;
        List list2 = list;
        C41536l.m120489i(list2, "receivers");
        ArrayList arrayList = new ArrayList();
        if (z2) {
            String clientKey = this.f70559b.getUserInfo().getClient().getClientKey();
            C41536l.m120488h(clientKey, "client.userInfo.client.clientKey");
            arrayList.add(new MoneyRequestParticipantCreateApiModel("CLIENT_KEY", clientKey, this.f70559b.getUserInfo().getClient().getName(), d, (String) null, 16, (DefaultConstructorMarker) null));
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C26305b bVar = (C26305b) it.next();
            Double d2 = null;
            if (bVar instanceof C26305b.C26306a) {
                C26305b.C26306a aVar = (C26305b.C26306a) bVar;
                String valueOf = String.valueOf(aVar.mo65477h().mo67857m());
                if (z) {
                    d2 = Double.valueOf(bVar.mo65472c());
                }
                moneyRequestParticipantCreateApiModel = new MoneyRequestParticipantCreateApiModel("CONTACT", valueOf, (String) null, d2, aVar.mo65477h().mo67859o());
            } else {
                C41536l.m120487g(bVar, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.domain.moneyrequest.model.MoneyRequestReceiver.PhoneNumber");
                C26305b.C26307b bVar2 = (C26305b.C26307b) bVar;
                String i = bVar2.mo65484i();
                String h = bVar2.mo65482h();
                if (z) {
                    d2 = Double.valueOf(bVar.mo65472c());
                }
                moneyRequestParticipantCreateApiModel = new MoneyRequestParticipantCreateApiModel("PHONE", i, h, d2, (String) null, 16, (DefaultConstructorMarker) null);
            }
            arrayList2.add(moneyRequestParticipantCreateApiModel);
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: e */
    public final C25779b mo66990e(MoneyRequestApiModel moneyRequestApiModel) {
        boolean z;
        C41536l.m120489i(moneyRequestApiModel, "moneyRequestApiEntity");
        long requestId = moneyRequestApiModel.getRequestId();
        if (moneyRequestApiModel.getRequestDirection() == RequestDirectionApiModel.LENDER) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        C25781d i = m85470i(moneyRequestApiModel.getRequestType());
        String clientKey = moneyRequestApiModel.getClientKey();
        String acctNo = moneyRequestApiModel.getAcctNo();
        String acctKey = moneyRequestApiModel.getAcctKey();
        double amount = moneyRequestApiModel.getAmount();
        double transferredAmount = moneyRequestApiModel.getTransferredAmount();
        String ccy = moneyRequestApiModel.getCcy();
        String description = moneyRequestApiModel.getDescription();
        Boolean canSplit = moneyRequestApiModel.getCanSplit();
        Boolean bool = Boolean.TRUE;
        return new C25779b(requestId, z2, i, clientKey, acctNo, acctKey, amount, transferredAmount, ccy, description, C41536l.m120484d(canSplit, bool), C41536l.m120484d(moneyRequestApiModel.getIncludeSelf(), bool), m85471j(moneyRequestApiModel.getRequestState()), moneyRequestApiModel.getRequestStateDescriptionKey(), moneyRequestApiModel.getHasWarning(), m85468g(moneyRequestApiModel.getParticipants()), m85472k(moneyRequestApiModel.getOperations()));
    }

    /* renamed from: f */
    public final List mo66991f(List list) {
        C41536l.m120489i(list, "list");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo66990e((MoneyRequestApiModel) it.next()));
        }
        return arrayList;
    }
}
