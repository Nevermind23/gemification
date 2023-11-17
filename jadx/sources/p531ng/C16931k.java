package p531ng;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import com.salesforce.marketingcloud.UrlHandler;
import de1.C40640a;
import ed1.C40749p;
import ed1.C40762x;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.chat.data.ChatUser;
import p341ge.bog.chat.domain.model.components.Component;
import p341ge.bog.chat.presentation.FileTooBigException;
import p341ge.bog.chat.presentation.activity.C13007a;
import p341ge.bog.chat.presentation.activity.C13013d;
import p341ge.bog.chat.presentation.activity.C13017f;
import p341ge.bog.chat.presentation.activity.C13018f0;
import p341ge.bog.chat.presentation.activity.C13032i0;
import p341ge.bog.chat.presentation.activity.C13034j0;
import p341ge.bog.chat.presentation.activity.C13060q0;
import p405eg.C12439a;
import p405eg.C12441b;
import p405eg.C12444c0;
import p405eg.C12445d;
import p405eg.C12447e;
import p405eg.C12453i;
import p405eg.C12457m;
import p405eg.C12459o;
import p405eg.C12461q;
import p405eg.C12464t;
import p405eg.C12466v;
import p405eg.C12468x;
import p405eg.C12470z;
import p419fg.C12870a;
import p419fg.C12873b;
import p419fg.C12876e;
import p419fg.C12877f;
import p419fg.C12878g;
import p419fg.C12880h;
import p419fg.C12884i;
import p419fg.C12885j;
import p419fg.C12886k;
import p419fg.C12887l;
import p419fg.C12888m;
import p447hg.C15498b;
import p447hg.C15503f;

/* renamed from: ng.k */
public final class C16931k extends C1613n0 {

    /* renamed from: d */
    private final C12470z f47273d;

    /* renamed from: e */
    private final C12464t f47274e;

    /* renamed from: f */
    private final C12441b f47275f;

    /* renamed from: g */
    private final C12453i f47276g;

    /* renamed from: h */
    private final C12444c0 f47277h;

    /* renamed from: i */
    private final C12468x f47278i;

    /* renamed from: j */
    private C12447e f47279j;

    /* renamed from: k */
    private C12439a f47280k;

    /* renamed from: l */
    private final C41204a f47281l = new C41204a();

    /* renamed from: m */
    private final C40767b f47282m;

    /* renamed from: n */
    private final C1644x f47283n;

    /* renamed from: o */
    private final C1644x f47284o;

    /* renamed from: p */
    private final C1644x f47285p;

    /* renamed from: q */
    private final C1644x f47286q;

    /* renamed from: r */
    private final long f47287r;

    /* renamed from: s */
    private final C1644x f47288s;

    /* renamed from: ng.k$a */
    public /* synthetic */ class C16932a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47289a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f47290b;

        static {
            int[] iArr = new int[C12877f.values().length];
            iArr[C12877f.SESSION_ENDED.ordinal()] = 1;
            iArr[C12877f.SESSION_STARTED.ordinal()] = 2;
            iArr[C12877f.CLOSED.ordinal()] = 3;
            f47289a = iArr;
            int[] iArr2 = new int[C12885j.values().length];
            iArr2[C12885j.TEXT.ordinal()] = 1;
            iArr2[C12885j.FILE_ATTACHMENT.ordinal()] = 2;
            iArr2[C12885j.PARTICIPANT_JOINED.ordinal()] = 3;
            iArr2[C12885j.TYPING.ordinal()] = 4;
            iArr2[C12885j.PARTICIPANT_LEFT.ordinal()] = 5;
            f47290b = iArr2;
        }
    }

    public C16931k(C12470z zVar, C12464t tVar, C12441b bVar, C12453i iVar, C12444c0 c0Var, C12468x xVar, C12466v vVar, C12461q qVar, C12459o oVar, C12457m mVar, C12445d dVar, C12447e eVar, C12439a aVar) {
        long j;
        C41536l.m120489i(zVar, "sendMessageUseCase");
        C41536l.m120489i(tVar, "loadChatHistoryUseCase");
        C41536l.m120489i(bVar, "attachFileUseCase");
        C41536l.m120489i(iVar, "connectToChatUseCase");
        C41536l.m120489i(c0Var, "startChatUseCase");
        C41536l.m120489i(xVar, "savePrivacyPolicyUseCase");
        C41536l.m120489i(vVar, "receiveMessageUseCase");
        C41536l.m120489i(qVar, "typingEventsUseCase");
        C41536l.m120489i(oVar, "currentParticipantUseCase");
        C41536l.m120489i(mVar, "getConversationStatusUseCase");
        this.f47273d = zVar;
        this.f47274e = tVar;
        this.f47275f = bVar;
        this.f47276g = iVar;
        this.f47277h = c0Var;
        this.f47278i = xVar;
        this.f47279j = eVar;
        this.f47280k = aVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<MessageEventUiModel>()");
        this.f47282m = h1;
        this.f47283n = new C1644x();
        this.f47284o = new C1644x();
        this.f47285p = new C1644x();
        this.f47286q = new C1644x();
        this.f47288s = new C1644x();
        C41205b C = vVar.mo33077a().mo94939v(new C16926f(this)).mo94940w(C40992a.m118827a()).mo94920C(new C16927g(this));
        C41536l.m120488h(C, "receiveMessageUseCase().…messageUiEvent)\n        }");
        addDisposable(C);
        C41205b F0 = oVar.mo33070a().mo95027o0(C40992a.m118827a()).mo94981F0(new C16928h(this));
        C41536l.m120488h(F0, "currentParticipantUseCas….value = it\n            }");
        addDisposable(F0);
        C41205b F02 = qVar.mo33072a().mo95027o0(C40992a.m118827a()).mo94981F0(new C16929i(this));
        C41536l.m120488h(F02, "typingEventsUseCase()\n  …          }\n            }");
        addDisposable(F02);
        C41205b F03 = mVar.mo33068a().mo95027o0(C40992a.m118827a()).mo94981F0(new C16930j(this));
        C41536l.m120488h(F03, "getConversationStatusUse…          }\n            }");
        addDisposable(F03);
        if (dVar != null) {
            j = dVar.getMaxSize();
        } else {
            j = 1000;
        }
        this.f47287r = j * 1024;
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public static final List m59519Gw(C16931k kVar, List list) {
        C41536l.m120489i(kVar, "this$0");
        C41536l.m120489i(list, "it");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(kVar.m59522Mw((C12878g) it.next()));
        }
        return arrayList;
    }

    /* renamed from: Kw */
    public static /* synthetic */ void m59520Kw(C16931k kVar, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        kVar.mo44100Jw(str, str2, z);
    }

    /* renamed from: Lw */
    private final C13032i0 m59521Lw(C12885j jVar) {
        int i = C16932a.f47290b[jVar.ordinal()];
        if (i == 1) {
            return C13032i0.TEXT;
        }
        if (i == 2) {
            return C13032i0.FILE_ATTACHMENT;
        }
        if (i == 3) {
            return C13032i0.PARTICIPANT_JOINED;
        }
        if (i == 4) {
            return C13032i0.TYPING;
        }
        if (i == 5) {
            return C13032i0.PARTICIPANT_LEFT;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: Mw */
    private final C13034j0 m59522Mw(C12878g gVar) {
        ArrayList arrayList;
        String h = gVar.mo33589h();
        Date date = new Date(gVar.mo33596n());
        C13007a aVar = new C13007a(gVar.mo33592j().mo33617b(), gVar.mo33592j().mo33616a());
        String m = gVar.mo33595m();
        C12870a c = gVar.mo33583c();
        C12884i l = gVar.mo33594l();
        C13032i0 Lw = m59521Lw(gVar.mo33591i());
        List<C12876e> e = gVar.mo33585e();
        C13013d dVar = null;
        if (e != null) {
            arrayList = new ArrayList(C41343r.m119925u(e, 10));
            for (C12876e eVar : e) {
                arrayList.add(new C13017f(eVar.mo33578b(), eVar.mo33577a()));
            }
        } else {
            arrayList = null;
        }
        boolean g = gVar.mo33588g();
        C12873b d = gVar.mo33584d();
        if (d != null) {
            dVar = new C13013d(d.mo33561c(), d.mo33562d(), d.mo33560b(), d.mo33559a());
        }
        return new C13034j0(h, date, aVar, m, c, l, Lw, arrayList, g, dVar, gVar.mo33587f());
    }

    private final boolean addDisposable(C41205b bVar) {
        return this.f47281l.mo95660b(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final C13018f0 m59533nw(C16931k kVar, C12880h hVar) {
        C41536l.m120489i(kVar, "this$0");
        C41536l.m120489i(hVar, "it");
        if (hVar instanceof C12880h.C12882b) {
            return new C13018f0.C13021c(kVar.m59522Mw(((C12880h.C12882b) hVar).mo33608a()));
        }
        if (hVar instanceof C12880h.C12883c) {
            return new C13018f0.C13022d(kVar.m59522Mw(((C12880h.C12883c) hVar).mo33612a()));
        }
        if (hVar instanceof C12880h.C12881a) {
            return new C13018f0.C13019a(kVar.m59522Mw(((C12880h.C12881a) hVar).mo33604a()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m59534ow(C16931k kVar, C13018f0 f0Var) {
        C41536l.m120489i(kVar, "this$0");
        kVar.f47282m.onNext(f0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m59535pw(C16931k kVar, C12886k kVar2) {
        C41536l.m120489i(kVar, "this$0");
        kVar.f47284o.mo4826r(kVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m59536qw(C16931k kVar, C12888m mVar) {
        Object obj;
        C41536l.m120489i(kVar, "this$0");
        C1644x xVar = kVar.f47283n;
        if (mVar instanceof C12888m.C12889a) {
            obj = new C13060q0.C13061a(kVar.m59522Mw(((C12888m.C12889a) mVar).mo33621a()));
        } else if (mVar instanceof C12888m.C12890b) {
            obj = C13060q0.C13062b.f38462a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        xVar.mo4826r(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m59537rw(C16931k kVar, C12877f fVar) {
        int i;
        C16931k kVar2 = kVar;
        C41536l.m120489i(kVar2, "this$0");
        if (fVar == null) {
            i = -1;
        } else {
            i = C16932a.f47289a[fVar.ordinal()];
        }
        if (i == 1) {
            kVar2.f47285p.mo4826r(new C13018f0.C13021c(new C13034j0("ge.bog.mobilebank.cleanarch.presentation.chat.CHAT_ENDED", new Date(), new C13007a(C12887l.BOT, (String) null, 2, (DefaultConstructorMarker) null), (String) null, (C12870a) null, (C12884i) null, C13032i0.CHAT_ENDED, (List) null, false, (C13013d) null, (Component) null, 1976, (DefaultConstructorMarker) null)));
        } else if (i == 2) {
            kVar2.f47285p.mo4826r(new C13018f0.C13020b("ge.bog.mobilebank.cleanarch.presentation.chat.CHAT_ENDED"));
        } else if (i == 3) {
            kVar2.f47288s.mo4826r(C41238w.f97225a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final void m59538tw(C16931k kVar, Throwable th) {
        C41536l.m120489i(kVar, "this$0");
        if (th instanceof FileTooBigException) {
            kVar.f47286q.mo4826r(new C15498b(C41238w.f97225a));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final C15503f m59539uw(Context context, Uri uri, C16931k kVar) {
        C41536l.m120489i(context, "$context");
        C41536l.m120489i(uri, "$uri");
        C41536l.m120489i(kVar, "this$0");
        return C15503f.f44009e.mo42615a(context, uri, Long.valueOf(kVar.f47287r));
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final C12870a.C12871a m59540vw(C15503f fVar) {
        C41536l.m120489i(fVar, "it");
        return new C12870a.C12871a(fVar.mo42608a(), fVar.mo42610c(), fVar.mo42611d(), fVar.mo42609b());
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final void m59541ww(C16931k kVar, C12870a.C12871a aVar) {
        C41536l.m120489i(kVar, "this$0");
        C12441b bVar = kVar.f47275f;
        C41536l.m120488h(aVar, "attachment");
        bVar.mo33052a(aVar);
    }

    /* renamed from: Aw */
    public final LiveData mo44092Aw() {
        return this.f47288s;
    }

    /* renamed from: Bw */
    public final LiveData mo44093Bw() {
        return this.f47284o;
    }

    /* renamed from: Cw */
    public final C40749p mo44094Cw() {
        return this.f47282m;
    }

    /* renamed from: Dw */
    public final String mo44095Dw(String str, String str2) {
        String a;
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str2, "defValue");
        C12447e eVar = this.f47279j;
        if (eVar == null || (a = eVar.mo33058a(str)) == null) {
            return str2;
        }
        return a;
    }

    /* renamed from: Ew */
    public final LiveData mo44096Ew() {
        return this.f47283n;
    }

    /* renamed from: Fw */
    public final C40749p mo44097Fw(boolean z) {
        C40749p o0 = this.f47274e.mo33075a(z).mo95026k0(new C16921a(this)).mo95027o0(C40992a.m118827a());
        C41536l.m120488h(o0, "loadChatHistoryUseCase(l…dSchedulers.mainThread())");
        return o0;
    }

    /* renamed from: Hw */
    public final void mo44098Hw(boolean z, String str) {
        this.f47278i.mo33079a(z, str);
    }

    /* renamed from: Iw */
    public final void mo44099Iw(String str, String str2, String str3) {
        C41536l.m120489i(str, "category");
        C41536l.m120489i(str2, "label");
        C41536l.m120489i(str3, UrlHandler.ACTION);
        C12439a aVar = this.f47280k;
        if (aVar != null) {
            aVar.mo33050a(str, str2, str3);
        }
    }

    /* renamed from: Jw */
    public final void mo44100Jw(String str, String str2, boolean z) {
        this.f47273d.mo33081a(str, str2, z);
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.f47281l.dispose();
        super.onCleared();
    }

    /* renamed from: sw */
    public final void mo44101sw(Context context, Uri uri) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(uri, "uri");
        C41205b I = C40762x.m118160v(new C16922b(context, uri, this)).mo95062A(new C16923c()).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95070I(new C16924d(this), new C16925e(this));
        C41536l.m120488h(I, "fromCallable {\n         …         }\n            })");
        addDisposable(I);
    }

    /* renamed from: xw */
    public final void mo44102xw(ChatUser chatUser) {
        C41536l.m120489i(chatUser, "chat");
        this.f47276g.mo33064a(chatUser);
        this.f47277h.mo33055a();
    }

    /* renamed from: yw */
    public final LiveData mo44103yw() {
        return this.f47286q;
    }

    /* renamed from: zw */
    public final LiveData mo44104zw() {
        return this.f47285p;
    }
}
