package wh0;

import de1.C40640a;
import ed1.C40735b0;
import ed1.C40762x;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43075l;
import vh0.C29077c;

/* renamed from: wh0.c */
public final class C29393c {

    /* renamed from: b */
    public static final C29394a f74480b = new C29394a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C29077c f74481a;

    /* renamed from: wh0.c$a */
    public static final class C29394a {
        private C29394a() {
        }

        public /* synthetic */ C29394a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: wh0.c$b */
    static final class C29395b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29393c f74482d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29395b(C29393c cVar) {
            super(1);
            this.f74482d = cVar;
        }

        /* renamed from: a */
        public final C40735b0 invoke(String str) {
            C41536l.m120489i(str, "it");
            return this.f74482d.f74481a.mo67724R(str);
        }
    }

    public C29393c(C29077c cVar) {
        C41536l.m120489i(cVar, "repository");
        this.f74481a = cVar;
    }

    /* renamed from: d */
    private final String m89479d(String str) {
        String encode = URLEncoder.encode(str, StandardCharsets.UTF_8.toString());
        C41536l.m120488h(encode, "encodedText");
        return C40439w.m117103B(encode, "+", "%20", false, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final String m89480f(C29393c cVar, String str) {
        C41536l.m120489i(cVar, "this$0");
        C41536l.m120489i(str, "$nomination");
        return cVar.m89479d(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final C40735b0 m89481g(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* renamed from: e */
    public final C40762x mo69235e(String str) {
        C41536l.m120489i(str, "nomination");
        C40762x r = C40762x.m118160v(new C29391a(this, str)).mo95072K(C40640a.m117458b()).mo95087r(new C29392b(new C29395b(this)));
        C41536l.m120488h(r, "operator fun invoke(nomi…kGiftCardNomination(it) }");
        return r;
    }
}
