package bs0;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import kotlin.jvm.internal.C41536l;

/* renamed from: bs0.b */
public interface C31182b {

    /* renamed from: bs0.b$a */
    public static final class C31183a implements C31182b {

        /* renamed from: a */
        private final String f77482a;

        /* renamed from: b */
        private final String f77483b;

        public C31183a(String str, String str2) {
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            C41536l.m120489i(str2, "title");
            this.f77482a = str;
            this.f77483b = str2;
        }

        /* renamed from: a */
        public final String mo71387a() {
            return this.f77483b;
        }

        /* renamed from: b */
        public final String mo71388b() {
            return this.f77482a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31183a)) {
                return false;
            }
            C31183a aVar = (C31183a) obj;
            return C41536l.m120484d(this.f77482a, aVar.f77482a) && C41536l.m120484d(this.f77483b, aVar.f77483b);
        }

        public int hashCode() {
            return (this.f77482a.hashCode() * 31) + this.f77483b.hashCode();
        }

        public String toString() {
            String str = this.f77482a;
            String str2 = this.f77483b;
            return "DownloadPdf(url=" + str + ", title=" + str2 + ")";
        }
    }
}
