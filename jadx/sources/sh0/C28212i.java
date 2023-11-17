package sh0;

import aa1.C30916h;
import aa1.C30934m;
import android.content.SharedPreferences;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import he1.C41238w;
import j51.C36735g;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m51.C37228a;
import p341ge.bog.mobilebank.giftcards.data.model.ClientGiftCardApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.ClientGiftCardsContainerApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.GiftCardNominationApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.GiftCardTransactionApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.GiftCardTransactionsApiModelContainer;
import p341ge.bog.mobilebank.giftcards.data.model.GiftCardsTransferAccountsApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.PhoneNumberValidationResultApiModel;
import ph0.C27532a;
import ph0.C27533b;
import rh0.C28034a;
import rh0.C28035b;
import rh0.C28036c;
import rh0.C28037d;
import rh0.C28038e;
import rh0.C28039f;
import rh0.C28041h;
import rh0.C28042i;
import rh0.C28043j;
import ue1.C43064a;
import ue1.C43075l;
import vh0.C29077c;
import vh0.C29078d;
import w41.C39517c;
import w41.C39520e;
import xh0.C29800p;

/* renamed from: sh0.i */
public final class C28212i implements C29077c, C39517c.C39518a {

    /* renamed from: s */
    public static final C28213a f71560s = new C28213a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C27532a f71561d;

    /* renamed from: e */
    private final C27533b f71562e;

    /* renamed from: f */
    private final C36735g f71563f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C28039f f71564g;

    /* renamed from: h */
    private final C28042i f71565h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C28036c f71566i;

    /* renamed from: j */
    private final C28041h f71567j;

    /* renamed from: k */
    private final C28038e f71568k;

    /* renamed from: l */
    private final C28037d f71569l;

    /* renamed from: m */
    private final C28043j f71570m;

    /* renamed from: n */
    private final C28034a f71571n;

    /* renamed from: o */
    private final C28035b f71572o;

    /* renamed from: p */
    private final C30916h f71573p;

    /* renamed from: q */
    private final SharedPreferences f71574q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final AtomicReference f71575r;

    /* renamed from: sh0.i$a */
    public static final class C28213a {
        private C28213a() {
        }

        public /* synthetic */ C28213a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: sh0.i$b */
    /* synthetic */ class C28214b extends C41535k implements C43075l {
        C28214b(Object obj) {
            super(1, obj, C28039f.class, "map", "map(Lge/bog/mobilebank/giftcards/data/model/GiftCardNominationApiModel;)Z", 0);
        }

        /* renamed from: b */
        public final Boolean invoke(GiftCardNominationApiModel giftCardNominationApiModel) {
            C41536l.m120489i(giftCardNominationApiModel, "p0");
            return Boolean.valueOf(((C28039f) this.receiver).mo67580c(giftCardNominationApiModel));
        }
    }

    /* renamed from: sh0.i$c */
    static final class C28215c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C28212i f71576d;

        /* renamed from: e */
        final /* synthetic */ String f71577e;

        /* renamed from: sh0.i$c$a */
        static final class C28216a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C28212i f71578d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C28216a(C28212i iVar) {
                super(1);
                this.f71578d = iVar;
            }

            /* renamed from: a */
            public final List invoke(ClientGiftCardsContainerApiModel clientGiftCardsContainerApiModel) {
                C41536l.m120489i(clientGiftCardsContainerApiModel, "clientGiftCardsContainer");
                C28036c j4 = this.f71578d.f71566i;
                List<ClientGiftCardApiModel> dto = clientGiftCardsContainerApiModel.getDto();
                if (dto == null) {
                    dto = C41341q.m119907j();
                }
                return j4.mo67576a(dto);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28215c(C28212i iVar, String str) {
            super(0);
            this.f71576d = iVar;
            this.f71577e = str;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40749p invoke() {
            C40749p O = this.f71576d.f71561d.mo66851S(this.f71577e).mo95062A(new C28224j(new C28216a(this.f71576d))).mo95075O();
            C41536l.m120488h(O, "override fun getClientGi…\n        }.unwrap()\n    }");
            return O;
        }
    }

    /* renamed from: sh0.i$d */
    static final class C28217d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28212i f71579d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28217d(C28212i iVar) {
            super(1);
            this.f71579d = iVar;
        }

        /* renamed from: a */
        public final List invoke(GiftCardTransactionsApiModelContainer giftCardTransactionsApiModelContainer) {
            C41536l.m120489i(giftCardTransactionsApiModelContainer, "container");
            C28039f k4 = this.f71579d.f71564g;
            List<GiftCardTransactionApiModel> dto = giftCardTransactionsApiModelContainer.getDto();
            if (dto == null) {
                dto = C41341q.m119907j();
            }
            return k4.mo67581f(dto);
        }
    }

    /* renamed from: sh0.i$e */
    /* synthetic */ class C28218e extends C41535k implements C43075l {
        C28218e(Object obj) {
            super(1, obj, C28035b.class, "convertExternalFiles", "convertExternalFiles(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C28035b) this.receiver).mo67575d(list);
        }
    }

    /* renamed from: sh0.i$f */
    /* synthetic */ class C28219f extends C41535k implements C43075l {
        C28219f(Object obj) {
            super(1, obj, C28042i.class, "map", "map(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C28042i) this.receiver).mo67584a(list);
        }
    }

    /* renamed from: sh0.i$g */
    /* synthetic */ class C28220g extends C41535k implements C43075l {
        C28220g(Object obj) {
            super(1, obj, C28039f.class, "map", "map(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C28039f) this.receiver).mo67579b(list);
        }
    }

    /* renamed from: sh0.i$h */
    static final class C28221h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28212i f71580d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28221h(C28212i iVar) {
            super(1);
            this.f71580d = iVar;
        }

        /* renamed from: a */
        public final void mo67742a(List list) {
            this.f71580d.f71575r.set(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo67742a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: sh0.i$i */
    /* synthetic */ class C28222i extends C41535k implements C43075l {
        C28222i(Object obj) {
            super(1, obj, C28041h.class, "transformAccounts", "transformAccounts(Lge/bog/mobilebank/giftcards/data/model/GiftCardsTransferAccountsApiModel;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(GiftCardsTransferAccountsApiModel giftCardsTransferAccountsApiModel) {
            C41536l.m120489i(giftCardsTransferAccountsApiModel, "p0");
            return ((C28041h) this.receiver).mo67583b(giftCardsTransferAccountsApiModel);
        }
    }

    /* renamed from: sh0.i$j */
    /* synthetic */ class C28223j extends C41535k implements C43075l {
        C28223j(Object obj) {
            super(1, obj, C28043j.class, "map", "map(Lge/bog/mobilebank/giftcards/data/model/PhoneNumberValidationResultApiModel;)Lge/bog/mobilebank/giftcards/domain/model/PhoneNumberValidationResult;", 0);
        }

        /* renamed from: b */
        public final C29800p invoke(PhoneNumberValidationResultApiModel phoneNumberValidationResultApiModel) {
            C41536l.m120489i(phoneNumberValidationResultApiModel, "p0");
            return ((C28043j) this.receiver).mo67585a(phoneNumberValidationResultApiModel);
        }
    }

    public C28212i(C27532a aVar, C27533b bVar, C36735g gVar, C28039f fVar, C28042i iVar, C28036c cVar, C28041h hVar, C28038e eVar, C28037d dVar, C28043j jVar, C28034a aVar2, C28035b bVar2, C30916h hVar2, SharedPreferences sharedPreferences) {
        C41536l.m120489i(aVar, "cardsApi");
        C41536l.m120489i(bVar, "transferAccountsApi");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(fVar, "giftCardsMapper");
        C41536l.m120489i(iVar, "lookupMapper");
        C41536l.m120489i(cVar, "clientGiftCardsMapper");
        C41536l.m120489i(hVar, "transferAccountsMapper");
        C41536l.m120489i(eVar, "purchaseMapper");
        C41536l.m120489i(dVar, "giveAwayMapper");
        C41536l.m120489i(jVar, "phoneNumberValidationMapper");
        C41536l.m120489i(aVar2, "allTypeGiftedCardsMapper");
        C41536l.m120489i(bVar2, "bffExternalFileMapper");
        C41536l.m120489i(hVar2, "clientGiftCardsStore");
        C41536l.m120489i(sharedPreferences, "sharedPreferences");
        this.f71561d = aVar;
        this.f71562e = bVar;
        this.f71563f = gVar;
        this.f71564g = fVar;
        this.f71565h = iVar;
        this.f71566i = cVar;
        this.f71567j = hVar;
        this.f71568k = eVar;
        this.f71569l = dVar;
        this.f71570m = jVar;
        this.f71571n = aVar2;
        this.f71572o = bVar2;
        this.f71573p = hVar2;
        this.f71574q = sharedPreferences;
        this.f71575r = new AtomicReference();
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public static final Boolean m86722l4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public static final List m86723m4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public static final List m86724n4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public static final List m86725p4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public static final List m86726q4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: r4 */
    public static final void m86727r4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public static final List m86728s4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public static final C29800p m86729t4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29800p) lVar.invoke(obj);
    }

    /* renamed from: B3 */
    public C40734b mo67721B3(Map map, C29078d dVar) {
        long j;
        String a;
        C41536l.m120489i(map, "headers");
        C41536l.m120489i(dVar, "request");
        C27532a aVar = this.f71561d;
        C28038e eVar = this.f71568k;
        C37228a a2 = this.f71563f.mo89562a();
        if (a2 == null || (a = a2.mo90304a()) == null) {
            j = -1;
        } else {
            j = Long.parseLong(a);
        }
        return aVar.mo66855W(map, eVar.mo67578a(dVar, j));
    }

    /* renamed from: G */
    public C40762x mo67722G(String str) {
        C41536l.m120489i(str, "lookupName");
        C40762x A = this.f71561d.mo66848G(str).mo95062A(new C28209f(new C28219f(this.f71565h)));
        C41536l.m120488h(A, "cardsApi.getLookupData(l…e).map(lookupMapper::map)");
        return A;
    }

    /* renamed from: P0 */
    public C40762x mo67723P0(boolean z) {
        if (z || this.f71575r.get() == null) {
            C40762x m = this.f71561d.mo66853U().mo95062A(new C28204a(new C28220g(this.f71564g))).mo95084m(new C28205b(new C28221h(this)));
            C41536l.m120488h(m, "override fun getMerchant…edCategories.get())\n    }");
            return m;
        }
        C40762x z2 = C40762x.m118162z(this.f71575r.get());
        C41536l.m120488h(z2, "just(cachedCategories.get())");
        return z2;
    }

    /* renamed from: R */
    public C40762x mo67724R(String str) {
        C41536l.m120489i(str, "nomination");
        C40762x A = this.f71561d.mo66850R(str).mo95062A(new C28211h(new C28214b(this.f71564g)));
        C41536l.m120488h(A, "cardsApi.checkGiftCardNo…map(giftCardsMapper::map)");
        return A;
    }

    /* renamed from: Y3 */
    public C40734b mo67725Y3(C29078d dVar) {
        long j;
        String a;
        C41536l.m120489i(dVar, "request");
        C27532a aVar = this.f71561d;
        C28037d dVar2 = this.f71569l;
        C37228a a2 = this.f71563f.mo89562a();
        if (a2 == null || (a = a2.mo90304a()) == null) {
            j = -1;
        } else {
            j = Long.parseLong(a);
        }
        return aVar.mo66854V(dVar2.mo67577a(dVar, j));
    }

    /* renamed from: a0 */
    public C40762x mo67726a0() {
        Long l;
        C27533b bVar = this.f71562e;
        C37228a a = this.f71563f.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        C40762x A = bVar.getTransferAccounts(String.valueOf(l)).mo95062A(new C28210g(new C28222i(this.f71567j)));
        C41536l.m120488h(A, "transferAccountsApi.getT…apper::transformAccounts)");
        return A;
    }

    public void clean() {
        this.f71573p.mo71133l();
        this.f71575r.set((Object) null);
    }

    public SharedPreferences getSharedPreferences() {
        return this.f71574q;
    }

    /* renamed from: i */
    public C40762x mo67727i(String str) {
        C41536l.m120489i(str, "fileType");
        C40762x A = this.f71561d.mo66856i(str).mo95062A(new C28207d(new C28218e(this.f71572o)));
        C41536l.m120488h(A, "cardsApi.getExternalFile…er::convertExternalFiles)");
        return A;
    }

    /* renamed from: j */
    public C40734b mo67728j(long j) {
        return this.f71561d.mo66857j(j);
    }

    /* renamed from: j3 */
    public C40749p mo67729j3(String str, boolean z) {
        C30916h.C30929h hVar;
        C41536l.m120489i(str, "clientKey");
        if (z) {
            hVar = C30916h.C30929h.LATEST;
        } else {
            hVar = C30916h.C30929h.NO_REFRESH;
        }
        return C30934m.m92180c(this.f71573p.mo71134o(hVar, new C28215c(this, str)));
    }

    /* renamed from: k */
    public C40762x mo67730k(String str) {
        C41536l.m120489i(str, "phoneNumber");
        C40762x A = this.f71561d.mo66858k(str).mo95062A(new C28206c(new C28223j(this.f71570m)));
        C41536l.m120488h(A, "cardsApi.validatePhoneNu…berValidationMapper::map)");
        return A;
    }

    /* renamed from: m3 */
    public void mo67731m3() {
        long j;
        C39520e eVar = C39520e.f93965a;
        C37228a a = this.f71563f.mo89562a();
        if (a != null) {
            j = a.mo90305b();
        } else {
            j = 0;
        }
        C39520e.m114861l(eVar, this, j, "PREFERENCE_KEY_HIDE_INTRO_PAGES", true, false, 8, (Object) null);
    }

    /* renamed from: p1 */
    public C40762x mo67732p1(String str, long j) {
        C41536l.m120489i(str, "clientKey");
        C40762x A = this.f71561d.mo66852T(j, str, 10000, 0).mo95062A(new C28208e(new C28217d(this)));
        C41536l.m120488h(A, "override fun getClientGi…ontainer.dto.orEmpty()) }");
        return A;
    }

    /* renamed from: w1 */
    public boolean mo67733w1() {
        long j;
        C39520e eVar = C39520e.f93965a;
        C37228a a = this.f71563f.mo89562a();
        if (a != null) {
            j = a.mo90305b();
        } else {
            j = 0;
        }
        return eVar.mo93156c(this, j, "PREFERENCE_KEY_HIDE_INTRO_PAGES", false);
    }

    /* renamed from: x */
    public C40734b mo67734x(long j) {
        return this.f71561d.mo66859x(j);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28212i(ph0.C27532a r17, ph0.C27533b r18, j51.C36735g r19, rh0.C28039f r20, rh0.C28042i r21, rh0.C28036c r22, rh0.C28041h r23, rh0.C28038e r24, rh0.C28037d r25, rh0.C28043j r26, rh0.C28035b r27, rh0.C28034a r28, android.content.SharedPreferences r29) {
        /*
            r16 = this;
            java.lang.String r0 = "cardsApi"
            r2 = r17
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            java.lang.String r0 = "transferAccountsApi"
            r3 = r18
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.lang.String r0 = "getLoginInfo"
            r4 = r19
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            java.lang.String r0 = "giftCardsMapper"
            r5 = r20
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            java.lang.String r0 = "lookupMapper"
            r6 = r21
            kotlin.jvm.internal.C41536l.m120489i(r6, r0)
            java.lang.String r0 = "clientGiftCardsMapper"
            r7 = r22
            kotlin.jvm.internal.C41536l.m120489i(r7, r0)
            java.lang.String r0 = "transferAccountsMapper"
            r8 = r23
            kotlin.jvm.internal.C41536l.m120489i(r8, r0)
            java.lang.String r0 = "purchaseMapper"
            r9 = r24
            kotlin.jvm.internal.C41536l.m120489i(r9, r0)
            java.lang.String r0 = "giveAwayMapper"
            r10 = r25
            kotlin.jvm.internal.C41536l.m120489i(r10, r0)
            java.lang.String r0 = "phoneNumberValidationMapper"
            r11 = r26
            kotlin.jvm.internal.C41536l.m120489i(r11, r0)
            java.lang.String r0 = "bffExternalFileMapper"
            r13 = r27
            kotlin.jvm.internal.C41536l.m120489i(r13, r0)
            java.lang.String r0 = "allTypeGiftedCardsMapper"
            r12 = r28
            kotlin.jvm.internal.C41536l.m120489i(r12, r0)
            java.lang.String r0 = "sharedPreferences"
            r15 = r29
            kotlin.jvm.internal.C41536l.m120489i(r15, r0)
            aa1.h r14 = new aa1.h
            r14.<init>()
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sh0.C28212i.<init>(ph0.a, ph0.b, j51.g, rh0.f, rh0.i, rh0.c, rh0.h, rh0.e, rh0.d, rh0.j, rh0.b, rh0.a, android.content.SharedPreferences):void");
    }
}
