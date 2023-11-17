package g61;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: g61.a */
public abstract class C32104a {

    /* renamed from: d */
    public static final C32105a f78954d = new C32105a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f78955a;

    /* renamed from: b */
    private final String f78956b;

    /* renamed from: c */
    private final Integer f78957c;

    /* renamed from: g61.a$a */
    public static final class C32105a {
        private C32105a() {
        }

        public /* synthetic */ C32105a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g61.a$b */
    public static final class C32106b extends C32104a {

        /* renamed from: e */
        private final String f78958e;

        /* renamed from: f */
        private final long f78959f;

        /* renamed from: g */
        private final Integer f78960g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32106b(String str, long j, Integer num) {
            super(str, String.valueOf(j), num, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "actionName");
            this.f78958e = str;
            this.f78959f = j;
            this.f78960g = num;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32106b)) {
                return false;
            }
            C32106b bVar = (C32106b) obj;
            return C41536l.m120484d(this.f78958e, bVar.f78958e) && this.f78959f == bVar.f78959f && C41536l.m120484d(this.f78960g, bVar.f78960g);
        }

        public int hashCode() {
            int hashCode = ((this.f78958e.hashCode() * 31) + C7397t.m28148a(this.f78959f)) * 31;
            Integer num = this.f78960g;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            String str = this.f78958e;
            long j = this.f78959f;
            Integer num = this.f78960g;
            return "StoryAction(actionName=" + str + ", offerId=" + j + ", position=" + num + ")";
        }
    }

    /* renamed from: g61.a$c */
    public static final class C32107c extends C32104a {

        /* renamed from: e */
        private final long f78961e;

        /* renamed from: f */
        private final int f78962f;

        public C32107c(long j, int i) {
            super("story_impression", String.valueOf(j), Integer.valueOf(i), (DefaultConstructorMarker) null);
            this.f78961e = j;
            this.f78962f = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32107c)) {
                return false;
            }
            C32107c cVar = (C32107c) obj;
            return this.f78961e == cVar.f78961e && this.f78962f == cVar.f78962f;
        }

        public int hashCode() {
            return (C7397t.m28148a(this.f78961e) * 31) + this.f78962f;
        }

        public String toString() {
            long j = this.f78961e;
            int i = this.f78962f;
            return "StoryGroupImpression(offerId=" + j + ", position=" + i + ")";
        }
    }

    public /* synthetic */ C32104a(String str, String str2, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num);
    }

    /* renamed from: a */
    public final String mo72580a() {
        return this.f78955a;
    }

    /* renamed from: b */
    public final Integer mo72581b() {
        return this.f78957c;
    }

    /* renamed from: c */
    public final String mo72582c() {
        return this.f78956b;
    }

    private C32104a(String str, String str2, Integer num) {
        this.f78955a = str;
        this.f78956b = str2;
        this.f78957c = num;
    }
}
