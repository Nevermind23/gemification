package p913uu;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: uu.h */
public enum C28942h {
    NEW_CREDIT_CARD("R"),
    REPLACE_CREDIT_CARD("G"),
    INCREASE_CREDIT_CARD_LIMIT("P"),
    NEW_CREDIT_CARD_WITH_REFINANCE("H"),
    REPLACE_CREDIT_CARD_WITH_REFINANCE("S"),
    INCREASE_CREDIT_CARD_LIMIT_WITH_REFINANCE("Q");
    

    /* renamed from: e */
    public static final C28943a f73876e = null;

    /* renamed from: d */
    private final String f73884d;

    /* renamed from: uu.h$a */
    public static final class C28943a {
        private C28943a() {
        }

        public /* synthetic */ C28943a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C28942h mo68797a(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            for (C28942h hVar : C28942h.values()) {
                if (C41536l.m120484d(hVar.mo68796b(), str)) {
                    return hVar;
                }
            }
            return null;
        }
    }

    static {
        f73876e = new C28943a((DefaultConstructorMarker) null);
    }

    private C28942h(String str) {
        this.f73884d = str;
    }

    /* renamed from: b */
    public final String mo68796b() {
        return this.f73884d;
    }
}
