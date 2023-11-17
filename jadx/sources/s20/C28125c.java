package s20;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import cf1.C40419j;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import i91.C36373d;
import iu0.C36546y;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.billsplitcashoperation.C21828a;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.billsplitcashoperation.CashOperationViewModel;
import p366bk.C10318g;
import p366bk.C10328q;
import p90.C27391p2;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: s20.c */
public final class C28125c extends C21828a {

    /* renamed from: N */
    public static final C28126a f71472N = new C28126a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private boolean f71473K;

    /* renamed from: L */
    private C27391p2 f71474L;

    /* renamed from: M */
    private final C41217g f71475M;

    /* renamed from: s20.c$a */
    public static final class C28126a {
        private C28126a() {
        }

        public /* synthetic */ C28126a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: s20.c$b */
    static final class C28127b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28125c f71476d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28127b(C28125c cVar) {
            super(1);
            this.f71476d = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f71476d.m86584m2().f69524e;
            C41536l.m120488h(bool, "it");
            button.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: s20.c$c */
    public static final class C28128c implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C28125c f71477d;

        public C28128c(C28125c cVar) {
            this.f71477d = cVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f71477d.m86582k2(new C40419j("[^\\d.]").mo94490g(String.valueOf(editable), ""));
            C28125c cVar = this.f71477d;
            cVar.m86583l2(cVar.m86584m2().f69525f.getTextInput());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: s20.c$d */
    public static final class C28129d implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C28125c f71478d;

        public C28129d(C28125c cVar) {
            this.f71478d = cVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f71478d.m86585n2().mo54414lw(String.valueOf(editable));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: s20.c$e */
    static final class C28130e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f71479a;

        C28130e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f71479a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f71479a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f71479a.invoke(obj);
        }
    }

    /* renamed from: s20.c$f */
    public static final class C28131f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f71480d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28131f(Fragment fragment) {
            super(0);
            this.f71480d = fragment;
        }

        public final Fragment invoke() {
            return this.f71480d;
        }
    }

    /* renamed from: s20.c$g */
    public static final class C28132g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f71481d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28132g(C43064a aVar) {
            super(0);
            this.f71481d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f71481d.invoke();
        }
    }

    /* renamed from: s20.c$h */
    public static final class C28133h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f71482d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28133h(C41217g gVar) {
            super(0);
            this.f71482d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f71482d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: s20.c$i */
    public static final class C28134i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f71483d;

        /* renamed from: e */
        final /* synthetic */ C41217g f71484e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28134i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f71483d = aVar;
            this.f71484e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f71483d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f71484e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: s20.c$j */
    public static final class C28135j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f71485d;

        /* renamed from: e */
        final /* synthetic */ C41217g f71486e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28135j(Fragment fragment, C41217g gVar) {
            super(0);
            this.f71485d = fragment;
            this.f71486e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f71486e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f71485d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C28125c() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C28132g(new C28131f(this)));
        this.f71475M = C1514j0.m5374c(this, C41520a0.m120436b(CashOperationViewModel.class), new C28133h(a), new C28134i((C43064a) null, a), new C28135j(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final void m86582k2(String str) {
        int W = C40440x.m117155W(str, '.', 0, false, 6, (Object) null);
        if (W == -1 || (str.length() - W) - 1 <= 2) {
            m86585n2().mo54413kw(str);
            return;
        }
        String obj = str.subSequence(0, W + 3).toString();
        m86585n2().mo54413kw(obj);
        m86584m2().f69525f.getTextInput().setText(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final void m86583l2(EditText editText) {
        boolean z;
        String obj = editText.getText().toString();
        boolean z2 = false;
        if (obj.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f71473K) {
                obj = C40439w.m117103B(obj, " ₾", "", false, 4, (Object) null);
            }
            if (obj.length() > 0) {
                z2 = true;
            }
            if (z2) {
                this.f71473K = true;
                Spanned a = C36373d.m107943a(obj, " ₾", "", C10318g.light_gray_highlight_color, C36546y.m108285N());
                if (!C41536l.m120484d(editText.getText().toString(), a.toString())) {
                    editText.setText(a);
                    editText.setSelection(obj.length());
                    return;
                }
                return;
            }
            editText.setText("");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final C27391p2 m86584m2() {
        C27391p2 p2Var = this.f71474L;
        C41536l.m120486f(p2Var);
        return p2Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final CashOperationViewModel m86585n2() {
        return (CashOperationViewModel) this.f71475M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m86586o2(C28125c cVar) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m86584m2().f69525f.setEnabled(true);
        cVar.m86584m2().f69525f.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) C36546y.m108285N().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(1, 0);
        }
    }

    private final void observeData() {
        m86585n2().mo54412jw().mo4819k(getViewLifecycleOwner(), new C28130e(new C28127b(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m86587p2(C28125c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m86585n2().mo54411hw();
        cVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f71474L = C27391p2.m84869d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f71474L = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(getString(C10328q.bill_split_add_cash_operation));
        m86584m2().f69524e.setEnabled(false);
        observeData();
        new Handler(Looper.getMainLooper()).postDelayed(new C28123a(this), 200);
        m86584m2().f69525f.getTextInput().setImeOptions(1073741828);
        m86584m2().f69525f.getTextInput().addTextChangedListener(new C28128c(this));
        m86584m2().f69526g.getTextInput().setImeOptions(1073741828);
        m86584m2().f69526g.getTextInput().addTextChangedListener(new C28129d(this));
        m86584m2().f69524e.setOnClickListener(new C28124b(this));
        m86584m2().f69524e.requestFocus();
    }
}
