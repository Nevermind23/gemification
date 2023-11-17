package p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import he1.C41217g;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p349ah.C9860d;
import ue0.C28742o;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.f */
public final class C23840f extends C9860d {

    /* renamed from: D */
    public static final C23841a f61994D = new C23841a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C28742o f61995B;

    /* renamed from: C */
    private final C41217g f61996C = C41219i.m119470b(new C23842b(this));

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.f$a */
    public static final class C23841a {
        private C23841a() {
        }

        public /* synthetic */ C23841a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C23840f mo60799a(String str, String str2) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "infoText");
            C23840f fVar = new C23840f();
            fVar.setArguments(C0908e.m3336b(C41233s.m119492a("TITLE_TEXT", str), C41233s.m119492a("INFO_TEXT", str2)));
            return fVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.f$b */
    static final class C23842b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C23840f f61997d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23842b(C23840f fVar) {
            super(0);
            this.f61997d = fVar;
        }

        public final String invoke() {
            return this.f61997d.requireArguments().getString("INFO_TEXT", "");
        }
    }

    /* renamed from: d2 */
    private final C28742o m76986d2() {
        C28742o oVar = this.f61995B;
        C41536l.m120486f(oVar);
        return oVar;
    }

    /* renamed from: e2 */
    private final String m76987e2() {
        return (String) this.f61996C.getValue();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f61995B = C28742o.m88094d(layoutInflater, viewGroup, true);
        m76986d2().f73401e.setText(m76987e2());
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("TITLE_TEXT");
        } else {
            str = null;
        }
        mo26370a2(str);
    }
}
