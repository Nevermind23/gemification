package p164m1;

import android.os.Build;
import androidx.work.C2075n;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import p151l1.C6862b;
import p177n1.C7207h;
import p190o1.C7399v;

/* renamed from: m1.g */
public final class C7064g extends C7057c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7064g(C7207h hVar) {
        super(hVar);
        C41536l.m120489i(hVar, "tracker");
    }

    /* renamed from: b */
    public boolean mo21277b(C7399v vVar) {
        C41536l.m120489i(vVar, "workSpec");
        C2075n d = vVar.f21639j.mo6712d();
        if (d == C2075n.UNMETERED || (Build.VERSION.SDK_INT >= 30 && d == C2075n.TEMPORARILY_UNMETERED)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo21278c(C6862b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        if (!bVar.mo20934a() || bVar.mo20935b()) {
            return true;
        }
        return false;
    }
}
