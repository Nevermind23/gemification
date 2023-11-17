package z61;

import a71.C30508c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c91.C31355y;
import g91.C32297d;
import g91.C32335t0;
import g91.C32359z0;
import java.util.List;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity;
import p341ge.bog.mobilebank.transfers.foreign.FileAttachment;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: z61.h */
public class C40165h extends C31355y implements C40159e, C30508c.C30511c {

    /* renamed from: v */
    private RecyclerView f95429v;

    /* renamed from: w */
    private C30508c f95430w;

    /* renamed from: x */
    private BankTransferWizardActivity f95431x;

    /* renamed from: y */
    private C40160f f95432y;

    /* renamed from: h2 */
    private List m116355h2() {
        return (List) C42035e.m122119a(mo71733r1().getParcelable("ATTACHED_FILES_ARG"));
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public /* synthetic */ void m116356i2(View view) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.MIME_TYPES", this.f95432y.mo94123n());
        intent.setType("*/*");
        startActivityForResult(intent, 42);
    }

    /* renamed from: j2 */
    public static C40165h m116357j2(List list) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ATTACHED_FILES_ARG", C42035e.m122121c(list));
        C40165h hVar = new C40165h();
        hVar.setArguments(bundle);
        return hVar;
    }

    /* renamed from: K */
    public void mo94111K(FileAttachment fileAttachment) {
        this.f95430w.mo70855g(fileAttachment);
    }

    /* renamed from: c */
    public void mo94112c() {
        this.f95431x.mo87877q5(false, true);
    }

    /* renamed from: e */
    public void mo94113e() {
        this.f95431x.mo87877q5(true, true);
    }

    /* renamed from: g2 */
    public List mo94129g2() {
        C40160f fVar = this.f95432y;
        if (fVar != null) {
            return fVar.mo94121l();
        }
        return m116355h2();
    }

    /* renamed from: j0 */
    public void mo94114j0(int i) {
        C32297d.m95154b(getActivity(), getString(i));
    }

    /* renamed from: l0 */
    public void mo94115l0(long j) {
        this.f77882e.setUnderHintText(getString(C10328q.foreign_transfer_invoice_max_file_size, Long.valueOf(j)));
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_foreign_transfer_invoice_wizard;
    }

    /* renamed from: o */
    public void mo94116o(int i, int i2) {
        C32297d.m95154b(getActivity(), getString(C10328q.attachment_file_size_limit_error, Long.valueOf(C32359z0.m95590r((long) i2))));
    }

    /* renamed from: o0 */
    public void mo70862o0(int i) {
        this.f95432y.mo94120k(i);
    }

    public void onActivityCreated(Bundle bundle) {
        mo71711N1(false);
        super.onActivityCreated(bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 42 && i2 == -1) {
            this.f95432y.mo94124o(getContext(), intent.getData());
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (requireActivity() instanceof BankTransferWizardActivity) {
            this.f95431x = (BankTransferWizardActivity) requireActivity();
        }
    }

    public void onStop() {
        super.onStop();
        mo71733r1().putParcelable("ATTACHED_FILES_ARG", C42035e.m122121c(this.f95432y.mo94121l()));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f95429v = (RecyclerView) view.findViewById(C10322k.file_list);
        this.f77882e.setHintText(getString(C10328q.attach_invoice));
        this.f77882e.setValue(getString(C10328q.invoice));
        this.f77882e.disableEditText();
        this.f77882e.setInputLayoutColor(C32335t0.m95358c(getContext()));
        C40164g gVar = new C40164g(this);
        this.f77882e.setOnClickListener(gVar);
        this.f77882e.getEditText().setOnClickListener(gVar);
        this.f77882e.setRightDrawable(C10320i.ic_upload, (View.OnClickListener) gVar);
        List h2 = m116355h2();
        C30508c cVar = new C30508c();
        this.f95430w = cVar;
        cVar.mo70859k(this);
        this.f95430w.mo70860l(h2);
        this.f95429v.setLayoutManager(new LinearLayoutManager(this.f77883f));
        this.f95429v.setAdapter(this.f95430w);
        C40160f fVar = new C40160f(this, h2);
        this.f95432y = fVar;
        fVar.mo94122m();
        this.f95431x.mo87965p3(true);
    }

    /* renamed from: x */
    public void mo94117x(String str) {
        C32297d.m95154b(getActivity(), getString(C10328q.unsported_file_extension_error, str));
    }

    /* renamed from: y */
    public void mo94118y(int i) {
        this.f95430w.mo70858j(i);
    }

    /* renamed from: z0 */
    public void mo94119z0(int i) {
        C32297d.m95154b(getActivity(), getString(C10328q.max_attachment_count_limit_error, Integer.valueOf(i)));
    }
}
