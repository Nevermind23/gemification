package p341ge.bog.mobilebank.kyc.presentation.result;

import an0.C10106b;
import an0.C10107c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import on0.C17286a;
import p341ge.bog.designsystem.components.pagestate.PageState;

/* renamed from: ge.bog.mobilebank.kyc.presentation.result.KycResultFragment */
public final class KycResultFragment extends Fragment {

    /* renamed from: d */
    public static final C14906a f43042d = new C14906a((DefaultConstructorMarker) null);

    /* renamed from: e */
    private static final String f43043e = "rbc.kyc.survey.result.success";

    /* renamed from: ge.bog.mobilebank.kyc.presentation.result.KycResultFragment$a */
    public static final class C14906a {
        private C14906a() {
        }

        public /* synthetic */ C14906a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public static final void m54707i1(KycResultFragment kycResultFragment, View view) {
        C41536l.m120489i(kycResultFragment, "this$0");
        kycResultFragment.requireActivity().finish();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C10107c.fragment_kyc_result, viewGroup, false);
        ((PageState) inflate.findViewById(C10106b.f27875H)).setTitleText(C32343x.m95388F(f43043e, new Object[0]));
        inflate.findViewById(C10106b.f27887s).setOnClickListener(new C17286a(this));
        C41536l.m120488h(inflate, "inflater.inflate(R.layou…)\n            }\n        }");
        return inflate;
    }
}
