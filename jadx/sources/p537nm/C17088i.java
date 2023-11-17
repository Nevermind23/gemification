package p537nm;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.PensionStatusResult;

/* renamed from: nm.i */
public enum C17088i {
    NOT_REQUESTED("C"),
    CANT_ACTIVATE_YET("T"),
    CAN_ACTIVATE(PensionStatusResult.STATUS_ACTIVE);
    

    /* renamed from: e */
    public static final C17089a f47791e = null;

    /* renamed from: d */
    private final String f47796d;

    /* renamed from: nm.i$a */
    public static final class C17089a {
        private C17089a() {
        }

        public /* synthetic */ C17089a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C17088i mo44364a(String str) {
            C17088i iVar;
            C17088i[] values = C17088i.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    iVar = null;
                    break;
                }
                iVar = values[i];
                if (C41536l.m120484d(iVar.mo44363b(), str)) {
                    break;
                }
                i++;
            }
            if (iVar == null) {
                return C17088i.NOT_REQUESTED;
            }
            return iVar;
        }
    }

    static {
        f47791e = new C17089a((DefaultConstructorMarker) null);
    }

    private C17088i(String str) {
        this.f47796d = str;
    }

    /* renamed from: b */
    public final String mo44363b() {
        return this.f47796d;
    }
}
