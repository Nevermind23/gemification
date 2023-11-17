package t31;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import b31.C31116e;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p725cr.C19788a;

/* renamed from: t31.a */
public final class C38637a extends C19788a {

    /* renamed from: I */
    public static final C38638a f92497I = new C38638a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C31116e f92498H;

    /* renamed from: t31.a$a */
    public static final class C38638a {
        private C38638a() {
        }

        public /* synthetic */ C38638a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38637a mo92278a(String str, String str2) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "description");
            C38637a aVar = new C38637a();
            aVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_TITLE", str), C41233s.m119492a("ARG_DESCRIPTION", str2)));
            return aVar;
        }
    }

    /* renamed from: e2 */
    private final C31116e m113229e2() {
        C31116e eVar = this.f92498H;
        C41536l.m120486f(eVar);
        return eVar;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f92498H = C31116e.m92583d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f92498H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            str = arguments.getString("ARG_TITLE");
        } else {
            str = null;
        }
        mo26370a2(str);
        PageDescriptionView pageDescriptionView = m113229e2().f77331e;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("ARG_DESCRIPTION");
        }
        pageDescriptionView.setText(str2);
    }
}
