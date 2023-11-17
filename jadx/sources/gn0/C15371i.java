package gn0;

import ed1.C40734b;
import in0.C15707a;
import kotlin.jvm.internal.C41536l;
import p742dy.C20109b;

/* renamed from: gn0.i */
public final class C15371i {

    /* renamed from: a */
    private final C15707a f43751a;

    /* renamed from: b */
    private final C20109b f43752b;

    /* renamed from: gn0.i$a */
    public static final class C15372a {

        /* renamed from: a */
        private final String f43753a;

        /* renamed from: b */
        private final String f43754b;

        /* renamed from: c */
        private final String f43755c;

        /* renamed from: d */
        private final String f43756d;

        /* renamed from: e */
        private final String f43757e;

        /* renamed from: f */
        private final String f43758f;

        /* renamed from: g */
        private final String f43759g;

        /* renamed from: h */
        private final String f43760h;

        /* renamed from: i */
        private final int f43761i;

        /* renamed from: j */
        private final String f43762j;

        /* renamed from: k */
        private final Integer f43763k;

        /* renamed from: l */
        private final boolean f43764l;

        /* renamed from: m */
        private final int[] f43765m;

        /* renamed from: n */
        private final String f43766n;

        /* renamed from: o */
        private final int[] f43767o;

        /* renamed from: p */
        private final String f43768p;

        public C15372a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, Integer num, boolean z, int[] iArr, String str10, int[] iArr2, String str11) {
            String str12 = str;
            String str13 = str2;
            String str14 = str3;
            String str15 = str4;
            String str16 = str5;
            String str17 = str6;
            String str18 = str7;
            String str19 = str8;
            String str20 = str9;
            int[] iArr3 = iArr;
            String str21 = str10;
            int[] iArr4 = iArr2;
            String str22 = str11;
            C41536l.m120489i(str12, "homeAddressCountry");
            C41536l.m120489i(str13, "homeAddressRegion");
            C41536l.m120489i(str14, "homeAddressLine");
            C41536l.m120489i(str15, "facAddressCountry");
            C41536l.m120489i(str16, "facAddressRegion");
            C41536l.m120489i(str17, "facAddressLine");
            C41536l.m120489i(str18, "srcCountry");
            C41536l.m120489i(str19, "srcCountry2");
            C41536l.m120489i(str20, "nameOfOrganization");
            C41536l.m120489i(iArr3, "propertySource");
            C41536l.m120489i(str21, "propertyOtherNote");
            C41536l.m120489i(iArr4, "amountSource");
            C41536l.m120489i(str22, "amountOtherNote");
            this.f43753a = str12;
            this.f43754b = str13;
            this.f43755c = str14;
            this.f43756d = str15;
            this.f43757e = str16;
            this.f43758f = str17;
            this.f43759g = str18;
            this.f43760h = str19;
            this.f43761i = i;
            this.f43762j = str20;
            this.f43763k = num;
            this.f43764l = z;
            this.f43765m = iArr3;
            this.f43766n = str21;
            this.f43767o = iArr4;
            this.f43768p = str22;
        }

        /* renamed from: a */
        public final int mo42461a() {
            return this.f43761i;
        }

        /* renamed from: b */
        public final String mo42462b() {
            return this.f43768p;
        }

        /* renamed from: c */
        public final int[] mo42463c() {
            return this.f43767o;
        }

        /* renamed from: d */
        public final boolean mo42464d() {
            return this.f43764l;
        }

        /* renamed from: e */
        public final Integer mo42465e() {
            return this.f43763k;
        }

        /* renamed from: f */
        public final String mo42466f() {
            return this.f43756d;
        }

        /* renamed from: g */
        public final String mo42467g() {
            return this.f43758f;
        }

        /* renamed from: h */
        public final String mo42468h() {
            return this.f43757e;
        }

        /* renamed from: i */
        public final String mo42469i() {
            return this.f43753a;
        }

        /* renamed from: j */
        public final String mo42470j() {
            return this.f43755c;
        }

        /* renamed from: k */
        public final String mo42471k() {
            return this.f43754b;
        }

        /* renamed from: l */
        public final String mo42472l() {
            return this.f43762j;
        }

        /* renamed from: m */
        public final String mo42473m() {
            return this.f43766n;
        }

        /* renamed from: n */
        public final int[] mo42474n() {
            return this.f43765m;
        }

        /* renamed from: o */
        public final String mo42475o() {
            return this.f43759g;
        }

        /* renamed from: p */
        public final String mo42476p() {
            return this.f43760h;
        }
    }

    public C15371i(C15707a aVar, C20109b bVar) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(bVar, "getKycStatusUseCase");
        this.f43751a = aVar;
        this.f43752b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m55824c(C15371i iVar) {
        C41536l.m120489i(iVar, "this$0");
        iVar.f43752b.mo48540a().mo95067F();
    }

    /* renamed from: b */
    public final C40734b mo42460b(C15372a aVar) {
        C41536l.m120489i(aVar, "param");
        C40734b o = this.f43751a.mo32940F(aVar.mo42469i(), aVar.mo42471k(), aVar.mo42470j(), aVar.mo42466f(), aVar.mo42468h(), aVar.mo42467g(), aVar.mo42475o(), aVar.mo42476p(), aVar.mo42461a(), aVar.mo42472l(), aVar.mo42465e(), aVar.mo42464d(), aVar.mo42474n(), aVar.mo42473m(), aVar.mo42463c(), aVar.mo42462b()).mo94902o(new C15370h(this));
        C41536l.m120488h(o, "repository.submitData(\n …e().subscribe()\n        }");
        return o;
    }
}
