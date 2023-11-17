package p554op;

import kotlin.jvm.internal.C41536l;

/* renamed from: op.c */
public interface C17298c {

    /* renamed from: op.c$a */
    public static final class C17299a implements C17298c {

        /* renamed from: a */
        private final String f48593a;

        /* renamed from: b */
        private final String f48594b;

        /* renamed from: c */
        private final String f48595c;

        /* renamed from: d */
        private final int f48596d = C17303e.ACCORDION.ordinal();

        public C17299a(String str, String str2, String str3) {
            this.f48593a = str;
            this.f48594b = str2;
            this.f48595c = str3;
        }

        /* renamed from: a */
        public int mo44692a() {
            return this.f48596d;
        }

        /* renamed from: b */
        public final String mo44693b() {
            return this.f48595c;
        }

        /* renamed from: c */
        public final String mo44694c() {
            return this.f48594b;
        }

        /* renamed from: d */
        public final String mo44695d() {
            return this.f48593a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17299a)) {
                return false;
            }
            C17299a aVar = (C17299a) obj;
            return C41536l.m120484d(this.f48593a, aVar.f48593a) && C41536l.m120484d(this.f48594b, aVar.f48594b) && C41536l.m120484d(this.f48595c, aVar.f48595c);
        }

        public int hashCode() {
            String str = this.f48593a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f48594b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f48595c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            String str = this.f48593a;
            String str2 = this.f48594b;
            String str3 = this.f48595c;
            return "Accord(titleKey=" + str + ", subtitleKey=" + str2 + ", additionalTextKey=" + str3 + ")";
        }
    }

    /* renamed from: op.c$b */
    public static final class C17300b implements C17298c {

        /* renamed from: a */
        private final String f48597a;

        /* renamed from: b */
        private final String f48598b;

        /* renamed from: c */
        private final String f48599c;

        /* renamed from: d */
        private final int f48600d = C17303e.BECOMESOLO.ordinal();

        public C17300b(String str, String str2, String str3) {
            this.f48597a = str;
            this.f48598b = str2;
            this.f48599c = str3;
        }

        /* renamed from: a */
        public int mo44692a() {
            return this.f48600d;
        }

        /* renamed from: b */
        public final String mo44699b() {
            return this.f48599c;
        }

        /* renamed from: c */
        public final String mo44700c() {
            return this.f48598b;
        }

        /* renamed from: d */
        public final String mo44701d() {
            return this.f48597a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17300b)) {
                return false;
            }
            C17300b bVar = (C17300b) obj;
            return C41536l.m120484d(this.f48597a, bVar.f48597a) && C41536l.m120484d(this.f48598b, bVar.f48598b) && C41536l.m120484d(this.f48599c, bVar.f48599c);
        }

        public int hashCode() {
            String str = this.f48597a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f48598b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f48599c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            String str = this.f48597a;
            String str2 = this.f48598b;
            String str3 = this.f48599c;
            return "BecomeSolo(titleKey=" + str + ", subtitleKey=" + str2 + ", imageUrl=" + str3 + ")";
        }
    }

    /* renamed from: op.c$c */
    public static final class C17301c implements C17298c {

        /* renamed from: a */
        private final String f48601a;

        /* renamed from: b */
        private final String f48602b;

        /* renamed from: c */
        private final int f48603c = C17303e.INFO.ordinal();

        public C17301c(String str, String str2) {
            this.f48601a = str;
            this.f48602b = str2;
        }

        /* renamed from: a */
        public int mo44692a() {
            return this.f48603c;
        }

        /* renamed from: b */
        public final String mo44705b() {
            return this.f48602b;
        }

        /* renamed from: c */
        public final String mo44706c() {
            return this.f48601a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17301c)) {
                return false;
            }
            C17301c cVar = (C17301c) obj;
            return C41536l.m120484d(this.f48601a, cVar.f48601a) && C41536l.m120484d(this.f48602b, cVar.f48602b);
        }

        public int hashCode() {
            String str = this.f48601a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f48602b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            String str = this.f48601a;
            String str2 = this.f48602b;
            return "Info(titleKey=" + str + ", subtitleKey=" + str2 + ")";
        }
    }

    /* renamed from: op.c$d */
    public static final class C17302d implements C17298c {

        /* renamed from: a */
        private final String f48604a;

        /* renamed from: b */
        private final String f48605b;

        /* renamed from: c */
        private final String f48606c;

        /* renamed from: d */
        private final int f48607d = C17303e.INFOLINK.ordinal();

        public C17302d(String str, String str2, String str3) {
            this.f48604a = str;
            this.f48605b = str2;
            this.f48606c = str3;
        }

        /* renamed from: a */
        public int mo44692a() {
            return this.f48607d;
        }

        /* renamed from: b */
        public final String mo44710b() {
            return this.f48606c;
        }

        /* renamed from: c */
        public final String mo44711c() {
            return this.f48605b;
        }

        /* renamed from: d */
        public final String mo44712d() {
            return this.f48604a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17302d)) {
                return false;
            }
            C17302d dVar = (C17302d) obj;
            return C41536l.m120484d(this.f48604a, dVar.f48604a) && C41536l.m120484d(this.f48605b, dVar.f48605b) && C41536l.m120484d(this.f48606c, dVar.f48606c);
        }

        public int hashCode() {
            String str = this.f48604a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f48605b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f48606c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            String str = this.f48604a;
            String str2 = this.f48605b;
            String str3 = this.f48606c;
            return "InfoLink(titleKey=" + str + ", subtitleKey=" + str2 + ", link=" + str3 + ")";
        }
    }

    /* renamed from: op.c$e */
    public enum C17303e {
        ACCORDION,
        INFO,
        BECOMESOLO,
        INFOLINK
    }

    /* renamed from: a */
    int mo44692a();
}
