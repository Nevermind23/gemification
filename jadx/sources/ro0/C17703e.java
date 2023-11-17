package ro0;

import androidx.core.util.C1004d;
import ed1.C40749p;
import gd1.C40992a;
import hd1.C41205b;
import hd1.C41209f;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ro0.e */
public final class C17703e {

    /* renamed from: d */
    public static final C17704a f49428d = new C17704a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C43064a f49429a;

    /* renamed from: b */
    private final C41209f f49430b = new C41209f();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Set f49431c = new LinkedHashSet();

    /* renamed from: ro0.e$a */
    public static final class C17704a {
        private C17704a() {
        }

        public /* synthetic */ C17704a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ro0.e$c */
    static final class C17706c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17703e f49437d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17706c(C17703e eVar) {
            super(1);
            this.f49437d = eVar;
        }

        /* renamed from: a */
        public final void mo45270a(Long l) {
            ArrayList arrayList = new ArrayList();
            Collection<C17705b> values = ((Map) this.f49437d.f49429a.invoke()).values();
            C17703e eVar = this.f49437d;
            for (C17705b bVar : values) {
                if (!eVar.f49431c.contains(bVar)) {
                    arrayList.add(bVar);
                    eVar.f49431c.add(bVar);
                }
            }
            this.f49437d.m61378g(arrayList);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45270a((Long) obj);
            return C41238w.f97225a;
        }
    }

    public C17703e(C43064a aVar) {
        C41536l.m120489i(aVar, "getVisibleOffers");
        this.f49429a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m61378g(List list) {
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17705b bVar = (C17705b) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C1004d("page", bVar.mo45265d()));
            arrayList.add(new C1004d("topic", bVar.mo45266e()));
            Long a = bVar.mo45262a();
            if (a != null) {
                str = a.toString();
            } else {
                str = null;
            }
            arrayList.add(new C1004d("categoryId", str));
            arrayList.add(new C1004d("ofrId", String.valueOf(bVar.mo45264c())));
            arrayList.add(new C1004d("filterParameters", bVar.mo45263b()));
            C36546y.m108282F().mo27155v("life_style_offers_page", "", "view_offer", (Long) null, arrayList);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m61379i(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: e */
    public final void mo45259e() {
        this.f49430b.mo95668a((C41205b) null);
    }

    /* renamed from: f */
    public final void mo45260f() {
        this.f49431c.clear();
    }

    /* renamed from: h */
    public final void mo45261h() {
        this.f49430b.mo95668a(C40749p.m118042g0(500, TimeUnit.MILLISECONDS).mo95027o0(C40992a.m118827a()).mo94981F0(new C17702d(new C17706c(this))));
    }

    /* renamed from: ro0.e$b */
    public static final class C17705b {

        /* renamed from: a */
        private final String f49432a;

        /* renamed from: b */
        private final long f49433b;

        /* renamed from: c */
        private final Long f49434c;

        /* renamed from: d */
        private final String f49435d;

        /* renamed from: e */
        private final String f49436e;

        public C17705b(String str, long j, Long l, String str2, String str3) {
            C41536l.m120489i(str, "page");
            this.f49432a = str;
            this.f49433b = j;
            this.f49434c = l;
            this.f49435d = str2;
            this.f49436e = str3;
        }

        /* renamed from: a */
        public final Long mo45262a() {
            return this.f49434c;
        }

        /* renamed from: b */
        public final String mo45263b() {
            return this.f49436e;
        }

        /* renamed from: c */
        public final long mo45264c() {
            return this.f49433b;
        }

        /* renamed from: d */
        public final String mo45265d() {
            return this.f49432a;
        }

        /* renamed from: e */
        public final String mo45266e() {
            return this.f49435d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17705b)) {
                return false;
            }
            C17705b bVar = (C17705b) obj;
            return C41536l.m120484d(this.f49432a, bVar.f49432a) && this.f49433b == bVar.f49433b && C41536l.m120484d(this.f49434c, bVar.f49434c) && C41536l.m120484d(this.f49435d, bVar.f49435d) && C41536l.m120484d(this.f49436e, bVar.f49436e);
        }

        public int hashCode() {
            int hashCode = ((this.f49432a.hashCode() * 31) + C7397t.m28148a(this.f49433b)) * 31;
            Long l = this.f49434c;
            int i = 0;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.f49435d;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f49436e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            String str = this.f49432a;
            long j = this.f49433b;
            Long l = this.f49434c;
            String str2 = this.f49435d;
            String str3 = this.f49436e;
            return "OfferLogItem(page=" + str + ", offerId=" + j + ", categoryId=" + l + ", topic=" + str2 + ", filter=" + str3 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C17705b(String str, long j, Long l, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, l, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
        }
    }
}
