package zj0;

import android.content.Context;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p313x7.C8972a;
import p313x7.C8973b;
import uj0.C28800a;
import zh1.C43511w;

/* renamed from: zj0.a */
public abstract class C30315a {

    /* renamed from: a */
    public static final C30316a f76226a = new C30316a((DefaultConstructorMarker) null);

    /* renamed from: zj0.a$a */
    public static final class C30316a {
        private C30316a() {
        }

        public /* synthetic */ C30316a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C28800a mo70640a(C43511w wVar) {
            C41536l.m120489i(wVar, "retrofit");
            Object b = wVar.mo102220b(C28800a.class);
            C41536l.m120488h(b, "retrofit.create(GooglePlayApi::class.java)");
            return (C28800a) b;
        }

        /* renamed from: b */
        public final C8973b mo70641b(Context context) {
            C41536l.m120489i(context, "context");
            C8973b b = C8972a.m33243b(context);
            C41536l.m120488h(b, "getClient(context)");
            return b;
        }
    }
}
