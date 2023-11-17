package p603si;

import java.util.Arrays;
import kotlin.jvm.internal.C41536l;

/* renamed from: si.c */
public abstract class C17809c {

    /* renamed from: si.c$a */
    public static final class C17810a implements C17799b {

        /* renamed from: d */
        private final /* synthetic */ C17799b f50691d;

        /* renamed from: e */
        final /* synthetic */ String f50692e;

        C17810a(C17799b bVar, String str) {
            this.f50692e = str;
            this.f50691d = bVar;
        }

        /* renamed from: b */
        public String mo45383b() {
            Object[] c = mo45384c();
            if (c != null) {
                String str = this.f50692e;
                Object[] copyOf = Arrays.copyOf(c, c.length);
                String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                C41536l.m120488h(format, "format(this, *args)");
                if (format != null) {
                    return format;
                }
            }
            return this.f50692e;
        }

        /* renamed from: c */
        public Object[] mo45384c() {
            return this.f50691d.mo45384c();
        }

        /* renamed from: g */
        public boolean mo45386g(String... strArr) {
            C41536l.m120489i(strArr, "inputs");
            return this.f50691d.mo45386g(strArr);
        }
    }

    /* renamed from: a */
    public static final C17799b m61562a(C17799b bVar, String str) {
        C41536l.m120489i(bVar, "<this>");
        C41536l.m120489i(str, "errorMessage");
        return new C17810a(bVar, str);
    }
}
