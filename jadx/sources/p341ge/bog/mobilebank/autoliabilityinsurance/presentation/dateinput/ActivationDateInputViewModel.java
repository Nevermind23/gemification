package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import g91.C32319m;
import java.util.Date;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p535nk.C17038p;
import p619tk.C17979a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.ActivationDateInputViewModel */
public interface ActivationDateInputViewModel {

    /* renamed from: a */
    public static final C13629a f40744a = C13629a.f40751a;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.ActivationDateInputViewModel$ViewModel */
    public static final class ViewModel extends C21481a implements C13630b, C13631c {

        /* renamed from: d */
        private final C17038p f40745d;

        /* renamed from: e */
        private final C13631c f40746e = this;

        /* renamed from: f */
        private final C13630b f40747f = this;

        /* renamed from: g */
        private final C1644x f40748g;

        /* renamed from: h */
        private final LiveData f40749h;

        /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.ActivationDateInputViewModel$ViewModel$a */
        static final class C13628a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C13628a f40750d = new C13628a();

            C13628a() {
                super(1);
            }

            /* renamed from: a */
            public final Boolean invoke(C17979a aVar) {
                return Boolean.valueOf(aVar.mo45667f());
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ViewModel(p535nk.C17038p r10, j51.C36732d r11, j51.C36734f r12) {
            /*
                r9 = this;
                java.lang.String r0 = "onActivationDetailsEntered"
                kotlin.jvm.internal.C41536l.m120489i(r10, r0)
                java.lang.String r0 = "getClientMails"
                kotlin.jvm.internal.C41536l.m120489i(r11, r0)
                java.lang.String r0 = "getClientPhones"
                kotlin.jvm.internal.C41536l.m120489i(r12, r0)
                r0 = 1
                r1 = 0
                r9.<init>(r1, r0, r1)
                r9.f40745d = r10
                r9.f40746e = r9
                r9.f40747f = r9
                androidx.lifecycle.x r10 = new androidx.lifecycle.x
                tk.a r0 = new tk.a
                ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.ActivationDateInputViewModel$a r2 = p341ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.ActivationDateInputViewModel.f40744a
                long r3 = r2.mo37523b()
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                r2 = r0
                r2.<init>(r3, r5, r6, r7, r8)
                r10.<init>(r0)
                r9.f40748g = r10
                ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.ActivationDateInputViewModel$ViewModel$a r0 = p341ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.ActivationDateInputViewModel.ViewModel.C13628a.f40750d
                androidx.lifecycle.LiveData r0 = androidx.lifecycle.C1607m0.m5655c(r10, r0)
                r9.f40749h = r0
                java.lang.Object r0 = r10.mo4814f()
                r2 = r0
                tk.a r2 = (p619tk.C17979a) r2
                if (r2 == 0) goto L_0x00a2
                r3 = 0
                java.util.List r12 = r12.mo89561a()
                java.util.Iterator r12 = r12.iterator()
            L_0x004c:
                boolean r0 = r12.hasNext()
                if (r0 == 0) goto L_0x0060
                java.lang.Object r0 = r12.next()
                r5 = r0
                k51.b r5 = (k51.C36874b) r5
                boolean r5 = r5.mo89807b()
                if (r5 == 0) goto L_0x004c
                goto L_0x0061
            L_0x0060:
                r0 = r1
            L_0x0061:
                k51.b r0 = (k51.C36874b) r0
                if (r0 == 0) goto L_0x006a
                java.lang.String r12 = r0.mo89806a()
                goto L_0x006b
            L_0x006a:
                r12 = r1
            L_0x006b:
                java.lang.String r0 = ""
                if (r12 != 0) goto L_0x0071
                r5 = r0
                goto L_0x0072
            L_0x0071:
                r5 = r12
            L_0x0072:
                java.util.List r11 = r11.mo89559a()
                java.util.Iterator r11 = r11.iterator()
            L_0x007a:
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto L_0x008e
                java.lang.Object r12 = r11.next()
                r6 = r12
                k51.a r6 = (k51.C36873a) r6
                boolean r6 = r6.mo89801c()
                if (r6 == 0) goto L_0x007a
                goto L_0x008f
            L_0x008e:
                r12 = r1
            L_0x008f:
                k51.a r12 = (k51.C36873a) r12
                if (r12 == 0) goto L_0x0097
                java.lang.String r1 = r12.mo89800b()
            L_0x0097:
                if (r1 != 0) goto L_0x009b
                r6 = r0
                goto L_0x009c
            L_0x009b:
                r6 = r1
            L_0x009c:
                r7 = 1
                r8 = 0
                tk.a r1 = p619tk.C17979a.m61945b(r2, r3, r5, r6, r7, r8)
            L_0x00a2:
                r10.mo4826r(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.ActivationDateInputViewModel.ViewModel.<init>(nk.p, j51.d, j51.f):void");
        }

        /* renamed from: U7 */
        public void mo37513U7(String str) {
            C17979a aVar;
            C41536l.m120489i(str, "email");
            C1644x xVar = this.f40748g;
            C17979a aVar2 = (C17979a) xVar.mo4814f();
            if (aVar2 != null) {
                aVar = C17979a.m61945b(aVar2, 0, (String) null, str, 3, (Object) null);
            } else {
                aVar = null;
            }
            xVar.mo4826r(aVar);
        }

        /* renamed from: Xn */
        public LiveData mo37514Xn() {
            return this.f40749h;
        }

        /* renamed from: b */
        public C17979a mo37515b() {
            Object f = this.f40748g.mo4814f();
            C41536l.m120486f(f);
            return (C17979a) f;
        }

        /* renamed from: dw */
        public final C13630b mo37516dw() {
            return this.f40747f;
        }

        /* renamed from: ew */
        public final C13631c mo37517ew() {
            return this.f40746e;
        }

        /* renamed from: fw */
        public void mo37518fw(long j) {
            C1644x xVar = this.f40748g;
            C17979a aVar = (C17979a) xVar.mo4814f();
            xVar.mo4826r(aVar != null ? C17979a.m61945b(aVar, j, (String) null, (String) null, 6, (Object) null) : null);
        }

        /* renamed from: gw */
        public void mo37519gw() {
            this.f40745d.mo44229a(mo37515b().mo45663c(), mo37515b().mo45665e(), mo37515b().mo45664d());
        }

        /* renamed from: tt */
        public void mo37520tt(String str) {
            C17979a aVar;
            C41536l.m120489i(str, "phoneNumber");
            C1644x xVar = this.f40748g;
            C17979a aVar2 = (C17979a) xVar.mo4814f();
            if (aVar2 != null) {
                aVar = C17979a.m61945b(aVar2, 0, str, (String) null, 5, (Object) null);
            } else {
                aVar = null;
            }
            xVar.mo4826r(aVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.ActivationDateInputViewModel$a */
    public static final class C13629a {

        /* renamed from: a */
        static final /* synthetic */ C13629a f40751a = new C13629a();

        /* renamed from: b */
        private static final Date f40752b;

        /* renamed from: c */
        private static final long f40753c;

        /* renamed from: d */
        private static final long f40754d;

        static {
            Date date = new Date();
            f40752b = date;
            f40753c = date.getTime();
            f40754d = C32319m.m95291K(date, 1).getTime();
        }

        private C13629a() {
        }

        /* renamed from: a */
        public final long mo37522a() {
            return f40754d;
        }

        /* renamed from: b */
        public final long mo37523b() {
            return f40753c;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.ActivationDateInputViewModel$b */
    public interface C13630b {
        /* renamed from: U7 */
        void mo37513U7(String str);

        /* renamed from: tt */
        void mo37520tt(String str);
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.ActivationDateInputViewModel$c */
    public interface C13631c {
        /* renamed from: Xn */
        LiveData mo37514Xn();

        /* renamed from: b */
        C17979a mo37515b();
    }
}
