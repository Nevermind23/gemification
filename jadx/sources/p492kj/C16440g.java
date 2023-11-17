package p492kj;

import com.salesforce.marketingcloud.UrlHandler;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

/* renamed from: kj.g */
public abstract class C16440g {

    /* renamed from: a */
    private final C43064a f46432a;

    /* renamed from: kj.g$a */
    public static final class C16441a extends C16440g {

        /* renamed from: b */
        private final int f46433b;

        /* renamed from: c */
        private final Integer f46434c;

        /* renamed from: d */
        private final C43064a f46435d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16441a(int i, Integer num, C43064a aVar) {
            super(aVar, (DefaultConstructorMarker) null);
            C41536l.m120489i(aVar, UrlHandler.ACTION);
            this.f46433b = i;
            this.f46434c = num;
            this.f46435d = aVar;
        }

        /* renamed from: a */
        public C43064a mo43580a() {
            return this.f46435d;
        }

        /* renamed from: b */
        public final int mo43581b() {
            return this.f46433b;
        }

        /* renamed from: c */
        public final Integer mo43582c() {
            return this.f46434c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16441a)) {
                return false;
            }
            C16441a aVar = (C16441a) obj;
            return this.f46433b == aVar.f46433b && C41536l.m120484d(this.f46434c, aVar.f46434c) && C41536l.m120484d(mo43580a(), aVar.mo43580a());
        }

        public int hashCode() {
            int i = this.f46433b * 31;
            Integer num = this.f46434c;
            return ((i + (num == null ? 0 : num.hashCode())) * 31) + mo43580a().hashCode();
        }

        public String toString() {
            int i = this.f46433b;
            Integer num = this.f46434c;
            C43064a a = mo43580a();
            return "Icon(resId=" + i + ", tintColor=" + num + ", action=" + a + ")";
        }
    }

    /* renamed from: kj.g$b */
    public static final class C16442b extends C16440g {

        /* renamed from: b */
        private final String f46436b;

        /* renamed from: c */
        private final int f46437c;

        /* renamed from: d */
        private final C43064a f46438d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16442b(String str, int i, C43064a aVar) {
            super(aVar, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "text");
            C41536l.m120489i(aVar, UrlHandler.ACTION);
            this.f46436b = str;
            this.f46437c = i;
            this.f46438d = aVar;
        }

        /* renamed from: a */
        public C43064a mo43580a() {
            return this.f46438d;
        }

        /* renamed from: b */
        public final int mo43586b() {
            return this.f46437c;
        }

        /* renamed from: c */
        public final String mo43587c() {
            return this.f46436b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16442b)) {
                return false;
            }
            C16442b bVar = (C16442b) obj;
            return C41536l.m120484d(this.f46436b, bVar.f46436b) && this.f46437c == bVar.f46437c && C41536l.m120484d(mo43580a(), bVar.mo43580a());
        }

        public int hashCode() {
            return (((this.f46436b.hashCode() * 31) + this.f46437c) * 31) + mo43580a().hashCode();
        }

        public String toString() {
            String str = this.f46436b;
            int i = this.f46437c;
            C43064a a = mo43580a();
            return "IconText(text=" + str + ", resId=" + i + ", action=" + a + ")";
        }
    }

    /* renamed from: kj.g$c */
    public static final class C16443c extends C16440g {

        /* renamed from: b */
        private final String f46439b;

        /* renamed from: c */
        private final C43064a f46440c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16443c(String str, C43064a aVar) {
            super(aVar, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "text");
            C41536l.m120489i(aVar, UrlHandler.ACTION);
            this.f46439b = str;
            this.f46440c = aVar;
        }

        /* renamed from: a */
        public C43064a mo43580a() {
            return this.f46440c;
        }

        /* renamed from: b */
        public final String mo43591b() {
            return this.f46439b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16443c)) {
                return false;
            }
            C16443c cVar = (C16443c) obj;
            return C41536l.m120484d(this.f46439b, cVar.f46439b) && C41536l.m120484d(mo43580a(), cVar.mo43580a());
        }

        public int hashCode() {
            return (this.f46439b.hashCode() * 31) + mo43580a().hashCode();
        }

        public String toString() {
            String str = this.f46439b;
            C43064a a = mo43580a();
            return "Text(text=" + str + ", action=" + a + ")";
        }
    }

    public /* synthetic */ C16440g(C43064a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* renamed from: a */
    public abstract C43064a mo43580a();

    private C16440g(C43064a aVar) {
        this.f46432a = aVar;
    }
}
