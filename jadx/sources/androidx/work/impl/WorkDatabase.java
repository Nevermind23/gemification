package androidx.work.impl;

import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7362a0;
import p190o1.C7364b;
import p190o1.C7373e;
import p190o1.C7379j;
import p190o1.C7388o;
import p190o1.C7392r;
import p190o1.C7402w;
import p267u0.C8502v;
import p267u0.C8503w;
import p318y0.C8999j;
import p330z0.C9165f;

public abstract class WorkDatabase extends C8503w {

    /* renamed from: p */
    public static final C1965a f5948p = new C1965a((DefaultConstructorMarker) null);

    /* renamed from: androidx.work.impl.WorkDatabase$a */
    public static final class C1965a {
        private C1965a() {
        }

        public /* synthetic */ C1965a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C8999j m7727c(Context context, C8999j.C9002b bVar) {
            C41536l.m120489i(context, "$context");
            C41536l.m120489i(bVar, "configuration");
            C8999j.C9002b.C9003a a = C8999j.C9002b.f25030f.mo24414a(context);
            a.mo24412d(bVar.f25032b).mo24411c(bVar.f25033c).mo24413e(true).mo24409a(true);
            return new C9165f().mo6928a(a.mo24410b());
        }

        /* renamed from: b */
        public final WorkDatabase mo6753b(Context context, Executor executor, boolean z) {
            C8503w.C8504a aVar;
            C41536l.m120489i(context, "context");
            C41536l.m120489i(executor, "queryExecutor");
            Class<WorkDatabase> cls = WorkDatabase.class;
            if (z) {
                aVar = C8502v.m31833c(context, cls).mo23824c();
            } else {
                aVar = C8502v.m31831a(context, cls, "androidx.work.workdb").mo23827f(new C2063y(context));
            }
            return (WorkDatabase) aVar.mo23828g(executor).mo23822a(C2002c.f6025a).mo23823b(C2025i.f6087c).mo23823b(new C2044s(context, 2, 3)).mo23823b(C2029j.f6093c).mo23823b(C2031k.f6096c).mo23823b(new C2044s(context, 5, 6)).mo23823b(C2036l.f6130c).mo23823b(C2037m.f6131c).mo23823b(C2038n.f6132c).mo23823b(new C2010f0(context)).mo23823b(new C2044s(context, 10, 11)).mo23823b(C2009f.f6043c).mo23823b(C2021g.f6073c).mo23823b(C2023h.f6079c).mo23826e().mo23825d();
        }
    }

    /* renamed from: H */
    public static final WorkDatabase m7718H(Context context, Executor executor, boolean z) {
        return f5948p.mo6753b(context, executor, z);
    }

    /* renamed from: I */
    public abstract C7364b mo6746I();

    /* renamed from: J */
    public abstract C7373e mo6747J();

    /* renamed from: K */
    public abstract C7379j mo6748K();

    /* renamed from: L */
    public abstract C7388o mo6749L();

    /* renamed from: M */
    public abstract C7392r mo6750M();

    /* renamed from: N */
    public abstract C7402w mo6751N();

    /* renamed from: O */
    public abstract C7362a0 mo6752O();
}
