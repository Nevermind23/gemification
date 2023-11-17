package p341ge.bog.mobilebank.depositapplication.presentation.applicationresult;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import ha0.C24938o;
import kotlin.jvm.internal.C41536l;
import p615tg.C17963d;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.a */
public final class C22840a extends C1819o {

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.a$a */
    public static final class C22841a {

        /* renamed from: a */
        private final String f60198a;

        /* renamed from: b */
        private final String f60199b;

        public C22841a(String str, String str2) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, C11755a.C11756a.f34100b);
            this.f60198a = str;
            this.f60199b = str2;
        }

        /* renamed from: a */
        public final String mo56918a() {
            return this.f60198a;
        }

        /* renamed from: b */
        public final String mo56919b() {
            return this.f60199b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22841a)) {
                return false;
            }
            C22841a aVar = (C22841a) obj;
            return C41536l.m120484d(this.f60198a, aVar.f60198a) && C41536l.m120484d(this.f60199b, aVar.f60199b);
        }

        public int hashCode() {
            return (this.f60198a.hashCode() * 31) + this.f60199b.hashCode();
        }

        public String toString() {
            String str = this.f60198a;
            String str2 = this.f60199b;
            return "Model(title=" + str + ", value=" + str2 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.a$b */
    public static final class C22842b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24938o f60200d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22842b(C24938o oVar) {
            super(oVar.mo3946b());
            C41536l.m120489i(oVar, "binding");
            this.f60200d = oVar;
        }

        /* renamed from: h */
        public final void mo56923h(C22841a aVar) {
            C41536l.m120489i(aVar, "model");
            C24938o oVar = this.f60200d;
            oVar.f64230e.setText(aVar.mo56918a());
            oVar.f64231f.setText(aVar.mo56919b());
        }
    }

    public C22840a() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C22842b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        bVar.mo56923h((C22841a) obj);
    }

    /* renamed from: l */
    public C22842b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C24938o d = C24938o.m79737d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C22842b(d);
    }
}
