package p341ge.bog.mobilebank.qrwithdrawal.presentation;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import de1.C40640a;
import e41.C31658b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40757w;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import j70.C25352k;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l01.C37046c;
import l01.C37048e;
import l01.C37056i;
import l01.C37057j;
import l01.C37058k;
import m01.C37193g;
import m01.C37194h;
import m01.C37195i;
import m41.C37223a;
import m41.C37224b;
import o01.C37575k;
import o01.C37576l;
import o01.C37577m;
import o01.C37578n;
import o01.C37579o;
import o01.C37580p;
import o01.C37581q;
import o01.C37582r;
import o01.C37583s;
import o01.C37584t;
import o70.C26762a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.qrwithdrawal.data.model.AtmApiModel;
import p341ge.bog.mobilebank.qrwithdrawal.data.model.InitiateWithdrawalParams;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.cardchooser.model.CardChooserData;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardData;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardExternalFileData;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.Details;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.QrResult;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10328q;
import p380ck.C10463g;
import p380ck.C10464h;
import p669xh.C18763a;
import pc0.C27494a;
import q01.C38098a;
import r01.C38272a;
import r01.C38273b;
import r01.C38275c;
import s01.C38402a;
import ty0.C38877m;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d */
public final class C34402d extends C21481a implements C37575k, C37576l {

    /* renamed from: A */
    private final C1644x f83362A;

    /* renamed from: B */
    private final C1644x f83363B;

    /* renamed from: C */
    private final C1644x f83364C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C37194h f83365D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public List f83366E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final C40767b f83367F;

    /* renamed from: G */
    private final C40767b f83368G;

    /* renamed from: H */
    private final C40767b f83369H;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f83370d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f83371e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C37056i f83372f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C37046c f83373g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C37048e f83374h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C38402a f83375i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C37058k f83376j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C38877m f83377k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C25352k f83378l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C27494a f83379m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C31658b f83380n;

    /* renamed from: o */
    private final C37057j f83381o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C10463g f83382p;

    /* renamed from: q */
    private final C37575k f83383q = this;

    /* renamed from: r */
    private final C37576l f83384r = this;

    /* renamed from: s */
    private C40757w f83385s;

    /* renamed from: t */
    private final C1644x f83386t;

    /* renamed from: u */
    private final C1644x f83387u;

    /* renamed from: v */
    private final C1644x f83388v;

    /* renamed from: w */
    private final C1644x f83389w;

    /* renamed from: x */
    private final C1644x f83390x;

    /* renamed from: y */
    private final C1644x f83391y;

    /* renamed from: z */
    private final C1644x f83392z;

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$a */
    static final class C34403a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34402d f83393d;

        /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$a$a */
        static final class C34404a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C34402d f83394d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34404a(C34402d dVar) {
                super(2);
                this.f83394d = dVar;
            }

            /* renamed from: a */
            public final C41224m invoke(List list, C37194h hVar) {
                C41536l.m120489i(list, "cards");
                C41536l.m120489i(hVar, "bills");
                this.f83394d.f83365D = hVar;
                this.f83394d.f83366E = list;
                return C41233s.m119492a(list, hVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34403a(C34402d dVar) {
            super(1);
            this.f83393d = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m101192c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p d1 = C40749p.m118037d1(this.f83393d.f83374h.mo89968d(), this.f83393d.f83373g.mo89967a(this.f83393d.f83371e, this.f83393d.f83370d).mo95075O(), new C34400c(new C34404a(this.f83393d)));
            C41536l.m120488h(d1, "class ViewModel @Assiste…ViewModel\n        }\n    }");
            return C31270e.m92879h(d1, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$b */
    static final class C34405b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34402d f83395d;

        /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$b$a */
        static final class C34406a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C34402d f83396d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34406a(C34402d dVar) {
                super(1);
                this.f83396d = dVar;
            }

            /* renamed from: a */
            public final void mo82925a(C41224m mVar) {
                List list = (List) mVar.mo95675a();
                C37194h hVar = (C37194h) mVar.mo95676b();
                C1644x Ow = this.f83396d.mo82911X0();
                Integer valueOf = Integer.valueOf(hVar.mo90240b());
                List<C37193g> c = hVar.mo90241c();
                ArrayList arrayList = new ArrayList(C41343r.m119925u(c, 10));
                for (C37193g b : c) {
                    arrayList.add(b.mo90235b());
                }
                Ow.mo4823o(C41233s.m119492a(valueOf, arrayList));
                C38402a Dw = this.f83396d.f83375i;
                C41536l.m120488h(list, "cards");
                C41536l.m120488h(hVar, "bills");
                C38272a b2 = Dw.mo91936b(list, hVar);
                C34402d dVar = this.f83396d;
                dVar.mo82915a().mo4823o(b2);
                CardData d = b2.mo91816d();
                if (d != null) {
                    dVar.f83367F.onNext(d.mo82957e());
                }
                this.f83396d.f83382p.mo27137H("qr_withdrawal_page", "page_loaded", (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82925a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$b$b */
        static final class C34407b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C34402d f83397d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34407b(C34402d dVar) {
                super(2);
                this.f83397d = dVar;
            }

            /* renamed from: a */
            public final void mo82926a(Throwable th, C41224m mVar) {
                ApiError apiError;
                BankApiResponse a;
                String errorValue;
                C41536l.m120489i(th, "error");
                C34402d dVar = this.f83397d;
                C38273b bVar = C38273b.ERROR_SCREEN;
                StringSource.Raw raw = null;
                if (th instanceof ApiError) {
                    apiError = (ApiError) th;
                } else {
                    apiError = null;
                }
                if (!(apiError == null || (a = apiError.mo84685a()) == null || (errorValue = a.getErrorValue()) == null)) {
                    raw = C34646b.m101749c(errorValue);
                }
                dVar.m101138Zw(bVar, raw);
                this.f83397d.f83382p.mo27137H("qr_withdrawal_page", "page_load_error", (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo82926a((Throwable) obj, (C41224m) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34405b(C34402d dVar) {
            super(1);
            this.f83395d = dVar;
        }

        /* renamed from: a */
        public final void mo82924a(C31128a aVar) {
            this.f83395d.mo82899M4().mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C34406a(this.f83395d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C34407b(this.f83395d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82924a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$c */
    static final class C34408c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34402d f83398d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34408c(C34402d dVar) {
            super(1);
            this.f83398d = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final List m101199c(Throwable th) {
            C41536l.m120489i(th, "it");
            return C41341q.m119907j();
        }

        /* renamed from: b */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "cardId");
            C40762x D = this.f83398d.f83372f.mo89973a(str).mo95065D(new C34425e());
            C41536l.m120488h(D, "getQrDailyLimit(\n       …rorReturn { emptyList() }");
            return C31270e.m92880i(D, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$d */
    static final class C34409d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34402d f83399d;

        /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$d$a */
        static final class C34410a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C34402d f83400d;

            /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$d$a$a */
            static final class C34411a extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ List f83401d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C34411a(List list) {
                    super(1);
                    this.f83401d = list;
                }

                /* renamed from: a */
                public final C38272a invoke(C38272a aVar) {
                    String str;
                    Object obj;
                    C41536l.m120489i(aVar, "uiState");
                    List list = this.f83401d;
                    C41536l.m120488h(list, "limits");
                    Iterator it = list.iterator();
                    while (true) {
                        str = null;
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (C41536l.m120484d(((C37195i) obj).mo90247b(), "ATM%")) {
                            break;
                        }
                    }
                    C37195i iVar = (C37195i) obj;
                    if (iVar != null) {
                        str = Integer.valueOf(iVar.mo90246a()).toString();
                    }
                    return C38272a.m112516b(aVar, (BigDecimal) null, (String) null, (List) null, str, (CardData) null, (C37223a) null, 55, (Object) null);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34410a(C34402d dVar) {
                super(1);
                this.f83400d = dVar;
            }

            /* renamed from: a */
            public final void mo82929a(List list) {
                C37224b.m109967f(this.f83400d.mo82915a(), new C34411a(list));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82929a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34409d(C34402d dVar) {
            super(1);
            this.f83399d = dVar;
        }

        /* renamed from: a */
        public final void mo82928a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C34410a(this.f83399d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82928a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$e */
    static final class C34412e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34402d f83402d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34412e(C34402d dVar) {
            super(1);
            this.f83402d = dVar;
        }

        /* renamed from: a */
        public final C40754t invoke(InitiateWithdrawalParams initiateWithdrawalParams) {
            C41536l.m120489i(initiateWithdrawalParams, "params");
            return C31270e.m92878g(this.f83402d.f83376j.mo89975a(this.f83402d.f83379m.mo66809a(initiateWithdrawalParams)), -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$f */
    static final class C34413f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34402d f83403d;

        /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$f$a */
        static final class C34414a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C34402d f83404d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34414a(C34402d dVar) {
                super(1);
                this.f83404d = dVar;
            }

            /* renamed from: a */
            public final void mo82933a(C41238w wVar) {
                String str;
                String str2;
                C41536l.m120489i(wVar, "it");
                this.f83404d.f83378l.invoke();
                C1644x Yw = this.f83404d.mo82895Ed();
                Details[] detailsArr = new Details[2];
                boolean z = false;
                detailsArr[0] = new Details("qr.atm.withdrawal.result.details.block.withdrawal.amount", C32343x.m95408P(this.f83404d.m101137Ww().mo91819f(), this.f83404d.m101137Ww().mo91820g()));
                CardData d = this.f83404d.m101137Ww().mo91816d();
                String str3 = null;
                if (d != null) {
                    str = d.mo82961h();
                } else {
                    str = null;
                }
                detailsArr[1] = new Details("qr.atm.withdrawal.result.details.block.card", "**** " + str);
                List m = C41341q.m119910m(detailsArr);
                CardData d2 = this.f83404d.m101137Ww().mo91816d();
                if (d2 != null && d2.mo82964j()) {
                    z = true;
                }
                Yw.mo4826r(C32343x.m95466m(new QrResult.Success(m, z)));
                C10463g tw = this.f83404d.f83382p;
                C37194h vw = this.f83404d.f83365D;
                if (vw != null) {
                    str2 = Integer.valueOf(vw.mo90240b()).toString();
                } else {
                    str2 = null;
                }
                CardData d3 = this.f83404d.m101137Ww().mo91816d();
                if (d3 != null) {
                    str3 = d3.mo82957e();
                }
                tw.mo27137H("qr_withdrawal_page", "withdraw_cash_button_click", "TimeLeft=" + str2 + ", cardId=" + str3 + ", ccy=" + this.f83404d.m101137Ww().mo91820g(), (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82933a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$f$b */
        static final class C34415b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C34402d f83405d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34415b(C34402d dVar) {
                super(2);
                this.f83405d = dVar;
            }

            /* renamed from: a */
            public final void mo82934a(Throwable th, C41238w wVar) {
                StringSource.Raw raw;
                C41536l.m120489i(th, "error");
                if (th instanceof ApiError) {
                    C34402d dVar = this.f83405d;
                    ApiError apiError = (ApiError) th;
                    C38273b a = C38273b.f91772e.mo91824a(apiError.mo84685a().getError());
                    String errorValue = apiError.mo84685a().getErrorValue();
                    if (errorValue != null) {
                        raw = C34646b.m101749c(errorValue);
                    } else {
                        raw = null;
                    }
                    dVar.m101138Zw(a, raw);
                    return;
                }
                C37224b.m109965d(this.f83405d.mo82895Ed(), new QrResult.Error(C34646b.m101750d(C10328q.f28955d2, new Object[0])));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo82934a((Throwable) obj, (C41238w) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34413f(C34402d dVar) {
            super(1);
            this.f83403d = dVar;
        }

        /* renamed from: a */
        public final void mo82932a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C34414a(this.f83403d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C34415b(this.f83403d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82932a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$g */
    static final class C34416g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34402d f83406d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34416g(C34402d dVar) {
            super(1);
            this.f83406d = dVar;
        }

        /* renamed from: a */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "cardId");
            return C31270e.m92880i(this.f83406d.f83377k.mo92576a(Long.parseLong(str)), -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$h */
    static final class C34417h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34402d f83407d;

        /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$h$a */
        static final class C34418a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C34402d f83408d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34418a(C34402d dVar) {
                super(1);
                this.f83408d = dVar;
            }

            /* renamed from: a */
            public final void mo82937a(C26762a aVar) {
                C41536l.m120489i(aVar, "statusModel");
                if (aVar.mo65980b()) {
                    C34402d dVar = this.f83408d;
                    List uw = dVar.f83366E;
                    C34402d dVar2 = this.f83408d;
                    ArrayList arrayList = new ArrayList(C41343r.m119925u(uw, 10));
                    Iterator it = uw.iterator();
                    while (true) {
                        String str = null;
                        if (it.hasNext()) {
                            CardUiModel cardUiModel = (CardUiModel) it.next();
                            String h = cardUiModel.mo82989h();
                            CardData d = dVar2.m101137Ww().mo91816d();
                            if (d != null) {
                                str = d.mo82957e();
                            }
                            if (C41536l.m120484d(h, str)) {
                                cardUiModel = CardUiModel.m101236b(cardUiModel, (String) null, (String) null, false, (String) null, 0, (String) null, (String) null, (C18763a) null, (CardExternalFileData) null, (CardExternalFileData) null, (List) null, (AvailableAmount) null, false, false, true, 16383, (Object) null);
                            }
                            arrayList.add(cardUiModel);
                        } else {
                            dVar.f83366E = arrayList;
                            C34402d.m101139ax(this.f83408d, (C38273b) null, C34646b.m101748b(C38098a.CARD_BLOCKED.mo91520b(), new Object[0]), 1, (Object) null);
                            this.f83408d.mo82918mu(false);
                            return;
                        }
                    }
                } else {
                    C34402d dVar3 = this.f83408d;
                    dVar3.bindToLifecycle(dVar3.f83380n.mo72084b(TMXFlags.TMX_FLAG_QR_WITHDRAWAL));
                    InitiateWithdrawalParams Qw = C34402d.m101136Qw(this.f83408d, (String) null, (String) null, (String) null, 7, (Object) null);
                    C37224b.m109965d(this.f83408d.mo82904R2(), C41233s.m119492a(Qw.getServiceId(), this.f83408d.f83379m.mo66809a(Qw)));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82937a((C26762a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$h$b */
        static final class C34419b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C34402d f83409d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34419b(C34402d dVar) {
                super(1);
                this.f83409d = dVar;
            }

            /* renamed from: a */
            public final void mo82938a(C26762a aVar) {
                this.f83409d.mo82918mu(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82938a((C26762a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$h$c */
        static final class C34420c extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C34402d f83410d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34420c(C34402d dVar) {
                super(2);
                this.f83410d = dVar;
            }

            /* renamed from: a */
            public final void mo82939a(Throwable th, C26762a aVar) {
                C41536l.m120489i(th, "<anonymous parameter 0>");
                this.f83410d.mo82918mu(false);
                C34402d.m101139ax(this.f83410d, (C38273b) null, (StringSource) null, 3, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo82939a((Throwable) obj, (C26762a) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34417h(C34402d dVar) {
            super(1);
            this.f83407d = dVar;
        }

        /* renamed from: a */
        public final void mo82936a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C34418a(this.f83407d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C34419b(this.f83407d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C34420c(this.f83407d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82936a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$i */
    public interface C34421i {
        /* renamed from: a */
        C34402d mo32551a(String str, String str2);
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$j */
    static final class C34422j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f83411d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34422j(String str) {
            super(1);
            this.f83411d = str;
        }

        /* renamed from: a */
        public final C38272a invoke(C38272a aVar) {
            BigDecimal bigDecimal;
            C41536l.m120489i(aVar, "it");
            try {
                String str = this.f83411d;
                C41536l.m120486f(str);
                bigDecimal = new BigDecimal(str);
            } catch (Throwable unused) {
                bigDecimal = BigDecimal.ZERO;
            }
            BigDecimal bigDecimal2 = bigDecimal;
            C41536l.m120488h(bigDecimal2, "try {\n                  …ERO\n                    }");
            return C38272a.m112516b(aVar, bigDecimal2, (String) null, (List) null, (String) null, (CardData) null, (C37223a) null, 62, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$k */
    static final class C34423k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34402d f83412d;

        /* renamed from: e */
        final /* synthetic */ CardUiModel f83413e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34423k(C34402d dVar, CardUiModel cardUiModel) {
            super(1);
            this.f83412d = dVar;
            this.f83413e = cardUiModel;
        }

        /* renamed from: a */
        public final C38272a invoke(C38272a aVar) {
            C41536l.m120489i(aVar, "it");
            return C38272a.m112516b(aVar, (BigDecimal) null, (String) null, (List) null, (String) null, this.f83412d.f83375i.mo91935a(this.f83413e), (C37223a) null, 47, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.d$l */
    static final class C34424l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f83414d;

        /* renamed from: e */
        final /* synthetic */ C37193g f83415e;

        /* renamed from: f */
        final /* synthetic */ AvailableAmount f83416f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34424l(String str, C37193g gVar, AvailableAmount availableAmount) {
            super(1);
            this.f83414d = str;
            this.f83415e = gVar;
            this.f83416f = availableAmount;
        }

        /* renamed from: a */
        public final C38272a invoke(C38272a aVar) {
            CardData cardData;
            String str;
            BigDecimal a;
            C41536l.m120489i(aVar, "uiState");
            String str2 = this.f83414d;
            List a2 = this.f83415e.mo90234a();
            CardData d = aVar.mo91816d();
            if (d != null) {
                AvailableAmount availableAmount = this.f83416f;
                if (availableAmount == null || (a = availableAmount.mo82943a()) == null || (str = C32343x.m95408P(a, this.f83416f.mo82944b())) == null) {
                    str = aVar.mo91816d().mo82955d();
                }
                cardData = CardData.m101221b(d, (String) null, (Integer) null, (String) null, str, false, (String) null, (String) null, false, 247, (Object) null);
            } else {
                cardData = null;
            }
            return C38272a.m112516b(aVar, (BigDecimal) null, str2, a2, (String) null, cardData, (C37223a) null, 41, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34402d(String str, String str2, C37056i iVar, C37046c cVar, C37048e eVar, C38402a aVar, C37058k kVar, C38877m mVar, C25352k kVar2, C27494a aVar2, C31658b bVar, C37057j jVar, C10463g gVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "ed");
        C41536l.m120489i(str2, "aid");
        C41536l.m120489i(iVar, "getQrDailyLimit");
        C41536l.m120489i(cVar, "getAvailableBills");
        C41536l.m120489i(eVar, "getCardsInfoUseCase");
        C41536l.m120489i(aVar, "qrWithdrawalUiMapper");
        C41536l.m120489i(kVar, "initiateWithdrawalUseCase");
        C41536l.m120489i(mVar, "isCardBlocked");
        C41536l.m120489i(kVar2, "reloadProductsUseCase");
        C41536l.m120489i(aVar2, "otpParamsBuilder");
        C41536l.m120489i(bVar, "startTMXProfilingUseCase");
        C41536l.m120489i(jVar, "getTmxSessionId");
        C41536l.m120489i(gVar, "analytics");
        this.f83370d = str;
        this.f83371e = str2;
        this.f83372f = iVar;
        this.f83373g = cVar;
        this.f83374h = eVar;
        this.f83375i = aVar;
        this.f83376j = kVar;
        this.f83377k = mVar;
        this.f83378l = kVar2;
        this.f83379m = aVar2;
        this.f83380n = bVar;
        this.f83381o = jVar;
        this.f83382p = gVar;
        C40757w b = C40640a.m117458b();
        C41536l.m120488h(b, "io()");
        this.f83385s = b;
        this.f83386t = new C1644x();
        this.f83387u = new C1644x();
        this.f83388v = new C1644x();
        this.f83389w = new C1644x();
        this.f83390x = new C1644x();
        this.f83391y = new C1644x();
        this.f83392z = new C1644x();
        this.f83362A = new C1644x();
        this.f83363B = new C1644x();
        this.f83364C = new C1644x();
        this.f83366E = C41341q.m119907j();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f83367F = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<InitiateWithdrawalParams>()");
        this.f83368G = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<String>()");
        this.f83369H = h13;
        C40749p J0 = C40749p.m118047l0(onRefresh(), onInit()).mo94989L0(new C37577m(new C34403a(this))).mo94987J0(this.f83385s);
        C41536l.m120488h(J0, "merge(onRefresh(), onIni…eOn(subscribeOnScheduler)");
        C41205b F0 = C32343x.m95413R0(J0).mo94981F0(new C37578n(new C34405b(this)));
        C41536l.m120488h(F0, "merge(onRefresh(), onIni…      }\n                }");
        bindToLifecycle(F0);
        C40749p L0 = h1.mo94989L0(new C37579o(new C34408c(this)));
        C41536l.m120488h(L0, "dailyLimitSubject.switch…QUEST_CODE)\n            }");
        C41205b F02 = C32343x.m95413R0(L0).mo94981F0(new C37580p(new C34409d(this)));
        C41536l.m120488h(F02, "dailyLimitSubject.switch…          }\n            }");
        bindToLifecycle(F02);
        C40749p L02 = h12.mo94989L0(new C37581q(new C34412e(this)));
        C41536l.m120488h(L02, "initiateWithdrawalSubjec…QUEST_CODE)\n            }");
        C41205b F03 = C32343x.m95413R0(L02).mo94981F0(new C37582r(new C34413f(this)));
        C41536l.m120488h(F03, "initiateWithdrawalSubjec…          }\n            }");
        bindToLifecycle(F03);
        C40749p L03 = h13.mo94989L0(new C37583s(new C34416g(this)));
        C41536l.m120488h(L03, "isCardBlockedSubject.swi…QUEST_CODE)\n            }");
        C41205b F04 = C32343x.m95413R0(L03).mo94981F0(new C37584t(new C34417h(this)));
        C41536l.m120488h(F04, "isCardBlockedSubject.swi…          }\n            }");
        bindToLifecycle(F04);
    }

    /* renamed from: Pw */
    private final InitiateWithdrawalParams m101135Pw(String str, String str2, String str3) {
        String str4;
        String str5;
        AtmApiModel a;
        String str6 = this.f83371e;
        String str7 = this.f83370d;
        String bigDecimal = m101137Ww().mo91819f().toString();
        String g = m101137Ww().mo91820g();
        CardData d = m101137Ww().mo91816d();
        String str8 = null;
        if (d != null) {
            str4 = d.mo82957e();
        } else {
            str4 = null;
        }
        C41536l.m120486f(str4);
        C37194h hVar = this.f83365D;
        if (hVar != null) {
            str5 = hVar.mo90242d();
        } else {
            str5 = null;
        }
        String a2 = this.f83381o.mo89974a();
        C37194h hVar2 = this.f83365D;
        if (!(hVar2 == null || (a = hVar2.mo90239a()) == null)) {
            str8 = C32343x.m95471n1(a);
        }
        C41536l.m120488h(bigDecimal, "toString()");
        return new InitiateWithdrawalParams(str6, str7, bigDecimal, g, str8, str4, str5, a2, (String) null, (String) null, str, str2, str3, 768, (DefaultConstructorMarker) null);
    }

    /* renamed from: Qw */
    static /* synthetic */ InitiateWithdrawalParams m101136Qw(C34402d dVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return dVar.m101135Pw(str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ww */
    public final C38272a m101137Ww() {
        Object f = mo82915a().mo4814f();
        C41536l.m120486f(f);
        return (C38272a) f;
    }

    /* access modifiers changed from: private */
    /* renamed from: Zw */
    public final void m101138Zw(C38273b bVar, StringSource stringSource) {
        mo82920x0().mo4826r(new C38275c(bVar, stringSource));
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ax */
    static /* synthetic */ void m101139ax(C34402d dVar, C38273b bVar, StringSource stringSource, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = C38273b.BANNER;
        }
        if ((i & 2) != 0) {
            stringSource = null;
        }
        dVar.m101138Zw(bVar, stringSource);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final C40754t m101148lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m101149mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final C40754t m101150nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m101151ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final C40754t m101152pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final C40754t m101153qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m101154rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Gi */
    public void mo82896Gi(CardUiModel cardUiModel) {
        C41536l.m120489i(cardUiModel, "card");
        this.f83367F.onNext(cardUiModel.mo82989h());
        C37224b.m109967f(mo82915a(), new C34423k(this, cardUiModel));
    }

    /* renamed from: Lw */
    public C1644x mo82921x1() {
        return this.f83363B;
    }

    /* renamed from: Mw */
    public C1644x mo82894Cp() {
        return this.f83391y;
    }

    /* renamed from: Nw */
    public C1644x mo82920x0() {
        return this.f83362A;
    }

    /* renamed from: Ow */
    public C1644x mo82911X0() {
        return this.f83389w;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: m01.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Qv */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo82903Qv(java.lang.String r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            java.lang.String r2 = "ccy"
            kotlin.jvm.internal.C41536l.m120489i(r1, r2)
            java.util.List r2 = r0.f83366E
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = ie1.C41343r.m119925u(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x001a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0076
            java.lang.Object r4 = r2.next()
            r6 = r4
            ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel r6 = (p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel) r6
            java.util.List r4 = r6.mo82983d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0030:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0048
            java.lang.Object r7 = r4.next()
            r8 = r7
            ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount r8 = (p341ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount) r8
            java.lang.String r8 = r8.mo82944b()
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r8, r1)
            if (r8 == 0) goto L_0x0030
            r5 = r7
        L_0x0048:
            ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount r5 = (p341ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount) r5
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            if (r5 != 0) goto L_0x0062
            ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount r4 = r6.mo82991i()
            r19 = r4
            goto L_0x0064
        L_0x0062:
            r19 = r5
        L_0x0064:
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 30719(0x77ff, float:4.3046E-41)
            r24 = 0
            ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel r4 = p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel.m101236b(r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r3.add(r4)
            goto L_0x001a
        L_0x0076:
            r0.f83366E = r3
            java.util.Iterator r2 = r3.iterator()
        L_0x007c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00a4
            java.lang.Object r3 = r2.next()
            r4 = r3
            ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel r4 = (p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel) r4
            java.lang.String r4 = r4.mo82989h()
            r01.a r6 = r25.m101137Ww()
            ge.bog.mobilebank.qrwithdrawal.presentation.model.CardData r6 = r6.mo91816d()
            if (r6 == 0) goto L_0x009c
            java.lang.String r6 = r6.mo82957e()
            goto L_0x009d
        L_0x009c:
            r6 = r5
        L_0x009d:
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r6)
            if (r4 == 0) goto L_0x007c
            goto L_0x00a5
        L_0x00a4:
            r3 = r5
        L_0x00a5:
            ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel r3 = (p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel) r3
            if (r3 == 0) goto L_0x00ae
            ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount r2 = r3.mo82991i()
            goto L_0x00af
        L_0x00ae:
            r2 = r5
        L_0x00af:
            m01.h r3 = r0.f83365D
            if (r3 == 0) goto L_0x00e5
            java.util.List r3 = r3.mo90241c()
            if (r3 == 0) goto L_0x00e5
            java.util.Iterator r3 = r3.iterator()
        L_0x00bd:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00d5
            java.lang.Object r4 = r3.next()
            r6 = r4
            m01.g r6 = (m01.C37193g) r6
            java.lang.String r6 = r6.mo90235b()
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r1)
            if (r6 == 0) goto L_0x00bd
            r5 = r4
        L_0x00d5:
            m01.g r5 = (m01.C37193g) r5
            if (r5 == 0) goto L_0x00e5
            androidx.lifecycle.x r3 = r25.mo82915a()
            ge.bog.mobilebank.qrwithdrawal.presentation.d$l r4 = new ge.bog.mobilebank.qrwithdrawal.presentation.d$l
            r4.<init>(r1, r5, r2)
            m41.C37224b.m109967f(r3, r4)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.qrwithdrawal.presentation.C34402d.mo82903Qv(java.lang.String):void");
    }

    /* renamed from: Rw */
    public final C37575k mo82905Rw() {
        return this.f83383q;
    }

    /* renamed from: S8 */
    public void mo82906S8() {
        mo82897Ka().mo4823o(C41238w.f97225a);
        this.f83382p.mo27137H("qr_withdrawal_page", "timeout_dialog_box", (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }

    /* renamed from: Sw */
    public final C37576l mo82907Sw() {
        return this.f83384r;
    }

    /* renamed from: Tw */
    public C1644x mo82899M4() {
        return this.f83386t;
    }

    /* renamed from: Uw */
    public C1644x mo82897Ka() {
        return this.f83390x;
    }

    /* renamed from: Vw */
    public C1644x mo82904R2() {
        return this.f83392z;
    }

    /* renamed from: Xw */
    public C1644x mo82915a() {
        return this.f83387u;
    }

    /* renamed from: Yw */
    public C1644x mo82895Ed() {
        return this.f83364C;
    }

    /* renamed from: Ze */
    public void mo82914Ze() {
        String str;
        C1644x Mw = mo82894Cp();
        List list = this.f83366E;
        String g = m101137Ww().mo91820g();
        BigDecimal f = m101137Ww().mo91819f();
        CardData d = m101137Ww().mo91816d();
        if (d == null || (str = d.mo82957e()) == null) {
            str = "";
        }
        C37224b.m109965d(Mw, new CardChooserData(list, f, g, str));
    }

    /* renamed from: bv */
    public void mo82916bv(String str, String str2, String str3) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        this.f83368G.onNext(m101135Pw(str, str2, str3));
    }

    /* renamed from: d */
    public void mo82917d(String str) {
        C37224b.m109967f(mo82915a(), new C34422j(str));
    }

    /* renamed from: mu */
    public void mo82918mu(boolean z) {
        mo82921x1().mo4826r(Boolean.valueOf(z));
    }

    /* renamed from: pt */
    public void mo82919pt() {
        Object obj;
        AvailableAmount availableAmount;
        String str;
        BigDecimal bigDecimal;
        boolean z;
        String str2;
        StringSource.Dictionary dictionary;
        String str3;
        Iterator it = this.f83366E.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String h = ((CardUiModel) obj).mo82989h();
            CardData d = m101137Ww().mo91816d();
            if (d != null) {
                str3 = d.mo82957e();
            } else {
                str3 = null;
            }
            if (C41536l.m120484d(h, str3)) {
                break;
            }
        }
        CardUiModel cardUiModel = (CardUiModel) obj;
        if (cardUiModel != null) {
            availableAmount = cardUiModel.mo82991i();
        } else {
            availableAmount = null;
        }
        CardData d2 = m101137Ww().mo91816d();
        if (d2 != null) {
            str = d2.mo82957e();
        } else {
            str = null;
        }
        if (str == null) {
            mo82914Ze();
            return;
        }
        BigDecimal f = m101137Ww().mo91819f();
        if (availableAmount != null) {
            bigDecimal = availableAmount.mo82943a();
        } else {
            bigDecimal = null;
        }
        if (f.compareTo(bigDecimal) > 0) {
            if (availableAmount != null) {
                str2 = availableAmount.mo82944b();
            } else {
                str2 = null;
            }
            if (C41536l.m120484d(str2, m101137Ww().mo91820g())) {
                C38273b bVar = C38273b.BANNER;
                if (this.f83366E.size() == 1) {
                    dictionary = C34646b.m101748b(C38098a.INSUFFICIENT_FUNDS_SINGLE_CARD.mo91520b(), new Object[0]);
                } else {
                    dictionary = C34646b.m101748b(C38098a.INSUFFICIENT_FUNDS.mo91520b(), new Object[0]);
                }
                m101138Zw(bVar, dictionary);
                return;
            }
        }
        List c = m101137Ww().mo91815c();
        if (!(c instanceof Collection) || !c.isEmpty()) {
            Iterator it2 = c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                int intValue = ((Number) it2.next()).intValue();
                BigDecimal f2 = m101137Ww().mo91819f();
                BigDecimal valueOf = BigDecimal.valueOf((long) intValue);
                C41536l.m120488h(valueOf, "valueOf(this.toLong())");
                BigDecimal remainder = f2.remainder(valueOf);
                C41536l.m120488h(remainder, "this.remainder(other)");
                if (C41536l.m120484d(remainder, new BigDecimal(0))) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            this.f83382p.mo27137H("qr_withdrawal_page", "available_banknotes_error", (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
            m101139ax(this, (C38273b) null, C34646b.m101748b("qr.atm.withdrawal.page.banknotes.unavailable", new Object[0]), 1, (Object) null);
            return;
        }
        this.f83369H.onNext(str);
    }
}
