package qz0;

import android.app.Application;
import com.github.mikephil.charting.utils.Utils;
import d01.C31513a;
import g91.C32343x;
import hy0.C36274h;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kt0.C36990a;
import m70.C26148a;
import m70.C26150c;
import m70.C26156i;
import n41.C37353c;
import ny0.C37500b;
import o70.C26766e;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.productcards.AccountCardView;
import p341ge.bog.designsystem.components.productcards.GaltCardView;
import p341ge.bog.designsystem.components.productcards.PiggyBankCardView;
import p341ge.bog.designsystem.components.productcards.basecard.C13473a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasInfoSummaryUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasServiceInfoUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasServiceProductUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.DepositAccountUiModel;
import p341ge.bog.mobilebank.model.usrinfo.UserRestrictions;
import p341ge.bog.mobilebank.products.domain.model.BillInfo;
import p341ge.bog.mobilebank.products.domain.model.CreditCardAccount;
import p341ge.bog.mobilebank.products.presentation.details.list.C34242f;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p341ge.bog.mobilebank.shared2.environment.EnvironmentType;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import sz0.C38616d;
import xh0.C29789f;
import xy0.C39940d;
import xy0.C39941e;
import xy0.C39943g;
import xy0.C39948l;
import zs0.C40252e;

/* renamed from: qz0.a */
public final class C38269a {

    /* renamed from: d */
    public static final C38270a f91760d = new C38270a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Application f91761a;

    /* renamed from: b */
    private final C36990a f91762b;

    /* renamed from: c */
    private final TargetEnvironment f91763c;

    /* renamed from: qz0.a$a */
    public static final class C38270a {
        private C38270a() {
        }

        public /* synthetic */ C38270a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: qz0.a$b */
    public /* synthetic */ class C38271b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f91764a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f91765b;

        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|65) */
        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|65) */
        /* JADX WARNING: Can't wrap try/catch for region: R(51:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|65) */
        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|65) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x009d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00a5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00b5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00bd */
        static {
            /*
                ny0.h[] r0 = ny0.C37506h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ny0.h r2 = ny0.C37506h.CALL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ny0.h r3 = ny0.C37506h.CHILD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                ny0.h r4 = ny0.C37506h.ENLARG     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                ny0.h r5 = ny0.C37506h.ENLARGSOLO     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                ny0.h r6 = ny0.C37506h.SAVING     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                r6 = 6
                ny0.h r7 = ny0.C37506h.TERM     // Catch:{ NoSuchFieldError -> 0x003d }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r0[r7] = r6     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                r7 = 7
                ny0.h r8 = ny0.C37506h.INVEST     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r0[r8] = r7     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                r8 = 8
                ny0.h r9 = ny0.C37506h.IPO     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r0[r9] = r8     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                r9 = 9
                ny0.h r10 = ny0.C37506h.PREMIUM     // Catch:{ NoSuchFieldError -> 0x005a }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r0[r10] = r9     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                r10 = 10
                ny0.h r11 = ny0.C37506h.EXPRESS     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r0[r11] = r10     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                f91764a = r0
                xy0.v[] r0 = xy0.C39958v.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xy0.v r11 = xy0.C39958v.AUTO     // Catch:{ NoSuchFieldError -> 0x0075 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0075 }
                r0[r11] = r1     // Catch:{ NoSuchFieldError -> 0x0075 }
            L_0x0075:
                xy0.v r1 = xy0.C39958v.CONSUMER     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                xy0.v r1 = xy0.C39958v.COMMERCIAL_LOAN     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                xy0.v r1 = xy0.C39958v.ENERGO_CREDIT     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                xy0.v r1 = xy0.C39958v.EXPRESS     // Catch:{ NoSuchFieldError -> 0x0095 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0095 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0095 }
            L_0x0095:
                xy0.v r1 = xy0.C39958v.INSTALLMENT     // Catch:{ NoSuchFieldError -> 0x009d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                xy0.v r1 = xy0.C39958v.MORTGAGE_LOAN     // Catch:{ NoSuchFieldError -> 0x00a5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00a5 }
            L_0x00a5:
                xy0.v r1 = xy0.C39958v.f94921l     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                xy0.v r1 = xy0.C39958v.STUDENT_LOAN     // Catch:{ NoSuchFieldError -> 0x00b5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b5 }
                r0[r1] = r9     // Catch:{ NoSuchFieldError -> 0x00b5 }
            L_0x00b5:
                xy0.v r1 = xy0.C39958v.TRAVEL_LOAN     // Catch:{ NoSuchFieldError -> 0x00bd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bd }
                r0[r1] = r10     // Catch:{ NoSuchFieldError -> 0x00bd }
            L_0x00bd:
                xy0.v r1 = xy0.C39958v.INSURANCE     // Catch:{ NoSuchFieldError -> 0x00c7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c7 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c7 }
            L_0x00c7:
                f91765b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qz0.C38269a.C38271b.<clinit>():void");
        }
    }

    public C38269a(Application application, C36990a aVar, TargetEnvironment targetEnvironment) {
        C41536l.m120489i(application, "application");
        C41536l.m120489i(aVar, "casInfoUiMapper");
        C41536l.m120489i(targetEnvironment, "environment");
        this.f91761a = application;
        this.f91762b = aVar;
        this.f91763c = targetEnvironment;
    }

    /* renamed from: a */
    private final long m112506a() {
        Calendar instance = Calendar.getInstance();
        if (this.f91763c.getType() == EnvironmentType.TEST) {
            instance.setTime(new Date(1631192745000L));
        }
        instance.add(5, 10);
        return instance.getTimeInMillis();
    }

    /* renamed from: b */
    private final boolean m112507b(C37500b bVar, long j) {
        Long q = bVar.mo90683q();
        return q != null && j > q.longValue();
    }

    /* renamed from: c */
    public final List mo91806c(List list) {
        List list2 = list;
        C41536l.m120489i(list2, "giftCardData");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        C41536l.m120488h(valueOf, "valueOf(this.toLong())");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BigDecimal a = ((C29789f) it.next()).mo69966a();
            if (a == null) {
                a = BigDecimal.ZERO;
            }
            C41536l.m120488h(a, "it.availableAmount ?: BigDecimal.ZERO");
            valueOf = valueOf.add(a);
            C41536l.m120488h(valueOf, "this.add(other)");
        }
        List e = C41339p.m119900e(new C34242f.C34246d(C32343x.m95408P(valueOf, "GEL"), new StringSource.Dictionary("giftcard.owner.list.total.amount", (Boolean) null, (List) null, 6, (DefaultConstructorMarker) null)));
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C29789f fVar = (C29789f) it2.next();
            long e2 = fVar.mo69970e();
            String l = fVar.mo69979l();
            if (l == null) {
                l = "";
            }
            String str = l;
            BigDecimal a2 = fVar.mo69966a();
            if (a2 == null) {
                a2 = BigDecimal.ZERO;
            }
            C41536l.m120488h(a2, "giftCard.availableAmount ?: BigDecimal.ZERO");
            AccountCardView.C13445a aVar = r9;
            AccountCardView.C13445a aVar2 = new AccountCardView.C13445a(str, new Amount(a2, "GEL"), (Image) null, (Image) null, false, C13473a.C13476b.CLEAR, (List) null, (List) null, (List) null, false, false, 2012, (DefaultConstructorMarker) null);
            arrayList.add(new C34242f.C34245c(e2, new C38616d(aVar)));
        }
        return C41358y.m120023m0(e, arrayList);
    }

    /* renamed from: d */
    public final List mo91807d(C26156i iVar, C26766e eVar) {
        Object obj;
        boolean z;
        C41536l.m120489i(iVar, "accountsAndDetailsModel");
        C41536l.m120489i(eVar, "cardsAndDetailsModel");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C34242f.C34246d(C32343x.m95410Q(iVar.mo65188a().mo65184c().mo63386b(), iVar.mo65188a().mo65184c().mo63385a(), false, 2, (Object) null), (StringSource) null, 2, (DefaultConstructorMarker) null));
        List a = iVar.mo65188a().mo65182a();
        ArrayList<C26148a> arrayList2 = new ArrayList<>();
        for (Object next : a) {
            if (true ^ ((C26148a) next).mo65085G()) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(arrayList2, 10));
        for (C26148a aVar : arrayList2) {
            long b = aVar.mo65087b();
            List list = (List) eVar.mo66048a().get(Long.valueOf(aVar.mo65087b()));
            if (list == null) {
                list = C41341q.m119907j();
            }
            Iterator it = iVar.mo65189b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C26150c) obj).mo65121b() == aVar.mo65087b()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            arrayList3.add(new C34242f.C34245c(b, C31513a.m93589c(aVar, list, (C26150c) obj)));
        }
        arrayList.addAll(arrayList3);
        if (!C36546y.m108285N().mo89313K().getUserRestrictions().contains(UserRestrictions.CARDS_APPLICATIONS_REGISTER)) {
            String string = this.f91761a.getString(C36274h.f87562N);
            C41536l.m120488h(string, "application.getString(R.string.order_new_card)");
            arrayList.add(new C34242f.C34243a(string));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v1, resolved type: ge.bog.designsystem.components.productcards.DepositCardView$b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: ge.bog.designsystem.components.productcards.DepositCardView$b$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: ge.bog.designsystem.components.common.Image$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: ge.bog.designsystem.components.productcards.DepositCardView$b$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: ge.bog.designsystem.components.productcards.DepositCardView$b$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: ge.bog.designsystem.components.productcards.DepositCardView$b$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v2, resolved type: ge.bog.designsystem.components.productcards.DepositCardView$b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: ge.bog.designsystem.components.productcards.DepositCardView$b$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v3, resolved type: ge.bog.designsystem.components.productcards.DepositCardView$b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v4, resolved type: ge.bog.designsystem.components.productcards.DepositCardView$b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: ge.bog.designsystem.components.common.Image$Url} */
    /* JADX WARNING: type inference failed for: r39v1, types: [ge.bog.designsystem.components.common.Image] */
    /* JADX WARNING: type inference failed for: r39v2 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r39v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0238  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo91808e(ny0.C37508i r44) {
        /*
            r43 = this;
            r0 = r43
            java.lang.String r1 = "deposits"
            r2 = r44
            kotlin.jvm.internal.C41536l.m120489i(r2, r1)
            long r3 = r43.m112506a()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ge.bog.mobilebank.products.presentation.details.list.f$d r5 = new ge.bog.mobilebank.products.presentation.details.list.f$d
            ny0.e r6 = r44.mo90726f()
            double r7 = r6.mo90698a()
            ny0.e r6 = r44.mo90726f()
            java.lang.String r9 = r6.mo90699b()
            r10 = 0
            r11 = 2
            r12 = 0
            java.lang.String r6 = g91.C32343x.m95410Q(r7, r9, r10, r11, r12)
            r7 = 0
            r8 = 2
            r5.<init>(r6, r7, r8, r7)
            r1.add(r5)
            java.util.List r5 = r44.mo90723d()
            java.util.ArrayList r6 = new java.util.ArrayList
            r9 = 10
            int r10 = ie1.C41343r.m119925u(r5, r9)
            r6.<init>(r10)
            java.util.Iterator r5 = r5.iterator()
        L_0x0046:
            boolean r10 = r5.hasNext()
            java.lang.String r11 = "generateImageUrl(url)"
            java.lang.String r12 = "application.getString(R.string.accrued_interest)"
            r13 = 0
            r15 = 0
            if (r10 == 0) goto L_0x0263
            java.lang.Object r10 = r5.next()
            ny0.b r10 = (ny0.C37500b) r10
            java.lang.Number r16 = r10.mo90678l()
            if (r16 == 0) goto L_0x0066
            double r16 = r16.doubleValue()
            r7 = r16
            goto L_0x0067
        L_0x0066:
            r7 = r13
        L_0x0067:
            java.util.List r18 = r10.mo90661B()
            boolean r18 = r18.isEmpty()
            r9 = 1
            r18 = r18 ^ 1
            if (r18 == 0) goto L_0x00c4
            ge.bog.designsystem.components.productcards.DepositCardView$b$b r7 = new ge.bog.designsystem.components.productcards.DepositCardView$b$b
            ge.bog.designsystem.components.textprogressbar.TextProgressBarView$ProgressModel$Progress r8 = new ge.bog.designsystem.components.textprogressbar.TextProgressBarView$ProgressModel$Progress
            double r12 = r10.mo90672g()
            float r12 = (float) r12
            java.util.List r13 = r10.mo90661B()
            java.lang.Object r13 = r13.get(r15)
            ny0.g r13 = (ny0.C37505g) r13
            double r13 = r13.mo90708a()
            float r13 = (float) r13
            java.lang.String r14 = r10.mo90671f()
            java.lang.String r14 = g91.C32303f.m95197h(r14)
            java.lang.String r15 = "getCcyLogo(deposit.ccy)"
            kotlin.jvm.internal.C41536l.m120488h(r14, r15)
            android.app.Application r15 = r0.f91761a
            int r9 = hy0.C36274h.saved
            java.lang.String r24 = r15.getString(r9)
            android.app.Application r9 = r0.f91761a
            int r15 = hy0.C36274h.goal
            java.lang.String r25 = r9.getString(r15)
            r26 = 1
            r27 = 0
            r28 = 0
            r29 = 192(0xc0, float:2.69E-43)
            r30 = 0
            r20 = r8
            r21 = r12
            r22 = r13
            r23 = r14
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r7.<init>(r8)
            r38 = r7
            goto L_0x00f2
        L_0x00c4:
            int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x00f0
            ge.bog.designsystem.components.productcards.DepositCardView$b$a r9 = new ge.bog.designsystem.components.productcards.DepositCardView$b$a
            android.app.Application r13 = r0.f91761a
            int r14 = hy0.C36274h.accrued_interest
            java.lang.String r13 = r13.getString(r14)
            kotlin.jvm.internal.C41536l.m120488h(r13, r12)
            ge.bog.designsystem.components.Amount r12 = new ge.bog.designsystem.components.Amount
            java.lang.String r14 = r10.mo90671f()
            r12.<init>((double) r7, (java.lang.String) r14)
            r23 = 0
            r24 = 4
            r25 = 0
            r20 = r9
            r21 = r13
            r22 = r12
            r20.<init>(r21, r22, r23, r24, r25)
            r38 = r9
            goto L_0x00f2
        L_0x00f0:
            r38 = 0
        L_0x00f2:
            ny0.h r7 = r10.mo90691x()
            if (r7 != 0) goto L_0x00fa
            r7 = -1
            goto L_0x0102
        L_0x00fa:
            int[] r8 = qz0.C38269a.C38271b.f91764a
            int r7 = r7.ordinal()
            r7 = r8[r7]
        L_0x0102:
            switch(r7) {
                case -1: goto L_0x0143;
                case 0: goto L_0x0105;
                case 1: goto L_0x013c;
                case 2: goto L_0x0135;
                case 3: goto L_0x012e;
                case 4: goto L_0x012e;
                case 5: goto L_0x0127;
                case 6: goto L_0x0120;
                case 7: goto L_0x0120;
                case 8: goto L_0x0119;
                case 9: goto L_0x0112;
                case 10: goto L_0x010b;
                default: goto L_0x0105;
            }
        L_0x0105:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x010b:
            int r7 = hy0.C36270d.icons_48_deposit_express
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0144
        L_0x0112:
            int r7 = hy0.C36270d.f87478r
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0144
        L_0x0119:
            int r7 = hy0.C36270d.icons_48_loan_house
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0144
        L_0x0120:
            int r7 = hy0.C36270d.icons_48_deposit_term_outline
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0144
        L_0x0127:
            int r7 = hy0.C36270d.f87476o
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0144
        L_0x012e:
            int r7 = hy0.C36270d.f87477q
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0144
        L_0x0135:
            int r7 = hy0.C36270d.icons_48_deposit_childeposit_outline
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0144
        L_0x013c:
            int r7 = hy0.C36270d.f87475m
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0144
        L_0x0143:
            r7 = 0
        L_0x0144:
            j31.a r8 = r10.mo90638b()
            if (r8 == 0) goto L_0x014f
            java.lang.String r8 = r8.mo89541d()
            goto L_0x0150
        L_0x014f:
            r8 = 0
        L_0x0150:
            if (r8 == 0) goto L_0x0154
            r8 = 1
            goto L_0x0155
        L_0x0154:
            r8 = 0
        L_0x0155:
            j31.a r9 = r10.mo90638b()
            if (r9 == 0) goto L_0x015e
            r9.mo89542e()
        L_0x015e:
            long r12 = r10.mo90668d()
            java.lang.String r9 = r10.mo90685s()
            if (r9 == 0) goto L_0x0176
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0170
            r9 = 1
            goto L_0x0171
        L_0x0170:
            r9 = 0
        L_0x0171:
            r14 = 1
            if (r9 != r14) goto L_0x0176
            r9 = 1
            goto L_0x0177
        L_0x0176:
            r9 = 0
        L_0x0177:
            if (r9 == 0) goto L_0x0183
            java.lang.String r9 = r10.mo90685s()
            kotlin.jvm.internal.C41536l.m120486f(r9)
        L_0x0180:
            r33 = r9
            goto L_0x01b2
        L_0x0183:
            java.lang.String r9 = r10.mo90660A()
            if (r9 == 0) goto L_0x0197
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0191
            r9 = 1
            goto L_0x0192
        L_0x0191:
            r9 = 0
        L_0x0192:
            r14 = 1
            if (r9 != r14) goto L_0x0197
            r9 = r14
            goto L_0x0198
        L_0x0197:
            r9 = 0
        L_0x0198:
            if (r9 == 0) goto L_0x01a6
            java.lang.String r9 = r10.mo90660A()
            r14 = 0
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.String r9 = g91.C32343x.m95388F(r9, r14)
            goto L_0x0180
        L_0x01a6:
            r14 = 0
            java.lang.String r9 = r10.mo90675i()
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.String r9 = g91.C32343x.m95388F(r9, r14)
            goto L_0x0180
        L_0x01b2:
            ge.bog.designsystem.components.Amount r9 = new ge.bog.designsystem.components.Amount
            double r14 = r10.mo90672g()
            java.lang.String r2 = r10.mo90671f()
            r9.<init>((double) r14, (java.lang.String) r2)
            j31.a r2 = r10.mo90638b()
            if (r2 == 0) goto L_0x01ce
            boolean r2 = r2.mo89542e()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x01cf
        L_0x01ce:
            r2 = 0
        L_0x01cf:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r2, r14)
            if (r14 == 0) goto L_0x01dc
            ge.bog.designsystem.components.productcards.basecard.a$b r2 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.BLACK
        L_0x01d9:
            r37 = r2
            goto L_0x01ec
        L_0x01dc:
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r2, r14)
            if (r14 == 0) goto L_0x01e7
            ge.bog.designsystem.components.productcards.basecard.a$b r2 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.WHITE
            goto L_0x01d9
        L_0x01e7:
            if (r2 != 0) goto L_0x025d
            ge.bog.designsystem.components.productcards.basecard.a$b r2 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.CLEAR
            goto L_0x01d9
        L_0x01ec:
            if (r8 == 0) goto L_0x01f3
            r8 = 0
            r14 = 2
            r35 = 0
            goto L_0x0207
        L_0x01f3:
            if (r7 == 0) goto L_0x0203
            int r2 = r7.intValue()
            ge.bog.designsystem.components.common.Image$Resource r7 = new ge.bog.designsystem.components.common.Image$Resource
            r8 = 0
            r14 = 2
            r7.<init>(r2, r8, r14, r8)
            r35 = r7
            goto L_0x0207
        L_0x0203:
            r8 = 0
            r14 = 2
            r35 = r8
        L_0x0207:
            j31.a r2 = r10.mo90638b()
            if (r2 == 0) goto L_0x0238
            java.lang.String r2 = r2.mo89541d()
            if (r2 == 0) goto L_0x0234
            ge.bog.designsystem.components.common.Image$Url r7 = new ge.bog.designsystem.components.common.Image$Url
            java.lang.String r2 = g91.C32289b0.m95091c(r2)
            kotlin.jvm.internal.C41536l.m120488h(r2, r11)
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 126(0x7e, float:1.77E-43)
            r29 = 0
            r20 = r7
            r21 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0235
        L_0x0234:
            r7 = r8
        L_0x0235:
            r39 = r7
            goto L_0x023a
        L_0x0238:
            r39 = r8
        L_0x023a:
            boolean r36 = r0.m112507b(r10, r3)
            ge.bog.designsystem.components.productcards.DepositCardView$a r2 = new ge.bog.designsystem.components.productcards.DepositCardView$a
            r40 = 0
            r41 = 128(0x80, float:1.794E-43)
            r42 = 0
            r32 = r2
            r34 = r9
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            ge.bog.mobilebank.products.presentation.details.list.f$c r7 = new ge.bog.mobilebank.products.presentation.details.list.f$c
            r7.<init>(r12, r2)
            r6.add(r7)
            r2 = r44
            r7 = r8
            r8 = r14
            r9 = 10
            goto L_0x0046
        L_0x025d:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x0263:
            r8 = r7
            r1.addAll(r6)
            java.util.List r2 = r44.mo90722c()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = ie1.C41343r.m119925u(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x027a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0360
            java.lang.Object r4 = r2.next()
            ny0.a r4 = (ny0.C37499a) r4
            double r5 = r4.mo90651m()
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x02be
            ge.bog.designsystem.components.productcards.DepositCardView$b$a r5 = new ge.bog.designsystem.components.productcards.DepositCardView$b$a
            android.app.Application r6 = r0.f91761a
            int r7 = hy0.C36274h.accrued_interest
            java.lang.String r6 = r6.getString(r7)
            kotlin.jvm.internal.C41536l.m120488h(r6, r12)
            ge.bog.designsystem.components.Amount r7 = new ge.bog.designsystem.components.Amount
            double r9 = r4.mo90651m()
            java.lang.String r15 = r4.mo90641e()
            if (r15 != 0) goto L_0x02a9
            java.lang.String r15 = "GEL"
        L_0x02a9:
            r7.<init>((double) r9, (java.lang.String) r15)
            r22 = 0
            r23 = 4
            r24 = 0
            r19 = r5
            r20 = r6
            r21 = r7
            r19.<init>(r20, r21, r22, r23, r24)
            r31 = r5
            goto L_0x02c0
        L_0x02be:
            r31 = r8
        L_0x02c0:
            long r5 = r4.mo90644g()
            java.lang.String r7 = r4.mo90648j()
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r26 = g91.C32343x.m95388F(r7, r10)
            ge.bog.designsystem.components.Amount r7 = new ge.bog.designsystem.components.Amount
            double r8 = r4.mo90654p()
            java.lang.String r10 = r4.mo90647i()
            r7.<init>((double) r8, (java.lang.String) r10)
            r28 = 0
            r29 = 0
            j31.a r8 = r4.mo90638b()
            if (r8 == 0) goto L_0x02ef
            boolean r8 = r8.mo89542e()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            goto L_0x02f0
        L_0x02ef:
            r8 = 0
        L_0x02f0:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r8, r9)
            if (r9 == 0) goto L_0x02fd
            ge.bog.designsystem.components.productcards.basecard.a$b r8 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.BLACK
        L_0x02fa:
            r30 = r8
            goto L_0x030d
        L_0x02fd:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r8, r9)
            if (r9 == 0) goto L_0x0308
            ge.bog.designsystem.components.productcards.basecard.a$b r8 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.WHITE
            goto L_0x02fa
        L_0x0308:
            if (r8 != 0) goto L_0x035a
            ge.bog.designsystem.components.productcards.basecard.a$b r8 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.CLEAR
            goto L_0x02fa
        L_0x030d:
            j31.a r4 = r4.mo90638b()
            if (r4 == 0) goto L_0x033e
            java.lang.String r4 = r4.mo89541d()
            if (r4 == 0) goto L_0x033a
            ge.bog.designsystem.components.common.Image$Url r8 = new ge.bog.designsystem.components.common.Image$Url
            java.lang.String r4 = g91.C32289b0.m95091c(r4)
            kotlin.jvm.internal.C41536l.m120488h(r4, r11)
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 126(0x7e, float:1.77E-43)
            r41 = 0
            r32 = r8
            r33 = r4
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x033b
        L_0x033a:
            r8 = 0
        L_0x033b:
            r32 = r8
            goto L_0x0340
        L_0x033e:
            r32 = 0
        L_0x0340:
            r33 = 0
            r34 = 140(0x8c, float:1.96E-43)
            r35 = 0
            ge.bog.designsystem.components.productcards.DepositCardView$a r4 = new ge.bog.designsystem.components.productcards.DepositCardView$a
            r25 = r4
            r27 = r7
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            ge.bog.mobilebank.products.presentation.details.list.f$c r7 = new ge.bog.mobilebank.products.presentation.details.list.f$c
            r7.<init>(r5, r4)
            r3.add(r7)
            r8 = 0
            goto L_0x027a
        L_0x035a:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x0360:
            r1.addAll(r3)
            iu0.y r2 = iu0.C36546y.m108285N()
            ge.bog.mobilebank.model.Client r2 = r2.mo89313K()
            ge.bog.mobilebank.model.usrinfo.UserRestrictions r2 = r2.getUserRestrictions()
            java.lang.String r3 = "DEPOSITS_APPLICATIONS_OPEN_NEW_DEPOSIT"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x038c
            ge.bog.mobilebank.products.presentation.details.list.f$a r2 = new ge.bog.mobilebank.products.presentation.details.list.f$a
            android.app.Application r3 = r0.f91761a
            int r4 = hy0.C36274h.open_new_deposit
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "application.getString(R.string.open_new_deposit)"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            r2.<init>(r3)
            r1.add(r2)
        L_0x038c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qz0.C38269a.mo91808e(ny0.i):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006b, code lost:
        if (r8 == 1) goto L_0x006f;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo91809f(p606sl.C17847m r19) {
        /*
            r18 = this;
            java.lang.String r0 = "bnplList"
            r1 = r19
            kotlin.jvm.internal.C41536l.m120489i(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ge.bog.mobilebank.products.presentation.details.list.f$d r2 = new ge.bog.mobilebank.products.presentation.details.list.f$d
            hd0.a r3 = r19.mo45507c()
            double r4 = r3.mo63386b()
            hd0.a r3 = r19.mo45507c()
            java.lang.String r6 = r3.mo63385a()
            r7 = 0
            r8 = 2
            r9 = 0
            java.lang.String r3 = g91.C32343x.m95410Q(r4, r6, r7, r8, r9)
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "text.bnpl.middle.pagesum.amount"
            ge.bog.mobilebank.shared.helper.StringSource$Dictionary r5 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r6, r5)
            r2.<init>(r3, r5)
            r0.add(r2)
            java.util.List r1 = r19.mo45506b()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = ie1.C41343r.m119925u(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0047:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00a9
            java.lang.Object r3 = r1.next()
            sl.i r3 = (p606sl.C17843i) r3
            ge.bog.mobilebank.products.presentation.details.list.f$c r5 = new ge.bog.mobilebank.products.presentation.details.list.f$c
            long r6 = r3.mo45476c()
            ge.bog.designsystem.components.productcards.LoanCardView$c r15 = new ge.bog.designsystem.components.productcards.LoanCardView$c
            java.lang.String r8 = r3.mo45477d()
            if (r8 == 0) goto L_0x006e
            int r8 = r8.length()
            r9 = 1
            if (r8 <= 0) goto L_0x006a
            r8 = r9
            goto L_0x006b
        L_0x006a:
            r8 = r4
        L_0x006b:
            if (r8 != r9) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r9 = r4
        L_0x006f:
            if (r9 == 0) goto L_0x0079
            java.lang.String r8 = r3.mo45477d()
            kotlin.jvm.internal.C41536l.m120486f(r8)
            goto L_0x0083
        L_0x0079:
            java.lang.String r8 = r3.mo45480f()
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r8 = g91.C32343x.m95388F(r8, r9)
        L_0x0083:
            r9 = r8
            ge.bog.designsystem.components.Amount r10 = new ge.bog.designsystem.components.Amount
            double r11 = r3.mo45474a()
            java.lang.String r3 = r3.mo45475b()
            r10.<init>((double) r11, (java.lang.String) r3)
            r11 = 0
            r12 = 0
            ge.bog.designsystem.components.productcards.basecard.a$b r13 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.CLEAR
            r14 = 0
            r3 = 0
            r16 = 108(0x6c, float:1.51E-43)
            r17 = 0
            r8 = r15
            r4 = r15
            r15 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r5.<init>(r6, r4)
            r2.add(r5)
            r4 = 0
            goto L_0x0047
        L_0x00a9:
            ge.bog.mobilebank.products.presentation.details.list.f$a r1 = new ge.bog.mobilebank.products.presentation.details.list.f$a
            java.lang.String r3 = "products.new.bnpl.button"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r3 = g91.C32343x.m95388F(r3, r4)
            r1.<init>(r3)
            java.util.List r1 = ie1.C41358y.m120024n0(r2, r1)
            r0.addAll(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qz0.C38269a.mo91809f(sl.m):java.util.List");
    }

    /* renamed from: g */
    public final List mo91810g(C39941e eVar) {
        String str;
        double d;
        C41536l.m120489i(eVar, "bondsWrapper");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C34242f.C34246d(C32343x.m95410Q(eVar.mo93696c().mo93680c(), eVar.mo93696c().mo93679b(), false, 2, (Object) null), (StringSource) null, 2, (DefaultConstructorMarker) null));
        if (!eVar.mo93695b().isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            List b = eVar.mo93695b();
            ArrayList arrayList3 = new ArrayList(C41343r.m119925u(b, 10));
            Iterator it = b.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                d = Utils.DOUBLE_EPSILON;
                boolean z = false;
                if (!hasNext) {
                    break;
                }
                C39943g gVar = (C39943g) it.next();
                String a = gVar.mo93705a();
                if (gVar.mo93706b() > Utils.DOUBLE_EPSILON) {
                    z = true;
                }
                arrayList3.add(new GaltCardView.C13459a(a, z));
            }
            arrayList2.addAll(arrayList3);
            String F = C32343x.m95388F("product.gt-trader.cashbalance", new Object[0]);
            BigDecimal a2 = eVar.mo93696c().mo93678a();
            if (a2 != null) {
                d = a2.doubleValue();
            }
            arrayList.add(new C34242f.C34245c(-1, new GaltCardView.C13460b(F, new Amount(d, eVar.mo93696c().mo93679b()), false, C13473a.C13476b.CLEAR, new GaltCardView.C13461c.C13463b(arrayList2), false, 36, (DefaultConstructorMarker) null)));
        }
        List<C39940d> a3 = eVar.mo93694a();
        ArrayList arrayList4 = new ArrayList(C41343r.m119925u(a3, 10));
        for (C39940d dVar : a3) {
            long b2 = dVar.mo93685b();
            if (PreferencesApiManager.getInstance().getLanguage() == C37353c.KA) {
                str = dVar.mo93691g();
            } else {
                str = dVar.mo93690f();
            }
            C13473a.C13476b bVar = C13473a.C13476b.CLEAR;
            Amount amount = new Amount(dVar.mo93687d(), dVar.mo93684a());
            String string = this.f91761a.getString(C36274h.market_price);
            C41536l.m120488h(string, "application.getString(R.string.market_price)");
            arrayList4.add(new C34242f.C34245c(b2, new GaltCardView.C13460b(str, amount, false, bVar, new GaltCardView.C13461c.C13462a(string, C32343x.m95410Q(dVar.mo93686c(), dVar.mo93684a(), false, 2, (Object) null), (int) dVar.mo93688e()), false, 36, (DefaultConstructorMarker) null)));
        }
        arrayList.addAll(arrayList4);
        return arrayList;
    }

    /* renamed from: h */
    public final List mo91811h(C39948l lVar, C26766e eVar) {
        Object obj;
        boolean z;
        C41536l.m120489i(lVar, "creditCards");
        C41536l.m120489i(eVar, "cardsAndDetailsModel");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C34242f.C34246d(C32343x.m95408P(lVar.mo93735b().mo93701b().mo93729a(), lVar.mo93735b().mo93701b().mo93730b()), (StringSource) null, 2, (DefaultConstructorMarker) null));
        List<CreditCardAccount> a = lVar.mo93735b().mo93700a();
        if (a != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(a, 10));
            for (CreditCardAccount creditCardAccount : a) {
                long a2 = creditCardAccount.mo81941a();
                Iterator it = lVar.mo93734a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((BillInfo) obj).mo81906a() == creditCardAccount.mo81941a()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                BillInfo billInfo = (BillInfo) obj;
                String string = this.f91761a.getString(C36274h.f87563P);
                C41536l.m120488h(string, "application.getString(R.string.overspent)");
                String string2 = this.f91761a.getString(C36274h.payment);
                C41536l.m120488h(string2, "application.getString(R.string.payment)");
                List list = (List) eVar.mo66048a().get(Long.valueOf(creditCardAccount.mo81941a()));
                if (list == null) {
                    list = C41341q.m119907j();
                }
                arrayList2.add(new C34242f.C34245c(a2, C31513a.m93590d(creditCardAccount, billInfo, string, string2, list)));
            }
            arrayList.addAll(arrayList2);
        }
        if (!C36546y.m108285N().mo89313K().getUserRestrictions().contains(UserRestrictions.CARDS_APPLICATIONS_REGISTER)) {
            String string3 = this.f91761a.getString(C36274h.f87562N);
            C41536l.m120488h(string3, "application.getString(R.string.order_new_card)");
            arrayList.add(new C34242f.C34243a(string3));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [kotlin.jvm.internal.DefaultConstructorMarker, java.lang.Boolean] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fc, code lost:
        if (r9 == true) goto L_0x0100;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo91812i(xy0.C39959w r23) {
        /*
            r22 = this;
            r0 = r22
            java.lang.String r1 = "loans"
            r2 = r23
            kotlin.jvm.internal.C41536l.m120489i(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ge.bog.mobilebank.products.presentation.details.list.f$d r3 = new ge.bog.mobilebank.products.presentation.details.list.f$d
            hd0.a r4 = r23.mo93787d()
            double r5 = r4.mo63386b()
            hd0.a r4 = r23.mo93787d()
            java.lang.String r7 = r4.mo63385a()
            r8 = 0
            r9 = 2
            r10 = 0
            java.lang.String r4 = g91.C32343x.m95410Q(r5, r7, r8, r9, r10)
            r5 = 0
            r6 = 2
            r3.<init>(r4, r5, r6, r5)
            r1.add(r3)
            ge.bog.mobilebank.products.presentation.details.list.f$b r3 = new ge.bog.mobilebank.products.presentation.details.list.f$b
            hd0.a r4 = r23.mo93784a()
            double r7 = r4.mo63386b()
            hd0.a r4 = r23.mo93784a()
            java.lang.String r9 = r4.mo63385a()
            r10 = 0
            r11 = 2
            r12 = 0
            java.lang.String r4 = g91.C32343x.m95410Q(r7, r9, r10, r11, r12)
            r3.<init>(r4, r5, r6, r5)
            r1.add(r3)
            java.util.List r3 = r23.mo93786c()
            java.util.ArrayList r4 = new java.util.ArrayList
            r7 = 10
            int r7 = ie1.C41343r.m119925u(r3, r7)
            r4.<init>(r7)
            java.util.Iterator r3 = r3.iterator()
        L_0x0061:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x01a8
            java.lang.Object r7 = r3.next()
            xy0.p r7 = (xy0.C39952p) r7
            xy0.b r8 = r7.mo93754a()
            xy0.b r9 = xy0.C39937b.COSIGNER
            r10 = 1
            r11 = 0
            if (r8 != r9) goto L_0x0087
            ge.bog.designsystem.components.productcards.LoanCardView$a r8 = new ge.bog.designsystem.components.productcards.LoanCardView$a
            java.lang.String r9 = "text.loans.cosigner"
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.String r9 = g91.C32343x.m95388F(r9, r12)
            r8.<init>(r9)
        L_0x0084:
            r18 = r8
            goto L_0x00e7
        L_0x0087:
            java.util.List r8 = r23.mo93785b()
            java.util.Iterator r8 = r8.iterator()
        L_0x008f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00ae
            java.lang.Object r9 = r8.next()
            r12 = r9
            xy0.q r12 = (xy0.C39953q) r12
            long r12 = r12.mo93763c()
            long r14 = r7.mo93757d()
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x00aa
            r12 = r10
            goto L_0x00ab
        L_0x00aa:
            r12 = r11
        L_0x00ab:
            if (r12 == 0) goto L_0x008f
            goto L_0x00af
        L_0x00ae:
            r9 = r5
        L_0x00af:
            xy0.q r9 = (xy0.C39953q) r9
            if (r9 == 0) goto L_0x00e5
            xy0.s r8 = r9.mo93761a()
            if (r8 == 0) goto L_0x00e2
            ge.bog.designsystem.components.productcards.LoanCardView$b r9 = new ge.bog.designsystem.components.productcards.LoanCardView$b
            android.app.Application r12 = r0.f91761a
            int r13 = hy0.C36274h.payment
            java.lang.String r12 = r12.getString(r13)
            java.lang.String r13 = "application.getString(R.string.payment)"
            kotlin.jvm.internal.C41536l.m120488h(r12, r13)
            double r14 = r8.mo93770a()
            java.lang.String r16 = r7.mo93756c()
            r17 = 0
            r18 = 2
            r19 = 0
            java.lang.String r13 = g91.C32343x.m95410Q(r14, r16, r17, r18, r19)
            java.util.Date r8 = r8.mo93771b()
            r9.<init>(r12, r13, r8)
            goto L_0x00e3
        L_0x00e2:
            r9 = r5
        L_0x00e3:
            r8 = r9
            goto L_0x0084
        L_0x00e5:
            r8 = r5
            goto L_0x0084
        L_0x00e7:
            ge.bog.mobilebank.products.presentation.details.list.f$c r8 = new ge.bog.mobilebank.products.presentation.details.list.f$c
            long r14 = r7.mo93757d()
            java.lang.String r9 = r7.mo93758e()
            if (r9 == 0) goto L_0x00ff
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x00fb
            r9 = r10
            goto L_0x00fc
        L_0x00fb:
            r9 = r11
        L_0x00fc:
            if (r9 != r10) goto L_0x00ff
            goto L_0x0100
        L_0x00ff:
            r10 = r11
        L_0x0100:
            if (r10 == 0) goto L_0x0107
            java.lang.String r9 = r7.mo93758e()
            goto L_0x0111
        L_0x0107:
            java.lang.String r9 = r7.mo93760g()
            java.lang.Object[] r10 = new java.lang.Object[r11]
            java.lang.String r9 = g91.C32343x.m95388F(r9, r10)
        L_0x0111:
            r13 = r9
            ge.bog.designsystem.components.Amount r9 = new ge.bog.designsystem.components.Amount
            double r10 = r7.mo93755b()
            java.lang.String r12 = r7.mo93756c()
            r9.<init>((double) r10, (java.lang.String) r12)
            ge.bog.designsystem.components.productcards.basecard.a$b r17 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.CLEAR
            xy0.v r7 = r7.mo93759f()
            if (r7 != 0) goto L_0x0129
            r7 = -1
            goto L_0x0131
        L_0x0129:
            int[] r10 = qz0.C38269a.C38271b.f91765b
            int r7 = r7.ordinal()
            r7 = r10[r7]
        L_0x0131:
            switch(r7) {
                case 1: goto L_0x0186;
                case 2: goto L_0x017e;
                case 3: goto L_0x0176;
                case 4: goto L_0x016e;
                case 5: goto L_0x0166;
                case 6: goto L_0x015e;
                case 7: goto L_0x0156;
                case 8: goto L_0x014e;
                case 9: goto L_0x0146;
                case 10: goto L_0x013e;
                case 11: goto L_0x0136;
                default: goto L_0x0134;
            }
        L_0x0134:
            r7 = r5
            goto L_0x018d
        L_0x0136:
            ge.bog.designsystem.components.common.Image$Resource r7 = new ge.bog.designsystem.components.common.Image$Resource
            int r10 = hy0.C36270d.icons_48_loan_insurance_outline
            r7.<init>(r10, r5, r6, r5)
            goto L_0x018d
        L_0x013e:
            ge.bog.designsystem.components.common.Image$Resource r7 = new ge.bog.designsystem.components.common.Image$Resource
            int r10 = hy0.C36270d.f87480w
            r7.<init>(r10, r5, r6, r5)
            goto L_0x018d
        L_0x0146:
            ge.bog.designsystem.components.common.Image$Resource r7 = new ge.bog.designsystem.components.common.Image$Resource
            int r10 = hy0.C36270d.icons_48_loan_education_outline
            r7.<init>(r10, r5, r6, r5)
            goto L_0x018d
        L_0x014e:
            ge.bog.designsystem.components.common.Image$Resource r7 = new ge.bog.designsystem.components.common.Image$Resource
            int r10 = hy0.C36270d.f87465D
            r7.<init>(r10, r5, r6, r5)
            goto L_0x018d
        L_0x0156:
            ge.bog.designsystem.components.common.Image$Resource r7 = new ge.bog.designsystem.components.common.Image$Resource
            int r10 = hy0.C36270d.icons_48_loan_house
            r7.<init>(r10, r5, r6, r5)
            goto L_0x018d
        L_0x015e:
            ge.bog.designsystem.components.common.Image$Resource r7 = new ge.bog.designsystem.components.common.Image$Resource
            int r10 = hy0.C36270d.f87479u
            r7.<init>(r10, r5, r6, r5)
            goto L_0x018d
        L_0x0166:
            ge.bog.designsystem.components.common.Image$Resource r7 = new ge.bog.designsystem.components.common.Image$Resource
            int r10 = hy0.C36270d.icons_48_loan_express
            r7.<init>(r10, r5, r6, r5)
            goto L_0x018d
        L_0x016e:
            ge.bog.designsystem.components.common.Image$Resource r7 = new ge.bog.designsystem.components.common.Image$Resource
            int r10 = hy0.C36270d.icons_48_loan_energy_outline
            r7.<init>(r10, r5, r6, r5)
            goto L_0x018d
        L_0x0176:
            ge.bog.designsystem.components.common.Image$Resource r7 = new ge.bog.designsystem.components.common.Image$Resource
            int r10 = hy0.C36270d.f87480w
            r7.<init>(r10, r5, r6, r5)
            goto L_0x018d
        L_0x017e:
            ge.bog.designsystem.components.common.Image$Resource r7 = new ge.bog.designsystem.components.common.Image$Resource
            int r10 = hy0.C36270d.icons_48_loan_consumer
            r7.<init>(r10, r5, r6, r5)
            goto L_0x018d
        L_0x0186:
            ge.bog.designsystem.components.common.Image$Resource r7 = new ge.bog.designsystem.components.common.Image$Resource
            int r10 = hy0.C36270d.icons_48_loan_auto
            r7.<init>(r10, r5, r6, r5)
        L_0x018d:
            ge.bog.designsystem.components.productcards.LoanCardView$c r10 = new ge.bog.designsystem.components.productcards.LoanCardView$c
            r16 = 0
            r19 = 0
            r20 = 72
            r21 = 0
            r12 = r10
            r5 = r14
            r14 = r9
            r15 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r8.<init>(r5, r10)
            r4.add(r8)
            r5 = 0
            r6 = 2
            goto L_0x0061
        L_0x01a8:
            r1.addAll(r4)
            iu0.y r2 = iu0.C36546y.m108285N()
            ge.bog.mobilebank.model.Client r2 = r2.mo89313K()
            ge.bog.mobilebank.model.usrinfo.UserRestrictions r2 = r2.getUserRestrictions()
            java.lang.String r3 = "LOANS_PREPARE_APPLICATION_V2"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x01d4
            ge.bog.mobilebank.products.presentation.details.list.f$a r2 = new ge.bog.mobilebank.products.presentation.details.list.f$a
            android.app.Application r3 = r0.f91761a
            int r4 = hy0.C36274h.request_new_loan
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "application.getString(R.string.request_new_loan)"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            r2.<init>(r3)
            r1.add(r2)
        L_0x01d4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qz0.C38269a.mo91812i(xy0.w):java.util.List");
    }

    /* renamed from: j */
    public final List mo91813j(C40252e eVar) {
        List list;
        C40252e eVar2 = eVar;
        C41536l.m120489i(eVar2, "casInfo");
        CasServiceInfoUiModel e = this.f91762b.mo89930e(eVar2);
        List a = e.mo75039a();
        ArrayList<CasServiceProductUiModel> arrayList = new ArrayList<>();
        for (Object next : a) {
            if (((CasServiceProductUiModel) next).mo75060i()) {
                arrayList.add(next);
            }
        }
        List<CasInfoSummaryUiModel> n = C41341q.m119911n(C41358y.m120009Y(e.mo75040b()));
        int i = 0;
        if (arrayList.isEmpty()) {
            list = C41341q.m119907j();
        } else {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(n, 10));
            for (CasInfoSummaryUiModel casInfoSummaryUiModel : n) {
                List a2 = e.mo75039a();
                ArrayList<CasServiceProductUiModel> arrayList3 = new ArrayList<>();
                for (Object next2 : a2) {
                    if (((CasServiceProductUiModel) next2).mo75060i()) {
                        arrayList3.add(next2);
                    }
                }
                double d = 0.0d;
                for (CasServiceProductUiModel f : arrayList3) {
                    double d2 = 0.0d;
                    for (DepositAccountUiModel d3 : f.mo75056f()) {
                        d2 += d3.mo75085d();
                    }
                    d += d2;
                }
                arrayList2.add(new C34242f.C34246d(C32343x.m95410Q(d, casInfoSummaryUiModel.mo75029a(), false, 2, (Object) null), C34646b.m101748b("products.cas.total.accumulated", new Object[0])));
            }
            ArrayList arrayList4 = new ArrayList(C41343r.m119925u(arrayList, 10));
            for (CasServiceProductUiModel casServiceProductUiModel : arrayList) {
                long d4 = casServiceProductUiModel.mo75052d();
                PiggyBankCardView.C13471a aVar = r9;
                PiggyBankCardView.C13471a aVar2 = new PiggyBankCardView.C13471a(C32343x.m95388F("cas.details.title", new Object[i]), new Amount(casServiceProductUiModel.mo75051b(), casServiceProductUiModel.mo75063l()), C32343x.m95388F("products.cas.amount", new Object[i]), new Amount(casServiceProductUiModel.mo75065p(), casServiceProductUiModel.mo75063l()), new PiggyBankCardView.C13472b(casServiceProductUiModel.mo75062k(), C32343x.m95388F("cas.details.paused", new Object[0])), (Image) null, (Image) null, (C13473a.C13476b) null, false, 480, (DefaultConstructorMarker) null);
                arrayList4.add(new C34242f.C34245c(d4, aVar));
                i = 0;
            }
            list = C41358y.m120023m0(arrayList2, arrayList4);
        }
        return C41358y.m120024n0(list, new C34242f.C34243a(C32343x.m95388F("products.new.cas.button", new Object[0])));
    }
}
