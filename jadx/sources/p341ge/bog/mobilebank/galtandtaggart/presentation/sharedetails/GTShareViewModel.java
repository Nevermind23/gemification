package p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g31.C32054a;
import g41.C32081a;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41232r;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg0.C25976a0;
import lg0.C25978b0;
import lg0.C25980c0;
import lg0.C25982d0;
import lg0.C26007x;
import lg0.C26008y;
import lg0.C26009z;
import o31.C37595e;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p380ck.C10463g;
import p617ti.C17966a;
import ue1.C43075l;
import ue1.C43079p;
import ug0.C28775a;
import we0.C29323b;
import we0.C29326c0;
import we0.C29328d0;
import we0.C29330e0;
import we0.C29334g0;
import we0.C29343k0;
import we0.C29360s;
import xe0.C29751i;
import xe0.C29753k;
import xe0.C29754l;
import xe0.C29756n;
import xe0.C29757o;
import xe0.C29758p;
import xe0.C29759q;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel */
public interface GTShareViewModel {

    /* renamed from: a */
    public static final C23817a f61910a = C23817a.f61960a;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel */
    public static final class ViewModel extends C21481a implements C23819c, C23820d {

        /* renamed from: A */
        private final C1644x f61911A;

        /* renamed from: B */
        private final C1644x f61912B;

        /* renamed from: C */
        private final C1644x f61913C;

        /* renamed from: D */
        private final C1644x f61914D;

        /* renamed from: E */
        private final C1644x f61915E;

        /* renamed from: F */
        private final C1644x f61916F;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C29334g0 f61917d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C29330e0 f61918e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C29328d0 f61919f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final C29326c0 f61920g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final C29343k0 f61921h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final C29323b f61922i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final C29360s f61923j;

        /* renamed from: k */
        private final C23819c f61924k = this;

        /* renamed from: l */
        private final C23820d f61925l = this;

        /* renamed from: m */
        private final C40767b f61926m;

        /* renamed from: n */
        private final C40767b f61927n;

        /* renamed from: o */
        private final C40767b f61928o;

        /* renamed from: p */
        private final C40767b f61929p;

        /* renamed from: q */
        private final C40767b f61930q;

        /* renamed from: r */
        private final C1644x f61931r;

        /* renamed from: s */
        private final C1644x f61932s;

        /* renamed from: t */
        private final C1644x f61933t;

        /* renamed from: u */
        private final C1644x f61934u;

        /* renamed from: v */
        private final C1644x f61935v;

        /* renamed from: w */
        private final C1644x f61936w;

        /* renamed from: x */
        private final C1644x f61937x;

        /* renamed from: y */
        private final C1644x f61938y;

        /* renamed from: z */
        private final C1644x f61939z;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$a */
        static final class C23800a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ViewModel f61940d;

            /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$a$a */
            static final class C23801a extends C41537m implements C43079p {

                /* renamed from: d */
                final /* synthetic */ String f61941d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C23801a(String str) {
                    super(2);
                    this.f61941d = str;
                }

                /* renamed from: a */
                public final C29754l invoke(C29756n nVar, C29757o oVar) {
                    C41536l.m120489i(nVar, "metaData");
                    C41536l.m120489i(oVar, "onlineData");
                    String b = nVar.mo69857b();
                    BigDecimal d = oVar.mo69868d();
                    double c = oVar.mo69867c();
                    String d2 = nVar.mo69859d();
                    String str = this.f61941d;
                    return new C29754l(b, d, c, d2 + " (" + str + ")", nVar.mo69858c(), nVar.mo69856a(), nVar.mo69862f(), oVar.mo69865a(), nVar.mo69860e(), oVar.mo69866b());
                }
            }

            /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$a$b */
            static final class C23802b extends C41537m implements C43079p {

                /* renamed from: d */
                final /* synthetic */ ViewModel f61942d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C23802b(ViewModel viewModel) {
                    super(2);
                    this.f61942d = viewModel;
                }

                /* renamed from: a */
                public final C41224m invoke(C29754l lVar, C29751i iVar) {
                    C41536l.m120489i(lVar, "summery");
                    C41536l.m120489i(iVar, "overview");
                    if (C41536l.m120484d(this.f61942d.f61923j.mo69209a(), ProductType.PRODUCT_STATUS_APPROVED)) {
                        return new C41224m(lVar, iVar);
                    }
                    return new C41224m(lVar, C40749p.m118043h0(""));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23800a(ViewModel viewModel) {
                super(1);
                this.f61940d = viewModel;
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public static final C29754l m76921d(C43079p pVar, Object obj, Object obj2) {
                C41536l.m120489i(pVar, "$tmp0");
                return (C29754l) pVar.invoke(obj, obj2);
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public static final C41224m m76922e(C43079p pVar, Object obj, Object obj2) {
                C41536l.m120489i(pVar, "$tmp0");
                return (C41224m) pVar.invoke(obj, obj2);
            }

            /* renamed from: c */
            public final C40754t invoke(C41224m mVar) {
                boolean z;
                boolean z2;
                C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
                String str = (String) mVar.mo95675a();
                int intValue = ((Number) mVar.mo95676b()).intValue();
                C29330e0 tw = this.f61940d.f61918e;
                boolean z3 = false;
                if (intValue == 6 || intValue == 1) {
                    z = true;
                } else {
                    z = false;
                }
                C40762x a = tw.mo69186a(str, z);
                C29334g0 uw = this.f61940d.f61917d;
                if (intValue == 2 || intValue == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C40749p O = C40762x.m118154T(a, uw.mo69190a(str, z2), new C23821a(new C23801a(str))).mo95075O();
                C29326c0 sw = this.f61940d.f61920g;
                if (intValue == 2) {
                    z3 = true;
                }
                C40749p m = C40749p.m118048m(O, sw.mo69182a(z3), new C23822b(new C23802b(this.f61940d)));
                C41536l.m120488h(m, "@HiltViewModel\n    class…easeVal)\n        }\n\n    }");
                return C31270e.m92879h(m, intValue);
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$b */
        static final class C23803b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ViewModel f61943d;

            /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$b$a */
            static final class C23804a extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ ViewModel f61944d;

                /* renamed from: e */
                final /* synthetic */ C31128a f61945e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C23804a(ViewModel viewModel, C31128a aVar) {
                    super(1);
                    this.f61944d = viewModel;
                    this.f61945e = aVar;
                }

                /* renamed from: a */
                public final void mo60768a(C41224m mVar) {
                    this.f61944d.m76882xw(true);
                    this.f61944d.mo60756l0().mo4823o(new C31128a.C31130b(this.f61945e.mo71341b(), (Object) null, 2, (DefaultConstructorMarker) null));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo60768a((C41224m) obj);
                    return C41238w.f97225a;
                }
            }

            /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$b$b */
            static final class C23805b extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ ViewModel f61946d;

                /* renamed from: e */
                final /* synthetic */ C31128a f61947e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C23805b(ViewModel viewModel, C31128a aVar) {
                    super(1);
                    this.f61946d = viewModel;
                    this.f61947e = aVar;
                }

                /* renamed from: a */
                public final void mo60769a(C41224m mVar) {
                    boolean z;
                    C41224m mVar2;
                    boolean z2;
                    C29754l lVar = (C29754l) mVar.mo95675a();
                    Object b = mVar.mo95676b();
                    boolean z3 = false;
                    this.f61946d.m76882xw(false);
                    C1644x Dw = this.f61946d.mo60735G9();
                    if (lVar.mo69827b() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Dw.mo4823o(Boolean.valueOf(z));
                    this.f61946d.mo60759w9().mo4823o(lVar.mo69826a());
                    boolean z4 = b instanceof C29751i;
                    if (z4) {
                        Boolean bool = Boolean.TRUE;
                        if (lVar.mo69827b() != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        mVar2 = new C41224m(bool, Boolean.valueOf(z2));
                    } else {
                        Boolean bool2 = Boolean.FALSE;
                        mVar2 = new C41224m(bool2, bool2);
                    }
                    this.f61946d.mo60758lq().mo4823o(lVar.mo69837j());
                    this.f61946d.mo60752hn().mo4823o(mVar2);
                    if (z4) {
                        C1644x Aw = this.f61946d.mo60760x5();
                        BigDecimal a = ((C29751i) b).mo69801a();
                        BigDecimal valueOf = BigDecimal.valueOf(0);
                        C41536l.m120488h(valueOf, "valueOf(this.toLong())");
                        if (a.compareTo(valueOf) > 0) {
                            z3 = true;
                        }
                        Aw.mo4823o(Boolean.valueOf(z3));
                    }
                    this.f61946d.mo60756l0().mo4823o(new C31128a.C31131c(new C26007x(lVar.mo69833g(), C41339p.m119900e(new C17966a(lVar.mo69832f(), lVar.mo69828c())), lVar.mo69834h(), lVar.mo69830e()), this.f61947e.mo71341b()));
                    if (lVar.mo69827b() != null) {
                        this.f61946d.mo60757l9().mo4823o(new C41224m(lVar.mo69827b(), lVar.mo69828c()));
                    }
                    if (lVar.mo69829d() != null) {
                        this.f61946d.mo60737Ha().mo4823o(lVar.mo69829d());
                        this.f61946d.mo60754ji().mo4823o(Boolean.TRUE);
                    }
                    this.f61946d.mo60743Lw().mo4823o(lVar.mo69836i());
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo60769a((C41224m) obj);
                    return C41238w.f97225a;
                }
            }

            /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$b$c */
            static final class C23806c extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ ViewModel f61948d;

                /* renamed from: e */
                final /* synthetic */ C31128a f61949e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C23806c(ViewModel viewModel, C31128a aVar) {
                    super(1);
                    this.f61948d = viewModel;
                    this.f61949e = aVar;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C41238w.f97225a;
                }

                public final void invoke(Throwable th) {
                    C41536l.m120489i(th, "it");
                    this.f61948d.mo60756l0().mo4823o(new C31128a.C31129a(th, this.f61949e.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null));
                    if (this.f61949e.mo71341b() != 2) {
                        C1644x zw = this.f61948d.mo60752hn();
                        Boolean bool = Boolean.FALSE;
                        zw.mo4823o(new C41224m(bool, bool));
                        this.f61948d.mo60735G9().mo4823o(bool);
                        this.f61948d.mo60754ji().mo4823o(bool);
                    }
                    this.f61948d.m76882xw(false);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23803b(ViewModel viewModel) {
                super(1);
                this.f61943d = viewModel;
            }

            /* renamed from: a */
            public final void mo60767a(C31128a aVar) {
                C41536l.m120488h(aVar, "result");
                C31132b.m92646h(aVar, (int[]) null, new C23804a(this.f61943d, aVar), 1, (Object) null);
                C31132b.m92648j(aVar, (int[]) null, new C23805b(this.f61943d, aVar), 1, (Object) null);
                C31132b.m92643e(aVar, (int[]) null, new C23806c(this.f61943d, aVar), 1, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60767a((C31128a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$c */
        static final class C23807c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ViewModel f61950d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23807c(ViewModel viewModel) {
                super(1);
                this.f61950d = viewModel;
            }

            /* renamed from: a */
            public final C40754t invoke(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                C40749p O = this.f61950d.f61921h.mo69196a().mo95075O();
                C41536l.m120488h(O, "getWatchListsUseCase()\n …          .toObservable()");
                return C31270e.m92879h(O, 6);
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$d */
        static final class C23808d extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ViewModel f61951d;

            /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$d$a */
            static final class C23809a extends C41537m implements C43075l {

                /* renamed from: d */
                public static final C23809a f61952d = new C23809a();

                C23809a() {
                    super(1);
                }

                /* renamed from: a */
                public final C31128a invoke(Throwable th) {
                    C41536l.m120489i(th, "error");
                    return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23808d(ViewModel viewModel) {
                super(1);
                this.f61951d = viewModel;
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public static final C31128a m76931c(C43075l lVar, Object obj) {
                C41536l.m120489i(lVar, "$tmp0");
                return (C31128a) lVar.invoke(obj);
            }

            /* renamed from: b */
            public final C40754t invoke(C41232r rVar) {
                C41536l.m120489i(rVar, "<name for destructuring parameter 0>");
                return this.f61951d.f61922i.mo69179a((String) rVar.mo95688a(), (List) rVar.mo95689b(), (List) rVar.mo95690c()).mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C23823c(C23809a.f61952d));
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$e */
        static final class C23810e extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ViewModel f61953d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23810e(ViewModel viewModel) {
                super(1);
                this.f61953d = viewModel;
            }

            /* renamed from: a */
            public final C40754t invoke(C23818b bVar) {
                C41536l.m120489i(bVar, "params");
                C40749p O = this.f61953d.f61919f.mo69184a(bVar.mo60786f(), bVar.mo60784e(), bVar.mo60782c(), bVar.mo60781b(), bVar.mo60780a()).mo95075O();
                C41536l.m120488h(O, "getSymbolHistory(\n      …         ).toObservable()");
                return C31270e.m92879h(O, bVar.mo60783d());
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$f */
        static final class C23811f extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ViewModel f61954d;

            /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$f$a */
            static final class C23812a extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ ViewModel f61955d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C23812a(ViewModel viewModel) {
                    super(1);
                    this.f61955d = viewModel;
                }

                /* renamed from: a */
                public final void mo60776a(List list) {
                    this.f61955d.m76882xw(true);
                    this.f61955d.mo60751Wn().mo4823o(Boolean.TRUE);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo60776a((List) obj);
                    return C41238w.f97225a;
                }
            }

            /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$f$b */
            static final class C23813b extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ ViewModel f61956d;

                /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$f$b$a */
                public static final class C23814a implements Comparator {
                    public final int compare(Object obj, Object obj2) {
                        return C41506d.m120406e(((C29758p) obj).mo69873b(), ((C29758p) obj2).mo69873b());
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C23813b(ViewModel viewModel) {
                    super(1);
                    this.f61956d = viewModel;
                }

                /* renamed from: a */
                public final void mo60777a(List list) {
                    this.f61956d.mo60751Wn().mo4823o(Boolean.FALSE);
                    this.f61956d.m76882xw(false);
                    C1644x Mw = this.f61956d.mo60755jp();
                    C41536l.m120488h(list, "it");
                    List<C29758p> t0 = C41358y.m120030t0(list, new C23814a());
                    ArrayList arrayList = new ArrayList(C41343r.m119925u(t0, 10));
                    for (C29758p pVar : t0) {
                        Date b = pVar.mo69873b();
                        String bigDecimal = pVar.mo69872a().toString();
                        C41536l.m120488h(bigDecimal, "historyItem.close.toString()");
                        arrayList.add(new C29753k(b, bigDecimal));
                    }
                    Mw.mo4823o(arrayList);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo60777a((List) obj);
                    return C41238w.f97225a;
                }
            }

            /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$f$c */
            static final class C23815c extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ ViewModel f61957d;

                /* renamed from: e */
                final /* synthetic */ C31128a f61958e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C23815c(ViewModel viewModel, C31128a aVar) {
                    super(1);
                    this.f61957d = viewModel;
                    this.f61958e = aVar;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C41238w.f97225a;
                }

                public final void invoke(Throwable th) {
                    C41536l.m120489i(th, "it");
                    this.f61957d.m76882xw(false);
                    this.f61957d.mo60751Wn().mo4823o(Boolean.FALSE);
                    if (this.f61958e.mo71341b() != 2) {
                        this.f61957d.mo60755jp().mo4823o(C41341q.m119907j());
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23811f(ViewModel viewModel) {
                super(1);
                this.f61954d = viewModel;
            }

            /* renamed from: a */
            public final void mo60775a(C31128a aVar) {
                C41536l.m120488h(aVar, "result");
                C31132b.m92646h(aVar, (int[]) null, new C23812a(this.f61954d), 1, (Object) null);
                C31132b.m92648j(aVar, (int[]) null, new C23813b(this.f61954d), 1, (Object) null);
                C31132b.m92643e(aVar, (int[]) null, new C23815c(this.f61954d, aVar), 1, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60775a((C31128a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel$g */
        public /* synthetic */ class C23816g {

            /* renamed from: a */
            public static final /* synthetic */ int[] f61959a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    xe0.q[] r0 = xe0.C29759q.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    xe0.q r1 = xe0.C29759q.TO_ADD     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    xe0.q r1 = xe0.C29759q.TO_REMOVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f61959a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel.ViewModel.C23816g.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewModel(C29334g0 g0Var, C29330e0 e0Var, C29328d0 d0Var, C29326c0 c0Var, C29343k0 k0Var, C29323b bVar, C29360s sVar) {
            super((C41204a) null, 1, (DefaultConstructorMarker) null);
            C41536l.m120489i(g0Var, "getShareOnlineData");
            C41536l.m120489i(e0Var, "getShareMetaData");
            C41536l.m120489i(d0Var, "getSymbolHistory");
            C41536l.m120489i(c0Var, "getPortfolioOverview");
            C41536l.m120489i(k0Var, "getWatchListsUseCase");
            C41536l.m120489i(bVar, "changeSymbolWatchListsUseCase");
            C41536l.m120489i(sVar, "getGTKnownStatusUseCase");
            this.f61917d = g0Var;
            this.f61918e = e0Var;
            this.f61919f = d0Var;
            this.f61920g = c0Var;
            this.f61921h = k0Var;
            this.f61922i = bVar;
            this.f61923j = sVar;
            C40767b h1 = C40767b.m118210h1();
            C41536l.m120488h(h1, "create<Pair<String, Int>>()");
            this.f61926m = h1;
            C40767b h12 = C40767b.m118210h1();
            C41536l.m120488h(h12, "create<Pair<String, Int>>()");
            this.f61927n = h12;
            C40767b h13 = C40767b.m118210h1();
            C41536l.m120488h(h13, "create<HistoryParameters>()");
            this.f61928o = h13;
            C40767b h14 = C40767b.m118210h1();
            C41536l.m120488h(h14, "create<Unit>()");
            this.f61929p = h14;
            C40767b h15 = C40767b.m118210h1();
            C41536l.m120488h(h15, "create<Triple<String, Li…al>, List<BigDecimal>>>()");
            this.f61930q = h15;
            this.f61931r = new C1644x();
            this.f61932s = new C1644x();
            this.f61933t = new C1644x();
            this.f61934u = new C1644x();
            this.f61935v = new C1644x();
            this.f61936w = new C1644x();
            this.f61937x = new C1644x();
            this.f61938y = new C1644x();
            this.f61939z = new C1644x();
            this.f61911A = new C1644x();
            this.f61912B = new C1644x(C41341q.m119907j());
            this.f61913C = new C1644x();
            this.f61914D = new C1644x();
            this.f61915E = new C1644x();
            this.f61916F = new C1644x();
            C41205b F0 = C40749p.m118047l0(h1, h12).mo94989L0(new C26008y(new C23800a(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C26009z(new C23803b(this)));
            C41536l.m120488h(F0, "merge(\n                m…     }\n\n                }");
            bindToLifecycle(F0);
            C40749p o0 = h14.mo94989L0(new C25976a0(new C23807c(this))).mo95027o0(C40992a.m118827a());
            C41536l.m120488h(o0, "watchListSubject.switchM…dSchedulers.mainThread())");
            bindToLifecycle(C31270e.m92876e(o0, mo60747Ow()));
            C40749p o02 = h15.mo94989L0(new C25978b0(new C23808d(this))).mo95027o0(C40992a.m118827a());
            C41536l.m120488h(o02, "changeWatchListSymbolSub…dSchedulers.mainThread())");
            bindToLifecycle(C31270e.m92876e(o02, mo60728Au()));
            C41205b F02 = h13.mo94989L0(new C25980c0(new C23810e(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C25982d0(new C23811f(this)));
            C41536l.m120488h(F02, "symbolHistorySubject.swi…      }\n                }");
            bindToLifecycle(F02);
        }

        /* access modifiers changed from: private */
        /* renamed from: jw */
        public static final C40754t m76868jw(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40754t) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: kw */
        public static final void m76869kw(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: lw */
        public static final C40754t m76870lw(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40754t) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: mw */
        public static final C40754t m76871mw(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40754t) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: nw */
        public static final C40754t m76872nw(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40754t) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: ow */
        public static final void m76873ow(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: xw */
        public final void m76882xw(boolean z) {
            int i;
            Integer num = (Integer) mo60761yd().mo4814f();
            if (num == null) {
                num = Integer.valueOf(z ^ true ? 1 : 0);
            }
            int intValue = num.intValue();
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            mo60761yd().mo4823o(Integer.valueOf(intValue + i));
        }

        /* renamed from: Aw */
        public C1644x mo60760x5() {
            return this.f61915E;
        }

        /* renamed from: Bw */
        public C1644x mo60728Au() {
            return this.f61914D;
        }

        /* renamed from: Cw */
        public C1644x mo60757l9() {
            return this.f61938y;
        }

        /* renamed from: Dw */
        public C1644x mo60735G9() {
            return this.f61935v;
        }

        /* renamed from: Ew */
        public C1644x mo60737Ha() {
            return this.f61939z;
        }

        /* renamed from: Fw */
        public C1644x mo60754ji() {
            return this.f61911A;
        }

        /* renamed from: Gw */
        public C1644x mo60756l0() {
            return this.f61936w;
        }

        /* renamed from: Hw */
        public final C23819c mo60738Hw() {
            return this.f61924k;
        }

        /* renamed from: Iw */
        public final C23820d mo60739Iw() {
            return this.f61925l;
        }

        /* renamed from: Jw */
        public C1644x mo60761yd() {
            return this.f61933t;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: Kc */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo60741Kc(java.lang.String r11, java.lang.String r12, int r13) {
            /*
                r10 = this;
                java.lang.String r0 = "symbol"
                kotlin.jvm.internal.C41536l.m120489i(r11, r0)
                java.lang.String r0 = "period"
                kotlin.jvm.internal.C41536l.m120489i(r12, r0)
                java.util.List r0 = p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel.C23817a.f61963d
                java.util.Iterator r0 = r0.iterator()
            L_0x0012:
                boolean r1 = r0.hasNext()
                r2 = 0
                if (r1 == 0) goto L_0x0031
                java.lang.Object r1 = r0.next()
                r3 = r1
                he1.m r3 = (he1.C41224m) r3
                java.lang.Object r3 = r3.mo95678e()
                ug0.a$d r3 = (ug0.C28775a.C28782d) r3
                java.lang.String r3 = r3.mo68514b()
                boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r3, r12)
                if (r3 == 0) goto L_0x0012
                goto L_0x0032
            L_0x0031:
                r1 = r2
            L_0x0032:
                he1.m r1 = (he1.C41224m) r1
                if (r1 == 0) goto L_0x003e
                java.lang.Object r0 = r1.mo95680f()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r7 = r0
                goto L_0x003f
            L_0x003e:
                r7 = r2
            L_0x003f:
                ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$a r0 = p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel.f61910a
                he1.m r0 = r0.m76941d(r12)
                java.util.List r1 = p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel.C23817a.f61962c
                java.util.Iterator r1 = r1.iterator()
            L_0x004d:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x006b
                java.lang.Object r3 = r1.next()
                r4 = r3
                he1.m r4 = (he1.C41224m) r4
                java.lang.Object r4 = r4.mo95678e()
                ug0.a$d r4 = (ug0.C28775a.C28782d) r4
                java.lang.String r4 = r4.mo68514b()
                boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r12)
                if (r4 == 0) goto L_0x004d
                goto L_0x006c
            L_0x006b:
                r3 = r2
            L_0x006c:
                he1.m r3 = (he1.C41224m) r3
                if (r3 == 0) goto L_0x007b
                java.lang.Object r12 = r3.mo95680f()
                java.lang.Number r12 = (java.lang.Number) r12
                int r12 = r12.intValue()
                goto L_0x007c
            L_0x007b:
                r12 = 1
            L_0x007c:
                r8 = r12
                ee1.b r12 = r10.f61928o
                ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$b r1 = new ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$b
                if (r0 == 0) goto L_0x008b
                java.lang.Object r3 = r0.mo95678e()
                java.lang.String r3 = (java.lang.String) r3
                r5 = r3
                goto L_0x008c
            L_0x008b:
                r5 = r2
            L_0x008c:
                if (r0 == 0) goto L_0x0095
                java.lang.Object r0 = r0.mo95680f()
                r2 = r0
                java.lang.String r2 = (java.lang.String) r2
            L_0x0095:
                r6 = r2
                r3 = r1
                r4 = r11
                r9 = r13
                r3.<init>(r4, r5, r6, r7, r8, r9)
                r12.onNext(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel.ViewModel.mo60741Kc(java.lang.String, java.lang.String, int):void");
        }

        /* renamed from: Kw */
        public C1644x mo60758lq() {
            return this.f61916F;
        }

        /* renamed from: Lw */
        public C1644x mo60743Lw() {
            return this.f61912B;
        }

        /* renamed from: Mw */
        public C1644x mo60755jp() {
            return this.f61931r;
        }

        /* renamed from: Nw */
        public C1644x mo60751Wn() {
            return this.f61932s;
        }

        /* renamed from: O9 */
        public void mo60746O9(BigDecimal bigDecimal, String str, C29759q qVar) {
            C41536l.m120489i(bigDecimal, "watchListId");
            C41536l.m120489i(str, "shareSymbol");
            C41536l.m120489i(qVar, "state");
            int i = C23816g.f61959a[qVar.ordinal()];
            if (i == 1) {
                this.f61930q.onNext(new C41232r(str, C41341q.m119907j(), C41339p.m119900e(bigDecimal)));
            } else if (i == 2) {
                this.f61930q.onNext(new C41232r(str, C41339p.m119900e(bigDecimal), C41341q.m119907j()));
            }
        }

        /* renamed from: Ow */
        public C1644x mo60747Ow() {
            return this.f61913C;
        }

        /* renamed from: Pw */
        public void mo60748Pw(String str, int i) {
            C41536l.m120489i(str, "symbol");
            this.f61926m.onNext(C41233s.m119492a(str, Integer.valueOf(i)));
        }

        /* renamed from: Qw */
        public void mo60749Qw(String str, int i) {
            C41536l.m120489i(str, "symbol");
            this.f61927n.onNext(C41233s.m119492a(str, Integer.valueOf(i)));
        }

        /* renamed from: Rw */
        public void mo60750Rw() {
            this.f61929p.onNext(C41238w.f97225a);
        }

        /* renamed from: jb */
        public void mo60753jb(String str) {
            C41536l.m120489i(str, "symbol");
            C32054a.C32077w wVar = C32054a.C32077w.f78918f;
            C10463g F = C36546y.m108282F();
            C41536l.m120488h(F, "getAnalytics()");
            C32081a.m94499a(wVar, F, " ", str);
        }

        /* renamed from: yw */
        public C1644x mo60759w9() {
            return this.f61937x;
        }

        /* renamed from: zw */
        public C1644x mo60752hn() {
            return this.f61934u;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$a */
    public static final class C23817a {

        /* renamed from: a */
        static final /* synthetic */ C23817a f61960a = new C23817a();

        /* renamed from: b */
        private static final SimpleDateFormat f61961b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        /* access modifiers changed from: private */

        /* renamed from: c */
        public static final List f61962c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static final List f61963d;

        /* renamed from: e */
        private static final List f61964e;

        static {
            C28775a.C28782d dVar = C28775a.C28782d.DAY;
            C28775a.C28782d dVar2 = C28775a.C28782d.WEEK;
            C28775a.C28782d dVar3 = C28775a.C28782d.MONTH;
            C28775a.C28782d dVar4 = C28775a.C28782d.THREE_MONTHS;
            C28775a.C28782d dVar5 = C28775a.C28782d.SIX_MONTHS;
            C28775a.C28782d dVar6 = C28775a.C28782d.YEAR;
            C28775a.C28782d dVar7 = C28775a.C28782d.TWO_YEARS;
            C28775a.C28782d dVar8 = C28775a.C28782d.FIVE_YEARS;
            C28775a.C28782d dVar9 = C28775a.C28782d.ALL;
            f61962c = C41341q.m119910m(C41233s.m119492a(dVar, 1), C41233s.m119492a(dVar2, 8), C41233s.m119492a(dVar3, 9), C41233s.m119492a(dVar4, 9), C41233s.m119492a(dVar5, 10), C41233s.m119492a(dVar6, 10), C41233s.m119492a(dVar7, 10), C41233s.m119492a(dVar8, 10), C41233s.m119492a(dVar9, 10));
            f61963d = C41341q.m119910m(C41233s.m119492a(dVar, 1), C41233s.m119492a(dVar2, 7), C41233s.m119492a(dVar3, 30));
            f61964e = C41341q.m119910m(C41233s.m119492a(dVar4, 3), C41233s.m119492a(dVar5, 6), C41233s.m119492a(dVar6, 12), C41233s.m119492a(dVar7, 24), C41233s.m119492a(dVar8, 60), C41233s.m119492a(dVar9, 1200));
        }

        private C23817a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final C41224m m76941d(String str) {
            Object obj;
            Integer num;
            Iterator it = f61964e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((C28775a.C28782d) ((C41224m) obj).mo95678e()).mo68514b(), str)) {
                    break;
                }
            }
            C41224m mVar = (C41224m) obj;
            if (mVar != null) {
                num = (Integer) mVar.mo95680f();
            } else {
                num = null;
            }
            if (num == null) {
                return null;
            }
            Calendar instance = Calendar.getInstance();
            instance.add(2, num.intValue() * -1);
            Date time = instance.getTime();
            C41536l.m120488h(time, "getInstance().apply {\n  …                   }.time");
            return C41233s.m119492a(C37595e.m110568d(time), C37595e.m110568d(new Date()));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$b */
    public static final class C23818b {

        /* renamed from: a */
        private final String f61965a;

        /* renamed from: b */
        private final String f61966b;

        /* renamed from: c */
        private final String f61967c;

        /* renamed from: d */
        private final Integer f61968d;

        /* renamed from: e */
        private final int f61969e;

        /* renamed from: f */
        private final int f61970f;

        public C23818b(String str, String str2, String str3, Integer num, int i, int i2) {
            C41536l.m120489i(str, "symbol");
            this.f61965a = str;
            this.f61966b = str2;
            this.f61967c = str3;
            this.f61968d = num;
            this.f61969e = i;
            this.f61970f = i2;
        }

        /* renamed from: a */
        public final int mo60780a() {
            return this.f61969e;
        }

        /* renamed from: b */
        public final Integer mo60781b() {
            return this.f61968d;
        }

        /* renamed from: c */
        public final String mo60782c() {
            return this.f61967c;
        }

        /* renamed from: d */
        public final int mo60783d() {
            return this.f61970f;
        }

        /* renamed from: e */
        public final String mo60784e() {
            return this.f61966b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23818b)) {
                return false;
            }
            C23818b bVar = (C23818b) obj;
            return C41536l.m120484d(this.f61965a, bVar.f61965a) && C41536l.m120484d(this.f61966b, bVar.f61966b) && C41536l.m120484d(this.f61967c, bVar.f61967c) && C41536l.m120484d(this.f61968d, bVar.f61968d) && this.f61969e == bVar.f61969e && this.f61970f == bVar.f61970f;
        }

        /* renamed from: f */
        public final String mo60786f() {
            return this.f61965a;
        }

        public int hashCode() {
            int hashCode = this.f61965a.hashCode() * 31;
            String str = this.f61966b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f61967c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f61968d;
            if (num != null) {
                i = num.hashCode();
            }
            return ((((hashCode3 + i) * 31) + this.f61969e) * 31) + this.f61970f;
        }

        public String toString() {
            String str = this.f61965a;
            String str2 = this.f61966b;
            String str3 = this.f61967c;
            Integer num = this.f61968d;
            int i = this.f61969e;
            int i2 = this.f61970f;
            return "HistoryParameters(symbol=" + str + ", startDate=" + str2 + ", endDate=" + str3 + ", days=" + num + ", compression=" + i + ", requestCode=" + i2 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$c */
    public interface C23819c {
        /* renamed from: Kc */
        void mo60741Kc(String str, String str2, int i);

        /* renamed from: O9 */
        void mo60746O9(BigDecimal bigDecimal, String str, C29759q qVar);

        /* renamed from: jb */
        void mo60753jb(String str);
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$d */
    public interface C23820d {
        /* renamed from: Au */
        LiveData mo60728Au();

        /* renamed from: G9 */
        LiveData mo60735G9();

        /* renamed from: Ha */
        LiveData mo60737Ha();

        /* renamed from: Wn */
        LiveData mo60751Wn();

        /* renamed from: hn */
        LiveData mo60752hn();

        /* renamed from: ji */
        LiveData mo60754ji();

        /* renamed from: jp */
        LiveData mo60755jp();

        /* renamed from: l0 */
        LiveData mo60756l0();

        /* renamed from: l9 */
        LiveData mo60757l9();

        /* renamed from: lq */
        LiveData mo60758lq();

        /* renamed from: w9 */
        LiveData mo60759w9();

        /* renamed from: x5 */
        LiveData mo60760x5();

        /* renamed from: yd */
        LiveData mo60761yd();
    }
}
