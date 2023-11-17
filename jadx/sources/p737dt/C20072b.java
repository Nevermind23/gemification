package p737dt;

import com.google.gson.Gson;
import ed1.C40744k;
import iu0.C36546y;
import java.io.File;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: dt.b */
public final class C20072b {

    /* renamed from: c */
    public static final C20073a f54690c = new C20073a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C36546y f54691a;

    /* renamed from: b */
    private final Gson f54692b;

    /* renamed from: dt.b$a */
    public static final class C20073a {
        private C20073a() {
        }

        public /* synthetic */ C20073a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C20072b(C36546y yVar, Gson gson) {
        C41536l.m120489i(yVar, "app");
        C41536l.m120489i(gson, "gson");
        this.f54691a = yVar;
        this.f54692b = gson;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        se1.C42550b.m123187a(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        throw r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m65996d(p737dt.C20072b r2, ed1.C40745l r3) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            java.lang.String r0 = "it"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.io.File r0 = r2.m65997e()
            if (r0 != 0) goto L_0x0014
            r3.onComplete()
            goto L_0x0046
        L_0x0014:
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0043
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ all -> 0x003f }
            r1.<init>(r0)     // Catch:{ all -> 0x003f }
            com.google.gson.Gson r2 = r2.f54692b     // Catch:{ all -> 0x0038 }
            java.lang.Class<ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity.TransactionCategoryResponse> r0 = p341ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity.TransactionCategoryResponse.class
            java.lang.Object r2 = r2.mo18168j(r1, r0)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "gson.fromJson(fileReader…goryResponse::class.java)"
            kotlin.jvm.internal.C41536l.m120488h(r2, r0)     // Catch:{ all -> 0x0038 }
            ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity.TransactionCategoryResponse r2 = (p341ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity.TransactionCategoryResponse) r2     // Catch:{ all -> 0x0038 }
            r3.mo94965a(r2)     // Catch:{ all -> 0x0038 }
            he1.w r2 = he1.C41238w.f97225a     // Catch:{ all -> 0x0038 }
            r2 = 0
            se1.C42550b.m123187a(r1, r2)     // Catch:{ all -> 0x003f }
            goto L_0x0046
        L_0x0038:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            se1.C42550b.m123187a(r1, r2)     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r3.onComplete()
            goto L_0x0046
        L_0x0043:
            r3.onComplete()
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p737dt.C20072b.m65996d(dt.b, ed1.l):void");
    }

    /* renamed from: e */
    private final File m65997e() {
        String M = this.f54691a.mo89315M();
        if (M == null) {
            return null;
        }
        File filesDir = this.f54691a.getFilesDir();
        return new File(filesDir, "TRANSASCTION_LIST_" + M);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        se1.C42550b.m123187a(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        r0 = move-exception;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48475b(p341ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity.TransactionCategoryResponse r3) {
        /*
            r2 = this;
            java.lang.String r0 = "categories"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.io.File r0 = r2.m65997e()
            if (r0 == 0) goto L_0x0023
            java.io.FileWriter r1 = new java.io.FileWriter
            r1.<init>(r0)
            com.google.gson.Gson r0 = r2.f54692b     // Catch:{ all -> 0x001c }
            r0.mo18162A(r3, r1)     // Catch:{ all -> 0x001c }
            he1.w r3 = he1.C41238w.f97225a     // Catch:{ all -> 0x001c }
            r3 = 0
            se1.C42550b.m123187a(r1, r3)
            goto L_0x0023
        L_0x001c:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = move-exception
            se1.C42550b.m123187a(r1, r3)
            throw r0
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p737dt.C20072b.mo48475b(ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity.TransactionCategoryResponse):void");
    }

    /* renamed from: c */
    public final C40744k mo48476c() {
        C40744k g = C40744k.m117997g(new C20071a(this));
        C41536l.m120488h(g, "create {\n            val…}\n            }\n        }");
        return g;
    }
}
