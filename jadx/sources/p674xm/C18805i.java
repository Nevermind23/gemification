package p674xm;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: xm.i */
public enum C18805i {
    BANK,
    HOME;
    

    /* renamed from: d */
    public static final C18806a f52549d = null;

    /* renamed from: xm.i$a */
    public static final class C18806a {
        private C18806a() {
        }

        public /* synthetic */ C18806a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C18805i mo46645a(String str) {
            C18805i iVar;
            C41536l.m120489i(str, "lookupValue");
            C18805i[] values = C18805i.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    iVar = null;
                    break;
                }
                iVar = values[i];
                if (C41536l.m120484d(iVar.name(), str)) {
                    break;
                }
                i++;
            }
            if (iVar == null) {
                return C18805i.HOME;
            }
            return iVar;
        }
    }

    static {
        f52549d = new C18806a((DefaultConstructorMarker) null);
    }
}
