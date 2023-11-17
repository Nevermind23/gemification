package au0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import g91.C32319m;
import g91.C32343x;
import he1.C41217g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.list.C13364a;
import p349ah.C9860d;
import rt0.C38340b;
import ue1.C43064a;
import vt0.C39465b;

/* renamed from: au0.b */
public final class C31068b extends C9860d {

    /* renamed from: E */
    public static final C31069a f77262E = new C31069a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C39465b f77263B;

    /* renamed from: C */
    private final C41217g f77264C = C41219i.m119470b(new C31071c(this));

    /* renamed from: D */
    private final C41217g f77265D = C41219i.m119470b(new C31070b(this));

    /* renamed from: au0.b$a */
    public static final class C31069a {
        private C31069a() {
        }

        public /* synthetic */ C31069a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31068b mo71271a(List list, long j) {
            C41536l.m120489i(list, "starsGuideUiModel");
            C31068b bVar = new C31068b();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("STARS_GUIDE_ARG", new ArrayList(list));
            bundle.putLong("STARS_GUIDE_END_DATE", j);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* renamed from: au0.b$b */
    static final class C31070b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31068b f77266d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31070b(C31068b bVar) {
            super(0);
            this.f77266d = bVar;
        }

        /* renamed from: b */
        public final Long invoke() {
            Bundle arguments = this.f77266d.getArguments();
            Long valueOf = arguments != null ? Long.valueOf(arguments.getLong("STARS_GUIDE_END_DATE")) : null;
            C41536l.m120486f(valueOf);
            return valueOf;
        }
    }

    /* renamed from: au0.b$c */
    static final class C31071c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31068b f77267d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31071c(C31068b bVar) {
            super(0);
            this.f77267d = bVar;
        }

        /* renamed from: b */
        public final ArrayList invoke() {
            Bundle arguments = this.f77267d.getArguments();
            ArrayList parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("STARS_GUIDE_ARG") : null;
            C41536l.m120486f(parcelableArrayList);
            return parcelableArrayList;
        }
    }

    /* renamed from: d2 */
    private final C39465b m92481d2() {
        C39465b bVar = this.f77263B;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: e2 */
    private final long m92482e2() {
        return ((Number) this.f77265D.getValue()).longValue();
    }

    /* renamed from: f2 */
    private final List m92483f2() {
        Object value = this.f77264C.getValue();
        C41536l.m120488h(value, "<get-starsGuideUiModel>(...)");
        return (List) value;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f77263B = C39465b.m114716d(layoutInflater, viewGroup, true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(C32343x.m95388F("text.pluspage.products.title", new Object[0]));
        m92481d2().f93861f.setText(C32343x.m95388F("text.pluspage.products.info.first.title", new Object[0]));
        InlineFeedback inlineFeedback = m92481d2().f93862g;
        String d = C32319m.m95297d(m92482e2(), "dd/MM/yyyy");
        C41536l.m120488h(d, "formatDate(\n            …PATTERN\n                )");
        inlineFeedback.setCaptionText(C32343x.m95388F("text.pluspage.products.info.message.new", d));
        m92481d2().f93862g.setTitleText(C32343x.m95388F("text.pluspage.products.info.title", new Object[0]));
        C31072c cVar = new C31072c();
        m92481d2().f93860e.setAdapter(cVar);
        m92481d2().f93860e.mo5351j(new C13364a(requireContext().getDrawable(C38340b.guide_items_divider), true, false));
        cVar.mo6029i(m92483f2());
    }
}
