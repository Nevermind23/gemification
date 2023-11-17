package p674xm;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: xm.j */
public enum C18807j {
    PERSONALLY,
    OTHER;
    

    /* renamed from: d */
    public static final C18808a f52553d = null;

    /* renamed from: xm.j$a */
    public static final class C18808a {
        private C18808a() {
        }

        public /* synthetic */ C18808a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C18807j mo46646a(String str) {
            C18807j jVar;
            C41536l.m120489i(str, "lookupValue");
            C18807j[] values = C18807j.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jVar = null;
                    break;
                }
                jVar = values[i];
                if (C41536l.m120484d(jVar.name(), str)) {
                    break;
                }
                i++;
            }
            if (jVar == null) {
                return C18807j.PERSONALLY;
            }
            return jVar;
        }
    }

    static {
        f52553d = new C18808a((DefaultConstructorMarker) null);
    }
}
