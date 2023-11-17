package p341ge.bog.mobilebank.bnpl.presentation.details;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.details.d */
public abstract class C13838d {

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.d$a */
    public static final class C13839a extends C13838d {

        /* renamed from: a */
        private final long f41111a;

        /* renamed from: b */
        private final String f41112b;

        /* renamed from: c */
        private final String f41113c;

        /* renamed from: d */
        private final Long f41114d;

        /* renamed from: e */
        private final Double f41115e;

        /* renamed from: f */
        private final String f41116f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13839a(long j, String str, String str2, Long l, Double d, String str3) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "name");
            C41536l.m120489i(str3, "ccy");
            this.f41111a = j;
            this.f41112b = str;
            this.f41113c = str2;
            this.f41114d = l;
            this.f41115e = d;
            this.f41116f = str3;
        }

        /* renamed from: a */
        public final String mo38196a() {
            return this.f41116f;
        }

        /* renamed from: b */
        public final String mo38197b() {
            return this.f41112b;
        }

        /* renamed from: c */
        public final Long mo38198c() {
            return this.f41114d;
        }

        /* renamed from: d */
        public final Double mo38199d() {
            return this.f41115e;
        }

        /* renamed from: e */
        public final String mo38200e() {
            return this.f41113c;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.d$b */
    public enum C13840b {
        POSITIVE,
        NEGATIVE,
        PENDING
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.d$c */
    public static final class C13841c extends C13838d {

        /* renamed from: a */
        private final long f41121a;

        /* renamed from: b */
        private final boolean f41122b;

        /* renamed from: c */
        private final boolean f41123c;

        /* renamed from: d */
        private final boolean f41124d;

        /* renamed from: e */
        private final boolean f41125e;

        public C13841c(long j, boolean z, boolean z2, boolean z3, boolean z4) {
            super((DefaultConstructorMarker) null);
            this.f41121a = j;
            this.f41122b = z;
            this.f41123c = z2;
            this.f41124d = z3;
            this.f41125e = z4;
        }

        /* renamed from: a */
        public final boolean mo38201a() {
            return this.f41123c;
        }

        /* renamed from: b */
        public final boolean mo38202b() {
            return this.f41125e;
        }

        /* renamed from: c */
        public final boolean mo38203c() {
            return this.f41124d;
        }

        /* renamed from: d */
        public final boolean mo38204d() {
            return this.f41122b;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.d$d */
    public static final class C13842d extends C13838d {

        /* renamed from: a */
        private final List f41126a;

        /* renamed from: b */
        private int f41127b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13842d(List list, int i) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "headerData");
            this.f41126a = list;
            this.f41127b = i;
        }

        /* renamed from: a */
        public final List mo38205a() {
            return this.f41126a;
        }

        /* renamed from: b */
        public final int mo38206b() {
            return this.f41127b;
        }

        /* renamed from: c */
        public final void mo38207c(int i) {
            this.f41127b = i;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.d$e */
    public static final class C13843e extends C13838d {

        /* renamed from: a */
        public static final C13843e f41128a = new C13843e();

        private C13843e() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.d$f */
    public static final class C13844f extends C13838d {

        /* renamed from: a */
        public static final C13844f f41129a = new C13844f();

        private C13844f() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.d$g */
    public static final class C13845g extends C13838d {

        /* renamed from: a */
        public static final C13845g f41130a = new C13845g();

        private C13845g() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.d$h */
    public static final class C13846h extends C13838d {

        /* renamed from: a */
        private final String f41131a;

        /* renamed from: b */
        private final String f41132b;

        /* renamed from: c */
        private final C13840b f41133c;

        /* renamed from: d */
        private final List f41134d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13846h(String str, String str2, C13840b bVar, List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "amount");
            C41536l.m120489i(str2, "date");
            C41536l.m120489i(bVar, "iconType");
            C41536l.m120489i(list, "keyValues");
            this.f41131a = str;
            this.f41132b = str2;
            this.f41133c = bVar;
            this.f41134d = list;
        }

        /* renamed from: a */
        public final String mo38208a() {
            return this.f41131a;
        }

        /* renamed from: b */
        public final String mo38209b() {
            return this.f41132b;
        }

        /* renamed from: c */
        public final C13840b mo38210c() {
            return this.f41133c;
        }

        /* renamed from: d */
        public final List mo38211d() {
            return this.f41134d;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.d$i */
    public static final class C13847i extends C13838d {

        /* renamed from: a */
        public static final C13847i f41135a = new C13847i();

        private C13847i() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.d$j */
    public static final class C13848j extends C13838d {

        /* renamed from: a */
        public static final C13848j f41136a = new C13848j();

        private C13848j() {
            super((DefaultConstructorMarker) null);
        }
    }

    private C13838d() {
    }

    public /* synthetic */ C13838d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
