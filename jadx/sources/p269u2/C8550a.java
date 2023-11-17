package p269u2;

import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: u2.a */
public final class C8550a {

    /* renamed from: b */
    public static final C8550a f24290b = new C8550a(C41344r0.m119928j());

    /* renamed from: c */
    public static final C8551a f24291c = new C8551a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Map f24292a;

    /* renamed from: u2.a$a */
    public static final class C8551a {
        private C8551a() {
        }

        public /* synthetic */ C8551a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C8550a(Map map) {
        C41536l.m120490j(map, "headerMap");
        this.f24292a = map;
    }

    /* renamed from: a */
    public final String mo23913a(String str) {
        C41536l.m120490j(str, "header");
        return (String) this.f24292a.get(str);
    }
}
