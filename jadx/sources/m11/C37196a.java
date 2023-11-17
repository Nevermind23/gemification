package m11;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: m11.a */
public abstract class C37196a {

    /* renamed from: c */
    public static final C37198b f89601c = new C37198b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f89602a;

    /* renamed from: b */
    private final String f89603b;

    /* renamed from: m11.a$a */
    public static final class C37197a extends C37196a {

        /* renamed from: d */
        private final C37200d f89604d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37197a(C37200d dVar) {
            super("choose_mode", dVar.mo90259b(), (DefaultConstructorMarker) null);
            C41536l.m120489i(dVar, "mode");
            this.f89604d = dVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37197a) && this.f89604d == ((C37197a) obj).f89604d;
        }

        public int hashCode() {
            return this.f89604d.hashCode();
        }

        public String toString() {
            C37200d dVar = this.f89604d;
            return "ChooseMode(mode=" + dVar + ")";
        }
    }

    /* renamed from: m11.a$b */
    public static final class C37198b {
        private C37198b() {
        }

        public /* synthetic */ C37198b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: m11.a$c */
    public static final class C37199c extends C37196a {

        /* renamed from: d */
        private final C37200d f89605d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37199c(C37200d dVar) {
            super("current_mode", dVar.mo90259b(), (DefaultConstructorMarker) null);
            C41536l.m120489i(dVar, "mode");
            this.f89605d = dVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37199c) && this.f89605d == ((C37199c) obj).f89605d;
        }

        public int hashCode() {
            return this.f89605d.hashCode();
        }

        public String toString() {
            C37200d dVar = this.f89605d;
            return "LoggedIn(mode=" + dVar + ")";
        }
    }

    /* renamed from: m11.a$d */
    public enum C37200d {
        LIGHT("light"),
        DARK("dark"),
        SYSTEM("system");
        

        /* renamed from: d */
        private final String f89610d;

        private C37200d(String str) {
            this.f89610d = str;
        }

        /* renamed from: b */
        public final String mo90259b() {
            return this.f89610d;
        }
    }

    /* renamed from: m11.a$e */
    public static final class C37201e extends C37196a {

        /* renamed from: d */
        public static final C37201e f89611d = new C37201e();

        private C37201e() {
            super("open_action_sheet", (String) null, 2, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C37196a(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* renamed from: a */
    public final String mo90251a() {
        return this.f89602a;
    }

    /* renamed from: b */
    public final String mo90252b() {
        return this.f89603b;
    }

    private C37196a(String str, String str2) {
        this.f89602a = str;
        this.f89603b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37196a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (DefaultConstructorMarker) null);
    }
}
