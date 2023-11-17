package p068e9;

import java.io.File;
import p094g9.C6285b0;

/* renamed from: e9.b */
final class C6051b extends C6099p {

    /* renamed from: a */
    private final C6285b0 f18837a;

    /* renamed from: b */
    private final String f18838b;

    /* renamed from: c */
    private final File f18839c;

    C6051b(C6285b0 b0Var, String str, File file) {
        if (b0Var != null) {
            this.f18837a = b0Var;
            if (str != null) {
                this.f18838b = str;
                if (file != null) {
                    this.f18839c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    /* renamed from: b */
    public C6285b0 mo19535b() {
        return this.f18837a;
    }

    /* renamed from: c */
    public File mo19536c() {
        return this.f18839c;
    }

    /* renamed from: d */
    public String mo19537d() {
        return this.f18838b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6099p)) {
            return false;
        }
        C6099p pVar = (C6099p) obj;
        if (!this.f18837a.equals(pVar.mo19535b()) || !this.f18838b.equals(pVar.mo19537d()) || !this.f18839c.equals(pVar.mo19536c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f18837a.hashCode() ^ 1000003) * 1000003) ^ this.f18838b.hashCode()) * 1000003) ^ this.f18839c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f18837a + ", sessionId=" + this.f18838b + ", reportFile=" + this.f18839c + "}";
    }
}
