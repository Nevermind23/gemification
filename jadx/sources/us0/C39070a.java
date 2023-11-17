package us0;

import bt0.C31185a;
import ed1.C40734b;
import ed1.C40762x;
import java.util.HashMap;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ss0.C38526a;

/* renamed from: us0.a */
public final class C39070a implements C31185a {

    /* renamed from: b */
    public static final C39071a f93212b = new C39071a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C38526a f93213a;

    /* renamed from: us0.a$a */
    public static final class C39071a {
        private C39071a() {
        }

        public /* synthetic */ C39071a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C39070a(C38526a aVar) {
        C41536l.m120489i(aVar, "service");
        this.f93213a = aVar;
    }

    /* renamed from: a */
    public C40762x mo71396a(double d) {
        return this.f93213a.mo92098a(d);
    }

    /* renamed from: b */
    public C40734b mo71397b(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        return this.f93213a.mo92099b(hashMap);
    }

    /* renamed from: c */
    public C40762x mo71398c(String str) {
        C41536l.m120489i(str, "bonusType");
        return this.f93213a.mo92107i("CONVERT_POINTS", str);
    }

    /* renamed from: d */
    public C40762x mo71399d(String str) {
        C41536l.m120489i(str, "pin");
        return this.f93213a.mo92108j(str);
    }
}
