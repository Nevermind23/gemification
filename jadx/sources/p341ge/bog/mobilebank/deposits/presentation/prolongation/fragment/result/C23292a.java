package p341ge.bog.mobilebank.deposits.presentation.prolongation.fragment.result;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import p615tg.C17963d;
import xb0.C29737y;

/* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.result.a */
public final class C23292a extends C1819o {

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.result.a$a */
    public static final class C23293a {

        /* renamed from: a */
        private final String f60916a;

        /* renamed from: b */
        private final String f60917b;

        public C23293a(String str, String str2) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, C11755a.C11756a.f34100b);
            this.f60916a = str;
            this.f60917b = str2;
        }

        /* renamed from: a */
        public final String mo58263a() {
            return this.f60916a;
        }

        /* renamed from: b */
        public final String mo58264b() {
            return this.f60917b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23293a)) {
                return false;
            }
            C23293a aVar = (C23293a) obj;
            return C41536l.m120484d(this.f60916a, aVar.f60916a) && C41536l.m120484d(this.f60917b, aVar.f60917b);
        }

        public int hashCode() {
            return (this.f60916a.hashCode() * 31) + this.f60917b.hashCode();
        }

        public String toString() {
            String str = this.f60916a;
            String str2 = this.f60917b;
            return "Model(title=" + str + ", value=" + str2 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.result.a$b */
    public static final class C23294b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C29737y f60918d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23294b(C29737y yVar) {
            super(yVar.mo3946b());
            C41536l.m120489i(yVar, "binding");
            this.f60918d = yVar;
        }

        /* renamed from: h */
        public final void mo58268h(C23293a aVar) {
            C41536l.m120489i(aVar, "model");
            C29737y yVar = this.f60918d;
            yVar.f75159e.setText(aVar.mo58263a());
            yVar.f75160f.setText(aVar.mo58264b());
        }
    }

    public C23292a() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C23294b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        bVar.mo58268h((C23293a) obj);
    }

    /* renamed from: l */
    public C23294b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C29737y d = C29737y.m90314d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C23294b(d);
    }
}
