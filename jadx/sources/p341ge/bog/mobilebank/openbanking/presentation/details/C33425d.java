package p341ge.bog.mobilebank.openbanking.presentation.details;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p394dj.C12137f;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.details.d */
public abstract class C33425d {

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.d$a */
    public static final class C33426a extends C33425d {

        /* renamed from: a */
        private final String f81610a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33426a(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "accountNumber");
            this.f81610a = str;
        }

        /* renamed from: a */
        public final String mo79245a() {
            return this.f81610a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.d$b */
    public static final class C33427b extends C33425d {

        /* renamed from: a */
        public static final C33427b f81611a = new C33427b();

        private C33427b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.d$c */
    public static final class C33428c extends C33425d {

        /* renamed from: a */
        public static final C33428c f81612a = new C33428c();

        private C33428c() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.d$d */
    public static final class C33429d extends C33425d {

        /* renamed from: a */
        private final String f81613a;

        /* renamed from: b */
        private final String f81614b;

        /* renamed from: c */
        private final String f81615c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33429d(String str, String str2, String str3) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "operationDate");
            C41536l.m120489i(str2, "operationName");
            C41536l.m120489i(str3, "amount");
            this.f81613a = str;
            this.f81614b = str2;
            this.f81615c = str3;
        }

        /* renamed from: a */
        public final String mo79246a() {
            return this.f81615c;
        }

        /* renamed from: b */
        public final String mo79247b() {
            return this.f81613a;
        }

        /* renamed from: c */
        public final String mo79248c() {
            return this.f81614b;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.d$e */
    public static final class C33430e extends C33425d {

        /* renamed from: a */
        public static final C33430e f81616a = new C33430e();

        private C33430e() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.d$f */
    public static final class C33431f extends C33425d {

        /* renamed from: a */
        public static final C33431f f81617a = new C33431f();

        private C33431f() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.d$g */
    public static final class C33432g extends C33425d {

        /* renamed from: a */
        public static final C33432g f81618a = new C33432g();

        private C33432g() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.d$h */
    public static final class C33433h extends C33425d {

        /* renamed from: a */
        public static final C33433h f81619a = new C33433h();

        private C33433h() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.d$i */
    public static final class C33434i extends C33425d {

        /* renamed from: a */
        private final C12137f f81620a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33434i(C12137f fVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(fVar, "headerData");
            this.f81620a = fVar;
        }

        /* renamed from: a */
        public final C12137f mo79249a() {
            return this.f81620a;
        }
    }

    private C33425d() {
    }

    public /* synthetic */ C33425d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
