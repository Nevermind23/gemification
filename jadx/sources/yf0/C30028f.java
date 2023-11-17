package yf0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import xf0.C29765d;

/* renamed from: yf0.f */
public final class C30028f extends C21481a implements C30027e {

    /* renamed from: d */
    private final List f75856d;

    /* renamed from: e */
    private final C1644x f75857e = new C1644x();

    /* renamed from: f */
    private final List f75858f;

    /* renamed from: yf0.f$a */
    public static final class C30029a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((C29765d) obj).mo69922b(), ((C29765d) obj2).mo69922b());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30028f(List list) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(list, "providedList");
        this.f75856d = list;
        this.f75858f = C41358y.m120030t0(list, new C30029a());
    }

    /* renamed from: S1 */
    public LiveData mo70326S1() {
        return this.f75857e;
    }

    /* renamed from: U9 */
    public void mo70327U9(String str) {
        C41536l.m120489i(str, "text");
        C1644x xVar = this.f75857e;
        List list = this.f75858f;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (C40440x.m117135K(((C29765d) next).mo69922b(), str, true)) {
                arrayList.add(next);
            }
        }
        xVar.mo4823o(arrayList);
    }

    /* renamed from: dw */
    public final C30027e mo70328dw() {
        return this;
    }
}
