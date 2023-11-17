package wr0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: wr0.o */
enum C39671o {
    PRODUCT_HEADERS,
    ACTION_BUTTONS,
    INSTALLMENT_PROGRESS,
    SCHEDULE_AND_HISTORY,
    PLN_HISTORY,
    INFOBOX,
    DETAILS,
    ERROR,
    LOADING;
    

    /* renamed from: d */
    public static final C39672a f94290d = null;

    /* renamed from: wr0.o$a */
    public static final class C39672a {
        private C39672a() {
        }

        public /* synthetic */ C39672a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C39671o mo93417a(int i) {
            boolean z;
            for (C39671o oVar : C39671o.values()) {
                if (oVar.ordinal() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return oVar;
                }
            }
            return null;
        }
    }

    static {
        f94290d = new C39672a((DefaultConstructorMarker) null);
    }
}
