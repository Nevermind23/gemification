package of1;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import dg1.C40672b;
import dg1.C40677c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41931v;
import pf1.C42197d;

/* renamed from: of1.s */
public final class C41921s extends C41872c0 {

    /* renamed from: d */
    public static final C41923b f98535d = new C41923b((DefaultConstructorMarker) null);

    /* renamed from: e */
    private static final C41937x f98536e = C41937x.f98573e.mo97019a("application/x-www-form-urlencoded");

    /* renamed from: b */
    private final List f98537b;

    /* renamed from: c */
    private final List f98538c;

    /* renamed from: of1.s$a */
    public static final class C41922a {

        /* renamed from: a */
        private final Charset f98539a;

        /* renamed from: b */
        private final List f98540b;

        /* renamed from: c */
        private final List f98541c;

        public C41922a() {
            this((Charset) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public final C41922a mo96912a(String str, String str2) {
            String str3 = str;
            C41536l.m120489i(str3, "name");
            C41536l.m120489i(str2, C11755a.C11756a.f34100b);
            List list = this.f98540b;
            C41931v.C41934b bVar = C41931v.f98552k;
            list.add(C41931v.C41934b.m121688b(bVar, str3, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f98539a, 91, (Object) null));
            this.f98541c.add(C41931v.C41934b.m121688b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f98539a, 91, (Object) null));
            return this;
        }

        /* renamed from: b */
        public final C41922a mo96913b(String str, String str2) {
            String str3 = str;
            C41536l.m120489i(str3, "name");
            C41536l.m120489i(str2, C11755a.C11756a.f34100b);
            List list = this.f98540b;
            C41931v.C41934b bVar = C41931v.f98552k;
            list.add(C41931v.C41934b.m121688b(bVar, str3, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f98539a, 83, (Object) null));
            this.f98541c.add(C41931v.C41934b.m121688b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f98539a, 83, (Object) null));
            return this;
        }

        /* renamed from: c */
        public final C41921s mo96914c() {
            return new C41921s(this.f98540b, this.f98541c);
        }

        public C41922a(Charset charset) {
            this.f98539a = charset;
            this.f98540b = new ArrayList();
            this.f98541c = new ArrayList();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C41922a(Charset charset, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charset);
        }
    }

    /* renamed from: of1.s$b */
    public static final class C41923b {
        private C41923b() {
        }

        public /* synthetic */ C41923b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C41921s(List list, List list2) {
        C41536l.m120489i(list, "encodedNames");
        C41536l.m120489i(list2, "encodedValues");
        this.f98537b = C42197d.m122527U(list);
        this.f98538c = C42197d.m122527U(list2);
    }

    /* renamed from: k */
    private final long m121581k(C40677c cVar, boolean z) {
        C40672b bVar;
        if (z) {
            bVar = new C40672b();
        } else {
            C41536l.m120486f(cVar);
            bVar = cVar.mo94690B();
        }
        int size = this.f98537b.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (i > 0) {
                bVar.mo94715R0(38);
            }
            bVar.mo94728d0((String) this.f98537b.get(i));
            bVar.mo94715R0(61);
            bVar.mo94728d0((String) this.f98538c.get(i));
            i = i2;
        }
        if (!z) {
            return 0;
        }
        long M0 = bVar.mo94709M0();
        bVar.mo94724a();
        return M0;
    }

    /* renamed from: a */
    public long mo21298a() {
        return m121581k((C40677c) null, true);
    }

    /* renamed from: b */
    public C41937x mo21299b() {
        return f98536e;
    }

    /* renamed from: j */
    public void mo21300j(C40677c cVar) {
        C41536l.m120489i(cVar, "sink");
        m121581k(cVar, false);
    }
}
