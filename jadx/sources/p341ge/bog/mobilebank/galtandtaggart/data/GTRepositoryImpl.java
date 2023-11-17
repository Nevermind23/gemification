package p341ge.bog.mobilebank.galtandtaggart.data;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import de1.C40640a;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ed1.C40763y;
import ee1.C40765a;
import gd1.C40992a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import hf0.C24982a;
import if0.C25192a;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import je0.C25384a;
import je0.C25385a0;
import je0.C25386b;
import je0.C25387b0;
import je0.C25388c;
import je0.C25389c0;
import je0.C25390d;
import je0.C25391d0;
import je0.C25392e;
import je0.C25393e0;
import je0.C25394f;
import je0.C25395f0;
import je0.C25396g;
import je0.C25397g0;
import je0.C25398h;
import je0.C25399h0;
import je0.C25400i;
import je0.C25401i0;
import je0.C25402j;
import je0.C25403j0;
import je0.C25404k;
import je0.C25405k0;
import je0.C25406l;
import je0.C25407l0;
import je0.C25408m;
import je0.C25409m0;
import je0.C25410n;
import je0.C25411n0;
import je0.C25412o;
import je0.C25413o0;
import je0.C25414p;
import je0.C25415p0;
import je0.C25416q;
import je0.C25417q0;
import je0.C25418r;
import je0.C25419r0;
import je0.C25420s;
import je0.C25421s0;
import je0.C25422t;
import je0.C25423t0;
import je0.C25424u;
import je0.C25425u0;
import je0.C25426v;
import je0.C25427v0;
import je0.C25428w;
import je0.C25429w0;
import je0.C25430x;
import je0.C25431y;
import je0.C25432z;
import ke0.C25712a;
import ke0.C25713b;
import ke0.C25714c;
import ke0.C25716d;
import ke0.C25717e;
import ke0.C25718f;
import ke0.C25719g;
import ke0.C25722j;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.C25952b;
import p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountsApiEntity;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.galtandtaggart.data.model.AccountConfirmFilesApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.AccountStatementFilesApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.CalculateTradeDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.CashDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.GTMarketInfoApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.IdentomatStatusApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.MarketStatus;
import p341ge.bog.mobilebank.galtandtaggart.data.model.PortfolioClientApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.PortfolioHistorySummeryApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.PortfolioOverviewApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ProductTypeApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.SearchSymbolResultApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ShareSymbolMetaDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ShareSymbolOnlineDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ShareSymbolOnlineMinimizedDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.SymbolHistoryDataContainerApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.TradeOrderResultApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.WatchListCreateResultApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.WatchListDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.WatchListSymbolsDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.domain.model.MarketInfo;
import p341ge.bog.mobilebank.galtandtaggart.domain.model.WatchList;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p945xt.C29858a;
import ue1.C43075l;
import xe0.C29745c;
import xe0.C29746d;
import xe0.C29749g;
import xe0.C29750h;
import xe0.C29751i;
import xe0.C29756n;
import xe0.C29757o;

/* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl */
public final class GTRepositoryImpl implements C24982a {

    /* renamed from: z */
    public static final C23336a f61069z = new C23336a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C25429w0 f61070d;

    /* renamed from: e */
    private final C25717e f61071e;

    /* renamed from: f */
    private final C25719g f61072f;

    /* renamed from: g */
    private final C25718f f61073g;

    /* renamed from: h */
    private final C29858a f61074h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C25722j f61075i;

    /* renamed from: j */
    private final C25712a f61076j;

    /* renamed from: k */
    private final C25716d f61077k;

    /* renamed from: l */
    private final C25713b f61078l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C25714c f61079m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public AtomicBoolean f61080n = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public AtomicBoolean f61081o = new AtomicBoolean(false);

    /* renamed from: p */
    private C40765a f61082p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public AtomicBoolean f61083q;

    /* renamed from: r */
    private C40765a f61084r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public AtomicBoolean f61085s;

    /* renamed from: t */
    private C40765a f61086t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final AtomicReference f61087u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final AtomicReference f61088v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final AtomicReference f61089w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final AtomicReference f61090x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public AtomicReference f61091y;

    @Keep
    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$GTMoneyExchangeParams */
    public static final class GTMoneyExchangeParams extends OtpParams {
        private final String UTMCampaign;
        private final String UTMMedium;
        private final String UTMSource;
        private final long acctKey;
        private final String amount;
        private final String ccy;
        private final String operationId;
        private final String operationReference;
        private final String scaAuthCode;
        private final String serviceId;
        private final String serviceOperationId;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ GTMoneyExchangeParams(java.lang.String r17, long r18, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
            /*
                r16 = this;
                r0 = r29
                r1 = r0 & 256(0x100, float:3.59E-43)
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r13 = r2
                goto L_0x000b
            L_0x0009:
                r13 = r26
            L_0x000b:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0011
                r14 = r2
                goto L_0x0013
            L_0x0011:
                r14 = r27
            L_0x0013:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x0019
                r15 = r2
                goto L_0x001b
            L_0x0019:
                r15 = r28
            L_0x001b:
                r3 = r16
                r4 = r17
                r5 = r18
                r7 = r20
                r8 = r21
                r9 = r22
                r10 = r23
                r11 = r24
                r12 = r25
                r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl.GTMoneyExchangeParams.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final long getAcctKey() {
            return this.acctKey;
        }

        public final String getAmount() {
            return this.amount;
        }

        public final String getCcy() {
            return this.ccy;
        }

        public String getOperationId() {
            return this.operationId;
        }

        public String getOperationReference() {
            return this.operationReference;
        }

        public String getScaAuthCode() {
            return this.scaAuthCode;
        }

        public String getServiceId() {
            return this.serviceId;
        }

        public final String getServiceOperationId() {
            return this.serviceOperationId;
        }

        public final String getUTMCampaign() {
            return this.UTMCampaign;
        }

        public final String getUTMMedium() {
            return this.UTMMedium;
        }

        public final String getUTMSource() {
            return this.UTMSource;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GTMoneyExchangeParams(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            super(str7, str9, str10, (String) null, 8, (DefaultConstructorMarker) null);
            String str11 = str2;
            String str12 = str3;
            String str13 = str7;
            C41536l.m120489i(str, "amount");
            C41536l.m120489i(str11, "ccy");
            C41536l.m120489i(str12, "serviceOperationId");
            C41536l.m120489i(str13, IRetrofitService.SERVICE_ID);
            this.amount = str;
            this.acctKey = j;
            this.ccy = str11;
            this.serviceOperationId = str12;
            this.UTMMedium = str4;
            this.UTMSource = str5;
            this.UTMCampaign = str6;
            this.serviceId = str13;
            this.operationId = str8;
            this.operationReference = str9;
            this.scaAuthCode = str10;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$a */
    public static final class C23336a {
        private C23336a() {
        }

        public /* synthetic */ C23336a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$a0 */
    static final class C23337a0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61092d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23337a0(GTRepositoryImpl gTRepositoryImpl) {
            super(1);
            this.f61092d = gTRepositoryImpl;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f61092d.f61087u.set((Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$b */
    public /* synthetic */ class C23338b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61093a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                if0.a[] r0 = if0.C25192a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                if0.a r1 = if0.C25192a.GET_MONEY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                if0.a r1 = if0.C25192a.DEPOSIT_MONEY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f61093a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl.C23338b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$b0 */
    /* synthetic */ class C23339b0 extends C41535k implements C43075l {
        C23339b0(Object obj) {
            super(1, obj, C25717e.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/model/PortfolioOverviewApiModel;)Lge/bog/mobilebank/galtandtaggart/domain/model/PortfolioOverview;", 0);
        }

        /* renamed from: b */
        public final C29751i invoke(PortfolioOverviewApiModel portfolioOverviewApiModel) {
            C41536l.m120489i(portfolioOverviewApiModel, "p0");
            return ((C25717e) this.receiver).mo64288d(portfolioOverviewApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$c */
    /* synthetic */ class C23340c extends C41535k implements C43075l {
        C23340c(Object obj) {
            super(1, obj, C25719g.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/model/CalculateTradeDataApiModel;)Lge/bog/mobilebank/galtandtaggart/domain/model/CalculateTradeData;", 0);
        }

        /* renamed from: b */
        public final C29745c invoke(CalculateTradeDataApiModel calculateTradeDataApiModel) {
            C41536l.m120489i(calculateTradeDataApiModel, "p0");
            return ((C25719g) this.receiver).mo64293b(calculateTradeDataApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$c0 */
    static final class C23341c0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61094d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23341c0(GTRepositoryImpl gTRepositoryImpl) {
            super(1);
            this.f61094d = gTRepositoryImpl;
        }

        /* renamed from: a */
        public final void mo59132a(C41205b bVar) {
            this.f61094d.f61080n.set(true);
            this.f61094d.f61081o.set(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo59132a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$d */
    /* synthetic */ class C23342d extends C41535k implements C43075l {
        C23342d(Object obj) {
            super(1, obj, C25714c.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C25714c) this.receiver).mo64282a(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$d0 */
    static final class C23343d0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61095d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23343d0(GTRepositoryImpl gTRepositoryImpl) {
            super(1);
            this.f61095d = gTRepositoryImpl;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f61095d.f61080n.set(false);
            this.f61095d.f61081o.set(true);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$e */
    static final class C23344e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23344e(GTRepositoryImpl gTRepositoryImpl) {
            super(1);
            this.f61096d = gTRepositoryImpl;
        }

        /* renamed from: a */
        public final C29749g invoke(IdentomatStatusApiModel identomatStatusApiModel) {
            C41536l.m120489i(identomatStatusApiModel, "dto");
            return this.f61096d.f61079m.mo64283b(identomatStatusApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$e0 */
    static final class C23345e0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61097d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23345e0(GTRepositoryImpl gTRepositoryImpl) {
            super(1);
            this.f61097d = gTRepositoryImpl;
        }

        /* renamed from: a */
        public final void mo59136a(C29751i iVar) {
            this.f61097d.f61080n.set(false);
            this.f61097d.f61081o.set(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo59136a((C29751i) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$f */
    static final class C23346f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61098d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23346f(GTRepositoryImpl gTRepositoryImpl) {
            super(1);
            this.f61098d = gTRepositoryImpl;
        }

        /* renamed from: a */
        public final WatchList invoke(WatchListCreateResultApiModel watchListCreateResultApiModel) {
            C41536l.m120489i(watchListCreateResultApiModel, "it");
            return this.f61098d.f61075i.mo64297a(watchListCreateResultApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$f0 */
    static final class C23347f0 extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C23347f0 f61099d = new C23347f0();

        C23347f0() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(C40749p pVar) {
            C41536l.m120489i(pVar, "it");
            return pVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$g */
    /* synthetic */ class C23348g extends C41535k implements C43075l {
        C23348g(Object obj) {
            super(1, obj, C25719g.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/model/SymbolHistoryDataContainerApiModel;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(SymbolHistoryDataContainerApiModel symbolHistoryDataContainerApiModel) {
            C41536l.m120489i(symbolHistoryDataContainerApiModel, "p0");
            return ((C25719g) this.receiver).mo64292a(symbolHistoryDataContainerApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$g0 */
    /* synthetic */ class C23349g0 extends C41535k implements C43075l {
        C23349g0(Object obj) {
            super(1, obj, C25718f.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/model/SearchSymbolResultApiModel;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(SearchSymbolResultApiModel searchSymbolResultApiModel) {
            C41536l.m120489i(searchSymbolResultApiModel, "p0");
            return ((C25718f) this.receiver).mo64291b(searchSymbolResultApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$h */
    /* synthetic */ class C23350h extends C41535k implements C43075l {
        C23350h(Object obj) {
            super(1, obj, C25712a.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/model/AccountConfirmFilesApiModel;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(AccountConfirmFilesApiModel accountConfirmFilesApiModel) {
            C41536l.m120489i(accountConfirmFilesApiModel, "p0");
            return ((C25712a) this.receiver).mo64279a(accountConfirmFilesApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$h0 */
    static final class C23351h0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40763y f61100d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23351h0(C40763y yVar) {
            super(1);
            this.f61100d = yVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f61100d.onError(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$i */
    /* synthetic */ class C23352i extends C41535k implements C43075l {
        C23352i(Object obj) {
            super(1, obj, C25712a.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/model/AccountStatementFilesApiModel;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(AccountStatementFilesApiModel accountStatementFilesApiModel) {
            C41536l.m120489i(accountStatementFilesApiModel, "p0");
            return ((C25712a) this.receiver).mo64280b(accountStatementFilesApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$i0 */
    static final class C23353i0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61101d;

        /* renamed from: e */
        final /* synthetic */ String f61102e;

        /* renamed from: f */
        final /* synthetic */ String f61103f;

        /* renamed from: g */
        final /* synthetic */ String f61104g;

        /* renamed from: h */
        final /* synthetic */ Integer f61105h;

        /* renamed from: i */
        final /* synthetic */ int f61106i;

        /* renamed from: j */
        final /* synthetic */ C40763y f61107j;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$i0$a */
        static final class C23354a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C40763y f61108d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23354a(C40763y yVar) {
                super(1);
                this.f61108d = yVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                this.f61108d.onError(th);
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$i0$b */
        static final class C23355b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C40763y f61109d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23355b(C40763y yVar) {
                super(1);
                this.f61109d = yVar;
            }

            /* renamed from: a */
            public final void mo59146a(List list) {
                this.f61109d.mo95093a(list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo59146a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$i0$c */
        public /* synthetic */ class C23356c {

            /* renamed from: a */
            public static final /* synthetic */ int[] f61110a;

            static {
                int[] iArr = new int[MarketStatus.values().length];
                try {
                    iArr[MarketStatus.NOT_OPENED_YET.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f61110a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23353i0(GTRepositoryImpl gTRepositoryImpl, String str, String str2, String str3, Integer num, int i, C40763y yVar) {
            super(1);
            this.f61101d = gTRepositoryImpl;
            this.f61102e = str;
            this.f61103f = str2;
            this.f61104g = str3;
            this.f61105h = num;
            this.f61106i = i;
            this.f61107j = yVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m75665d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m75666e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final void mo59144c(GTMarketInfoApiModel gTMarketInfoApiModel) {
            Integer num;
            int i;
            GTRepositoryImpl gTRepositoryImpl = this.f61101d;
            String str = this.f61102e;
            String str2 = this.f61103f;
            String str3 = this.f61104g;
            Integer num2 = this.f61105h;
            if (num2 != null) {
                int i2 = 1;
                if (num2.intValue() == 1) {
                    MarketStatus status = gTMarketInfoApiModel.getStatus();
                    if (status == null) {
                        i = -1;
                    } else {
                        i = C23356c.f61110a[status.ordinal()];
                    }
                    if (i == 1) {
                        i2 = 2;
                    }
                    num = Integer.valueOf(i2);
                    gTRepositoryImpl.m75594o5(str, str2, str3, num, this.f61106i).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95082k(new C23384a(new C23354a(this.f61107j))).mo95084m(new C23385b(new C23355b(this.f61107j))).mo95067F();
                }
            }
            num = this.f61105h;
            gTRepositoryImpl.m75594o5(str, str2, str3, num, this.f61106i).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95082k(new C23384a(new C23354a(this.f61107j))).mo95084m(new C23385b(new C23355b(this.f61107j))).mo95067F();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo59144c((GTMarketInfoApiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$j */
    /* synthetic */ class C23357j extends C41535k implements C43075l {
        C23357j(Object obj) {
            super(1, obj, C25713b.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C25713b) this.receiver).mo64281a(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$j0 */
    /* synthetic */ class C23358j0 extends C41535k implements C43075l {
        C23358j0(Object obj) {
            super(1, obj, C25719g.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/model/ShareSymbolMetaDataApiModel;)Lge/bog/mobilebank/galtandtaggart/domain/model/ShareSymbolMetaData;", 0);
        }

        /* renamed from: b */
        public final C29756n invoke(ShareSymbolMetaDataApiModel shareSymbolMetaDataApiModel) {
            C41536l.m120489i(shareSymbolMetaDataApiModel, "p0");
            return ((C25719g) this.receiver).mo64295f(shareSymbolMetaDataApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$k */
    static final class C23359k extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C23359k f61111d = new C23359k();

        C23359k() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(C40749p pVar) {
            C41536l.m120489i(pVar, "it");
            return pVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$k0 */
    static final class C23360k0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61112d;

        /* renamed from: e */
        final /* synthetic */ String f61113e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23360k0(GTRepositoryImpl gTRepositoryImpl, String str) {
            super(1);
            this.f61112d = gTRepositoryImpl;
            this.f61113e = str;
        }

        /* renamed from: a */
        public final void mo59150a(C29756n nVar) {
            this.f61112d.f61088v.set(new C41224m(this.f61113e, nVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo59150a((C29756n) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$l */
    /* synthetic */ class C23361l extends C41535k implements C43075l {
        C23361l(Object obj) {
            super(1, obj, C25717e.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/model/CashDataApiModel;)Lge/bog/mobilebank/galtandtaggart/domain/model/CashData;", 0);
        }

        /* renamed from: b */
        public final C29746d invoke(CashDataApiModel cashDataApiModel) {
            C41536l.m120489i(cashDataApiModel, "p0");
            return ((C25717e) this.receiver).mo64287c(cashDataApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$l0 */
    static final class C23362l0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61114d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23362l0(GTRepositoryImpl gTRepositoryImpl) {
            super(1);
            this.f61114d = gTRepositoryImpl;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f61114d.f61088v.set((Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$m */
    static final class C23363m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61115d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23363m(GTRepositoryImpl gTRepositoryImpl) {
            super(1);
            this.f61115d = gTRepositoryImpl;
        }

        /* renamed from: a */
        public final void mo59153a(C41205b bVar) {
            this.f61115d.f61083q.set(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo59153a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$m0 */
    /* synthetic */ class C23364m0 extends C41535k implements C43075l {
        C23364m0(Object obj) {
            super(1, obj, C25719g.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/model/ShareSymbolOnlineDataApiModel;)Lge/bog/mobilebank/galtandtaggart/domain/model/ShareSymbolOnlineData;", 0);
        }

        /* renamed from: b */
        public final C29757o invoke(ShareSymbolOnlineDataApiModel shareSymbolOnlineDataApiModel) {
            C41536l.m120489i(shareSymbolOnlineDataApiModel, "p0");
            return ((C25719g) this.receiver).mo64296g(shareSymbolOnlineDataApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$n */
    /* synthetic */ class C23365n extends C41535k implements C43075l {
        C23365n(Object obj) {
            super(1, obj, C25717e.class, "convertEquity", "convertEquity(Lge/bog/mobilebank/galtandtaggart/data/model/PortfolioClientApiModel;)Ljava/math/BigDecimal;", 0);
        }

        /* renamed from: b */
        public final BigDecimal invoke(PortfolioClientApiModel portfolioClientApiModel) {
            C41536l.m120489i(portfolioClientApiModel, "p0");
            return ((C25717e) this.receiver).mo64289e(portfolioClientApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$n0 */
    static final class C23366n0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61116d;

        /* renamed from: e */
        final /* synthetic */ String f61117e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23366n0(GTRepositoryImpl gTRepositoryImpl, String str) {
            super(1);
            this.f61116d = gTRepositoryImpl;
            this.f61117e = str;
        }

        /* renamed from: a */
        public final void mo59156a(C29757o oVar) {
            this.f61116d.f61089w.set(new C41224m(this.f61117e, oVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo59156a((C29757o) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$o */
    /* synthetic */ class C23367o extends C41535k implements C43075l {
        C23367o(Object obj) {
            super(1, obj, C25717e.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/model/PortfolioClientApiModel;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(PortfolioClientApiModel portfolioClientApiModel) {
            C41536l.m120489i(portfolioClientApiModel, "p0");
            return ((C25717e) this.receiver).mo64285a(portfolioClientApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$o0 */
    static final class C23368o0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61118d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23368o0(GTRepositoryImpl gTRepositoryImpl) {
            super(1);
            this.f61118d = gTRepositoryImpl;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f61118d.f61089w.set((Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$p */
    /* synthetic */ class C23369p extends C41535k implements C43075l {
        C23369p(Object obj) {
            super(1, obj, C29858a.class, "transform", "transform(Lge/bog/mobilebank/cleanarch/data/transferaccounts/entity/TransferAccountsApiEntity;)Lge/bog/mobilebank/cleanarch/domain/transferaccounts/model/TransferAccounts;", 0);
        }

        /* renamed from: b */
        public final TransferAccounts invoke(TransferAccountsApiEntity transferAccountsApiEntity) {
            C41536l.m120489i(transferAccountsApiEntity, "p0");
            return ((C29858a) this.receiver).mo70112c(transferAccountsApiEntity);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$p0 */
    /* synthetic */ class C23370p0 extends C41535k implements C43075l {
        C23370p0(Object obj) {
            super(1, obj, C25722j.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/model/WatchListSymbolsDataApiModel;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(WatchListSymbolsDataApiModel watchListSymbolsDataApiModel) {
            C41536l.m120489i(watchListSymbolsDataApiModel, "p0");
            return ((C25722j) this.receiver).mo64299c(watchListSymbolsDataApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$q */
    static final class C23371q extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C23371q f61119d = new C23371q();

        C23371q() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(C40749p pVar) {
            C41536l.m120489i(pVar, "it");
            return pVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$q0 */
    /* synthetic */ class C23372q0 extends C41535k implements C43075l {
        C23372q0(Object obj) {
            super(1, obj, C25722j.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/model/WatchListDataApiModel;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(WatchListDataApiModel watchListDataApiModel) {
            C41536l.m120489i(watchListDataApiModel, "p0");
            return ((C25722j) this.receiver).mo64298b(watchListDataApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$r */
    /* synthetic */ class C23373r extends C41535k implements C43075l {
        C23373r(Object obj) {
            super(1, obj, C25718f.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/model/GTMarketInfoApiModel;)Lge/bog/mobilebank/galtandtaggart/data/model/GTMarketInfoApiModel;", 0);
        }

        /* renamed from: b */
        public final GTMarketInfoApiModel invoke(GTMarketInfoApiModel gTMarketInfoApiModel) {
            C41536l.m120489i(gTMarketInfoApiModel, "p0");
            return ((C25718f) this.receiver).mo64290a(gTMarketInfoApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$r0 */
    static final class C23374r0 extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C23374r0 f61120d = new C23374r0();

        C23374r0() {
            super(1);
        }

        /* renamed from: a */
        public final void mo59164a(TradeOrderResultApiModel tradeOrderResultApiModel) {
            C41536l.m120489i(tradeOrderResultApiModel, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo59164a((TradeOrderResultApiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$s */
    static final class C23375s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61121d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23375s(GTRepositoryImpl gTRepositoryImpl) {
            super(1);
            this.f61121d = gTRepositoryImpl;
        }

        /* renamed from: a */
        public final void mo59165a(C41205b bVar) {
            this.f61121d.f61085s.set(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo59165a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$s0 */
    static final class C23376s0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61122d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23376s0(GTRepositoryImpl gTRepositoryImpl) {
            super(1);
            this.f61122d = gTRepositoryImpl;
        }

        /* renamed from: a */
        public final void mo59166a(C41238w wVar) {
            this.f61122d.m75590m6();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo59166a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$t */
    static final class C23377t extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C23377t f61123d = new C23377t();

        C23377t() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(List list) {
            Object obj;
            String status;
            C41536l.m120489i(list, "list");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((ProductTypeApiModel) obj).getProduct(), "GTP_TRADING")) {
                    break;
                }
            }
            ProductTypeApiModel productTypeApiModel = (ProductTypeApiModel) obj;
            if (productTypeApiModel == null || (status = productTypeApiModel.getStatus()) == null) {
                return ProductType.PRODUCT_STATUS_NEW;
            }
            return status;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$u */
    static final class C23378u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61124d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23378u(GTRepositoryImpl gTRepositoryImpl) {
            super(1);
            this.f61124d = gTRepositoryImpl;
        }

        /* renamed from: a */
        public final void mo59168a(String str) {
            this.f61124d.f61091y.set(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo59168a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$v */
    /* synthetic */ class C23379v extends C41535k implements C43075l {
        C23379v(Object obj) {
            super(1, obj, C25716d.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/model/GTMarketInfoApiModel;)Lge/bog/mobilebank/galtandtaggart/domain/model/MarketInfo;", 0);
        }

        /* renamed from: b */
        public final MarketInfo invoke(GTMarketInfoApiModel gTMarketInfoApiModel) {
            C41536l.m120489i(gTMarketInfoApiModel, "p0");
            return ((C25716d) this.receiver).mo64284a(gTMarketInfoApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$w */
    static final class C23380w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61125d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23380w(GTRepositoryImpl gTRepositoryImpl) {
            super(1);
            this.f61125d = gTRepositoryImpl;
        }

        /* renamed from: a */
        public final void mo59170a(MarketInfo marketInfo) {
            this.f61125d.f61090x.set(marketInfo);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo59170a((MarketInfo) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$x */
    /* synthetic */ class C23381x extends C41535k implements C43075l {
        C23381x(Object obj) {
            super(1, obj, C25719g.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/model/ShareSymbolOnlineMinimizedDataApiModel;)Lge/bog/mobilebank/galtandtaggart/domain/model/MinimizedOnlineData;", 0);
        }

        /* renamed from: b */
        public final C29750h invoke(ShareSymbolOnlineMinimizedDataApiModel shareSymbolOnlineMinimizedDataApiModel) {
            C41536l.m120489i(shareSymbolOnlineMinimizedDataApiModel, "p0");
            return ((C25719g) this.receiver).mo64294d(shareSymbolOnlineMinimizedDataApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$y */
    /* synthetic */ class C23382y extends C41535k implements C43075l {
        C23382y(Object obj) {
            super(1, obj, C25717e.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/model/PortfolioHistorySummeryApiModel;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(PortfolioHistorySummeryApiModel portfolioHistorySummeryApiModel) {
            C41536l.m120489i(portfolioHistorySummeryApiModel, "p0");
            return ((C25717e) this.receiver).mo64286b(portfolioHistorySummeryApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl$z */
    static final class C23383z extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTRepositoryImpl f61126d;

        /* renamed from: e */
        final /* synthetic */ String f61127e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23383z(GTRepositoryImpl gTRepositoryImpl, String str) {
            super(1);
            this.f61126d = gTRepositoryImpl;
            this.f61127e = str;
        }

        /* renamed from: a */
        public final void mo59173a(List list) {
            this.f61126d.f61087u.set(new C41224m(this.f61127e, list));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo59173a((List) obj);
            return C41238w.f97225a;
        }
    }

    public GTRepositoryImpl(C25429w0 w0Var, C25717e eVar, C25719g gVar, C25718f fVar, C29858a aVar, C25722j jVar, C25712a aVar2, C25716d dVar, C25713b bVar, C25714c cVar) {
        C41536l.m120489i(w0Var, "service");
        C41536l.m120489i(eVar, "portfolioMapper");
        C41536l.m120489i(gVar, "shareDetailsMapper");
        C41536l.m120489i(fVar, "searchResultMapper");
        C41536l.m120489i(aVar, "accountsMapper");
        C41536l.m120489i(jVar, "watchListMapper");
        C41536l.m120489i(aVar2, "accountFileMapper");
        C41536l.m120489i(dVar, "marketInfoMapper");
        C41536l.m120489i(bVar, "buySellDefaultAmountMapper");
        C41536l.m120489i(cVar, "gtMapper");
        this.f61070d = w0Var;
        this.f61071e = eVar;
        this.f61072f = gVar;
        this.f61073g = fVar;
        this.f61074h = aVar;
        this.f61075i = jVar;
        this.f61076j = aVar2;
        this.f61077k = dVar;
        this.f61078l = bVar;
        this.f61079m = cVar;
        C40765a i1 = C40765a.m118199i1(m75537S5());
        C41536l.m120488h(i1, "createDefault(getPortfolioObservable())");
        this.f61082p = i1;
        this.f61083q = new AtomicBoolean(false);
        C40765a i12 = C40765a.m118199i1(m75611u5());
        C41536l.m120488h(i12, "createDefault(getCashDataInfoObservable())");
        this.f61084r = i12;
        this.f61085s = new AtomicBoolean(false);
        C40765a i13 = C40765a.m118199i1(m75512F5());
        C41536l.m120488h(i13, "createDefault(getGTMarketInfoObservable())");
        this.f61086t = i13;
        this.f61087u = new AtomicReference();
        this.f61088v = new AtomicReference();
        this.f61089w = new AtomicReference();
        this.f61090x = new AtomicReference();
        this.f61091y = new AtomicReference((Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: A5 */
    public static final List m75503A5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: B5 */
    public static final TransferAccounts m75505B5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (TransferAccounts) lVar.invoke(obj);
    }

    /* renamed from: C5 */
    private final C40749p m75507C5(boolean z) {
        if (z && this.f61085s.compareAndSet(false, true)) {
            return m75595o6();
        }
        C40749p L0 = this.f61086t.mo94989L0(new C25387b0(C23371q.f61119d));
        C41536l.m120488h(L0, "{\n            marketInfo…t\n            }\n        }");
        return L0;
    }

    /* access modifiers changed from: private */
    /* renamed from: D5 */
    public static final C40754t m75509D5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: F5 */
    private final C40749p m75512F5() {
        C40749p g = this.f61070d.mo63983D1().mo95062A(new C25411n0(new C23373r(this.f61073g))).mo95083l(new C25413o0(new C23375s(this))).mo95085n(new C25415p0(this)).mo95075O().mo95021g();
        C41536l.m120488h(g, "private fun getGTMarketI…           .cache()\n    }");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: G5 */
    public static final GTMarketInfoApiModel m75514G5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (GTMarketInfoApiModel) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: H5 */
    public static final void m75516H5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: I5 */
    public static final void m75518I5(GTRepositoryImpl gTRepositoryImpl) {
        C41536l.m120489i(gTRepositoryImpl, "this$0");
        gTRepositoryImpl.f61085s.set(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: J5 */
    public static final String m75520J5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (String) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: K5 */
    public static final void m75522K5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: L5 */
    public static final MarketInfo m75524L5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (MarketInfo) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: M5 */
    public static final void m75526M5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: O5 */
    public static final C29750h m75529O5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29750h) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: P5 */
    public static final List m75531P5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q5 */
    public static final void m75533Q5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: R5 */
    public static final void m75535R5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: S5 */
    private final C40749p m75537S5() {
        C40749p g = this.f61070d.getPortfolioOverview().mo95062A(new C25395f0(new C23339b0(this.f61071e))).mo95083l(new C25397g0(new C23341c0(this))).mo95082k(new C25401i0(new C23343d0(this))).mo95084m(new C25403j0(new C23345e0(this))).mo95075O().mo95021g();
        C41536l.m120488h(g, "private fun getPortfolio…           .cache()\n    }");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: T5 */
    public static final void m75539T5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: U5 */
    public static final void m75541U5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: W5 */
    public static final C29751i m75544W5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29751i) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: X5 */
    public static final void m75546X5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y5 */
    public static final C40754t m75548Y5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z5 */
    public static final List m75551Z5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a6 */
    public static final void m75554a6(GTRepositoryImpl gTRepositoryImpl, String str, String str2, String str3, Integer num, int i, C40763y yVar) {
        C40763y yVar2 = yVar;
        C41536l.m120489i(gTRepositoryImpl, "this$0");
        C41536l.m120489i(str, "$symbol");
        C41536l.m120489i(yVar2, "emitter");
        gTRepositoryImpl.m75507C5(false).mo94987J0(C40640a.m117458b()).mo95027o0(C40992a.m118827a()).mo94974C(new C25394f(new C23351h0(yVar2))).mo94978E(new C25396g(new C23353i0(gTRepositoryImpl, str, str2, str3, num, i, yVar2))).mo94979E0();
    }

    /* access modifiers changed from: private */
    /* renamed from: b6 */
    public static final void m75557b6(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: c6 */
    public static final void m75560c6(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: d6 */
    public static final C29756n m75563d6(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29756n) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: e6 */
    public static final void m75566e6(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f6 */
    public static final void m75569f6(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: g6 */
    public static final C29757o m75572g6(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29757o) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: h6 */
    public static final void m75575h6(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: i6 */
    public static final void m75578i6(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: j5 */
    public static final C29745c m75580j5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29745c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: j6 */
    public static final List m75581j6(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k5 */
    public static final List m75583k5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k6 */
    public static final List m75584k6(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l5 */
    public static final C29749g m75586l5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29749g) lVar.invoke(obj);
    }

    /* renamed from: l6 */
    private final C40749p m75587l6() {
        C40749p u5 = m75611u5();
        this.f61084r.onNext(u5);
        return u5;
    }

    /* access modifiers changed from: private */
    /* renamed from: m5 */
    public static final void m75589m5(GTRepositoryImpl gTRepositoryImpl) {
        C41536l.m120489i(gTRepositoryImpl, "this$0");
        gTRepositoryImpl.m75590m6();
    }

    /* access modifiers changed from: private */
    /* renamed from: m6 */
    public final void m75590m6() {
        new Handler(Looper.getMainLooper()).postDelayed(new C25389c0(this), 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: n5 */
    public static final WatchList m75592n5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (WatchList) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: n6 */
    public static final void m75593n6(GTRepositoryImpl gTRepositoryImpl) {
        C41536l.m120489i(gTRepositoryImpl, "this$0");
        gTRepositoryImpl.mo59116w0().mo94979E0();
        gTRepositoryImpl.mo59119y3(true).mo94979E0();
    }

    /* access modifiers changed from: private */
    /* renamed from: o5 */
    public final C40762x m75594o5(String str, String str2, String str3, Integer num, int i) {
        C40762x A = this.f61070d.mo63980B0(str, str2, str3, num, i).mo95062A(new C25393e0(new C23348g(this.f61072f)));
        C41536l.m120488h(A, "service\n            .get…reDetailsMapper::convert)");
        return A;
    }

    /* renamed from: o6 */
    private final C40749p m75595o6() {
        C40749p F5 = m75512F5();
        this.f61086t.onNext(F5);
        return F5;
    }

    /* access modifiers changed from: private */
    /* renamed from: p5 */
    public static final List m75597p5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: p6 */
    private final C40749p m75598p6() {
        C40749p S5 = m75537S5();
        this.f61082p.onNext(S5);
        return S5;
    }

    /* access modifiers changed from: private */
    /* renamed from: q5 */
    public static final List m75600q5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: q6 */
    private final String m75601q6(List list) {
        if (list.isEmpty()) {
            return "";
        }
        return C41358y.m120017g0(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r5 */
    public static final List m75603r5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: r6 */
    public static final C41238w m75604r6(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41238w) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: s5 */
    public static final List m75606s5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: s6 */
    public static final void m75607s6(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: t5 */
    public static final C40754t m75609t5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: u5 */
    private final C40749p m75611u5() {
        C40749p g = this.f61070d.mo64009w0().mo95062A(new C25405k0(new C23361l(this.f61071e))).mo95083l(new C25407l0(new C23363m(this))).mo95085n(new C25409m0(this)).mo95075O().mo95021g();
        C41536l.m120488h(g, "private fun getCashDataI…           .cache()\n    }");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: v5 */
    public static final C29746d m75613v5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29746d) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: w5 */
    public static final void m75615w5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: x5 */
    public static final void m75617x5(GTRepositoryImpl gTRepositoryImpl) {
        C41536l.m120489i(gTRepositoryImpl, "this$0");
        gTRepositoryImpl.f61083q.set(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: z5 */
    public static final BigDecimal m75620z5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (BigDecimal) lVar.invoke(obj);
    }

    /* renamed from: A0 */
    public C40762x mo59091A0(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "watchListId");
        C40762x A = this.f61070d.mo63978A0(bigDecimal).mo95062A(new C25427v0(new C23370p0(this.f61075i)));
        C41536l.m120488h(A, "service\n            .get…watchListMapper::convert)");
        return A;
    }

    /* renamed from: B0 */
    public C40762x mo59092B0(String str, String str2, String str3, Integer num, int i) {
        C41536l.m120489i(str, "symbol");
        C40762x e = C40762x.m118157e(new C25406l(this, str, str2, str3, num, i));
        C41536l.m120488h(e, "create { emitter ->\n    …   .subscribe()\n        }");
        return e;
    }

    /* renamed from: E3 */
    public C40762x mo59093E3(long j, Long l) {
        C40762x A = this.f61070d.mo63982C1(j, l, "month").mo95062A(new C25432z(new C23352i(this.f61076j)));
        C41536l.m120488h(A, "service\n            .get…countFileMapper::convert)");
        return A;
    }

    /* renamed from: F0 */
    public C40734b mo59094F0(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40734b o = this.f61070d.mo63986F0(hashMap).mo94902o(new C25398h(this));
        C41536l.m120488h(o, "service\n            .con…freshData()\n            }");
        return o;
    }

    /* renamed from: G0 */
    public C40762x mo59095G0(String str) {
        C41536l.m120489i(str, "symbol");
        C40762x A = this.f61070d.mo63988G0(str).mo95062A(new C25426v(new C23381x(this.f61072f)));
        C41536l.m120488h(A, "service.getMinimizedOnli…reDetailsMapper::convert)");
        return A;
    }

    /* renamed from: H */
    public C40734b mo59096H(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "id");
        return this.f61070d.mo63990H(bigDecimal);
    }

    /* renamed from: H0 */
    public C40762x mo59097H0() {
        C40762x A = this.f61070d.mo63991H0().mo95062A(new C25431y(new C23342d(this.f61079m)));
        C41536l.m120488h(A, "service\n            .che…  .map(gtMapper::convert)");
        return A;
    }

    /* renamed from: H2 */
    public C40762x mo59098H2(String str, int i, int i2) {
        C41536l.m120489i(str, "searchText");
        C40762x A = this.f61070d.mo64014y1(str, i, i2).mo95062A(new C25430x(new C23349g0(this.f61073g)));
        C41536l.m120488h(A, "service\n            .sea…rchResultMapper::convert)");
        return A;
    }

    /* renamed from: I */
    public C40762x mo59099I(String str) {
        C41536l.m120489i(str, "name");
        C40762x A = this.f61070d.mo63993I(str).mo95062A(new C25419r0(new C23346f(this)));
        C41536l.m120488h(A, "override fun createWatch…nvert(it)\n        }\n    }");
        return A;
    }

    /* renamed from: J */
    public C40762x mo59100J(String str, String str2, Double d, String str3, Double d2, int i) {
        C41536l.m120489i(str, "symbol");
        C41536l.m120489i(str2, "side");
        C41536l.m120489i(str3, "ccy");
        C40762x A = this.f61070d.mo63995J(str, str2, d, str3, d2, i).mo95062A(new C25384a(new C23340c(this.f61072f)));
        C41536l.m120488h(A, "service.calculateTradeDa…reDetailsMapper::convert)");
        return A;
    }

    /* renamed from: N2 */
    public String mo59101N2() {
        String str = (String) this.f61091y.get();
        return str == null ? ProductType.PRODUCT_STATUS_NEW : str;
    }

    /* renamed from: O0 */
    public C40762x mo59102O0(String str, boolean z) {
        C41536l.m120489i(str, "symbol");
        C41224m mVar = (C41224m) this.f61089w.get();
        if (mVar == null || !C41536l.m120484d(mVar.mo95678e(), str) || z) {
            C40762x k = this.f61070d.mo63997K1(str).mo95062A(new C25414p(new C23364m0(this.f61072f))).mo95084m(new C25416q(new C23366n0(this, str))).mo95082k(new C25418r(new C23368o0(this)));
            C41536l.m120488h(k, "override fun getSymbolOn…).second)\n        }\n    }");
            return k;
        }
        C40762x z2 = C40762x.m118162z(((C41224m) this.f61089w.get()).mo95680f());
        C41536l.m120488h(z2, "{\n            Single.jus…a.get().second)\n        }");
        return z2;
    }

    /* renamed from: P3 */
    public C40762x mo59103P3(C25192a aVar) {
        String str;
        C41536l.m120489i(aVar, "actionType");
        int i = C23338b.f61093a[aVar.ordinal()];
        if (i == 1) {
            str = "GT_TRANSFER_FROM_GT_ACCOUNT";
        } else if (i != 2) {
            str = "";
        } else {
            str = "GT_TRANSFER_TO_GT_ACCOUNT";
        }
        return this.f61070d.mo64016z1(str);
    }

    /* renamed from: Q0 */
    public C40762x mo59104Q0() {
        C40762x A = this.f61070d.mo63979A1().mo95062A(new C25392e(new C23365n(this.f61071e)));
        C41536l.m120488h(A, "service.getPortfolioClie…lioMapper::convertEquity)");
        return A;
    }

    /* renamed from: U1 */
    public C40762x mo59105U1() {
        C40762x A = this.f61070d.mo63979A1().mo95062A(new C25412o(new C23367o(this.f61071e)));
        C41536l.m120488h(A, "service\n            .get…portfolioMapper::convert)");
        return A;
    }

    /* renamed from: U3 */
    public C40762x mo59106U3(C25192a aVar) {
        C41536l.m120489i(aVar, "actionType");
        C40762x A = this.f61070d.mo63987F1(C25952b.m81596a(aVar).mo64868b()).mo95062A(new C25391d0(new C23357j(this.f61078l)));
        C41536l.m120488h(A, "service.getBuySellDefaul…tAmountMapper::transform)");
        return A;
    }

    /* renamed from: Z0 */
    public C40762x mo59107Z0(String str, boolean z, String str2, String str3) {
        String str4;
        C41536l.m120489i(str, "period");
        C41224m mVar = (C41224m) this.f61087u.get();
        if (mVar == null || !C41536l.m120484d(mVar.mo95678e(), str) || z) {
            C25429w0 w0Var = this.f61070d;
            if (str2 != null) {
                str4 = null;
            } else {
                str4 = str;
            }
            C40762x k = w0Var.mo63998L1(str2, str3, str4).mo95062A(new C25386b(new C23382y(this.f61071e))).mo95084m(new C25388c(new C23383z(this, str))).mo95082k(new C25390d(new C23337a0(this)));
            C41536l.m120488h(k, "override fun getPortfoli…).second)\n        }\n    }");
            return k;
        }
        C40762x z2 = C40762x.m118162z(((C41224m) this.f61087u.get()).mo95680f());
        C41536l.m120488h(z2, "{\n            Single.jus…t.get().second)\n        }");
        return z2;
    }

    public void clean() {
        this.f61080n = new AtomicBoolean(false);
        this.f61083q = new AtomicBoolean(false);
        this.f61081o = new AtomicBoolean(false);
        this.f61085s = new AtomicBoolean(false);
        this.f61082p.onComplete();
        C40765a i1 = C40765a.m118199i1(m75537S5());
        C41536l.m120488h(i1, "createDefault(getPortfolioObservable())");
        this.f61082p = i1;
        C40765a i12 = C40765a.m118199i1(m75611u5());
        C41536l.m120488h(i12, "createDefault(getCashDataInfoObservable())");
        this.f61084r = i12;
        this.f61086t.onComplete();
        C40765a i13 = C40765a.m118199i1(m75512F5());
        C41536l.m120488h(i13, "createDefault(getGTMarketInfoObservable())");
        this.f61086t = i13;
        this.f61087u.set((Object) null);
        this.f61088v.set((Object) null);
        this.f61089w.set((Object) null);
        this.f61091y.set((Object) null);
    }

    /* renamed from: f2 */
    public C40762x mo59108f2(boolean z) {
        boolean z2;
        String str = (String) this.f61091y.get();
        if (str == null || str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || z) {
            C40762x m = this.f61070d.getProductTypesList().mo95062A(new C25423t0(C23377t.f61123d)).mo95084m(new C25425u0(new C23378u(this)));
            C41536l.m120488h(m, "override fun getGTStatus…        }\n        }\n    }");
            return m;
        }
        C40762x z3 = C40762x.m118162z(str);
        C41536l.m120488h(z3, "{\n            Single.just(statusCache)\n        }");
        return z3;
    }

    /* renamed from: h2 */
    public C40762x mo59109h2(long j, Long l) {
        C40762x A = this.f61070d.mo63994I1(j, l, "day").mo95062A(new C25424u(new C23350h(this.f61076j)));
        C41536l.m120488h(A, "service\n            .get…countFileMapper::convert)");
        return A;
    }

    /* renamed from: o3 */
    public C40762x mo59110o3(String str, boolean z) {
        C41536l.m120489i(str, "symbol");
        C41224m mVar = (C41224m) this.f61088v.get();
        if (mVar == null || !C41536l.m120484d(mVar.mo95678e(), str) || z) {
            C40762x k = this.f61070d.mo64012x1(str).mo95062A(new C25400i(new C23358j0(this.f61072f))).mo95084m(new C25402j(new C23360k0(this, str))).mo95082k(new C25404k(new C23362l0(this)));
            C41536l.m120488h(k, "override fun getSymbolMe…).second)\n        }\n    }");
            return k;
        }
        C40762x z2 = C40762x.m118162z(((C41224m) this.f61088v.get()).mo95680f());
        C41536l.m120488h(z2, "{\n            Single.jus…a.get().second)\n        }");
        return z2;
    }

    /* renamed from: p3 */
    public C40734b mo59111p3(String str, List list, List list2) {
        String str2;
        C41536l.m120489i(str, "symbol");
        C25429w0 w0Var = this.f61070d;
        String str3 = null;
        if (list != null) {
            str2 = m75601q6(list);
        } else {
            str2 = null;
        }
        if (list2 != null) {
            str3 = m75601q6(list2);
        }
        return w0Var.mo64007v1(str2, str3, str);
    }

    /* renamed from: s1 */
    public C40762x mo59112s1(String str, String str2, Double d, String str3, Double d2, int i, String str4, String str5, String str6) {
        String str7 = str;
        C41536l.m120489i(str7, "symbol");
        String str8 = str2;
        C41536l.m120489i(str8, "side");
        String str9 = str3;
        C41536l.m120489i(str9, "ccy");
        C40762x m = this.f61070d.mo63989G1("MARKET", str7, str8, 0, d, str9, d2, "GTC", i, str4, str5, str6).mo95062A(new C25420s(C23374r0.f61120d)).mo95084m(new C25422t(new C23376s0(this)));
        C41536l.m120488h(m, "override fun tradeShare(…ata()\n            }\n    }");
        return m;
    }

    /* renamed from: u0 */
    public C40734b mo59113u0(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "id");
        C41536l.m120489i(str, "name");
        return this.f61070d.mo64005u1(str, bigDecimal);
    }

    /* renamed from: v0 */
    public C40734b mo59114v0() {
        return this.f61070d.mo64006v0();
    }

    /* renamed from: w */
    public C40762x mo59115w() {
        C40762x A = this.f61070d.mo64008w().mo95062A(new C25399h0(new C23372q0(this.f61075i)));
        C41536l.m120488h(A, "service\n            .get…watchListMapper::convert)");
        return A;
    }

    /* renamed from: w0 */
    public C40749p mo59116w0() {
        if (this.f61083q.compareAndSet(false, true)) {
            return m75587l6();
        }
        C40749p L0 = this.f61084r.mo94989L0(new C25421s0(C23359k.f61111d));
        C41536l.m120488h(L0, "{\n            cashDataIn…t\n            }\n        }");
        return L0;
    }

    /* renamed from: x0 */
    public C40734b mo59117x0() {
        return this.f61070d.mo64011x0();
    }

    /* renamed from: y0 */
    public C40762x mo59118y0() {
        C40762x A = this.f61070d.mo64013y0().mo95062A(new C25417q0(new C23369p(this.f61074h)));
        C41536l.m120488h(A, "service.getGTAccounts()\n…ccountsMapper::transform)");
        return A;
    }

    /* renamed from: y3 */
    public C40749p mo59119y3(boolean z) {
        if ((z || this.f61081o.compareAndSet(true, false)) && this.f61080n.compareAndSet(false, true)) {
            return m75598p6();
        }
        C40749p L0 = this.f61082p.mo94989L0(new C25428w(C23347f0.f61099d));
        C41536l.m120488h(L0, "{\n            portfolioO…t\n            }\n        }");
        return L0;
    }

    /* renamed from: z0 */
    public C40762x mo59120z0() {
        C40762x A = this.f61070d.mo64015z0().mo95062A(new C25385a0(new C23344e(this)));
        C41536l.m120488h(A, "override fun checkIdento…vert(dto)\n        }\n    }");
        return A;
    }

    /* renamed from: z2 */
    public C40762x mo59121z2() {
        MarketInfo marketInfo = (MarketInfo) this.f61090x.get();
        if (marketInfo == null) {
            C40762x m = this.f61070d.mo63983D1().mo95062A(new C25408m(new C23379v(this.f61077k))).mo95084m(new C25410n(new C23380w(this)));
            C41536l.m120488h(m, "override fun getMarketIn…enCached)\n        }\n    }");
            return m;
        }
        C40762x z = C40762x.m118162z(marketInfo);
        C41536l.m120488h(z, "{\n            Single.jus…etIsOpenCached)\n        }");
        return z;
    }
}
