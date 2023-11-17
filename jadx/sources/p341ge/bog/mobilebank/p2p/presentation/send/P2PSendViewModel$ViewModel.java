package p341ge.bog.mobilebank.p2p.presentation.send;

import android.database.Cursor;
import android.os.Bundle;
import androidx.lifecycle.C1644x;
import aw0.C31086a;
import aw0.C31087b;
import aw0.C31089d;
import aw0.C31090e;
import aw0.C31091f;
import aw0.C31092g;
import aw0.C31094i;
import b41.C31128a;
import b41.C31132b;
import bw0.C31208a;
import bw0.C31209b;
import bw0.C31210c;
import bw0.C31213f;
import c41.C31270e;
import com.github.mikephil.charting.utils.Utils;
import e41.C31658b;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import hw0.C36250h;
import hw0.C36251i;
import hw0.C36252j;
import hw0.C36253k;
import hw0.C36254l;
import hw0.C36255m;
import hw0.C36256n;
import hw0.C36257o;
import hw0.C36258p;
import hw0.C36259q;
import iw0.C36560a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jw0.C36804a;
import jw0.C36805b;
import jw0.C36806c;
import jw0.C36807d;
import jw0.C36808e;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.p2p.domain.customexceptions.AmountException;
import p341ge.bog.mobilebank.p2p.domain.customexceptions.CardsException;
import p341ge.bog.mobilebank.p2p.domain.customexceptions.DestinationException;
import p341ge.bog.mobilebank.p2p.domain.customexceptions.PhoneNumberException;
import p341ge.bog.mobilebank.p2p.domain.model.MoneyTransferResponse;
import p341ge.bog.mobilebank.p2p.presentation.send.model.TransferDetailsParams;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p380ck.C10464h;
import pc0.C27494a;
import ue1.C43075l;
import x31.C39778a;
import y31.C40019a;

/* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel */
public final class P2PSendViewModel$ViewModel extends C21481a implements C33536c, C36250h {

    /* renamed from: A */
    private final C1644x f81760A = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f81761B = true;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f81762C;

    /* renamed from: D */
    private final C40767b f81763D;

    /* renamed from: E */
    private final C40767b f81764E;

    /* renamed from: d */
    private final C39778a f81765d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C36560a f81766e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C31086a f81767f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C31091f f81768g;

    /* renamed from: h */
    private final C31094i f81769h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C31087b f81770i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C31090e f81771j;

    /* renamed from: k */
    private final C31658b f81772k;

    /* renamed from: l */
    private final C27494a f81773l;

    /* renamed from: m */
    private final C31092g f81774m;

    /* renamed from: n */
    private final C33536c f81775n = this;

    /* renamed from: o */
    private final C36250h f81776o = this;

    /* renamed from: p */
    private final C1644x f81777p = new C1644x();

    /* renamed from: q */
    private final C1644x f81778q = new C1644x();

    /* renamed from: r */
    private final C1644x f81779r = new C1644x();

    /* renamed from: s */
    private final C1644x f81780s = new C1644x();

    /* renamed from: t */
    private final C1644x f81781t = new C1644x();

    /* renamed from: u */
    private final C1644x f81782u = new C1644x();

    /* renamed from: v */
    private final C1644x f81783v = new C1644x(new C36808e((String) null, (String) null, (String) null, false, false, 31, (DefaultConstructorMarker) null));

    /* renamed from: w */
    private final C1644x f81784w = new C1644x(C41341q.m119907j());

    /* renamed from: x */
    private final C1644x f81785x = new C1644x(new C36804a((Double) null, (C31210c) null, (Integer) null, (String) null, false, false, 63, (DefaultConstructorMarker) null));

    /* renamed from: y */
    private final C1644x f81786y = new C1644x(new C36807d((String) null, (String) null, 3, (DefaultConstructorMarker) null));

    /* renamed from: z */
    private final C1644x f81787z = new C1644x(new C36805b((String) null, false, 3, (DefaultConstructorMarker) null));

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$a */
    static final class C33514a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendViewModel$ViewModel f81788d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33514a(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
            super(1);
            this.f81788d = p2PSendViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            return C31270e.m92880i(this.f81788d.f81768g.mo71292a(C31213f.TRANSFER), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$b */
    static final class C33515b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendViewModel$ViewModel f81789d;

        /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$b$a */
        static final class C33516a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PSendViewModel$ViewModel f81790d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33516a(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
                super(1);
                this.f81790d = p2PSendViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo79501a(List list) {
                Object obj;
                C36806c cVar;
                C41536l.m120489i(list, "cards");
                if (!list.isEmpty()) {
                    this.f81790d.f81761B = false;
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((C31209b) obj).mo71445l()) {
                            break;
                        }
                    }
                    C31209b bVar = (C31209b) obj;
                    if (bVar == null || (cVar = C36560a.m108403b(this.f81790d.f81766e, bVar, list.indexOf(bVar), false, 4, (Object) null)) == null) {
                        cVar = C36560a.m108403b(this.f81790d.f81766e, (C31209b) list.get(0), 0, false, 4, (Object) null);
                    }
                    this.f81790d.mo79488c2().mo4826r(cVar);
                } else {
                    this.f81790d.f81761B = true;
                }
                this.f81790d.mo79464B3().mo4826r(Boolean.valueOf(this.f81790d.f81770i.mo71288b()));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79501a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33515b(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
            super(1);
            this.f81789d = p2PSendViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo79500a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92648j(aVar, (int[]) null, new C33516a(this.f81789d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79500a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$c */
    static final class C33517c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31089d f81791d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33517c(C31089d dVar) {
            super(1);
            this.f81791d = dVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            return C31270e.m92880i(this.f81791d.mo71290a(C31213f.TRANSFER), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$d */
    static final class C33518d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendViewModel$ViewModel f81792d;

        /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$d$a */
        static final class C33519a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PSendViewModel$ViewModel f81793d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33519a(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
                super(1);
                this.f81793d = p2PSendViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo79504a(C31208a aVar) {
                C36804a aVar2;
                C41536l.m120489i(aVar, "amountLimit");
                C1644x Aw = this.f81793d.mo79496np();
                C36804a aVar3 = (C36804a) this.f81793d.mo79496np().mo4814f();
                if (aVar3 != null) {
                    aVar2 = C36804a.m109018b(aVar3, (Double) null, (C31210c) null, Integer.valueOf(aVar.mo71428a()), (String) null, false, false, 59, (Object) null);
                } else {
                    aVar2 = null;
                }
                Aw.mo4826r(aVar2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79504a((C31208a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33518d(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
            super(1);
            this.f81792d = p2PSendViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo79503a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestResult");
            C31132b.m92648j(aVar, (int[]) null, new C33519a(this.f81792d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79503a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$e */
    static final class C33520e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendViewModel$ViewModel f81794d;

        /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$e$a */
        static final class C33521a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PSendViewModel$ViewModel f81795d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33521a(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
                super(1);
                this.f81795d = p2PSendViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo79506a(MoneyTransferResponse moneyTransferResponse) {
                C41536l.m120489i(moneyTransferResponse, "it");
                this.f81795d.mo79498yt().mo4826r(moneyTransferResponse);
                C1644x Bw = this.f81795d.mo79481Q8();
                C36805b bVar = (C36805b) this.f81795d.mo79481Q8().mo4814f();
                C36805b bVar2 = null;
                if (bVar != null) {
                    bVar2 = C36805b.m109026b(bVar, (String) null, false, 1, (Object) null);
                }
                Bw.mo4826r(bVar2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79506a((MoneyTransferResponse) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$e$b */
        static final class C33522b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PSendViewModel$ViewModel f81796d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33522b(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
                super(1);
                this.f81796d = p2PSendViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo79507a(MoneyTransferResponse moneyTransferResponse) {
                C1644x Bw = this.f81796d.mo79481Q8();
                C36805b bVar = (C36805b) this.f81796d.mo79481Q8().mo4814f();
                C36805b bVar2 = null;
                if (bVar != null) {
                    bVar2 = C36805b.m109026b(bVar, (String) null, true, 1, (Object) null);
                }
                Bw.mo4826r(bVar2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79507a((MoneyTransferResponse) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$e$c */
        static final class C33523c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PSendViewModel$ViewModel f81797d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33523c(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
                super(1);
                this.f81797d = p2PSendViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C1644x Bw = this.f81797d.mo79481Q8();
                C36805b bVar = (C36805b) this.f81797d.mo79481Q8().mo4814f();
                C36805b bVar2 = null;
                if (bVar != null) {
                    bVar2 = C36805b.m109026b(bVar, (String) null, false, 1, (Object) null);
                }
                Bw.mo4826r(bVar2);
                this.f81797d.m98373Sw(th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33520e(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
            super(1);
            this.f81794d = p2PSendViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo79505a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92648j(aVar, (int[]) null, new C33521a(this.f81794d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C33522b(this.f81794d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C33523c(this.f81794d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79505a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$f */
    static final class C33524f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendViewModel$ViewModel f81798d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33524f(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
            super(1);
            this.f81798d = p2PSendViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            C40734b y = this.f81798d.f81771j.mo71291a(((Number) mVar.mo95675a()).longValue()).mo94905y(this.f81798d.f81767f.mo71286a((String) mVar.mo95676b()));
            C41536l.m120488h(y, "getCardLimitsUseCase(car…oneNumberUseCase(number))");
            return C31270e.m92878g(y, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$g */
    static final class C33525g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendViewModel$ViewModel f81799d;

        /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$g$a */
        static final class C33526a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PSendViewModel$ViewModel f81800d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33526a(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
                super(1);
                this.f81800d = p2PSendViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo79511a(C41238w wVar) {
                C1644x Bw = this.f81800d.mo79481Q8();
                C36805b bVar = (C36805b) this.f81800d.mo79481Q8().mo4814f();
                C36805b bVar2 = null;
                if (bVar != null) {
                    bVar2 = C36805b.m109026b(bVar, (String) null, true, 1, (Object) null);
                }
                Bw.mo4826r(bVar2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79511a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$g$b */
        static final class C33527b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PSendViewModel$ViewModel f81801d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33527b(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
                super(1);
                this.f81801d = p2PSendViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo79512a(C41238w wVar) {
                C36805b bVar;
                C36808e eVar;
                C36804a aVar;
                C36805b bVar2;
                C41536l.m120489i(wVar, "it");
                C1644x Bw = this.f81801d.mo79481Q8();
                C36805b bVar3 = (C36805b) this.f81801d.mo79481Q8().mo4814f();
                if (bVar3 != null) {
                    bVar = bVar3.mo89699a(C32343x.m95388F("text.p2p.payment.send.request.next.btn", new Object[0]), false);
                } else {
                    bVar = null;
                }
                Bw.mo4826r(bVar);
                C1644x Mw = this.f81801d.mo79494mo();
                C36808e eVar2 = (C36808e) this.f81801d.mo79494mo().mo4814f();
                if (eVar2 != null) {
                    eVar = C36808e.m109040b(eVar2, (String) null, (String) null, (String) null, true, true, 7, (Object) null);
                } else {
                    eVar = null;
                }
                Mw.mo4826r(eVar);
                C1644x Aw = this.f81801d.mo79496np();
                C36804a aVar2 = (C36804a) this.f81801d.mo79496np().mo4814f();
                if (aVar2 != null) {
                    aVar = C36804a.m109018b(aVar2, (Double) null, (C31210c) null, (Integer) null, (String) null, true, false, 47, (Object) null);
                } else {
                    aVar = null;
                }
                Aw.mo4826r(aVar);
                C1644x Bw2 = this.f81801d.mo79481Q8();
                C36805b bVar4 = (C36805b) this.f81801d.mo79481Q8().mo4814f();
                if (bVar4 != null) {
                    bVar2 = bVar4.mo89699a(C32343x.m95388F("text.p2p.payment.send.request.send.btn", new Object[0]), false);
                } else {
                    bVar2 = null;
                }
                Bw2.mo4826r(bVar2);
                this.f81801d.mo79484Yn((Cursor) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79512a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$g$c */
        static final class C33528c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PSendViewModel$ViewModel f81802d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33528c(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
                super(1);
                this.f81802d = p2PSendViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C1644x Bw = this.f81802d.mo79481Q8();
                C36805b bVar = (C36805b) this.f81802d.mo79481Q8().mo4814f();
                C36805b bVar2 = null;
                if (bVar != null) {
                    bVar2 = C36805b.m109026b(bVar, (String) null, false, 1, (Object) null);
                }
                Bw.mo4826r(bVar2);
                this.f81802d.m98373Sw(th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33525g(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
            super(1);
            this.f81799d = p2PSendViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo79510a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92646h(aVar, (int[]) null, new C33526a(this.f81799d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C33527b(this.f81799d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C33528c(this.f81799d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79510a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$h */
    static final class C33529h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendViewModel$ViewModel f81803d;

        /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$h$a */
        static final class C33530a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PSendViewModel$ViewModel f81804d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33530a(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
                super(1);
                this.f81804d = p2PSendViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo79515a(C31210c cVar) {
                this.f81804d.f81762C = false;
                C1644x Bw = this.f81804d.mo79481Q8();
                C36805b bVar = (C36805b) this.f81804d.mo79481Q8().mo4814f();
                C36805b bVar2 = null;
                if (bVar != null) {
                    bVar2 = C36805b.m109026b(bVar, (String) null, true, 1, (Object) null);
                }
                Bw.mo4826r(bVar2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79515a((C31210c) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$h$b */
        static final class C33531b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PSendViewModel$ViewModel f81805d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33531b(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
                super(1);
                this.f81805d = p2PSendViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo79516a(C31210c cVar) {
                Double d;
                String str;
                Double d2;
                C36804a aVar;
                C31210c e;
                C36804a aVar2;
                C41536l.m120489i(cVar, "commission");
                boolean z = true;
                this.f81805d.f81762C = true;
                C36804a aVar3 = (C36804a) this.f81805d.mo79496np().mo4814f();
                C36805b bVar = null;
                if (aVar3 != null) {
                    d = aVar3.mo89690c();
                } else {
                    d = null;
                }
                if (d != null) {
                    C36804a aVar4 = (C36804a) this.f81805d.mo79496np().mo4814f();
                    if (aVar4 != null) {
                        str = aVar4.mo89694f();
                    } else {
                        str = null;
                    }
                    if (C41536l.m120484d(str, "")) {
                        if (cVar.mo71447a() != Utils.DOUBLE_EPSILON) {
                            z = false;
                        }
                        if (z) {
                            C1644x Aw = this.f81805d.mo79496np();
                            C36804a aVar5 = (C36804a) this.f81805d.mo79496np().mo4814f();
                            if (aVar5 != null) {
                                aVar2 = C36804a.m109018b(aVar5, (Double) null, (C31210c) null, (Integer) null, (String) null, false, true, 29, (Object) null);
                            } else {
                                aVar2 = null;
                            }
                            Aw.mo4826r(aVar2);
                        } else {
                            C36804a aVar6 = (C36804a) this.f81805d.mo79496np().mo4814f();
                            if (aVar6 == null || (e = aVar6.mo89692e()) == null) {
                                d2 = null;
                            } else {
                                d2 = Double.valueOf(e.mo71447a());
                            }
                            if (!C41536l.m120482b(d2, cVar.mo71447a())) {
                                C1644x Aw2 = this.f81805d.mo79496np();
                                C36804a aVar7 = (C36804a) this.f81805d.mo79496np().mo4814f();
                                if (aVar7 != null) {
                                    aVar = C36804a.m109018b(aVar7, (Double) null, cVar, (Integer) null, (String) null, false, false, 29, (Object) null);
                                } else {
                                    aVar = null;
                                }
                                Aw2.mo4826r(aVar);
                            }
                        }
                        C1644x Bw = this.f81805d.mo79481Q8();
                        C36805b bVar2 = (C36805b) this.f81805d.mo79481Q8().mo4814f();
                        if (bVar2 != null) {
                            bVar = bVar2.mo89699a(C32343x.m95388F("text.p2p.payment.send.request.send.btn", new Object[0]) + " " + C32343x.m95410Q(this.f81805d.m98370Pw(), "GEL", false, 2, (Object) null), false);
                        }
                        Bw.mo4826r(bVar);
                        return;
                    }
                }
                C1644x Bw2 = this.f81805d.mo79481Q8();
                C36805b bVar3 = (C36805b) this.f81805d.mo79481Q8().mo4814f();
                if (bVar3 != null) {
                    bVar = C36805b.m109026b(bVar3, (String) null, false, 1, (Object) null);
                }
                Bw2.mo4826r(bVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79516a((C31210c) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$h$c */
        static final class C33532c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PSendViewModel$ViewModel f81806d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33532c(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
                super(1);
                this.f81806d = p2PSendViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f81806d.f81762C = true;
                C1644x Bw = this.f81806d.mo79481Q8();
                C36805b bVar = (C36805b) this.f81806d.mo79481Q8().mo4814f();
                Bw.mo4826r(bVar != null ? bVar.mo89699a(C32343x.m95388F("text.p2p.payment.send.request.next.btn", new Object[0]), false) : null);
                this.f81806d.m98373Sw(th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33529h(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
            super(1);
            this.f81803d = p2PSendViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo79514a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92646h(aVar, (int[]) null, new C33530a(this.f81803d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C33531b(this.f81803d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C33532c(this.f81803d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79514a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel$i */
    static final class C33533i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendViewModel$ViewModel f81807d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33533i(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel) {
            super(1);
            this.f81807d = p2PSendViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo79518a(Double d) {
            P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel = this.f81807d;
            C41536l.m120488h(d, "it");
            p2PSendViewModel$ViewModel.m98378Zw(d.doubleValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79518a((Double) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public P2PSendViewModel$ViewModel(C39778a aVar, C36560a aVar2, C31086a aVar3, C31091f fVar, C31094i iVar, C31087b bVar, C31090e eVar, C31658b bVar2, C27494a aVar4, C31089d dVar, C31092g gVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C36560a aVar5 = aVar2;
        C31086a aVar6 = aVar3;
        C31091f fVar2 = fVar;
        C31094i iVar2 = iVar;
        C31087b bVar3 = bVar;
        C31090e eVar2 = eVar;
        C31658b bVar4 = bVar2;
        C27494a aVar7 = aVar4;
        C31089d dVar2 = dVar;
        C31092g gVar2 = gVar;
        C41536l.m120489i(aVar, "contactsUiMapper");
        C41536l.m120489i(aVar5, "cardPickerUiStateMapper");
        C41536l.m120489i(aVar6, "checkPhoneNumberUseCase");
        C41536l.m120489i(fVar2, "getCardsUseCase");
        C41536l.m120489i(iVar2, "moneyTransferUseCase");
        C41536l.m120489i(bVar3, "contactsPermissionDialogVisibilityUseCase");
        C41536l.m120489i(eVar2, "getCardLimitsUseCase");
        C41536l.m120489i(bVar4, "startTMXProfilingUseCase");
        C41536l.m120489i(aVar7, "otpParamsMapBuilder");
        C41536l.m120489i(dVar2, "getAmountLimitUseCase");
        C41536l.m120489i(gVar2, "getCommissionUseCase");
        this.f81765d = aVar;
        this.f81766e = aVar5;
        this.f81767f = aVar6;
        this.f81768g = fVar2;
        this.f81769h = iVar2;
        this.f81770i = bVar3;
        this.f81771j = eVar2;
        this.f81772k = bVar4;
        this.f81773l = aVar7;
        this.f81774m = gVar2;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Pair<Long, String>>()");
        this.f81763D = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Double>()");
        this.f81764E = h12;
        C32343x.m95397J0(this, "P2P_Transfer", "", "first_page_view", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C36253k(new C33514a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…equestCode)\n            }");
        C40749p E = C32343x.m95413R0(L0).mo94978E(new C36254l(new C33515b(this)));
        C41536l.m120488h(E, "merge(onInit(), onRefres…          }\n            }");
        bindToLifecycle(C31270e.m92876e(E, mo79492la()));
        C40749p L02 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C36255m(new C33517c(dVar2)));
        C41536l.m120488h(L02, "merge(onInit(), onRefres…equestCode)\n            }");
        C41205b F0 = C32343x.m95413R0(L02).mo94981F0(new C36256n(new C33518d(this)));
        C41536l.m120488h(F0, "merge(onInit(), onRefres…          }\n            }");
        bindToLifecycle(F0);
        m98375Ww();
        m98380bx();
    }

    /* access modifiers changed from: private */
    /* renamed from: Pw */
    public final double m98370Pw() {
        double d;
        C31210c e;
        Double c;
        C36804a aVar = (C36804a) mo79496np().mo4814f();
        double d2 = Utils.DOUBLE_EPSILON;
        if (aVar == null || (c = aVar.mo89690c()) == null) {
            d = 0.0d;
        } else {
            d = c.doubleValue();
        }
        C36804a aVar2 = (C36804a) mo79496np().mo4814f();
        if (!(aVar2 == null || (e = aVar2.mo89692e()) == null)) {
            d2 = e.mo71447a();
        }
        return d + d2;
    }

    /* renamed from: Qw */
    private final TransferDetailsParams m98371Qw(String str, String str2, String str3) {
        long j;
        String str4;
        long j2;
        double d;
        String str5;
        String str6;
        String c;
        Double c2;
        String g;
        CreditCardSmallPickerView.C13279b.C13281b d2;
        String a;
        C36806c cVar = (C36806c) mo79488c2().mo4814f();
        if (cVar == null || (d2 = cVar.mo89708d()) == null || (a = d2.mo35473a()) == null) {
            j = 0;
        } else {
            j = Long.parseLong(a);
        }
        C36808e eVar = (C36808e) mo79494mo().mo4814f();
        if (eVar == null || (g = eVar.mo89725g()) == null) {
            str4 = "";
        } else {
            str4 = g;
        }
        C36806c cVar2 = (C36806c) mo79488c2().mo4814f();
        if (cVar2 != null) {
            j2 = cVar2.mo89705a();
        } else {
            j2 = 0;
        }
        C36804a aVar = (C36804a) mo79496np().mo4814f();
        if (aVar == null || (c2 = aVar.mo89690c()) == null) {
            d = Utils.DOUBLE_EPSILON;
        } else {
            d = c2.doubleValue();
        }
        double d3 = d;
        C36806c cVar3 = (C36806c) mo79488c2().mo4814f();
        if (cVar3 == null || (str5 = cVar3.mo89707c()) == null) {
            str5 = "GEL";
        }
        String str7 = str5;
        C36807d dVar = (C36807d) mo79479Ob().mo4814f();
        if (dVar == null || (c = dVar.mo89715c()) == null) {
            str6 = "";
        } else {
            str6 = c;
        }
        return new TransferDetailsParams(j, str4, j2, d3, str7, str6, (String) null, str, str2, str3, 64, (DefaultConstructorMarker) null);
    }

    /* renamed from: Rw */
    static /* synthetic */ TransferDetailsParams m98372Rw(P2PSendViewModel$ViewModel p2PSendViewModel$ViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return p2PSendViewModel$ViewModel.m98371Qw(str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: Sw */
    public final void m98373Sw(Throwable th) {
        int i;
        List list;
        if (th instanceof CardsException) {
            C31128a aVar = (C31128a) mo79492la().mo4814f();
            if (aVar == null || (list = (List) aVar.mo71340a()) == null) {
                i = 0;
            } else {
                i = list.size();
            }
            if (i > 1) {
                mo79463B0(((CardsException) th).mo79416a());
            } else {
                mo79489d2().mo4826r(((CardsException) th).mo79416a());
            }
        } else {
            Object obj = null;
            if (th instanceof PhoneNumberException) {
                C1644x Mw = mo79494mo();
                C36808e eVar = (C36808e) mo79494mo().mo4814f();
                if (eVar != null) {
                    obj = C36808e.m109040b(eVar, (String) null, (String) null, ((PhoneNumberException) th).mo79418a(), false, false, 27, (Object) null);
                }
                Mw.mo4826r(obj);
            } else if (th instanceof AmountException) {
                C1644x Aw = mo79496np();
                C36804a aVar2 = (C36804a) mo79496np().mo4814f();
                if (aVar2 != null) {
                    obj = C36804a.m109018b(aVar2, (Double) null, (C31210c) null, (Integer) null, ((AmountException) th).mo79415a(), false, false, 55, (Object) null);
                }
                Aw.mo4826r(obj);
            } else if (th instanceof DestinationException) {
                C1644x Ew = mo79479Ob();
                C36807d dVar = (C36807d) mo79479Ob().mo4814f();
                if (dVar != null) {
                    obj = C36807d.m109036b(dVar, (String) null, ((DestinationException) th).mo79417a(), 1, (Object) null);
                }
                Ew.mo4826r(obj);
            } else {
                String a0 = C32343x.m95431a0(th, (String) null, 1, (Object) null);
                if (a0 != null) {
                    mo79489d2().mo4826r(a0);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Tw */
    public static final void m98374Tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Ww */
    private final void m98375Ww() {
        C40749p L0 = this.f81763D.mo94989L0(new C36257o(new C33524f(this)));
        C41536l.m120488h(L0, "private fun subscribeToC…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95462k1(L0).mo94981F0(new C36258p(new C33525g(this)));
        C41536l.m120488h(F0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Xw */
    public static final C40754t m98376Xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Yw */
    public static final void m98377Yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Zw */
    public final void m98378Zw(double d) {
        String str;
        CreditCardSmallPickerView.C13279b.C13281b d2;
        C31092g gVar = this.f81774m;
        C36806c cVar = (C36806c) mo79488c2().mo4814f();
        if (cVar == null || (d2 = cVar.mo89708d()) == null || (str = d2.mo35473a()) == null) {
            str = "";
        }
        C41205b F0 = C32343x.m95462k1(C31270e.m92880i(gVar.mo71293a(d, str), -1)).mo94981F0(new C36252j(new C33529h(this)));
        C41536l.m120488h(F0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: ax */
    public static final void m98379ax(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: bx */
    private final void m98380bx() {
        C41205b F0 = this.f81764E.mo95032s(500, TimeUnit.MILLISECONDS).mo94981F0(new C36259q(new C33533i(this)));
        C41536l.m120488h(F0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: cx */
    public static final void m98381cx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: dx */
    private final void m98383dx() {
        String str;
        CreditCardSmallPickerView.C13279b.C13281b d;
        C36806c cVar = (C36806c) mo79488c2().mo4814f();
        String str2 = null;
        if (cVar == null || (d = cVar.mo89708d()) == null) {
            str = null;
        } else {
            str = d.mo35473a();
        }
        C36808e eVar = (C36808e) mo79494mo().mo4814f();
        if (eVar != null) {
            str2 = eVar.mo89725g();
        }
        if (str != null && str2 != null) {
            this.f81763D.onNext(new C41224m(Long.valueOf(Long.parseLong(str)), str2));
        }
    }

    /* renamed from: ex */
    private final boolean m98385ex() {
        int i;
        Double d;
        Double d2;
        int i2;
        String str;
        boolean z;
        String c;
        Integer d3;
        C36804a aVar = (C36804a) mo79496np().mo4814f();
        if (aVar == null || (d3 = aVar.mo89691d()) == null) {
            i = Integer.MAX_VALUE;
        } else {
            i = d3.intValue();
        }
        C36804a aVar2 = (C36804a) mo79496np().mo4814f();
        Object obj = null;
        if (aVar2 != null) {
            d = aVar2.mo89690c();
        } else {
            d = null;
        }
        if (this.f81761B) {
            mo79489d2().mo4826r(C32343x.m95388F("text.p2p.payment.emptyCard.error", new Object[0]));
            return false;
        } else if (d == null || d.doubleValue() <= Utils.DOUBLE_EPSILON) {
            C1644x Aw = mo79496np();
            C36804a aVar3 = (C36804a) mo79496np().mo4814f();
            if (aVar3 != null) {
                obj = C36804a.m109018b(aVar3, (Double) null, (C31210c) null, (Integer) null, C32343x.m95388F("text.p2p.payment.emptyAmount.error", new Object[0]), false, false, 55, (Object) null);
            }
            Aw.mo4826r(obj);
            return false;
        } else if (d.doubleValue() > ((double) i) && i > 0) {
            return false;
        } else {
            C36806c cVar = (C36806c) mo79488c2().mo4814f();
            if (cVar != null) {
                d2 = Double.valueOf(cVar.mo89706b());
            } else {
                d2 = null;
            }
            C41536l.m120486f(d2);
            if (d2.doubleValue() < m98370Pw()) {
                mo79463B0(C32343x.m95388F("text.p2p.payment.avlAmount.error", new Object[0]));
                return false;
            }
            C36807d dVar = (C36807d) mo79479Ob().mo4814f();
            if (dVar == null || (c = dVar.mo89715c()) == null) {
                i2 = 0;
            } else {
                i2 = c.length();
            }
            if (i2 > 250) {
                C1644x Ew = mo79479Ob();
                C36807d dVar2 = (C36807d) mo79479Ob().mo4814f();
                if (dVar2 != null) {
                    obj = C36807d.m109036b(dVar2, (String) null, C32343x.m95388F("text.p2p.payment.nomination.length.error", new Object[0]), 1, (Object) null);
                }
                Ew.mo4826r(obj);
                return false;
            }
            C36807d dVar3 = (C36807d) mo79479Ob().mo4814f();
            if (dVar3 != null) {
                str = dVar3.mo89715c();
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            C1644x Ew2 = mo79479Ob();
            C36807d dVar4 = (C36807d) mo79479Ob().mo4814f();
            if (dVar4 != null) {
                obj = C36807d.m109036b(dVar4, (String) null, C32343x.m95388F("text.p2p.payment.nomination.null.error", new Object[0]), 1, (Object) null);
            }
            Ew2.mo4826r(obj);
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final C40754t m98393mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final void m98394nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final C40754t m98395ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m98396pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Aw */
    public C1644x mo79496np() {
        return this.f81785x;
    }

    /* renamed from: B0 */
    public void mo79463B0(String str) {
        C41536l.m120489i(str, "error");
        boolean z = false;
        if (this.f81761B) {
            mo79489d2().mo4826r(C32343x.m95388F("text.p2p.payment.emptyCard.error", new Object[0]));
            return;
        }
        if (str.length() == 0) {
            z = true;
        }
        if (z) {
            C32343x.m95501z0(this, "P2P_Transfer", "", "click_choose_card");
        }
        C36806c cVar = (C36806c) mo79488c2().mo4814f();
        if (cVar != null) {
            mo79493m1().mo4826r(new C37223a(new C41224m(Integer.valueOf(cVar.mo89709e()), str)));
        }
    }

    /* renamed from: Bw */
    public C1644x mo79481Q8() {
        return this.f81787z;
    }

    /* renamed from: Cw */
    public C1644x mo79488c2() {
        return this.f81777p;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* renamed from: Du */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo79467Du() {
        /*
            r15 = this;
            e41.b r0 = r15.f81772k
            java.lang.String r1 = "P2P_TRANSFERS"
            r0.mo72084b(r1)
            androidx.lifecycle.x r0 = r15.mo79494mo()
            java.lang.Object r0 = r0.mo4814f()
            jw0.e r0 = (jw0.C36808e) r0
            if (r0 == 0) goto L_0x0123
            boolean r1 = r0.mo89726h()
            java.lang.String r2 = ""
            java.lang.String r3 = "P2P_Transfer"
            r4 = 0
            r5 = 0
            if (r1 != 0) goto L_0x0099
            androidx.lifecycle.x r1 = r15.mo79492la()
            java.lang.Object r1 = r1.mo4814f()
            b41.a r1 = (b41.C31128a) r1
            java.lang.String r6 = "value"
            r7 = 1
            if (r1 == 0) goto L_0x0041
            kotlin.jvm.internal.C41536l.m120488h(r1, r6)
            java.lang.Object r1 = b41.C31132b.m92640b(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0041
            boolean r1 = r1.isEmpty()
            if (r1 != r7) goto L_0x0041
            r1 = r7
            goto L_0x0042
        L_0x0041:
            r1 = r5
        L_0x0042:
            if (r1 == 0) goto L_0x0055
            androidx.lifecycle.x r0 = r15.mo79489d2()
            java.lang.String r1 = "text.p2p.payment.emptyCard.error"
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r1 = g91.C32343x.m95388F(r1, r2)
            r0.mo4826r(r1)
            goto L_0x0123
        L_0x0055:
            java.lang.String r0 = r0.mo89725g()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r7 = r5
        L_0x0061:
            if (r7 == 0) goto L_0x008f
            androidx.lifecycle.x r0 = r15.mo79494mo()
            androidx.lifecycle.x r1 = r15.mo79494mo()
            java.lang.Object r1 = r1.mo4814f()
            r7 = r1
            jw0.e r7 = (jw0.C36808e) r7
            if (r7 == 0) goto L_0x008a
            kotlin.jvm.internal.C41536l.m120488h(r7, r6)
            r8 = 0
            r9 = 0
            java.lang.String r1 = "text.p2p.payment.emptyContactId.error"
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r10 = g91.C32343x.m95388F(r1, r2)
            r11 = 0
            r12 = 0
            r13 = 27
            r14 = 0
            jw0.e r4 = jw0.C36808e.m109040b(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x008a:
            r0.mo4826r(r4)
            goto L_0x0123
        L_0x008f:
            java.lang.String r0 = "enter_phone_number_next_click"
            g91.C32343x.m95501z0(r15, r3, r2, r0)
            r15.m98383dx()
            goto L_0x0123
        L_0x0099:
            androidx.lifecycle.x r0 = r15.mo79481Q8()
            java.lang.Object r0 = r0.mo4814f()
            jw0.b r0 = (jw0.C36805b) r0
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = r0.mo89700c()
            goto L_0x00ab
        L_0x00aa:
            r0 = r4
        L_0x00ab:
            java.lang.String r1 = "text.p2p.payment.send.request.next.btn"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r1 = g91.C32343x.m95388F(r1, r5)
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)
            if (r0 == 0) goto L_0x00ee
            androidx.lifecycle.x r0 = r15.mo79496np()
            java.lang.Object r0 = r0.mo4814f()
            jw0.a r0 = (jw0.C36804a) r0
            if (r0 == 0) goto L_0x00ca
            java.lang.Double r0 = r0.mo89690c()
            goto L_0x00cb
        L_0x00ca:
            r0 = r4
        L_0x00cb:
            boolean r0 = g91.C32343x.m95482r0(r0, r2)
            if (r0 == 0) goto L_0x00ee
            androidx.lifecycle.x r0 = r15.mo79496np()
            java.lang.Object r0 = r0.mo4814f()
            jw0.a r0 = (jw0.C36804a) r0
            if (r0 == 0) goto L_0x00e8
            java.lang.Double r0 = r0.mo89690c()
            if (r0 == 0) goto L_0x00e8
            double r0 = r0.doubleValue()
            goto L_0x00ea
        L_0x00e8:
            r0 = 0
        L_0x00ea:
            r15.m98378Zw(r0)
            return
        L_0x00ee:
            boolean r0 = r15.m98385ex()
            if (r0 == 0) goto L_0x0123
            androidx.lifecycle.x r0 = r15.mo79496np()
            java.lang.Object r0 = r0.mo4814f()
            jw0.a r0 = (jw0.C36804a) r0
            if (r0 == 0) goto L_0x0104
            java.lang.Double r4 = r0.mo89690c()
        L_0x0104:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "enter_amount_transfer_confirm_click"
            g91.C32343x.m95501z0(r15, r3, r0, r1)
            androidx.lifecycle.x r0 = r15.mo79490hl()
            m41.a r1 = new m41.a
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 7
            r7 = 0
            r2 = r15
            ge.bog.mobilebank.p2p.presentation.send.model.TransferDetailsParams r2 = m98372Rw(r2, r3, r4, r5, r6, r7)
            r1.<init>(r2)
            r0.mo4823o(r1)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel.mo79467Du():void");
    }

    /* renamed from: Dw */
    public C1644x mo79492la() {
        return this.f81782u;
    }

    /* renamed from: Ew */
    public C1644x mo79479Ob() {
        return this.f81786y;
    }

    /* renamed from: Fw */
    public C1644x mo79489d2() {
        return this.f81760A;
    }

    /* renamed from: Gw */
    public final C33536c mo79471Gw() {
        return this.f81775n;
    }

    /* renamed from: Hw */
    public C1644x mo79490hl() {
        return this.f81778q;
    }

    /* renamed from: Iw */
    public C1644x mo79498yt() {
        return this.f81780s;
    }

    /* renamed from: Jw */
    public C1644x mo79493m1() {
        return this.f81779r;
    }

    /* renamed from: Kw */
    public HashMap mo79475Kw(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f81773l.mo66809a(otpParams);
    }

    /* renamed from: Lw */
    public final C36250h mo79476Lw() {
        return this.f81776o;
    }

    /* renamed from: Mw */
    public C1644x mo79494mo() {
        return this.f81783v;
    }

    /* renamed from: Nw */
    public C1644x mo79464B3() {
        return this.f81781t;
    }

    /* renamed from: Ow */
    public C1644x mo79491kc() {
        return this.f81784w;
    }

    /* renamed from: Uw */
    public void mo79482Uw(String str) {
        C36807d dVar;
        C41536l.m120489i(str, "destination");
        C1644x Ew = mo79479Ob();
        C36807d dVar2 = (C36807d) mo79479Ob().mo4814f();
        if (dVar2 != null) {
            dVar = dVar2.mo89714a(str, "");
        } else {
            dVar = null;
        }
        Ew.mo4826r(dVar);
    }

    /* renamed from: Vw */
    public void mo79483Vw(boolean z) {
        this.f81770i.mo71287a(z);
    }

    /* renamed from: Yn */
    public void mo79484Yn(Cursor cursor) {
        List list;
        C1644x Ow = mo79491kc();
        if (cursor == null || (list = this.f81765d.mo93510a(cursor)) == null) {
            list = C41341q.m119907j();
        }
        Ow.mo4826r(list);
    }

    /* renamed from: Z2 */
    public void mo79485Z2(int i) {
        List list;
        C31128a aVar = (C31128a) mo79492la().mo4814f();
        if (aVar != null && (list = (List) aVar.mo71340a()) != null) {
            C36806c cVar = (C36806c) mo79488c2().mo4814f();
            boolean z = false;
            if (cVar != null && cVar.mo89709e() == i) {
                z = true;
            }
            if (!z) {
                C32343x.m95501z0(this, "P2P_Transfer", "", "choose_specific_card");
                mo79488c2().mo4826r(C36560a.m108403b(this.f81766e, (C31209b) list.get(i), i, false, 4, (Object) null));
            }
        }
    }

    /* renamed from: al */
    public void mo79486al(C40019a aVar) {
        C36808e eVar;
        C41536l.m120489i(aVar, "contact");
        C32343x.m95501z0(this, "P2P_Transfer", "", "choose_contact_number");
        C1644x Mw = mo79494mo();
        C36808e eVar2 = (C36808e) mo79494mo().mo4814f();
        if (eVar2 != null) {
            eVar = C36808e.m109040b(eVar2, aVar.mo93839a(), aVar.mo93840b(), (String) null, false, true, 12, (Object) null);
        } else {
            eVar = null;
        }
        Mw.mo4826r(eVar);
        mo79484Yn((Cursor) null);
        mo79467Du();
    }

    /* renamed from: b2 */
    public void mo79487b2(String str) {
        C36805b bVar;
        C36804a aVar;
        C36805b bVar2;
        Double d;
        Integer num;
        String str2;
        C36804a aVar2;
        C1644x xVar;
        C36804a aVar3;
        C36805b bVar3;
        C41536l.m120489i(str, "amountText");
        C1644x Bw = mo79481Q8();
        C36805b bVar4 = (C36805b) mo79481Q8().mo4814f();
        C36805b bVar5 = null;
        if (bVar4 != null) {
            bVar = C36805b.m109026b(bVar4, (String) null, true, 1, (Object) null);
        } else {
            bVar = null;
        }
        Bw.mo4826r(bVar);
        Double h = C40437u.m117096h(str);
        if (h == null || h.doubleValue() <= Utils.DOUBLE_EPSILON) {
            C1644x Aw = mo79496np();
            C36804a aVar4 = (C36804a) mo79496np().mo4814f();
            if (aVar4 != null) {
                aVar = C36804a.m109018b(aVar4, (Double) null, (C31210c) null, (Integer) null, "", false, false, 20, (Object) null);
            } else {
                aVar = null;
            }
            Aw.mo4826r(aVar);
            C1644x Bw2 = mo79481Q8();
            C36805b bVar6 = (C36805b) mo79481Q8().mo4814f();
            if (bVar6 != null) {
                bVar2 = bVar6.mo89699a(C32343x.m95388F("text.p2p.payment.send.request.send.btn", new Object[0]), false);
            } else {
                bVar2 = null;
            }
            Bw2.mo4826r(bVar2);
            return;
        }
        C36804a aVar5 = (C36804a) mo79496np().mo4814f();
        if (aVar5 != null) {
            d = aVar5.mo89690c();
        } else {
            d = null;
        }
        if (!C41536l.m120483c(h, d) || !this.f81762C) {
            C36804a aVar6 = (C36804a) mo79496np().mo4814f();
            if (aVar6 != null) {
                num = aVar6.mo89691d();
            } else {
                num = null;
            }
            if (num == null || ((double) num.intValue()) >= h.doubleValue() || num.intValue() == 0) {
                str2 = "";
            } else {
                str2 = " " + C32343x.m95388F("text.p2p.payment.oneTimeAmount.error", new Object[0]) + " " + num + " ₾";
            }
            C1644x Aw2 = mo79496np();
            C36804a aVar7 = (C36804a) mo79496np().mo4814f();
            if (aVar7 != null) {
                xVar = Aw2;
                aVar2 = C36804a.m109018b(aVar7, h, (C31210c) null, (Integer) null, str2, false, false, 54, (Object) null);
            } else {
                xVar = Aw2;
                aVar2 = null;
            }
            xVar.mo4826r(aVar2);
            if (C41536l.m120484d(str2, "")) {
                this.f81764E.onNext(h);
                return;
            }
            C1644x Aw3 = mo79496np();
            C36804a aVar8 = (C36804a) mo79496np().mo4814f();
            if (aVar8 != null) {
                aVar3 = C36804a.m109018b(aVar8, (Double) null, (C31210c) null, (Integer) null, (String) null, false, false, 61, (Object) null);
            } else {
                aVar3 = null;
            }
            Aw3.mo4826r(aVar3);
            C1644x Bw3 = mo79481Q8();
            C36805b bVar7 = (C36805b) mo79481Q8().mo4814f();
            if (bVar7 != null) {
                bVar3 = bVar7.mo89699a(C32343x.m95388F("text.p2p.payment.send.request.send.btn", new Object[0]), false);
            } else {
                bVar3 = null;
            }
            Bw3.mo4826r(bVar3);
            return;
        }
        C1644x Bw4 = mo79481Q8();
        C36805b bVar8 = (C36805b) mo79481Q8().mo4814f();
        if (bVar8 != null) {
            bVar5 = C36805b.m109026b(bVar8, (String) null, false, 1, (Object) null);
        }
        Bw4.mo4826r(bVar5);
    }

    /* renamed from: nb */
    public void mo79495nb(String str) {
        C36808e eVar;
        C41536l.m120489i(str, "phoneText");
        C1644x Mw = mo79494mo();
        C36808e eVar2 = (C36808e) mo79494mo().mo4814f();
        C36805b bVar = null;
        if (eVar2 != null) {
            eVar = eVar2.mo89720a("", str, "", false, false);
        } else {
            eVar = null;
        }
        Mw.mo4826r(eVar);
        C1644x Bw = mo79481Q8();
        C36805b bVar2 = (C36805b) mo79481Q8().mo4814f();
        if (bVar2 != null) {
            bVar = C36805b.m109026b(bVar2, C32343x.m95388F("text.p2p.payment.send.request.next.btn", new Object[0]), false, 2, (Object) null);
        }
        Bw.mo4826r(bVar);
    }

    /* renamed from: qg */
    public void mo79497qg(String str, String str2, String str3) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        C41205b F0 = C32343x.m95413R0(C31270e.m92880i(this.f81769h.mo71295a(mo79475Kw(m98371Qw(str, str2, str3))), -1)).mo94981F0(new C36251i(new C33520e(this)));
        C41536l.m120488h(F0, "override fun moneyTransf…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }
}
