package p891su;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.PensionStatusResult;

/* renamed from: su.e */
public enum C28269e {
    PHYSICAL_PERSON(PensionStatusResult.STATUS_INACTIVE),
    JURIDICAL_PERSON("C"),
    BUDGET("T");
    

    /* renamed from: e */
    public static final C28270a f71756e = null;

    /* renamed from: d */
    private final String f71761d;

    /* renamed from: su.e$a */
    public static final class C28270a {
        private C28270a() {
        }

        public /* synthetic */ C28270a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C28269e mo67883a(String str) {
            C28269e eVar;
            C28269e[] values = C28269e.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    eVar = null;
                    break;
                }
                eVar = values[i];
                if (C41536l.m120484d(eVar.mo67882b(), str)) {
                    break;
                }
                i++;
            }
            return eVar == null ? C28269e.PHYSICAL_PERSON : eVar;
        }
    }

    static {
        f71756e = new C28270a((DefaultConstructorMarker) null);
    }

    private C28269e(String str) {
        this.f71761d = str;
    }

    /* renamed from: b */
    public final String mo67882b() {
        return this.f71761d;
    }
}
