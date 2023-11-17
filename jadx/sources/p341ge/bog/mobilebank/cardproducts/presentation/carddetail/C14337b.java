package p341ge.bog.mobilebank.cardproducts.presentation.carddetail;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import ba1.C10146d0;
import bk0.C19392a;
import c41.C31270e;
import ck0.C19764a;
import ck0.C19765b;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;
import dk0.C20031a;
import dk0.C20032b;
import dk0.C20034d;
import dk0.C20035e;
import e41.C31658b;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import ek0.C20261a;
import ek0.C20262b;
import fk0.C20524h;
import fk0.C20526j;
import g91.C32289b0;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import iu0.C36546y;
import j51.C36735g;
import j70.C25352k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lk0.C26050a;
import m41.C37223a;
import m41.C37224b;
import m50.C26145c;
import m51.C37228a;
import o70.C26763b;
import o70.C26764c;
import o70.C26765d;
import p313x7.C8973b;
import p341ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType;
import p341ge.bog.mobilebank.cardproducts.presentation.carddetail.model.C14391a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.products.model.CardExtraDetailsUIModel;
import p341ge.bog.mobilebank.cleanarch.shareddomain.model.cards.CardInsSecCardModel;
import p341ge.bog.mobilebank.googlepay.data.entity.ApproveOpcParams;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.cards.DigitalCardInfo;
import p341ge.bog.mobilebank.model.usrinfo.UserRestrictions;
import p341ge.bog.mobilebank.products.data.model.BlockCardParams;
import p341ge.bog.mobilebank.products.data.model.SCACardDetailsParams;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.CardDailyLimitUiModel;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p355an.C10092j;
import p380ck.C10463g;
import p380ck.C10464h;
import p426fn.C12932f;
import p510ln.C16589c;
import p510ln.C16595i;
import p510ln.C16600j;
import p523mm.C16792w0;
import p524mn.C16800a;
import p524mn.C16801b;
import p537nm.C17080e;
import p566pn.C17392a;
import p566pn.C17394b;
import p566pn.C17396c;
import p566pn.C17398d;
import p566pn.C17400e;
import p566pn.C17402f;
import p566pn.C17404g;
import p566pn.C17406h;
import p566pn.C17408i;
import p566pn.C17410j;
import p566pn.C17412k;
import p566pn.C17414l;
import p566pn.C17415m;
import p566pn.C17416n;
import p566pn.C17417o;
import p566pn.C17418p;
import p566pn.C17419q;
import p566pn.C17420r;
import p566pn.C17421s;
import p566pn.C17422t;
import p566pn.C17423u;
import p622tn.C18031b;
import p622tn.C18035c;
import p635un.C18262a;
import p674xm.C18795c;
import p738du.C20101a;
import p748eu.C20292b;
import pc0.C27494a;
import r90.C27950a;
import ty0.C38879n;
import ty0.C38880n0;
import ty0.C38884p0;
import ue1.C43075l;
import xy0.C39938b0;

/* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b */
public final class C14337b extends C21481a implements C14335a, C17392a {

    /* renamed from: A */
    private final C17392a f42005A = this;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C20262b f42006B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public long f42007C = -1;

    /* renamed from: D */
    private final C40767b f42008D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final List f42009E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public CardDailyLimitUiModel f42010F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f42011G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public List f42012H;

    /* renamed from: I */
    private final C1644x f42013I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final C1644x f42014J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final C1644x f42015K;

    /* renamed from: L */
    private final C1644x f42016L;

    /* renamed from: M */
    private final C1644x f42017M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final C1644x f42018N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final C1644x f42019O;

    /* renamed from: P */
    private final C1644x f42020P;

    /* renamed from: Q */
    private final C1644x f42021Q;

    /* renamed from: R */
    private final C1644x f42022R;

    /* renamed from: S */
    private final C1644x f42023S;

    /* renamed from: T */
    private final C1644x f42024T;

    /* renamed from: U */
    private final C1644x f42025U;

    /* renamed from: V */
    private final C1644x f42026V;

    /* renamed from: W */
    private final C1644x f42027W;

    /* renamed from: X */
    private final C1644x f42028X;

    /* renamed from: Y */
    private final C1644x f42029Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final C1644x f42030Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final C1644x f42031a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public final C1644x f42032b0;

    /* renamed from: c0 */
    private final C1644x f42033c0;

    /* renamed from: d */
    private final C38884p0 f42034d;

    /* renamed from: d0 */
    private final C1644x f42035d0;

    /* renamed from: e */
    private final C25352k f42036e;

    /* renamed from: e0 */
    private final C1644x f42037e0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C16595i f42038f;

    /* renamed from: f0 */
    private final C1644x f42039f0;

    /* renamed from: g */
    private final C38879n f42040g;

    /* renamed from: g0 */
    private final C1644x f42041g0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C26145c f42042h;

    /* renamed from: h0 */
    private final C1644x f42043h0;

    /* renamed from: i */
    private final C38880n0 f42044i;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public final C40767b f42045i0;

    /* renamed from: j */
    private final C31658b f42046j;

    /* renamed from: j0 */
    private final C40767b f42047j0;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C19392a f42048k;

    /* renamed from: k0 */
    private final C40767b f42049k0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C20524h f42050l;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public final C40767b f42051l0;

    /* renamed from: m */
    private final C20526j f42052m;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public final C1644x f42053m0;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C36735g f42054n;

    /* renamed from: n0 */
    private final C1644x f42055n0;

    /* renamed from: o */
    private final C20292b f42056o;

    /* renamed from: o0 */
    private final C1644x f42057o0;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C26050a f42058p;

    /* renamed from: p0 */
    private final C1644x f42059p0;

    /* renamed from: q */
    private final C8973b f42060q;

    /* renamed from: q0 */
    private final C1644x f42061q0;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final PreferencesApiManager f42062r;

    /* renamed from: r0 */
    private final C1644x f42063r0;

    /* renamed from: s */
    private final C16792w0 f42064s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C16600j f42065t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C16589c f42066u;

    /* renamed from: v */
    private final Client f42067v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C10092j f42068w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C18262a f42069x;

    /* renamed from: y */
    private final C27494a f42070y;

    /* renamed from: z */
    private final C14335a f42071z = this;

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$a */
    static final class C14338a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14338a f42072d = new C14338a();

        C14338a() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return 6;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$b */
    static final class C14339b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14337b f42073d;

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$b$a */
        static final class C14340a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14337b f42074d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14340a(C14337b bVar) {
                super(1);
                this.f42074d = bVar;
            }

            /* renamed from: a */
            public final C41224m invoke(List list) {
                boolean z;
                C41536l.m120489i(list, "result");
                C14337b bVar = this.f42074d;
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((C16800a) it.next()).mo43920a().mo66030j() == bVar.f42007C) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i++;
                }
                return new C41224m(list, Integer.valueOf(i));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14339b(C14337b bVar) {
            super(1);
            this.f42073d = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m53225c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41224m) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            C40749p O = this.f42073d.f42038f.mo43743c(this.f42073d.f42007C).mo95062A(new C14368c(new C14340a(this.f42073d))).mo95075O();
            C41536l.m120488h(O, "class ViewModel @Assiste…iewModel\n        }\n\n    }");
            return C31270e.m92879h(O, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$c */
    static final class C14341c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14337b f42075d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14341c(C14337b bVar) {
            super(1);
            this.f42075d = bVar;
        }

        /* renamed from: a */
        public final void mo40153a(C31128a aVar) {
            this.f42075d.f42015K.mo4826r(aVar);
            this.f42075d.f42051l0.onNext(C41238w.f97225a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40153a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$d */
    public interface C14342d {
        /* renamed from: a */
        C14337b mo32530a(long j);
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$e */
    public /* synthetic */ class C14343e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42076a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                dk0.a[] r0 = dk0.C20031a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                dk0.a r1 = dk0.C20031a.CARD_NETWORK_AMEX     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                dk0.a r1 = dk0.C20031a.CARD_NETWORK_DISCOVER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                dk0.a r1 = dk0.C20031a.CARD_NETWORK_MASTERCARD     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                dk0.a r1 = dk0.C20031a.CARD_NETWORK_QUICPAY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                dk0.a r1 = dk0.C20031a.CARD_NETWORK_PRIVATE_LABEL     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                dk0.a r1 = dk0.C20031a.CARD_NETWORK_VISA     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f42076a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardproducts.presentation.carddetail.C14337b.C14343e.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$f */
    static final class C14344f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14337b f42077d;

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$f$a */
        static final class C14345a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14337b f42078d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14345a(C14337b bVar) {
                super(1);
                this.f42078d = bVar;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "entities");
                C14337b bVar = this.f42078d;
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(bVar.f42068w.mo26555a((C17080e) it.next()));
                }
                return arrayList;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14344f(C14337b bVar) {
            super(1);
            this.f42077d = bVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            String str;
            C26765d a;
            C41536l.m120489i(wVar, "it");
            C16589c Pw = this.f42077d.f42066u;
            C16800a Jw = this.f42077d.m53159xx();
            if (Jw == null || (a = Jw.mo43920a()) == null) {
                str = null;
            } else {
                str = a.mo66005J();
            }
            if (str == null) {
                str = "";
            }
            return Pw.mo43742a(str).mo95062A(new C14369d(new C14345a(this.f42077d))).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$g */
    static final class C14346g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14337b f42079d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14346g(C14337b bVar) {
            super(1);
            this.f42079d = bVar;
        }

        /* renamed from: a */
        public final void mo40156a(List list) {
            C26765d a;
            C14337b bVar = this.f42079d;
            C41536l.m120488h(list, "benefits");
            bVar.f42012H = list;
            C16800a Jw = this.f42079d.m53159xx();
            if (Jw != null && (a = Jw.mo43920a()) != null) {
                C14337b bVar2 = this.f42079d;
                bVar2.m53138mx(a, bVar2.f42011G, bVar2.f42012H);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40156a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$h */
    static final class C14347h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14337b f42080d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14347h(C14337b bVar) {
            super(1);
            this.f42080d = bVar;
        }

        /* renamed from: a */
        public final void mo40157a(C41205b bVar) {
            this.f42080d.f42018N.mo4823o(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40157a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$i */
    static final class C14348i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14337b f42081d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14348i(C14337b bVar) {
            super(1);
            this.f42081d = bVar;
        }

        /* renamed from: a */
        public final void mo40158a(C26764c cVar) {
            C26765d a;
            String str;
            String c;
            if (this.f42081d.m53159xx() == null) {
                this.f42081d.f42018N.mo4823o(new C31128a.C31129a(new Throwable(), 0, (Object) null, 6, (DefaultConstructorMarker) null));
                return;
            }
            C16800a Jw = this.f42081d.m53159xx();
            if (Jw != null && (a = Jw.mo43920a()) != null) {
                C14337b bVar = this.f42081d;
                C1644x Yw = bVar.f42018N;
                CardExtraDetailsUIModel a2 = bVar.f42042h.mo65072a(cVar.mo65991a(), cVar.mo65992b());
                String d = C27950a.m86287d(a.mo65996A(), false, 2, (Object) null);
                String i = a.mo66029i();
                String N = a.mo66009N();
                String J = a.mo66005J();
                C26763b f = a.mo66025f();
                if (f == null || (c = f.mo65986c()) == null) {
                    str = null;
                } else {
                    str = C32289b0.m95091c(c);
                }
                Yw.mo4823o(new C31128a.C31131c(new DigitalCardInfo(a2, d, i, N, J, str), 0, 2, (DefaultConstructorMarker) null));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40158a((C26764c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$j */
    static final class C14349j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14337b f42082d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14349j(C14337b bVar) {
            super(1);
            this.f42082d = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C1644x Yw = this.f42082d.f42018N;
            C41536l.m120488h(th, "it");
            Yw.mo4823o(new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$k */
    static final class C14350k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14337b f42083d;

        /* renamed from: e */
        final /* synthetic */ String f42084e;

        /* renamed from: f */
        final /* synthetic */ String f42085f;

        /* renamed from: g */
        final /* synthetic */ String f42086g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14350k(C14337b bVar, String str, String str2, String str3) {
            super(1);
            this.f42083d = bVar;
            this.f42084e = str;
            this.f42085f = str2;
            this.f42086g = str3;
        }

        /* renamed from: a */
        public final ApproveOpcParams invoke(C41224m mVar) {
            Long l;
            C26765d a;
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            String a2 = ((C19764a) mVar.mo95675a()).mo48004a();
            String a3 = ((C19765b) mVar.mo95676b()).mo48008a();
            C16800a Jw = this.f42083d.m53159xx();
            Long l2 = null;
            if (Jw == null || (a = Jw.mo43920a()) == null) {
                l = null;
            } else {
                l = Long.valueOf(a.mo66030j());
            }
            String valueOf = String.valueOf(l);
            C37228a a4 = this.f42083d.f42054n.mo89562a();
            if (a4 != null) {
                l2 = Long.valueOf(a4.mo90305b());
            }
            return new ApproveOpcParams(a2, a3, valueOf, String.valueOf(l2), C10146d0.C10177h.m37232a(), this.f42084e, this.f42085f, this.f42086g);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$l */
    static final class C14351l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14337b f42087d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14351l(C14337b bVar) {
            super(1);
            this.f42087d = bVar;
        }

        /* renamed from: a */
        public final void mo40161a(ApproveOpcParams approveOpcParams) {
            if (approveOpcParams.hasScaParams()) {
                this.f42087d.f42045i0.onNext(approveOpcParams);
                return;
            }
            C1644x cx = this.f42087d.f42030Z;
            String serviceId = approveOpcParams.getServiceId();
            C14337b bVar = this.f42087d;
            C41536l.m120488h(approveOpcParams, "it");
            C37224b.m109965d(cx, new C39938b0(serviceId, bVar.m53074Ex(approveOpcParams)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40161a((ApproveOpcParams) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$m */
    /* synthetic */ class C14352m extends C41535k implements C43075l {
        C14352m(Object obj) {
            super(1, obj, C10092j.class, "transform", "transformCardLimits(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C10092j) this.receiver).mo26565k(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$n */
    static final class C14353n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26765d f42088d;

        /* renamed from: e */
        final /* synthetic */ C14337b f42089e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14353n(C26765d dVar, C14337b bVar) {
            super(1);
            this.f42088d = dVar;
            this.f42089e = bVar;
        }

        /* renamed from: a */
        public final void mo40163a(List list) {
            Object obj;
            boolean z;
            C41536l.m120488h(list, "list");
            C26765d dVar = this.f42088d;
            C14337b bVar = this.f42089e;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                TokenInfo tokenInfo = (TokenInfo) obj;
                if (!C41536l.m120484d(tokenInfo.mo15180v(), dVar.mo66047z()) || !bVar.m53083Jx(tokenInfo.mo15183x(), bVar.f42058p.mo64939b(dVar.mo66022d()))) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            TokenInfo tokenInfo2 = (TokenInfo) obj;
            if (tokenInfo2 != null) {
                C14337b bVar2 = this.f42089e;
                ViewTokenRequest a = new ViewTokenRequest.C4887a().mo15197c(tokenInfo2.mo15178R()).mo15196b(tokenInfo2.mo15181w()).mo15195a();
                C41536l.m120488h(a, "Builder().setTokenServic…it.issuerTokenId).build()");
                C37224b.m109965d(bVar2.f42032b0, a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40163a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$o */
    static final class C14354o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14337b f42090d;

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$o$a */
        static final class C14355a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14337b f42091d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14355a(C14337b bVar) {
                super(1);
                this.f42091d = bVar;
            }

            /* renamed from: a */
            public final C18031b invoke(C20034d dVar) {
                C20262b bVar;
                boolean z;
                C41536l.m120489i(dVar, "cardStatus");
                C14337b bVar2 = this.f42091d;
                String a = dVar.mo48415a();
                if (a != null) {
                    bVar = this.f42091d.m53136lx(a);
                } else {
                    bVar = null;
                }
                bVar2.f42006B = bVar;
                if (dVar.mo48416b() == C20261a.f55148e) {
                    return C18031b.C18033b.f51260a;
                }
                if (dVar.mo48415a() != null) {
                    z = true;
                } else {
                    z = false;
                }
                return new C18031b.C18034c(z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14354o(C14337b bVar) {
            super(1);
            this.f42090d = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C18031b m53239c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C18031b) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Boolean bool) {
            C41536l.m120489i(bool, "it");
            C26765d dVar = null;
            C31128a.C31131c cVar = new C31128a.C31131c(C18031b.C18032a.f51259a, 0, 2, (DefaultConstructorMarker) null);
            if (!bool.booleanValue()) {
                return C40749p.m118043h0(cVar);
            }
            C16800a Jw = this.f42090d.m53159xx();
            if (Jw != null) {
                dVar = Jw.mo43920a();
            }
            if (dVar == null || !this.f42090d.f42062r.deviceCanSupportGooglePay()) {
                return C40749p.m118043h0(cVar);
            }
            C40762x A = this.f42090d.f42048k.mo47613a(this.f42090d.m53142ox(dVar)).mo95062A(new C14370e(new C14355a(this.f42090d)));
            C41536l.m120488h(A, "private fun subscribeToC…ndToLifecycle()\n        }");
            return C31270e.m92880i(C32343x.m95465l1(A), -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$p */
    static final class C14356p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14337b f42092d;

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$p$a */
        static final class C14357a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14337b f42093d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14357a(C14337b bVar) {
                super(1);
                this.f42093d = bVar;
            }

            /* renamed from: a */
            public final void mo40167a(C18031b bVar) {
                C26765d a;
                this.f42093d.f42014J.mo4823o(bVar);
                C14337b bVar2 = this.f42093d;
                C18031b.C18033b bVar3 = C18031b.C18033b.f51260a;
                bVar2.f42011G = C41536l.m120484d(bVar, bVar3);
                C16800a Jw = this.f42093d.m53159xx();
                if (Jw != null && (a = Jw.mo43920a()) != null) {
                    C14337b bVar4 = this.f42093d;
                    bVar4.mo40134jl().mo4823o(a.mo66038r());
                    bVar4.m53138mx(a, C41536l.m120484d(bVar, bVar3), bVar4.f42012H);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40167a((C18031b) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$p$b */
        static final class C14358b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14337b f42094d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14358b(C14337b bVar) {
                super(1);
                this.f42094d = bVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C26765d a;
                C41536l.m120489i(th, "it");
                this.f42094d.f42014J.mo4823o(C18031b.C18032a.f51259a);
                C16800a Jw = this.f42094d.m53159xx();
                if (Jw != null && (a = Jw.mo43920a()) != null) {
                    C14337b bVar = this.f42094d;
                    bVar.m53138mx(a, false, bVar.f42012H);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14356p(C14337b bVar) {
            super(1);
            this.f42092d = bVar;
        }

        /* renamed from: a */
        public final void mo40166a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C14357a(this.f42092d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C14358b(this.f42092d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40166a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$q */
    static final class C14359q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14337b f42095d;

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$q$a */
        static final class C14360a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14337b f42096d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14360a(C14337b bVar) {
                super(1);
                this.f42096d = bVar;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "list");
                C14337b bVar = this.f42096d;
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(bVar.f42069x.mo45907a((C16801b) it.next()));
                }
                return arrayList;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14359q(C14337b bVar) {
            super(1);
            this.f42095d = bVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            long j;
            C26765d a;
            C41536l.m120489i(wVar, "it");
            C16600j Rw = this.f42095d.f42065t;
            C16800a Jw = this.f42095d.m53159xx();
            if (Jw == null || (a = Jw.mo43920a()) == null) {
                j = 0;
            } else {
                j = a.mo66033m();
            }
            C40762x A = Rw.mo43748a(j).mo95062A(new C14371f(new C14360a(this.f42095d)));
            C41536l.m120488h(A, "private fun subscribeToG…ndToLifecycle()\n        }");
            return C31270e.m92880i(A, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$r */
    static final class C14361r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14337b f42097d;

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$r$a */
        static final class C14362a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14337b f42098d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14362a(C14337b bVar) {
                super(1);
                this.f42098d = bVar;
            }

            /* renamed from: a */
            public final PushTokenizeRequest invoke(C20035e eVar) {
                C41536l.m120489i(eVar, "pushTokenize");
                return this.f42098d.f42058p.mo64941d(eVar, this.f42098d.m53156vx());
            }
        }

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$r$b */
        /* synthetic */ class C14363b extends C41535k implements C43075l {
            C14363b(Object obj) {
                super(1, obj, C37224b.class, "postEvent", "postEvent(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", 1);
            }

            /* renamed from: b */
            public final void mo40173b(PushTokenizeRequest pushTokenizeRequest) {
                C41536l.m120489i(pushTokenizeRequest, "p0");
                C37224b.m109965d((C1644x) this.receiver, pushTokenizeRequest);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40173b((PushTokenizeRequest) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14361r(C14337b bVar) {
            super(1);
            this.f42097d = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final PushTokenizeRequest m53248d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (PushTokenizeRequest) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m53249e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(ApproveOpcParams approveOpcParams) {
            C41536l.m120489i(approveOpcParams, "it");
            C40734b y = this.f42097d.f42050l.mo49054a(this.f42097d.m53074Ex(approveOpcParams)).mo95062A(new C14372g(new C14362a(this.f42097d))).mo95084m(new C14373h(new C14363b(this.f42097d.f42031a0))).mo95092y();
            C41536l.m120488h(y, "private fun subscribeToO…ndToLifecycle()\n        }");
            return C32343x.m95413R0(C31270e.m92878g(y, -1));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$s */
    static final class C14364s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14337b f42099d;

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$s$a */
        static final class C14365a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14337b f42100d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14365a(C14337b bVar) {
                super(1);
                this.f42100d = bVar;
            }

            /* renamed from: a */
            public final void mo40175a(List list) {
                String str;
                List Gw = this.f42100d.f42009E;
                C41536l.m120488h(list, "it");
                C32343x.m95475p(Gw, list);
                C1644x ax = this.f42100d.f42053m0;
                CardDailyLimitUiModel Vw = this.f42100d.f42010F;
                if (Vw != null) {
                    str = Vw.mo84222a();
                } else {
                    str = null;
                }
                C37224b.m109965d(ax, new C18795c(list, str));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40175a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14364s(C14337b bVar) {
            super(1);
            this.f42099d = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m53254c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40762x m = this.f42099d.m53086Lx().mo95084m(new C14374i(new C14365a(this.f42099d)));
            C41536l.m120488h(m, "private fun subscribeToS…ndToLifecycle()\n        }");
            return C31270e.m92880i(m, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$t */
    static final class C14366t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14337b f42101d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14366t(C14337b bVar) {
            super(1);
            this.f42101d = bVar;
        }

        /* renamed from: a */
        public final void mo40176a(C41205b bVar) {
            this.f42101d.f42019O.mo4823o(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40176a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.b$u */
    static final class C14367u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14337b f42102d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14367u(C14337b bVar) {
            super(1);
            this.f42102d = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C1644x Xw = this.f42102d.f42019O;
            C41536l.m120488h(th, "it");
            Xw.mo4823o(new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
            this.f42102d.mo40101c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14337b(C38884p0 p0Var, C25352k kVar, C16595i iVar, C38879n nVar, C26145c cVar, C38880n0 n0Var, C31658b bVar, C19392a aVar, C20524h hVar, C20526j jVar, C36735g gVar, C20292b bVar2, C26050a aVar2, C8973b bVar3, PreferencesApiManager preferencesApiManager, C16792w0 w0Var, C16600j jVar2, C16589c cVar2, Client client, C10092j jVar3, C18262a aVar3, C27494a aVar4, long j) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C38884p0 p0Var2 = p0Var;
        C25352k kVar2 = kVar;
        C16595i iVar2 = iVar;
        C38879n nVar2 = nVar;
        C26145c cVar3 = cVar;
        C38880n0 n0Var2 = n0Var;
        C31658b bVar4 = bVar;
        C19392a aVar5 = aVar;
        C20524h hVar2 = hVar;
        C20526j jVar4 = jVar;
        C36735g gVar2 = gVar;
        C20292b bVar5 = bVar2;
        C26050a aVar6 = aVar2;
        C16792w0 w0Var2 = w0Var;
        C41536l.m120489i(p0Var2, "reloadCardsUseCase");
        C41536l.m120489i(kVar2, "reloadProductsUseCase");
        C41536l.m120489i(iVar2, "getCardsAndBlockStatusesUseCase");
        C41536l.m120489i(nVar2, "getCardExtraDetailsUseCase");
        C41536l.m120489i(cVar3, "cardExtraDetailsModelMapper");
        C41536l.m120489i(n0Var2, "getBlockCardUseCase");
        C41536l.m120489i(bVar4, "startTMXProfilingUseCase");
        C41536l.m120489i(aVar5, "checkIfCardIsAddedToWallet");
        C41536l.m120489i(hVar2, "generateOpcUseCase");
        C41536l.m120489i(jVar4, "getHardwareAndWalletId");
        C41536l.m120489i(gVar2, "getLoginInfo");
        C41536l.m120489i(bVar5, "getAppSettingByNameUseCase");
        C41536l.m120489i(aVar6, "tokenizeMapper");
        C41536l.m120489i(bVar3, "tapAndPayClient");
        C41536l.m120489i(preferencesApiManager, "preferences");
        C41536l.m120489i(w0Var, "getSchoolCardLimitTypes");
        C41536l.m120489i(jVar2, "getChildInfoUseCase");
        C41536l.m120489i(cVar2, "getCardBenefitsUseCase");
        C41536l.m120489i(client, "client");
        C41536l.m120489i(jVar3, "debitCardMapper");
        C41536l.m120489i(aVar3, "cardDetailsUiMapper");
        C41536l.m120489i(aVar4, "otpParamsMapBuilder");
        this.f42034d = p0Var2;
        this.f42036e = kVar2;
        this.f42038f = iVar2;
        this.f42040g = nVar2;
        this.f42042h = cVar3;
        this.f42044i = n0Var2;
        this.f42046j = bVar4;
        this.f42048k = aVar5;
        this.f42050l = hVar2;
        this.f42052m = jVar4;
        this.f42054n = gVar2;
        this.f42056o = bVar5;
        this.f42058p = aVar6;
        this.f42060q = bVar3;
        this.f42062r = preferencesApiManager;
        this.f42064s = w0Var;
        this.f42065t = jVar2;
        this.f42066u = cVar2;
        this.f42067v = client;
        this.f42068w = jVar3;
        this.f42069x = aVar3;
        this.f42070y = aVar4;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f42008D = h1;
        this.f42009E = new ArrayList();
        this.f42012H = C41341q.m119907j();
        this.f42013I = new C1644x();
        this.f42014J = new C1644x();
        this.f42015K = new C1644x();
        this.f42016L = new C1644x();
        this.f42017M = new C1644x();
        this.f42018N = new C1644x();
        this.f42019O = new C1644x();
        this.f42020P = new C1644x();
        this.f42021Q = new C1644x();
        this.f42022R = new C1644x();
        this.f42023S = new C1644x();
        this.f42024T = new C1644x();
        this.f42025U = new C1644x();
        this.f42026V = new C1644x();
        this.f42027W = new C1644x();
        this.f42028X = new C1644x();
        this.f42029Y = new C1644x();
        this.f42030Z = new C1644x();
        this.f42031a0 = new C1644x();
        this.f42032b0 = new C1644x();
        this.f42033c0 = new C1644x();
        Boolean bool = Boolean.FALSE;
        this.f42035d0 = new C1644x(bool);
        this.f42037e0 = new C1644x(bool);
        this.f42039f0 = new C1644x();
        this.f42041g0 = new C1644x();
        this.f42043h0 = new C1644x();
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<ApproveOpcParams>()");
        this.f42045i0 = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<Boolean>()");
        this.f42047j0 = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<Unit>()");
        this.f42049k0 = h14;
        C40767b h15 = C40767b.m118210h1();
        C41536l.m120488h(h15, "create<Unit>()");
        this.f42051l0 = h15;
        this.f42053m0 = new C1644x();
        this.f42055n0 = new C1644x();
        this.f42057o0 = new C1644x();
        this.f42059p0 = new C1644x();
        this.f42061q0 = new C1644x();
        this.f42063r0 = new C1644x();
        this.f42007C = j;
        C41205b F0 = C40749p.m118049m0(onInit(), onRefresh(), p0Var.mo92582b().mo95026k0(new C17406h(C14338a.f42072d))).mo94989L0(new C17408i(new C14339b(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C17410j(new C14341c(this)));
        C41536l.m120488h(F0, "merge(\n                o…nNext(Unit)\n            }");
        bindToLifecycle(F0);
        m53105Vx();
        m53095Qx();
        m53109Xx();
        m53101Tx();
        m53144px();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ax */
    public static final void m53069Ax(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ex */
    public final HashMap m53074Ex(OtpParams otpParams) {
        return this.f42070y.mo66809a(otpParams);
    }

    /* renamed from: Gx */
    private final C39938b0 m53077Gx(String str, String str2, String str3) {
        String str4;
        C16800a xx = m53159xx();
        if (xx == null) {
            return null;
        }
        if (xx.mo43921b()) {
            str4 = BankApi.SERVICE_UNBLOCK_CARD;
        } else {
            str4 = BankApi.SERVICE_BLOCK_CARD;
        }
        return new C39938b0(str4, m53074Ex(new BlockCardParams(String.valueOf(this.f42007C), str4, str, str2, str3)));
    }

    /* renamed from: Hx */
    private final C39938b0 m53079Hx(String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        C26765d a;
        String n;
        C26765d a2;
        String l;
        if (m53159xx() == null) {
            return null;
        }
        C16800a xx = m53159xx();
        if (xx == null || (a2 = xx.mo43920a()) == null || (l = Long.valueOf(a2.mo66030j()).toString()) == null) {
            str5 = "";
        } else {
            str5 = l;
        }
        C16800a xx2 = m53159xx();
        if (xx2 == null || (a = xx2.mo43920a()) == null || (n = a.mo66034n()) == null) {
            str6 = "";
        } else {
            str6 = n;
        }
        return new C39938b0(BankApi.CARDS_GET_VIRTUAL_CARD_DETAILS, m53074Ex(new SCACardDetailsParams(str5, str6, str, BankApi.CARDS_GET_VIRTUAL_CARD_DETAILS, str2, str3, str4)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.mo43920a();
     */
    /* renamed from: Ix */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m53081Ix() {
        /*
            r2 = this;
            mn.a r0 = r2.m53159xx()
            if (r0 == 0) goto L_0x0011
            o70.d r0 = r0.mo43920a()
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.mo66001F()
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            f31.a r1 = f31.C31922a.CREDIT_CARD
            java.lang.String r1 = r1.mo72370b()
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardproducts.presentation.carddetail.C14337b.m53081Ix():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: Jx */
    public final boolean m53083Jx(int i, C20031a aVar) {
        switch (C14343e.f42076a[aVar.ordinal()]) {
            case 1:
                if (i != 1) {
                    return false;
                }
                break;
            case 2:
                if (i != 2) {
                    return false;
                }
                break;
            case 3:
                if (i != 3) {
                    return false;
                }
                break;
            case 4:
                if (i != 10) {
                    return false;
                }
                break;
            case 5:
                if (i != 6) {
                    return false;
                }
                break;
            case 6:
                if (i != 4) {
                    return false;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: Lx */
    public final C40762x m53086Lx() {
        if (this.f42009E.isEmpty()) {
            C40762x A = this.f42064s.mo43913a().mo95062A(new C17421s(new C14352m(this.f42068w)));
            C41536l.m120488h(A, "getSchoolCardLimitTypes(…bitCardMapper::transform)");
            return A;
        }
        C40762x z = C40762x.m118162z(this.f42009E);
        C41536l.m120488h(z, "just(cardLimits)");
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: Mx */
    public static final List m53088Mx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ox */
    public static final void m53091Ox(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Px */
    private final void m53093Px(String str) {
        bindToLifecycle(this.f42046j.mo72084b(str));
    }

    /* renamed from: Qx */
    private final void m53095Qx() {
        C41205b F0 = this.f42047j0.mo94989L0(new C17394b(new C14354o(this))).mo94981F0(new C17415m(new C14356p(this)));
        C41536l.m120488h(F0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Rx */
    public static final C40754t m53097Rx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Sx */
    public static final void m53099Sx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Tx */
    private final void m53101Tx() {
        C40749p L0 = this.f42049k0.mo94989L0(new C17416n(new C14359q(this)));
        C41536l.m120488h(L0, "private fun subscribeToG…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f42041g0));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ux */
    public static final C40754t m53103Ux(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Vx */
    private final void m53105Vx() {
        C40749p L0 = this.f42045i0.mo94989L0(new C17420r(new C14361r(this)));
        C41536l.m120488h(L0, "private fun subscribeToO…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f42029Y));
    }

    /* access modifiers changed from: private */
    /* renamed from: Wx */
    public static final C40754t m53107Wx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Xx */
    private final void m53109Xx() {
        C40749p L0 = this.f42008D.mo94989L0(new C17419q(new C14364s(this)));
        C41536l.m120488h(L0, "private fun subscribeToS…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f42055n0));
    }

    /* access modifiers changed from: private */
    /* renamed from: Yx */
    public static final C40754t m53111Yx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Zx */
    public static final void m53113Zx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ay */
    public static final void m53115ay(C14337b bVar) {
        C41536l.m120489i(bVar, "this$0");
        bVar.f42019O.mo4823o(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null));
        bVar.mo40101c();
    }

    /* access modifiers changed from: private */
    /* renamed from: cy */
    public static final void m53118cy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lx */
    public final C20262b m53136lx(String str) {
        String str2;
        C26765d a;
        C26050a aVar = this.f42058p;
        String vx = m53156vx();
        C16800a xx = m53159xx();
        if (xx == null || (a = xx.mo43920a()) == null) {
            str2 = null;
        } else {
            str2 = a.mo66022d();
        }
        return aVar.mo64938a(vx, String.valueOf(str2), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: mx */
    public final void m53138mx(C26765d dVar, boolean z, List list) {
        Boolean bool;
        boolean z2;
        boolean z3;
        boolean z4;
        AdditionalFunctionType additionalFunctionType;
        boolean z5;
        boolean z6;
        C16800a xx = m53159xx();
        String str = null;
        if (xx != null) {
            bool = Boolean.valueOf(xx.mo43921b());
        } else {
            bool = null;
        }
        List c = C41339p.m119898c();
        if (!list.isEmpty()) {
            c.add(C14391a.m53292c(C14391a.f42131e.mo40259c(), (AdditionalFunctionType) null, false, true, false, 11, (Object) null));
        }
        CardInsSecCardModel y = dVar.mo66046y();
        if (y == null || !y.mo55715j()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            C14391a f = C14391a.f42131e.mo40262f();
            CardInsSecCardModel y2 = dVar.mo66046y();
            if (y2 != null) {
                str = y2.mo55718m();
            }
            if (str != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            c.add(C14391a.m53292c(f, (AdditionalFunctionType) null, z6, false, false, 13, (Object) null));
        }
        C14391a.C14392a aVar = C14391a.f42131e;
        C14391a i = aVar.mo40265i();
        C16800a xx2 = m53159xx();
        C41536l.m120486f(xx2);
        CardInsSecCardModel y3 = xx2.mo43920a().mo66046y();
        if (y3 != null) {
            z3 = y3.mo55723t();
        } else {
            z3 = false;
        }
        if (bool == null || bool.booleanValue()) {
            z4 = false;
        } else {
            z4 = true;
        }
        c.add(C14391a.m53292c(i, (AdditionalFunctionType) null, z3, z4, false, 9, (Object) null));
        if (dVar.mo66044w() && z) {
            c.add(aVar.mo40258b());
        }
        c.add(C14391a.m53292c(aVar.mo40263g(), (AdditionalFunctionType) null, false, dVar.mo66023e(), false, 11, (Object) null));
        if (dVar.mo66018W() && !this.f42067v.getUserRestrictions().contains(UserRestrictions.SCOOLCARDS_GET_DAILY_LIMIT_TYPES)) {
            this.f42035d0.mo4823o(Boolean.TRUE);
            this.f42017M.mo4823o(C41339p.m119900e(C14391a.m53292c(aVar.mo40257a(), (AdditionalFunctionType) null, false, false, false, 11, (Object) null)));
        }
        if (this.f42067v.getUserRestrictions().contains(UserRestrictions.SCOOLCARDS_GET_DAILY_LIMIT_TYPES)) {
            this.f42037e0.mo4823o(Boolean.TRUE);
        }
        if (dVar.mo66023e()) {
            C14391a d = aVar.mo40260d();
            if (dVar.mo65999D() || dVar.mo65998C()) {
                z5 = true;
            } else {
                z5 = false;
            }
            c.add(C14391a.m53292c(d, (AdditionalFunctionType) null, false, z5, false, 11, (Object) null));
        }
        if (dVar.mo65999D() || dVar.mo65998C()) {
            C14391a h = aVar.mo40264h();
            if (dVar.mo65998C()) {
                additionalFunctionType = AdditionalFunctionType.RecoverExpiringCard.f42129k;
            } else {
                additionalFunctionType = AdditionalFunctionType.RecoverCard.f42128k;
            }
            c.add(C14391a.m53292c(h, additionalFunctionType, false, false, false, 10, (Object) null));
        }
        if (bool == null || !bool.booleanValue()) {
            this.f42039f0.mo4823o(Boolean.FALSE);
        } else {
            this.f42039f0.mo4823o(Boolean.TRUE);
        }
        this.f42016L.mo4823o(C41339p.m119896a(c));
    }

    /* renamed from: nx */
    private final void m53140nx(boolean z) {
        boolean z2;
        boolean a = C20101a.f54724a.mo48497a(this.f42056o);
        C40767b bVar = this.f42047j0;
        if (!z || !a) {
            z2 = false;
        } else {
            z2 = true;
        }
        bVar.onNext(Boolean.valueOf(z2));
    }

    /* access modifiers changed from: private */
    /* renamed from: ox */
    public final C20032b m53142ox(C26765d dVar) {
        return new C20032b(dVar.mo66047z(), this.f42058p.mo64939b(dVar.mo66022d()), this.f42058p.mo64940c(dVar.mo66022d()));
    }

    /* renamed from: px */
    private final void m53144px() {
        C41205b F0 = this.f42051l0.mo94989L0(new C17417o(new C14344f(this))).mo94981F0(new C17418p(new C14346g(this)));
        C41536l.m120488h(F0, "private fun getCardBenef…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: qx */
    public static final C40754t m53146qx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rx */
    public static final void m53148rx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sx */
    public static final void m53150sx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: tx */
    public static final void m53152tx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ux */
    public static final void m53154ux(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vx */
    public final String m53156vx() {
        String str;
        boolean z;
        C26765d a;
        C26765d a2;
        C16800a xx = m53159xx();
        String str2 = null;
        if (xx == null || (a2 = xx.mo43920a()) == null) {
            str = null;
        } else {
            str = a2.mo66032l();
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str3 = (String) C32343x.m95409P0(str, z);
        if (str3 != null) {
            return str3;
        }
        C16800a xx2 = m53159xx();
        if (!(xx2 == null || (a = xx2.mo43920a()) == null)) {
            str2 = a.mo65996A();
        }
        return C32343x.m95420V(str2, C32343x.m95452h0(C12932f.f38191l, new Object[0]), new Object[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final Integer m53158xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Integer) lVar.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: mn.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: mn.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: mn.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: mn.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: xx */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p524mn.C16800a m53159xx() {
        /*
            r7 = this;
            androidx.lifecycle.x r0 = r7.f42015K
            java.lang.Object r0 = r0.mo4814f()
            b41.a r0 = (b41.C31128a) r0
            boolean r1 = r0 instanceof b41.C31128a.C31131c
            r2 = 0
            if (r1 == 0) goto L_0x0042
            b41.a$c r0 = (b41.C31128a.C31131c) r0
            java.lang.Object r0 = r0.mo71340a()
            he1.m r0 = (he1.C41224m) r0
            java.lang.Object r0 = r0.mo95678e()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r0.next()
            r3 = r1
            mn.a r3 = (p524mn.C16800a) r3
            o70.d r3 = r3.mo43920a()
            long r3 = r3.mo66030j()
            long r5 = r7.f42007C
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x003c
            r3 = 1
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            if (r3 == 0) goto L_0x001f
            r2 = r1
        L_0x0040:
            mn.a r2 = (p524mn.C16800a) r2
        L_0x0042:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardproducts.presentation.carddetail.C14337b.m53159xx():mn.a");
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final C40754t m53160yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: yx */
    private final void m53161yx(String str, String str2, String str3) {
        C40762x A = this.f42052m.mo49055b().mo95062A(new C17412k(new C14350k(this, str, str2, str3)));
        C41536l.m120488h(A, "private fun getHardwareA…ndToLifecycle()\n        }");
        C40734b y = C32343x.m95465l1(A).mo95084m(new C17414l(new C14351l(this))).mo95092y();
        C41536l.m120488h(y, "private fun getHardwareA…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(C31270e.m92878g(y, -1), this.f42029Y));
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final void m53162zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zx */
    public static final ApproveOpcParams m53163zx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (ApproveOpcParams) lVar.invoke(obj);
    }

    /* renamed from: Bi */
    public void mo40087Bi() {
        C32343x.m95397J0(this, "sCool_number", (String) null, "click_number", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        C37224b.m109966e(this.f42059p0, C41238w.f97225a);
    }

    /* renamed from: Bx */
    public final C14335a mo40114Bx() {
        return this.f42071z;
    }

    /* renamed from: C4 */
    public LiveData mo40115C4() {
        return this.f42053m0;
    }

    /* renamed from: Cx */
    public LiveData mo40116Cx() {
        return this.f42023S;
    }

    /* renamed from: Ds */
    public void mo40088Ds(boolean z) {
        String str;
        if (m53081Ix()) {
            C10463g F = C36546y.m108282F();
            C16800a xx = m53159xx();
            boolean z2 = false;
            if (xx != null && xx.mo43921b()) {
                z2 = true;
            }
            if (z2) {
                str = "credit_cards_unblock_card";
            } else {
                str = "credit_cards_block_card";
            }
            F.mo27152s("credit_cards_page", "", str);
        } else {
            C36546y.m108282F().mo27152s("debit_cards_page", "", "block_card_click");
        }
        if (m53159xx() != null) {
            C39938b0 Gx = m53077Gx((String) null, (String) null, (String) null);
            if (!z) {
                m53093Px(TMXFlags.TMX_FLAG_CARD_UNBLOCK);
                if (Gx != null) {
                    Gx.mo93673a().put("tmxSessionId", C10146d0.C10177h.m37232a());
                    this.f42023S.mo4826r(new C37223a(Gx));
                }
            } else if (Gx != null) {
                this.f42023S.mo4826r(new C37223a(Gx));
            }
        }
    }

    /* renamed from: Dx */
    public LiveData mo40117Dx() {
        return this.f42024T;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r0 != false) goto L_0x002c;
     */
    /* renamed from: Ej */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo40089Ej() {
        /*
            r3 = this;
            mn.a r0 = r3.m53159xx()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.mo43921b()
            if (r0 != r1) goto L_0x0010
            r0 = r1
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            if (r0 != 0) goto L_0x002b
            mn.a r0 = r3.m53159xx()
            if (r0 == 0) goto L_0x0027
            o70.d r0 = r0.mo43920a()
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.mo66044w()
            if (r0 != r1) goto L_0x0027
            r0 = r1
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            if (r0 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            r3.m53140nx(r1)
            ee1.b r0 = r3.f42051l0
            he1.w r1 = he1.C41238w.f97225a
            r0.onNext(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardproducts.presentation.carddetail.C14337b.mo40089Ej():void");
    }

    /* renamed from: Fx */
    public final C17392a mo40118Fx() {
        return this.f42005A;
    }

    /* renamed from: Gk */
    public void mo40090Gk() {
        C39938b0 Hx;
        m53093Px(TMXFlags.TMX_FLAG_CARD_INFO_KEY);
        C36546y.m108282F().mo27152s("debit_cards_page", "", "debit_card_details_click");
        if (m53159xx() != null && (Hx = m53079Hx(C10146d0.C10177h.m37232a(), (String) null, (String) null, (String) null)) != null) {
            this.f42024T.mo4826r(new C37223a(Hx));
        }
    }

    /* renamed from: In */
    public void mo40091In(String str, String str2, String str3) {
        C39938b0 Gx = m53077Gx(str, str2, str3);
        if (Gx != null) {
            C41205b G = this.f42044i.mo92578a(Gx.mo93673a()).mo94906z(C40992a.m118827a()).mo94904r(new C17398d(new C14366t(this))).mo94888G(new C17400e(this), new C17402f(new C14367u(this)));
            C41536l.m120488h(G, "override fun toggleCardB…)\n            }\n        }");
            bindToLifecycle(G);
        }
    }

    /* renamed from: Kv */
    public LiveData mo40119Kv() {
        return this.f42022R;
    }

    /* renamed from: Kx */
    public void mo40120Kx() {
        if (m53081Ix()) {
            C36546y.m108282F().mo27152s("credit_cards_page", "", "credit_cards_change_pin");
        } else {
            C36546y.m108282F().mo27152s("debit_cards_page", "", "change_pincode_click");
        }
        C16800a xx = m53159xx();
        if (xx != null) {
            this.f42027W.mo4826r(C32343x.m95466m(new C41224m(Long.valueOf(xx.mo43920a().mo66030j()), Boolean.valueOf(m53081Ix()))));
        }
    }

    /* renamed from: La */
    public void mo40092La() {
        C37224b.m109966e(this.f42061q0, this.f42012H);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: Lu */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo40093Lu(p622tn.C18030a r14) {
        /*
            r13 = this;
            java.lang.String r0 = "childInfoUiModel"
            kotlin.jvm.internal.C41536l.m120489i(r14, r0)
            java.lang.String r0 = r14.mo45725c()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0015
            r0 = r1
            goto L_0x0016
        L_0x0015:
            r0 = r2
        L_0x0016:
            if (r0 != r1) goto L_0x001a
            r0 = r1
            goto L_0x001b
        L_0x001a:
            r0 = r2
        L_0x001b:
            if (r0 == 0) goto L_0x004a
            androidx.lifecycle.x r0 = r13.f42017M
            r3 = 2
            ge.bog.mobilebank.cardproducts.presentation.carddetail.model.a[] r3 = new p341ge.bog.mobilebank.cardproducts.presentation.carddetail.model.C14391a[r3]
            ge.bog.mobilebank.cardproducts.presentation.carddetail.model.a$a r4 = p341ge.bog.mobilebank.cardproducts.presentation.carddetail.model.C14391a.f42131e
            ge.bog.mobilebank.cardproducts.presentation.carddetail.model.a r5 = r4.mo40257a()
            r3[r2] = r5
            ge.bog.mobilebank.cardproducts.presentation.carddetail.model.a r6 = r4.mo40261e()
            ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$FinancialNumber r7 = new ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$FinancialNumber
            java.lang.String r14 = r14.mo45725c()
            r7.<init>(r14)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 14
            r12 = 0
            ge.bog.mobilebank.cardproducts.presentation.carddetail.model.a r14 = p341ge.bog.mobilebank.cardproducts.presentation.carddetail.model.C14391a.m53292c(r6, r7, r8, r9, r10, r11, r12)
            r3[r1] = r14
            java.util.List r14 = ie1.C41341q.m119910m(r3)
            r0.mo4823o(r14)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardproducts.presentation.carddetail.C14337b.mo40093Lu(tn.a):void");
    }

    /* renamed from: Ng */
    public void mo40094Ng() {
        this.f42049k0.onNext(C41238w.f97225a);
    }

    /* renamed from: Nx */
    public void mo40121Nx() {
        this.f42008D.onNext(C41238w.f97225a);
    }

    /* renamed from: Of */
    public LiveData mo40122Of() {
        return this.f42018N;
    }

    /* renamed from: Q9 */
    public void mo40095Q9() {
        C26765d a;
        CardInsSecCardModel y;
        if (m53081Ix()) {
            C36546y.m108282F().mo27152s("credit_cards_page", "", "credit_cards_insurance_click");
        }
        C16800a xx = m53159xx();
        if (xx != null && (a = xx.mo43920a()) != null && (y = a.mo66046y()) != null) {
            this.f42020P.mo4826r(new C37223a(y));
        }
    }

    /* renamed from: Tc */
    public void mo40096Tc() {
        C26765d a;
        C16800a xx = m53159xx();
        if (xx != null && (a = xx.mo43920a()) != null) {
            if (a.mo65999D() || a.mo65998C()) {
                C37224b.m109965d(this.f42028X, Long.valueOf(a.mo66030j()));
            }
        }
    }

    /* renamed from: Tj */
    public void mo40097Tj() {
        C36546y.m108285N().mo89313K().updateClientProducts();
        this.f42034d.mo92581a();
        this.f42036e.invoke();
    }

    /* renamed from: V2 */
    public LiveData mo40123V2() {
        return this.f42033c0;
    }

    /* renamed from: Vr */
    public LiveData mo40124Vr() {
        return this.f42035d0;
    }

    /* renamed from: X8 */
    public LiveData mo40125X8() {
        return this.f42029Y;
    }

    /* renamed from: Zl */
    public LiveData mo40126Zl() {
        return this.f42063r0;
    }

    /* renamed from: Zn */
    public LiveData mo40127Zn() {
        return this.f42059p0;
    }

    /* renamed from: Zr */
    public void mo40098Zr() {
        C26765d a;
        C16800a xx = m53159xx();
        if (xx != null && (a = xx.mo43920a()) != null) {
            this.f42060q.mo21124a().mo24864i(new C17404g(new C14353n(a, this)));
        }
    }

    /* renamed from: ap */
    public void mo40099ap(String str, String str2, String str3) {
        C39938b0 Hx = m53079Hx(C10146d0.C10177h.m37232a(), str, str2, str3);
        if (Hx != null) {
            C41205b I = this.f42040g.mo92577a(Hx.mo93673a()).mo95063B(C40992a.m118827a()).mo95083l(new C17422t(new C14347h(this))).mo95070I(new C17423u(new C14348i(this)), new C17396c(new C14349j(this)));
            C41536l.m120488h(I, "override fun getCardDeta…ndToLifecycle()\n        }");
            bindToLifecycle(I);
        }
    }

    /* renamed from: bm */
    public void mo40100bm() {
        C26765d a;
        String n;
        C1644x xVar = this.f42063r0;
        C16800a xx = m53159xx();
        if (xx != null && (a = xx.mo43920a()) != null && (n = a.mo66034n()) != null) {
            C37224b.m109965d(xVar, new C18035c(n, this.f42007C));
        }
    }

    /* renamed from: c */
    public void mo40101c() {
        this.f42034d.mo92581a();
    }

    /* renamed from: c7 */
    public void mo40102c7() {
        C26765d a;
        C36546y.m108282F().mo27152s("debit_cards_page", "", "payments_control_click");
        C16800a xx = m53159xx();
        if (xx != null && (a = xx.mo43920a()) != null) {
            this.f42022R.mo4826r(new C37223a(Long.valueOf(a.mo66030j())));
        }
    }

    /* renamed from: c9 */
    public LiveData mo40128c9() {
        return this.f42032b0;
    }

    /* renamed from: cv */
    public LiveData mo40129cv() {
        return this.f42041g0;
    }

    /* renamed from: d1 */
    public void mo40103d1() {
        C36546y.m108282F().mo27152s("debit_cards_page", "", "additional_functions_click");
        C16800a xx = m53159xx();
        if (xx != null) {
            this.f42025U.mo4826r(new C37223a(new C41224m(Long.valueOf(xx.mo43920a().mo66030j()), Long.valueOf(xx.mo43920a().mo66019a()))));
        }
    }

    /* renamed from: e1 */
    public void mo40104e1(CardDailyLimitUiModel cardDailyLimitUiModel) {
        C41536l.m120489i(cardDailyLimitUiModel, "cardDailyLimitUiModel");
        this.f42010F = cardDailyLimitUiModel;
    }

    /* renamed from: e5 */
    public LiveData mo40130e5() {
        return this.f42015K;
    }

    /* renamed from: ef */
    public LiveData mo40131ef() {
        return this.f42028X;
    }

    /* renamed from: f6 */
    public LiveData mo40132f6() {
        return this.f42043h0;
    }

    /* renamed from: f9 */
    public LiveData mo40133f9() {
        return this.f42021Q;
    }

    /* renamed from: fu */
    public void mo40105fu(long j) {
        this.f42007C = j;
        mo40089Ej();
    }

    /* renamed from: gj */
    public void mo40106gj(String str, String str2, String str3) {
        C20262b bVar = this.f42006B;
        if (bVar != null) {
            C37224b.m109965d(this.f42033c0, bVar);
            return;
        }
        this.f42043h0.mo4823o(Boolean.TRUE);
        m53093Px(TMXFlags.TMX_WALLET_CARD_ADD);
        m53161yx(str, str2, str3);
    }

    /* renamed from: he */
    public void mo40107he() {
        C32343x.m95397J0(this, "sCool_activation", (String) null, "click_activation", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        C37224b.m109966e(this.f42057o0, C41238w.f97225a);
    }

    /* renamed from: jt */
    public void mo40108jt() {
        C36546y.m108282F().mo27152s("debit_cards_page", "", "cancel_card_click");
        C16800a xx = m53159xx();
        if (xx != null) {
            this.f42026V.mo4826r(new C37223a(new C41224m(Long.valueOf(xx.mo43920a().mo66030j()), xx.mo43920a().mo66047z())));
        }
    }

    /* renamed from: kd */
    public LiveData mo40135kd() {
        return this.f42017M;
    }

    /* renamed from: kf */
    public LiveData mo40136kf() {
        return this.f42025U;
    }

    /* renamed from: le */
    public LiveData mo40137le() {
        return this.f42057o0;
    }

    /* renamed from: ls */
    public LiveData mo40138ls() {
        return this.f42014J;
    }

    /* renamed from: m7 */
    public LiveData mo40139m7() {
        return this.f42030Z;
    }

    /* renamed from: ms */
    public LiveData mo40140ms() {
        return this.f42019O;
    }

    /* renamed from: o */
    public LiveData mo40141o() {
        return this.f42020P;
    }

    /* renamed from: oe */
    public LiveData mo40142oe() {
        return this.f42016L;
    }

    /* renamed from: r5 */
    public void mo40109r5() {
        C26765d a;
        CardInsSecCardModel y;
        if (m53081Ix()) {
            C36546y.m108282F().mo27152s("credit_cards_page", "", "credit_cards_3D_security");
        } else {
            C36546y.m108282F().mo27152s("debit_cards_page", "", "3d_security_click");
        }
        C16800a xx = m53159xx();
        if (xx != null && (a = xx.mo43920a()) != null && (y = a.mo66046y()) != null) {
            this.f42021Q.mo4826r(new C37223a(y));
        }
    }

    /* renamed from: v5 */
    public LiveData mo40143v5() {
        return this.f42026V;
    }

    /* renamed from: vn */
    public LiveData mo40144vn() {
        return this.f42037e0;
    }

    /* renamed from: wx */
    public C1644x mo40134jl() {
        return this.f42013I;
    }

    /* renamed from: y1 */
    public LiveData mo40146y1() {
        return this.f42039f0;
    }

    /* renamed from: yv */
    public LiveData mo40147yv() {
        return this.f42027W;
    }

    /* renamed from: z7 */
    public LiveData mo40148z7() {
        return this.f42061q0;
    }

    /* renamed from: zd */
    public LiveData mo40149zd() {
        return this.f42031a0;
    }
}
