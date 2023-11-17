package ji0;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import java.util.ArrayList;
import java.util.List;
import ki0.C25738a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oh0.C27009d;
import p341ge.bog.designsystem.components.list.C13364a;
import p725cr.C19788a;
import th0.C28392c;
import ue1.C43064a;

/* renamed from: ji0.a */
public final class C25456a extends C19788a {

    /* renamed from: J */
    public static final C25457a f65116J = new C25457a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C28392c f65117H;

    /* renamed from: I */
    private final C41217g f65118I = C41219i.m119470b(C25458b.f65119d);

    /* renamed from: ji0.a$a */
    public static final class C25457a {
        private C25457a() {
        }

        public /* synthetic */ C25457a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C25456a mo64026a(List list) {
            C41536l.m120489i(list, "storesList");
            C25456a aVar = new C25456a();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("STORES_LIST_ARGS", new ArrayList(list));
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* renamed from: ji0.a$b */
    static final class C25458b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C25458b f65119d = new C25458b();

        C25458b() {
            super(0);
        }

        /* renamed from: b */
        public final C25738a invoke() {
            return new C25738a();
        }
    }

    /* renamed from: e2 */
    private final C28392c m80623e2() {
        C28392c cVar = this.f65117H;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* renamed from: f2 */
    private final C25738a m80624f2() {
        return (C25738a) this.f65118I.getValue();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f65117H = C28392c.m87089d(layoutInflater, viewGroup, true);
        mo26370a2(C32343x.m95388F("giftcard.application.stores.list.sheet.header", new Object[0]));
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f65117H = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        C1533o.m5445b(this, "REQUEST_KEY_CARD_PURPOSE_DISMISS", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_ACTION_SHEET_DISMISSED", Boolean.TRUE)));
    }

    public void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> arrayList;
        C41536l.m120489i(view, "view");
        RecyclerView recyclerView = m80623e2().f71990e;
        super.onViewCreated(view, bundle);
        recyclerView.setAdapter(m80624f2());
        recyclerView.mo5351j(new C13364a(C0767a.m2895e(requireContext(), C27009d.f67788e), true, false));
        C25738a f2 = m80624f2();
        Bundle arguments = getArguments();
        if (arguments != null) {
            arrayList = arguments.getStringArrayList("STORES_LIST_ARGS");
        } else {
            arrayList = null;
        }
        f2.mo6029i(arrayList);
    }
}
