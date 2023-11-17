package p349ah;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.C1505h;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4956a;
import com.google.android.material.bottomsheet.C4963b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.buttons.Button;
import p352ak.C9875b;
import p601sg.C17779d;
import p601sg.C17786k;
import p642vh.C18368l;

/* renamed from: ah.d */
public abstract class C9860d extends C4963b {

    /* renamed from: A */
    private BottomSheetBehavior f26717A;

    /* renamed from: u */
    private ActionSheetTitle.C13155a f26718u;

    /* renamed from: v */
    private String f26719v;

    /* renamed from: w */
    private String f26720w;

    /* renamed from: x */
    private View f26721x;

    /* renamed from: y */
    private int f26722y;

    /* renamed from: z */
    private C9875b f26723z;

    /* renamed from: L1 */
    private final C9875b m36169L1() {
        C9875b bVar = this.f26723z;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public static final void m36170U1(C9860d dVar, DialogInterface dialogInterface) {
        BottomSheetBehavior bottomSheetBehavior;
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120487g(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        C4956a aVar = (C4956a) dialogInterface;
        if (dVar.mo26357I1() < dVar.requireView().getHeight()) {
            ViewGroup.LayoutParams layoutParams = dVar.requireView().getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = dVar.mo26357I1();
            }
            dVar.requireView().requestLayout();
        }
        BottomSheetBehavior n = aVar.mo15614n();
        dVar.f26717A = n;
        if (n != null) {
            if (dVar.mo26363P1() >= dVar.mo26357I1() || dVar.mo26363P1() == 0) {
                n.mo15579I0(3);
                n.mo15578H0(true);
            } else {
                n.mo15579I0(4);
                n.mo15578H0(false);
                n.mo15575E0(dVar.mo26363P1());
            }
            n.mo15572B0(true);
            if (n.mo15591m0() && (bottomSheetBehavior = dVar.f26717A) != null) {
                bottomSheetBehavior.mo15572B0(false);
            }
        }
    }

    /* renamed from: W1 */
    private final void m36171W1() {
        m36169L1().f26784f.setOnClickListener(new C9857a(this));
        m36169L1().f26785g.setOnClickListener(new C9858b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public static final void m36172X1(C9860d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.mo26366S1();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public static final void m36173Y1(C9860d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.mo26371b();
    }

    /* renamed from: c2 */
    private final int m36174c2() {
        return requireActivity().getResources().getDimensionPixelSize(C17779d.top_margin_action_sheet);
    }

    /* renamed from: I1 */
    public final int mo26357I1() {
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        return C18368l.m62760i(requireActivity) - m36174c2();
    }

    /* renamed from: J1 */
    public Button mo26358J1() {
        Button button = m36169L1().f26784f;
        C41536l.m120488h(button, "binding.backButton");
        return button;
    }

    /* renamed from: K1 */
    public final BottomSheetBehavior mo26359K1() {
        return this.f26717A;
    }

    /* renamed from: M1 */
    public String mo26360M1() {
        return this.f26720w;
    }

    /* renamed from: N1 */
    public Button mo26361N1() {
        Button button = m36169L1().f26785g;
        C41536l.m120488h(button, "binding.closeButton");
        return button;
    }

    /* renamed from: O1 */
    public View mo26362O1() {
        return this.f26721x;
    }

    /* renamed from: P1 */
    public int mo26363P1() {
        return this.f26722y;
    }

    /* renamed from: Q1 */
    public String mo26364Q1() {
        return this.f26719v;
    }

    /* renamed from: R1 */
    public ActionSheetTitle.C13155a mo26365R1() {
        return this.f26718u;
    }

    /* renamed from: S1 */
    public void mo26366S1() {
    }

    /* renamed from: T1 */
    public abstract void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* renamed from: V1 */
    public void mo26368V1(String str) {
        this.f26720w = str;
        C9875b bVar = this.f26723z;
        if (bVar != null) {
            bVar.f26783e.setCaption(str);
        }
    }

    /* renamed from: Z1 */
    public void mo26369Z1(int i) {
        this.f26722y = i;
    }

    /* renamed from: a2 */
    public void mo26370a2(String str) {
        this.f26719v = str;
        C9875b bVar = this.f26723z;
        if (bVar != null) {
            bVar.f26783e.setTitle(str);
        }
    }

    /* renamed from: b */
    public void mo26371b() {
        mo4577k1();
    }

    /* renamed from: b2 */
    public void mo26372b2(ActionSheetTitle.C13155a aVar) {
        boolean z;
        this.f26718u = aVar;
        C9875b bVar = this.f26723z;
        if (bVar != null) {
            LinearLayout linearLayout = m36169L1().f26789k;
            C41536l.m120488h(linearLayout, "binding.titleLayout");
            if (aVar != ActionSheetTitle.C13155a.EMPTY) {
                z = true;
            } else {
                z = false;
            }
            C18368l.m62751F(linearLayout, z, false, 2, (Object) null);
            bVar.f26783e.setType(aVar);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo4588y1(1, C17786k.ActionSheet);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f26723z = C9875b.m36221d(layoutInflater, viewGroup, false);
        LinearLayout c = m36169L1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        LayoutInflater layoutInflater2 = getLayoutInflater();
        C41536l.m120488h(layoutInflater2, "layoutInflater");
        FrameLayout frameLayout = m36169L1().f26786h;
        C41536l.m120488h(frameLayout, "binding.contentLayout");
        mo26367T1(layoutInflater2, frameLayout);
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f26723z = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        ActionSheetTitle actionSheetTitle = m36169L1().f26783e;
        actionSheetTitle.setType(mo26365R1());
        actionSheetTitle.setTitle(mo26364Q1());
        actionSheetTitle.setCaption(mo26360M1());
        actionSheetTitle.setItem(mo26362O1());
        m36171W1();
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        Dialog q1 = super.mo710q1(bundle);
        C41536l.m120487g(q1, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        C4956a aVar = (C4956a) q1;
        aVar.setOnShowListener(new C9859c(this));
        return aVar;
    }
}
