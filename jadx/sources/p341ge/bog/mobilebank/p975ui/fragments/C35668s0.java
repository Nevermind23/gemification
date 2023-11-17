package p341ge.bog.mobilebank.p975ui.fragments;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g81.C32198k;
import iu0.C36546y;
import java.util.ArrayList;
import p341ge.bog.mobilebank.model.loans.ILoanHistoryScheduleSummary;
import p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p366bk.C10313b;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.fragments.s0 */
public class C35668s0 extends C35651n1 implements View.OnClickListener {

    /* renamed from: d */
    private C32198k f86224d;

    /* renamed from: e */
    private RecyclerView f86225e;

    /* renamed from: f */
    private C32198k f86226f;

    /* renamed from: g */
    private C32198k f86227g;

    /* renamed from: h */
    private ArrayList f86228h;

    /* renamed from: i */
    private ILoanHistoryScheduleSummary f86229i;

    /* renamed from: j */
    private View.OnClickListener f86230j;

    /* renamed from: n1 */
    private void m105914n1() {
        this.f86225e.clearAnimation();
        this.f86225e.setVisibility(0);
    }

    /* renamed from: i1 */
    public void mo86758i1() {
        C32198k kVar = this.f86224d;
        if (kVar != null) {
            kVar.mo72722s();
        }
    }

    /* renamed from: j1 */
    public void mo86759j1() {
        RecyclerView recyclerView = this.f86225e;
        if (recyclerView != null) {
            recyclerView.clearAnimation();
            this.f86225e.setAdapter(this.f86227g);
            this.f86227g.notifyDataSetChanged();
        }
    }

    /* renamed from: k1 */
    public void mo86760k1(ArrayList arrayList, ILoanHistoryScheduleSummary iLoanHistoryScheduleSummary, View.OnClickListener onClickListener) {
        if (getContext() != null) {
            if (this.f86224d == null) {
                C32198k kVar = new C32198k(getContext());
                this.f86224d = kVar;
                kVar.mo72727x(this.f86225e);
            }
            this.f86224d.mo72726w(onClickListener);
            this.f86224d.mo72723t(arrayList);
            this.f86224d.mo72728y(iLoanHistoryScheduleSummary);
            this.f86225e.setAdapter(this.f86224d);
            this.f86224d.notifyDataSetChanged();
            m105914n1();
            return;
        }
        this.f86228h = arrayList;
        this.f86229i = iLoanHistoryScheduleSummary;
        this.f86230j = onClickListener;
    }

    /* renamed from: l1 */
    public void mo86761l1() {
        RecyclerView recyclerView = this.f86225e;
        if (recyclerView != null) {
            recyclerView.startAnimation(AnimationUtils.loadAnimation(C36546y.m108285N(), C10313b.infinite_alpha));
            this.f86225e.setAdapter(this.f86226f);
            this.f86226f.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_loan_history;
    }

    /* renamed from: m1 */
    public void mo86762m1(ArrayList arrayList, ILoanHistoryScheduleSummary iLoanHistoryScheduleSummary, View.OnClickListener onClickListener) {
        if (this.f86224d == null) {
            C32198k kVar = new C32198k(getContext());
            this.f86224d = kVar;
            kVar.mo72727x(this.f86225e);
        }
        this.f86224d.mo72726w(onClickListener);
        this.f86224d.mo72724u(arrayList);
        this.f86224d.mo72728y(iLoanHistoryScheduleSummary);
        this.f86225e.setAdapter(this.f86224d);
        m105914n1();
    }

    public void onClick(View view) {
        ((ProductDetailedActivity) getActivity()).mo86334X3(true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f86225e = (RecyclerView) view;
        C32198k kVar = new C32198k(getContext());
        this.f86226f = kVar;
        kVar.mo72727x(this.f86225e);
        this.f86226f.mo72729z(BogInputLayout.INPUT_NORMAL_STATE);
        C32198k kVar2 = new C32198k(getContext());
        this.f86227g = kVar2;
        kVar2.mo72729z(100);
        this.f86227g.mo72727x(this.f86225e);
        this.f86227g.mo72725v(this);
        if (this.f86224d == null) {
            this.f86225e.setAdapter(this.f86226f);
        }
        this.f86225e.setLayoutManager(new LinearLayoutManager(getContext()));
        ArrayList arrayList = this.f86228h;
        if (arrayList != null) {
            mo86760k1(arrayList, this.f86229i, this.f86230j);
        }
    }
}
