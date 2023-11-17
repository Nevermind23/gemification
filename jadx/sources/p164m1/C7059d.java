package p164m1;

import android.os.Build;
import androidx.work.C2075n;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import p151l1.C6862b;
import p177n1.C7207h;
import p190o1.C7399v;

/* renamed from: m1.d */
public final class C7059d extends C7057c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7059d(C7207h hVar) {
        super(hVar);
        C41536l.m120489i(hVar, "tracker");
    }

    /* renamed from: b */
    public boolean mo21277b(C7399v vVar) {
        C41536l.m120489i(vVar, "workSpec");
        if (vVar.f21639j.mo6712d() == C2075n.CONNECTED) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo21278c(C6862b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        if (Build.VERSION.SDK_INT >= 26) {
            if (!bVar.mo20934a() || !bVar.mo20937d()) {
                return true;
            }
        } else if (!bVar.mo20934a()) {
            return true;
        }
        return false;
    }
}
