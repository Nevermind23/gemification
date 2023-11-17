package p164m1;

import android.os.Build;
import androidx.work.C2073m;
import androidx.work.C2075n;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p151l1.C6862b;
import p177n1.C7207h;
import p190o1.C7399v;

/* renamed from: m1.f */
public final class C7062f extends C7057c {

    /* renamed from: f */
    public static final C7063a f21000f = new C7063a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private static final String f21001g;

    /* renamed from: m1.f$a */
    public static final class C7063a {
        private C7063a() {
        }

        public /* synthetic */ C7063a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String i = C2073m.m8073i("NetworkNotRoamingCtrlr");
        C41536l.m120488h(i, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f21001g = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7062f(C7207h hVar) {
        super(hVar);
        C41536l.m120489i(hVar, "tracker");
    }

    /* renamed from: b */
    public boolean mo21277b(C7399v vVar) {
        C41536l.m120489i(vVar, "workSpec");
        if (vVar.f21639j.mo6712d() == C2075n.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo21278c(C6862b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        if (Build.VERSION.SDK_INT < 24) {
            C2073m.m8071e().mo6959a(f21001g, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            if (bVar.mo20934a()) {
                return false;
            }
        } else if (bVar.mo20934a() && bVar.mo20936c()) {
            return false;
        }
        return true;
    }
}
